package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 汇率定义
 */

@Entity
@Data
@Table(name="bfexchangerate")
public class JZBFExchangeRateDO {

    /**
     * 内码
     */
    @Id
    private String id;

    /**
     * 内码
     */
    public String getId() {
        return id;
    }
    /**
     * 内码
     */
    public void setId(String id) {
        this.id = id;
    }
    /*
    * 折算币
    * */
    private String ConvertCurrency;
    /*
     * 折算币
     * */
    public String getConvertCurrency() {
        return ConvertCurrency;
    }
    /*
     * 折算币
     * */
    public void setConvertCurrency(String convertCurrency) {
        ConvertCurrency = convertCurrency;
    }

    /**
     * 汇率类型
     */
    private  String ExchangeRateType;
    /**
     * 汇率类型
     */
    public String getExchangeRateType() {
        return ExchangeRateType;
    }
    /**
     * 汇率类型
     */
    public void setExchangeRateType(String exchangeRateType) {
        ExchangeRateType = exchangeRateType;
    }

    /**
     * 是否双向转换
     */
    private String IsTwoWay;
    /**
     * 是否双向转换
     */
    public String getIsTowWay() {
        return IsTwoWay;
    }
    /**
     * 是否双向转换
     */
    public void setIsTowWay(String isTowWay) {
        IsTwoWay = isTowWay;
    }

    /**
     * 原币
     */
    private  String originalCurrency;
    /**
     * 原币
     */
    public String getOriginalCurrency() {
        return originalCurrency;
    }
    /**
     * 原币
     */
    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }
    /**
     * 异步删除状态
     * */
    private  String state_AsyncDeleteStatus;
    /*
     *异步删除状态
     * */
    public String getState_AsyncDeleteStatus() {
        return state_AsyncDeleteStatus;
    }
    /*
     *异步删除状态
     * */
    public void setState_AsyncDeleteStatus(String state_AsyncDeleteStatus) {
        this.state_AsyncDeleteStatus = state_AsyncDeleteStatus;
    }

    /**
     *停用时间
     * */
    private Date state_DisableTime;
    /*
     *停用时间
     * */
    public Date getState_DisableTime() {
        return state_DisableTime;
    }
    /*
     *停用时间
     * */
    public void setState_DisableTime(Date state_DisableTime) {
        this.state_DisableTime = state_DisableTime;
    }

    /**
     * 是否可用
     * */
    private String state_IsEnabled;
    /*
     *是否启用
     * */
    public String getState_IsEnabled() {
        return state_IsEnabled;
    }
    /*
     *是否启用
     * */
    public void setState_IsEnabled(String state_IsEnabled) {
        this.state_IsEnabled = state_IsEnabled;
    }

    /**
     * 创建人
     */
    private  String TimeStamp_CreatedBy;
    /*
     *创建人
     * */
    public String getTimeStamp_CreatedBy() {
        return TimeStamp_CreatedBy;
    }
    /*
     *创建人
     * */
    public void setTimeStamp_CreatedBy(String timeStamp_CreatedBy) {
        TimeStamp_CreatedBy = timeStamp_CreatedBy;
    }

    /**
     * 创建时间
     */
    private  Date  timeStamp_CreatedOn;
    /*
     *创建时间
     * */
    public Date getTimeStamp_CreatedOn() {
        return timeStamp_CreatedOn;
    }
    /*
     *创建时间
     * */
    public void setTimeStamp_CreatedOn(Date timeStamp_CreatedOn) {
        this.timeStamp_CreatedOn = timeStamp_CreatedOn;
    }

    /**     *
     * 修改人
     */
    private  String timeStamp_LastChangedBy;
    /*
     *修改人
     * */
    public String getTimeStamp_LastChangedBy() {
        return timeStamp_LastChangedBy;
    }
    /*
     *修改人
     * */
    public void setTimeStamp_LastChangedBy(String timeStamp_LastChangedBy) {
        this.timeStamp_LastChangedBy = timeStamp_LastChangedBy;
    }

    /**
     * 修改时间
     */
    private  Date timeStamp_LastChangedOn;
    /*
     *修改时间
     * */
    public Date getTimeStamp_LastChangedOn() {
        return timeStamp_LastChangedOn;
    }
    /*
     *修改时间
     * */
    public void setTimeStamp_LastChangedOn(Date timeStamp_LastChangedOn) {
        this.timeStamp_LastChangedOn = timeStamp_LastChangedOn;
    }
}
