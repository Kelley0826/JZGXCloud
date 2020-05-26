package com.inspur.gs.fssp.jzgx.publogic.common.core.base;

import com.inspur.gs.fssp.jzgx.data.entity.cbyw.BzzxdsjjEntity;
import com.inspur.gs.fssp.jzgx.data.entity.pub.PfgeformtypeEntity;
import com.inspur.gs.fssp.pubjz.common.entity.JZFSSaveDataVO;
import com.inspur.gs.fssp.pubjz.common.entity.JZIdpTableDataVO;
import com.inspur.gs.fssp.pubjz.common.service.JZIdpService;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;
import com.inspur.gs.fssp.jzgx.data.repository.pub.PfgeformtypeRepository;
import com.inspur.gs.fssp.jzgx.data.entity.pub.FsbzdjEntity;
import com.inspur.gs.fssp.jzgx.data.repository.pub.FsbzdjRepository;
import java.util.*;

/**
  * 基类对公单据 制单节点,处理操作：编辑、取消、保存、删除、提交、撤回
  */
@Service
public class BzdZDService {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(BzdZDService.class);
    @Autowired
    private InternalApiJZ internalApiJZ;
    @Autowired
    private JZIdpService JZIdpService;
    @Autowired
    private PfgeformtypeRepository pfgeformtypeRepository;
    @Autowired
    private FsbzdjRepository fsbzdjRepository;

    @Transactional(rollbackFor = Exception.class)
    public ResultRet saveBill(JZFSSaveDataVO saveData) {
        logger.info("保存单据开始");
        ResultRet ret = new ResultRet();
        String gnid = null;
        Map<String,Object> bzzxdsjj = new HashMap();
        Map<String, List<Map>> detailData = new HashMap();
        ret.setResult(true);
        //扩展 参数
        Map<String,Object> data = saveData.data;
        gnid = String.valueOf(data.get("gnid"));
        Iterator var3 = saveData.idpCardData.data.iterator();
        while(var3.hasNext()) {
            JZIdpTableDataVO tableData = (JZIdpTableDataVO)var3.next();
            if (tableData.isMain) {
                bzzxdsjj = tableData.data.get(0);
            }else{
                detailData.put(tableData.code, tableData.data);
            }
        }
        //保存前校验
        ResultRet retCheck = saveCheck(bzzxdsjj,detailData,gnid);
        if(!retCheck.isResult()){
            return retCheck;
        }
        //保存
        Object obj = JZIdpService.SaveData(saveData);
        logger.info("保存单据结束");
        return ret;
    }

    /**
      * 保存前校验
      */
    private ResultRet saveCheck(Map<String,Object> jzdsjj, Map<String, List<Map>> detailData, String gnid){
        ResultRet ret = new ResultRet();
        ret.setResult(true);
        //单据类型不能为空
        if(StringUtils.isEmpty(jzdsjj.get("BZDLX"))){
            ret.setResult(false);
            ret.setMessage("单据类型不能为空");
            return ret;
        }
        PfgeformtypeEntity pfgeformtypeEntity = pfgeformtypeRepository.getAllInfoByNM(String.valueOf(jzdsjj.get("BZDLX")));
        if(pfgeformtypeEntity==null){
            ret.setMessage("未查询到指定的单据类型，单据类型内码："+ jzdsjj.get("BZDLX"));
            ret.setResult(false);
            return  ret;
        }
        return ret;
    }

    /** 保存后
     * */
    public ResultRet savebillAfter(Map<String,Object> object) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     * 编辑前检查
     */
    public ResultRet checkEdit(Map<String, Object> object) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     *提交前
     */
    public ResultRet submitBefore(Map<String,Object> data){
        ResultRet returnInfo =new ResultRet();
        returnInfo.setResult(true);
        return returnInfo;
    }

