// 退回原因弹出窗体
var backReasonDialog = null;
//借款关联申请增加
var openBXGLSQdilog = null;

//编辑按键是否可用：1可用；0不可用
var modify=1;

//1 表单加载后
idp.event.bind("domReady", function(e) {
    console.log("load");
    var operation = idp.utils.getQuery('operation');
    var mode = idp.utils.getQuery('mode');
    var gnid = idp.utils.getQuery('gnid');
    var formtype=idp.utils.getQuery('fdim');
    var fdim = idp.utils.getQuery('fdim');//单据类型内码
    if (!operation) {
        operation = idp.utils.getQuery('status')
    }
    if(!mode){
        mode = "fszd";
    }

    var params = {};
    idp.store.commit('formtype', formtype,false);
    idp.store.commit('gnid', gnid,false);
    idp.store.commit('mode', mode,false);
    idp.store.commit('operation', operation,false);
    idp.store.commit('jkglsqdata','',false);
    idp.store.commit('fdim', fdim,false);//单据类型内码
    var params = {};
    params.FORMTYPE = idp.store.get('formtype');
    // 获取新增单据信息
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getbillinfoonadd",
        params,
        false
    ).done(function(data){
        //成功回调方法
        if(data == null || !data.result){
            idp.error(data.message);
            return false;
        }
        idp.store.commit('billInfo', data.value,false);
        idp.store.commit('currencyId', data.value.bfcurrency_id,false);
        idp.store.commit('currencyCode', data.value.bfcurrency_code,false);
        idp.store.commit('currencyName', data.value.bfcurrency_name,false);
    }).fail(function(data){
        // 失败回调方法
        idp.error(idp.lang.get("FSROFront0030"));  //("加载单据相关信息异常");
        return false;
    });
    registerHelpEvents(); // 注册帮助事件
    focusSwitchingEvents(); // 注册失去焦点事件
    BxrDicEntryPicking(); // 报账人过滤条件
    childGridInitEvents(); // 子表初始化事件
    childGridAddBefore();
});

//2 新增后事件
idp.event.bind("afterAddData",function(e,data){
    var billInfo = idp.store.get('billInfo');
    if (billInfo) {
        controlInitiation(billInfo, 'start');
    }
    idp.store.commit('operation', 'add',false);
    // 自动新增
    controlAutoAdd();
});
//3 控件加载后
idp.event.bind("viewReady", function(e) {
    var operation = idp.store.get('operation');
    var mode = idp.store.get('mode');
    var billInfo = idp.store.get('billInfo');
    controllButtonDisplayBill(operation, mode);
    controllButtonEnableBill(operation, mode);
    var djzt = idp.utils.getQuery("djzt");
    if (mode == "fszd" && (djzt == "0" || djzt == "-1")) {
        idp.control.get("ROYWSQ_YGNM").setEnabled();
    }
    idp.control.get("toolbar1").toggleBtns(["baritem_stateLog"], false);
    //隐藏预算信息、明细2、3、4、
    // idp.control.get("layout_detail").hideTabItem("tabitem1");
    // idp.control.get("layout_detail").hideTabItem("tabitem2");
    // idp.control.get("layout_detail").hideTabItem("tabitem3");
    // idp.control.get("layout_detail").hideTabItem("tabitem4");
    // idp.control.get("layout_detail").hideTabItem("tabitem5");
    //借款明细隐藏按钮（第一个属性是表的id，第二个是按钮id）
    idp.control.get("layout_217791_toolbar_0").toggleBtns(["baritem_copyMx1", "baritem_importMx1"], false);
    //借款分摊
    idp.control.get("layout_708779_toolbar_0").toggleBtns(["baritem_copyJkft", "baritem_importJkft", "baritem_exportJkft"], false);
    //隐藏按钮
    idp.control.toolbar.toggleBtns("toolbar1", ["baritem_fj", "baritem_YX", "baritem_temp", "baritem_viewProcess", "baritem_lc", "baritem_copy"], false);
    var ifOnlyOneFYXM = idp.store.get("ifOnlyOneFYXM");
    if (ifOnlyOneFYXM) {
        if ($("#ROYWSQ_FYXMMC").length>0) {
            idp.control.get('ROYWSQ_FYXMMC').setDisabled()
        }
    }
});
/**
 *  控件初始赋值
 * */
function controlInitiation(dataInfo, flag) {
    debugger
    if(!dataInfo){
        return;
    }
    for (var key in dataInfo) {
        if(dataInfo[key]=='null'){
            dataInfo[key] = '';
        }
    }
    idp.uiview.setCtrlValue("ROYWSQ_YGNM", dataInfo.bfemployee_id);
    idp.uiview.setCtrlValue("ROYWSQ_YGXM", dataInfo.bfemployee_name);
    idp.uiview.setCtrlValue("ROYWSQ_YGNM_NAME_CHS", dataInfo.bfemployee_name);
    idp.uiview.setCtrlValue("ROYWSQ_DWID", dataInfo.organization_id);
    idp.uiview.setCtrlValue("ROYWSQ_DWBH", dataInfo.organization_code);
    idp.uiview.setCtrlValue("ROYWSQ_DWMC", dataInfo.organization_name);
    idp.uiview.setCtrlValue("ROYWSQ_BMID", dataInfo.organization_DepartmentID);
    idp.uiview.setCtrlValue("ROYWSQ_BMBH", dataInfo.organization_DepartmentCode);
    idp.uiview.setCtrlValue("ROYWSQ_BMMC", dataInfo.organization_DepartmentName);
    //货币
    idp.uiview.setCtrlValue("ROYWSQ_JKHBID", dataInfo.bfcurrency_id);
    idp.uiview.setCtrlValue("ROYWSQ_JKHB", dataInfo.bfcurrency_code);
    idp.uiview.setCtrlValue("ROYWSQ_JKHBMC", dataInfo.bfcurrency_name);
    idp.uiview.setCtrlValue("ROYWSQ_HL", dataInfo.rate);
    idp.store.commit("bzmc",dataInfo.bfcurrency_name,false);
    idp.store.commit("bzbh",dataInfo.bfcurrency_code,false);
    idp.store.commit("bzid",dataInfo.bfcurrency_id,false);
    idp.store.commit("bzhl",dataInfo.rate,false);
    //单据类型内码和名称
    idp.uiview.setCtrlValue("ROYWSQ_DQHJBH", "ZD");//当前环节编号
    idp.uiview.setCtrlValue("ROYWSQ_DQHJ", "制单");//当前环节名称
    //*******************************限制费用项目**************************************/
    //1、固定费用项目
    if (dataInfo.ifOnlyOneFYXM) {
        idp.store.commit("ifOnlyOneFYXM", dataInfo.ifOnlyOneFYXM,false);//是否为固定费用项目
        idp.uiview.setCtrlValue("ROYWSQ_FYXM", dataInfo.ifOnlyOneFYXMID);
        idp.uiview.setCtrlValue("ROYWSQ_FYXMBH", dataInfo.ifOnlyOneFYXMBH);
        idp.uiview.setCtrlValue("ROYWSQ_FYXMMC", dataInfo.ifOnlyOneFYXMMC);
        idp.store.commit("ifOnlyOneFYXMID", dataInfo.ifOnlyOneFYXMID,false);
        idp.store.commit("ifOnlyOneFYXMBH", dataInfo.ifOnlyOneFYXMBH,false);
        idp.store.commit("ifOnlyOneFYXMMC", dataInfo.ifOnlyOneFYXMMC,false);

    }else{
        idp.store.commit("ifOnlyOneFYXM", false,false);//是否为固定费用项目
        //2、限制费用项目
        if(dataInfo.ifLimitFYXM){
            idp.store.commit("ifLimitFYXM", dataInfo.ifLimitFYXM,false);//是否为限制费用项目
            idp.store.commit("expenseNMList", dataInfo.expenseNMList,false);//费用项目内码数组
        }
    }
    if (flag == 'start') {
        idp.uiview.setCtrlValue("ROYWSQ_USERID", dataInfo.bfemployee_id);
        idp.uiview.setCtrlValue("ROYWSQ_USER", dataInfo.bfemployee_name);

        //借款单位（报账组织单位）
        idp.uiview.setCtrlValue("ROYWSQ_JKDWID", dataInfo.bzzz_dwnm);
        idp.uiview.setCtrlValue("ROYWSQ_JKDWBH", dataInfo.bzzz_dwcode);
        idp.uiview.setCtrlValue("ROYWSQ_JKDWMC", dataInfo.bzzz_dwname);
        idp.uiview.setCtrlValue("ROYWSQ_JKDWID_NAME_CHS", dataInfo.bzzz_dwname);
        //借款部门（报账组织部门）
        idp.uiview.setCtrlValue("ROYWSQ_JKBMID", dataInfo.bzzz_bmnm);
        idp.uiview.setCtrlValue("ROYWSQ_JKBMBH", dataInfo.bzzz_bmcode);
        idp.uiview.setCtrlValue("ROYWSQ_JKBMMC", dataInfo.bzzz_bmname);
        idp.uiview.setCtrlValue("ROYWSQ_JKBMID_NAME_CHS", dataInfo.bzzz_bmname);


        idp.uiview.setCtrlValue("ROYWSQ_SQLX", idp.store.get('fdim'));
        idp.uiview.setCtrlValue("ROYWSQ_SQLXMC", dataInfo.rojklx_mc);
    }
}
/**
 * 注册帮助事件
 * */
