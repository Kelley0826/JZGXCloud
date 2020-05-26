/**
 * 单据公共脚本
 * 创建时间：2020/04/30
 * 创建人：inspur
 */

//编辑按键是否可用：1可用；0不可用
var modify = 1;

// region 按钮控制
/**
 * 控制按钮显示 inspur
 * */
function controllButtonDisplayBill(operation, mode) {
    debugger;
    if (!mode) {
        mode = idp.utils.getQuery("mode");
    }
    if (!operation) {
        operation = idp.utils.getQuery("operation");
    }
    var djzt = idp.utils.getQuery("djzt");
    idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
        "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit",
        "baritem_workFlow", "baritem_print", "baritem_ElectronicImage", "baritem_close"
    ], false); // 隐藏
    if (mode == 'fszd') { // 制单
        switch (operation) {
            case "add": {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_modify", "baritem_cancel", "baritem_save", "baritem_workFlow",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_close", "baritem_ElectronicImage", "baritem_print"
                ], true); // 显示
                break;
            }
            case "edit": {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_print", "baritem_add", "baritem_print"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_modify", "baritem_cancel", "baritem_ElectronicImage", "baritem_save",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_close", "baritem_workFlow", "baritem_print"
                ], true); // 显示
                break;
            }
            default: {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_trialPass", "baritem_trialBack",  "baritem_add"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_modify", "baritem_cancel", "baritem_ElectronicImage", "baritem_save", "baritem_workFlow",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_close", "baritem_print"
                ], true); // 显示
                if (djzt != "0" && djzt != "-1") {
                    idp.control.get("toolbar1").toggleBtns(["baritem_add"], false); // 隐藏
                    idp.control.toolbar.setDisabled("toolbar1", ["baritem_modify", "baritem_cancel", "baritem_save",
                        "baritem_delete", "baritem_submit"
                    ]); // 禁用
                }
                break;
            }
        }
    } else if (mode == 'fscwcs' || mode == 'fscs') { // 财务初审
        switch (operation) {
            case "edit": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_add", "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_print"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_workFlow", "baritem_close", "baritem_ElectronicImage",
                ], true); // 显示
                break;
            }
            case "dbbl": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_add", "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_print"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_workFlow", "baritem_close", "baritem_ElectronicImage",
                ], true); // 显示
                break;
            }
            case "ybbl": {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_add",
                    "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit",  "baritem_print"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_cancelSubmit","baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
            default: {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_add",
                    "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_print"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
        }
    } else if (mode == 'fsywcs') { // 业务初审
        switch (operation) {
            case "edit": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_print", "baritem_add", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_workFlow", "baritem_close", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            case "dbbl": {
                idp.control.get("toolbar1").toggleBtns(["baritem_print", "baritem_add", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_workFlow", "baritem_close", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            case "ybbl": {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_print", "baritem_add",
                    "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
            default: {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_print", "baritem_add",
                    "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
        }
    } else if (mode == 'fsjh') { // 稽核
        switch (operation) {
            case "edit": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_print", "baritem_add",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_close", "baritem_workFlow", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            case "dbbl": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_print", "baritem_add",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_close", "baritem_workFlow", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            // case "ybbl": {
            //     idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_print", "baritem_add",
            //         "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
            //     ], false); // 隐藏
            //
            //     idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
            //     break;
            // }
            default: {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_print", "baritem_add",
                    "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
        }
    } else if (mode == 'fsfh') { // 复核
        switch (operation) {
            case "edit": {
                idp.control.get("toolbar1").toggleBtns([ "baritem_print", "baritem_add",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_close", "baritem_workFlow", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            case "dbbl": {
                idp.control.get("toolbar1").toggleBtns([  "baritem_print", "baritem_add",
                    "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel",
                    "baritem_save", "baritem_close", "baritem_workFlow", "baritem_ElectronicImage"
                ], true); // 显示
                break;
            }
            // case "ybbl": {
            //     idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back", "baritem_print", "baritem_add",
            //         "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
            //     ], false); // 隐藏
            //
            //     idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
            //     break;
            // }
            default: {
                idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_print", "baritem_add",  "baritem_modify",
                    "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
                ], false); // 隐藏

                idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage"], true); // 显示
                break;
            }
        }
    } else if (mode == 'grcx') {
        idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
             "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
        ], false); // 隐藏

        idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage", "baritem_print"], true); // 显示
    } else if (mode == 'zgcx') {
        idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
             "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
        ], false); // 隐藏

        idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage", "baritem_print"], true); // 显示
    } else if (mode == 'cwcx') {
        idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
             "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
        ], false); // 隐藏

        idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage", "baritem_print"], true); // 显示
    } else if (mode == 'cx') {
        idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
             "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
        ], false); // 隐藏

        idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage", "baritem_print"], true); // 显示
    } else {
        idp.control.get("toolbar1").toggleBtns(["baritem_pass", "baritem_back",  "baritem_add",
             "baritem_modify", "baritem_cancel", "baritem_save", "baritem_delete", "baritem_submit", "baritem_cancelSubmit"
        ], false); // 隐藏

        idp.control.get("toolbar1").toggleBtns(["baritem_workFlow", "baritem_close", "baritem_ElectronicImage", "baritem_print"], true); // 显示
    }
}

