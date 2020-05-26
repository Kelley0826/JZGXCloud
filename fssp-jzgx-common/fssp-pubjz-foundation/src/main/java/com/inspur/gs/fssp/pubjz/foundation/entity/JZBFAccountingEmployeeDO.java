package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-08
 * <p>核算人员定义表
 */
public class JZBFAccountingEmployeeDO {
    /**
     * 主键
     */
    private String id;
    /**
     * 编号
     */
    private  String code;
    /**
     * 姓名
     */
    private String name;
    /**
     * 所属部门
     */
    private String accdeptid;
    /**
     * 所属组织
     */
    private String accorgid;
    /**
     * 行政人员id
     */
    private String adminemployeeid;
    /**
     * 停用
     */
    private String isdisable;
    /**
     * 助记码
     */
    private String  mnemoniccode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人
     */
    private  String timestamp_createdby;
    /**
     * 创建时间
     */
    private Date timestamp_createdon;
    /**
     * 修改人
     */
    private  String timestamp_lastchangedby;
    /**
     * 修改时间
     */
    private  Date timestamp_lastchangedon;


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
     * 获取 姓名
     *
     * @return name 姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 所属部门
     *
     * @return accdeptid 所属部门
     */
    public String getAccdeptid() {
        return this.accdeptid;
    }

    /**
     * 设置 所属部门
     *
     * @param accdeptid 所属部门
     */
    public void setAccdeptid(String accdeptid) {
        this.accdeptid = accdeptid;
    }

    /**
     * 获取 所属组织
     *
     * @return accorgid 所属组织
     */
    public String getAccorgid() {
        return this.accorgid;
    }

    /**
     * 设置 所属组织
     *
     * @param accorgid 所属组织
     */
    public void setAccorgid(String accorgid) {
        this.accorgid = accorgid;
    }

    /**
     * 获取 行政人员id
     *
     * @return adminemployeeid 行政人员id
     */
    public String getAdminemployeeid() {
        return this.adminemployeeid;
    }

    /**
     * 设置 行政人员id
     *
     * @param adminemployeeid 行政人员id
     */
    public void setAdminemployeeid(String adminemployeeid) {
        this.adminemployeeid = adminemployeeid;
    }

    /**
     * 获取 停用
     *
     * @return isdisable 停用
     */
    public String getIsdisable() {
        return this.isdisable;
    }

    /**
     * 设置 停用
     *
     * @param isdisable 停用
     */
    public void setIsdisable(String isdisable) {
        this.isdisable = isdisable;
    }

    /**
     * 获取 助记码
     *
     * @return mnemoniccode 助记码
     */
    public String getMnemoniccode() {
        return this.mnemoniccode;
    }

    /**
     * 设置 助记码
     *
     * @param mnemoniccode 助记码
     */
    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode;
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


    /**
     * toString()方法
     */
    @Override
    public String toString() {
        return "BFAccountingEmployeeDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", accdeptid='" + accdeptid + '\'' +
                ", accorgid='" + accorgid + '\'' +
                ", adminemployeeid='" + adminemployeeid + '\'' +
                ", isdisable='" + isdisable + '\'' +
                ", mnemoniccode='" + mnemoniccode + '\'' +
                ", remark='" + remark + '\'' +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                '}';
    }
}

