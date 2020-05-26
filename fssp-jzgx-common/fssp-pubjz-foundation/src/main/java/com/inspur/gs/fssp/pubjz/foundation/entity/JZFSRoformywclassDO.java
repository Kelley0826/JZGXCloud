package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author tangchm01
 * @Date 2020/2/11 9:22
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "fsroformywclass")
public class JZFSRoformywclassDO {
    @Id
    private String id;
    private String ordernum;
    private String bizareacode;
    private String bizareaname;
    private String formclasscode;
    private String formclassname;
    private String formywclasscode;
    @CafI18nStringColumn
    private String formywclassname;
    private String beid;
    private Integer ifprivate;
    private String tablename;
}
