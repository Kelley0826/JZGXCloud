package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nColumnDict;
import io.iec.caf.data.jpa.repository.CafI18nEntity;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import io.iec.caf.data.jpa.repository.CafI18nStringColumn;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author tangchm01
 * @Date 2020/2/12 11:51
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "fsroformclasswd")
public class JZFSROFormClassWDDO {
    /**
     * 内码1
     */
    @Id
    @GenericGenerator(name = "user-uuid", strategy = "uuid")
    @GeneratedValue(generator = "user-uuid")
    private String id;
    private String formclassid;
    private String formmatid;
    private String formmatbh;
    @CafI18nStringColumn
    private String formmatmc;
    private String creator;
    private Date createdtime;
    private String lastmodifier;
    private Date lastmodifiedtime;
    @Transient
    private CafI18nColumnDict formmatmcall;


}
