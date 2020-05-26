package com.inspur.gs.fssp.pubjz.foundation.tb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangshaoshuai
 * @since 2019/11/29 16:39
 * 预算-   TBYWLC(业务流程表)
 */
@Entity
@Data
@Table(name="tbywlc")
public class JZTBYWLCDO {

    /**
     * 编号
     */
    @Id
    private String tbywlc_code;
    /**
     * 单据类型id
     */
    private String tbywlc_djlx;
    /**
     * 模块
     */
    private String tbywlc_mk;
    /**
     * 名称
     */
    private String tbywlc_name;
    /**
     * 说明
     */
    private String tbywlc_note;
    /**
     * 业务对象id
     */
    private String tbywlc_objid;
    /**
     * 父节点
     */
    private String tbywlc_parentnodeid;
    /**
     * 流程id
     */
    private String tbywlc_lcid;
    private String tbywlc_bizobjid;
    private String tbywlc_globj;
    private char tbywlc_isdetail;
    private Integer tbywlc_layer;
    private String tbywlc_path;
    private Integer tbywlc_sortorder;
    private char tbywlc_sysinit;
    private String tbywlc_url;


    /**
     * 获取 编号
     *
     * @return tbywlc_code 编号
     */
    public String getTbywlc_code() {
        return this.tbywlc_code;
    }

    /**
     * 设置 编号
     *
     * @param tbywlc_code 编号
     */
    public void setTbywlc_code(String tbywlc_code) {
        this.tbywlc_code = tbywlc_code;
    }

    /**
     * 获取 单据类型id
     *
     * @return tbywlc_djlx 单据类型id
     */
    public String getTbywlc_djlx() {
        return this.tbywlc_djlx;
    }

    /**
     * 设置 单据类型id
     *
     * @param tbywlc_djlx 单据类型id
     */
    public void setTbywlc_djlx(String tbywlc_djlx) {
        this.tbywlc_djlx = tbywlc_djlx;
    }

    /**
     * 获取 模块
     *
     * @return tbywlc_mk 模块
     */
    public String getTbywlc_mk() {
        return this.tbywlc_mk;
    }

    /**
     * 设置 模块
     *
     * @param tbywlc_mk 模块
     */
    public void setTbywlc_mk(String tbywlc_mk) {
        this.tbywlc_mk = tbywlc_mk;
    }

    /**
     * 获取 名称
     *
     * @return tbywlc_name 名称
     */
    public String getTbywlc_name() {
        return this.tbywlc_name;
    }

    /**
     * 设置 名称
     *
     * @param tbywlc_name 名称
     */
    public void setTbywlc_name(String tbywlc_name) {
        this.tbywlc_name = tbywlc_name;
    }

    /**
     * 获取 说明
     *
     * @return tbywlc_note 说明
     */
    public String getTbywlc_note() {
        return this.tbywlc_note;
    }

    /**
     * 设置 说明
     *
     * @param tbywlc_note 说明
     */
    public void setTbywlc_note(String tbywlc_note) {
        this.tbywlc_note = tbywlc_note;
    }

    /**
     * 获取 业务对象id
     *
     * @return tbywlc_objid 业务对象id
     */
    public String getTbywlc_objid() {
        return this.tbywlc_objid;
    }

    /**
     * 设置 业务对象id
     *
     * @param tbywlc_objid 业务对象id
     */
    public void setTbywlc_objid(String tbywlc_objid) {
        this.tbywlc_objid = tbywlc_objid;
    }

    /**
     * 获取 父节点
     *
     * @return tbywlc_parentnodeid 父节点
     */
    public String getTbywlc_parentnodeid() {
        return this.tbywlc_parentnodeid;
    }

    /**
     * 设置 父节点
     *
     * @param tbywlc_parentnodeid 父节点
     */
    public void setTbywlc_parentnodeid(String tbywlc_parentnodeid) {
        this.tbywlc_parentnodeid = tbywlc_parentnodeid;
    }

    /**
     * 获取 流程id
     *
     * @return tbywlc_lcid 流程id
     */
    public String getTbywlc_lcid() {
        return this.tbywlc_lcid;
    }

    /**
     * 设置 流程id
     *
     * @param tbywlc_lcid 流程id
     */
    public void setTbywlc_lcid(String tbywlc_lcid) {
        this.tbywlc_lcid = tbywlc_lcid;
    }

