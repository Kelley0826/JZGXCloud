package com.inspur.gs.fssp.pubjz.foundation.tb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangshaoshuai
 * @since 2019/11/29 16:55
 */
@Entity
@Data
@Table(name="tbdjxx")
public class JZTBDJXXDO {
    /**
     * 单据类型
     */
    @Id
    private String tbdjxx_djlx;
    /**
     * 主键字段
     */
    private String tbdjxx_pkeyzd;
    /**
     * 单据编号字段
     */
    private String tbdjxx_djbhzd;
    /**
     * 单据备注字段
     */
    private String tbdjxx_djbzzd;
    /**
     * 单据分录字段
     */
    private String tbdjxx_djflzd;
    /**
     * 单据内码字段
     */
    private String tbdjxx_djnmzd;
    /**
     * 单据日期字段
     */
    private String tbdjxx_djrqzd;
    /**
     * 单据说明字段
     */
    private String tbdjxx_djsmzd;
    /**
     * 制单人字段
     */
    private String tbdjxx_zdrzd;
    /**
     * 单位编号字段
     */
    private String tbdjxx_dwbhzd;
    /**
     * 类型名称
     */
    private String tbdjxx_lxmc;
    /**
     * 部门字段
     */
    private String tbdjxx_bmzd;
    /**
     * 单据状态字段
     */
    private String tbdjxx_djztzd;
    /**
     * 来源单据编号字段
     */
    private String tbdjxx_lydjbhzd;
    /**
     * 来源单据类型
     */
    private String tbdjxx_lydjlx;
    /**
     * 来源单据字段
     */
    private String tbdjxx_lydjzd;
    private String tbdjxx_assembly;
    private String tbdjxx_class;
    private String tbdjxx_djlxzd;
    private String tbdjxx_downloadid;
    private String tbdjxx_gjnm;
    private String tbdjxx_lcfs;


    /**
     * 获取 单据类型
     *
     * @return tbdjxx_djlx 单据类型
     */
    public String getTbdjxx_djlx() {
        return this.tbdjxx_djlx;
    }

    /**
     * 设置 单据类型
     *
     * @param tbdjxx_djlx 单据类型
     */
    public void setTbdjxx_djlx(String tbdjxx_djlx) {
        this.tbdjxx_djlx = tbdjxx_djlx;
    }

    /**
     * 获取 主键字段
     *
     * @return tbdjxx_pkeyzd 主键字段
     */
    public String getTbdjxx_pkeyzd() {
        return this.tbdjxx_pkeyzd;
    }

    /**
     * 设置 主键字段
     *
     * @param tbdjxx_pkeyzd 主键字段
     */
    public void setTbdjxx_pkeyzd(String tbdjxx_pkeyzd) {
        this.tbdjxx_pkeyzd = tbdjxx_pkeyzd;
    }

    /**
     * 获取 单据编号字段
     *
     * @return tbdjxx_djbhzd 单据编号字段
     */
    public String getTbdjxx_djbhzd() {
        return this.tbdjxx_djbhzd;
    }

    /**
     * 设置 单据编号字段
     *
     * @param tbdjxx_djbhzd 单据编号字段
     */
    public void setTbdjxx_djbhzd(String tbdjxx_djbhzd) {
        this.tbdjxx_djbhzd = tbdjxx_djbhzd;
    }

    /**
     * 获取 单据备注字段
     *
     * @return tbdjxx_djbzzd 单据备注字段
     */
    public String getTbdjxx_djbzzd() {
        return this.tbdjxx_djbzzd;
    }

    /**
     * 设置 单据备注字段
     *
     * @param tbdjxx_djbzzd 单据备注字段
     */
    public void setTbdjxx_djbzzd(String tbdjxx_djbzzd) {
        this.tbdjxx_djbzzd = tbdjxx_djbzzd;
    }

    /**
     * 获取 单据分录字段
     *
     * @return tbdjxx_djflzd 单据分录字段
     */
    public String getTbdjxx_djflzd() {
        return this.tbdjxx_djflzd;
    }

    /**
     * 设置 单据分录字段
     *
     * @param tbdjxx_djflzd 单据分录字段
     */
    public void setTbdjxx_djflzd(String tbdjxx_djflzd) {
        this.tbdjxx_djflzd = tbdjxx_djflzd;
    }

    /**
     * 获取 单据内码字段
     *
     * @return tbdjxx_djnmzd 单据内码字段
     */
    public String getTbdjxx_djnmzd() {
        return this.tbdjxx_djnmzd;
    }

    /**
     * 设置 单据内码字段
     *
     * @param tbdjxx_djnmzd 单据内码字段
     */
    public void setTbdjxx_djnmzd(String tbdjxx_djnmzd) {
        this.tbdjxx_djnmzd = tbdjxx_djnmzd;
    }