/**
 * 按钮显示diy
 * */
function controllButtonDisplayBillDiy(){
    var showButton = idp.utils.getQuery('Buttons');
    var showButtons = showButton.splice("$");

    idp.control.get("toolbar1").toggleBtns([], false); // 隐藏

    idp.control.get("toolbar1").toggleBtns(showButtons, true); // 显示
}

/**
 * 控制按钮可用 inspur
 * */
function controllButtonEnableBill(operation, mode) {
    debugger;
    if (!mode) {
        mode = idp.utils.getQuery("mode");
    }
    if (!operation) {
        operation = idp.utils.getQuery("operation");
    }
    switch (operation) {
        case "add": { // 新增
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_cancel", "baritem_save", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_add", "baritem_modify", "baritem_delete", "baritem_submit",
                "baritem_cancelSubmit", "baritem_workFlow", "baritem_ElectronicImage", "baritem_print"
            ]); // 禁用
            modify = 0;
            break;
        }
        case "edit": { // 编辑
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_cancel", "baritem_save", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_add", "baritem_print",
                 "baritem_modify", "baritem_delete", "baritem_submit", "baritem_cancelSubmit", "baritem_workFlow", "baritem_ElectronicImage"
            ]); // 禁用
            modify = 0;
            break;
        }
        case "save": { // 保存
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_add", "baritem_modify",
                "baritem_delete", "baritem_submit",  "baritem_close",  "baritem_ElectronicImage", "baritem_print"
            ]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_cancel", "baritem_save", "baritem_workFlow"]); // 禁用
            if(mode != 'fszd'){
                idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow"]); // 可用
            }
            modify = 1;
            break;
        }
        case "submit": { // 提交
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_add", "baritem_workFlow", "baritem_close", "baritem_cancelSubmit", "baritem_ElectronicImage", "baritem_print"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_modify", "baritem_cancel", "baritem_delete", "baritem_save", "baritem_submit"]); // 禁用
            modify = 0;
            break;
        }
        case "ch": { // 撤回
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_add", "baritem_modify",
                "baritem_delete", "baritem_submit", "baritem_workFlow", "baritem_close",  "baritem_print"
            ]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_cancel", "baritem_save", "baritem_cancelSubmit"]); // 禁用
            modify = 1;
            break;
        }
        case "dbbl": { // 办理
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_add", "baritem_modify",
                "baritem_delete", "baritem_submit", "baritem_workFlow", "baritem_close", "baritem_chsp"
            ]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_cancel", "baritem_save", "baritem_cancelSubmit"]); // 禁用
            modify = 1;
            break;
        }
        case "cstg": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        case "csth": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        case "jhtg": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        case "jhth": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        case "fhtg": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        case "fhth": {
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow", "baritem_close"]); // 可用
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_pass", "baritem_back", "baritem_modify", "baritem_cancel", "baritem_save"]); // 禁用
            modify = 0;
            break;
        }
        default: { //查看
            idp.control.toolbar.setDisabled("toolbar1", ["baritem_workFlow", "baritem_cancel", "baritem_save"]); // 禁用
            idp.control.toolbar.setEnabled("toolbar1", ["baritem_close", "baritem_print", "baritem_ElectronicImage"]); // 可用
            if (mode == "fscwcs") {
                idp.control.toolbar.setEnabled("toolbar1", ["baritem_chsp"]); // 可用
            }
            if(mode != 'fszd'){
                idp.control.toolbar.setEnabled("toolbar1", ["baritem_workFlow"]); // 可用
            }
            modify = 0;
            break;
        }
    }
}

