package com.inspur.gs.fssp.jzgx.external.core.service.fssp;

import com.inspur.gs.fssp.jzgx.external.core.service.fspf.ExternalServiceJZGXOnFSPF;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.data.repository.pub.PfgeformtypeRepository;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjj.DSJJZDApi;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjjcs.DSJJZDApi;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjj.DXJJZDApi;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs.DXJJCSZDApi;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.jzht.JZHTZDApi;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.tx.TXZDApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class ExternalServiceJZGXOnFSSP {

    @Autowired
    @Qualifier("dsjjzdapi")
    private DSJJZDApi dsjjzdApi;
    @Autowired
    private  PfgeformtypeRepository pfgeformtypeRepository;  //单据类型

    private final static String dsjjTable = "bzzxdsjj";      //对上计价
    private static final Logger logger= LoggerFactory.getLogger(ExternalServiceJZGXOnFSSP.class);

    /**
     * 提交前
     */
    public ResultRet submitBefore(Map<String, Object> data) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.submitBefore(data);
                break;
            default:
                break;
        }
        return resultRet;

    }

    /**
     * 提交
     */
    public ResultRet submit(Map<String, Object> data) {
        logger.info("我要报账列表提交开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.submit(data);
                break;
            default:
                resultRet.setResult(false);
                resultRet.setMessage("列表提交时未找到对应单据类型！");
                break;
        }
        logger.info("我要报账列表提交结束");
        return resultRet;
    }

    /**
     * 撤回前
     */
    public ResultRet retractbefore(Map<String, Object> data) {
        logger.info("我要报账列表撤回前开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.retractBefore(data);
                break;
            default:
                break;
        }
        logger.info("我要报账列表撤回前结束");
        return resultRet;
    }

    /**
     * 撤回
     */
    public ResultRet retract(Map<String, Object> data) {
        logger.info("我要报账列表撤回开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.retract(data);
                break;
            default:
                resultRet.setResult(false);
                resultRet.setMessage("列表撤回时未找到对应单据类型！");
                break;
        }
        logger.info("我要报账列表撤回结束");
        return resultRet;
    }

    /**
     * 删除前
     */
    public ResultRet deletebefore (Map<String, Object> data){
        logger.info("我要报账列表删除前开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.deleteBefore(data);
                break;
            default:
                break;
        }
        logger.info("我要报账列表删除前结束");
        return resultRet;
    }

    /**
     * 删除
     */
    public ResultRet deleteBill(Map<String, Object> data) {
        logger.info("我要报账列表删除开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String djlxnm = String.valueOf(data.get("FORMTYPE"));
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh){
            case "JZDSJJ":
                resultRet = dsjjzdApi.deleteBill(data);
                break;
            default:
                resultRet.setResult(false);
                resultRet.setMessage("列表删除时未找到对应单据类型！");
                break;
        }
        logger.info("我要报账列表删除结束");
        return resultRet;
    }

    /**
     * 联查单据
     */
    public ResultRet billView(Map<String, Object> data) {
        logger.info("共享平台联查单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        //String invokeczf = String.valueOf(data.get("INVOKECZF")).toUpperCase();//值范围  FSFP(流程框架时) 或 FSSP（共享平台模块时）
        /*if(!"FSSP".equals(invokeczf)){
            resultRet.setMessage("调用应用模块不是FSSP");
            resultRet.setResult(false);
            return resultRet;
        }*/
        String djnm = String.valueOf(data.get("BILLID"));//单据内码BILLID
        String djlxnm = String.valueOf(data.get("FORMTYPE"));//单据类型内码FORMTYPE
        String mode = String.valueOf(data.get("TASKTYPE"));//TASKTYPE
        String operation = String.valueOf(data.get("OPERATION")).toLowerCase();//OPERATION
        String sdim = String.valueOf(data.get("FORMCODE"));//表单格式编号
        String pftaskid = data.containsKey("PFTASKID")?(String)data.get("PFTASKID"):"";// 待办任务ID

        String status = "view";//状态根据OPERATION判断
        if("add".equals(operation)){
            status = operation;
            sdim = "fszd";
        }
        if("edit".equals(operation)){
            status = operation;
        }
        if(StringUtils.isEmpty(djlxnm)||"null".equals(djlxnm)){//单据类型内码为空，
            resultRet.setResult(false);
            resultRet.setMessage("单据类型内码为空");
            return resultRet;
        }
        if(StringUtils.isEmpty(djnm)||"null".equals(djnm)){
            djnm="";
        }
        if(StringUtils.isEmpty(sdim)||"null".equals(sdim)){
            sdim="fszd";
        }
        if(StringUtils.isEmpty(mode)||"null".equals(mode)){
            mode = "view";
        }
        String returnurl = "";

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));

        switch(djflbh){
            case "JZDSJJ"://对上计价
                returnurl = "/apps/fastdweb/views/runtime/debugpage/card/cardpreview.html?styleid=69168a7d-1985-effa-1b05-1e7fbb27d43c&dataid="+djnm+"&status="+status+"&operation="+operation+"&mode="+mode+"&runtime=true&fdim="+djlxnm+"&sdim="+sdim+"&pftaskid="+pftaskid+"&j=true";
                break;

            default:
                break;
        }
        if(StringUtils.isEmpty(returnurl)){
            resultRet.setResult(false);
            resultRet.setMessage("无法确定单据类型");
            return resultRet;
        }
        resultRet.setValue(returnurl);
        resultRet.setMessage("调用成功");
        logger.info("共享平台联查单据结束");
        return resultRet;
    }

    /**
     * 检查参数
     */
    public ResultRet checkParams(HashMap<String, Object> info) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        if(!info.containsKey("BILLID")|| StringUtils.isEmpty(String.valueOf(info.get("BILLID")))){
            resultRet.setResult(false);
            resultRet.setMessage("单据内码不能为空");
            return resultRet;
        }
        if(!info.containsKey("FORMTYPE")|| StringUtils.isEmpty(String.valueOf(info.get("FORMTYPE")))){
            resultRet.setResult(false);
            resultRet.setMessage("单据类型不能为空");
            return resultRet;
        }
        if(!info.containsKey("OPERATION")|| StringUtils.isEmpty(String.valueOf(info.get("OPERATION")))){
            resultRet.setResult(false);
            resultRet.setMessage("操作不能为空");
            return resultRet;
        }
        if(!info.containsKey("MODE")|| StringUtils.isEmpty(String.valueOf(info.get("MODE")))){
            resultRet.setResult(false);
            resultRet.setMessage("MODE不能为空");
            return resultRet;
        }
        if(!info.containsKey("DJYWLX")|| StringUtils.isEmpty(String.valueOf(info.get("DJYWLX")))){
            resultRet.setResult(false);
            resultRet.setMessage("单据业务类型不能为空");
            return resultRet;
        }
        return resultRet;
    }


}