    /**
     * 获取 单据日期字段
     *
     * @return tbdjxx_djrqzd 单据日期字段
     */
    public String getTbdjxx_djrqzd() {
        return this.tbdjxx_djrqzd;
    }

    /**
     * 设置 单据日期字段
     *
     * @param tbdjxx_djrqzd 单据日期字段
     */
    public void setTbdjxx_djrqzd(String tbdjxx_djrqzd) {
        this.tbdjxx_djrqzd = tbdjxx_djrqzd;
    }

    /**
     * 获取 单据说明字段
     *
     * @return tbdjxx_djsmzd 单据说明字段
     */
    public String getTbdjxx_djsmzd() {
        return this.tbdjxx_djsmzd;
    }

    /**
     * 设置 单据说明字段
     *
     * @param tbdjxx_djsmzd 单据说明字段
     */
    public void setTbdjxx_djsmzd(String tbdjxx_djsmzd) {
        this.tbdjxx_djsmzd = tbdjxx_djsmzd;
    }

    /**
     * 获取 制单人字段
     *
     * @return tbdjxx_zdrzd 制单人字段
     */
    public String getTbdjxx_zdrzd() {
        return this.tbdjxx_zdrzd;
    }

    /**
     * 设置 制单人字段
     *
     * @param tbdjxx_zdrzd 制单人字段
     */
    public void setTbdjxx_zdrzd(String tbdjxx_zdrzd) {
        this.tbdjxx_zdrzd = tbdjxx_zdrzd;
    }

    /**
     * 获取 单位编号字段
     *
     * @return tbdjxx_dwbhzd 单位编号字段
     */
    public String getTbdjxx_dwbhzd() {
        return this.tbdjxx_dwbhzd;
    }

    /**
     * 设置 单位编号字段
     *
     * @param tbdjxx_dwbhzd 单位编号字段
     */
    public void setTbdjxx_dwbhzd(String tbdjxx_dwbhzd) {
        this.tbdjxx_dwbhzd = tbdjxx_dwbhzd;
    }

    /**
     * 获取 类型名称
     *
     * @return tbdjxx_lxmc 类型名称
     */
    public String getTbdjxx_lxmc() {
        return this.tbdjxx_lxmc;
    }

    /**
     * 设置 类型名称
     *
     * @param tbdjxx_lxmc 类型名称
     */
    public void setTbdjxx_lxmc(String tbdjxx_lxmc) {
        this.tbdjxx_lxmc = tbdjxx_lxmc;
    }

    /**
     * 获取 部门字段
     *
     * @return tbdjxx_bmzd 部门字段
     */
    public String getTbdjxx_bmzd() {
        return this.tbdjxx_bmzd;
    }

    /**
     * 设置 部门字段
     *
     * @param tbdjxx_bmzd 部门字段
     */
    public void setTbdjxx_bmzd(String tbdjxx_bmzd) {
        this.tbdjxx_bmzd = tbdjxx_bmzd;
    }

    /**
     * 获取 单据状态字段
     *
     * @return tbdjxx_djztzd 单据状态字段
     */
    public String getTbdjxx_djztzd() {
        return this.tbdjxx_djztzd;
    }

    /**
     * 设置 单据状态字段
     *
     * @param tbdjxx_djztzd 单据状态字段
     */
    public void setTbdjxx_djztzd(String tbdjxx_djztzd) {
        this.tbdjxx_djztzd = tbdjxx_djztzd;
    }

    /**
     * 获取 来源单据编号字段
     *
     * @return tbdjxx_lydjbhzd 来源单据编号字段
     */
    public String getTbdjxx_lydjbhzd() {
        return this.tbdjxx_lydjbhzd;
    }

    /**
     * 设置 来源单据编号字段
     *
     * @param tbdjxx_lydjbhzd 来源单据编号字段
     */
    public void setTbdjxx_lydjbhzd(String tbdjxx_lydjbhzd) {
        this.tbdjxx_lydjbhzd = tbdjxx_lydjbhzd;
    }

    /**
     * 获取 来源单据类型
     *
     * @return tbdjxx_lydjlx 来源单据类型
     */
    public String getTbdjxx_lydjlx() {
        return this.tbdjxx_lydjlx;
    }

    /**
     * 设置 来源单据类型
     *
     * @param tbdjxx_lydjlx 来源单据类型
     */
    public void setTbdjxx_lydjlx(String tbdjxx_lydjlx) {
        this.tbdjxx_lydjlx = tbdjxx_lydjlx;
    }

    /**
     * 获取 来源单据字段
     *
     * @return tbdjxx_lydjzd 来源单据字段
     */
    public String getTbdjxx_lydjzd() {
        return this.tbdjxx_lydjzd;
    }

