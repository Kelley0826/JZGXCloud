package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 创建预算任务
 * @author jiangshaoshuai
 * @since 2019/12/10 19:34
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBCreateBusinessProcessDJCZInVO implements Serializable {
    /**
     * 操作编号
     */
    private String TBDJCZ_CODE;
    /**
     * 单据类型
     */
    private String TBDJCZ_DJLXID;
    /**
     * 单据状态
     */
    private String TBDJCZ_DJZT;
    /**
     * 关联条件
     */
    private String TBDJCZ_GLTJ;
    /**
     * 是否冲销
     */
    private char TBDJCZ_IFCX;
    /**
     * 是否冲销操作
     */
    private char TBDJCZ_IFCXCZ;
    /**
     * 是否正向操作
     */
    private char TBDJCZ_IFZX;
    /**
     * 操作名称
     */
    private String TBDJCZ_NAME;
    /**
     * 备注
     */
    private String TBDJCZ_NOTE;
    /**
     * 单据入口状态
     */
    private String TBDJCZ_RKZT;
    /**
     * 序号
     */
    private String TBDJCZ_XH;
    /**
     * 条件
     */
    private String TBDJCZ_ZTTJ;
    /**
     * 正向操作序号
     */
    private String TBDJCZ_ZXCZXH;


    /**
     * 获取 操作编号
     *
     * @return TBDJCZ_CODE 操作编号
     */
    public String getTBDJCZ_CODE() {
        return this.TBDJCZ_CODE;
    }

    /**
     * 设置 操作编号
     *
     * @param TBDJCZ_CODE 操作编号
     */
    public void setTBDJCZ_CODE(String TBDJCZ_CODE) {
        this.TBDJCZ_CODE = TBDJCZ_CODE;
    }

    /**
     * 获取 单据类型
     *
     * @return TBDJCZ_DJLXID 单据类型
     */
    public String getTBDJCZ_DJLXID() {
        return this.TBDJCZ_DJLXID;
    }

    /**
     * 设置 单据类型
     *
     * @param TBDJCZ_DJLXID 单据类型
     */
    public void setTBDJCZ_DJLXID(String TBDJCZ_DJLXID) {
        this.TBDJCZ_DJLXID = TBDJCZ_DJLXID;
    }

    /**
     * 获取 单据状态
     *
     * @return TBDJCZ_DJZT 单据状态
     */
    public String getTBDJCZ_DJZT() {
        return this.TBDJCZ_DJZT;
    }

    /**
     * 设置 单据状态
     *
     * @param TBDJCZ_DJZT 单据状态
     */
    public void setTBDJCZ_DJZT(String TBDJCZ_DJZT) {
        this.TBDJCZ_DJZT = TBDJCZ_DJZT;
    }

    /**
     * 获取 关联条件
     *
     * @return TBDJCZ_GLTJ 关联条件
     */
    public String getTBDJCZ_GLTJ() {
        return this.TBDJCZ_GLTJ;
    }

    /**
     * 设置 关联条件
     *
     * @param TBDJCZ_GLTJ 关联条件
     */
    public void setTBDJCZ_GLTJ(String TBDJCZ_GLTJ) {
        this.TBDJCZ_GLTJ = TBDJCZ_GLTJ;
    }

    /**
     * 获取 是否冲销
     *
     * @return TBDJCZ_IFCX 是否冲销
     */
    public char getTBDJCZ_IFCX() {
        return this.TBDJCZ_IFCX;
    }

    /**
     * 设置 是否冲销
     *
     * @param TBDJCZ_IFCX 是否冲销
     */
    public void setTBDJCZ_IFCX(char TBDJCZ_IFCX) {
        this.TBDJCZ_IFCX = TBDJCZ_IFCX;
    }

    /**
     * 获取 是否冲销操作
     *
     * @return TBDJCZ_IFCXCZ 是否冲销操作
     */
    public char getTBDJCZ_IFCXCZ() {
        return this.TBDJCZ_IFCXCZ;
    }

    /**
     * 设置 是否冲销操作
     *
     * @param TBDJCZ_IFCXCZ 是否冲销操作
     */
    public void setTBDJCZ_IFCXCZ(char TBDJCZ_IFCXCZ) {
        this.TBDJCZ_IFCXCZ = TBDJCZ_IFCXCZ;
    }

    /**
     * 获取 是否正向操作
     *
     * @return TBDJCZ_IFZX 是否正向操作
     */
    public char getTBDJCZ_IFZX() {
        return this.TBDJCZ_IFZX;
    }

    /**
     * 设置 是否正向操作
     *
     * @param TBDJCZ_IFZX 是否正向操作
     */
    public void setTBDJCZ_IFZX(char TBDJCZ_IFZX) {
        this.TBDJCZ_IFZX = TBDJCZ_IFZX;
    }

    /**
     * 获取 操作名称
     *
     * @return TBDJCZ_NAME 操作名称
     */
    public String getTBDJCZ_NAME() {
        return this.TBDJCZ_NAME;
    }

    /**
     * 设置 操作名称
     *
     * @param TBDJCZ_NAME 操作名称
     */
    public void setTBDJCZ_NAME(String TBDJCZ_NAME) {
        this.TBDJCZ_NAME = TBDJCZ_NAME;
    }

    /**
     * 获取 备注
     *
     * @return TBDJCZ_NOTE 备注
     */
    public String getTBDJCZ_NOTE() {
        return this.TBDJCZ_NOTE;
    }

    /**
     * 设置 备注
     *
     * @param TBDJCZ_NOTE 备注
     */
    public void setTBDJCZ_NOTE(String TBDJCZ_NOTE) {
        this.TBDJCZ_NOTE = TBDJCZ_NOTE;
    }

    /**
     * 获取 单据入口状态
     *
     * @return TBDJCZ_RKZT 单据入口状态
     */
    public String getTBDJCZ_RKZT() {
        return this.TBDJCZ_RKZT;
    }

    /**
     * 设置 单据入口状态
     *
     * @param TBDJCZ_RKZT 单据入口状态
     */
    public void setTBDJCZ_RKZT(String TBDJCZ_RKZT) {
        this.TBDJCZ_RKZT = TBDJCZ_RKZT;
    }

    /**
     * 获取 序号
     *
     * @return TBDJCZ_XH 序号
     */
    public String getTBDJCZ_XH() {
        return this.TBDJCZ_XH;
    }

    /**
     * 设置 序号
     *
     * @param TBDJCZ_XH 序号
     */
    public void setTBDJCZ_XH(String TBDJCZ_XH) {
        this.TBDJCZ_XH = TBDJCZ_XH;
    }

    /**
     * 获取 条件
     *
     * @return TBDJCZ_ZTTJ 条件
     */
    public String getTBDJCZ_ZTTJ() {
        return this.TBDJCZ_ZTTJ;
    }

    /**
     * 设置 条件
     *
     * @param TBDJCZ_ZTTJ 条件
     */
    public void setTBDJCZ_ZTTJ(String TBDJCZ_ZTTJ) {
        this.TBDJCZ_ZTTJ = TBDJCZ_ZTTJ;
    }

    /**
     * 获取 正向操作序号
     *
     * @return TBDJCZ_ZXCZXH 正向操作序号
     */
    public String getTBDJCZ_ZXCZXH() {
        return this.TBDJCZ_ZXCZXH;
    }

    /**
     * 设置 正向操作序号
     *
     * @param TBDJCZ_ZXCZXH 正向操作序号
     */
    public void setTBDJCZ_ZXCZXH(String TBDJCZ_ZXCZXH) {
        this.TBDJCZ_ZXCZXH = TBDJCZ_ZXCZXH;
    }

    @Override
    public String toString() {
        return "TBCreateBusinessProcessDJCZVO{" +
                "TBDJCZ_CODE='" + TBDJCZ_CODE + '\'' +
                ", TBDJCZ_DJLXID='" + TBDJCZ_DJLXID + '\'' +
                ", TBDJCZ_DJZT='" + TBDJCZ_DJZT + '\'' +
                ", TBDJCZ_GLTJ='" + TBDJCZ_GLTJ + '\'' +
                ", TBDJCZ_IFCX=" + TBDJCZ_IFCX +
                ", TBDJCZ_IFCXCZ=" + TBDJCZ_IFCXCZ +
                ", TBDJCZ_IFZX=" + TBDJCZ_IFZX +
                ", TBDJCZ_NAME='" + TBDJCZ_NAME + '\'' +
                ", TBDJCZ_NOTE='" + TBDJCZ_NOTE + '\'' +
                ", TBDJCZ_RKZT='" + TBDJCZ_RKZT + '\'' +
                ", TBDJCZ_XH='" + TBDJCZ_XH + '\'' +
                ", TBDJCZ_ZTTJ='" + TBDJCZ_ZTTJ + '\'' +
                ", TBDJCZ_ZXCZXH='" + TBDJCZ_ZXCZXH + '\'' +
                '}';
    }
}
