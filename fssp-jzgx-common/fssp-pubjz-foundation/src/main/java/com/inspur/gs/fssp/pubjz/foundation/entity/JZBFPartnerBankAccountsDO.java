package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-08
 * <p>往来单位银行账户表
 */
public class JZBFPartnerBankAccountsDO {
    /**
     * 主键
     */
    private String id;
    /**
     * 编码
     */
    private String accountcode;
    /**
     * 名称
     */
    private String accountname_chs;
    private String accountname_cht;
    private String accountname_en;
    private String accountname_es;
    private String accountname_pt;
    /**
     *状态
     */
    private String accountstate;
    /**
     * 账号类型
     */
    private String accounttype;
    /**
     * 所属银行
     */
    private String inbank;
    /**
     * 是否默认
     */
    private String ismain;
    /**
     * 往来单位id
     */
    private String partnerid;
    /**
     * 城市
     */
    private String city;
    /**
     * 省份
     */
    private String province;
    /**
     * 国家
     */
    private String country;
    /**
     * 备注
     */
    private String remark;
    /**
     * 异步删除状态
     */
    private String state_asyncdeletestatus;
    /**
     *停用时间
     */
    private Date state_disabletime;
    /**
     * 是否可用
     */
    private Character state_isenabled;
    /**
     * 创建人
     */
    private String timestamp_createdby;
    /**
     * 创建时间
     */
    private Date timestamp_createdon;
    /**
     * 修改人
     */
    private String timestamp_lastchangedby;
    /**
     * 修改时间
     */
    private Date timestamp_lastchangedon;


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
     * 获取 编码
     *
     * @return accountcode 编码
     */
    public String getAccountcode() {
        return this.accountcode;
    }

    /**
     * 设置 编码
     *
     * @param accountcode 编码
     */
    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    /**
     * 获取 名称
     *
     * @return accountname_chs 名称
     */
    public String getAccountname_chs() {
        return this.accountname_chs;
    }

    /**
     * 设置 名称
     *
     * @param accountname_chs 名称
     */
    public void setAccountname_chs(String accountname_chs) {
        this.accountname_chs = accountname_chs;
    }

    /**
     * 获取
     *
     * @return accountname_cht
     */
    public String getAccountname_cht() {
        return this.accountname_cht;
    }

    /**
     * 设置
     *
     * @param accountname_cht
     */
    public void setAccountname_cht(String accountname_cht) {
        this.accountname_cht = accountname_cht;
    }

    /**
     * 获取
     *
     * @return accountname_en
     */
    public String getAccountname_en() {
        return this.accountname_en;
    }

    /**
     * 设置
     *
     * @param accountname_en
     */
    public void setAccountname_en(String accountname_en) {
        this.accountname_en = accountname_en;
    }

    /**
     * 获取
     *
     * @return accountname_es
     */
    public String getAccountname_es() {
        return this.accountname_es;
    }

    /**
     * 设置
     *
     * @param accountname_es
     */
    public void setAccountname_es(String accountname_es) {
        this.accountname_es = accountname_es;
    }

    /**
     * 获取
     *
     * @return accountname_pt
     */
    public String getAccountname_pt() {
        return this.accountname_pt;
    }

    /**
     * 设置
     *
     * @param accountname_pt
     */
    public void setAccountname_pt(String accountname_pt) {
        this.accountname_pt = accountname_pt;
    }

    /**
     * 获取 状态
     *
     * @return accountstate 状态
     */
    public String getAccountstate() {
        return this.accountstate;
    }

