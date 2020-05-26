package com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dxjj;

import com.inspur.gs.fssp.jzgx.data.entity.pub.PfgeformtypeEntity;
import com.inspur.gs.fssp.jzgx.publogic.common.core.base.BzdZDService;
import com.inspur.gs.fssp.pubjz.common.entity.JZFSSaveDataVO;
import com.inspur.gs.fssp.pubjz.common.entity.JZIdpTableDataVO;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.data.entity.cbyw.BzzxdsjjEntity;
import com.inspur.gs.fssp.jzgx.data.repository.cbyw.BzzxdsjjRepository;
import com.inspur.gs.fssp.jzgx.internal.api.InternalApiJZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;
import com.inspur.gs.fssp.pubjz.common.service.JZIdpService;
import java.util.*;
import com.inspur.gs.fssp.jzgx.data.repository.pub.PfgeformtypeRepository;
import com.inspur.gs.fssp.jzgx.data.entity.pub.FsbzdjEntity;
import com.inspur.gs.fssp.jzgx.data.repository.pub.FsbzdjRepository;


/**
  * 基类对上计价单 制单节点,处理操作：编辑、取消、保存、删除、提交、撤回
  */
@Service
public class DXJJZDService extends BzdZDService {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(DXJJZDService.class);
    @Autowired
    private InternalApiJZ internalApiJZ;
    @Autowired
    private BzzxdsjjRepository bzzxdsjjRepository;
    @Autowired
    private JZIdpService JZIdpService;
    @Autowired
    private PfgeformtypeRepository pfgeformtypeRepository;
    @Autowired
    private FsbzdjRepository fsbzdjRepository;

    /**
     * 保存
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet saveBill(JZFSSaveDataVO saveData) {
        ResultRet ret = new ResultRet();
        logger.info("保存单据开始");
        System.out.println("保存单据开始");
        String gnid = null;
        String pftaskid = saveData.pftaskid;
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
        System.out.println("保存业务单据");
        Object obj = JZIdpService.SaveData(saveData);
        String bh = bzzxdsjjRepository.getDjbhByNm(String.valueOf(bzzxdsjj.get("DSJJ_DJNM")));
        bzzxdsjj.put("DSJJ_DJBH",bh);
        //共享保存
        System.out.println(bzzxdsjj.get("DSJJ_DJBH"));
        ResultRet retSaveBZDJ = saveFSBZDJ(bzzxdsjj,gnid,pftaskid);
        if(retSaveBZDJ.getCode()==0){
            retSaveBZDJ.setResult(false);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return retSaveBZDJ;
        }
        //其他保存数据处理
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

    /**
     * 保存单据信息进共享表
     */
    public ResultRet saveFSBZDJ(Map<String,Object> saveData, String gnid, String pftaskid){
        ResultRet ret = new ResultRet();
        logger.info("保存进共享开始");
        System.out.println("保存进共享开始");
        String dqhj="ZD",dqhjmc="制单",djzt="0",djztsm="制单";
        FsbzdjEntity billInfo = new FsbzdjEntity();
        billInfo = fsbzdjRepository.getAllInfoByNM(String.valueOf(saveData.get("DSJJ_DJNM")));
        Map<String,Object> fsbzdjMap = new HashMap<String,Object>();
        System.out.println("获取单据信息："+billInfo);
        fsbzdjMap.put("DJRQ",saveData.get("DSJJ_RQ"));
        System.out.println("卡片日期："+fsbzdjMap.get("DJRQ"));
        if(billInfo!=null){
            fsbzdjMap.put("DJRQ",billInfo.getFsbzdjDjrq());
            System.out.println("列表日期："+fsbzdjMap.get("DJRQ"));
            dqhj = billInfo.getFsbzdjDqhj();
            dqhjmc = billInfo.getFsbzdjDqhjmc();
            djzt = billInfo.getFsbzdjDjzt();
            djztsm = billInfo.getFsbzdjZtsm();
            System.out.println("参数信息： "+dqhj+"*"+dqhjmc+"*"+djzt+"*"+djztsm);
            if(djzt.equals("-1") && !dqhj.equals("ZD")){
                djzt = "1";
                djztsm = "处理中";
            }else if(djzt.equals("-1") && dqhj.equals("ZD")){
                djzt = "0";
                djztsm = "制单";
            }
        }
        System.out.println("参数信息： "+dqhj+"*"+dqhjmc+"*"+djzt+"*"+djztsm);

        fsbzdjMap.put("PFTASKID",pftaskid);
        fsbzdjMap.put("DJLX",saveData.get("BZDLX"));
        fsbzdjMap.put("DJNM",saveData.get("DSJJ_DJNM"));
        fsbzdjMap.put("DJBH",saveData.get("DSJJ_DJBH"));
        fsbzdjMap.put("OTHERINFO",saveData.get("DSJJ_ZY"));
        fsbzdjMap.put("DWNM",saveData.get("DSJJ_DWID"));
        fsbzdjMap.put("DJRQ",saveData.get("DSJJ_RQ").toString()+" 00:00:00");//new Date());
        fsbzdjMap.put("DWBH",saveData.get("DSJJ_DWBH"));
        fsbzdjMap.put("USERID",saveData.get("DSJJ_USERID"));
        fsbzdjMap.put("USER",saveData.get("DSJJ_USERNAME"));
        fsbzdjMap.put("DJYWLX","JZDSJJ");
        fsbzdjMap.put("DJZT",djzt);//单据状态
        fsbzdjMap.put("DJZTSM",djztsm);//单据状态说明
        fsbzdjMap.put("USERXYZH",saveData.get("DSJJ_USERCODE"));
        fsbzdjMap.put("ZY",saveData.get("DSJJ_ZY"));
        fsbzdjMap.put("WBBH",saveData.get("DSJJ_BZBH"));
        fsbzdjMap.put("WBMC",saveData.get("DSJJ_BZMC"));
        fsbzdjMap.put("JE",saveData.get("DSJJ_DQJLJE"));
        fsbzdjMap.put("JSJE",saveData.get("DSJJ_DQJLJE"));
        fsbzdjMap.put("FSSC","");
        fsbzdjMap.put("BMID",saveData.get("DSJJ_BMID"));
        fsbzdjMap.put("BXR",saveData.get("DSJJ_USERID"));
        fsbzdjMap.put("BXRMC",saveData.get("DSJJ_USERNAME"));
        fsbzdjMap.put("BXRDWBH",saveData.get("DSJJ_DWBH"));
        fsbzdjMap.put("BXRDWNM",saveData.get("DSJJ_DWID"));
        fsbzdjMap.put("BXRBMID",saveData.get("DSJJ_BMID"));
        fsbzdjMap.put("DQHJ",dqhj);
        fsbzdjMap.put("DQHJMC",dqhjmc);
        ret = internalApiJZ.updatePfrutasks(fsbzdjMap);

        System.out.println("日期："+saveData.get("DSJJ_RQ").toString()+" 00:00:00");
        System.out.println("保存进共享结束");
        logger.info("保存进共享结束");
        return ret;
    }