function registerHelpEvents(){
    /*借款单主表*/
    // 借款人
    idp.event.register("ROYWSQ_YGNM","selected",function(e,value,name,obj){
        debugger;
        let params = {};
        params.FORMTYPE = idp.store.get('fdim');  // 通用报销单类型内码
        params.billYGNM = obj[0].ID;
        // 获取新增单据信息
        idp.service.fetch(
            "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getuserinfonadd",
            params,
            false
        ).done(function(data) {
            // 成功回调方法
            if (data == null || !data.result) {
                idp.error(data.message);
                return false;
            }
            controlInitiation(data.value, 'switch');
        }).fail(function(data) {
            // 失败回调方法
            idp.error(idp.lang.get("FSROFront0031"));  //("切换报账人数据异常");
            return false;
        });
    });
    /*借款明细1*/
    idp.event.register("grid_ROJKMX1","beforeOpen",function(e, ctrl, col, row){
        //idp.alert("借款明细1帮助前");
    });
    /*借款明细1*/
    idp.event.register("grid_ROJKMX1","afterGridHelpSelected",function(e, helpeditor, helpparam, data){
        debugger;
        let columnName = helpparam.host_grid_column.columnname;
        //借款明细1借款货币帮助后
        if (columnName == "ROJKMX1_JKHBMC") {
            var params = {};
            params.oriid = data[0].ID;
            params.oribh = data[0].CODE;
            params.orimc = data[0].NAME$LANGUAGE$;
            params.conid = idp.store.get("currencyId");
            params.conbh = idp.store.get("currencyCode");
            params.conmc = idp.store.get("currencyName");
            idp.service.fetch(
                "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getbfexchangeRateValue",
                params,
                false
            ).done(function(resultData){
                if(resultData == null || !resultData.result){
                    idp.error(resultData.message);
                    return false;
                }else{
                    var hl = resultData.value.exchangertevalue;
                    idp.control.get("grid_ROJKMX1").updateCell('ROJKMX1_HL',hl,helpparam.host_grid_row.__index);
                }
            }).fail(function(resultData){
                // 失败回调方法
                idp.error(idp.lang.get("FSROFront0033"));  //("汇率获取异常");
                return false;
            });
        }
    });

    //主表借款货币帮助后
    idp.event.register("ROYWSQ_JKHBMC", "selected",function(e,value,name,obj){
        debugger;
        var params = {};
        params.oriid = obj[0].ID;
        params.oribh = obj[0].CODE;
        params.orimc = obj[0].NAME$LANGUAGE$;
        params.conid = idp.store.get("currencyId");
        params.conbh = idp.store.get("currencyCode");
        params.conmc = idp.store.get("currencyName");
        idp.service.fetch(
            "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getbfexchangeRateValue",
            params,
            false
        ).done(function(resultData){
            if(resultData == null || !resultData.result){
                idp.error(resultData.message);
                return false;
            }else{
                idp.uiview.setCtrlValue("ROYWSQ_HL", resultData.value.exchangertevalue);//汇率
                idp.store.commit("bzmc",obj[0].NAME$LANGUAGE$,false);
                idp.store.commit("bzbh",obj[0].CODE,false);
                idp.store.commit("bzid",obj[0].ID,false);
                idp.store.commit("bzhl",resultData.value.exchangertevalue,false);
            }
        }).fail(function(resultData){
            // 失败回调方法
            idp.error(idp.lang.get("FSROFront0033"));  //("汇率获取异常");
            return false;
        });
    });

    //主表费用项目帮助前
    idp.event.register("ROYWSQ_FYXMMC", "beforeOpen", function() {
        debugger;
        let ifLimitFYXM = idp.store.get("ifLimitFYXM");
        if(!ifLimitFYXM){
            return true;
        }
        idp.event.register("ROYWSQ_FYXMMC", "beforeHelpFilter", function(e, value, name, obj) {
            var arr = [];
            let expenseNMList = idp.store.get("expenseNMList");
            if (!expenseNMList) {
                expenseNMList = "''";
            }
            arr.push({
                "Left": "",
                "Field": "ID",
                "Operate": "in",
                "IsExpress": false,
                "Value": idp.utils.jse(expenseNMList),
                "Right": "",
                "Logic": "and"
            });
            return arr;
        });

    });

    //子表费用项目帮助前事件
    idp.event.register("grid_ROJKMX1", "beforeOpen", function (e, info) {
        debugger;
        let columnName = info.options.host_grid_column.columnname;//获取点击了那个字段
        if (columnName == "ROJKMX1_FYXMMC") {
            let ifLimitFYXM = idp.store.get("ifLimitFYXM");
            if (!ifLimitFYXM) {
                return true;
            }
            idp.event.register("grid_ROJKMX1", "beforeHelpFilter", function (e, value, name, obj) {
                let columnName = value.options.host_grid_column.columnname;//获取点击了那个字段
                if (columnName == "ROJKMX1_FYXMMC") {
                    var arr = [];
                    let expenseNMList = idp.store.get("expenseNMList");
                    if (!expenseNMList) {
                        expenseNMList = "''";
                    }
                    arr.push({
                        "Left": "",
                        "Field": "ID",
                        "Operate": "in",
                        "IsExpress": false,
                        "Value": idp.utils.jse(expenseNMList),
                        "Right": "",
                        "Logic": "and"
                    });
                    return arr;
                }

            });
        }
        return true;
    });
    // 费用分摊字表帮助前事件
    idp.event.register("grid_ROJKFT", "beforeOpen", function (e, info, name, griddata) {
        debugger;
        let columnName = info.options.host_grid_column.columnname;//获取点击了那个字段
        if (columnName == "ROJKFT_FYXMMC") {

            let params = {};
            params.billType = idp.store.get('fdim');
            params.organizationId = griddata.ROJKFT_DWID;
            params.departmentID = griddata.ROJKFT_BMID;
            // 获取分摊费用项目
            idp.service.fetch(
                "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getexpenseitems",
                params,
                false
            ).done(function(data) {
                // 成功回调方法
                if (data == null || !data.result) {
                    idp.error(data.message);
                    return false;
                }
                var ifOnlyOneFYXM = data.value.ifOnlyOneFYXM;
                if(ifOnlyOneFYXM){
                    idp.event.register("grid_ROJKFT", "beforeHelpFilter", function (e, value, name, obj) {
                        let columnName = value.options.host_grid_column.columnname;//获取点击了那个字段
                        if (columnName == "ROJKFT_FYXMMC") {
                            var arr = [];
                            arr.push({
                                "Left": "",
                                "Field": "ID",
                                "Operate": "in",
                                "IsExpress": false,
                                "Value": idp.utils.jse("'" + data.value.ifOnlyOneFYXMID + "'"),
                                "Right": "",
                                "Logic": "and"
                            });
                        }
                        return arr;
                    });
                    return true;
                }
                let ifLimitFYXM = data.value.ifLimitFYXM;
                if (!ifLimitFYXM) {
                    return true;
                }
                idp.event.register("grid_ROJKFT", "beforeHelpFilter", function (e, value, name, obj) {
                    let columnName = value.options.host_grid_column.columnname;//获取点击了那个字段
                    if (columnName == "ROJKFT_FYXMMC") {
                        var arr = [];
                        let expenseNMList = data.value.expenseNMList;
                        if (!expenseNMList) {
                            expenseNMList = "''";
                        }
                        arr.push({
                            "Left": "",
                            "Field": "ID",
                            "Operate": "in",
                            "IsExpress": false,
                            "Value": idp.utils.jse(expenseNMList),
                            "Right": "",
                            "Logic": "and"
                        });
                    }
                    return arr;
                });
            }).fail(function(data) {
                // 失败回调方法
                idp.error(idp.lang.get("FSROFront0032"));   //("获取分摊费用项目异常");
                return false;
            });
        }
        if (columnName == "ROJKFT_DWMC"){
            idp.store.commit("FTDWID", griddata.ROJKFT_DWID,false);
        }
        if (columnName == "ROJKFT_BMMC"){
            idp.store.commit("FTBMID", griddata.ROJKFT_BMID,false);
        }
        if (columnName == "ROJKFT_YWSXMC"){
            idp.store.commit("FTYWSX", griddata.ROJKFT_YWSX,false);
        }
    });

    // 费用分摊子表帮助后
    idp.event.register("grid_ROJKFT","afterGridHelpSelected",function(e, helpeditor, helpparam, data){
        debugger;
        let colid = helpparam.host_grid_column.columnname;
        if(colid == "ROJKFT_DWMC"){
            let ftdw = idp.store.get("FTDWID");
            if(ftdw != data[0].ID){
                helpparam.host_grid_row.ROJKFT_BMMC = '';
                helpparam.host_grid_row.ROJKFT_FTWD01 = '';
                helpparam.host_grid_row.ROJKFT_BMID = '';

                helpparam.host_grid_row.ROJKFT_YGNM = '';
                helpparam.host_grid_row.ROJKFT_YGMC = '';
            }
        }
        if(colid == "ROJKFT_BMMC"){
            let ftbm = idp.store.get("FTBMID");
            if(ftbm != data[0].ID){
                helpparam.host_grid_row.ROJKFT_YGNM = '';
                helpparam.host_grid_row.ROJKFT_YGMC = '';
            }
        }
        if(colid == "ROJKFT_YWSXMC"){
            let ftywsx = idp.store.get("FTYWSX");
            if(ftywsx != data[0].ID){
                helpparam.host_grid_row.ROJKFT_FYXM = '';
                helpparam.host_grid_row.ROJKFT_FYXMID = '';
                helpparam.host_grid_row.ROJKFT_FYXMMC = '';
            }
        }
        if(colid == "ROJKFT_WBMC"){   // 付款货币
            debugger;
            var params = {};
            params.oriid = data[0].ID;
            params.oribh = data[0].CODE;
            params.orimc = data[0].NAME$LANGUAGE$;
            params.conid = idp.store.get("currencyId");
            params.conbh = idp.store.get("currencyCode");
            params.conmc = idp.store.get("currencyName");
            idp.service.fetch(
                "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/getbfexchangeRateValue",
                params,
                false
            ).done(function(resultData){
                if(resultData == null || !resultData.result){
                    idp.error(resultData.message);
                    return false;
                }else{
                    var hl = resultData.value.exchangertevalue;
                    idp.control.get("grid_ROJKFT").updateCell('ROJKFT_HL',hl,helpparam.host_grid_row.__index);
                }
            }).fail(function(resultData){
                // 失败回调方法
                idp.error(idp.lang.get("FSROFront0033"));  //("汇率获取异常");
                return false;
            });
        }
    });
    idp.event.register("grid_ROBXFK","afterGridHelpSelected",function(e, helpeditor, helpparam, data){
        let colid = helpparam.host_grid_column.colid;
        if(colid =="ROBXFK_DFGJ")
        {
            idp.store.commit("GJFID", data[0].ID,false);
            return true;
        }
        if(colid == "ROBXFK_DFS"){
            idp.store.commit("SFID", data[0].ID,false);
            return true;
        }
        if(colid == "ROBXFK_FKHBMC"){   // 付款货币
            var params = {};
            params.oriid = data[0].ID;
            params.oribh = data[0].CODE;
            params.orimc = data[0].NAME$LANGUAGE$;
            params.conid = idp.store.get("currencyId");
            params.conbh = idp.store.get("currencyCode");
            params.conmc = idp.store.get("currencyName");
            idp.service.fetch(
                "/api/runtime/fssp/ro/v1.0/bxbiz/fszd/getbfexchangeRateValue",
                params,
                false
            ).done(function(resultData){
                if(resultData == null || !resultData.result){
                    idp.error(resultData.message);
                    return false;
                }else{
                    var hl = resultData.value.exchangertevalue;
                    idp.control.get("grid_ROBXFK").updateCell('ROBXFK_HL',hl,helpparam.host_grid_row.__index);
                    let fkje = helpparam.host_grid_row.ROBXFK_FKJE;
                    let fkbbje = fkje * hl;
                    helpparam.host_grid_row.ROBXFK_FKBBJE = toFloat(fkbbje);
                    idp.control.get("grid_ROBXFK").updateCell('ROBXFK_FKBBJE', toFloat(fkbbje), helpparam.host_grid_row.__index);
                }
            }).fail(function(resultData){
                // 失败回调方法
                idp.error(idp.lang.get("FSROFront0033"));  //("汇率获取异常");
                return false;
            });
        }
    });

}
/**
 * 注册失去焦点事件
 * */