    /**
     * 设置 状态
     *
     * @param accountstate 状态
     */
    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate;
    }

    /**
     * 获取 账号类型
     *
     * @return accounttype 账号类型
     */
    public String getAccounttype() {
        return this.accounttype;
    }

    /**
     * 设置 账号类型
     *
     * @param accounttype 账号类型
     */
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    /**
     * 获取 所属银行
     *
     * @return inbank 所属银行
     */
    public String getInbank() {
        return this.inbank;
    }

    /**
     * 设置 所属银行
     *
     * @param inbank 所属银行
     */
    public void setInbank(String inbank) {
        this.inbank = inbank;
    }

    /**
     * 获取 是否默认
     *
     * @return ismain 是否默认
     */
    public String getIsmain() {
        return this.ismain;
    }

    /**
     * 设置 是否默认
     *
     * @param ismain 是否默认
     */
    public void setIsmain(String ismain) {
        this.ismain = ismain;
    }

    /**
     * 获取 往来单位id
     *
     * @return partnerid 往来单位id
     */
    public String getPartnerid() {
        return this.partnerid;
    }

    /**
     * 设置 往来单位id
     *
     * @param partnerid 往来单位id
     */
    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    /**
     * 获取 城市
     *
     * @return city 城市
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置 城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取 省份
     *
     * @return province 省份
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 设置 省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取 国家
     *
     * @return country 国家
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * 设置 国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取 备注
     *
     * @return remark 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置 备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 异步删除状态
     *
     * @return state_asyncdeletestatus 异步删除状态
     */
    public String getState_asyncdeletestatus() {
        return this.state_asyncdeletestatus;
    }

    /**
     * 设置 异步删除状态
     *
     * @param state_asyncdeletestatus 异步删除状态
     */
    public void setState_asyncdeletestatus(String state_asyncdeletestatus) {
        this.state_asyncdeletestatus = state_asyncdeletestatus;
    }

    /**
     * 获取 停用时间
     *
     * @return state_disabletime 停用时间
     */
    public Date getState_disabletime() {
        return this.state_disabletime;
    }

    /**
     * 设置 停用时间
     *
     * @param state_disabletime 停用时间
     */
    public void setState_disabletime(Date state_disabletime) {
        this.state_disabletime = state_disabletime;
    }

    /**
     * 获取 是否可用
     *
     * @return state_isenabled 是否可用
     */
    public Character getState_isenabled() {
        return this.state_isenabled;
    }

    /**
     * 设置 是否可用
     *
     * @param state_isenabled 是否可用
     */
    public void setState_isenabled(Character state_isenabled) {
        this.state_isenabled = state_isenabled;
    }

    /**
     * 获取 创建人
     *
     * @return timestamp_createdby 创建人
     */
    public String getTimestamp_createdby() {
        return this.timestamp_createdby;
    }

    /**
     * 设置 创建人
     *
     * @param timestamp_createdby 创建人
     */
    public void setTimestamp_createdby(String timestamp_createdby) {
        this.timestamp_createdby = timestamp_createdby;
    }

    /**
     * 获取 创建时间
     *
     * @return timestamp_createdon 创建时间
     */
    public Date getTimestamp_createdon() {
        return this.timestamp_createdon;
    }

    /**
     * 设置 创建时间
     *
     * @param timestamp_createdon 创建时间
     */
    public void setTimestamp_createdon(Date timestamp_createdon) {
        this.timestamp_createdon = timestamp_createdon;
    }

    /**
     * 获取 修改人
     *
     * @return timestamp_lastchangedby 修改人
     */
    public String getTimestamp_lastchangedby() {
        return this.timestamp_lastchangedby;
    }

    /**
     * 设置 修改人
     *
     * @param timestamp_lastchangedby 修改人
     */
    public void setTimestamp_lastchangedby(String timestamp_lastchangedby) {
        this.timestamp_lastchangedby = timestamp_lastchangedby;
    }

    /**
     * 获取 修改时间
     *
     * @return timestamp_lastchangedon 修改时间
     */
    public Date getTimestamp_lastchangedon() {
        return this.timestamp_lastchangedon;
    }

    /**
     * 设置 修改时间
     *
     * @param timestamp_lastchangedon 修改时间
     */
    public void setTimestamp_lastchangedon(Date timestamp_lastchangedon) {
        this.timestamp_lastchangedon = timestamp_lastchangedon;
    }


    @Override
    public String toString() {
        return "BFPartnerBankAccountsDO{" +
                "id='" + id + '\'' +
                ", accountcode='" + accountcode + '\'' +
                ", accountname_chs='" + accountname_chs + '\'' +
                ", accountname_cht='" + accountname_cht + '\'' +
                ", accountname_en='" + accountname_en + '\'' +
                ", accountname_es='" + accountname_es + '\'' +
                ", accountname_pt='" + accountname_pt + '\'' +
                ", accountstate='" + accountstate + '\'' +
                ", accounttype='" + accounttype + '\'' +
                ", inbank='" + inbank + '\'' +
                ", ismain='" + ismain + '\'' +
                ", partnerid='" + partnerid + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", remark='" + remark + '\'' +
                ", state_asyncdeletestatus='" + state_asyncdeletestatus + '\'' +
                ", state_disabletime=" + state_disabletime +
                ", state_isenabled=" + state_isenabled +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                '}';
    }
}

