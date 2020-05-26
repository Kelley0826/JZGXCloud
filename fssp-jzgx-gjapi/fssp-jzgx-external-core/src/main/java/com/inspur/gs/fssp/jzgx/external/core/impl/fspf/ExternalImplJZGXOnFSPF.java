package com.inspur.gs.fssp.jzgx.external.core.impl.fspf;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.external.api.fspf.ExternalApiJZGXOnFSPF;
import com.inspur.gs.fssp.jzgx.external.core.service.fspf.ExternalServiceJZGXOnFSPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;


@Service
@Primary
public class ExternalImplJZGXOnFSPF implements ExternalApiJZGXOnFSPF {
    private static ExternalImplJZGXOnFSPF externalImplJZGXOnFSPF;
    public ExternalImplJZGXOnFSPF(){}
    @PostConstruct
    public void init(){
        externalImplJZGXOnFSPF = this;
    }

    @Autowired
    private ExternalServiceJZGXOnFSPF externalServiceJZGXOnFSPF;
    /**
     * 触发节点事件前
     */
    @Override
    public ResultRet tirggerNodeBefore(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.tirggerNodeBefore(data);
    }
    /**
     * 触发节点事件
     */
    @Override
    public ResultRet tirggerNode(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.tirggerNode(data);
    }

    /**
     * 提交前
     */
    @Override
    public ResultRet submitApproveBefore(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.submitApproveBefore(data);
    }
    /**
     * 提交
     */
    @Override
    public ResultRet submitApprove(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.submitApprove(data);
    }

    /**
     * 通过前检查
     */
    @Override
    public ResultRet approvePassBefore(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.approvePassBefore(data);
    }

    /**
     * 通过
     */
    @Override
    public ResultRet approvePass(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.approvePass(data);
    }

    /**
     * 退回前检查
     */
    @Override
    public ResultRet approveBackBefore(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.approveBackBefore(data);
    }

    /**
     * 退回
     */
    @Override
    public ResultRet approveBack(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.approveBack(data);
    }

    /**
     * 撤回前检查
     */
    @Override
    public ResultRet retractBefore(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.retractBefore(data);
    }

    /**
     * 撤回
     */
    @Override
    public ResultRet retract(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.retract(data);
    }

    /**
     * 更新单据状态
     */
    @Override
    public ResultRet updateState(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.updateState(data);
    }

    /**
     * 联查单据
     */
    @Override
    public ResultRet billView(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.billView(data);
    }
    /**
     * 单据完成后处理
     */
    @Override
    public ResultRet wflowfinish(Map<String, Object> data) {
        return externalImplJZGXOnFSPF.externalServiceJZGXOnFSPF.wflowfinish(data);
    }




}
