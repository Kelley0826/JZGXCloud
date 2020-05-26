/**
 * 通过
 */
function myApprove(){
    var mode = idp.utils.getQuery('mode');

    switch(mode){
        case "fscwcs":{
            firstAuditPass();
            break;
        }
        case "fsywcs":{
            break;
        }
        case "fsjh":{
            auditPass();
            break;
        }
        case "fsfh":{
            rechecPass();
            break;
        }
    }
}

/**
 * 退回
 */
function myGoBack(){
    var mode = idp.utils.getQuery('mode');

    switch(mode){
        case "fscwcs":{
            backReason('CWCS');
            break;
        }
        case "fsywcs":{
            break;
        }
        case "fsjh":{
            backReason('JH');
            break;
        }
        case "fsfh":{
            backReason('FH');
            break;
        }
    }
}


/**
 * 撤回
 */
function cancelSubmit(){
    var mode = idp.utils.getQuery('mode');
    switch (mode) {
        case "fszd":{
            cancelSubmitOnZD();
            break;
        }
        case "fscwcs":{
            firstAuditCH();
            break;
        }
        case "fscs":{
            firstAuditCH();
            break;
        }
        default:
            break;
    }
}

// region 退回原因
/**
 * 退回原因 Sakura Sun (sunchao)
 * */
function backReason(model) {
    var dataId = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var formtype = idp.utils.getQuery('fdim');
    var billcode = idp.uiview.modelController.getMainRowObj().ROYWSQ_BH;
    var dwid = idp.uiview.modelController.getMainRowObj().ROYWSQ_DWID;
    var bizcategory = "FSROJK";
    var returnParam = {};
    returnParam["BILLID"] = dataId;
    returnParam["BIZCATEGORY"] = bizcategory;
    returnParam["FORMTYPE"] = formtype;
    returnParam["DJBH"] = billcode;
    returnParam["DWID"]=dwid;
    returnParam["OTHERINFO"]="";
    var procInfo = JSON.stringify(returnParam);
    openWDDBTHdilog = $.leeDialog.open({
        title: idp.lang.get("FSROFront0042"),  //"退回",
        name: 'ProcessScopeHelp',
        isHidden: false,
        showMax: true,
        width: 700,
        slide: false,
        height: 360,
        url: "/apps/fastdweb/views/runtime/page/card/cardpreview.html?modid=7a4eb649-86f3-7e65-a3ae-c2a32142cddc&styleid=e489aa01-be19-ee4d-cf0e-3dc5cf529870&j=true&procinfo=" + procInfo,
        onclose: function() {
            var param = {};
            param.BILLID = dataId;
            param.FORMTYPE = formtype;
            param.BIZCATEGORY = bizcategory;
            param.BILLCODE = billcode;
            debugger;
            var returnParam = openWDDBTHdilog.frame.returnParam;
            var operate = returnParam.operate;
            if (!operate) {
                operate = "cancel";
            }
            if (operate === "cancel") {
                return;
            }
            if (returnParam) {
                if (model == 'CWCS') {
                    firstAuditBack(returnParam);
                } else if (model == 'JH') {
                    auditBack(returnParam);
                } else if (model == 'FH') {
                    recheckBack(returnParam);
                }
            }
        },
    });
    debugger;
}
// endregion

// region 提交
/**
 * 提交前
 * @returns {never}
 */
function submitBefore() {
    var defer = $.Deferred();
    defer.resolve(true);
    var deleteflag = idp.uiview.modelController.getMainRowObj().ROYWSQ_DELFLAG;
    if(deleteflag == "1" || deleteflag == 1){
        idp.warn(idp.lang.get("FSROFront0022")); //("当前单据已经被删除");
        return false;
    }

    var dqhjbh = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    var djzt = idp.uiview.modelController.getMainRowObj().ROYWSQ_ZT;
    var mode = idp.utils.getQuery('mode');
    if(!(mode == "fszd" && dqhjbh == "ZD"  && djzt == "0")){
        idp.warn(idp.lang.get("FSROFront0021")); //('当前单据不允许提交');
        return false;
    }
    return defer.promise();
}

/**
 * 提交
 * @returns {never}
 */
function submit() {
    var defer = $.Deferred();
    submitBefore().then(function(result) {
        if (result) {
            submitDeal().then(function(result) {
                defer.resolve(result);
            });
        } else {
            defer.resolve(false);
        }
    });
    return defer.promise();
}

function submitDeal() {
    debugger;
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var param = {};
    param.BILLID = nm;
    param.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    param.FORMTYPE = idp.store.get('formtype');
    idp.loading(idp.lang.get("FSPubFront0012")); //('提交中');
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fssq/submit",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        idp.loaded();
        if (!data.result) {
            idp.error(data.message);
            defer.resolve(false);
        } else {
            controllButtonEnableBill("submit", "");
            idp.tips(idp.lang.get("FSPubFront0013")); //('提交成功');
            idp.uiview.loadData(idp.uiview.config.dataid);
            defer.resolve(true);
        }
    }).fail(function(data) {
        //失败回调方法
        idp.loaded();

    });
    return defer.promise();
}

