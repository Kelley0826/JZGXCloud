
//通过
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
            recheckPass();
            break;
        }
    }
}
/**
 * 初审通过
 */
function firstAuditPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    debugger;
    params.DWID = dwid;
    params.DJBH = djbh;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    params.APPROVEOPINION = "";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/firstauditpass",
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
 * 稽核通过
 */
function auditPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DWID = dwid;
    params.DJBH = djbh;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    params.APPROVEOPINION = "";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/auditpass",
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
 * 复核通过
 */
function recheckPass() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DWID = dwid;
    params.DJBH = djbh;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    params.APPROVEOPINION = "";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/recheckpass",
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


//退回
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
 * 退回原因
 */
function backReason(model) {
    var dataId = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var formtype = idp.utils.getQuery('fdim');
    var billcode = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var bizcategory = "JZDSJJ";
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
/**
 * 初审退回
 */
function firstAuditBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DJBH = djbh;
    params.DWID = dwid;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
//    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
//    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
//    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
//    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";

    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/firstauditback",
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
 * 稽核退回
 */
function auditBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DJBH = djbh;
    params.DWID = dwid;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
//    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
//    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
//    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
//    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/auditback",
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
 * 复核退回
 */
function recheckBack(returnParam) {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var backreason = returnParam.returnreason; // 退回原因
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DWID = dwid;
    params.DJBH = djbh;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.APPROVEOPINION = backreason;
    params.lsTasksId = "";
    params.APPROVEBACKTOHJBH= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOTASKTYPE= returnParam.returnto=="ZD"?"ZD":"";
    params.APPROVEBACKTOHJ=returnParam.approvebacktohj;
//    params.QXHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.QXHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJ;
//    params.QXTASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_QXHJBH;
//    params.DQHJBH =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
//    params.DQHJ=idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
//    params.TASKTYPE =idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;    // 稽核退回前检查
    params.TARGETPROCESSNODE = returnParam.returnto;
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    // 稽核退回前检查
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/recheckback",
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


//撤回
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
/**
 * 制单撤回
 */
function cancelSubmitOnZD() {
    debugger;
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
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
    param.DJBH = djbh;
    param.DWID = dwid;
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/retract",
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
/**
 * 初审撤回
 * */
function firstAuditCH() {
    var defer = $.Deferred();
    idp.uiview.getValue(); // 刷新模型
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var lxnm = idp.uiview.modelController.getMainRowObj().BZDLX;
    var djbh = idp.uiview.modelController.getMainRowObj().DSJJ_DJBH;
    var dwid = idp.uiview.modelController.getMainRowObj().DSJJ_DWID;
    var params = {};
    params.DJBH = djbh;
    params.DWID = dwid;
    params.BILLID = nm;
    params.FORMTYPE = lxnm;
    params.DQHJBH = "FSCS";
    params.lsTasksId = "";
    params.APPROVEOPINION = "";//退回意见，传可为空
    params.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fsproc/firstauditch",
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


//提交
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
/**
 * 提交前
 */
function submitBefore() {
    var defer = $.Deferred();
    defer.resolve(true);
    /*
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
    */
    return defer.promise();
}
/**
 * 提交处理
 */
function submitDeal() {
    debugger;
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    var param = {};
    param.BILLID = nm;
    param.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    param.FORMTYPE = idp.store.get('formtype');
    idp.loading(idp.lang.get("FSPubFront0012")); //('提交中');
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/submit",
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


//保存
function saveBefore() {
    debugger
    idp.uiview.getValue();

    //保存前校验
    if ($("#DSJJ_ZY").length>0) {
        var inputZY = idp.control.get("DSJJ_ZY").val();
        if (inputZY.length == 0) {
            idp.warn("摘要不能为空！");
            return false;
        }
    }

    return saveBill();
}
/**
 * 保存处理
 */
function saveBill() {
    debugger;
    var defer = $.Deferred();
//    var zt = idp.uiview.modelController.getMainRowObj().ROYWSQ_ZT;
//    idp.store.commit('historyzt', zt,false);//添加记录历史状态
    var param = {};
    idp.uiview.getValue();
    param.data = {};
    param.idpCardData = {};
    param.data.gnid = 'ZD';
    param.data.test1 = '2';
    param.idpCardData.data = idp.uiview.modelController.getSaveData();
    param.idpCardData.type = idp.store.get('operation') == 'add' ? '0' : '1';
    param.idpCardData.formType = '1';
    param.idpCardData.styleId = idp.uiview.config.styleid;
    param.PFTASKID = idp.utils.getQuery('pftaskid')?idp.utils.getQuery('pftaskid'):"";
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/savebill",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        idp.loaded();
        if (!data.result) {
            idp.error(data.message);
            defer.resolve(false);
        } else {
            controllButtonEnableBill('save', '');
            idp.tips(idp.lang.get("FSPubFront0010"));     //('保存成功');
            saveAfter();
            idp.uiview.loadData(idp.uiview.config.dataid);
            defer.resolve(true);
            saveBillAfter();
        }
    }).fail(function(data) {
        //失败回调方法
        idp.tips(idp.lang.get("FSPubFront0041"));     //('保存失败');
        idp.loaded();

    });
    return defer.promise();
}
/**
 * 保存后
 */
function saveAfter(){
    var operation = idp.store.get('operation');
    if(operation == 'add'){
        idp.store.commit('operation','none',false);
    }

}
/**
 * 保存后处理
 */
function saveBillAfter(){
    var defer = $.Deferred();
    var param = {};
    console.log(param);
    debugger;
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/savebillAfter",
        param,
        false
    ).done(function(data) {debugger
        //成功回调方法
        idp.uiview.reloadData();
        idp.loaded();
        if (!data.result) {
            idp.error(data.message);
            defer.resolve(false);
        } else {
            defer.resolve(true);
        }
    }).fail(function(data) {
        //失败回调方法
        idp.loaded();
    });
}


//编辑
function editBill() {
    debugger;
    var defer = $.Deferred();
    idp.uiview.reloadData();
    /*
    var deleteflag = idp.uiview.modelController.getMainRowObj().ROYWSQ_DELFLAG;
    if(deleteflag=='1'||deleteflag==1){
        idp.warn(idp.lang.get("FSROFront0014")); //('该单据已经删除，不可编辑');
        return false;
    }
    var zt = idp.uiview.modelController.getMainRowObj().ROYWSQ_ZT;
    var dqhjbh = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    idp.store.commit('historyzt', zt,false);//添加记录历史状态
    if(zt==-1){
        if(dqhjbh=="ZD"){
            idp.uiview.setCtrlValue("ROYWSQ_ZT", 0);
            idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '制单');
        }else{
            idp.uiview.setCtrlValue("ROYWSQ_ZT", 1);
            idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '处理中');
        }
    }
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    var dqhjbh = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    var mode = idp.utils.getQuery('mode');
    if (!nm) {
        idp.utils.getQuery('nm');
    }
    if (!nm) {
        idp.warn(idp.lang.get("FSROFront0015")); //('单据内码为空，编辑失败');
        return false;
    }
    // 仅 mode 与 当前环节 一致后才可以编辑，审批单据不处理
    if(!(mode == "fszd" && dqhjbh == "ZD" ||
        mode == "fscwcs" && dqhjbh == "FSCS" ||
        mode == "fsjh" && dqhjbh == "FSJH" ||
        mode == "fsfh" && dqhjbh == "FSFH")){
        idp.warn(idp.lang.get("FSROFront0016")); //('当前单据不允许编辑');
        return false;
    }
    idp.control.get("ROYWSQ_YGNM").setDisabled();
    if(mode == "fszd" && dqhjbh == "ZD"){
        idp.control.get("ROYWSQ_YGNM").setEnabled();
    }

     */
    var param = {};
    param.BILLID = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/checkedit",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        if (!data.result) {
            debugger;
            idp.error(data.message);
            defer.resolve(false);
        } else {
            idp.store.commit('operation', 'edit',false);
            debugger;
            controllButtonEnableBill("edit", "");
            defer.resolve(true);
        }
    }).fail(function(data) {
        debugger;
        //失败回调方法
        defer.resolve(false);
    });

    return defer.promise();
}


