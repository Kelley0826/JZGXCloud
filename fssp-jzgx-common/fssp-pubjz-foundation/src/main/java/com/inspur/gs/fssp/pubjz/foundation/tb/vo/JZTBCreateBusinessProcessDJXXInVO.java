package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 创建预算任务
 * @author jiangshaoshuai
 * @since 2019/12/10 19:36
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBCreateBusinessProcessDJXXInVO implements Serializable {
    /**
     * 单据类型
     */
    private String TBDJXX_DJLX;
    /**
     * 主键字段
     */
    private String TBDJXX_PKEYZD;
    /**
     * 单据编号字段
     */
    private String TBDJXX_DJBHZD;
    /**
     * 单据备注字段
     */
    private String TBDJXX_DJBZZD;
    /**
     * 单据分录字段
     */
    private String TBDJXX_DJFLZD;
    /**
     * 单据内码字段
     */
    private String TBDJXX_DJNMZD;
    /**
     * 单据日期字段
     */
    private String TBDJXX_DJRQZD;
    /**
     * 单据说明字段
     */
    private String TBDJXX_DJSMZD;
    /**
     * 制单人字段
     */
    private String TBDJXX_ZDRZD;
    /**
     * 单位编号字段
     */
    private String TBDJXX_DWBHZD;
    /**
     * 类型名称
     */
    private String TBDJXX_LXMC;
    /**
     * 部门字段
     */
    private String TBDJXX_BMZD;
    /**
     * 单据状态字段
     */
    private String TBDJXX_DJZTZD;
    /**
     * 来源单据编号字段
     */
    private String TBDJXX_LYDJBHZD;
    /**
     * 来源单据类型
     */
    private String TBDJXX_LYDJLX;
    /**
     * 来源单据字段
     */
    private String TBDJXX_LYDJZD;


    /**
     * 获取 单据类型
     *
     * @return TBDJXX_DJLX 单据类型
     */
    public String getTBDJXX_DJLX() {
        return this.TBDJXX_DJLX;
    }

    /**
     * 设置 单据类型
     *
     * @param TBDJXX_DJLX 单据类型
     */
    public void setTBDJXX_DJLX(String TBDJXX_DJLX) {
        this.TBDJXX_DJLX = TBDJXX_DJLX;
    }

    /**
     * 获取 主键字段
     *
     * @return TBDJXX_PKEYZD 主键字段
     */
    public String getTBDJXX_PKEYZD() {
        return this.TBDJXX_PKEYZD;
    }

    /**
     * 设置 主键字段
     *
     * @param TBDJXX_PKEYZD 主键字段
     */
    public void setTBDJXX_PKEYZD(String TBDJXX_PKEYZD) {
        this.TBDJXX_PKEYZD = TBDJXX_PKEYZD;
    }

    /**
     * 获取 单据编号字段
     *
     * @return TBDJXX_DJBHZD 单据编号字段
     */
    public String getTBDJXX_DJBHZD() {
        return this.TBDJXX_DJBHZD;
    }

    /**
     * 设置 单据编号字段
     *
     * @param TBDJXX_DJBHZD 单据编号字段
     */
    public void setTBDJXX_DJBHZD(String TBDJXX_DJBHZD) {
        this.TBDJXX_DJBHZD = TBDJXX_DJBHZD;
    }

    /**
     * 获取 单据备注字段
     *
     * @return TBDJXX_DJBZZD 单据备注字段
     */
    public String getTBDJXX_DJBZZD() {
        return this.TBDJXX_DJBZZD;
    }

    /**
     * 设置 单据备注字段
     *
     * @param TBDJXX_DJBZZD 单据备注字段
     */
    public void setTBDJXX_DJBZZD(String TBDJXX_DJBZZD) {
        this.TBDJXX_DJBZZD = TBDJXX_DJBZZD;
    }

    /**
     * 获取 单据分录字段
     *
     * @return TBDJXX_DJFLZD 单据分录字段
     */
    public String getTBDJXX_DJFLZD() {
        return this.TBDJXX_DJFLZD;
    }

    /**
     * 设置 单据分录字段
     *
     * @param TBDJXX_DJFLZD 单据分录字段
     */
    public void setTBDJXX_DJFLZD(String TBDJXX_DJFLZD) {
        this.TBDJXX_DJFLZD = TBDJXX_DJFLZD;
    }

    /**
     * 获取 单据内码字段
     *
     * @return TBDJXX_DJNMZD 单据内码字段
     */
    public String getTBDJXX_DJNMZD() {
        return this.TBDJXX_DJNMZD;
    }

    /**
     * 设置 单据内码字段
     *
     * @param TBDJXX_DJNMZD 单据内码字段
     */
    public void setTBDJXX_DJNMZD(String TBDJXX_DJNMZD) {
        this.TBDJXX_DJNMZD = TBDJXX_DJNMZD;
    }

    /**
     * 获取 单据日期字段
     *
     * @return TBDJXX_DJRQZD 单据日期字段
     */
    public String getTBDJXX_DJRQZD() {
        return this.TBDJXX_DJRQZD;
    }

    /**
     * 设置 单据日期字段
     *
     * @param TBDJXX_DJRQZD 单据日期字段
     */
    public void setTBDJXX_DJRQZD(String TBDJXX_DJRQZD) {
        this.TBDJXX_DJRQZD = TBDJXX_DJRQZD;
    }

    /**
     * 获取 单据说明字段
     *
     * @return TBDJXX_DJSMZD 单据说明字段
     */
    public String getTBDJXX_DJSMZD() {
        return this.TBDJXX_DJSMZD;
    }

    /**
     * 设置 单据说明字段
     *
     * @param TBDJXX_DJSMZD 单据说明字段
     */
    public void setTBDJXX_DJSMZD(String TBDJXX_DJSMZD) {
        this.TBDJXX_DJSMZD = TBDJXX_DJSMZD;
    }

    /**
     * 获取 制单人字段
     *
     * @return TBDJXX_ZDRZD 制单人字段
     */
    public String getTBDJXX_ZDRZD() {
        return this.TBDJXX_ZDRZD;
    }

    /**
     * 设置 制单人字段
     *
     * @param TBDJXX_ZDRZD 制单人字段
     */
    public void setTBDJXX_ZDRZD(String TBDJXX_ZDRZD) {
        this.TBDJXX_ZDRZD = TBDJXX_ZDRZD;
    }

    /**
     * 获取 单位编号字段
     *
     * @return TBDJXX_DWBHZD 单位编号字段
     */
    public String getTBDJXX_DWBHZD() {
        return this.TBDJXX_DWBHZD;
    }

    /**
     * 设置 单位编号字段
     *
     * @param TBDJXX_DWBHZD 单位编号字段
     */
    public void setTBDJXX_DWBHZD(String TBDJXX_DWBHZD) {
        this.TBDJXX_DWBHZD = TBDJXX_DWBHZD;
    }

    /**
     * 获取 类型名称
     *
     * @return TBDJXX_LXMC 类型名称
     */
    public String getTBDJXX_LXMC() {
        return this.TBDJXX_LXMC;
    }

    /**
     * 设置 类型名称
     *
     * @param TBDJXX_LXMC 类型名称
     */
    public void setTBDJXX_LXMC(String TBDJXX_LXMC) {
        this.TBDJXX_LXMC = TBDJXX_LXMC;
    }

    /**
     * 获取 部门字段
     *
     * @return TBDJXX_BMZD 部门字段
     */
    public String getTBDJXX_BMZD() {
        return this.TBDJXX_BMZD;
    }

    /**
     * 设置 部门字段
     *
     * @param TBDJXX_BMZD 部门字段
     */
    public void setTBDJXX_BMZD(String TBDJXX_BMZD) {
        this.TBDJXX_BMZD = TBDJXX_BMZD;
    }

    /**
     * 获取 单据状态字段
     *
     * @return TBDJXX_DJZTZD 单据状态字段
     */
    public String getTBDJXX_DJZTZD() {
        return this.TBDJXX_DJZTZD;
    }

    /**
     * 设置 单据状态字段
     *
     * @param TBDJXX_DJZTZD 单据状态字段
     */
    public void setTBDJXX_DJZTZD(String TBDJXX_DJZTZD) {
        this.TBDJXX_DJZTZD = TBDJXX_DJZTZD;
    }

    /**
     * 获取 来源单据编号字段
     *
     * @return TBDJXX_LYDJBHZD 来源单据编号字段
     */
    public String getTBDJXX_LYDJBHZD() {
        return this.TBDJXX_LYDJBHZD;
    }

    /**
     * 设置 来源单据编号字段
     *
     * @param TBDJXX_LYDJBHZD 来源单据编号字段
     */
    public void setTBDJXX_LYDJBHZD(String TBDJXX_LYDJBHZD) {
        this.TBDJXX_LYDJBHZD = TBDJXX_LYDJBHZD;
    }

    /**
     * 获取 来源单据类型
     *
     * @return TBDJXX_LYDJLX 来源单据类型
     */
    public String getTBDJXX_LYDJLX() {
        return this.TBDJXX_LYDJLX;
    }

    /**
     * 设置 来源单据类型
     *
     * @param TBDJXX_LYDJLX 来源单据类型
     */
    public void setTBDJXX_LYDJLX(String TBDJXX_LYDJLX) {
        this.TBDJXX_LYDJLX = TBDJXX_LYDJLX;
    }

    /**
     * 获取 来源单据字段
     *
     * @return TBDJXX_LYDJZD 来源单据字段
     */
    public String getTBDJXX_LYDJZD() {
        return this.TBDJXX_LYDJZD;
    }

    /**
     * 设置 来源单据字段
     *
     * @param TBDJXX_LYDJZD 来源单据字段
     */
    public void setTBDJXX_LYDJZD(String TBDJXX_LYDJZD) {
        this.TBDJXX_LYDJZD = TBDJXX_LYDJZD;
    }

    @Override
    public String toString() {
        return "TBCreateBusinessProcessDJXXVO{" +
                "TBDJXX_DJLX='" + TBDJXX_DJLX + '\'' +
                ", TBDJXX_PKEYZD='" + TBDJXX_PKEYZD + '\'' +
                ", TBDJXX_DJBHZD='" + TBDJXX_DJBHZD + '\'' +
                ", TBDJXX_DJBZZD='" + TBDJXX_DJBZZD + '\'' +
                ", TBDJXX_DJFLZD='" + TBDJXX_DJFLZD + '\'' +
                ", TBDJXX_DJNMZD='" + TBDJXX_DJNMZD + '\'' +
                ", TBDJXX_DJRQZD='" + TBDJXX_DJRQZD + '\'' +
                ", TBDJXX_DJSMZD='" + TBDJXX_DJSMZD + '\'' +
                ", TBDJXX_ZDRZD='" + TBDJXX_ZDRZD + '\'' +
                ", TBDJXX_DWBHZD='" + TBDJXX_DWBHZD + '\'' +
                ", TBDJXX_LXMC='" + TBDJXX_LXMC + '\'' +
                ", TBDJXX_BMZD='" + TBDJXX_BMZD + '\'' +
                ", TBDJXX_DJZTZD='" + TBDJXX_DJZTZD + '\'' +
                ", TBDJXX_LYDJBHZD='" + TBDJXX_LYDJBHZD + '\'' +
                ", TBDJXX_LYDJLX='" + TBDJXX_LYDJLX + '\'' +
                ", TBDJXX_LYDJZD='" + TBDJXX_LYDJZD + '\'' +
                '}';
    }
}
