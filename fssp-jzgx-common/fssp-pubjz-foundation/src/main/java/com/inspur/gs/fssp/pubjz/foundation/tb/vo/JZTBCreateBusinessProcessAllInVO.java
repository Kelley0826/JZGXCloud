package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建预算任务总体输入
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBCreateBusinessProcessAllInVO implements Serializable {

    //TBYWLC
    private JZTBCreateBusinessProcessYWLCInVO BillType;

    //TBDJXX
    private JZTBCreateBusinessProcessDJXXInVO BillInfo;

    //list<TBDJCZ>
    private List<JZTBCreateBusinessProcessDJCZInVO> BillOp;

    public JZTBCreateBusinessProcessYWLCInVO getBillType() {
        return BillType;
    }

    public void setBillType(JZTBCreateBusinessProcessYWLCInVO billType) {
        BillType = billType;
    }

    public JZTBCreateBusinessProcessDJXXInVO getBillInfo() {
        return BillInfo;
    }

    public void setBillInfo(JZTBCreateBusinessProcessDJXXInVO billInfo) {
        BillInfo = billInfo;
    }

    public List<JZTBCreateBusinessProcessDJCZInVO> getBillOp() {
        return BillOp;
    }

    public void setBillOp(List<JZTBCreateBusinessProcessDJCZInVO> billOp) {
        BillOp = billOp;
    }

    @Override
    public String toString() {
        return "TBCreateBusinessProcessAllInVO{" +
                "BillType=" + JZFSSPJSONSerializer.serialize(BillType) +
                ", BillInfo=" + JZFSSPJSONSerializer.serialize(BillInfo) +
                ", BillOp=" + JZFSSPJSONSerializer.serialize(BillOp) +
                '}';
    }
}
