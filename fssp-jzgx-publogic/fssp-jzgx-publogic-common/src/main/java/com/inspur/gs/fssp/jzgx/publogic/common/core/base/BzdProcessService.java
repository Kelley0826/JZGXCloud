package com.inspur.gs.fssp.jzgx.publogic.common.core.base;

import com.inspur.gs.fssp.jzgx.data.repository.cbyw.BzzxdsjjRepository;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.inspur.gs.fssp.jzgx.data.repository.pub.FsbzdjRepository;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 报账单公共流程处理
 */

@Service
public class BzdProcessService {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(BzdProcessService.class);
    @Autowired
    @Qualifier("internalApiJZ")
    private InternalApiJZ internalApiJZ;
    @Autowired
    private FsbzdjRepository fsbzdjRepository;
    @Autowired
    private BzdZDService bzdZDService;

    /**
     *  初审 触发节点前事件
     */
    public ResultRet tirggerNodeBeforeCS(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
     *  初审 触发节点事件
     */
    public ResultRet tirggerNodeCS(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
     * 初审通过前     处理所有单据调流程之前的逻辑
     */
    public ResultRet firstAuditPassBefore(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
 /*       try {
            resultInfo = internalApiJZ.approvePassBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("初审通过前异常，请联系管理员处理" + ex.toString());
            logger.error("初审通过前异常" + ex.toString());
        }

  */
        return resultInfo;

    }

    /**
     * 初审通过       不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet firstAuditPass(Map<String, Object> billInfo) {
        logger.info("初审通过开始");
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approvePassBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approvePass(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("初审通过异常，请联系管理员处理" + ex.toString());
            logger.error("初审通过异常" + ex.toString());
        }
        logger.info("初审通过结束");
        return resultInfo;

    }

    /**
     * 初审通过后       处理所有单据调流程之后的逻辑
     */
    public ResultRet firstAuditPassAfter(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        return resultInfo;
    }

    /**
     * 初审退回前      处理所有单据调流程之前的逻辑
     */
    public ResultRet firstAuditBackBefore(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
/*        try {
            resultInfo = internalApiJZ.approveBackBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("初审退回前异常，请联系管理员处理" + ex.toString());
            logger.error("初审退回前异常" + ex.toString());
        }

 */
        return resultInfo;

    }

    /**
     * 初审退回       不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet firstAuditBack(Map<String, Object> billInfo) {
        logger.info("初审退回开始");
        ResultRet resultInfo = new ResultRet();
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approveBackBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approveBack(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("初审退回异常，请联系管理员处理" + ex.toString());
            logger.error("初审退回异常" + ex.toString());
        }
        logger.info("初审退回结束");
        return resultInfo;
    }

    /**
     * 初审退回后       处理所有单据调流程之后的逻辑
     */
    public ResultRet firstAuditBackAfter(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     * 撤回审批前         处理所有单据调流程之前的逻辑
     */
    public ResultRet firstAuditCHBefore(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
     * 初审 撤回审批       不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet firstAuditCH(Map<String, Object> billInfo) {
        logger.info("初审撤回开始");
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo =  internalApiJZ.retractApprove(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = firstAuditCHAfter(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("初审撤回异常，请联系管理员处理" + ex.toString());
            logger.error("初审撤回异常" + ex.toString());
        }
        logger.info("初审撤回结束");
        return resultInfo;
    }

    /**
     * 初审 撤回审批后         处理所有单据调流程之后的逻辑
     */
    public ResultRet firstAuditCHAfter(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();

        String billid = String.valueOf(billInfo.get("BILLID"));

        try {

        }catch(RuntimeException ex){
            resultInfo.setResult(false);
            resultInfo.setMessage("更新单据状态失败"+ex.toString());//更新单据状态失败
            return resultInfo;
        }
        resultInfo.setResult(true); ;
        return  resultInfo;
    }


    /**
      * 稽核 触发节点前事件
      */
    public ResultRet tirggerNodeBeforeJH(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
      * 稽核 触发节点事件
      */
    public ResultRet tirggerNodeJH(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
//        resultInfo = JZGXBaseService.updateBillStatus(billInfo);
        return resultInfo;
    }

    /**
     * 稽核通过前     处理所有单据调流程之前的逻辑
     */
    public ResultRet auditPassBefore(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
 /*       try {
            resultInfo = internalApiJZ.approvePassBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核通过前异常，请联系管理员处理" + ex.toString());
            logger.error("稽核通过前异常" + ex.toString());
        }

  */
        return resultInfo;
    }

    /**
     * 稽核通过       不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet auditPass(Map<String, Object> billInfo)
    {
        logger.info("稽核通过开始");
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approvePassBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approvePass(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核通过异常，请联系管理员处理" + ex.toString());
            logger.error("稽核通过异常" + ex.toString());
        }
        logger.info("稽核通过结束");
        return resultInfo;
    }

    /**
     * 稽核通过后     处理所有单据调流程之后的逻辑
     */
    public ResultRet auditPassAfter(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        return resultInfo;
    }

    /**
     * 稽核退回前      处理所有单据调流程之前的逻辑
     */
    public ResultRet auditBackBefore(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
/*        try {
            resultInfo = internalApiJZ.approveBackBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核退回前异常，请联系管理员处理" + ex.toString());
            logger.error("稽核退回前退回异常" + ex.toString());
        }

 */
        return resultInfo;
    }

    /**
     * 稽核退回     不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet auditBack(Map<String, Object> billInfo)
    {
        logger.info("稽核退回开始");
        ResultRet resultInfo = new ResultRet();
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approveBackBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approveBack(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核退回异常，请联系管理员处理" + ex.toString());
            logger.error("稽核退回异常" + ex.toString());
        }

        logger.info("稽核退回结束");
        return resultInfo;
    }

    /**
     * 稽核退回后      处理所有单据调流程之后的逻辑
     */
    public ResultRet auditBackAfter(Map<String, Object> billInfo)
    {
        ResultRet result = new ResultRet();
        result.setResult(true);
        return result;
    }

    /**
     * 稽核   撤回前        处理所有单据调流程之前的逻辑
     */
    public ResultRet auditCHBefore(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
     * 稽核  撤回      不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet auditCH(Map<String, Object> billInfo) {
        logger.info("稽核撤回开始");
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo =  internalApiJZ.retractApprove(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = firstAuditCHAfter(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核撤回异常，请联系管理员处理" + ex.toString());
            logger.error("稽核撤回异常" + ex.toString());
        }
        logger.info("稽核撤回结束");
        return resultInfo;
    }

    /**
     * 稽核 撤回审批后         处理所有单据调流程之后的逻辑
     */
    public ResultRet auditCHAfter(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();

        String billid = String.valueOf(billInfo.get("BILLID"));

        try {
            //          resultInfo = JZGXBaseService.updateBillStatusAndHJ(billInfo);
        }catch(RuntimeException ex){
            resultInfo.setResult(false);
            resultInfo.setMessage("稽核撤回失败"+ex.toString());
            return resultInfo;
        }
        resultInfo.setResult(true); ;
        return  resultInfo;
    }


    /**
      * 复核 触发节点前事件
      */
    public ResultRet tirggerNodeBeforeFH(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);

        return resultInfo;
    }

    /**
      * 复核 触发节点事件
      */
    public ResultRet tirggerNodeFH(Map<String, Object> billInfo) {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
//        resultInfo = JZGXBaseService.updateBillStatus(billInfo);
        return resultInfo;
    }

    /**
     * 复核通过前     处理所有单据调流程之前的逻辑
     */
    public ResultRet recheckPassBefore(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
 /*       try {
            resultInfo = internalApiJZ.approvePassBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("复核通过前异常，请联系管理员处理" + ex.toString());
            logger.error("复核通过前异常" + ex.toString());
        }

  */
        return resultInfo;
    }

    /**
     * 复核通过       不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet recheckPass(Map<String, Object> billInfo)
    {
        logger.info("复核通过开始");
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approvePassBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approvePass(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("复核通过异常，请联系管理员处理" + ex.toString());
            logger.error("复核通过异常" + ex.toString());
        }
        logger.info("复核通过结束");
        return resultInfo;
    }

    /**
     * 复核通过后     处理所有单据调流程之后的逻辑
     */
    public ResultRet recheckPassAfter(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        return resultInfo;
    }

    /**
     * 复核退回前      处理所有单据调流程之前的逻辑
     */
    public ResultRet recheckBackBefore(Map<String, Object> billInfo)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
 /*       try {
            resultInfo = internalApiJZ.approveBackBefore(billInfo);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("复核退回前异常，请联系管理员处理" + ex.toString());
            logger.error("复核退回前退回异常" + ex.toString());
        }

  */
        return resultInfo;
    }

    /**
     * 复核退回     不允许增加逻辑 （单据、共享调用此方法）
     */
    public ResultRet recheckBack(Map<String, Object> billInfo)
    {
        logger.info("复核退回开始");
        System.out.println("复核退回开始");
        ResultRet resultInfo = new ResultRet();
        try {
            Map<String, Object> map = bzdZDService.getProcessMap((HashMap<String, Object>) billInfo);
            resultInfo = internalApiJZ.approveBackBefore(map);
            if(!resultInfo.isResult()){
                return resultInfo;
            }
            resultInfo = internalApiJZ.approveBack(map);
        } catch (RuntimeException ex) {
            resultInfo.setResult(false);
            resultInfo.setMessage("复核退回异常，请联系管理员处理" + ex.toString());
            logger.error("复核退回异常" + ex.toString());
            System.out.println("复核退回异常："+ex.toString());
        }
        logger.info("复核退回结束");
        System.out.println("复核退回结束");
        return resultInfo;
    }

    /**
     * 复核退回后      处理所有单据调流程之后的逻辑
     */
    public ResultRet recheckBackAfter(Map<String, Object> billInfo)
    {
        ResultRet result = new ResultRet();
        result.setResult(true);
        return result;
    }



    /**
     * 完成
     */
    public ResultRet accomplish(Map<String, Object> data)
    {
        logger.info("完成调用开始"+data);
        logger.info("完成调用开始"+data.toString());
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        try {
  //          resultInfo = JZGXBaseService.updateBillStatusAndHJ(data);
        }catch(RuntimeException ex){
            resultInfo.setResult(false);
            resultInfo.setValue("更新单据状态失败，请联系管理员处理");
        }
        logger.info("完成调用结束");
        return resultInfo;
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
        if(StringUtils.isEmpty(approveopinion)) {
            approveopinion = "无";
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("PFTASKID",pftaskid);
        map.put("DJLX",formtype);
        map.put("DJNM",billid);
        map.put("DJBH",djbh);
        map.put("OTHERINFO",approveopinion);

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

    /**
     * 更新业务单据状态
     */
    public ResultRet updateYWState(Map<String, Object> billInfo){
        logger.info("更新单据状态环节开始");
        ResultRet resultRet = new ResultRet();
        Map<String, Object> contextParamMap = (Map<String, Object>)billInfo.get("contextParam");

        resultRet.setResult(true); ;
        logger.info("更新单据状态环节结束");
        return  resultRet;

    }



}