function focusSwitchingEvents() {
    idp.event.register("grid_ROBXFK", "afterEndEdit", function(e, info) {
        let columnName = info.column.columnname;
        //付款金额
        // if (columnName == "ROBXFK_FKJE") {
        //     let fkje = info.value;
        //     let fkhl = info.record.ROBXFK_HL;
        //     let fkbbje = fkje * fkhl;
        //     info.record.ROBXFK_FKBBJE = fkbbje.toFixed(2);
        //     idp.control.get("grid_ROBXFK").updateCell('ROBXFK_FKBBJE', fkbbje.toFixed(2), info.rowindex);
        // }
        // 切换对方性质，清空相关字段
        if (columnName == "ROBXFK_DFXZ") {
            var dfxz = idp.store.get("dfxz");
            if (info.record.ROBXFK_DFXZ != dfxz) {
                let row = {
                    ROBXFK_DFZH: "",
                    ROBXFK_YHMC: "",
                    ROBXFK_DFS: "",
                    ROBXFK_DFCS: "",
                    ROBXFK_DFMC: "",
                    ROBXFK_DFZHM: "",
                    ROBXFK_XSZH: "",
                    ROBXFK_DFBH: "",
                    ROBXFK_BANKTYPE: "",
                    ROBXFK_BANKTYPENAME: "",
                    ROBXFK_DFGJ: ""
                };
                if (info.record.ROBXFK_DFXZ == "1") {
                    row = {
                        ROBXFK_DFZH: "",
                        ROBXFK_YHMC: "",
                        ROBXFK_DFS: "",
                        ROBXFK_DFCS: "",
                        ROBXFK_DFMC: "",
                        ROBXFK_DFZHM: "",
                        ROBXFK_XSZH: "",
                        ROBXFK_DFBH: "",
                        ROBXFK_BANKTYPE: "",
                        ROBXFK_BANKTYPENAME: "",
                        ROBXFK_DFGJ: "",
                        ROBXFK_DGDS: "2"
                    };
                }
                if (info.record.ROBXFK_DFXZ == "2") {
                    row = {
                        ROBXFK_DFZH: "",
                        ROBXFK_YHMC: "",
                        ROBXFK_DFS: "",
                        ROBXFK_DFCS: "",
                        ROBXFK_DFMC: "",
                        ROBXFK_DFZHM: "",
                        ROBXFK_XSZH: "",
                        ROBXFK_DFBH: "",
                        ROBXFK_BANKTYPE: "",
                        ROBXFK_BANKTYPENAME: "",
                        ROBXFK_DFGJ: "",
                        ROBXFK_DGDS: "1"
                    };
                }
                info.record = $.extend(info.record, row);
                idp.control.get("grid_ROBXFK").updateRow(info.rowindex, row);
            }
            //idp.store.commit("dfxz", info.record.ROBXFK_DFXZ);
        }
        // 切换业务性质
        if (columnName == "ROBXFK_YWXZ") {
            var ywxz = idp.store.get("ywxz");
            if (info.record.ROBXFK_YWXZ != ywxz) {
                let row = {
                    ROBXFK_DFZH: "",
                    ROBXFK_YHMC: "",
                    ROBXFK_DFS: "",
                    ROBXFK_DFCS: "",
                    ROBXFK_DFMC: "",
                    ROBXFK_DFZHM: "",
                    ROBXFK_XSZH: "",
                    ROBXFK_DFBH: "",
                    ROBXFK_BANKTYPE: "",
                    ROBXFK_BANKTYPENAME: "",
                    ROBXFK_DFGJ: ""
                };
                if (info.record.ROBXFK_YWXZ == "2") {
                    row = {
                        ROBXFK_DFXZ: "1",
                        ROBXFK_DFZH: "",
                        ROBXFK_YHMC: "",
                        ROBXFK_DFS: "",
                        ROBXFK_DFCS: "",
                        ROBXFK_DFMC: "",
                        ROBXFK_DFZHM: "",
                        ROBXFK_XSZH: "",
                        ROBXFK_DFBH: "",
                        ROBXFK_BANKTYPE: "",
                        ROBXFK_BANKTYPENAME: "",
                        ROBXFK_DFGJ: "",
                        ROBXFK_DGDS: "2"
                    };
                }
                info.record = $.extend(info.record, row);
                idp.control.get("grid_ROBXFK").updateRow(info.rowindex, row);
            }
            idp.store.commit("ywxz", info.record.ROBXFK_YWXZ,false);
        }
    });
}
/**
 * 报销人帮助前过滤
 * */
