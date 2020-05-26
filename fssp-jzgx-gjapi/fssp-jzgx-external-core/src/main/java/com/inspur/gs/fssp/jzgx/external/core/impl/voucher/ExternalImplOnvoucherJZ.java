package com.inspur.gs.fssp.jzgx.external.core.impl.voucher;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.foundation.utils.annotation.JZFSSPOutLogger;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.jzgx.external.api.voucher.ExternalApiOnVoucherJZ;
import com.inspur.gs.fssp.jzgx.external.core.service.voucher.ExternalServiceOnvoucherJZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @author inspur
 * @since version 1.0.1
 */
@Service
@RestController
@Primary
public class ExternalImplOnvoucherJZ implements ExternalApiOnVoucherJZ {
    @Autowired
    ExternalServiceOnvoucherJZ externalServiceOnvoucherJZ;
    private  static ExternalImplOnvoucherJZ externalImplOnvoucher;
    public ExternalImplOnvoucherJZ(){};
    @PostConstruct
    public void init(){
        externalImplOnvoucher =this;
    }
    @Override
    @JZFSSPOutLogger(description="凭证回写RO")
    public ResultRet roVoucherWriteBack(String stringMap) {
        Map objectMap= JZFSSPJSONSerializer.deserialize(stringMap,Map.class);
        ResultRet backInfo = new ResultRet();
        if (objectMap == null) {
            backInfo.setResult(false);
            backInfo.setMessage("未传递信息");
            backInfo.setCode(0);
            return backInfo;
        }
        try {

            List ifExist = JZFSSPJSONSerializer.deserialize(ifExistParam(objectMap), List.class);
            if (!CollectionUtils.isEmpty(ifExist)) {
                backInfo.setResult(false);
                backInfo.setMessage(ifExistParam(objectMap));
                backInfo.setCode(0);
                return backInfo;
            }
            String accDocID = String.valueOf(objectMap.get("AccDocID"));
            String accDocCode = "";
            String year = String.valueOf(objectMap.get("Year"));
            String accOrgID = String.valueOf(objectMap.get("AccOrgID"));
            String module=objectMap.containsKey("Module")?String.valueOf(objectMap.get("Module")): "FSROBX";
            // String dataSourceID="FSROBX";
            String businessType = String.valueOf(objectMap.get("BusinessType"));
            String accDocPeriod = String.valueOf(objectMap.get("AccDocPeriod"));
            String accDocDate = String.valueOf(objectMap.get("AccDocDate"));
            List<String> businessIDs = Arrays.asList(String.valueOf(objectMap.get("BusinessIDs")).split(","));
            if (objectMap.containsKey("AccDocCode")) {
                accDocCode = String.valueOf(objectMap.get("AccDocCode"));
            }
            if ("Save".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                return externalImplOnvoucher.externalServiceOnvoucherJZ.SaveBack(accDocID, accDocCode, year, accOrgID, module, businessType, businessIDs, accDocDate, accDocPeriod);
            }
            if ("Delete".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                //调用删除回写（含有虚拟生成 想想怎么处理）
                return externalImplOnvoucher.externalServiceOnvoucherJZ.DeleteBack(accDocID, accDocCode, year, accOrgID, module, businessType, businessIDs, accDocDate, accDocPeriod);
            }
            if ("Virtual".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                //调用虚拟生成
            }
            if ("Addition".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                //调用附加生成
            }
            if ("Cancel".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                //调用作废回写
            }
            if ("Red".equals(String.valueOf(objectMap.get("AccDocProcessType")))) {
                //调用红冲回写
            }

            backInfo.setResult(true);
            backInfo.setValue(objectMap);
            return backInfo;
        } catch (RuntimeException ex) {
            backInfo.setResult(false);
            backInfo.setMessage(ex.getMessage());
            backInfo.setValue(objectMap);
            return backInfo;
        }
    }

    /**
     * 判断回写参数是否争取不正确返回对应缺少参数信息
     * * @param  accDocDate   凭证日期
     * * @param accDocPeriod  会计期间
     */
    public String ifExistParam(Map<String, Object> map) {
        List<String> noExist = new ArrayList<>();
        if (!map.containsKey("AccDocID")) {
            noExist.add("AccDocID");
        }
        if (!map.containsKey("Year")) {
            noExist.add("Year");
        }
        if (!map.containsKey("AccOrgID")) {
            noExist.add("AccOrgID");
        }
        if (!map.containsKey("DataSourceID")) {
            noExist.add("DataSourceID");
        }
        if (!map.containsKey("BusinessType")) {
            noExist.add("BusinessType");
        }
        if (!map.containsKey("BusinessIDs")) {
            noExist.add("BusinessIDs");
        }
        if (!map.containsKey("AccDocProcessType")) {
            noExist.add("AccDocProcessType");
        }
        if (!map.containsKey("AccDocDate")) {
            noExist.add("AccDocDate");
        }
        if (!map.containsKey("AccDocPeriod")) {
            noExist.add("AccDocPeriod");
        }
        return JZFSSPJSONSerializer.serialize(noExist);
    }
}
