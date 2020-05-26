package com.inspur.gs.fssp.pubjz.foundation.entity;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bfemployeesysuser")
public class JZBFEmployeeSysuserDTO {
    private String parentid;
    @Id
    private String id;
    private Integer sortorder;
    private String sysuser;

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public String getSysuser() {
        return sysuser;
    }

    public void setSysuser(String sysuser) {
        this.sysuser = sysuser;
    }
}
