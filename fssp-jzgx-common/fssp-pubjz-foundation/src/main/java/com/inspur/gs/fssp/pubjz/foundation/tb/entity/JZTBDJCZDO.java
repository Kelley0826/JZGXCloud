package com.inspur.gs.fssp.pubjz.foundation.tb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangshaoshuai
 * @since 2019/11/29 17:03
 */
@Entity
@Data
@Table(name="tbdjcz")
public class JZTBDJCZDO {
    /**
     * 操作编号
     */
    @Id
    private String tbdjcz_code;
    /**
     * 单据类型
     */
    private String tbdjcz_djlxid;
    /**
     * 单据状态
     */
    private String tbdjcz_djzt;
    /**
     * 关联条件
     */
    private String tbdjcz_gltj;
    /**
     * 是否冲销
     */
    private char tbdjcz_ifcx;
    /**
     * 是否冲销操作
     */
    private char tbdjcz_ifcxcz;
    /**
     * 是否正向操作
     */
    private char tbdjcz_ifzx;
    /**
     * 操作名称
     */
    private String tbdjcz_name;
    /**
     * 备注
     */
    private String tbdjcz_note;
    /**
     * 单据入口状态
     */
    private String tbdjcz_rkzt;
    /**
     * 序号
     */
    private String tbdjcz_xh;
    /**
     * 条件
     */
    private String tbdjcz_zttj;
    /**
     * 正向操作序号
     */
    private String tbdjcz_zxczxh;
    private String tbdjcz_czid;
    private String tbdjcz_bizobjid;
    private char tbdjcz_ifuse;


    /**
     * 获取 操作编号
     *
     * @return tbdjcz_code 操作编号
     */
    public String getTbdjcz_code() {
        return this.tbdjcz_code;
    }

    /**
     * 设置 操作编号
     *
     * @param tbdjcz_code 操作编号
     */
    public void setTbdjcz_code(String tbdjcz_code) {
        this.tbdjcz_code = tbdjcz_code;
    }

    /**
     * 获取 单据类型
     *
     * @return tbdjcz_djlxid 单据类型
     */
    public String getTbdjcz_djlxid() {
        return this.tbdjcz_djlxid;
    }

    /**
     * 设置 单据类型
     *
     * @param tbdjcz_djlxid 单据类型
     */
    public void setTbdjcz_djlxid(String tbdjcz_djlxid) {
        this.tbdjcz_djlxid = tbdjcz_djlxid;
    }

    /**
     * 获取 单据状态
     *
     * @return tbdjcz_djzt 单据状态
     */
    public String getTbdjcz_djzt() {
        return this.tbdjcz_djzt;
    }

    /**
     * 设置 单据状态
     *
     * @param tbdjcz_djzt 单据状态
     */
    public void setTbdjcz_djzt(String tbdjcz_djzt) {
        this.tbdjcz_djzt = tbdjcz_djzt;
    }

    /**
     * 获取 关联条件
     *
     * @return tbdjcz_gltj 关联条件
     */
    public String getTbdjcz_gltj() {
        return this.tbdjcz_gltj;
    }

    /**
     * 设置 关联条件
     *
     * @param tbdjcz_gltj 关联条件
     */
    public void setTbdjcz_gltj(String tbdjcz_gltj) {
        this.tbdjcz_gltj = tbdjcz_gltj;
    }

    /**
     * 获取 是否冲销
     *
     * @return tbdjcz_ifcx 是否冲销
     */
    public char getTbdjcz_ifcx() {
        return this.tbdjcz_ifcx;
    }

    /**
     * 设置 是否冲销
     *
     * @param tbdjcz_ifcx 是否冲销
     */
    public void setTbdjcz_ifcx(char tbdjcz_ifcx) {
        this.tbdjcz_ifcx = tbdjcz_ifcx;
    }

    /**
     * 获取 是否冲销操作
     *
     * @return tbdjcz_ifcxcz 是否冲销操作
     */
    public char getTbdjcz_ifcxcz() {
        return this.tbdjcz_ifcxcz;
    }

    /**
     * 设置 是否冲销操作
     *
     * @param tbdjcz_ifcxcz 是否冲销操作
     */
    public void setTbdjcz_ifcxcz(char tbdjcz_ifcxcz) {
        this.tbdjcz_ifcxcz = tbdjcz_ifcxcz;
    }

    /**
     * 获取 是否正向操作
     *
     * @return tbdjcz_ifzx 是否正向操作
     */
    public char getTbdjcz_ifzx() {
        return this.tbdjcz_ifzx;
    }

    /**
     * 设置 是否正向操作
     *
     * @param tbdjcz_ifzx 是否正向操作
     */
    public void setTbdjcz_ifzx(char tbdjcz_ifzx) {
        this.tbdjcz_ifzx = tbdjcz_ifzx;
    }

    /**
     * 获取 操作名称
     *
     * @return tbdjcz_name 操作名称
     */
    public String getTbdjcz_name() {
        return this.tbdjcz_name;
    }

