package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.awt.print.PrinterGraphics;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: sun mingzhi
 * Date:  2019/10/1 11:15
 * Company: Inspur
 */
public class JZBFExchangeRateValueVo {
    /**
     * 汇率ID
     */
    public String id;
    /**
     *  文本
     */
    public String parentid;
    /**
     *汇率
     */
    public Double exchangertevalue;
    /**
     * 折算币ID
     */
    public String convertcurrency;
    /**
     * 折算币编号
     */
    public String convertcurrency_code;
    /**
     * 折算币名称
     */
    public String convertcurrency_name;
    /**
     *原币Id
     */
    public String originalcurrency;
    /**
     *原币编号
     */
    public String originalcurrency_code;
    /**
     *原币名称
     */
    public String originalcurrency_name;
    /**
     *是否启用
     */
    public String state_isenabled;
    /**
     * 汇率类型
     */
    public String ratetype;
    /**
     *开始时间
     */
    public Date starttime;
    /**
     *结束时间
     */
    public Date endtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public Double getExchangertevalue() {
        return exchangertevalue;
    }

    public void setExchangertevalue(Double exchangertevalue) {
        this.exchangertevalue = exchangertevalue;
    }

    public String getConvertcurrency() {
        return convertcurrency;
    }

    public void setConvertcurrency(String convertcurrency) {
        this.convertcurrency = convertcurrency;
    }

    public String getConvertcurrency_code() {
        return convertcurrency_code;
    }

    public void setConvertcurrency_code(String convertcurrency_code) {
        this.convertcurrency_code = convertcurrency_code;
    }

    public String getConvertcurrency_name() {
        return convertcurrency_name;
    }

    public void setConvertcurrency_name(String convertcurrency_name) {
        this.convertcurrency_name = convertcurrency_name;
    }

    public String getOriginalcurrency() {
        return originalcurrency;
    }

    public void setOriginalcurrency(String originalcurrency) {
        this.originalcurrency = originalcurrency;
    }

    public String getOriginalcurrency_code() {
        return originalcurrency_code;
    }

    public void setOriginalcurrency_code(String originalcurrency_code) {
        this.originalcurrency_code = originalcurrency_code;
    }

    public String getOriginalcurrency_name() {
        return originalcurrency_name;
    }

    public void setOriginalcurrency_name(String originalcurrency_name) {
        this.originalcurrency_name = originalcurrency_name;
    }

    public String getState_isenabled() {
        return state_isenabled;
    }

    public void setState_isenabled(String state_isenabled) {
        this.state_isenabled = state_isenabled;
    }

    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "BFExchangeRateValueVo{" +
                "id='" + id + '\'' +
                ", parentid='" + parentid + '\'' +
                ", exchangertevalue=" + exchangertevalue +
                ", convertcurrency='" + convertcurrency + '\'' +
                ", convertcurrency_code='" + convertcurrency_code + '\'' +
                ", convertcurrency_name='" + convertcurrency_name + '\'' +
                ", originalcurrency='" + originalcurrency + '\'' +
                ", originalcurrency_code='" + originalcurrency_code + '\'' +
                ", originalcurrency_name='" + originalcurrency_name + '\'' +
                ", state_isenabled='" + state_isenabled + '\'' +
                ", ratetype='" + ratetype + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                '}';
    }
}
