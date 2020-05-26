package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 职位实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 15:25
 * Company: Inspur
 */
@Entity
@Data
@Table(name = "bfposition")
public class JZBFPositionDO {
    /**
     * id
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
//    private String nameCHS;
    private String name_chs;
    /**
     * 部门
     */
    private String ofdepartment;
    /**
     * 组织
     */
    private String oforganization;
    /**
     * 人员
     */
    private String ofperson;
    /**
     * 职务
     */
    private String ofpost;
    /**
     * 状态
     */
    private String state;
    /**
     * 是否可用
     */
    private char state_isenabled;


    /**
     * 获取 id
     *
     * @return id id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 id
     *
     * @param id id
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
//    public String getNameCHS() {
//        return this.nameCHS;
//    }
    public String getName_chs() {
        return name_chs;
    }
    /**
     * 设置 名称
     *
     * @param name_chs 名称
     */
//    public void setNameCHS(String nameCHS) {
//        this.nameCHS = nameCHS;
//    }

    public void setName_chs(String name_chs) {
        this.name_chs = name_chs;
    }

    /**
     * 获取 部门
     *
     * @return ofdepartment 部门
     */
    public String getOfdepartment() {
        return this.ofdepartment;
    }

    /**
     * 设置 部门
     *
     * @param ofdepartment 部门
     */
    public void setOfdepartment(String ofdepartment) {
        this.ofdepartment = ofdepartment;
    }

    /**
     * 获取 组织
     *
     * @return oforganization 组织
     */
    public String getOforganization() {
        return this.oforganization;
    }

    /**
     * 设置 组织
     *
     * @param oforganization 组织
     */
    public void setOforganization(String oforganization) {
        this.oforganization = oforganization;
    }

    /**
     * 获取 人员
     *
     * @return ofperson 人员
     */
    public String getOfperson() {
        return this.ofperson;
    }

    /**
     * 设置 人员
     *
     * @param ofperson 人员
     */
    public void setOfperson(String ofperson) {
        this.ofperson = ofperson;
    }

    /**
     * 获取 职务
     *
     * @return ofpost 职务
     */
    public String getOfpost() {
        return this.ofpost;
    }

    /**
     * 设置 职务
     *
     * @param ofpost 职务
     */
    public void setOfpost(String ofpost) {
        this.ofpost = ofpost;
    }

    /**
     * 获取 状态
     *
     * @return state 状态
     */
    public String getState() {
        return this.state;
    }

    /**
     * 设置 状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
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
        return "BFPositionDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", nameCHS='" + name_chs + '\'' +
                ", ofdepartment='" + ofdepartment + '\'' +
                ", oforganization='" + oforganization + '\'' +
                ", ofperson='" + ofperson + '\'' +
                ", ofpost='" + ofpost + '\'' +
                ", state='" + state + '\'' +
                ", stateIsenabled=" + state_isenabled +
                '}';
    }
}
