package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: FSSP_Common_Foundation
 * @description: BFPositionEmployee实体
 * @author: gf
 * @create: 2019-12-14 14:40
 **/
@Entity
@Data
@Table(name = "bfpositionemployee")
public class JZBFPositionEmployeeDO {

    @Id
    private String id;
    private String employee;
    private String parentid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "BFPositionEmployeeDO{" +
                "id='" + id + '\'' +
                ", employee='" + employee + '\'' +
                ", parentid='" + parentid + '\'' +
                '}';
    }
}