    /**
     * 提交
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet submit(Map<String,Object> data) {
        ResultRet returnInfo = new ResultRet();
        logger.info("提交单据开始");
        System.out.println("提交单据开始");
        String billNM = String.valueOf(data.get("BILLID"));
   //     BzzxdsjjEntity billInfo = bzzxdsjjRepository.findById(billNM).get();
        //共享提交
        HashMap<String,Object> map = getProcessMap((HashMap<String, Object>) data);
        returnInfo = internalApiJZ.submitApprove(map);
        if(!returnInfo.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return returnInfo;
        }
        HashMap<String, String> ret = (HashMap<String, String>) returnInfo.getValue();
        if (ret != null && ret.containsKey("PROCESSINSTANCEID")) {
            try {
                bzzxdsjjRepository.updateLCSL(billNM, ret.get("PROCESSINSTANCEID"));
            } catch (RuntimeException ex) {
                returnInfo.setResult(false);
                returnInfo.setMessage("更新流程实例失败");
                return returnInfo;
            }
        }
        logger.info("提交单据结束");
        System.out.println("提交单据结束");
        return returnInfo;
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
            String billNM = String.valueOf(data.get("BILLID"));
      //      BzzxdsjjEntity billInfo = bzzxdsjjRepository.findById(billNM).get();
            HashMap<String,Object> map = getProcessMap((HashMap<String, Object>) data);
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
     * 删除
     */
    @Transactional(rollbackFor = Exception.class)
    public ResultRet deleteBill(Map<String, Object> data) {
        logger.info("删除单据开始");
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        String billNM = String.valueOf(data.get("BILLID"));
        BzzxdsjjEntity billInfo = bzzxdsjjRepository.getAllInfoByNM(billNM);
        if(billInfo ==null){
            resultRet.setResult(false);
            resultRet.setMessage("未获取到单据信息");
            return resultRet;
        }
        //业务单据删除
        resultRet = ywDelete(billInfo);
        if(!resultRet.isResult()){
            return resultRet;
        }
        //共享删除
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("BILLID",data.get("BILLID"));
        map.put("FORMTYPE",data.get("FORMTYPE"));
        map.put("YWLX","JZDSJJ");
        resultRet = internalApiJZ.delete(map);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return  resultRet;
        }
        logger.info("删除单据结束");
        return resultRet;
    }

    /**
      * 业务单据删除
      */
    private ResultRet ywDelete(BzzxdsjjEntity billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        //将业务表中的删除标志改成1
        return resultRet;
    }


    /**
     * 组织工作流参数
     */
 /*
    public HashMap<String,Object> getProcessMap(HashMap<String,Object> info){
        HashMap<String,Object> map = new HashMap<>();
        String billNM = String.valueOf(info.get("BILLID"));
        if(billInfo ==null){
            billInfo = bzzxdsjjRepository.findById(billNM).get();
        }
        map.put("BILLID",billInfo.getDsjjDjnm());        //单据id
        map.put("FORMTYPE",info.get("FORMTYPE"));//单据类型
        map.put("DJBH",billInfo.getDsjjDjbh());          //单据编号
        map.put("DWID",billInfo.getDsjjDwid());        //单位编号
        map.put("OTHERINFO",billInfo.getDsjjZy());     //退回原因（其他信息）

        map.put("PFTASKID",info.get("PFTASKID"));    //待办任务ID
        map.put("APPROVEOPINION",info.get("APPROVEOPINION"));
        map.put("TARGETPROCESSNODE",info.get("TARGETPROCESSNODE"));
        map.put("DQHJBH",info.get("DQHJBH"));

        return map;
    }

  */



}
