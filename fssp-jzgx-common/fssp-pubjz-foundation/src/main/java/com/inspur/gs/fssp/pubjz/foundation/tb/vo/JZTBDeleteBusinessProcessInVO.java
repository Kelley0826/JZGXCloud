package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/*
 * 删除单据类型
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBDeleteBusinessProcessInVO implements Serializable {

    /*
     * 单据类型ID
     */
    private String BillType;

    /*
     * 单据类型ID
     */
    public String getBillType() {
        return BillType;
    }
    /*
     * 单据类型ID
     */
    public void setBillType(String billType) {
        BillType = billType;
    }


    @Override
    public String toString() {
        return "TBDeleteBusinessProcessVO{" +
                "BillType='" + BillType + '\'' +
                '}';
    }


}
