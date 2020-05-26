package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 创建预算任务
 * @author jiangshaoshuai
 * @since 2019/12/10 19:37
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBCreateBusinessProcessYWLCInVO implements Serializable {
    /**
     * 编号
     */
    private String TBYWLC_CODE;
    /**
     * 单据类型ID
     */
    private String TBYWLC_DJLX;
    /**
     * 模块
     */
    private String TBYWLC_MK;
    /**
     * 名称
     */
    private String TBYWLC_NAME;
    /**
     * 说明
     */
    private String TBYWLC_NOTE;
    /**
     * 业务对象ID
     */
    private String TBYWLC_OBJID;
    /**
     * 父节点
     */
    private String TBYWLC_PARENTNODEID;
    /**
     * 流程ID
     */
    private String TBYWLC_LCID;

    /**
     * 获取 编号
     *
     * @return TBYWLC_CODE 编号
     */
    public String getTBYWLC_CODE() {
        return this.TBYWLC_CODE;
    }

    /**
     * 设置 编号
     *
     * @param TBYWLC_CODE 编号
     */
    public void setTBYWLC_CODE(String TBYWLC_CODE) {
        this.TBYWLC_CODE = TBYWLC_CODE;
    }

    /**
     * 获取 单据类型ID
     *
     * @return TBYWLC_DJLX 单据类型ID
     */
    public String getTBYWLC_DJLX() {
        return this.TBYWLC_DJLX;
    }

    /**
     * 设置 单据类型ID
     *
     * @param TBYWLC_DJLX 单据类型ID
     */
    public void setTBYWLC_DJLX(String TBYWLC_DJLX) {
        this.TBYWLC_DJLX = TBYWLC_DJLX;
    }

    /**
     * 获取 模块
     *
     * @return TBYWLC_MK 模块
     */
    public String getTBYWLC_MK() {
        return this.TBYWLC_MK;
    }

    /**
     * 设置 模块
     *
     * @param TBYWLC_MK 模块
     */
    public void setTBYWLC_MK(String TBYWLC_MK) {
        this.TBYWLC_MK = TBYWLC_MK;
    }

    /**
     * 获取 名称
     *
     * @return TBYWLC_NAME 名称
     */
    public String getTBYWLC_NAME() {
        return this.TBYWLC_NAME;
    }

    /**
     * 设置 名称
     *
     * @param TBYWLC_NAME 名称
     */
    public void setTBYWLC_NAME(String TBYWLC_NAME) {
        this.TBYWLC_NAME = TBYWLC_NAME;
    }

    /**
     * 获取 说明
     *
     * @return TBYWLC_NOTE 说明
     */
    public String getTBYWLC_NOTE() {
        return this.TBYWLC_NOTE;
    }

    /**
     * 设置 说明
     *
     * @param TBYWLC_NOTE 说明
     */
    public void setTBYWLC_NOTE(String TBYWLC_NOTE) {
        this.TBYWLC_NOTE = TBYWLC_NOTE;
    }

    /**
     * 获取 业务对象ID
     *
     * @return TBYWLC_OBJID 业务对象ID
     */
    public String getTBYWLC_OBJID() {
        return this.TBYWLC_OBJID;
    }

    /**
     * 设置 业务对象ID
     *
     * @param TBYWLC_OBJID 业务对象ID
     */
    public void setTBYWLC_OBJID(String TBYWLC_OBJID) {
        this.TBYWLC_OBJID = TBYWLC_OBJID;
    }

    /**
     * 获取 父节点
     *
     * @return TBYWLC_PARENTNODEID 父节点
     */
    public String getTBYWLC_PARENTNODEID() {
        return this.TBYWLC_PARENTNODEID;
    }

    /**
     * 设置 父节点
     *
     * @param TBYWLC_PARENTNODEID 父节点
     */
    public void setTBYWLC_PARENTNODEID(String TBYWLC_PARENTNODEID) {
        this.TBYWLC_PARENTNODEID = TBYWLC_PARENTNODEID;
    }


    /**
     * 获取 流程ID
     *
     * @return TBYWLC_LCID 流程ID
     */
    public String getTBYWLC_LCID() {
        return this.TBYWLC_LCID;
    }

    /**
     * 设置 流程ID
     *
     * @param TBYWLC_LCID 流程ID
     */
    public void setTBYWLC_LCID(String TBYWLC_LCID) {
        this.TBYWLC_LCID = TBYWLC_LCID;
    }

    @Override
    public String toString() {
        return "TBCreateBusinessProcessYWLCInVO{" +
                "TBYWLC_CODE='" + TBYWLC_CODE + '\'' +
                ", TBYWLC_DJLX='" + TBYWLC_DJLX + '\'' +
                ", TBYWLC_MK='" + TBYWLC_MK + '\'' +
                ", TBYWLC_NAME='" + TBYWLC_NAME + '\'' +
                ", TBYWLC_NOTE='" + TBYWLC_NOTE + '\'' +
                ", TBYWLC_OBJID='" + TBYWLC_OBJID + '\'' +
                ", TBYWLC_PARENTNODEID='" + TBYWLC_PARENTNODEID + '\'' +
                ", TBYWLC_LCID='" + TBYWLC_LCID + '\'' +
                '}';
    }
}
