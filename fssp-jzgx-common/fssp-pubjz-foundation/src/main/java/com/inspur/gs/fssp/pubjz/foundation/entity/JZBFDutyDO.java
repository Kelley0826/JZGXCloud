package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 职务实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 15:09
 * Company: Inspur
 */
@Entity
@Data
@Table(name = "bfduty")
public class JZBFDutyDO {
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name_chs;
    /**
     * 最大任职人数
     */
    private Integer maxnumofem = 0;
    /**
     * 是否可用
     */
    private char state_isenabled;


    /**
     * 获取 ID
     *
     * @return id ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 ID
     *
     * @param id ID
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
     * @return nameCHS 名称
     */
    public String getName_chs() {
        return name_chs;
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
     * 获取 最大任职人数
     *
     * @return maxnumofem 最大任职人数
     */
    public Integer getMaxnumofem() {
        return this.maxnumofem;
    }

    /**
     * 设置 最大任职人数
     *
     * @param maxnumofem 最大任职人数
     */
    public void setMaxnumofem(Integer maxnumofem) {
        this.maxnumofem = maxnumofem;
    }

    /**
     * 获取 是否可用
     *
     * @return stateIsenabled 是否可用
     */

    public char getState_isenabled() {
        return state_isenabled;
    }

    /**
     * 设置 是否可用
     *
     * @param state_isenabled 是否可用
     */
    public void setState_isenabled(char state_isenabled) {
        this.state_isenabled = state_isenabled;
    }

    @Override
    public String toString() {
        return "BFDutyDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", nameCHS='" + name_chs + '\'' +
                ", maxnumofem=" + maxnumofem +
                ", stateIsenabled=" + state_isenabled +
                '}';
    }
}
