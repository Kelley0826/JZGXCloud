package com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dsjjcs;

import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjjcs.DSJJCSProcessApi;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dsjjcs.DSJJCSProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Map;

/**
 * @Description:  流程处理逻辑：初审、稽核、复核、完成
 * @author: db
 * @date: 2020/5/12 17:37
 */
@Service
@Primary
public class DSJJCSProcessImpl implements DSJJCSProcessApi {
    @Autowired
    private DSJJCSProcessService dsjjcsprocessservice;

    /**
      * 初审   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeCS(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeBeforeCS(billInfo);
    }

    /**
      * 初审   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeCS(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeCS(billInfo);
    }

    /**
      * 初审   通过前
      */
    @Override
    public ResultRet firstAuditPassBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditPassBefore(billInfo);
    }

    /**
      * 初审   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        resultRet = dsjjcsprocessservice.firstAuditPass(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }


    /**
      * 初审   通过后
      */
    @Override
    public ResultRet firstAuditPassAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditPassAfter(billInfo);
    }

    /**
      * 初审   退回前
      */
    @Override
    public ResultRet firstAuditBackBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditBackBefore(billInfo);
    }

    /**
      * 初审   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.firstAuditBack(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 初审   退回后
      */
    @Override
    public ResultRet firstAuditBackAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditBackAfter(billInfo);
    }

    /**
      * 初审   撤回审批前
      */
    @Override
    public ResultRet firstAuditCHBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditCHBefore(billInfo);
    }

    /**
      * 初审   撤回审批
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.firstAuditCH(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 初审   撤回审批后
      */
    @Override
    public ResultRet firstAuditCHAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.firstAuditCHAfter(billInfo);
    }


    /**
      * 稽核   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeJH(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeBeforeJH(billInfo);
    }

    /**
      * 稽核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeJH(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeJH(billInfo);
    }

    /**
      * 稽核   通过前
      */
    @Override
    public ResultRet auditPassBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.auditPassBefore(billInfo);
    }

    /**
      * 稽核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.auditPass(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 稽核   通过后
      */
    @Override
    public ResultRet auditPassAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.auditPassAfter(billInfo);
    }

    /**
      * 稽核   退回前
      */
    @Override
    public ResultRet auditBackBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.auditBackBefore(billInfo);
    }

    /**
      * 稽核   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.auditBack(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 稽核   退回后
      */
    @Override
    public ResultRet auditBackAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.auditBackAfter(billInfo);
    }

    /**
      * 稽核   取消稽核前
      */
    @Override
    public ResultRet auditCHBefore(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.auditCHBefore(billInfo);
    }

    /**
      * 稽核   取消稽核
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.auditCH(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 稽核   取消稽核后
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditCHAfter(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.auditCHAfter(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }



    /**
      * 复核   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeFH(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeBeforeFH(billInfo);
    }

    /**
      * 复核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeFH(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.tirggerNodeFH(billInfo);
    }


    /**
      * 复核   通过前
      */
    @Override
    public ResultRet recheckPassBefore(Map<String, Object> billInfo) {
        return   dsjjcsprocessservice.recheckPassBefore(billInfo);
    }

    /**
      * 复核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.recheckPass(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 复核   通过后
      */
    @Override
    public ResultRet recheckPassAfter(Map<String, Object> billInfo) {
        return   dsjjcsprocessservice.recheckPassAfter(billInfo);
    }

    /**
      * 复核   退回前
      */
    @Override
    public ResultRet recheckBackBefore(Map<String, Object> billInfo) {
        return  dsjjcsprocessservice.recheckBackBefore(billInfo);
    }

    /**
      * 复核   退回
      */

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjcsprocessservice.recheckBack(billInfo);
        if(!resultRet.isResult()){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultRet;
    }

    /**
      * 复核   退回后
      */
    @Override
    public ResultRet recheckBackAfter(Map<String, Object> billInfo) {
        return dsjjcsprocessservice.recheckBackAfter(billInfo);
    }

    /**
     * 完成
     */
    @Override
    public ResultRet accomplish(Map<String, Object> data) {
        return dsjjcsprocessservice.accomplish(data);
    }



}
