package com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dsjj;

import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjj.DSJJProcessApi;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dsjj.DSJJProcessService;
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
public class DSJJProcessImpl implements DSJJProcessApi {
    @Autowired
    private DSJJProcessService dsjjprocessservice;

    /**
      * 初审   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeCS(Map<String, Object> billInfo) {
        return dsjjprocessservice.tirggerNodeBeforeCS(billInfo);
    }

    /**
      * 初审   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeCS(Map<String, Object> billInfo) {
        return dsjjprocessservice.tirggerNodeCS(billInfo);
    }

    /**
      * 初审   通过前
      */
    @Override
    public ResultRet firstAuditPassBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.firstAuditPassBefore(billInfo);
    }

    /**
      * 初审   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        resultRet = dsjjprocessservice.firstAuditPass(billInfo);
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
        return dsjjprocessservice.firstAuditPassAfter(billInfo);
    }

    /**
      * 初审   退回前
      */
    @Override
    public ResultRet firstAuditBackBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.firstAuditBackBefore(billInfo);
    }

    /**
      * 初审   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.firstAuditBack(billInfo);
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
        return dsjjprocessservice.firstAuditBackAfter(billInfo);
    }

    /**
      * 初审   撤回审批前
      */
    @Override
    public ResultRet firstAuditCHBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.firstAuditCHBefore(billInfo);
    }

    /**
      * 初审   撤回审批
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.firstAuditCH(billInfo);
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
        return dsjjprocessservice.firstAuditCHAfter(billInfo);
    }


    /**
      * 稽核   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeJH(Map<String, Object> billInfo) {
        return dsjjprocessservice.tirggerNodeBeforeJH(billInfo);
    }

    /**
      * 稽核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeJH(Map<String, Object> billInfo) {
        return dsjjprocessservice.tirggerNodeJH(billInfo);
    }

    /**
      * 稽核   通过前
      */
    @Override
    public ResultRet auditPassBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.auditPassBefore(billInfo);
    }

    /**
      * 稽核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.auditPass(billInfo);
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
        return dsjjprocessservice.auditPassAfter(billInfo);
    }

    /**
      * 稽核   退回前
      */
    @Override
    public ResultRet auditBackBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.auditBackBefore(billInfo);
    }

    /**
      * 稽核   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.auditBack(billInfo);
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
        return dsjjprocessservice.auditBackAfter(billInfo);
    }

    /**
      * 稽核   取消稽核前
      */
    @Override
    public ResultRet auditCHBefore(Map<String, Object> billInfo) {
        return dsjjprocessservice.auditCHBefore(billInfo);
    }

    /**
      * 稽核   取消稽核
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.auditCH(billInfo);
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
        resultRet = dsjjprocessservice.auditCHAfter(billInfo);
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
        return dsjjprocessservice.tirggerNodeBeforeFH(billInfo);
    }

    /**
      * 复核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeFH(Map<String, Object> billInfo) {
        return dsjjprocessservice.tirggerNodeFH(billInfo);
    }


    /**
      * 复核   通过前
      */
    @Override
    public ResultRet recheckPassBefore(Map<String, Object> billInfo) {
        return   dsjjprocessservice.recheckPassBefore(billInfo);
    }

    /**
      * 复核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.recheckPass(billInfo);
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
        return   dsjjprocessservice.recheckPassAfter(billInfo);
    }

    /**
      * 复核   退回前
      */
    @Override
    public ResultRet recheckBackBefore(Map<String, Object> billInfo) {
        return  dsjjprocessservice.recheckBackBefore(billInfo);
    }

    /**
      * 复核   退回
      */

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dsjjprocessservice.recheckBack(billInfo);
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
        return dsjjprocessservice.recheckBackAfter(billInfo);
    }

    /**
     * 完成
     */
    @Override
    public ResultRet accomplish(Map<String, Object> data) {
        return dsjjprocessservice.accomplish(data);
    }




}
