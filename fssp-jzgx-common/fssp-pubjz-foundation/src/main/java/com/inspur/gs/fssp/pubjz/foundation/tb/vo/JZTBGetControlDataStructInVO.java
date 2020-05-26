package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 获取控制数据
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBGetControlDataStructInVO implements Serializable {

    /**BFAdminOrganizationDO
     * 单据类型id
     */
    private String BillType;

    /**
     * 单据操作编号
     */
    private String BillOp;

    /**
     * 单位编号/组织ID
     */
    private String OrgCode;

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getBillOp() {
        return BillOp;
    }

    public void setBillOp(String billOp) {
        BillOp = billOp;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String orgCode) {
        OrgCode = orgCode;
    }

    @Override
    public String toString() {
        return "TBGetControlDataStructVO{" +
                "BillType='" + BillType + '\'' +
                ", BillOp='" + BillOp + '\'' +
                ", OrgCode='" + OrgCode + '\'' +
                '}';
    }
}
