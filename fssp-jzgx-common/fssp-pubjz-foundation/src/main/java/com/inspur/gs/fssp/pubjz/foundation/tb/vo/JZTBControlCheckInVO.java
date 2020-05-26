package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 控制检查
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBControlCheckInVO implements Serializable {

    /**
     * 单据ID
     */
    private String BillID;

    /**
     * 当前单据数据（数据格式为获取数据格式GetControlDataStruct方法返回的格式的集合）
     */
    private List<Map<String, Object>> BillData;

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
     * 模式（值传1即可
     */
    private String Mode;

    /**
     * 是否控制
     */
    private String IfControl;

    /**
     * guid唯一码
     */
    private String GUID;

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String billID) {
        BillID = billID;
    }

    public List<Map<String, Object>> getBillData() {
        return BillData;
    }

    public void setBillData(List<Map<String, Object>> billData) {
        BillData = billData;
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

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public String getIfControl() {
        return IfControl;
    }

    public void setIfControl(String ifControl) {
        IfControl = ifControl;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    @Override
    public String toString() {
        return "TBControlCheckInVO{" +
                "BillID='" + BillID + '\'' +
                ", BillData='" + BillData + '\'' +
                ", BillOp='" + BillOp + '\'' +
                ", BillType='" + BillType + '\'' +
                ", OrgCode='" + OrgCode + '\'' +
                ", Mode='" + Mode + '\'' +
                ", IfControl='" + IfControl + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