    /**
     * 设置 操作名称
     *
     * @param tbdjcz_name 操作名称
     */
    public void setTbdjcz_name(String tbdjcz_name) {
        this.tbdjcz_name = tbdjcz_name;
    }

    /**
     * 获取 备注
     *
     * @return tbdjcz_note 备注
     */
    public String getTbdjcz_note() {
        return this.tbdjcz_note;
    }

    /**
     * 设置 备注
     *
     * @param tbdjcz_note 备注
     */
    public void setTbdjcz_note(String tbdjcz_note) {
        this.tbdjcz_note = tbdjcz_note;
    }

    /**
     * 获取 单据入口状态
     *
     * @return tbdjcz_rkzt 单据入口状态
     */
    public String getTbdjcz_rkzt() {
        return this.tbdjcz_rkzt;
    }

    /**
     * 设置 单据入口状态
     *
     * @param tbdjcz_rkzt 单据入口状态
     */
    public void setTbdjcz_rkzt(String tbdjcz_rkzt) {
        this.tbdjcz_rkzt = tbdjcz_rkzt;
    }

    /**
     * 获取 序号
     *
     * @return tbdjcz_xh 序号
     */
    public String getTbdjcz_xh() {
        return this.tbdjcz_xh;
    }

    /**
     * 设置 序号
     *
     * @param tbdjcz_xh 序号
     */
    public void setTbdjcz_xh(String tbdjcz_xh) {
        this.tbdjcz_xh = tbdjcz_xh;
    }

    /**
     * 获取 条件
     *
     * @return tbdjcz_zttj 条件
     */
    public String getTbdjcz_zttj() {
        return this.tbdjcz_zttj;
    }

    /**
     * 设置 条件
     *
     * @param tbdjcz_zttj 条件
     */
    public void setTbdjcz_zttj(String tbdjcz_zttj) {
        this.tbdjcz_zttj = tbdjcz_zttj;
    }

    /**
     * 获取 正向操作序号
     *
     * @return tbdjcz_zxczxh 正向操作序号
     */
    public String getTbdjcz_zxczxh() {
        return this.tbdjcz_zxczxh;
    }

    /**
     * 设置 正向操作序号
     *
     * @param tbdjcz_zxczxh 正向操作序号
     */
    public void setTbdjcz_zxczxh(String tbdjcz_zxczxh) {
        this.tbdjcz_zxczxh = tbdjcz_zxczxh;
    }

    /**
     * 获取
     *
     * @return tbdjcz_czid
     */
    public String getTbdjcz_czid() {
        return this.tbdjcz_czid;
    }

    /**
     * 设置
     *
     * @param tbdjcz_czid
     */
    public void setTbdjcz_czid(String tbdjcz_czid) {
        this.tbdjcz_czid = tbdjcz_czid;
    }

    /**
     * 获取
     *
     * @return tbdjcz_bizobjid
     */
    public String getTbdjcz_bizobjid() {
        return this.tbdjcz_bizobjid;
    }

    /**
     * 设置
     *
     * @param tbdjcz_bizobjid
     */
    public void setTbdjcz_bizobjid(String tbdjcz_bizobjid) {
        this.tbdjcz_bizobjid = tbdjcz_bizobjid;
    }

    /**
     * 获取
     *
     * @return tbdjcz_ifuse
     */
    public char getTbdjcz_ifuse() {
        return this.tbdjcz_ifuse;
    }

    /**
     * 设置
     *
     * @param tbdjcz_ifuse
     */
    public void setTbdjcz_ifuse(char tbdjcz_ifuse) {
        this.tbdjcz_ifuse = tbdjcz_ifuse;
    }

    @Override
    public String toString() {
        return "TBDJCZDO{" +
                "tbdjcz_code='" + tbdjcz_code + '\'' +
                ", tbdjcz_djlxid='" + tbdjcz_djlxid + '\'' +
                ", tbdjcz_djzt='" + tbdjcz_djzt + '\'' +
                ", tbdjcz_gltj='" + tbdjcz_gltj + '\'' +
                ", tbdjcz_ifcx=" + tbdjcz_ifcx +
                ", tbdjcz_ifcxcz=" + tbdjcz_ifcxcz +
                ", tbdjcz_ifzx=" + tbdjcz_ifzx +
                ", tbdjcz_name='" + tbdjcz_name + '\'' +
                ", tbdjcz_note='" + tbdjcz_note + '\'' +
                ", tbdjcz_rkzt='" + tbdjcz_rkzt + '\'' +
                ", tbdjcz_xh='" + tbdjcz_xh + '\'' +
                ", tbdjcz_zttj='" + tbdjcz_zttj + '\'' +
                ", tbdjcz_zxczxh='" + tbdjcz_zxczxh + '\'' +
                ", tbdjcz_czid='" + tbdjcz_czid + '\'' +
                ", tbdjcz_bizobjid='" + tbdjcz_bizobjid + '\'' +
                ", tbdjcz_ifuse=" + tbdjcz_ifuse +
                '}';
    }
}
