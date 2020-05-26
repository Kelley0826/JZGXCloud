package com.inspur.gs.fssp.pubjz.foundation.entity;

import io.iec.caf.data.jpa.repository.CafI18nStringColumn;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author tangchm01
 * @Date 2020/3/17 10:06
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "fsroformat")
public class JZFSROFORMATDO {
   @Id
   private String fsroformat_nm;
   private String fsroformat_code;
   private String fsroformat_note;
   private Integer fsroformat_system;
    @CafI18nStringColumn
   private String name;




}
