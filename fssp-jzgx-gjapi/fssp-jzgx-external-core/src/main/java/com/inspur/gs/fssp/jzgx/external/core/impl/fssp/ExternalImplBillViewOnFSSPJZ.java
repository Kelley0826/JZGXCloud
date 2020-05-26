package com.inspur.gs.fssp.jzgx.external.core.impl.fssp;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.external.api.fssp.ExternalApiBillViewOnFSSPJZ;
import com.inspur.gs.fssp.jzgx.external.core.service.fssp.ExternalServiceJZGXOnFSSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Primary
public class ExternalImplBillViewOnFSSPJZ implements ExternalApiBillViewOnFSSPJZ {
    @Autowired
    private ExternalServiceJZGXOnFSSP externalServiceJZGXOnFSSP;

    @Override
    public ResultRet getUrl(HashMap<String, Object> info) {
        ResultRet backInfo =new ResultRet();
        if(!info.containsKey("Module"))
        {
            backInfo.setResult(false);
            backInfo.setMessage("业务分类未正常传递，Code:Module does not exist");
            return backInfo;
        }
        String module=String.valueOf(info.get("Module"));

        return  externalServiceJZGXOnFSSP.billView(info);
    }
}
