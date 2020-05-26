package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * 费用项目实体类
 */
public class JZBFExpensesTypeDO {
    /**
     * 内码
     */
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 全称
     */
    private String fullName;
    /**
     * 名称
     */
    private  String name_Chs;
    /**
     * 名称
     */
    private String name_Cht;
    /**
     * 名称
     */
    private  String name_En;
    /**
     * 名称
     */
    private String name_Es;

    private  String name_Pt;
    /**
     * 是否末级
     */
    private String pnthrinfo_Isdetail;
    /**
     * 层级
     */
    private int pnthrinfo_Layer;
    /**
     * 父元素
     */
    private String pnthrinfo_ParentElement;

    private int pnthrinfo_Sequence;
    /**
     * 备注
     */
    private String remark;
    /**
     * 简码
     */
    private String shortCode;
    /**
     * 使用范围
     */
    private String usageScope;
    /**
     * 异步删除状态
     */
    private String state_AsyncDeleteStatus;

    /**
     * 禁用时间
     */
    private Date state_DisableTime;

    private String state_IsEnabled;

    /**
     * 创建人
     */
    private  String TimeStamp_CreatedBy;

    /**
     * 创建时间
     */
    private  Date  timeStamp_CreatedOn;
    /**     *
     * 修改人
     */
    private  String timeStamp_LastChangedBy;
    /**
     * 修改时间     *
     */
    private  Date timeStamp_LastChangedOn;


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
     * 获取 全称
     *
     * @return fullName 全称
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * 设置 全称
     *
     * @param fullName 全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取 名称
     *
     * @return name_Chs 名称
     */
    public String getName_Chs() {
        return this.name_Chs;
    }

    /**
     * 设置 名称
     *
     * @param name_Chs 名称
     */
    public void setName_Chs(String name_Chs) {
        this.name_Chs = name_Chs;
    }

    /**
     * 获取
     *
     * @return name_Cht
     */
    public String getName_Cht() {
        return this.name_Cht;
    }

    /**
     * 设置
     *
     * @param name_Cht
     */
    public void setName_Cht(String name_Cht) {
        this.name_Cht = name_Cht;
    }

    /**
     * 获取
     *
     * @return name_En
     */
    public String getName_En() {
        return this.name_En;
    }

    /**
     * 设置
     *
     * @param name_En
     */
    public void setName_En(String name_En) {
        this.name_En = name_En;
    }

    /**
     * 获取
     *
     * @return name_Es
     */
    public String getName_Es() {
        return this.name_Es;
    }

    /**
     * 设置
     *
     * @param name_Es
     */
    public void setName_Es(String name_Es) {
        this.name_Es = name_Es;
    }

    /**
     * 获取
     *
     * @return name_Pt
     */
    public String getName_Pt() {
        return this.name_Pt;
    }

    /**
     * 设置
     *
     * @param name_Pt
     */
    public void setName_Pt(String name_Pt) {
        this.name_Pt = name_Pt;
    }

    /**
     * 获取 是否末级
     *
     * @return pnthrinfo_Isdetail 是否末级
     */
    public String getPnthrinfo_Isdetail() {
        return this.pnthrinfo_Isdetail;
    }

    /**
     * 设置 是否末级
     *
     * @param pnthrinfo_Isdetail 是否末级
     */
    public void setPnthrinfo_Isdetail(String pnthrinfo_Isdetail) {
        this.pnthrinfo_Isdetail = pnthrinfo_Isdetail;
    }

    /**
     * 获取 层级
     *
     * @return pnthrinfo_Layer 层级
     */
    public int getPnthrinfo_Layer() {
        return this.pnthrinfo_Layer;
    }

    /**
     * 设置 层级
     *
     * @param pnthrinfo_Layer 层级
     */
    public void setPnthrinfo_Layer(int pnthrinfo_Layer) {
        this.pnthrinfo_Layer = pnthrinfo_Layer;
    }

    /**
     * 获取 父元素
     *
     * @return pnthrinfo_ParentElement 父元素
     */
    public String getPnthrinfo_ParentElement() {
        return this.pnthrinfo_ParentElement;
    }

    /**
     * 设置 父元素
     *
     * @param pnthrinfo_ParentElement 父元素
     */
    public void setPnthrinfo_ParentElement(String pnthrinfo_ParentElement) {
        this.pnthrinfo_ParentElement = pnthrinfo_ParentElement;
    }

    /**
     * 获取
     *
     * @return pnthrinfo_Sequence
     */
    public int getPnthrinfo_Sequence() {
        return this.pnthrinfo_Sequence;
    }

