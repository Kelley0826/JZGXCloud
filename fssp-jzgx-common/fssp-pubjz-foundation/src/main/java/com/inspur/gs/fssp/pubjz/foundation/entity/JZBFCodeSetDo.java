package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author jiangshsh
 * @since 2019-8-7
 * 城市
 */
public class JZBFCodeSetDo {
    /**
     * 内码
     */
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 编号长度
     */
    private String codelength;

    private String codestructure;
    private char issyspreset;
    /**
     * 是否是树形
     */
    private String istree;
    /**
     * 名称
     */
    private String name_chs;
    /**
     * 名称
     */
    private String name_cht;
    /**
     * 名称
     */
    private String name_en;
    /**
     * 名称
     */
    private String name_es;
    /**
     * 名称
     */
    private String name_pt;
    /**
     * 备注
     */
    private String remark;
    private String separator;
    private String standardlevel;
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
     * 类型ID
     */
    private String typeid;


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
     * 获取 编号长度
     *
     * @return codelength 编号长度
     */
    public String getCodelength() {
        return this.codelength;
    }

    /**
     * 设置 编号长度
     *
     * @param codelength 编号长度
     */
    public void setCodelength(String codelength) {
        this.codelength = codelength;
    }

    /**
     * 获取
     *
     * @return codestructure
     */
    public String getCodestructure() {
        return this.codestructure;
    }

    /**
     * 设置
     *
     * @param codestructure
     */
    public void setCodestructure(String codestructure) {
        this.codestructure = codestructure;
    }

    /**
     * 获取
     *
     * @return issyspreset
     */
    public char getIssyspreset() {
        return this.issyspreset;
    }

    /**
     * 设置
     *
     * @param issyspreset
     */
    public void setIssyspreset(char issyspreset) {
        this.issyspreset = issyspreset;
    }

    /**
     * 获取 是否是树形
     *
     * @return istree 是否是树形
     */
    public String getIstree() {
        return this.istree;
    }

    /**
     * 设置 是否是树形
     *
     * @param istree 是否是树形
     */
    public void setIstree(String istree) {
        this.istree = istree;
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
     * 获取 名称
     *
     * @return name_cht 名称
     */
    public String getName_cht() {
        return this.name_cht;
    }

    /**
     * 设置 名称
     *
     * @param name_cht 名称
     */
    public void setName_cht(String name_cht) {
        this.name_cht = name_cht;
    }

    /**
     * 获取 名称
     *
     * @return name_en 名称
     */
    public String getName_en() {
        return this.name_en;
    }

    /**
     * 设置 名称
     *
     * @param name_en 名称
     */
    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    /**
     * 获取 名称
     *
     * @return name_es 名称
     */
    public String getName_es() {
        return this.name_es;
    }

    /**
     * 设置 名称
     *
     * @param name_es 名称
     */
    public void setName_es(String name_es) {
        this.name_es = name_es;
    }

    /**
     * 获取 名称
     *
     * @return name_pt 名称
     */
    public String getName_pt() {
        return this.name_pt;
    }

    /**
     * 设置 名称
     *
     * @param name_pt 名称
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
     * 获取
     *
     * @return separator
     */
    public String getSeparator() {
        return this.separator;
    }

    /**
     * 设置
     *
     * @param separator
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * 获取
     *
     * @return standardlevel
     */
    public String getStandardlevel() {
        return this.standardlevel;
    }

    /**
     * 设置
     *
     * @param standardlevel
     */
    public void setStandardlevel(String standardlevel) {
        this.standardlevel = standardlevel;
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
     * 获取 类型ID
     *
     * @return typeid 类型ID
     */
    public String getTypeid() {
        return this.typeid;
    }

    /**
     * 设置 类型ID
     *
     * @param typeid 类型ID
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    @Override
    public String toString() {
        return "BFCodeSetDo{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", codelength='" + codelength + '\'' +
                ", codestructure='" + codestructure + '\'' +
                ", issyspreset=" + issyspreset +
                ", istree='" + istree + '\'' +
                ", name_chs='" + name_chs + '\'' +
                ", name_cht='" + name_cht + '\'' +
                ", name_en='" + name_en + '\'' +
                ", name_es='" + name_es + '\'' +
                ", name_pt='" + name_pt + '\'' +
                ", remark='" + remark + '\'' +
                ", separator='" + separator + '\'' +
                ", standardlevel='" + standardlevel + '\'' +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                ", typeid='" + typeid + '\'' +
                '}';
    }
}