    /**
     * 提交
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet submit(Map<String,Object> data) {
        logger.info("提交单据开始");

        ResultRet returnInfo = new ResultRet();
        //共享提交
        Map<String, Object> map = new HashMap<>();
        map.put("BILLID",data.get("BILLID"));
        map.put("DJBH",data.get("DJBH"));
        map.put("FORMTYPE",data.get("FORMTYPE"));
        map.put("DWID","");
        map.put("OTHERINFO","");
        returnInfo = internalApiJZ.submitApprove(map);
        if(!returnInfo.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return returnInfo;
        }
        logger.info("提交单据结束");
        return returnInfo;
    }

    /**
     * 提交后处理
     */
    public ResultRet submitAfter(Map<String,Object> data){
        ResultRet resultInfo = new ResultRet();
        resultInfo.setResult(true);
        return resultInfo;
    }

    /**
      * 撤回前
      */
    public ResultRet retractBefore(Map<String, Object> data) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }
    /**
     * 撤回
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet retract(Map<String, Object> data) {
        logger.info("撤回单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        //共享撤回
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("BILLID", data.get("BILLID"));
            map.put("PFTASKID", data.get("PFTASKID"));
            map.put("FORMTYPE", data.get("FORMTYPE"));
            map.put("APPROVEOPINION", data.get("APPROVEOPINION"));
            map.put("OTHERINFO", "");
            map.put("DQHJBH", data.get("DQHJBH"));
            map.put("DJBH", data.get("DJBH"));
            map.put("DWID", data.get("DWID"));
            resultRet = internalApiJZ.retractApprove(map);
        }
        catch (RuntimeException ex) {
            resultRet.setResult(false);
            resultRet.setMessage("制单撤回异常，请联系管理员处理" + ex.toString());
            logger.error("制单撤回异常" + ex.toString());
        }
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return  resultRet;
        }
        resultRet=retractAfter(data);
        logger.info("撤回单据结束");
        return resultRet;
    }

    /**
      * 撤回后
      */
    public ResultRet retractAfter(Map<String, Object> data) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);

        return resultRet;
    }

    /**
      * 删除前处理
      */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet deleteBillBefore (Map<String, Object> data){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     * 删除
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet deleteBill(Map<String, Object> data) {
        logger.info("删除单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        //共享删除
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("BILLID",data.get("BILLID"));
        map.put("FORMTYPE",data.get("DJNM"));
        map.put("YWLX",data.get("DJFLBH"));
        resultRet = internalApiJZ.delete(map);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return  resultRet;
        }
        logger.info("删除单据结束");
        return resultRet;
    }

    /**
      * 删除后
      */
    public ResultRet deleteBillAfter(Map<String, Object> data) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     * 联查影像
     */
    public ResultRet viewImage(String[] param)
    {
        ResultRet resultInfo = new ResultRet();
        resultInfo.setCode(1);
        resultInfo.setMessage("");
        resultInfo.setResult(true); ;
        return  resultInfo;
    }

    /**
     * 组织工作流参数
     */
    public HashMap<String,Object> getProcessMap(HashMap<String,Object> info){
        System.out.println("获取组织参数开始");
        String billNM = String.valueOf(info.get("BILLID"));
        System.out.println("单据id："+billNM);
        FsbzdjEntity billInfo = fsbzdjRepository.getAllInfoByNM(billNM);
        HashMap<String,Object> map = new HashMap<>();
        map.put("BILLID",billInfo.getFsbzdjDjnm());        //单据id
        map.put("FORMTYPE",info.get("FORMTYPE"));//单据类型
        map.put("DJBH",billInfo.getFsbzdjDjbh());          //单据编号
        map.put("DWID",billInfo.getFsbzdjDwnm());        //单位编号
        map.put("OTHERINFO",billInfo.getFsbzdjZy());     //其他信息
        map.put("PFTASKID",info.get("PFTASKID"));    //待办任务ID
        map.put("APPROVEOPINION",info.get("APPROVEOPINION"));
        map.put("TARGETPROCESSNODE",info.get("TARGETPROCESSNODE"));
        map.put("DQHJBH",info.get("DQHJBH"));

        System.out.println("参数信息： "+ billInfo+" *** "+billInfo.getFsbzdjDjbh()+"***"+billInfo.getFsbzdjDjnm());
        return map;
    }



}
