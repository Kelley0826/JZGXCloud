package com.inspur.gs.fssp.jzgx.external.core.impl.fssp;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.external.core.service.fssp.ExternalServiceJZGXOnFSSP;
import com.inspur.gs.fssp.jzgx.external.api.fssp.ExternalApiJZGXOnFSSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: inspur
 * Date:  2020/04/27
 * Company: Inspur
 */
@Service
@Primary
public class ExternalImplJZGXOnFSSP implements ExternalApiJZGXOnFSSP {
    @Autowired
    private ExternalServiceJZGXOnFSSP externalServiceJZGXOnFSSP;

    /**
     * 共享调用提交
     */
    @Override
    public ResultRet submit(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.submit(data);
    }

    /**
     * 共享调用提交前
     */
    @Override
    public ResultRet submitBefore(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.submitBefore(data);
    }

    /**
     * 撤回
     */
    @Override
    public ResultRet retract(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.retract(data);
    }
    /**
     * 撤回前
     */
    @Override
    public ResultRet retractbefore(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.retractbefore(data);
    }

    /**
     * 删除前
     */
    @Override
    public ResultRet deletebefore(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.deletebefore(data);
    }

    /**
     * 删除
     */
    @Override
    public ResultRet deleteBill(Map<String, Object> data) {
        return externalServiceJZGXOnFSSP.deleteBill(data);
    }

    /**
     * 联查
     */
    @Override
    public ResultRet billView(Map<String, Object> data){return externalServiceJZGXOnFSSP.billView(data);}



        /*
    @Override
    public ResultRet getUrl(HashMap<String, Object> info) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(false);
        String djywlx = String.valueOf(info.get("DJYWLX"));
        //校验参数
        resultRet = externalServiceJZGXOnFSSP.checkParams(info);
        if(!resultRet.isResult()){
            return resultRet;
        }
        //获取url
        if(ROBillYWLXDO.FSROBX.equals(djywlx)){
            return externalServiceJZGXOnFSSP.getUrl4BX(info);
        }else if(ROBillYWLXDO.FSROJK.equals(djywlx)){
            return externalServiceJZGXOnFSSP.getUrl4JK(info);
        }else if(ROBillYWLXDO.FSROSQ.equals(djywlx)){
            return externalServiceJZGXOnFSSP.getUrl4SQ(info);
        }else if(ROBillYWLXDO.FSROHK.equals(djywlx)){
            return externalServiceJZGXOnFSSP.getUrl4HK(info);
        }else{
            resultRet.setResult(false);
            resultRet.setMessage("不存在此单据业务类型");
        }
        return resultRet;
    }
*/









}