function BxrDicEntryPicking() {
    idp.event.register("ROYWSQ_YGNM", "beforeHelpFilter", function(e, value, name, obj) {
        debugger;
        var arr = [];
        let dataInfo = idp.store.get("billInfo");
        if(dataInfo){
            arr.push({
                "Left": "",
                "Field": "id",
                "Operate": "in",
                "IsExpress": false,
                "Value": idp.utils.jse(dataInfo.bzrFilter),
                "Right": "",
                "Logic":"or"
            }, {
                "Left": "",
                "Field": "ORGANIZATION",
                "Operate": "in",
                "IsExpress": false,
                "Value": idp.utils.jse(dataInfo.bzbmFilter),
                "Right": "",
                "Logic":""
            });
        }

        return arr;
    });
}
/**
 * 子表新增前
 */
function childGridAddBefore(){
    idp.event.register("grid_ROBXFK", "beforeAddGridRow", function(e, table, row, id) {
        var billInfo = idp.store.get('billInfo');
        row.ROBXFK_DJLXNM = idp.uiview.modelController.getModel()[0].data[0].ROBXDJ_BXLX;
        row.ROBXFK_YWLY = 0;

        if(billInfo&&billInfo.mrzh != undefined){
            row.ROBXFK_DFZH = billInfo.mrzh.robxzh_yhzh;
            row.ROBXFK_YHMC = billInfo.mrzh.robxzh_khh;
            row.ROBXFK_DFS = billInfo.mrzh.robxzh_sssf;
            row.ROBXFK_DFCS = billInfo.mrzh.robxzh_sscs;
            row.ROBXFK_DFMC = billInfo.mrzh.robxzh_zhmc;
            row.ROBXFK_DFZHM = billInfo.mrzh.robxzh_zhmc;
            row.ROBXFK_XSZH = billInfo.mrzh.robxzh_xszh;
            row.ROBXFK_DFBH = billInfo.mrzh.robxzh_userid;
            row.ROBXFK_BANKTYPE = '';
            row.ROBXFK_BANKTYPENAME = billInfo.mrzh.robxzh_banktype;
            row.ROBXFK_DFGJ = billInfo.mrzh.robxzh_ssgj;
        }

    });
    // 费用分摊
    idp.event.register("grid_ROJKFT", "beforeAddGridRow", function(e, table, row, id) {
        var billInfo = idp.store.get('billInfo');
        if(billInfo){
            row.ROJKFT_DWID = billInfo.organization_id;
            row.ROJKFT_DWBH = billInfo.organization_code;
            row.ROJKFT_DWMC = billInfo.organization_name;
            row.ROJKFT_BMID = billInfo.organization_DepartmentID;
            row.ROJKFT_FTWD01 = billInfo.organization_DepartmentCode;
            row.ROJKFT_BMMC = billInfo.organization_DepartmentName;
            row.ROJKFT_JE = toFloat(idp.uiview.modelController.getModel()[0].data[0].ROBXDJ_SFJE);
        }
    });
}
/**
 * 子表事件
 * */
