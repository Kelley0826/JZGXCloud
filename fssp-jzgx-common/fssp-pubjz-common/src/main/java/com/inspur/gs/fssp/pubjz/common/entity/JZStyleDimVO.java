package com.inspur.gs.fssp.pubjz.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author tangchm01
 * @Date 2020/2/20 12:541
 * @Version 1.0
 */
@Data
public class JZStyleDimVO {
    public String id;
    public String styleId;
    public String firstDimValue;
    public String secondDimValue;
    public String formName;
    public String extendType;
    public int extendLevel;
    public String parentId;
    public String beId;
}