/**
 * 查看流程 inspur
 * billid  formtype  billcode
 * */
function viewProcessCommonBill(lcsl,billid,formType,billCode) {
    let url = '/apps/fastdweb/views/runtime/page/card/cardpreview.html?modid=613ba315-6a01-3b4d-c504-d900fb727e12&styleid=613ba315-6a01-3b4d-c504-d900fb727e12&dataid=&insid=';
    if (!lcsl) {
        idp.error(idp.lang.get("FSROFront0019"));  //("当前单据不存在流程实例，无法查看");
        return false;
    }
    if(!billid){
        idp.error(idp.lang.get("FSROFront0020"));  //("当前单据不存在，无法查看");
        return false;
    }
    url += lcsl + '&billid=' + billid + '&formtype=' + formType + '&billcode=' + billCode;
    idp.utils.openurl('viewprocess', idp.lang.get("FSROFront0043"), url); //查看流程
}
/*转换为保留两位小数的浮点型（整数不保留两位小数）*/
function toFloat(arg1)
{
    if (!parseFloat(arg1)) {
        if (arg1 === "0")
            arg1 = parseFloat(parseFloat(arg1).toFixed(2));
        return arg1;
    }
    return parseFloat(parseFloat(arg1).toFixed(2));
}
/**
 * 字符串替换 String.Formate 
 * var template1="我是{0}，今年{1}了"; var result1=template1.format("loogn",22);
 * var template2="我是{name}，今年{age}了"; var result2=template2.format({name:"loogn",age:22});
 * */
String.prototype.ROFormat = function(args) {
    var result = this;
    if (arguments.length > 0) {    
        if (arguments.length == 1 && typeof (args) == "object") {
            for (var key in args) {
                if(args[key]!=undefined){
                    var reg = new RegExp("({" + key + "})", "g");
                    result = result.replace(reg, args[key]);
                }
            }
        }
        else {
            for (var i = 0; i < arguments.length; i++) {
                if (arguments[i] != undefined) {
                    var reg = new RegExp("({[" + i + "]})", "g");
                    result = result.replace(reg, arguments[i]);
                }
            }
        }
    }
    return result;
}

/**
 * 打开状态日志窗口
 * creadBy:inspur
 **/
var openZTRZdilog = null;

function openZTRZ(djlx) {
    debugger;
    if(djlx == "hk"){
        var djnm = idp.uiview.modelController.getMainRowObj().ROHKDJ_NM;
    }
    if(djlx == "bx"){
        var djnm = idp.uiview.modelController.getMainRowObj().ROBXDJ_NM;
    }
    if(djlx == "jk"){
        var djnm = idp.uiview.modelController.getMainRowObj().ROSQDJ_NM;
    }
    if(djlx == "sq"){
        var djnm = idp.uiview.modelController.getMainRowObj().ROSQDJ_NM;
    }
    if(!djnm){
        leeUI.Warning(idp.lang.get("FSPubFront0001"), idp.lang.get("FSROFront0078"));   //("提示", "获取单据内码失败，请联系管理员");
        return false;
    }
    openZTRZdilog = $.leeDialog.open({
        title: "",
        name: idp.lang.get("FSROFront0077"),  //'状态日志',
        isHidden: false,
        showMax: true,
        width: 1000,
        slide: false,
        height: 600,
        url: "/apps/fastdweb/views/runtime/page/card/cardpreview.html?styleid=e6a0960b-162e-cc2b-29e4-2cb103bf1737&modid=e6a0960b-162e-cc2b-29e4-2cb103bf1737&djnm=" + djnm,
        onclose: function() {
            debugger;
        },
    });
}