function childGridInitEvents(){
    idp.event.register("grid_ROBXFK", "beforeGridInit", function(e, p) {
        idp.store.commit("dfxz", "1",false);
        idp.store.commit("ywxz", "1",false);
        p.onBeforeApplyEditor = setEditor; //动态绑定grid编辑器
    });

    idp.event.register("grid_ROJKMX1", "beforeGridInit", function(e, p) {
        debugger;
        p.onBeforeApplyEditor = setEditorMX1; //动态绑定grid编辑器
    });
    // //费用分摊子表
    // idp.event.register("grid_ROJKFT", "beforeGridInit", function(e, p) {
    //     p.onBeforeApplyEditor = setEditorFYFT; //动态绑定grid编辑器
    // });

}
/**
 * 设置报销明细1表格的编辑器（yuxingyue）
 */
function setEditorMX1(rowindex, rowdata, column) {
    debugger;
    var ifOnlyOneFYXM = idp.store.get("ifOnlyOneFYXM");
    if(ifOnlyOneFYXM && column.columnname == "ROJKMX1_FYXMMC"){
        column.readonly = true;
    }
}

//费用分摊表
function setEditorFYFT(rowindex, rowdata, column) {
    var ifOnlyOneFYXM = idp.store.get("ifOnlyOneFYXM");
    if(ifOnlyOneFYXM && column.columnname == "ROJKFT_FYXMMC"){
        column.readonly = true;
    }
}
/**
 * 设置grid编辑器
 * */
