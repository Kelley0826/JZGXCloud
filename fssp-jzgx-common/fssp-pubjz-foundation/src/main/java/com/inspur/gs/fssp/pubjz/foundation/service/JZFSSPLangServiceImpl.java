package com.inspur.gs.fssp.pubjz.foundation.service;

import com.inspur.gs.fssp.pubjz.common.entity.JZFSSPLangEnum;
import com.inspur.gs.fssp.pubjz.foundation.api.JZFSSPLangServiceApi;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Primary
//@Deprecated
public class JZFSSPLangServiceImpl implements JZFSSPLangServiceApi {

    @Autowired
    private JZFSSPLangService JZFSSPLangService;

    @Override
    @Deprecated
    public ResultRet getLangMessage(Map<String, Object> params) {
        ResultRet backInfo = new ResultRet();
        backInfo.setResult(false);
        backInfo.setCode(0);
        if (!params.containsKey("resourcesID") && !params.containsKey("key")) {

            backInfo.setMessage("检查入参是否正确");
            return backInfo;
        }
        String resourecsID = String.valueOf(params.get("resourcesID"));
        String key = String.valueOf(params.get("key"));

        try {

            backInfo.setResult(true);
            backInfo.setCode(1);
            backInfo.setValue(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.valueOf(resourecsID) , key));
            backInfo.setMessage("转换成功");
        }
        catch (Exception e){
            backInfo.setResult(false);
            backInfo.setCode(0);
            backInfo.setMessage(e.toString());
            backInfo.setMessage("转换失败");
        }

        return backInfo;
    }
}
