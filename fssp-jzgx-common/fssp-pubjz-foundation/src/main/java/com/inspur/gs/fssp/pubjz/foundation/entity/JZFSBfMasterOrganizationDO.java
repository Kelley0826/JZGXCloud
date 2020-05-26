package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author: sakura sun (sunchao)
 * Date:  2020/2/27 14:56
 * Company: Inspur
 */
@Entity
@Data
@Table(name="bfmasterorganization")
public class JZFSBfMasterOrganizationDO {
    /*
     *ID
     */
    @Id
    private  String id;

    /*
     *简称
     */
    private  String abbreviation;

    /*
     *核算
     */
    private  String accountingorg;

    /*
     *行政
     */
    private  String adminorg;

    /*
     *资产组织
     */
    private  String assetorg;

    /*
     *附件
     */
    private  String attachment;

    /*
     *资金
     */
    private  String capitalgroup;

    /*
     *编码
     */
    private  String code;

    /*
     *财务共享
     */
    private  String financialshared;

    /*
     *负责人
     */
    private  String head;

    /*
     *独立核算
     */
    private  String independent;

    /*
     *库存
     */
    private  String inventoryorg;

    /*
     *是否法人
     */
    private  String islegalperson;

    /*
     *主账簿编码
     */
    private  String masterledgercode;

    /*
     *主账簿名称
     */
    private  String masterledgername;

    /*
     *组织类型
     */
    private  String orgtype;

    /*
     *所在单位
     */
    private  String ownerid;

    /*
     *是否明细
     */
    private  String pnthrinfo_isdetail;

    /*
     *级数
     */
    private  int pnthrinfo_layer;

    /*
     *父节点字段
     */
    private  String pnthrinfo_parentelement;

    /*
     *顺序号
     */
    private  int pnthrinfo_sequence;

    /*
     *名称
     */
    private  String name_chs;

    /*
     *采购
     */
    private  String purchasingorg;

    /*
     *销售
     */
    private  String salesorg;

    /*
     *项目组织
     */
    private  String projectorg;

    /*
     *异步删除状态
     */
    private  String state_asyncdeletestatus;

    /*
     *停用时间
     */
    private  Date state_disabletime;

    /*
     *是否可用
     */
    private  String state_isenabled;

    /*
     *摘要
     */
    private  String summary;

    /*
     *上级核算组织
     */
    private  String superioraccountingorg;

    /*
     *上级核算组织ID
     */
    private  String superioraccountingorgid;

    /*
     *创建人
     */
    private  String timestamp_createdby;

    /*
     *创建时间
     */
    private  Date timestamp_createdon;

    /*
     *最后修改人
     */
    private  String timestamp_lastchangedby;

    /*
     *最后修改时间
     */
    private Date timestamp_lastchangedon;

    /*
     *是否明细
     */
    private  String treeinfo_isdetail;

    /*
     *级数
     */
    private  Integer treeinfo_layer;

    /*
     *分级码
     */
    private  String treeinfo_path;

    /*
     *所属国家或地区
     */
    private  String countryorregion;

    /*
     *行业
     */
    private  String industry;

    /*
     *法定代表人
     */
    private  String legalrepresentative;

    /*
     *纳税人名称
     */
    private  String namefortax;

    /*
     *社会信用代码
     */
    private  String organizationcode;

    /*
     *登记注册类型
     */
    private  String registrationtype;

    /*
     *纳税信用等级
     */
    private  String taxcreditrating;

    /*
     *税务组织
     */
    private  String taxorg;

    /*
     *税款缴纳地
     */
    private  String taxregion;

    /*
     *联系电话
     */
    private  String tel;

    /*
     *核算层级
     */
    private  String accorgtype;

    /*
     *币种
     */
    private  String currency;

    /**
     * 获取 ID
     *
     * @return id ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 简称
     *
     * @return abbreviation 简称
     */
    public String getAbbreviation() {
        return this.abbreviation;
    }

    /**
     * 设置 简称
     *
     * @param abbreviation 简称
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 获取 核算
     *
     * @return accountingorg 核算
     */
    public String getAccountingorg() {
        return this.accountingorg;
    }