    /**
     * 获取
     *
     * @return tbywlc_bizobjid
     */
    public String getTbywlc_bizobjid() {
        return this.tbywlc_bizobjid;
    }

    /**
     * 设置
     *
     * @param tbywlc_bizobjid
     */
    public void setTbywlc_bizobjid(String tbywlc_bizobjid) {
        this.tbywlc_bizobjid = tbywlc_bizobjid;
    }

    /**
     * 获取
     *
     * @return tbywlc_globj
     */
    public String getTbywlc_globj() {
        return this.tbywlc_globj;
    }

    /**
     * 设置
     *
     * @param tbywlc_globj
     */
    public void setTbywlc_globj(String tbywlc_globj) {
        this.tbywlc_globj = tbywlc_globj;
    }

    /**
     * 获取
     *
     * @return tbywlc_isdetail
     */
    public char getTbywlc_isdetail() {
        return this.tbywlc_isdetail;
    }

    /**
     * 设置
     *
     * @param tbywlc_isdetail
     */
    public void setTbywlc_isdetail(char tbywlc_isdetail) {
        this.tbywlc_isdetail = tbywlc_isdetail;
    }

    /**
     * 获取
     *
     * @return tbywlc_layer
     */
    public Integer getTbywlc_layer() {
        return this.tbywlc_layer;
    }

    /**
     * 设置
     *
     * @param tbywlc_layer
     */
    public void setTbywlc_layer(Integer tbywlc_layer) {
        this.tbywlc_layer = tbywlc_layer;
    }

    /**
     * 获取
     *
     * @return tbywlc_path
     */
    public String getTbywlc_path() {
        return this.tbywlc_path;
    }

    /**
     * 设置
     *
     * @param tbywlc_path
     */
    public void setTbywlc_path(String tbywlc_path) {
        this.tbywlc_path = tbywlc_path;
    }

    /**
     * 获取
     *
     * @return tbywlc_sortorder
     */
    public Integer getTbywlc_sortorder() {
        return this.tbywlc_sortorder;
    }

    /**
     * 设置
     *
     * @param tbywlc_sortorder
     */
    public void setTbywlc_sortorder(Integer tbywlc_sortorder) {
        this.tbywlc_sortorder = tbywlc_sortorder;
    }

    /**
     * 获取
     *
     * @return tbywlc_sysinit
     */
    public char getTbywlc_sysinit() {
        return this.tbywlc_sysinit;
    }

    /**
     * 设置
     *
     * @param tbywlc_sysinit
     */
    public void setTbywlc_sysinit(char tbywlc_sysinit) {
        this.tbywlc_sysinit = tbywlc_sysinit;
    }

    /**
     * 获取
     *
     * @return tbywlc_url
     */
    public String getTbywlc_url() {
        return this.tbywlc_url;
    }

    /**
     * 设置
     *
     * @param tbywlc_url
     */
    public void setTbywlc_url(String tbywlc_url) {
        this.tbywlc_url = tbywlc_url;
    }

    @Override
    public String toString() {
        return "TBYWLCDO{" +
                "tbywlc_code='" + tbywlc_code + '\'' +
                ", tbywlc_djlx='" + tbywlc_djlx + '\'' +
                ", tbywlc_mk='" + tbywlc_mk + '\'' +
                ", tbywlc_name='" + tbywlc_name + '\'' +
                ", tbywlc_note='" + tbywlc_note + '\'' +
                ", tbywlc_objid='" + tbywlc_objid + '\'' +
                ", tbywlc_parentnodeid='" + tbywlc_parentnodeid + '\'' +
                ", tbywlc_lcid='" + tbywlc_lcid + '\'' +
                ", tbywlc_bizobjid='" + tbywlc_bizobjid + '\'' +
                ", tbywlc_globj='" + tbywlc_globj + '\'' +
                ", tbywlc_isdetail=" + tbywlc_isdetail +
                ", tbywlc_layer=" + tbywlc_layer +
                ", tbywlc_path='" + tbywlc_path + '\'' +
                ", tbywlc_sortorder=" + tbywlc_sortorder +
                ", tbywlc_sysinit=" + tbywlc_sysinit +
                ", tbywlc_url='" + tbywlc_url + '\'' +
                '}';
    }
}