// endregion

// region 撤回
/**
 * 撤回
 */
function cancelSubmitOnZD() {
    debugger;
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    if (!nm) {
        idp.utils.getQuery('nm');
    }
    if (!nm) {
        idp.warn(idp.lang.get("FSROFront0023"));  //('单据内码为空，撤回失败');
    }
    var param = {};
    param.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    param.BILLID = nm;
    param.DQHJBH = "STARTNODE";
    param.FORMTYPE = idp.store.get('formtype');
    param.APPROVEOPINION = "";//退回意见，传可为空
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fssq/retract",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        if (!data.result) {
            var msg = idp.lang.get("FSROFront0028");  //"不允许撤回";
            if(!!data.message){
                msg = data.message;
            }
            if(!!data.value && !!data.value.message){
                msg = data.value.message;
            }
            idp.error(msg);
            defer.resolve(false);
        } else {
            idp.tips(idp.lang.get("FSPubFront0014"));  //('撤回成功');
            controllButtonEnableBill('ch', '');
            idp.store.commit('operation', 'edit');
            idp.uiview.reloadData();
            defer.resolve(true);
        }
    }).fail(function(data) {
        defer.resolve(false);
    });
    return defer.promise();
}
// endregion

// region 初审
/**
 * 初审通过 Sakura Sun (sunchao)
 * */
function firstAuditPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    debugger;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";

    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fscs/firstauditpass",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0015"));  //("初审通过成功");
            controllButtonEnableBill('cstg', '');
            idp.uiview.reloadData();
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}

/**
 * 初审退回 Sakura Sun (sunchao)
 * */
function firstAuditBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";

    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fscs/firstauditback",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        debugger;
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0016")); //("初审退回成功");
            controllButtonEnableBill('csth', '');
            idp.uiview.reloadData();
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}

/**
 * 初审撤回 Sakura Sun (sunchao)
 * */
function firstAuditCH() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.lsTasksId = "";
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fscs/firstauditch",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0017"));  //("初审撤回成功");
            idp.uiview.reloadData();
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}

// endregion

// region 稽核
/**
 * 稽核通过 Sakura Sun (sunchao)
 * */
function auditPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjh/auditpass",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0018"));  //("稽核通过成功");
            controllButtonEnableBill('jhtg', '');
            idp.uiview.reloadData();
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法
    });
    return defer.promise();
}

/**
 * 稽核退回 Sakura Sun (sunchao)
 * */
function auditBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjh/auditback",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        debugger;
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0019"));  //("稽核退回成功");
            controllButtonEnableBill('jhth', '');
            idp.uiview.reloadData();
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}

/**
 * 取消稽核 Sakura Sun (sunchao) 废弃--没有取消稽核业务
 * */
// function cancleAudit() {
//     var defer = $.Deferred();
//     idp.uiview.getValue(); // 刷新模型
//     var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
//     var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
//     var params = {};
//     debugger;
//     params.BILLID = nm;
//     params.FORMTYPE = lxnm;
//     params.lsTasksId = "";
//     params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
//     // 初审退回前检查
//     idp.service.fetch(
//         "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjh/auditch",
//         params,
//         false
//     ).done(function(data) {
//         //成功回调方法
//         if (data.result) {
//             idp.tips("取消稽核成功");
//             idp.uiview.reloadData();
//             defer.resolve(true);
//         } else {
//             idp.error(data.message);
//             defer.resolve(false);
//         }
//     }).fail(function(data) {
//         //失败回调方法
//
//     });
//     return defer.promise();
// }
// endregion

// region 复核
/**
 * 复核通过
 * */
function rechecPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsfh/recheckpass",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0020")); //("复核通过成功");
            idp.uiview.reloadData();
            controllButtonEnableBill('fhtg', '');
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}

/**
 * 复核退回
 * */
function recheckBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var lxnm = idp.uiview.modelController.getMainRowObj().ROYWSQ_SQLX;
    var params = {};
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    // 稽核退回前检查
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsfh/recheckback",
        params,
        false
    ).done(function(data) {
        //成功回调方法
        if (data.result) {
            idp.tips(idp.lang.get("FSPubFront0021"));  //("复核退回成功");
            idp.uiview.reloadData();
            controllButtonEnableBill('fhth', '');
            defer.resolve(true);
        } else {
            idp.error(data.message);
            defer.resolve(false);
        }
    }).fail(function(data) {
        //失败回调方法

    });
    return defer.promise();
}
// endregion
