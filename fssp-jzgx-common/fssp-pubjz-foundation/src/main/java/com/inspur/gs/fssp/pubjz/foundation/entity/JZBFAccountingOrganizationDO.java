package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-09
 * <p>核算组织表
 */
public class JZBFAccountingOrganizationDO {
    /**
     * 主键
     */
    private String id;
    /**
     *管理组织id
     */
    private String adminorgid;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 停用年度
     */
    private String disableyear;
    /**
     * 启用标志
     */
    private Character  enableflag;
    /**
     * 是否停用
     */
    private Character isdisable;
    /**
     * 组织类型
     */
    private String orgtype;
    /**
     * 父级id
     */
    private String parentid;
    /**
     * 备注
     */
    private String remark;
    /**
     * 简称
     */
    private String shortname;
    /**
     * 序号
     */
    private  int sortorder;
    /**
     * 是否末级
     */
    private Character treeinfo_isdetail;
    /**
     * 层级
     */
    private int treeinfo_layer;
    /**
     * 组织层级路径
     */
    private String treeinfo_path;
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
     * 获取 管理组织id
     *
     * @return adminorgid 管理组织id
     */
    public String getAdminorgid() {
        return this.adminorgid;
    }

    /**
     * 设置 管理组织id
     *
     * @param adminorgid 管理组织id
     */
    public void setAdminorgid(String adminorgid) {
        this.adminorgid = adminorgid;
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
     * @return name 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 停用年度
     *
     * @return disableyear 停用年度
     */
    public String getDisableyear() {
        return this.disableyear;
    }

    /**
     * 设置 停用年度
     *
     * @param disableyear 停用年度
     */
    public void setDisableyear(String disableyear) {
        this.disableyear = disableyear;
    }

    /**
     * 获取 启用标志
     *
     * @return enableflag 启用标志
     */
    public Character getEnableflag() {
        return this.enableflag;
    }

    /**
     * 设置 启用标志
     *
     * @param enableflag 启用标志
     */
    public void setEnableflag(Character enableflag) {
        this.enableflag = enableflag;
    }

    /**
     * 获取 是否停用
     *
     * @return isdisable 是否停用
     */
    public Character getIsdisable() { return this.isdisable; }

    /**
     * 设置 是否停用
     *
     * @param isdisable 是否停用
     */
    public void setIsdisable(Character isdisable) {
        this.isdisable = isdisable;
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
     * 获取 父级id
     *
     * @return parentid 父级id
     */
    public String getParentid() {
        return this.parentid;
    }

    /**
     * 设置 父级id
     *
     * @param parentid 父级id
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
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
     * 获取 简称
     *
     * @return shortname 简称
     */
    public String getShortname() {
        return this.shortname;
    }

    /**
     * 设置 简称
     *
     * @param shortname 简称
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * 获取 序号
     *
     * @return sortorder 序号
     */
    public int getSortorder() {
        return this.sortorder;
    }

    /**
     * 设置 序号
     *
     * @param sortorder 序号
     */
    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }

    /**
     * 获取 是否末级
     *
     * @return treeinfo_isdetail 是否末级
     */
    public Character getTreeinfo_isdetail() {
        return this.treeinfo_isdetail;
    }

    /**
     * 设置 是否末级
     *
     * @param treeinfo_isdetail 是否末级
     */
    public void setTreeinfo_isdetail(Character treeinfo_isdetail) {
        this.treeinfo_isdetail = treeinfo_isdetail;
    }

    /**
     * 获取 层级
     *
     * @return treeinfo_layer 层级
     */
    public int getTreeinfo_layer() {
        return this.treeinfo_layer;
    }

    /**
     * 设置 层级
     *
     * @param treeinfo_layer 层级
     */
    public void setTreeinfo_layer(int treeinfo_layer) {
        this.treeinfo_layer = treeinfo_layer;
    }

    /**
     * 获取 组织层级路径
     *
     * @return treeinfo_path 组织层级路径
     */
    public String getTreeinfo_path() {
        return this.treeinfo_path;
    }

    /**
     * 设置 组织层级路径
     *
     * @param treeinfo_path 组织层级路径
     */
    public void setTreeinfo_path(String treeinfo_path) {
        this.treeinfo_path = treeinfo_path;
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
        return "BFAccountingOrganizationDO{" +
                "id='" + id + '\'' +
                ", adminorgid='" + adminorgid + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", disableyear='" + disableyear + '\'' +
                ", enableflag=" + enableflag +
                ", isdisable=" + isdisable +
                ", orgtype='" + orgtype + '\'' +
                ", parentid='" + parentid + '\'' +
                ", remark='" + remark + '\'' +
                ", shortname='" + shortname + '\'' +
                ", sortorder=" + sortorder +
                ", treeinfo_isdetail=" + treeinfo_isdetail +
                ", treeinfo_layer=" + treeinfo_layer +
                ", treeinfo_path='" + treeinfo_path + '\'' +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                '}';
    }
}