//取消
function cancelEvent() {
 /*
    var histotyzt = idp.store.get('historyzt');//历史状态
    if(histotyzt&&(histotyzt ==-1||histotyzt=="-1")){
        idp.uiview.setCtrlValue("ROYWSQ_ZT", -1);
        idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '审批退回');
    }
*/
    var operation = idp.store.get('operation');
    if (operation == 'add') {
        idp.uiview.close();
        return true;
    }
    idp.uiview.cancel();
    idp.store.commit('operation', 'none',false);
    controllButtonEnableBill("save", "");
    return true;
}


//删除
function deleteEvent() {
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().DSJJ_DJNM;
    if (!nm) {
        idp.utils.getQuery('nm');
    }
    if (!nm) {
        idp.warn(idp.lang.get("FSROFront0017"));  //('单据内码为空，删除失败');
    }
    var param = {};
    param.BILLID = nm;
    idp.service.fetch(
        "/api/runtime/fssp/jzgx/v1.0/dsjjbiz/fszd/deletebill",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        if (!data.result) {
            idp.error(data.message);
            defer.resolve(false);
        } else {
    //        return idp.uiview.deleteData();
            defer.resolve(true);
        }
    }).fail(function(data) {
        //失败回调方法
        defer.resolve(false);
    });
    idp.uiview.close();
    return defer.promise();
}


