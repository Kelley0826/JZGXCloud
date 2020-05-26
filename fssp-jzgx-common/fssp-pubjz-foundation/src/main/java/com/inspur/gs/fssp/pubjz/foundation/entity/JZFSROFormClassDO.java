package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author tangchm01
 * @Date 2020/2/12 19:39
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "fsroformclass")
public class JZFSROFormClassDO {
    @Id
    private String id;
    private String ordernum;
    private String bizareacode;
    private String bizareaname;
    private String formclasscode;
    @CafI18nStringColumn
    private String formclassname;
    private Integer ifprivate;
}
