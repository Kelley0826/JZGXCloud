package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 行政组织实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 14:49
 * Company: Inspur
 */
@Entity
@Data
@Table(name = "bfadminorganization")
public class JZBFAdminOrganizationDO {

    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称(适配多语)
     */
    @CafI18nStringColumn
    private String name;
    /**
     * 所在单位
     */
    private String ownerid;
    /**
     * 组织类型
     */
    private String orgType;
    /**
     * 部门负责人
     */
    private String departmenthead;
    /**
     * 部门负责人名称
     */
    private String departmentheadName;
    /**
     * 行业
     */
    private String industry;
    /**
     * 主组织Id
     */
    private String masterorgid;
    /**
     * 法人代表
     */
    private String representative;
    /**
     * 是否可用
     */
    private String state_isenabled;
    /**
     *是否明细
     */
   private  String pnthrinfo_isdetail;
    /**
     * 级次
     */
   private  String pnthrinfo_layer;


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
     * 获取 组织类型
     *
     * @return orgType 组织类型
     */
    public String getOrgType() {
        return this.orgType;
    }

    /**
     * 设置 组织类型
     *
     * @param orgType 组织类型
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取 部门负责人
     *
     * @return departmenthead 部门负责人
     */
    public String getDepartmenthead() {
        return this.departmenthead;
    }

    /**
     * 设置 部门负责人
     *
     * @param departmenthead 部门负责人
     */
    public void setDepartmenthead(String departmenthead) {
        this.departmenthead = departmenthead;
    }

    /**
     * 获取 部门负责人名称
     *
     * @return departmentheadName 部门负责人名称
     */
    public String getDepartmentheadName() {
        return this.departmentheadName;
    }

    /**
     * 设置 部门负责人名称
     *
     * @param departmentheadName 部门负责人名称
     */
    public void setDepartmentheadName(String departmentheadName) {
        this.departmentheadName = departmentheadName;
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
     * 获取 主组织Id
     *
     * @return masterorgid 主组织Id
     */
    public String getMasterorgid() {
        return this.masterorgid;
    }

    /**
     * 设置 主组织Id
     *
     * @param masterorgid 主组织Id
     */
    public void setMasterorgid(String masterorgid) {
        this.masterorgid = masterorgid;
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
     * 是否明细
     */
    public String getPnthrinfo_isdetail() {
        return pnthrinfo_isdetail;
    }

    public void setPnthrinfo_isdetail(String pnthrinfo_isdetail) {
        this.pnthrinfo_isdetail = pnthrinfo_isdetail;
    }

    /**
     * 层次
     * @return
     */
    public String getPnthrinfo_layer() {
        return pnthrinfo_layer;
    }

    public void setPnthrinfo_layer(String pnthrinfo_layer) {
        this.pnthrinfo_layer = pnthrinfo_layer;
    }
    
    @Override
    public String toString() {
        return "BFAdminOrganizationDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", nameCHS='" + name + '\'' +
                ", ownerid='" + ownerid + '\'' +
                ", orgType='" + orgType + '\'' +
                ", departmenthead='" + departmenthead + '\'' +
                ", departmentheadName='" + departmentheadName + '\'' +
                ", industry='" + industry + '\'' +
                ", masterorgid='" + masterorgid + '\'' +
                ", representative='" + representative + '\'' +
                ", stateIsenabled='" + state_isenabled + '\'' +
                '}';
    }

    /**
     * 获取 名称（适配多语）
     *
     * @return name_chs 名称
     */
    public String getName_chs() {
        return this.name;
    }

    /**
     * 设置 名称
     *
     * @param name_chs 名称（适配多语）
     */
    public void setName_chs(String name_chs) {
        this.name = name_chs;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
