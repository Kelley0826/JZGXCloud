package com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dxjjcs;

import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs.DXJJCSProcessApi;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dxjjcs.DXJJCSProcessService;
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
public class DXJJCSProcessImpl implements DXJJCSProcessApi {
    @Autowired
    private DXJJCSProcessService dxjjcsprocessservice;

    /**
      * 初审   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeCS(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.tirggerNodeBeforeCS(billInfo);
    }

    /**
      * 初审   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeCS(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.tirggerNodeCS(billInfo);
    }

    /**
      * 初审   通过前
      */
    @Override
    public ResultRet firstAuditPassBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.firstAuditPassBefore(billInfo);
    }

    /**
      * 初审   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        resultRet = dxjjcsprocessservice.firstAuditPass(billInfo);
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
        return dxjjcsprocessservice.firstAuditPassAfter(billInfo);
    }

    /**
      * 初审   退回前
      */
    @Override
    public ResultRet firstAuditBackBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.firstAuditBackBefore(billInfo);
    }

    /**
      * 初审   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.firstAuditBack(billInfo);
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
        return dxjjcsprocessservice.firstAuditBackAfter(billInfo);
    }

    /**
      * 初审   撤回审批前
      */
    @Override
    public ResultRet firstAuditCHBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.firstAuditCHBefore(billInfo);
    }

    /**
      * 初审   撤回审批
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet firstAuditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.firstAuditCH(billInfo);
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
        return dxjjcsprocessservice.firstAuditCHAfter(billInfo);
    }


    /**
      * 稽核   触发节点前事件
      */
    @Override
    public ResultRet tirggerNodeBeforeJH(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.tirggerNodeBeforeJH(billInfo);
    }

    /**
      * 稽核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeJH(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.tirggerNodeJH(billInfo);
    }

    /**
      * 稽核   通过前
      */
    @Override
    public ResultRet auditPassBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.auditPassBefore(billInfo);
    }

    /**
      * 稽核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.auditPass(billInfo);
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
        return dxjjcsprocessservice.auditPassAfter(billInfo);
    }

    /**
      * 稽核   退回前
      */
    @Override
    public ResultRet auditBackBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.auditBackBefore(billInfo);
    }

    /**
      * 稽核   退回
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.auditBack(billInfo);
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
        return dxjjcsprocessservice.auditBackAfter(billInfo);
    }

    /**
      * 稽核   取消稽核前
      */
    @Override
    public ResultRet auditCHBefore(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.auditCHBefore(billInfo);
    }

    /**
      * 稽核   取消稽核
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet auditCH(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.auditCH(billInfo);
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
        resultRet = dxjjcsprocessservice.auditCHAfter(billInfo);
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
        return dxjjcsprocessservice.tirggerNodeBeforeFH(billInfo);
    }

    /**
      * 复核   触发节点事件
      */
    @Override
    public ResultRet tirggerNodeFH(Map<String, Object> billInfo) {
        return dxjjcsprocessservice.tirggerNodeFH(billInfo);
    }


    /**
      * 复核   通过前
      */
    @Override
    public ResultRet recheckPassBefore(Map<String, Object> billInfo) {
        return   dxjjcsprocessservice.recheckPassBefore(billInfo);
    }

    /**
      * 复核   通过
      */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckPass(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.recheckPass(billInfo);
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
        return   dxjjcsprocessservice.recheckPassAfter(billInfo);
    }

    /**
      * 复核   退回前
      */
    @Override
    public ResultRet recheckBackBefore(Map<String, Object> billInfo) {
        return  dxjjcsprocessservice.recheckBackBefore(billInfo);
    }

    /**
      * 复核   退回
      */

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultRet recheckBack(Map<String, Object> billInfo) {
        ResultRet resultRet = new ResultRet();
        resultRet = dxjjcsprocessservice.recheckBack(billInfo);
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
        return dxjjcsprocessservice.recheckBackAfter(billInfo);
    }

    /**
     * 完成
     */
    @Override
    public ResultRet accomplish(Map<String, Object> data) {
        return dxjjcsprocessservice.accomplish(data);
    }



}
