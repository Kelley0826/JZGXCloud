package com.inspur.gs.fssp.pubjz.foundation.entity;


import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 币种实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 15:37
 * Company: Inspur
 */
@Entity
@Data
@Table(name="bfcurrency")
public class JZBFCurrencyDO {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 精度
     */
    private Integer accuracy;

    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    @CafI18nStringColumn
    private String name;

    /**
     * 标准货币
     */
    private String predefinedCurrency;

    /**
     * 是否可用
     */
    private String state_IsEnabled;
    /**
     * 币种符号
     */
    private String symbol;


    /**
     * 获取 主键
     *
     * @return id 主键
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 精度
     *
     * @return accuracy 精度
     */
    public Integer getaccuracy() {
        return this.accuracy;
    }

    /**
     * 设置 精度
     *
     * @param accuracy 精度
     */
    public void setaccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 获取 编号
     *
     * @return code 编号
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 设置 编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 名称
     *
     * @return name_chs 名称
     */
    public String getname_chs() {
        return this.name;
    }

    /**
     * 设置 名称
     *
     * @param name_chs 名称
     */
    public void setname_chs(String name_chs) {
        this.name = name_chs;
    }

    /**
     * 获取 标准货币
     *
     * @return predefinedCurrency 标准货币
     */
    public String getPredefinedCurrency() {
        return this.predefinedCurrency;
    }

    /**
     * 设置 标准货币
     *
     * @param predefinedCurrency 标准货币
     */
    public void setPredefinedCurrency(String predefinedCurrency) {
        this.predefinedCurrency = predefinedCurrency;
    }

    /**
     * 获取 是否可用
     *
     * @return state_IsEnabled 是否可用
     */
    public String getState_IsEnabled() {
        return this.state_IsEnabled;
    }

    /**
     * 设置 是否可用
     *
     * @param state_IsEnabled 是否可用
     */
    public void setState_IsEnabled(String state_IsEnabled) {
        this.state_IsEnabled = state_IsEnabled;
    }

    /**
     * 获取 币种符号
     *
     * @return symbol 币种符号
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * 设置 币种符号
     *
     * @param symbol 币种符号
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "BFCurrencyDO{" +
                "id='" + id + '\'' +
                ", accuracy=" + accuracy +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", predefinedCurrency='" + predefinedCurrency + '\'' +
                ", state_IsEnabled='" + state_IsEnabled + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
