package com.inspur.gs.fssp.jzgx.external.core.service.fspf;

import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.data.repository.pub.PfgeformtypeRepository;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjj.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjj.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjjcs.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.jzht.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.tx.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.inspur.gs.fssp.jzgx.data.entity.pub.FsbzdjEntity;
import com.inspur.gs.fssp.jzgx.data.repository.pub.FsbzdjRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: inspur
 * Date:  2020/04/27
 * Company: Inspur
 */
@Service
public class ExternalServiceJZGXOnFSPF {

    @Autowired
    @Qualifier("dsjjprocessapi")
    private DSJJProcessApi dsjjProcessApi;    // 流程
    @Autowired
    @Qualifier("dsjjzdapi")
    private DSJJZDApi dsjjzdApi; //制单界面
    @Autowired
    private InternalApiJZ internalApiJZ;
    @Autowired
    private PfgeformtypeRepository pfgeformtypeRepository; //单据类型
    @Autowired
    private FsbzdjRepository fsbzdjRepository;

    private static final Logger logger= LoggerFactory.getLogger(ExternalServiceJZGXOnFSPF.class);

    private final static String dsjjTable = "BZZXDSJJ";

    /**
     * 触发节点事件前
     */
    public ResultRet tirggerNodeBefore(Map<String, Object> data){
        logger.info("触发节点前事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.tirggerNodeBeforeCS(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.tirggerNodeBeforeJH(map);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.tirggerNodeBeforeFH(map);
                }
                break;
            default:
                break;

        }
        logger.info("触发节点前事件结束");
        return resultRet;
    }
    /**
     * 触发节点事件
     */
    public ResultRet tirggerNode(Map<String, Object> data){
        logger.info("触发节点事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.tirggerNodeCS(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.tirggerNodeJH(map);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.tirggerNodeFH(map);
                }
                break;
            default:
                break;

        }
        if (resultRet.isResult()) {
            resultRet = updateBillStatusAndHJ(data,"TG");
        }
        logger.info("触发节点事件结束");
        return resultRet;

    }
    /**
     * 提交前
     */
    public ResultRet submitApproveBefore(Map<String, Object> data){
        logger.info("提交前事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                resultRet = dsjjzdApi.submitBefore(map);
                break;
            default:
                break;

        }
        logger.info("提交前事件结束");
        return resultRet;
    }
    /**
     * 提交
     */
    public ResultRet submitApprove(Map<String, Object> data){
        logger.info("提交后事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                resultRet = dsjjzdApi.submitAfter(map);
                break;
            default:
                break;

        }
        logger.info("提交后事件结束");
        return resultRet;
    }
    /**
     * 通过前检查
     */
    public ResultRet approvePassBefore(Map<String, Object> data) {
        logger.info("通过前事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditPassBefore(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditPassBefore(map);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.recheckPassBefore(map);
                }
                break;
            default:
                break;

        }
        logger.info("通过前事件结束");
        return resultRet;
    }

    /**
     * 通过
     */
    public ResultRet approvePass(Map<String, Object> data) {
        logger.info("通过后事件开始");
        System.out.println("我的待办通过开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);

        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditPassAfter(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditPassAfter(map);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.recheckPassAfter(map);
                }
                break;
            default:
                resultRet.setResult(false);
                resultRet.setMessage("单据通过时未找到对应单据类型！");
                break;

        }
        System.out.println("我的待办通过结束");
        logger.info("通过后事件结束");
        return resultRet;
    }

    /**
     * 退回前检查
     */
    public ResultRet approveBackBefore(Map<String, Object> data) {
        logger.info("退回前事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  //单据类型内码 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditBackBefore(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditBackBefore(map);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.recheckBackBefore(map);
                }
                break;
            default:
                break;

        }
        logger.info("退回前事件结束");
        return resultRet;
    }

    /**
     * 退回
     */
    public ResultRet approveBack(Map<String, Object> data) {
        logger.info("退回后事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");
        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  //单据类型内码
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditBackAfter(contextParamMap);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditBackAfter(contextParamMap);
                } else if (gnjd.equals("FSFH")) {
                    resultRet = dsjjProcessApi.recheckBackAfter(contextParamMap);
                }
                break;
            default:
                break;

        }
        if (resultRet.isResult()) {
            resultRet = updateBillStatusAndHJ(data,"TH");
        }
        logger.info("退回后事件结束");
        return resultRet;
    }

    /**
     * 撤回前检查
     */
    public ResultRet retractBefore(Map<String, Object> data) {
        logger.info("撤回前事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");
        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditCHBefore(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditCHBefore(map);
                }
                break;
            default:
                break;
        }
        logger.info("撤回前事件结束");
        return resultRet;
    }

    /**
     * 撤回
     */
    public ResultRet retract(Map<String, Object> data) {
        logger.info("撤回后事件开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");
        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                if (gnjd.equals("FSCS")) {
                    resultRet = dsjjProcessApi.firstAuditCHAfter(map);
                } else if (gnjd.equals("FSJH")) {
                    resultRet = dsjjProcessApi.auditCHAfter(map);
                }
                break;
            default:
                resultRet.setResult(false);
                resultRet.setMessage("单据撤回时未找到对应单据类型！");
                break;
        }
        if (resultRet.isResult()) {
            resultRet = updateBillStatusAndHJ(data,"CH");
        }
        logger.info("撤回后事件结束");
        return resultRet;
    }

    /**
     * 更新单据状态
     */
    public ResultRet updateState(Map<String, Object> data) {
        logger.info("更新业务单据状态开始");
        System.out.println("更新业务单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
/*
        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String billId = String.valueOf(contextParamMap.get("BILLID"));  // 单据内码
        String billStatus = String.valueOf(contextParamMap.get("DJZT"));  // 单据状态
        String billStatusSM = String.valueOf(contextParamMap.get("DJZTSM"));  // 单据状态说明
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 单据类型
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        System.out.println("参数："+billId+"***"+billStatus+"***"+billStatusSM+"***"+djlxnm+"***"+djflbh);
        switch(djflbh) {
            case "JZDSJJ":
                resultRet = dsjjProcessApi.updateYWState(data);
                break;
            default:
                break;

        }

 */
        logger.info("更新业务单据状态结束");
        System.out.println("更新业务单据状态结束");

        return resultRet;
    }

    /**
     * 联查单据
     */
    public ResultRet billView(Map<String, Object> data) {
        logger.info("流程框架联查单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        String url = "";

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");

        String tasktype = String.valueOf(contextParamMap.get("TASKTYPE")).toLowerCase();  //任务类型编号 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String formType = String.valueOf(contextParamMap.get("FORMTYPE"));                // 单据类型内码
        String djnm = String.valueOf(contextParamMap.get("BILLID"));                      // 单据内码
        String operation = String.valueOf(contextParamMap.get("OPERATION")).toLowerCase();  // 操作  view  bl 等
        String sdim = String.valueOf(contextParamMap.get("FORMCODE"));                    //表单格式编号
        String pftaskid = String.valueOf(contextParamMap.get("PFTASKID"));                 // 待办任务ID
        String dqhjbh = String.valueOf(contextParamMap.get("DQHJBH"));
        String status = "view";                                                            //状态根据OPERATION判断

        //String invokeczf = String.valueOf(contextParamMap.get("INVOKECZF")).toUpperCase();//值范围  FSFP(流程框架时) 或 FSSP（共享平台模块时）
        //String dqhj = String.valueOf(contextParamMap.get("DQHJ"));
        //String bdfl= String.valueOf(contextParamMap.get("BIZCATCODE"));//表单分类
        //String czlb= String.valueOf(contextParamMap.get("OPERATES"));//操作列表
        //String jdlb= String.valueOf(contextParamMap.get("NODETYPE"));//节点类别
        //String sdimname = String.valueOf(contextParamMap.get("FORMNAME"));//

        if ("add".equals(operation)) {
            status = operation;
        }
        if(StringUtils.isEmpty(formType)||"null".equals(formType)){//单据类型内码为空，
            resultRet.setResult(false);
            resultRet.setMessage("单据类型内码为空");
            return resultRet;
        }
        if(StringUtils.isEmpty(tasktype)||"null".equals(tasktype)){
            tasktype = "view";//默认值
        }
        if(tasktype.equals("fscs")){
            tasktype = "fscwcs";
        }
        if(StringUtils.isEmpty(djnm)||"null".equals(djnm)){
            djnm="";
        }
        if(StringUtils.isEmpty(sdim)||"null".equals(sdim)){
            sdim="fszd";
        }
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(formType));
        switch(djflbh){
            case "JZDSJJ"://对上计价
                url = "/apps/fastdweb/views/runtime/debugpage/card/cardpreview.html?styleid=69168a7d-1985-effa-1b05-1e7fbb27d43c&dataid="+djnm+"&status="+status+"&operation="+operation+"&mode="+tasktype+"&runtime=true&fdim="+formType+"&sdim="+sdim+"&pftaskid="+pftaskid+"&j=true";
                break;
            default:
                break;
        }
        if(StringUtils.isEmpty(url)){
            resultRet.setResult(false);
            resultRet.setMessage("无法确定单据类型，URL为空值！");
            return resultRet;
        }
        resultRet.setMessage("调用成功！");
        resultRet.setValue(url);
        logger.info("流程框架联查单据结束");
        return resultRet;
    }

    /**
     * 完成
     */
    public ResultRet wflowfinish(Map<String, Object> data) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        Map<String, Object> contextParamMap = (Map<String, Object>)data.get("contextParam");
        String gnjd = String.valueOf(contextParamMap.get("TASKTYPE"));  // 功能结点（初审:fscs、稽核:fsjh、复核:fsfh）
        String djlxnm = String.valueOf(contextParamMap.get("FORMTYPE"));  // 业务来源（通用报销：FSROBX、专有报销：待定）

        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",contextParamMap.get("BILLID"));
        map.put("TASKTYPE",gnjd);
        map.put("FORMTYPE",djlxnm);
        //根据单据类型内码获取单据分类
        String djflbh = String.valueOf(pfgeformtypeRepository.getDjflByBH(djlxnm));
        switch(djflbh) {
            case "JZDSJJ":
                dsjjProcessApi.accomplish(contextParamMap);
                break;
            default:
                break;
        }
        if (resultRet.isResult()) {
            resultRet = updateBillStatusAndHJ(data,"WC");
        }
        return resultRet;
    }

    /**
     * 更新单据状态和环节信息
     */
    public ResultRet updateBillStatusAndHJ(Map<String, Object> billInfo,String node){
        logger.info("更新单据状态环节开始");
        System.out.println("更新单据状态环节开始");
        ResultRet resultRet = new ResultRet();
        Map<String, Object> contextParamMap = (Map<String, Object>)billInfo.get("contextParam");
        //region 获取参数
        String pftaskid = String.valueOf(contextParamMap.get("PFTASKID"));
        String ifrollback = String.valueOf(contextParamMap.get("IFROLLBACK"));
        String billid = String.valueOf(contextParamMap.get("BILLID"));
        String approvebacktotasktype = String.valueOf(contextParamMap.get("APPROVEBACKTOTASKTYPE"));
        String targetprocessnode = String.valueOf(contextParamMap.get("TARGETPROCESSNODE"));  //退回的到的参数

        String qxhjbh = String.valueOf(contextParamMap.get("QXHJBH"));                  //前序环节编号
        String qxhjname = String.valueOf(contextParamMap.get("QXHJ"));              //前序环节名称
        String approveopinion = String.valueOf(contextParamMap.get("APPROVEOPINION"));  //审批意见
        if("null".equals(String.valueOf(approveopinion)) || "NULL".equals(String.valueOf(approveopinion))){
            approveopinion ="";
        }
        String dqhjName = String.valueOf(contextParamMap.get("DQHJ"));               //当前环节名称
        String dqhjbh = String.valueOf(contextParamMap.get("DQHJBH"));                   //当前环节编号
        String nodetype = String.valueOf(contextParamMap.get("NODETYPE"));              //节点类别
        String tasktype = String.valueOf(contextParamMap.get("TASKTYPE"));              //任务类型
        String formtype = String.valueOf(contextParamMap.get("FORMTYPE"));              //任务类型
        //endregion
        String djbh = fsbzdjRepository.getDjbhByDjnm(billid);
        System.out.println("参数1："+pftaskid+"***"+ifrollback+"***"+billid+"***"+approvebacktotasktype+"***"+targetprocessnode+"***"+dqhjbh+"***"+dqhjName+"***"+approveopinion+"***"+tasktype+"***"+nodetype+"***");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("PFTASKID",pftaskid);
        map.put("DJLX",formtype);
        map.put("DJNM",billid);
        map.put("DJBH",djbh);
        map.put("OTHERINFO","单据编号："+djbh+"; 单据类型："+formtype+"。");
        map.put("YCXX",approveopinion);

        if(StringUtils.isEmpty(dqhjbh)){
            dqhjbh = String.valueOf(billInfo.get("APPROVEBACKTOTASKTYPE"));
        }
        if("ZD".equals(dqhjbh) || "STARTNODE".equals(dqhjbh)){
            dqhjName = "制单";
            dqhjbh = "ZD";
        }

        try {
            if("1".equals(ifrollback)) {  //退回
                map.put("DJZT","-1");
                map.put("DJZTSM","驳回");
                if ("STARTNODE".equals(String.valueOf(billInfo.get("DQHJBH"))) || "ZD".equals(String.valueOf(billInfo.get("DQHJBH"))) || "ZD".equals(approvebacktotasktype) || "STARTNODE".equals(approvebacktotasktype) || "ZD".equals(targetprocessnode) || "STARTNODE".equals(targetprocessnode)) {
                    dqhjbh = "ZD";
                    dqhjName = "制单";
                }
            } else if ("0".equals(ifrollback)) { //通过
                map.put("DJZT", "1");
                map.put("DJZTSM", "处理中");
                //撤回
            }
            if("CH".equals(node)){ //撤回
                if ("STARTNODE".equals(String.valueOf(billInfo.get("DQHJBH"))) || "ZD".equals(String.valueOf(billInfo.get("DQHJBH"))) || "ZD".equals(approvebacktotasktype) || "STARTNODE".equals(approvebacktotasktype) || "ZD".equals(targetprocessnode) || "STARTNODE".equals(targetprocessnode))  {
                    map.put("DJZT","0");
                    map.put("DJZTSM","制单");
                    dqhjbh = "ZD";
                    dqhjName = "制单";
                }
            }else if("WC".equals(node)){ //完成
                map.put("DJZT","2");
                map.put("DJZTSM","完成");
                dqhjbh = "WC";
                dqhjName = "完成";
                System.out.println("完成时更新状态和环节");
            }

            if("null".equals(String.valueOf(tasktype)) || "NULL".equals(String.valueOf(tasktype))){
                tasktype =dqhjbh;
            }
            if(StringUtils.isEmpty(dqhjName)&&"ZD".equals(tasktype)){
                dqhjName = "制单";
            }
            map.put("DQHJ",dqhjbh);
            map.put("DQHJMC",dqhjName);
            System.out.println("传入状态及说明:"+map.get("DJZT")+"*"+map.get("DJZTSM")+"  环节信息及说明："+map.get("DQHJ")+"*"+map.get("DQHJMC"));
            System.out.println("参数2："+pftaskid+"***"+ifrollback+"***"+billid+"***"+approvebacktotasktype+"***"+targetprocessnode+"***"+dqhjbh+"***"+dqhjName+"***"+approveopinion+"***"+tasktype+"***"+nodetype+"***");

            internalApiJZ.updatePfrutasks(map);
        } catch (RuntimeException ex) {
            resultRet.setResult(false);
            resultRet.setMessage("更新单据状态和环节失败"+ ex.toString());
            return resultRet;
        }

        resultRet.setResult(true); ;
        logger.info("更新单据状态环节结束");
        System.out.println("更新单据状态环节结束");
        return  resultRet;

    }



}
