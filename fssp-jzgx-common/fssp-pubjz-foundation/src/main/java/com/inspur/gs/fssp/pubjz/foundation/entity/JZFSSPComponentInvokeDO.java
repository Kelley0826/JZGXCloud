package com.inspur.gs.fssp.pubjz.foundation.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 执行常用构件触发内容
 *
 * @author johnyang
 * @date 2019年10月17日
 */
@Entity
@Data
@Table(name = "fsspcomponentinvoke")
public class JZFSSPComponentInvokeDO {

    /**
     * 内码，唯一
     */
    @Id
    private String fsspcomponentinvoke_nm;
    /**
     * 业务来源ID
     */
    private String fsspcomponentinvoke_ywlyid;
    /**
     * 业务来源名称
     */
    private String fsspcomponentinvoke_ywlymc;
    /**
     * 构件id
     */
    private String fsspcomponentinvoke_gjid;
    /**
     * 构件名称
     */
    private String fsspcomponentinvoke_gjmc;
    /**
     * 操作id
     */
    private String fsspcomponentinvoke_czid;
    /**
     * 操作名称
     */
    private String fsspcomponentinvoke_czmc;
    /**
     * 操作方id
     */
    private String fsspcomponentinvoke_czfid;

    private String fsspcomponentinvoke_invoketype;

    private String fsspcomponentinvoke_mpath;

    private String fsspcomponentinvoke_sname;

    private String fsspcomponentinvoke_su;


    private String postdatatype;

    public String getFsspcomponentinvoke_nm() {
        return fsspcomponentinvoke_nm;
    }

    public void setFsspcomponentinvoke_nm(String fsspcomponentinvoke_nm) {
        this.fsspcomponentinvoke_nm = fsspcomponentinvoke_nm;
    }

    public String getFsspcomponentinvoke_ywlyid() {
        return fsspcomponentinvoke_ywlyid;
    }

    public void setFsspcomponentinvoke_ywlyid(String fsspcomponentinvoke_ywlyid) {
        this.fsspcomponentinvoke_ywlyid = fsspcomponentinvoke_ywlyid;
    }

    public String getFsspcomponentinvoke_ywlymc() {
        return fsspcomponentinvoke_ywlymc;
    }

    public void setFsspcomponentinvoke_ywlymc(String fsspcomponentinvoke_ywlymc) {
        this.fsspcomponentinvoke_ywlymc = fsspcomponentinvoke_ywlymc;
    }

    public String getFsspcomponentinvoke_gjid() {
        return fsspcomponentinvoke_gjid;
    }

    public void setFsspcomponentinvoke_gjid(String fsspcomponentinvoke_gjid) {
        this.fsspcomponentinvoke_gjid = fsspcomponentinvoke_gjid;
    }

    public String getFsspcomponentinvoke_gjmc() {
        return fsspcomponentinvoke_gjmc;
    }

    public void setFsspcomponentinvoke_gjmc(String fsspcomponentinvoke_gjmc) {
        this.fsspcomponentinvoke_gjmc = fsspcomponentinvoke_gjmc;
    }

    public String getFsspcomponentinvoke_czid() {
        return fsspcomponentinvoke_czid;
    }

    public void setFsspcomponentinvoke_czid(String fsspcomponentinvoke_czid) {
        this.fsspcomponentinvoke_czid = fsspcomponentinvoke_czid;
    }

    public String getFsspcomponentinvoke_czmc() {
        return fsspcomponentinvoke_czmc;
    }

    public void setFsspcomponentinvoke_czmc(String fsspcomponentinvoke_czmc) {
        this.fsspcomponentinvoke_czmc = fsspcomponentinvoke_czmc;
    }

    public String getFsspcomponentinvoke_czfid() {
        return fsspcomponentinvoke_czfid;
    }

    public void setFsspcomponentinvoke_czfid(String fsspcomponentinvoke_czfid) {
        this.fsspcomponentinvoke_czfid = fsspcomponentinvoke_czfid;
    }

    public String getFsspcomponentinvoke_invoketype() {
        return fsspcomponentinvoke_invoketype;
    }

    public void setFsspcomponentinvoke_invoketype(String fsspcomponentinvoke_invoketype) {
        this.fsspcomponentinvoke_invoketype = fsspcomponentinvoke_invoketype;
    }

    public String getFsspcomponentinvoke_mpath() {
        return fsspcomponentinvoke_mpath;
    }

    public void setFsspcomponentinvoke_mpath(String fsspcomponentinvoke_mpath) {
        this.fsspcomponentinvoke_mpath = fsspcomponentinvoke_mpath;
    }

    public String getFsspcomponentinvoke_sname() {
        return fsspcomponentinvoke_sname;
    }

    public void setFsspcomponentinvoke_sname(String fsspcomponentinvoke_sname) {
        this.fsspcomponentinvoke_sname = fsspcomponentinvoke_sname;
    }

    public String getFsspcomponentinvoke_su() {
        return fsspcomponentinvoke_su;
    }

    public void setFsspcomponentinvoke_su(String fsspcomponentinvoke_su) {
        this.fsspcomponentinvoke_su = fsspcomponentinvoke_su;
    }

    public String getPostdatatype() {
        return postdatatype;
    }

    public void setPostdatatype(String postdatatype) {
        this.postdatatype = postdatatype;
    }

}
