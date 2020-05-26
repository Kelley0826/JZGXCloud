package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-08
 * <p>往来单位表
 */
public class JZBFPartnerDO {
    /**
     * 内码
     */
    private String id;
    /**
     * 地区
     */
    private String area;
    /**
     * 附件
     */
    private String attachment;
    /**
     * 单据状态
     */
    private String billstatus;
    /**
     * 编码
     */
    private String code;
    /**
     * 所属国家或地区
     */
    private String countryorregion;
    /**
     * 交易币种
     */
    private String defaultcurrencyid;
    /**
     * 行业
     */
    private String industry;
    /**
     * 实例ID
     */
    private String instanceid;
    /**
     * 名称
     */
    private String name_chs;
    private String name_cht;
    private String name_en;
    private String name_es;
    private String name_pt;
    /**
     * 行政区划
     */
    private String ofregion;
    /**
     * 组织机构代码
     */
    private String organizationcode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 法人代表
     */
    private String representative;
    /**
     * 异步删除状态
     */
    private String state_asyncdeletestatus;
    /**
     * 停用时间
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
     * 最后修改人
     */
    private String timestamp_lastchangedby;
    /**
     * 最后修改时间
     */
    private Date timestamp_lastchangedon;
    /**
     * 类别
     */
    private String type;


    /**
     * 获取 内码
     *
     * @return id 内码
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 内码
     *
     * @param id 内码
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 地区
     *
     * @return area 地区
     */
    public String getArea() {
        return this.area;
    }

    /**
     * 设置 地区
     *
     * @param area 地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取 附件
     *
     * @return attachment 附件
     */
    public String getAttachment() {
        return this.attachment;
    }

    /**
     * 设置 附件
     *
     * @param attachment 附件
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * 获取 单据状态
     *
     * @return billstatus 单据状态
     */
    public String getBillstatus() {
        return this.billstatus;
    }

    /**
     * 设置 单据状态
     *
     * @param billstatus 单据状态
     */
    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    /**
     * 获取 编码
     *
     * @return code 编码
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 设置 编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 所属国家或地区
     *
     * @return countryorregion 所属国家或地区
     */
    public String getCountryorregion() {
        return this.countryorregion;
    }

    /**
     * 设置 所属国家或地区
     *
     * @param countryorregion 所属国家或地区
     */
    public void setCountryorregion(String countryorregion) {
        this.countryorregion = countryorregion;
    }

    /**
     * 获取 交易币种
     *
     * @return defaultcurrencyid 交易币种
     */
    public String getDefaultcurrencyid() {
        return this.defaultcurrencyid;
    }

    /**
     * 设置 交易币种
     *
     * @param defaultcurrencyid 交易币种
     */
    public void setDefaultcurrencyid(String defaultcurrencyid) {
        this.defaultcurrencyid = defaultcurrencyid;
    }

    /**
     * 获取 行业
     *
     * @return industry 行业
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * 设置 行业
     *
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取 实例ID
     *
     * @return instanceid 实例ID
     */
    public String getInstanceid() {
        return this.instanceid;
    }

    /**
     * 设置 实例ID
     *
     * @param instanceid 实例ID
     */
    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    /**
     * 获取 名称
     *
     * @return name_chs 名称
     */
    public String getName_chs() {
        return this.name_chs;
    }

    /**
     * 设置 名称
     *
     * @param name_chs 名称
     */
    public void setName_chs(String name_chs) {
        this.name_chs = name_chs;
    }

    /**
     * 获取
     *
     * @return name_cht
     */
    public String getName_cht() {
        return this.name_cht;
    }

    /**
     * 设置
     *
     * @param name_cht
     */
    public void setName_cht(String name_cht) {
        this.name_cht = name_cht;
    }

    /**
     * 获取
     *
     * @return name_en
     */
    public String getName_en() {
        return this.name_en;
    }

    /**
     * 设置
     *
     * @param name_en
     */
    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    /**
     * 获取
     *
     * @return name_es
     */
    public String getName_es() {
        return this.name_es;
    }

    /**
     * 设置
     *
     * @param name_es
     */
    public void setName_es(String name_es) {
        this.name_es = name_es;
    }

    /**
     * 获取
     *
     * @return name_pt
     */
    public String getName_pt() {
        return this.name_pt;
    }

    /**
     * 设置
     *
     * @param name_pt
     */
    public void setName_pt(String name_pt) {
        this.name_pt = name_pt;
    }

    /**
     * 获取 行政区划
     *
     * @return ofregion 行政区划
     */
    public String getOfregion() {
        return this.ofregion;
    }

    /**
     * 设置 行政区划
     *
     * @param ofregion 行政区划
     */
    public void setOfregion(String ofregion) {
        this.ofregion = ofregion;
    }

    /**
     * 获取 组织机构代码
     *
     * @return organizationcode 组织机构代码
     */
    public String getOrganizationcode() {
        return this.organizationcode;
    }

    /**
     * 设置 组织机构代码
     *
     * @param organizationcode 组织机构代码
     */
    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode;
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
     * 获取 法人代表
     *
     * @return representative 法人代表
     */
    public String getRepresentative() {
        return this.representative;
    }

    /**
     * 设置 法人代表
     *
     * @param representative 法人代表
     */
    public void setRepresentative(String representative) {
        this.representative = representative;
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
     * 获取 最后修改人
     *
     * @return timestamp_lastchangedby 最后修改人
     */
    public String getTimestamp_lastchangedby() {
        return this.timestamp_lastchangedby;
    }

    /**
     * 设置 最后修改人
     *
     * @param timestamp_lastchangedby 最后修改人
     */
    public void setTimestamp_lastchangedby(String timestamp_lastchangedby) {
        this.timestamp_lastchangedby = timestamp_lastchangedby;
    }

    /**
     * 获取 最后修改时间
     *
     * @return timestamp_lastchangedon 最后修改时间
     */
    public Date getTimestamp_lastchangedon() {
        return this.timestamp_lastchangedon;
    }

    /**
     * 设置 最后修改时间
     *
     * @param timestamp_lastchangedon 最后修改时间
     */
    public void setTimestamp_lastchangedon(Date timestamp_lastchangedon) {
        this.timestamp_lastchangedon = timestamp_lastchangedon;
    }

    /**
     * 获取 类别
     *
     * @return type 类别
     */
    public String getType() {
        return this.type;
    }

    /**
     * 设置 类别
     *
     * @param type 类别
     */
    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "BFPartnerDO{" +
                "id='" + id + '\'' +
                ", area='" + area + '\'' +
                ", attachment='" + attachment + '\'' +
                ", billstatus='" + billstatus + '\'' +
                ", code='" + code + '\'' +
                ", countryorregion='" + countryorregion + '\'' +
                ", defaultcurrencyid='" + defaultcurrencyid + '\'' +
                ", industry='" + industry + '\'' +
                ", instanceid='" + instanceid + '\'' +
                ", name_chs='" + name_chs + '\'' +
                ", name_cht='" + name_cht + '\'' +
                ", name_en='" + name_en + '\'' +
                ", name_es='" + name_es + '\'' +
                ", name_pt='" + name_pt + '\'' +
                ", ofregion='" + ofregion + '\'' +
                ", organizationcode='" + organizationcode + '\'' +
                ", remark='" + remark + '\'' +
                ", representative='" + representative + '\'' +
                ", state_asyncdeletestatus='" + state_asyncdeletestatus + '\'' +
                ", state_disabletime=" + state_disabletime +
                ", state_isenabled=" + state_isenabled +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                ", type='" + type + '\'' +
                '}';
    }
}