function setEditor(rowindex, rowdata, column) {
    column.readonly = false;
    if(rowdata.ROBXFK_FKZT != 0 && rowdata.ROBXFK_FKZT != 2){
        column.readonly = true;
    }
    if (rowdata.ROBXFK_YWXZ == "2" && column.columnname == "ROBXFK_DFXZ") {
        column.readonly = true;
    }
    if (rowdata.ROBXFK_DFXZ == "1" && (column.columnname == "ROBXFK_DGDS" || column.columnname == "ROBXFK_DWLB")) {
        column.readonly = true;
    }
    if (column.columnname == "ROBXFK_YHMC" || column.columnname == "ROBXFK_DFZHM" ||
        column.columnname == "ROBXFK_BANKTYPENAME" || column.columnname == "ROBXFK_FKZT") {
        column.readonly = true;
    }
    idp.store.commit("dfxz", rowdata.ROBXFK_DFXZ,false);
    // 内部员工
    if (rowdata.ROBXFK_DFXZ == "1") {
        let editor = idp.control.grid.getEditor("lookup", {
            helpID: "b36c6bc5-d1c6-a762-d1ed-ed6a33a8cf5e",
            title: idp.lang.get("FSROFront0050"),  //"行政人员账户帮助",
            codeField: "ROBXZH_ZHMC",
            idField: "ROBXZH_ZHMC",
            returncols: "ROBXZH_YHZH;ROBXZH_KHH;ROBXZH_SSSF;ROBXZH_SSCS;ROBXZH_ZHMC;ROBXZH_ZHMC;ROBXZH_XSZH;ROBXZH_USERID;ROBXZH_BANKTYPE;BFBANKTYPENAME;ROBXZH_SSGJ", //多个用;分隔
            setcols: "ROBXFK_DFZH;ROBXFK_YHMC;ROBXFK_DFS;ROBXFK_DFCS;ROBXFK_DFMC;ROBXFK_DFZHM;ROBXFK_XSZH;ROBXFK_DFBH;ROBXFK_BANKTYPE;ROBXFK_BANKTYPENAME;ROBXFK_DFGJ",
            getFilter:function(){
                var arr = [];
                arr.push({
                    "Left": "",
                    "Field": "robxzh_userid",
                    "Operate": "in",
                    "IsExpress": false,
                    "Value": idp.utils.jse("\'"+idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_YGNM+"\'"),
                    "Right": "",
                    "Logic": "or"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_gk",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": 1,
                    "Right": "",
                    "Logic": "and"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_zt",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": 1,
                    "Right": "",
                    "Logic": "and"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_dwid",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_DWID,
                    "Right": "",
                    "Logic": "and"
                });
                return arr;
            }
        }); //动态绑定一个 帮助
        editor.textmode=true;
        let editorAccount = idp.control.grid.getEditor("lookup", {
            helpID: "b36c6bc5-d1c6-a762-d1ed-ed6a33a8cf5e",
            title: idp.lang.get("FSROFront0050"),  //"行政人员账户帮助",
            codeField: "ROBXZH_XSZH",
            idField: "ROBXZH_XSZH",
            returncols: "ROBXZH_YHZH;ROBXZH_KHH;ROBXZH_SSSF;ROBXZH_SSCS;ROBXZH_ZHMC;ROBXZH_ZHMC;ROBXZH_XSZH;ROBXZH_USERID;ROBXZH_BANKTYPE;BFBANKTYPENAME;ROBXZH_SSGJ", //多个用;分隔
            setcols: "ROBXFK_DFZH;ROBXFK_YHMC;ROBXFK_DFS;ROBXFK_DFCS;ROBXFK_DFMC;ROBXFK_DFZHM;ROBXFK_XSZH;ROBXFK_DFBH;ROBXFK_BANKTYPE;ROBXFK_BANKTYPENAME;ROBXFK_DFGJ",
            getFilter:function(){
                var arr = [];
                arr.push({
                    "Left": "",
                    "Field": "robxzh_userid",
                    "Operate": "in",
                    "IsExpress": false,
                    "Value": idp.utils.jse("\'"+idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_YGNM+"\'"),
                    "Right": "",
                    "Logic": "or"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_gk",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": 1,
                    "Right": "",
                    "Logic": "and"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_zt",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": 1,
                    "Right": "",
                    "Logic": "and"
                });
                arr.push({
                    "Left": "",
                    "Field": "robxzh_dwid",
                    "Operate": "=",
                    "IsExpress": false,
                    "Value": idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_DWID,
                    "Right": "",
                    "Logic": "and"
                });
                return arr;
            }
        }); //动态绑定一个 帮助
        editorAccount.textmode=true;
        //帮助控件初始化之前动态设置editor
        idp.control.grid.setEditor("grid_ROBXFK", "ROBXFK_DFMC", editor);
        idp.control.grid.setEditor("grid_ROBXFK", "ROBXFK_DFZH", editorAccount);
    }
    // 往来单位
    if (rowdata.ROBXFK_DFXZ == "2") {
        let editor = idp.control.grid.getEditor("lookup", {
            helpID: "f0886c4d-d54b-336f-7f21-5c8c9a48bf7e",
            title: idp.lang.get("FSROFront0051"),  //"往来单位帮助",
            codeField: "NAME$LANGUAGE$",
            idField: "NAME$LANGUAGE$",
            returncols: "ID;CODE;NAME$LANGUAGE$", //多个用;分隔
            setcols: "ROBXFK_DFBH;ROBXFK_DFBH1;ROBXFK_DFMC"
        }); //动态绑定一个 帮助
        editor.textmode=true;
        let editorAccount = idp.control.grid.getEditor("lookup", {
            helpID: "f981cada-9b3d-ebc2-cfc4-4f44df432295",
            title: idp.lang.get("FSROFront0052"),   //"往来单位账户帮助",
            codeField: "ACCOUNTCODE",
            idField: "ACCOUNTCODE",
            returncols: "ACCOUNTCODE;ACCOUNTCODE;ACCOUNTNAME$LANGUAGE$;ACCOUNTNAME$LANGUAGE$;BFBANKNAME;PROVINCE;BFBANKTYPENAME;CITY;COUNTRY;PARTNERID;BFBANKTYPEID", //多个用;分隔
            setcols: "ROBXFK_DFZH;ROBXFK_XSZH;ROBXFK_DFMC;ROBXFK_DFZHM;ROBXFK_YHMC;ROBXFK_DFS;ROBXFK_BANKTYPENAME;ROBXFK_DFCS;ROBXFK_DFGJ;ROBXFK_DFBH;ROBXFK_BANKTYPE",
            getFilter:function(){
                var arr = [];
                arr.push({
                    "Left": "",
                    "Field": "partnerid",
                    "Operate": "in",
                    "IsExpress": false,
                    "Value": idp.utils.jse("'" + rowdata.ROBXFK_DFBH + "'"),
                    "Right": "",
                    "Logic": "and"
                });
                return arr;
            }
        }); //动态绑定一个 帮助
        editorAccount.textmode=true;
        //帮助控件初始化之前动态设置editor
        idp.control.grid.setEditor("grid_ROBXFK", "ROBXFK_DFMC", editor);
        idp.control.grid.setEditor("grid_ROBXFK", "ROBXFK_DFZH", editorAccount);
    }
}


/**
 * 查看流程
 * */
