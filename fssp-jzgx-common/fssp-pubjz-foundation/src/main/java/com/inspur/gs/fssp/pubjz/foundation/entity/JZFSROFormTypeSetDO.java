package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author tangchm01
 * @Date 2020/2/14 13:03
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "fsroformtypeset")
public class JZFSROFormTypeSetDO {
    @Id
    private String id;
    private String formtypecode;
    @CafI18nStringColumn
    private String formtypename;
    private String shortname;
    private String formywclassid;
    private String formywclassname;
    private String formclassid;
    private Integer ifprivate;
    private  Integer ifused;
}