    /**
     * 设置
     *
     * @param pnthrinfo_Sequence
     */
    public void setPnthrinfo_Sequence(int pnthrinfo_Sequence) {
        this.pnthrinfo_Sequence = pnthrinfo_Sequence;
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
     * 获取 简码
     *
     * @return shortCode 简码
     */
    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * 设置 简码
     *
     * @param shortCode 简码
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * 获取 使用范围
     *
     * @return usageScope 使用范围
     */
    public String getUsageScope() {
        return this.usageScope;
    }

    /**
     * 设置 使用范围
     *
     * @param usageScope 使用范围
     */
    public void setUsageScope(String usageScope) {
        this.usageScope = usageScope;
    }

    /**
     * 获取 异步删除状态
     *
     * @return state_AsyncDeleteStatus 异步删除状态
     */
    public String getState_AsyncDeleteStatus() {
        return this.state_AsyncDeleteStatus;
    }

    /**
     * 设置 异步删除状态
     *
     * @param state_AsyncDeleteStatus 异步删除状态
     */
    public void setState_AsyncDeleteStatus(String state_AsyncDeleteStatus) {
        this.state_AsyncDeleteStatus = state_AsyncDeleteStatus;
    }

    /**
     * 获取 禁用时间
     *
     * @return state_DisableTime 禁用时间
     */
    public Date getState_DisableTime() {
        return this.state_DisableTime;
    }

    /**
     * 设置 禁用时间
     *
     * @param state_DisableTime 禁用时间
     */
    public void setState_DisableTime(Date state_DisableTime) {
        this.state_DisableTime = state_DisableTime;
    }

    /**
     * 获取
     *
     * @return state_IsEnabled
     */
    public String getState_IsEnabled() {
        return this.state_IsEnabled;
    }

    /**
     * 设置
     *
     * @param state_IsEnabled
     */
    public void setState_IsEnabled(String state_IsEnabled) {
        this.state_IsEnabled = state_IsEnabled;
    }

    /**
     * 获取 创建人
     *
     * @return TimeStamp_CreatedBy 创建人
     */
    public String getTimeStamp_CreatedBy() {
        return this.TimeStamp_CreatedBy;
    }

    /**
     * 设置 创建人
     *
     * @param TimeStamp_CreatedBy 创建人
     */
    public void setTimeStamp_CreatedBy(String TimeStamp_CreatedBy) {
        this.TimeStamp_CreatedBy = TimeStamp_CreatedBy;
    }

    /**
     * 获取 创建时间
     *
     * @return timeStamp_CreatedOn 创建时间
     */
    public Date getTimeStamp_CreatedOn() {
        return this.timeStamp_CreatedOn;
    }

    /**
     * 设置 创建时间
     *
     * @param timeStamp_CreatedOn 创建时间
     */
    public void setTimeStamp_CreatedOn(Date timeStamp_CreatedOn) {
        this.timeStamp_CreatedOn = timeStamp_CreatedOn;
    }

    /**
     * 获取 修改人
     *
     * @return timeStamp_LastChangedBy 修改人
     */
    public String getTimeStamp_LastChangedBy() {
        return this.timeStamp_LastChangedBy;
    }

    /**
     * 设置 修改人
     *
     * @param timeStamp_LastChangedBy 修改人
     */
    public void setTimeStamp_LastChangedBy(String timeStamp_LastChangedBy) {
        this.timeStamp_LastChangedBy = timeStamp_LastChangedBy;
    }

    /**
     * 获取 修改时间
     *
     * @return timeStamp_LastChangedOn 修改时间
     */
    public Date getTimeStamp_LastChangedOn() {
        return this.timeStamp_LastChangedOn;
    }

    /**
     * 设置 修改时间
     *
     * @param timeStamp_LastChangedOn 修改时间
     */
    public void setTimeStamp_LastChangedOn(Date timeStamp_LastChangedOn) {
        this.timeStamp_LastChangedOn = timeStamp_LastChangedOn;
    }

    @Override
    public String toString() {
        return "BFExpensesTypeDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", name_Chs='" + name_Chs + '\'' +
                ", name_Cht='" + name_Cht + '\'' +
                ", name_En='" + name_En + '\'' +
                ", name_Es='" + name_Es + '\'' +
                ", name_Pt='" + name_Pt + '\'' +
                ", pnthrinfo_Isdetail='" + pnthrinfo_Isdetail + '\'' +
                ", pnthrinfo_Layer=" + pnthrinfo_Layer +
                ", pnthrinfo_ParentElement='" + pnthrinfo_ParentElement + '\'' +
                ", pnthrinfo_Sequence=" + pnthrinfo_Sequence +
                ", remark='" + remark + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", usageScope='" + usageScope + '\'' +
                ", state_AsyncDeleteStatus='" + state_AsyncDeleteStatus + '\'' +
                ", state_DisableTime=" + state_DisableTime +
                ", state_IsEnabled='" + state_IsEnabled + '\'' +
                ", TimeStamp_CreatedBy='" + TimeStamp_CreatedBy + '\'' +
                ", timeStamp_CreatedOn=" + timeStamp_CreatedOn +
                ", timeStamp_LastChangedBy='" + timeStamp_LastChangedBy + '\'' +
                ", timeStamp_LastChangedOn=" + timeStamp_LastChangedOn +
                '}';
    }
}
