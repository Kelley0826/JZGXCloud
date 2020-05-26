package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 行政人员是实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 14:19
 * Company: Inspur
 */
@Entity
@Data
@Table(name = "bfemployee")
public class JZBFEmployeeDO {

    /**
     * 内码
     */
    @Id
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 显示姓名
     */
    private String displayName;
    /**
     * 名称
     */
    private String name_chs;
    /**
     * 组织
     */
    private String organization;
    /**
     * 联系电话
     */
    private String contactinfo;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 所属国家或地区
     */
    private String countryOrAera;
    /**
     * 性别
     */
    private String gender;
    /**
     * 证件编号
     */
    private String idNumber;
    /**
     * 证件类型
     */
    private String identityType;
    /**
     * 常驻地
     */
    private String location;
    /**
     * 系统用户
     */
    private String sysuser;
    /**
     * 密级
     */
    private String confidentiallevel;
    /**
     * 是否可用
     */
    private Character state_isenabled;

    @CafI18nStringColumn
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
     * 获取 显示姓名
     *
     * @return displayName 显示姓名
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * 设置 显示姓名
     *
     * @param displayName 显示姓名
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    /**
     * 获取 组织
     *
     * @return organization 组织
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * 设置 组织
     *
     * @param organization 组织
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * 获取 联系电话
     *
     * @return contactinfo 联系电话
     */
    public String getContactinfo() {
        return this.contactinfo;
    }

    /**
     * 设置 联系电话
     *
     * @param contactinfo 联系电话
     */
    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    /**
     * 获取 邮箱
     *
     * @return email 邮箱
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置 邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 所属国家或地区
     *
     * @return countryOrAera 所属国家或地区
     */
    public String getCountryOrAera() {
        return this.countryOrAera;
    }

    /**
     * 设置 所属国家或地区
     *
     * @param countryOrAera 所属国家或地区
     */
    public void setCountryOrAera(String countryOrAera) {
        this.countryOrAera = countryOrAera;
    }

    /**
     * 获取 性别
     *
     * @return gender 性别
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * 设置 性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取 证件编号
     *
     * @return idnumber 证件编号
     */
    public String getIdNumber() {
        return this.idNumber;
    }

    /**
     * 设置 证件编号
     *
     * @param idNumber 证件编号
     */
    public void setIdnumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取 证件类型
     *
     * @return identityType 证件类型
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * 设置 证件类型
     *
     * @param identityType 证件类型
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * 获取 常驻地
     *
     * @return location 常驻地
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * 设置 常驻地
     *
     * @param location 常驻地
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取 系统用户
     *
     * @return sysuser 系统用户
     */
    public String getSysuser() {
        return this.sysuser;
    }

    /**
     * 设置 系统用户
     *
     * @param sysuser 系统用户
     */
    public void setSysuser(String sysuser) {
        this.sysuser = sysuser;
    }

    /**
     * 获取 密级
     *
     * @return confidentiallevel 密级
     */
    public String getConfidentiallevel() {
        return this.confidentiallevel;
    }

    /**
     * 设置 密级
     *
     * @param confidentiallevel 密级
     */
    public void setConfidentiallevel(String confidentiallevel) {
        this.confidentiallevel = confidentiallevel;
    }



    @Override
    public String toString() {
        return "BFEmployeeDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", displayName='" + displayName + '\'' +
                ", nameCHS='" + name_chs + '\'' +
                ", organization='" + organization + '\'' +
                ", contactinfo='" + contactinfo + '\'' +
                ", email='" + email + '\'' +
                ", countryOrAera='" + countryOrAera + '\'' +
                ", gender='" + gender + '\'' +
                ", idnumber='" + idNumber + '\'' +
                ", identityType='" + identityType + '\'' +
                ", location='" + location + '\'' +
                ", sysuser='" + sysuser + '\'' +
                ", confidentiallevel='" + confidentiallevel + '\'' +
                ", stateIsenabled=" + state_isenabled +
                '}';
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
     * 获取 是否可用
     *
     * @return state_isenabled 是否可用
     */
    public char getState_isenabled() {
        return this.state_isenabled;
    }

    /**
     * 设置 是否可用
     *
     * @param state_isenabled 是否可用
     */
    public void setState_isenabled(char state_isenabled) {
        this.state_isenabled = state_isenabled;
    }
}