//查看影像
function viewImage() {

    debugger;
    var operation="edit";
    switch (modify) {
        case 0:
            operation="view";
            break;
        case 1:
            break;
        default:
            break;
    }
    /*
    var deleteflag = idp.uiview.modelController.getMainRowObj().ROYWSQ_DELFLAG;
    if(deleteflag=='1'||deleteflag==1){
        idp.warn(idp.lang.get("FSROFront0005"));    //('该单据已经删除，不可使用电子影像');
        return false;
    }
    var dqhjbh = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    var mode = idp.utils.getQuery('mode');
    // 仅 mode 与 当前环节 一致后才可以编辑，审批单据不处理
    if(!(mode == "fszd" && dqhjbh == "ZD" ||
        mode == "fscwcs" && dqhjbh == "FSCS" ||
        mode == "fsjh" && dqhjbh == "FSJH" ||
        mode == "fsfh" && dqhjbh == "FSFH")){
        operation="view";
    }

     */
    var args = {
        "SourceSys": "FSBZ",
        "BillNM": idp.uiview.modelController.getMainRowObj().DSJJ_DJNM,
        "BillCODE": idp.uiview.modelController.getMainRowObj().DSJJ_DJBH,
        "USERCODE": idp.context.get("UserCode"),
        "SHOWMES": "附件式影像",
        "BillCATEGORY": "JZDSJJ",
        "BillType": "DSJJ",
        "OPERATION": operation
    }
    idp.service.fetch("/api/runtime/fssp/jzgx/v1.0/jzgxint/imagemanager/getimageurl", args, false)
        .done(function(data) {
            //成功回调方法
            debugger;
            if (data.result == true) {
                if (data.value.data) {
                    idp.error(idp.lang.get("FSROFront0029"));   //('返回信息错误');
                    return false;
                } else {
                    var resultJson = JSON.parse(data.value);
                    if (!resultJson.result) {
                        idp.error(resultJson.message);
                        return false;
                    } else {
                        url = resultJson.value.data;
                        // idp.utils.openurl('DJ20190918', '单据影像信息', url);
                        idp.utils.openNativeUrl(idp.uiview.modelController.getMainRowObj().DSJJ_DJNM||'DJ20190918', '单据影像信息', url);
                        return true;
                    }
                }
            } else {
                idp.error(data.message);
                return false;
            }
        }).fail(function(data) {
        //失败回调方法
        debugger;
        idp.error(data.message);
        return false;
    });

}


//单据打印功能
function printBill(){
    var param={};
    param.Formywclasscode="JZDSJJ";//row.FSBZDJ_DJYWLX;业务类型
    param.First=idp.store.get("fdim");//row.FSBZDJ_DJLX;单据类型
    param.Second='fszd';
    idp.service.fetch(
        "/api/runtime/fssp/pubjz/v1.0/getbillbe/getbeidbybillclassandbillywclass",
        param,
        false)
        .done(function(data) {
            if (data.result) {
                var nowbeId=data.value.styleId;
                idp.print.startCloud(nowbeId,idp.uiview.config.dataid);//单据ID
            } else {
                idp.warn(data.message);
                return false;
            }
        })
        .fail(function(data) {
            idp.error(data.message);
            return false;
        })
}


//查看流程
function viewProcess() {
    idp.uiview.getValue();
    let LCSL = idp.uiview.modelController.getModel()[0].data[0].DSJJ_WFID;
    let BILLID = idp.uiview.modelController.getModel()[0].data[0].DSJJ_DJNM;
    let FORMTYPE = idp.uiview.modelController.getModel()[0].data[0].BZDLX;
    let DJBH = idp.uiview.modelController.getModel()[0].data[0].DSJJ_DJBH;
    let url = '/apps/fastdweb/views/runtime/page/card/cardpreview.html?modid=613ba315-6a01-3b4d-c504-d900fb727e12&styleid=613ba315-6a01-3b4d-c504-d900fb727e12&dataid=&insid=';
    if (!LCSL) {
        idp.warn(idp.lang.get("FSROFront0019"));   //("当前单据不存在流程实例，无法查看");
        return false;
    }
    if(!BILLID){
        idp.warn(idp.lang.get("FSROFront0020"));   //("当前单据不存在，无法查看");
        return false;
    }
    url += LCSL + '&billid=' + BILLID + '&formtype=' + FORMTYPE + '&billcode=' + DJBH;
    idp.utils.openurl('viewprocess', idp.lang.get("FSROFront0043"), url); //('viewprocess', '查看流程', url);
}












