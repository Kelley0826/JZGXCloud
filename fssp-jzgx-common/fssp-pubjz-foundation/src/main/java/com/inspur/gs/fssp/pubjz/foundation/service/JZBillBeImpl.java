package com.inspur.gs.fssp.pubjz.foundation.service;

import com.inspur.gs.fssp.pubjz.foundation.api.JZBillBeApi;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSROFormTypeSetDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZFSRoformywclassDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.foundation.repository.JZFSROFormTypeSetRepository;
import com.inspur.gs.fssp.pubjz.foundation.repository.JZFSRoformywclassRepository;
import com.inspur.gs.fssp.pubjz.common.service.JZIdpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * @Author tangchm01
 * @Date 2020/2/11 9:58
 * @Version 1.0
 */
@Service
@Primary
public class JZBillBeImpl implements JZBillBeApi {

    @Autowired
    private JZFSRoformywclassRepository JZFSRoformywclassRepository;
    @Autowired
    private JZFSROFormTypeSetRepository JZFSROFormTypeSetRepository;
    @Autowired
    private JZIdpService JZIdpService;

    /**
     *   只需要 First  和second ，second 可以为空
     * @param params  Formclasscode 表单分类   Formywclasscode 表单业务分类
     *                    First  第一维度    Second 第二维度
     * @return
     */
    @Override
    public ResultRet getBeByBillclassAndBillywclass(Map<String, Object> params) {
        ResultRet backInfo=new ResultRet();
        if(!params.containsKey("First")&&!params.containsKey("Second"))
        {
            backInfo.setResult(false);
            backInfo.setMessage("检查入参是否正确");
            return backInfo;
        }
        String  first=String.valueOf(params.get("First"));
        String  second=String.valueOf(params.get("Second"));

        try{
           Optional<JZFSROFormTypeSetDO>  fsroFormTypeSetDO= JZFSROFormTypeSetRepository.findById(first);
           if(!fsroFormTypeSetDO.isPresent())
           {
               backInfo.setResult(false);
               backInfo.setMessage("根据单据类型未获取到表单业务分类信息");
               return backInfo;
           }
//            String formywclassId =fsroFormTypeSetDO.get().getFormywclassid();
            String formywclassId ="";
            Optional<JZFSRoformywclassDO>  fsRoformywclassDO= JZFSRoformywclassRepository.findById(formywclassId);
            if(!fsroFormTypeSetDO.isPresent())
            {
                backInfo.setResult(false);
                backInfo.setMessage("未获取到BEID,请联系维护人员解决");
                return backInfo;
            }
//            String beid=String.valueOf(fsRoformywclassDO.get().getBeid());
            String beid = "";
            Map<String,String> info= JZIdpService.getCustomByDimValue(beid,first,second);
            backInfo.setResult(true);
            backInfo.setValue(info);

        }catch (Exception ex)
        {
            ex.printStackTrace();
             backInfo.setResult(false);
             backInfo.setMessage(ex.toString());
             return backInfo;
        }
        return backInfo;
    }

    public ResultRet getBasicBillBeByFirst(String first)
    {
        ResultRet backInfo=new ResultRet();
        Optional<JZFSROFormTypeSetDO>  fsroFormTypeSetDO= JZFSROFormTypeSetRepository.findById(first);
        if(!fsroFormTypeSetDO.isPresent())
        {
            backInfo.setResult(false);
            backInfo.setMessage("根据单据类型未获取到表单业务分类信息");
            return backInfo;
        }
//        String formywclassId =fsroFormTypeSetDO.get().getFormywclassid();
        String formywclassId ="";
        Optional<JZFSRoformywclassDO>  fsRoformywclassDO= JZFSRoformywclassRepository.findById(formywclassId);
        if(!fsroFormTypeSetDO.isPresent())
        {
            backInfo.setResult(false);
            backInfo.setMessage("未获取到BEID,请联系维护人员解决");
            return backInfo;
        }
//        String beid=String.valueOf(fsRoformywclassDO.get().getBeid());
        String beid ="";
        backInfo.setValue(beid);
        backInfo.setResult(true);
        return backInfo;
    }
}
