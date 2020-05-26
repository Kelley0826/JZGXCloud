package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;


/**
 * 预算归集
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBBudgetDataTallyInVO implements Serializable {

    /**
     * 单据ID
     */
    private String BillID;

    /**
     * 单据编号
     */
    private String BillCode;

    /**
     * 单据操作
     */
    private String BillOp;

    /**
     * 单据类型ID
     */
    private String BillType;

    /**
     * 单位编号、组织ID
     */
    private String OrgCode;

    /**
     * guid唯一码，与控制检查ControlCheck传入值要一致
     */
    private String GUID;

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String billID) {
        BillID = billID;
    }

    public String getBillCode() {
        return BillCode;
    }

    public void setBillCode(String billCode) {
        BillCode = billCode;
    }

    public String getBillOp() {
        return BillOp;
    }

    public void setBillOp(String billOp) {
        BillOp = billOp;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String orgCode) {
        OrgCode = orgCode;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    @Override
    public String toString() {
        return "TBBudgetDataTallyInVO{" +
                "BillID='" + BillID + '\'' +
                ", BillCode='" + BillCode + '\'' +
                ", BillOp='" + BillOp + '\'' +
                ", BillType='" + BillType + '\'' +
                ", OrgCode='" + OrgCode + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
