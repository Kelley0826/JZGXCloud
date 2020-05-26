package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-08
 * <p>结算方式表
 */
public class JZBFSettlementWayDO {
    /**
     * 主键
     */
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name_chs;
    private String name_cht;
    private String name_en;
    private String name_es;
    private String name_pt;
    /**
     * 备注
     */
    private  String remark;
    /**
     * 结算方式类型
     */
    private String settlementwaytype;
    /**
     * 异步删除状态
     * */
    private  String state_asyncdeletestatus;
    /**
     *停用时间
     * */
    private Date state_disabletime;
    /**
     * 是否可用
     * */
    private Character state_isenabled;
    /**
     * 系统标志
     */
    private Character syssign;
    /**
     * 创建人
     */
    private  String timestamp_createdby;
    /**
     * 创建时间
     */
    private  Date  timestamp_createdon;
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
     * 获取 结算方式类型
     *
     * @return settlementwaytype 结算方式类型
     */
    public String getSettlementwaytype() {
        return this.settlementwaytype;
    }

    /**
     * 设置 结算方式类型
     *
     * @param settlementwaytype 结算方式类型
     */
    public void setSettlementwaytype(String settlementwaytype) {
        this.settlementwaytype = settlementwaytype;
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
     * 获取 系统标志
     *
     * @return syssign 系统标志
     */
    public Character getSyssign() {
        return this.syssign;
    }

    /**
     * 设置 系统标志
     *
     * @param syssign 系统标志
     */
    public void setSyssign(Character syssign) {
        this.syssign = syssign;
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
        return "BFSettlementWayDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name_chs='" + name_chs + '\'' +
                ", name_cht='" + name_cht + '\'' +
                ", name_en='" + name_en + '\'' +
                ", name_es='" + name_es + '\'' +
                ", name_pt='" + name_pt + '\'' +
                ", remark='" + remark + '\'' +
                ", settlementwaytype='" + settlementwaytype + '\'' +
                ", state_asyncdeletestatus='" + state_asyncdeletestatus + '\'' +
                ", state_disabletime=" + state_disabletime +
                ", state_isenabled=" + state_isenabled +
                ", syssign=" + syssign +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                '}';
    }
}