    /**
     * 设置 核算
     *
     * @param accountingorg 核算
     */
    public void setAccountingorg(String accountingorg) {
        this.accountingorg = accountingorg;
    }

    /**
     * 获取 行政
     *
     * @return adminorg 行政
     */
    public String getAdminorg() {
        return this.adminorg;
    }

    /**
     * 设置 行政
     *
     * @param adminorg 行政
     */
    public void setAdminorg(String adminorg) {
        this.adminorg = adminorg;
    }

    /**
     * 获取 资产组织
     *
     * @return assetorg 资产组织
     */
    public String getAssetorg() {
        return this.assetorg;
    }

    /**
     * 设置 资产组织
     *
     * @param assetorg 资产组织
     */
    public void setAssetorg(String assetorg) {
        this.assetorg = assetorg;
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
     * 获取 资金
     *
     * @return capitalgroup 资金
     */
    public String getCapitalgroup() {
        return this.capitalgroup;
    }

    /**
     * 设置 资金
     *
     * @param capitalgroup 资金
     */
    public void setCapitalgroup(String capitalgroup) {
        this.capitalgroup = capitalgroup;
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
     * 获取 财务共享
     *
     * @return financialshared 财务共享
     */
    public String getFinancialshared() {
        return this.financialshared;
    }

    /**
     * 设置 财务共享
     *
     * @param financialshared 财务共享
     */
    public void setFinancialshared(String financialshared) {
        this.financialshared = financialshared;
    }

    /**
     * 获取 负责人
     *
     * @return head 负责人
     */
    public String getHead() {
        return this.head;
    }

    /**
     * 设置 负责人
     *
     * @param head 负责人
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 获取 独立核算
     *
     * @return independent 独立核算
     */
    public String getIndependent() {
        return this.independent;
    }

    /**
     * 设置 独立核算
     *
     * @param independent 独立核算
     */
    public void setIndependent(String independent) {
        this.independent = independent;
    }

    /**
     * 获取 库存
     *
     * @return inventoryorg 库存
     */
    public String getInventoryorg() {
        return this.inventoryorg;
    }

    /**
     * 设置 库存
     *
     * @param inventoryorg 库存
     */
    public void setInventoryorg(String inventoryorg) {
        this.inventoryorg = inventoryorg;
    }

    /**
     * 获取 是否法人
     *
     * @return islegalperson 是否法人
     */
    public String getIslegalperson() {
        return this.islegalperson;
    }

    /**
     * 设置 是否法人
     *
     * @param islegalperson 是否法人
     */
    public void setIslegalperson(String islegalperson) {
        this.islegalperson = islegalperson;
    }

    /**
     * 获取 主账簿编码
     *
     * @return masterledgercode 主账簿编码
     */
    public String getMasterledgercode() {
        return this.masterledgercode;
    }

    /**
     * 设置 主账簿编码
     *
     * @param masterledgercode 主账簿编码
     */
    public void setMasterledgercode(String masterledgercode) {
        this.masterledgercode = masterledgercode;
    }

    /**
     * 获取 主账簿名称
     *
     * @return masterledgername 主账簿名称
     */
    public String getMasterledgername() {
        return this.masterledgername;
    }

    /**
     * 设置 主账簿名称
     *
     * @param masterledgername 主账簿名称
     */
    public void setMasterledgername(String masterledgername) {
        this.masterledgername = masterledgername;
    }

    /**
     * 获取 组织类型
     *
     * @return orgtype 组织类型
     */
    public String getOrgtype() {
        return this.orgtype;
    }

    /**
     * 设置 组织类型
     *
     * @param orgtype 组织类型
     */
    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    /**
     * 获取 所在单位
     *
     * @return ownerid 所在单位
     */
    public String getOwnerid() {
        return this.ownerid;
    }

    /**
     * 设置 所在单位
     *
     * @param ownerid 所在单位
     */
    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    /**
     * 获取 是否明细
     *
     * @return pnthrinfo_isdetail 是否明细
     */
    public String getPnthrinfo_isdetail() {
        return this.pnthrinfo_isdetail;
    }

    /**
     * 设置 是否明细
     *
     * @param pnthrinfo_isdetail 是否明细
     */
    public void setPnthrinfo_isdetail(String pnthrinfo_isdetail) {
        this.pnthrinfo_isdetail = pnthrinfo_isdetail;
    }

    /**
     * 获取 级数
     *
     * @return pnthrinfo_layer 级数
     */
    public int getPnthrinfo_layer() {
        return this.pnthrinfo_layer;
    }

    /**
     * 设置 级数
     *
     * @param pnthrinfo_layer 级数
     */
    public void setPnthrinfo_layer(int pnthrinfo_layer) {
        this.pnthrinfo_layer = pnthrinfo_layer;
    }

    /**
     * 获取 父节点字段
     *
     * @return pnthrinfo_parentelement 父节点字段
     */
    public String getPnthrinfo_parentelement() {
        return this.pnthrinfo_parentelement;
    }

    /**
     * 设置 父节点字段
     *
     * @param pnthrinfo_parentelement 父节点字段
     */
    public void setPnthrinfo_parentelement(String pnthrinfo_parentelement) {
        this.pnthrinfo_parentelement = pnthrinfo_parentelement;
    }

    /**
     * 获取 顺序号
     *
     * @return pnthrinfo_sequence 顺序号
     */
    public int getPnthrinfo_sequence() {
        return this.pnthrinfo_sequence;
    }

    /**
     * 设置 顺序号
     *
     * @param pnthrinfo_sequence 顺序号
     */
    public void setPnthrinfo_sequence(int pnthrinfo_sequence) {
        this.pnthrinfo_sequence = pnthrinfo_sequence;
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
     * 获取 采购
     *
     * @return purchasingorg 采购
     */
    public String getPurchasingorg() {
        return this.purchasingorg;
    }

    /**
     * 设置 采购
     *
     * @param purchasingorg 采购
     */
    public void setPurchasingorg(String purchasingorg) {
        this.purchasingorg = purchasingorg;
    }

    /**
     * 获取 销售
     *
     * @return salesorg 销售
     */
    public String getSalesorg() {
        return this.salesorg;
    }

    /**
     * 设置 销售
     *
     * @param salesorg 销售
     */
    public void setSalesorg(String salesorg) {
        this.salesorg = salesorg;
    }

    /**
     * 获取 项目组织
     *
     * @return projectorg 项目组织
     */
    public String getProjectorg() {
        return this.projectorg;
    }

    /**
     * 设置 项目组织
     *
     * @param projectorg 项目组织
     */
    public void setProjectorg(String projectorg) {
        this.projectorg = projectorg;
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
    public String getState_isenabled() {
        return this.state_isenabled;
    }

    /**
     * 设置 是否可用
     *
     * @param state_isenabled 是否可用
     */
    public void setState_isenabled(String state_isenabled) {
        this.state_isenabled = state_isenabled;
    }

    /**
     * 获取 摘要
     *
     * @return summary 摘要
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * 设置 摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取 上级核算组织
     *
     * @return superioraccountingorg 上级核算组织
     */
    public String getSuperioraccountingorg() {
        return this.superioraccountingorg;
    }

    /**
     * 设置 上级核算组织
     *
     * @param superioraccountingorg 上级核算组织
     */
    public void setSuperioraccountingorg(String superioraccountingorg) {
        this.superioraccountingorg = superioraccountingorg;
    }

    /**
     * 获取 上级核算组织ID
     *
     * @return superioraccountingorgid 上级核算组织ID
     */
    public String getSuperioraccountingorgid() {
        return this.superioraccountingorgid;
    }

    /**
     * 设置 上级核算组织ID
     *
     * @param superioraccountingorgid 上级核算组织ID
     */
    public void setSuperioraccountingorgid(String superioraccountingorgid) {
        this.superioraccountingorgid = superioraccountingorgid;
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
     * 获取 是否明细
     *
     * @return treeinfo_isdetail 是否明细
     */
    public String getTreeinfo_isdetail() {
        return this.treeinfo_isdetail;
    }

    /**
     * 设置 是否明细
     *
     * @param treeinfo_isdetail 是否明细
     */
    public void setTreeinfo_isdetail(String treeinfo_isdetail) {
        this.treeinfo_isdetail = treeinfo_isdetail;
    }

    /**
     * 获取 级数
     *
     * @return treeinfo_layer 级数
     */
    public Integer getTreeinfo_layer() {
        return this.treeinfo_layer;
    }

    /**
     * 设置 级数
     *
     * @param treeinfo_layer 级数
     */
    public void setTreeinfo_layer(Integer treeinfo_layer) {
        this.treeinfo_layer = treeinfo_layer;
    }

    /**
     * 获取 分级码
     *
     * @return treeinfo_path 分级码
     */
    public String getTreeinfo_path() {
        return this.treeinfo_path;
    }

    /**
     * 设置 分级码
     *
     * @param treeinfo_path 分级码
     */
    public void setTreeinfo_path(String treeinfo_path) {
        this.treeinfo_path = treeinfo_path;
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
     * 获取 法定代表人
     *
     * @return legalrepresentative 法定代表人
     */
    public String getLegalrepresentative() {
        return this.legalrepresentative;
    }

    /**
     * 设置 法定代表人
     *
     * @param legalrepresentative 法定代表人
     */
    public void setLegalrepresentative(String legalrepresentative) {
        this.legalrepresentative = legalrepresentative;
    }

    /**
     * 获取 纳税人名称
     *
     * @return namefortax 纳税人名称
     */
    public String getNamefortax() {
        return this.namefortax;
    }

    /**
     * 设置 纳税人名称
     *
     * @param namefortax 纳税人名称
     */
    public void setNamefortax(String namefortax) {
        this.namefortax = namefortax;
    }

    /**
     * 获取 社会信用代码
     *
     * @return organizationcode 社会信用代码
     */
    public String getOrganizationcode() {
        return this.organizationcode;
    }

    /**
     * 设置 社会信用代码
     *
     * @param organizationcode 社会信用代码
     */
    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode;
    }

    /**
     * 获取 登记注册类型
     *
     * @return registrationtype 登记注册类型
     */
    public String getRegistrationtype() {
        return this.registrationtype;
    }

    /**
     * 设置 登记注册类型
     *
     * @param registrationtype 登记注册类型
     */
    public void setRegistrationtype(String registrationtype) {
        this.registrationtype = registrationtype;
    }

    /**
     * 获取 纳税信用等级
     *
     * @return taxcreditrating 纳税信用等级
     */
    public String getTaxcreditrating() {
        return this.taxcreditrating;
    }

    /**
     * 设置 纳税信用等级
     *
     * @param taxcreditrating 纳税信用等级
     */
    public void setTaxcreditrating(String taxcreditrating) {
        this.taxcreditrating = taxcreditrating;
    }

    /**
     * 获取 税务组织
     *
     * @return taxorg 税务组织
     */
    public String getTaxorg() {
        return this.taxorg;
    }

    /**
     * 设置 税务组织
     *
     * @param taxorg 税务组织
     */
    public void setTaxorg(String taxorg) {
        this.taxorg = taxorg;
    }

    /**
     * 获取 税款缴纳地
     *
     * @return taxregion 税款缴纳地
     */
    public String getTaxregion() {
        return this.taxregion;
    }

    /**
     * 设置 税款缴纳地
     *
     * @param taxregion 税款缴纳地
     */
    public void setTaxregion(String taxregion) {
        this.taxregion = taxregion;
    }

    /**
     * 获取 联系电话
     *
     * @return tel 联系电话
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * 设置 联系电话
     *
     * @param tel 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取 核算层级
     *
     * @return accorgtype 核算层级
     */
    public String getAccorgtype() {
        return this.accorgtype;
    }

    /**
     * 设置 核算层级
     *
     * @param accorgtype 核算层级
     */
    public void setAccorgtype(String accorgtype) {
        this.accorgtype = accorgtype;
    }

    /**
     * 获取 币种
     *
     * @return currency 币种
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * 设置 币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