function viewProcess() {
    idp.uiview.getValue();
    let LCSL = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_LCSL;
    let BILLID = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_NM;
    let FORMTYPE = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_SQLX;
    let DJBH = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_BH;
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

//保存前校验
function saveBefore() {
    debugger
    idp.uiview.getValue();
    let fkbbjeSum = 0.00;  //付款本币金额总和
    let jkftbbjeSum = 0.00;//借款分摊本币金额总和
    let fkjeSum = 0.00;  //付款金额总和
    let jkftjeSum = 0.00;//借款分摊金额总和
    var jkglsqSum = 0.00;//借款关联申请总和;
    let djhl = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_HL;
    let sfje = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_JKJE;
    let sfbbje = idp.uiview.modelController.getModel()[0].data[0].ROYWSQ_JKJE * djhl;
    idp.uiview.setCtrlValue("ROBXFK_FKJE", sfbbje.toFixed(2));
    //审批退回状态处理
    //判断当前状态为审批退回，当前环节为制单时，修改单据状态为制单
    var zt = idp.uiview.modelController.getMainRowObj().ROYWSQ_ZT;
    //var dqhj = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJ;
    var dqhjbh = idp.uiview.modelController.getMainRowObj().ROYWSQ_DQHJBH;
    if(zt==-1){
        if(dqhjbh=="ZD"){
            idp.uiview.setCtrlValue("ROYWSQ_ZT", 0);
            idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '制单');
        }else{
            idp.uiview.setCtrlValue("ROYWSQ_ZT", 1);
            idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '处理中');
        }
    }
    if ($("#ROYWSQ_ZY").length>0) {
        // 校验报账事项
        let bzsx = $("#ROYWSQ_ZY").val();

        if (bzsx == "") {
            idp.warn(idp.lang.get("FSROFront0007")); //("报账事项不允许为空");
            return false;
        }
    }
    debugger
    //借款分摊没有时新增一个
    let jkft = idp.control.get("grid_ROJKFT").getData();
    if(jkft.length==0){
        idp.uiview.addRow("grid_ROJKFT");
        debugger
        jkft = idp.control.get("grid_ROJKFT").getData();
    }
    //付款本币金额合计与实付金额校验
    let info = idp.control.get("grid_ROBXFK").getData();
    if(info.length==1){
        idp.control.get("grid_ROBXFK").updateCell('ROBXFK_FKJE',sfje,0);
        idp.control.get("grid_ROBXFK").updateCell('ROBXFK_FKBBJE',sfbbje,0);
        idp.uiview.getValue();
        info = idp.control.get("grid_ROBXFK").getData();
    }
    if (info.length > 0) {
        // i虽然在全局作用域声明，但是在for循环体局部作用域中使用的时候，变量会被固定，不受外界干扰
        for (let i = 0; i < info.length; i++) {
            if(info[i].ROBXFK_YWXZ=='2' &&  info[i].ROBXFK_DFXZ !=1){//现金还款对方性质只能是个人
                idp.warn(idp.lang.get("FSROFront0001") + ":" + idp.lang.get("FSPubFront0038") + (i+1) + idp.lang.get("FSPubFront0039") + idp.lang.get("FSROFront0008")); //("付款明细:第【"+(i+1)+"】行现金还款对方性质只能是个人，请检查");
                return false;
            }
            if(info[i].ROBXFK_YWXZ=='1'){//报销付款
                let fkbbje = parseFloat(info[i].ROBXFK_FKBBJE);
                let fkje = parseFloat(info[i].ROBXFK_FKJE);
                fkbbjeSum += fkbbje;
                fkjeSum += fkje;
            }
            for(var j = i + 1; j < info.length; j++){
                if(info[i].ROBXFK_ZJZH != info[j].ROBXFK_ZJZH){
                    idp.warn(idp.lang.get("FSROFront0009")); //("同一单据只允许一个付款账户");
                    return false;
                }
            }
        }
    }
    //付款本币金额合计与分摊金额校验
    if(jkft.length==1){
        idp.control.get("grid_ROJKFT").updateCell('ROJKFT_JE',sfje,0);
        idp.control.get("grid_ROJKFT").updateCell('ROJKFT_BBJE',sfbbje,0);
        idp.uiview.getValue();
        jkft = idp.control.get("grid_ROJKFT").getData();
     }
    if (jkft.length > 0) {
        // i虽然在全局作用域声明，但是在for循环体局部作用域中使用的时候，变量会被固定，不受外界干扰
        for (let i = 0; i < jkft.length; i++) {
            let jkftbbje = parseFloat(jkft[i].ROJKFT_BBJE);
            jkftbbjeSum += jkftbbje;
            let jkftje = parseFloat(jkft[i].ROJKFT_JE);
            jkftjeSum += jkftje;
        }
    }
    if (fkbbjeSum != sfbbje) {
        idp.warn(idp.lang.get("FSROFront0055"));  //("付款本币金额合计不等于实付本币金额，请检查");
        return false;
    }
    // if (fkjeSum != sfje) {
    //     // TODO
    //     idp.warn(idp.lang.get(""));  //("付款金额合计不等于实付金额，请检查");
    //     return false;
    // }
    if (jkftbbjeSum != sfbbje) {
        idp.warn(idp.lang.get("FSROFront0041") + idp.lang.get("FSROFront0040") + "," + idp.lang.get("FSPubFront0040"));  //("分摊本币金额合计不等于实报本币金额，请检查");
        return false;
    }
    // if (jkftjeSum != sfje) {
    //     idp.warn();  //("分摊本币金额合计不等于实报本币金额，请检查");
    //     return false;
    // }
    //借款关联申请：检查每行本次冲销金额最大=分摊金额-已冲销申请金额
    //借款关联申请：检查本次冲销金额合计不允许大于实报金额
    var rojkglsqData = idp.control.get("grid_ROJKGLSQ").getData();

    for(var m=0,len=rojkglsqData.length;m<len;m++){
        var item = rojkglsqData[m];
        var bccxje = item["ROJKGLSQ_JE"]?item["ROJKGLSQ_JE"]:0.00;//借款关联申请金额；
        var ftycx = item["ROJKGLSQ_FTYCX"]?item["ROJKGLSQ_FTYCX"]:0.00;//分摊已冲销
        var ftje = item["ROJKGLSQ_FTJE"];//分摊金额
        var ycxje =ftje-ftycx;
        var mm=m+1;
        if(bccxje>ycxje){
            idp.warn(idp.lang.get("FSROFront0057")+idp.lang.get("FSPubFront0038")+mm+idp.lang.get("FSPubFront0039")+"，"+idp.lang.get("FSROFront0058"));//借款关联申请 第 行 本次冲销金额不得大于（分摊金额-已冲销申请金额），请检查
            return false;
        }
        jkglsqSum +=bccxje;
    }
    if(jkglsqSum>sfbbje){
        idp.warn(idp.lang.get("FSROFront0056"));  //借款关联申请总和不能大于借款金额，请检查
        return false;
    }

    // 借款关联申请  冲销
    var infoCX = idp.control.get("grid_ROJKGLSQ").getData();
    var cxbbjeSum=0;
    // if(infoCX.length > 0){
    //     for(let i = 0; i < infoCX.length; i++){
    //         cxbbjeSum += parseFloat(infoCX[i].ROJKGLSQ_BBJE);
    //     }
    //     if(cxbbjeSum != sfbbje){
    //         idp.warn(idp.lang.get("FSROFront0039") + idp.lang.get("FSROFront0109") + "," + idp.lang.get("FSPubFront0040")); //("本次冲销本币金额合计不等于实报本币金额，请检查");
    //         return false;
    //     }
    // }
    return saveBill();
}
//保存
function saveBill() {
    debugger;
    var defer = $.Deferred();
    var zt = idp.uiview.modelController.getMainRowObj().ROYWSQ_ZT;
    idp.store.commit('historyzt', zt,false);//添加记录历史状态
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
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/savebill",
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
//保存后
function saveAfter(){
    var operation = idp.store.get('operation');
    if(operation == 'add'){
        idp.store.commit('operation','none',false);
    }

}
/**保存后处理
 * （借款关联申请单冲销处理）
 */
function saveBillAfter(){
    var defer = $.Deferred();
    console.log(idp.store.get('jkglsqdata'));debugger
    var jkglsqdata = idp.store.get('jkglsqdata');
    var param = {
        ROJKGLSQ:{
            oldrojkglsqList:[],
            rojkglsqList:[]
        }};
    param['ROJKGLSQ']['oldrojkglsqList'] = jkglsqdata?JSON.parse(jkglsqdata):[];
    param['ROJKGLSQ']['rojkglsqList'] =idp.control.get("grid_ROJKGLSQ").rows;
    console.log(param);
    debugger;
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/savebillAfter",
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
function controlAutoAdd(){
    addItemCommon('grid_ROJKMX1');
    addItemCommon('grid_ROJKFT');
    addItemCommon('grid_ROBXFK');
    idp.uiview.getValue();
}

function addItemCommon(gridID){
    if(gridID=='grid_ROJKMX1'){
        idp.uiview.addRow('grid_ROJKMX1');
        let bxmx1 = idp.control.get("grid_ROJKMX1").getData();
        if (bxmx1.length > 0 && idp.store.get("ifOnlyOneFYXM")) {
            idp.control.get("grid_ROJKMX1").updateCell('ROJKMX1_FYXM', idp.store.get("ifOnlyOneFYXMID"), 0);
            idp.control.get("grid_ROJKMX1").updateCell('ROJKMX1_FYXMBH', idp.store.get("ifOnlyOneFYXMBH"), 0);
            idp.control.get("grid_ROJKMX1").updateCell('ROJKMX1_FYXMMC', idp.store.get("ifOnlyOneFYXMMC"), 0);
        }
        return;
    }
    if(gridID=='grid_ROJKFT'){
        idp.uiview.addRow('grid_ROJKFT');
        let bxmx1 = idp.control.get("grid_ROJKFT").getData();
        if (bxmx1.length > 0 && idp.store.get("ifOnlyOneFYXM")) {
            idp.control.get("grid_ROJKFT").updateCell('ROJKFT_FYXM', idp.store.get("ifOnlyOneFYXMID"), 0);
            idp.control.get("grid_ROJKFT").updateCell('ROJKFT_FYXMBH', idp.store.get("ifOnlyOneFYXMBH"), 0);
            idp.control.get("grid_ROJKFT").updateCell('ROJKFT_FYXMMC', idp.store.get("ifOnlyOneFYXMMC"), 0);
        }
        return;
    }
    if(gridID=='grid_ROBXFK'){
        idp.uiview.addRow('grid_ROBXFK');
        return;
    }

}

function editBill() {
    debugger;
    var defer = $.Deferred();
    idp.uiview.reloadData();
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
    var param = {};
    param.BILLID = nm;
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fsjkdj/checkedit",
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
    editCacheJkglsqData();
    return defer.promise();
}

/**编辑时缓存借款关联申请数据
 *
 */
function editCacheJkglsqData(){
    var jkglsqdata = '';
    jkglsqdata = JSON.stringify(idp.control.get("grid_ROJKGLSQ").rows.slice(0));
    idp.store.commit('jkglsqdata',jkglsqdata,false);
}
function cancelEvent() {
    var histotyzt = idp.store.get('historyzt');//历史状态
    if(histotyzt&&(histotyzt ==-1||histotyzt=="-1")){
        idp.uiview.setCtrlValue("ROYWSQ_ZT", -1);
        idp.uiview.setCtrlValue("ROYWSQ_ZTSM", '审批退回');
    }
    debugger
    var operation = idp.store.get('operation');
    if (operation == 'add') {
        idp.uiview.close();
        return true;
    }
    idp.uiview.cancel().done(function(data){
        debugger;
    });
    idp.store.commit('operation', 'none',false);
    controllButtonEnableBill("save", "");
    return true;
}


function deleteEvent() {
    var defer = $.Deferred();
    var nm = idp.uiview.modelController.getMainRowObj().ROYWSQ_NM;
    if (!nm) {
        idp.utils.getQuery('nm');
    }
    if (!nm) {
        idp.warn(idp.lang.get("FSROFront0017"));  //('单据内码为空，删除失败');
    }
    var param = {};
    param.BILLID = nm;
    idp.service.fetch(
        "/api/runtime/fssp/ro/v1.0/jkdjbiz/fssq/deletebill",
        param,
        false
    ).done(function(data) {
        //成功回调方法
        if (!data.result) {
            idp.error(data.message);
            defer.resolve(false);
        } else {
            defer.resolve(true);
        }
    }).fail(function(data) {
        //失败回调方法
        defer.resolve(false);
    });
    idp.uiview.close();
    return defer.promise();
}
/**
 * 报销关联申请
 */

function addJKGLSQ() {
    let glsq = idp.control.get("grid_ROJKGLSQ").rows;
    let ftnmArr = glsq.map(function(item){return item.ROJKGLSQ_FTID});
    var param = {
        glsq:ftnmArr,
        djlx:"FSROJK",
        ygnm:idp.uiview.modelController.getMainRowObj().ROYWSQ_YGNM,
        ygxm:idp.uiview.modelController.getMainRowObj().ROYWSQ_YGMC,
    };
    openBXGLSQdilog = $.leeDialog.open({
        title: idp.lang.get("FSROFront0059"),  //"借款关联申请单",
        name: idp.lang.get("FSROFront0059"),  //"借款关联申请单",
        isHidden: false,
        showMax: true,
        width: 1200,
        slide: false,
        height: 500,
        url: "/apps/fastdweb/views/runtime/page/card/cardpreview.html?styleid=a34decad-70ba-35a7-c22b-130477ceb873&modid=a34decad-70ba-35a7-c22b-130477ceb873",
        urlParms: param
    });
    openBXGLSQdilog.definedClose = function(res) {
        debugger
        //逻辑业务处理
        addJKGLSQRow(res);
        openBXGLSQdilog.close();
    }
}

function addJKGLSQRow(res) {
    if (res && res.length > 0) {
        let rows = [];
        $.each(res, function(i, item) {
            var ycx = item.ROYCXJE?item.ROYCXJE:0.00;debugger
            var row = $.extend(idp.uiview.modelController.getDefaultData("ROJKGLSQ"),{
                ROJKGLSQ_NM: Guid.NewGuid().ToString(),
                ROJKGLSQ_JKNM: idp.uiview.modelController.getMainRowObj().ROYWSQ_NM,
                ROJKGLSQ_SQRQ: item.ROCXRQ,//申请日期
                ROJKGLSQ_SQLXMC: item.ROCXLXMC,
                ROJKGLSQ_SQLXMC_ROSQLX_MC: item.ROCXLXMC,
                /* ROJKGLSQ_SQLXMC_ROSQLX_BH: item.ROCXLX,*/
                ROJKGLSQ_SQBH: item.ROCXBH,
                ROJKGLSQ_SQZY: item.ROCXSM,
                ROJKGLSQ_SQJE: item.ROCXJE,
                ROJKGLSQ_FTINFO: item.ROFTXX,
                ROJKGLSQ_SQYCX: ycx,
                ROJKGLSQ_FTSM: item.ROFTXX,
                ROJKGLSQ_FTID: item.ROFTNM,
                ROJKGLSQ_FTFYXMQC: item.ROFYXMMC,
                ROJKGLSQ_FTJE: item.ROFTJE,
                ROJKGLSQ_FTYCX: item.ROFTYCXJE,
                ROJKGLSQ_DJLX:idp.store.get('fdim'),
                ROJKGLSQ_SQNM:item.RODJNM,
                ROJKGLSQ_SQLXMC:item.ROCXLX
            })
            rows.push(row);
        })
        idp.control.get("grid_ROJKGLSQ").addRows(rows);
    }
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
    var args = {
        "SourceSys": "FSRO",
        "BillNM": idp.uiview.modelController.getMainRowObj().ROYWSQ_NM,
        "BillCODE": idp.uiview.modelController.getMainRowObj().ROYWSQ_BH,
        "USERCODE": idp.context.get("UserCode"),
        "SHOWMES": "附件式影像",
        "BillCATEGORY": "FSROJK",
        "BillType": "FSROJK",
        "OPERATION": operation
    }
    idp.service.fetch("/api/runtime/fssp/ro/v1.0/roint/imagemanager/getimageurl", args, false)
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
                        idp.utils.openNativeUrl(idp.uiview.modelController.getMainRowObj().ROYWSQ_NM||'DJ20190918', '单据影像信息', url);
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

/**
 * 单据打印功能
 * */
function printBill(){
    var param={};
    param.Formywclasscode="FSROJK";//row.FSBZDJ_DJYWLX;业务类型
    param.First=idp.store.get("fdim");//row.FSBZDJ_DJLX;单据类型
    param.Second='fszd';
    idp.service.fetch(
        "/api/runtime/fssp/commmon/v1.0/getbillbe/getbeidbybillclassandbillywclass",
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

