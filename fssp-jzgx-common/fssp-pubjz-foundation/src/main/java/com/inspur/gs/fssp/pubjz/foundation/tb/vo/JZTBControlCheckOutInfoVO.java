package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

/**
 * 预算输出具体信息，格式化的数据
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBControlCheckOutInfoVO {

    private String TBKZXX_KZFS;

    /**
     * 预算表
     */
    private String TBKZXX_MXMC;

    /**
     * 预算组织
     */
    private String TBKZXX_DX01MC;

    /**
     * 预算科目
     */
    private String TBKZXX_DX02MC;

    /**
     * 预算期间
     */
    private String TBKZXX_DX03MC;

    /**
     * 其他维度
     */
    private String TBKZXX_DXMC;

    /**
     * 执行数
     */
    private String TBKZXX_ZXDATA;

    /**
     * 预算数
     */
    private String TBKZXX_YSDATA;

    /**
     * 占用数
     */
    private String TBKZXX_ZYDATA;

    /**
     * 比较符
     */
    private String TBKZXX_BJF;

    /**
     * 差额
     */
    private String TBKZXX_CE;

    /**
     * 比率
     */
    private String TBKZXX_SJBL;

    private String TBKZXX_YJBL;

    /**
     * 备注
     */
    private String TBKZXX_NOTE;

    /**
     * 控制类别
     */
    private String TBKZXX_KZLB;

    /**
     * 控制类型
     */
    private String TBKZXX_KZLX;

    private String TBYWDY_DYMC;

    private String TBBBDY_DYBH;

    private String TBBBDY_DYMC;

    private String TBKZXX_MXNM;

    private String TBKZXX_DANM;

    private String TBKZXX_USER;

    public String getTBKZXX_KZFS() {
        return TBKZXX_KZFS;
    }

    public void setTBKZXX_KZFS(String TBKZXX_KZFS) {
        this.TBKZXX_KZFS = TBKZXX_KZFS;
    }

    public String getTBKZXX_MXMC() {
        return TBKZXX_MXMC;
    }

    public void setTBKZXX_MXMC(String TBKZXX_MXMC) {
        this.TBKZXX_MXMC = TBKZXX_MXMC;
    }

    public String getTBKZXX_DX01MC() {
        return TBKZXX_DX01MC;
    }

    public void setTBKZXX_DX01MC(String TBKZXX_DX01MC) {
        this.TBKZXX_DX01MC = TBKZXX_DX01MC;
    }

    public String getTBKZXX_DX02MC() {
        return TBKZXX_DX02MC;
    }

    public void setTBKZXX_DX02MC(String TBKZXX_DX02MC) {
        this.TBKZXX_DX02MC = TBKZXX_DX02MC;
    }

    public String getTBKZXX_DX03MC() {
        return TBKZXX_DX03MC;
    }

    public void setTBKZXX_DX03MC(String TBKZXX_DX03MC) {
        this.TBKZXX_DX03MC = TBKZXX_DX03MC;
    }

    public String getTBKZXX_DXMC() {
        return TBKZXX_DXMC;
    }

    public void setTBKZXX_DXMC(String TBKZXX_DXMC) {
        this.TBKZXX_DXMC = TBKZXX_DXMC;
    }

    public String getTBKZXX_ZXDATA() {
        return TBKZXX_ZXDATA;
    }

    public void setTBKZXX_ZXDATA(String TBKZXX_ZXDATA) {
        this.TBKZXX_ZXDATA = TBKZXX_ZXDATA;
    }

    public String getTBKZXX_YSDATA() {
        return TBKZXX_YSDATA;
    }

    public void setTBKZXX_YSDATA(String TBKZXX_YSDATA) {
        this.TBKZXX_YSDATA = TBKZXX_YSDATA;
    }

    public String getTBKZXX_ZYDATA() {
        return TBKZXX_ZYDATA;
    }

    public void setTBKZXX_ZYDATA(String TBKZXX_ZYDATA) {
        this.TBKZXX_ZYDATA = TBKZXX_ZYDATA;
    }

    public String getTBKZXX_BJF() {
        return TBKZXX_BJF;
    }

    public void setTBKZXX_BJF(String TBKZXX_BJF) {
        this.TBKZXX_BJF = TBKZXX_BJF;
    }

    public String getTBKZXX_CE() {
        return TBKZXX_CE;
    }

    public void setTBKZXX_CE(String TBKZXX_CE) {
        this.TBKZXX_CE = TBKZXX_CE;
    }

    public String getTBKZXX_SJBL() {
        return TBKZXX_SJBL;
    }

    public void setTBKZXX_SJBL(String TBKZXX_SJBL) {
        this.TBKZXX_SJBL = TBKZXX_SJBL;
    }

    public String getTBKZXX_YJBL() {
        return TBKZXX_YJBL;
    }

    public void setTBKZXX_YJBL(String TBKZXX_YJBL) {
        this.TBKZXX_YJBL = TBKZXX_YJBL;
    }

    public String getTBKZXX_NOTE() {
        return TBKZXX_NOTE;
    }

    public void setTBKZXX_NOTE(String TBKZXX_NOTE) {
        this.TBKZXX_NOTE = TBKZXX_NOTE;
    }

    public String getTBKZXX_KZLB() {
        return TBKZXX_KZLB;
    }

    public void setTBKZXX_KZLB(String TBKZXX_KZLB) {
        this.TBKZXX_KZLB = TBKZXX_KZLB;
    }

    public String getTBKZXX_KZLX() {
        return TBKZXX_KZLX;
    }

    public void setTBKZXX_KZLX(String TBKZXX_KZLX) {
        this.TBKZXX_KZLX = TBKZXX_KZLX;
    }

    public String getTBYWDY_DYMC() {
        return TBYWDY_DYMC;
    }

    public void setTBYWDY_DYMC(String TBYWDY_DYMC) {
        this.TBYWDY_DYMC = TBYWDY_DYMC;
    }

    public String getTBBBDY_DYBH() {
        return TBBBDY_DYBH;
    }

    public void setTBBBDY_DYBH(String TBBBDY_DYBH) {
        this.TBBBDY_DYBH = TBBBDY_DYBH;
    }

    public String getTBBBDY_DYMC() {
        return TBBBDY_DYMC;
    }

    public void setTBBBDY_DYMC(String TBBBDY_DYMC) {
        this.TBBBDY_DYMC = TBBBDY_DYMC;
    }

    public String getTBKZXX_MXNM() {
        return TBKZXX_MXNM;
    }

    public void setTBKZXX_MXNM(String TBKZXX_MXNM) {
        this.TBKZXX_MXNM = TBKZXX_MXNM;
    }

    public String getTBKZXX_DANM() {
        return TBKZXX_DANM;
    }

    public void setTBKZXX_DANM(String TBKZXX_DANM) {
        this.TBKZXX_DANM = TBKZXX_DANM;
    }

    public String getTBKZXX_USER() {
        return TBKZXX_USER;
    }

    public void setTBKZXX_USER(String TBKZXX_USER) {
        this.TBKZXX_USER = TBKZXX_USER;
    }

    @Override
    public String toString() {
        return "TBControlCheckOutInfoVO{" +
                "TBKZXX_KZFS='" + TBKZXX_KZFS + '\'' +
                ", TBKZXX_MXMC='" + TBKZXX_MXMC + '\'' +
                ", TBKZXX_DX01MC='" + TBKZXX_DX01MC + '\'' +
                ", TBKZXX_DX02MC='" + TBKZXX_DX02MC + '\'' +
                ", TBKZXX_DX03MC='" + TBKZXX_DX03MC + '\'' +
                ", TBKZXX_DXMC='" + TBKZXX_DXMC + '\'' +
                ", TBKZXX_ZXDATA='" + TBKZXX_ZXDATA + '\'' +
                ", TBKZXX_YSDATA='" + TBKZXX_YSDATA + '\'' +
                ", TBKZXX_ZYDATA='" + TBKZXX_ZYDATA + '\'' +
                ", TBKZXX_BJF='" + TBKZXX_BJF + '\'' +
                ", TBKZXX_CE='" + TBKZXX_CE + '\'' +
                ", TBKZXX_SJBL='" + TBKZXX_SJBL + '\'' +
                ", TBKZXX_YJBL='" + TBKZXX_YJBL + '\'' +
                ", TBKZXX_NOTE='" + TBKZXX_NOTE + '\'' +
                ", TBKZXX_KZLB='" + TBKZXX_KZLB + '\'' +
                ", TBKZXX_KZLX='" + TBKZXX_KZLX + '\'' +
                ", TBYWDY_DYMC='" + TBYWDY_DYMC + '\'' +
                ", TBBBDY_DYBH='" + TBBBDY_DYBH + '\'' +
                ", TBBBDY_DYMC='" + TBBBDY_DYMC + '\'' +
                ", TBKZXX_MXNM='" + TBKZXX_MXNM + '\'' +
                ", TBKZXX_DANM='" + TBKZXX_DANM + '\'' +
                ", TBKZXX_USER='" + TBKZXX_USER + '\'' +
                '}';
    }
}
