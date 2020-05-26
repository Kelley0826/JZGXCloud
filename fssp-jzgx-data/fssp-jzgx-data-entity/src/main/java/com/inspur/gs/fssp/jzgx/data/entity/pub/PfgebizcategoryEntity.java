package com.inspur.gs.fssp.jzgx.data.entity.pub;

import javax.persistence.*;
import java.util.Objects;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/7 16:32
 */
@Entity
@Table(name = "PFGEBIZCATEGORY", schema = "LC002")
public class PfgebizcategoryEntity {
    private String id;
    private String bizarea;
    private String code;
    private String nameChs;
    private String nameCht;
    private String nameEn;
    private String nameEs;
    private String namePt;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BIZAREA")
    public String getBizarea() {
        return bizarea;
    }

    public void setBizarea(String bizarea) {
        this.bizarea = bizarea;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME_CHS")
    public String getNameChs() {
        return nameChs;
    }

    public void setNameChs(String nameChs) {
        this.nameChs = nameChs;
    }

    @Basic
    @Column(name = "NAME_CHT")
    public String getNameCht() {
        return nameCht;
    }

    public void setNameCht(String nameCht) {
        this.nameCht = nameCht;
    }

    @Basic
    @Column(name = "NAME_EN")
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Basic
    @Column(name = "NAME_ES")
    public String getNameEs() {
        return nameEs;
    }

    public void setNameEs(String nameEs) {
        this.nameEs = nameEs;
    }

    @Basic
    @Column(name = "NAME_PT")
    public String getNamePt() {
        return namePt;
    }

    public void setNamePt(String namePt) {
        this.namePt = namePt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PfgebizcategoryEntity that = (PfgebizcategoryEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(bizarea, that.bizarea) &&
                Objects.equals(code, that.code) &&
                Objects.equals(nameChs, that.nameChs) &&
                Objects.equals(nameCht, that.nameCht) &&
                Objects.equals(nameEn, that.nameEn) &&
                Objects.equals(nameEs, that.nameEs) &&
                Objects.equals(namePt, that.namePt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bizarea, code, nameChs, nameCht, nameEn, nameEs, namePt);
    }
}