    /**
     * 设置 来源单据字段
     *
     * @param tbdjxx_lydjzd 来源单据字段
     */
    public void setTbdjxx_lydjzd(String tbdjxx_lydjzd) {
        this.tbdjxx_lydjzd = tbdjxx_lydjzd;
    }

    /**
     * 获取
     *
     * @return tbdjxx_assembly
     */
    public String getTbdjxx_assembly() {
        return this.tbdjxx_assembly;
    }

    /**
     * 设置
     *
     * @param tbdjxx_assembly
     */
    public void setTbdjxx_assembly(String tbdjxx_assembly) {
        this.tbdjxx_assembly = tbdjxx_assembly;
    }

    /**
     * 获取
     *
     * @return tbdjxx_class
     */
    public String getTbdjxx_class() {
        return this.tbdjxx_class;
    }

    /**
     * 设置
     *
     * @param tbdjxx_class
     */
    public void setTbdjxx_class(String tbdjxx_class) {
        this.tbdjxx_class = tbdjxx_class;
    }

    /**
     * 获取
     *
     * @return tbdjxx_djlxzd
     */
    public String getTbdjxx_djlxzd() {
        return this.tbdjxx_djlxzd;
    }

    /**
     * 设置
     *
     * @param tbdjxx_djlxzd
     */
    public void setTbdjxx_djlxzd(String tbdjxx_djlxzd) {
        this.tbdjxx_djlxzd = tbdjxx_djlxzd;
    }

    /**
     * 获取
     *
     * @return tbdjxx_downloadid
     */
    public String getTbdjxx_downloadid() {
        return this.tbdjxx_downloadid;
    }

    /**
     * 设置
     *
     * @param tbdjxx_downloadid
     */
    public void setTbdjxx_downloadid(String tbdjxx_downloadid) {
        this.tbdjxx_downloadid = tbdjxx_downloadid;
    }

    /**
     * 获取
     *
     * @return tbdjxx_gjnm
     */
    public String getTbdjxx_gjnm() {
        return this.tbdjxx_gjnm;
    }

    /**
     * 设置
     *
     * @param tbdjxx_gjnm
     */
    public void setTbdjxx_gjnm(String tbdjxx_gjnm) {
        this.tbdjxx_gjnm = tbdjxx_gjnm;
    }

    /**
     * 获取
     *
     * @return tbdjxx_lcfs
     */
    public String getTbdjxx_lcfs() {
        return this.tbdjxx_lcfs;
    }

    /**
     * 设置
     *
     * @param tbdjxx_lcfs
     */
    public void setTbdjxx_lcfs(String tbdjxx_lcfs) {
        this.tbdjxx_lcfs = tbdjxx_lcfs;
    }

    @Override
    public String toString() {
        return "TBDJXXDO{" +
                "tbdjxx_djlx='" + tbdjxx_djlx + '\'' +
                ", tbdjxx_pkeyzd='" + tbdjxx_pkeyzd + '\'' +
                ", tbdjxx_djbhzd='" + tbdjxx_djbhzd + '\'' +
                ", tbdjxx_djbzzd='" + tbdjxx_djbzzd + '\'' +
                ", tbdjxx_djflzd='" + tbdjxx_djflzd + '\'' +
                ", tbdjxx_djnmzd='" + tbdjxx_djnmzd + '\'' +
                ", tbdjxx_djrqzd='" + tbdjxx_djrqzd + '\'' +
                ", tbdjxx_djsmzd='" + tbdjxx_djsmzd + '\'' +
                ", tbdjxx_zdrzd='" + tbdjxx_zdrzd + '\'' +
                ", tbdjxx_dwbhzd='" + tbdjxx_dwbhzd + '\'' +
                ", tbdjxx_lxmc='" + tbdjxx_lxmc + '\'' +
                ", tbdjxx_bmzd='" + tbdjxx_bmzd + '\'' +
                ", tbdjxx_djztzd='" + tbdjxx_djztzd + '\'' +
                ", tbdjxx_lydjbhzd='" + tbdjxx_lydjbhzd + '\'' +
                ", tbdjxx_lydjlx='" + tbdjxx_lydjlx + '\'' +
                ", tbdjxx_lydjzd='" + tbdjxx_lydjzd + '\'' +
                ", tbdjxx_assembly='" + tbdjxx_assembly + '\'' +
                ", tbdjxx_class='" + tbdjxx_class + '\'' +
                ", tbdjxx_djlxzd='" + tbdjxx_djlxzd + '\'' +
                ", tbdjxx_downloadid='" + tbdjxx_downloadid + '\'' +
                ", tbdjxx_gjnm='" + tbdjxx_gjnm + '\'' +
                ", tbdjxx_lcfs='" + tbdjxx_lcfs + '\'' +
                '}';
    }
}
