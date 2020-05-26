package com.inspur.gs.fssp.jzgx.data.entity.pub;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/20 18:03
 */
@Entity
@Table(name = "FSBZDJ", schema = "LC002")
public class FsbzdjEntity {
    private String fsbzdjNm;
    private Time createdtime;
    private String creator;
    private Long fsbzdjBbje;
    private String fsbzdjBmid;
    private Integer fsbzdjBscs;
    private String fsbzdjBxr;
    private String fsbzdjBxrbmid;
    private String fsbzdjBxrdwbh;
    private String fsbzdjBxrdwnm;
    private String fsbzdjBxrmc;
    private String fsbzdjBz;
    private String fsbzdjCn;
    private String fsbzdjCnmc;
    private String fsbzdjCsr;
    private String fsbzdjCsrmc;
    private Time fsbzdjCssj;
    private String fsbzdjDjbh;
    private String fsbzdjDjlx;
    private String fsbzdjDjnm;
    private Time fsbzdjDjrq;
    private String fsbzdjDjywlx;
    private String fsbzdjDjzt;
    private String fsbzdjDqhj;
    private String fsbzdjDqhjmc;
    private String fsbzdjDwbh;
    private String fsbzdjDwnm;
    private Integer fsbzdjDycs;
    private String fsbzdjFhr;
    private String fsbzdjFhrmc;
    private Time fsbzdjFhsj;
    private Integer fsbzdjFjzs;
    private Time fsbzdjFkrq;
    private String fsbzdjFssc;
    private String fsbzdjIfbg;
    private String fsbzdjIfbs;
    private String fsbzdjIfjj;
    private String fsbzdjIfjswc;
    private String fsbzdjIfth;
    private Long fsbzdjJe;
    private String fsbzdjJhr;
    private String fsbzdjJhrmc;
    private Time fsbzdjJhsj;
    private Long fsbzdjJsbbje;
    private Long fsbzdjJsje;
    private String fsbzdjJzzz;
    private String fsbzdjJzzzid;
    private String fsbzdjKjqj;
    private String fsbzdjLcsl;
    private String fsbzdjLymk;
    private String fsbzdjNwzbz;
    private String fsbzdjPzflag;
    private String fsbzdjPzh;
    private String fsbzdjPzhsdwbh;
    private String fsbzdjPznm;
    private Time fsbzdjPzrq;
    private String fsbzdjQtxx;
    private String fsbzdjQxhj;
    private String fsbzdjQxhjmc;
    private String fsbzdjSlbh;
    private String fsbzdjTreemc;
    private String fsbzdjTrjd;
    private String fsbzdjUser;
    private String fsbzdjUserid;
    private String fsbzdjUserxyzh;
    private String fsbzdjWbbh;
    private String fsbzdjWbid;
    private String fsbzdjWbmc;
    private String fsbzdjWzpzh;
    private String fsbzdjXspzh;
    private String fsbzdjYcxx;
    private String fsbzdjYear;
    private String fsbzdjYwlx;
    private String fsbzdjYwlxmc;
    private Integer fsbzdjYxzs;
    private String fsbzdjYxzt;
    private String fsbzdjZdr;
    private String fsbzdjZdrmc;
    private Time fsbzdjZdsj;
    private String fsbzdjZtsm;
    private String fsbzdjZy;
    private String fsbzdjZzdjzt;
    private Time lastmodifiedtime;
    private String lastmodifier;
    private String kz01;
    private String kz02;
    private String kz03;
    private String kz04;
    private String kz05;

    @Id
    @Column(name = "FSBZDJ_NM")
    public String getFsbzdjNm() {
        return fsbzdjNm;
    }

    public void setFsbzdjNm(String fsbzdjNm) {
        this.fsbzdjNm = fsbzdjNm;
    }

    @Basic
    @Column(name = "CREATEDTIME")
    public Time getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Time createdtime) {
        this.createdtime = createdtime;
    }

    @Basic
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "FSBZDJ_BBJE")
    public Long getFsbzdjBbje() {
        return fsbzdjBbje;
    }

    public void setFsbzdjBbje(Long fsbzdjBbje) {
        this.fsbzdjBbje = fsbzdjBbje;
    }

    @Basic
    @Column(name = "FSBZDJ_BMID")
    public String getFsbzdjBmid() {
        return fsbzdjBmid;
    }

    public void setFsbzdjBmid(String fsbzdjBmid) {
        this.fsbzdjBmid = fsbzdjBmid;
    }

    @Basic
    @Column(name = "FSBZDJ_BSCS")
    public Integer getFsbzdjBscs() {
        return fsbzdjBscs;
    }

    public void setFsbzdjBscs(Integer fsbzdjBscs) {
        this.fsbzdjBscs = fsbzdjBscs;
    }

    @Basic
    @Column(name = "FSBZDJ_BXR")
    public String getFsbzdjBxr() {
        return fsbzdjBxr;
    }

    public void setFsbzdjBxr(String fsbzdjBxr) {
        this.fsbzdjBxr = fsbzdjBxr;
    }

    @Basic
    @Column(name = "FSBZDJ_BXRBMID")
    public String getFsbzdjBxrbmid() {
        return fsbzdjBxrbmid;
    }

    public void setFsbzdjBxrbmid(String fsbzdjBxrbmid) {
        this.fsbzdjBxrbmid = fsbzdjBxrbmid;
    }

    @Basic
    @Column(name = "FSBZDJ_BXRDWBH")
    public String getFsbzdjBxrdwbh() {
        return fsbzdjBxrdwbh;
    }

    public void setFsbzdjBxrdwbh(String fsbzdjBxrdwbh) {
        this.fsbzdjBxrdwbh = fsbzdjBxrdwbh;
    }

    @Basic
    @Column(name = "FSBZDJ_BXRDWNM")
    public String getFsbzdjBxrdwnm() {
        return fsbzdjBxrdwnm;
    }

    public void setFsbzdjBxrdwnm(String fsbzdjBxrdwnm) {
        this.fsbzdjBxrdwnm = fsbzdjBxrdwnm;
    }

    @Basic
    @Column(name = "FSBZDJ_BXRMC")
    public String getFsbzdjBxrmc() {
        return fsbzdjBxrmc;
    }

    public void setFsbzdjBxrmc(String fsbzdjBxrmc) {
        this.fsbzdjBxrmc = fsbzdjBxrmc;
    }

    @Basic
    @Column(name = "FSBZDJ_BZ")
    public String getFsbzdjBz() {
        return fsbzdjBz;
    }

    public void setFsbzdjBz(String fsbzdjBz) {
        this.fsbzdjBz = fsbzdjBz;
    }

    @Basic
    @Column(name = "FSBZDJ_CN")
    public String getFsbzdjCn() {
        return fsbzdjCn;
    }

    public void setFsbzdjCn(String fsbzdjCn) {
        this.fsbzdjCn = fsbzdjCn;
    }

    @Basic
    @Column(name = "FSBZDJ_CNMC")
    public String getFsbzdjCnmc() {
        return fsbzdjCnmc;
    }

    public void setFsbzdjCnmc(String fsbzdjCnmc) {
        this.fsbzdjCnmc = fsbzdjCnmc;
    }

    @Basic
    @Column(name = "FSBZDJ_CSR")
    public String getFsbzdjCsr() {
        return fsbzdjCsr;
    }

    public void setFsbzdjCsr(String fsbzdjCsr) {
        this.fsbzdjCsr = fsbzdjCsr;
    }

    @Basic
    @Column(name = "FSBZDJ_CSRMC")
    public String getFsbzdjCsrmc() {
        return fsbzdjCsrmc;
    }

    public void setFsbzdjCsrmc(String fsbzdjCsrmc) {
        this.fsbzdjCsrmc = fsbzdjCsrmc;
    }

    @Basic
    @Column(name = "FSBZDJ_CSSJ")
    public Time getFsbzdjCssj() {
        return fsbzdjCssj;
    }

    public void setFsbzdjCssj(Time fsbzdjCssj) {
        this.fsbzdjCssj = fsbzdjCssj;
    }

    @Basic
    @Column(name = "FSBZDJ_DJBH")
    public String getFsbzdjDjbh() {
        return fsbzdjDjbh;
    }

    public void setFsbzdjDjbh(String fsbzdjDjbh) {
        this.fsbzdjDjbh = fsbzdjDjbh;
    }

    @Basic
    @Column(name = "FSBZDJ_DJLX")
    public String getFsbzdjDjlx() {
        return fsbzdjDjlx;
    }

    public void setFsbzdjDjlx(String fsbzdjDjlx) {
        this.fsbzdjDjlx = fsbzdjDjlx;
    }

    @Basic
    @Column(name = "FSBZDJ_DJNM")
    public String getFsbzdjDjnm() {
        return fsbzdjDjnm;
    }

    public void setFsbzdjDjnm(String fsbzdjDjnm) {
        this.fsbzdjDjnm = fsbzdjDjnm;
    }

    @Basic
    @Column(name = "FSBZDJ_DJRQ")
    public Time getFsbzdjDjrq() {
        return fsbzdjDjrq;
    }

    public void setFsbzdjDjrq(Time fsbzdjDjrq) {
        this.fsbzdjDjrq = fsbzdjDjrq;
    }

    @Basic
    @Column(name = "FSBZDJ_DJYWLX")
    public String getFsbzdjDjywlx() {
        return fsbzdjDjywlx;
    }

    public void setFsbzdjDjywlx(String fsbzdjDjywlx) {
        this.fsbzdjDjywlx = fsbzdjDjywlx;
    }

    @Basic
    @Column(name = "FSBZDJ_DJZT")
    public String getFsbzdjDjzt() {
        return fsbzdjDjzt;
    }

    public void setFsbzdjDjzt(String fsbzdjDjzt) {
        this.fsbzdjDjzt = fsbzdjDjzt;
    }

    @Basic
    @Column(name = "FSBZDJ_DQHJ")
    public String getFsbzdjDqhj() {
        return fsbzdjDqhj;
    }

    public void setFsbzdjDqhj(String fsbzdjDqhj) {
        this.fsbzdjDqhj = fsbzdjDqhj;
    }

    @Basic
    @Column(name = "FSBZDJ_DQHJMC")
    public String getFsbzdjDqhjmc() {
        return fsbzdjDqhjmc;
    }

    public void setFsbzdjDqhjmc(String fsbzdjDqhjmc) {
        this.fsbzdjDqhjmc = fsbzdjDqhjmc;
    }

    @Basic
    @Column(name = "FSBZDJ_DWBH")
    public String getFsbzdjDwbh() {
        return fsbzdjDwbh;
    }

    public void setFsbzdjDwbh(String fsbzdjDwbh) {
        this.fsbzdjDwbh = fsbzdjDwbh;
    }

    @Basic
    @Column(name = "FSBZDJ_DWNM")
    public String getFsbzdjDwnm() {
        return fsbzdjDwnm;
    }

    public void setFsbzdjDwnm(String fsbzdjDwnm) {
        this.fsbzdjDwnm = fsbzdjDwnm;
    }

    @Basic
    @Column(name = "FSBZDJ_DYCS")
    public Integer getFsbzdjDycs() {
        return fsbzdjDycs;
    }

    public void setFsbzdjDycs(Integer fsbzdjDycs) {
        this.fsbzdjDycs = fsbzdjDycs;
    }

    @Basic
    @Column(name = "FSBZDJ_FHR")
    public String getFsbzdjFhr() {
        return fsbzdjFhr;
    }

    public void setFsbzdjFhr(String fsbzdjFhr) {
        this.fsbzdjFhr = fsbzdjFhr;
    }

    @Basic
    @Column(name = "FSBZDJ_FHRMC")
    public String getFsbzdjFhrmc() {
        return fsbzdjFhrmc;
    }

    public void setFsbzdjFhrmc(String fsbzdjFhrmc) {
        this.fsbzdjFhrmc = fsbzdjFhrmc;
    }

    @Basic
    @Column(name = "FSBZDJ_FHSJ")
    public Time getFsbzdjFhsj() {
        return fsbzdjFhsj;
    }

    public void setFsbzdjFhsj(Time fsbzdjFhsj) {
        this.fsbzdjFhsj = fsbzdjFhsj;
    }

    @Basic
    @Column(name = "FSBZDJ_FJZS")
    public Integer getFsbzdjFjzs() {
        return fsbzdjFjzs;
    }

    public void setFsbzdjFjzs(Integer fsbzdjFjzs) {
        this.fsbzdjFjzs = fsbzdjFjzs;
    }

    @Basic
    @Column(name = "FSBZDJ_FKRQ")
    public Time getFsbzdjFkrq() {
        return fsbzdjFkrq;
    }

    public void setFsbzdjFkrq(Time fsbzdjFkrq) {
        this.fsbzdjFkrq = fsbzdjFkrq;
    }

    @Basic
    @Column(name = "FSBZDJ_FSSC")
    public String getFsbzdjFssc() {
        return fsbzdjFssc;
    }

    public void setFsbzdjFssc(String fsbzdjFssc) {
        this.fsbzdjFssc = fsbzdjFssc;
    }

    @Basic
    @Column(name = "FSBZDJ_IFBG")
    public String getFsbzdjIfbg() {
        return fsbzdjIfbg;
    }

    public void setFsbzdjIfbg(String fsbzdjIfbg) {
        this.fsbzdjIfbg = fsbzdjIfbg;
    }

    @Basic
    @Column(name = "FSBZDJ_IFBS")
    public String getFsbzdjIfbs() {
        return fsbzdjIfbs;
    }

    public void setFsbzdjIfbs(String fsbzdjIfbs) {
        this.fsbzdjIfbs = fsbzdjIfbs;
    }

    @Basic
    @Column(name = "FSBZDJ_IFJJ")
    public String getFsbzdjIfjj() {
        return fsbzdjIfjj;
    }

    public void setFsbzdjIfjj(String fsbzdjIfjj) {
        this.fsbzdjIfjj = fsbzdjIfjj;
    }

    @Basic
    @Column(name = "FSBZDJ_IFJSWC")
    public String getFsbzdjIfjswc() {
        return fsbzdjIfjswc;
    }

    public void setFsbzdjIfjswc(String fsbzdjIfjswc) {
        this.fsbzdjIfjswc = fsbzdjIfjswc;
    }

    @Basic
    @Column(name = "FSBZDJ_IFTH")
    public String getFsbzdjIfth() {
        return fsbzdjIfth;
    }

    public void setFsbzdjIfth(String fsbzdjIfth) {
        this.fsbzdjIfth = fsbzdjIfth;
    }

    @Basic
    @Column(name = "FSBZDJ_JE")
    public Long getFsbzdjJe() {
        return fsbzdjJe;
    }

    public void setFsbzdjJe(Long fsbzdjJe) {
        this.fsbzdjJe = fsbzdjJe;
    }

    @Basic
    @Column(name = "FSBZDJ_JHR")
    public String getFsbzdjJhr() {
        return fsbzdjJhr;
    }

    public void setFsbzdjJhr(String fsbzdjJhr) {
        this.fsbzdjJhr = fsbzdjJhr;
    }

    @Basic
    @Column(name = "FSBZDJ_JHRMC")
    public String getFsbzdjJhrmc() {
        return fsbzdjJhrmc;
    }

    public void setFsbzdjJhrmc(String fsbzdjJhrmc) {
        this.fsbzdjJhrmc = fsbzdjJhrmc;
    }

    @Basic
    @Column(name = "FSBZDJ_JHSJ")
    public Time getFsbzdjJhsj() {
        return fsbzdjJhsj;
    }

    public void setFsbzdjJhsj(Time fsbzdjJhsj) {
        this.fsbzdjJhsj = fsbzdjJhsj;
    }

    @Basic
    @Column(name = "FSBZDJ_JSBBJE")
    public Long getFsbzdjJsbbje() {
        return fsbzdjJsbbje;
    }

    public void setFsbzdjJsbbje(Long fsbzdjJsbbje) {
        this.fsbzdjJsbbje = fsbzdjJsbbje;
    }

    @Basic
    @Column(name = "FSBZDJ_JSJE")
    public Long getFsbzdjJsje() {
        return fsbzdjJsje;
    }

    public void setFsbzdjJsje(Long fsbzdjJsje) {
        this.fsbzdjJsje = fsbzdjJsje;
    }

    @Basic
    @Column(name = "FSBZDJ_JZZZ")
    public String getFsbzdjJzzz() {
        return fsbzdjJzzz;
    }

    public void setFsbzdjJzzz(String fsbzdjJzzz) {
        this.fsbzdjJzzz = fsbzdjJzzz;
    }

    @Basic
    @Column(name = "FSBZDJ_JZZZID")
    public String getFsbzdjJzzzid() {
        return fsbzdjJzzzid;
    }

    public void setFsbzdjJzzzid(String fsbzdjJzzzid) {
        this.fsbzdjJzzzid = fsbzdjJzzzid;
    }

    @Basic
    @Column(name = "FSBZDJ_KJQJ")
    public String getFsbzdjKjqj() {
        return fsbzdjKjqj;
    }

    public void setFsbzdjKjqj(String fsbzdjKjqj) {
        this.fsbzdjKjqj = fsbzdjKjqj;
    }

    @Basic
    @Column(name = "FSBZDJ_LCSL")
    public String getFsbzdjLcsl() {
        return fsbzdjLcsl;
    }

    public void setFsbzdjLcsl(String fsbzdjLcsl) {
        this.fsbzdjLcsl = fsbzdjLcsl;
    }

    @Basic
    @Column(name = "FSBZDJ_LYMK")
    public String getFsbzdjLymk() {
        return fsbzdjLymk;
    }

    public void setFsbzdjLymk(String fsbzdjLymk) {
        this.fsbzdjLymk = fsbzdjLymk;
    }

    @Basic
    @Column(name = "FSBZDJ_NWZBZ")
    public String getFsbzdjNwzbz() {
        return fsbzdjNwzbz;
    }

    public void setFsbzdjNwzbz(String fsbzdjNwzbz) {
        this.fsbzdjNwzbz = fsbzdjNwzbz;
    }

    @Basic
    @Column(name = "FSBZDJ_PZFLAG")
    public String getFsbzdjPzflag() {
        return fsbzdjPzflag;
    }

    public void setFsbzdjPzflag(String fsbzdjPzflag) {
        this.fsbzdjPzflag = fsbzdjPzflag;
    }

    @Basic
    @Column(name = "FSBZDJ_PZH")
    public String getFsbzdjPzh() {
        return fsbzdjPzh;
    }

    public void setFsbzdjPzh(String fsbzdjPzh) {
        this.fsbzdjPzh = fsbzdjPzh;
    }

    @Basic
    @Column(name = "FSBZDJ_PZHSDWBH")
    public String getFsbzdjPzhsdwbh() {
        return fsbzdjPzhsdwbh;
    }

    public void setFsbzdjPzhsdwbh(String fsbzdjPzhsdwbh) {
        this.fsbzdjPzhsdwbh = fsbzdjPzhsdwbh;
    }

    @Basic
    @Column(name = "FSBZDJ_PZNM")
    public String getFsbzdjPznm() {
        return fsbzdjPznm;
    }

    public void setFsbzdjPznm(String fsbzdjPznm) {
        this.fsbzdjPznm = fsbzdjPznm;
    }

    @Basic
    @Column(name = "FSBZDJ_PZRQ")
    public Time getFsbzdjPzrq() {
        return fsbzdjPzrq;
    }

    public void setFsbzdjPzrq(Time fsbzdjPzrq) {
        this.fsbzdjPzrq = fsbzdjPzrq;
    }

    @Basic
    @Column(name = "FSBZDJ_QTXX")
    public String getFsbzdjQtxx() {
        return fsbzdjQtxx;
    }

    public void setFsbzdjQtxx(String fsbzdjQtxx) {
        this.fsbzdjQtxx = fsbzdjQtxx;
    }

    @Basic
    @Column(name = "FSBZDJ_QXHJ")
    public String getFsbzdjQxhj() {
        return fsbzdjQxhj;
    }

    public void setFsbzdjQxhj(String fsbzdjQxhj) {
        this.fsbzdjQxhj = fsbzdjQxhj;
    }

    @Basic
    @Column(name = "FSBZDJ_QXHJMC")
    public String getFsbzdjQxhjmc() {
        return fsbzdjQxhjmc;
    }

    public void setFsbzdjQxhjmc(String fsbzdjQxhjmc) {
        this.fsbzdjQxhjmc = fsbzdjQxhjmc;
    }

    @Basic
    @Column(name = "FSBZDJ_SLBH")
    public String getFsbzdjSlbh() {
        return fsbzdjSlbh;
    }

    public void setFsbzdjSlbh(String fsbzdjSlbh) {
        this.fsbzdjSlbh = fsbzdjSlbh;
    }

    @Basic
    @Column(name = "FSBZDJ_TREEMC")
    public String getFsbzdjTreemc() {
        return fsbzdjTreemc;
    }

    public void setFsbzdjTreemc(String fsbzdjTreemc) {
        this.fsbzdjTreemc = fsbzdjTreemc;
    }

    @Basic
    @Column(name = "FSBZDJ_TRJD")
    public String getFsbzdjTrjd() {
        return fsbzdjTrjd;
    }

    public void setFsbzdjTrjd(String fsbzdjTrjd) {
        this.fsbzdjTrjd = fsbzdjTrjd;
    }

    @Basic
    @Column(name = "FSBZDJ_USER")
    public String getFsbzdjUser() {
        return fsbzdjUser;
    }

    public void setFsbzdjUser(String fsbzdjUser) {
        this.fsbzdjUser = fsbzdjUser;
    }

    @Basic
    @Column(name = "FSBZDJ_USERID")
    public String getFsbzdjUserid() {
        return fsbzdjUserid;
    }

    public void setFsbzdjUserid(String fsbzdjUserid) {
        this.fsbzdjUserid = fsbzdjUserid;
    }

    @Basic
    @Column(name = "FSBZDJ_USERXYZH")
    public String getFsbzdjUserxyzh() {
        return fsbzdjUserxyzh;
    }

    public void setFsbzdjUserxyzh(String fsbzdjUserxyzh) {
        this.fsbzdjUserxyzh = fsbzdjUserxyzh;
    }

    @Basic
    @Column(name = "FSBZDJ_WBBH")
    public String getFsbzdjWbbh() {
        return fsbzdjWbbh;
    }

    public void setFsbzdjWbbh(String fsbzdjWbbh) {
        this.fsbzdjWbbh = fsbzdjWbbh;
    }

    @Basic
    @Column(name = "FSBZDJ_WBID")
    public String getFsbzdjWbid() {
        return fsbzdjWbid;
    }

    public void setFsbzdjWbid(String fsbzdjWbid) {
        this.fsbzdjWbid = fsbzdjWbid;
    }

    @Basic
    @Column(name = "FSBZDJ_WBMC")
    public String getFsbzdjWbmc() {
        return fsbzdjWbmc;
    }

    public void setFsbzdjWbmc(String fsbzdjWbmc) {
        this.fsbzdjWbmc = fsbzdjWbmc;
    }

    @Basic
    @Column(name = "FSBZDJ_WZPZH")
    public String getFsbzdjWzpzh() {
        return fsbzdjWzpzh;
    }

    public void setFsbzdjWzpzh(String fsbzdjWzpzh) {
        this.fsbzdjWzpzh = fsbzdjWzpzh;
    }

    @Basic
    @Column(name = "FSBZDJ_XSPZH")
    public String getFsbzdjXspzh() {
        return fsbzdjXspzh;
    }

    public void setFsbzdjXspzh(String fsbzdjXspzh) {
        this.fsbzdjXspzh = fsbzdjXspzh;
    }

    @Basic
    @Column(name = "FSBZDJ_YCXX")
    public String getFsbzdjYcxx() {
        return fsbzdjYcxx;
    }

    public void setFsbzdjYcxx(String fsbzdjYcxx) {
        this.fsbzdjYcxx = fsbzdjYcxx;
    }

    @Basic
    @Column(name = "FSBZDJ_YEAR")
    public String getFsbzdjYear() {
        return fsbzdjYear;
    }

    public void setFsbzdjYear(String fsbzdjYear) {
        this.fsbzdjYear = fsbzdjYear;
    }

    @Basic
    @Column(name = "FSBZDJ_YWLX")
    public String getFsbzdjYwlx() {
        return fsbzdjYwlx;
    }

    public void setFsbzdjYwlx(String fsbzdjYwlx) {
        this.fsbzdjYwlx = fsbzdjYwlx;
    }

    @Basic
    @Column(name = "FSBZDJ_YWLXMC")
    public String getFsbzdjYwlxmc() {
        return fsbzdjYwlxmc;
    }

    public void setFsbzdjYwlxmc(String fsbzdjYwlxmc) {
        this.fsbzdjYwlxmc = fsbzdjYwlxmc;
    }

    @Basic
    @Column(name = "FSBZDJ_YXZS")
    public Integer getFsbzdjYxzs() {
        return fsbzdjYxzs;
    }

    public void setFsbzdjYxzs(Integer fsbzdjYxzs) {
        this.fsbzdjYxzs = fsbzdjYxzs;
    }

    @Basic
    @Column(name = "FSBZDJ_YXZT")
    public String getFsbzdjYxzt() {
        return fsbzdjYxzt;
    }

    public void setFsbzdjYxzt(String fsbzdjYxzt) {
        this.fsbzdjYxzt = fsbzdjYxzt;
    }

    @Basic
    @Column(name = "FSBZDJ_ZDR")
    public String getFsbzdjZdr() {
        return fsbzdjZdr;
    }

    public void setFsbzdjZdr(String fsbzdjZdr) {
        this.fsbzdjZdr = fsbzdjZdr;
    }

    @Basic
    @Column(name = "FSBZDJ_ZDRMC")
    public String getFsbzdjZdrmc() {
        return fsbzdjZdrmc;
    }

    public void setFsbzdjZdrmc(String fsbzdjZdrmc) {
        this.fsbzdjZdrmc = fsbzdjZdrmc;
    }

    @Basic
    @Column(name = "FSBZDJ_ZDSJ")
    public Time getFsbzdjZdsj() {
        return fsbzdjZdsj;
    }

    public void setFsbzdjZdsj(Time fsbzdjZdsj) {
        this.fsbzdjZdsj = fsbzdjZdsj;
    }

    @Basic
    @Column(name = "FSBZDJ_ZTSM")
    public String getFsbzdjZtsm() {
        return fsbzdjZtsm;
    }

    public void setFsbzdjZtsm(String fsbzdjZtsm) {
        this.fsbzdjZtsm = fsbzdjZtsm;
    }

    @Basic
    @Column(name = "FSBZDJ_ZY")
    public String getFsbzdjZy() {
        return fsbzdjZy;
    }

    public void setFsbzdjZy(String fsbzdjZy) {
        this.fsbzdjZy = fsbzdjZy;
    }

    @Basic
    @Column(name = "FSBZDJ_ZZDJZT")
    public String getFsbzdjZzdjzt() {
        return fsbzdjZzdjzt;
    }

    public void setFsbzdjZzdjzt(String fsbzdjZzdjzt) {
        this.fsbzdjZzdjzt = fsbzdjZzdjzt;
    }

    @Basic
    @Column(name = "LASTMODIFIEDTIME")
    public Time getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Time lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    @Basic
    @Column(name = "LASTMODIFIER")
    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier;
    }

    @Basic
    @Column(name = "KZ01")
    public String getKz01() {
        return kz01;
    }

    public void setKz01(String kz01) {
        this.kz01 = kz01;
    }

    @Basic
    @Column(name = "KZ02")
    public String getKz02() {
        return kz02;
    }

    public void setKz02(String kz02) {
        this.kz02 = kz02;
    }

    @Basic
    @Column(name = "KZ03")
    public String getKz03() {
        return kz03;
    }

    public void setKz03(String kz03) {
        this.kz03 = kz03;
    }

    @Basic
    @Column(name = "KZ04")
    public String getKz04() {
        return kz04;
    }

    public void setKz04(String kz04) {
        this.kz04 = kz04;
    }

    @Basic
    @Column(name = "KZ05")
    public String getKz05() {
        return kz05;
    }

    public void setKz05(String kz05) {
        this.kz05 = kz05;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsbzdjEntity that = (FsbzdjEntity) o;
        return Objects.equals(fsbzdjNm, that.fsbzdjNm) &&
                Objects.equals(createdtime, that.createdtime) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(fsbzdjBbje, that.fsbzdjBbje) &&
                Objects.equals(fsbzdjBmid, that.fsbzdjBmid) &&
                Objects.equals(fsbzdjBscs, that.fsbzdjBscs) &&
                Objects.equals(fsbzdjBxr, that.fsbzdjBxr) &&
                Objects.equals(fsbzdjBxrbmid, that.fsbzdjBxrbmid) &&
                Objects.equals(fsbzdjBxrdwbh, that.fsbzdjBxrdwbh) &&
                Objects.equals(fsbzdjBxrdwnm, that.fsbzdjBxrdwnm) &&
                Objects.equals(fsbzdjBxrmc, that.fsbzdjBxrmc) &&
                Objects.equals(fsbzdjBz, that.fsbzdjBz) &&
                Objects.equals(fsbzdjCn, that.fsbzdjCn) &&
                Objects.equals(fsbzdjCnmc, that.fsbzdjCnmc) &&
                Objects.equals(fsbzdjCsr, that.fsbzdjCsr) &&
                Objects.equals(fsbzdjCsrmc, that.fsbzdjCsrmc) &&
                Objects.equals(fsbzdjCssj, that.fsbzdjCssj) &&
                Objects.equals(fsbzdjDjbh, that.fsbzdjDjbh) &&
                Objects.equals(fsbzdjDjlx, that.fsbzdjDjlx) &&
                Objects.equals(fsbzdjDjnm, that.fsbzdjDjnm) &&
                Objects.equals(fsbzdjDjrq, that.fsbzdjDjrq) &&
                Objects.equals(fsbzdjDjywlx, that.fsbzdjDjywlx) &&
                Objects.equals(fsbzdjDjzt, that.fsbzdjDjzt) &&
                Objects.equals(fsbzdjDqhj, that.fsbzdjDqhj) &&
                Objects.equals(fsbzdjDqhjmc, that.fsbzdjDqhjmc) &&
                Objects.equals(fsbzdjDwbh, that.fsbzdjDwbh) &&
                Objects.equals(fsbzdjDwnm, that.fsbzdjDwnm) &&
                Objects.equals(fsbzdjDycs, that.fsbzdjDycs) &&
                Objects.equals(fsbzdjFhr, that.fsbzdjFhr) &&
                Objects.equals(fsbzdjFhrmc, that.fsbzdjFhrmc) &&
                Objects.equals(fsbzdjFhsj, that.fsbzdjFhsj) &&
                Objects.equals(fsbzdjFjzs, that.fsbzdjFjzs) &&
                Objects.equals(fsbzdjFkrq, that.fsbzdjFkrq) &&
                Objects.equals(fsbzdjFssc, that.fsbzdjFssc) &&
                Objects.equals(fsbzdjIfbg, that.fsbzdjIfbg) &&
                Objects.equals(fsbzdjIfbs, that.fsbzdjIfbs) &&
                Objects.equals(fsbzdjIfjj, that.fsbzdjIfjj) &&
                Objects.equals(fsbzdjIfjswc, that.fsbzdjIfjswc) &&
                Objects.equals(fsbzdjIfth, that.fsbzdjIfth) &&
                Objects.equals(fsbzdjJe, that.fsbzdjJe) &&
                Objects.equals(fsbzdjJhr, that.fsbzdjJhr) &&
                Objects.equals(fsbzdjJhrmc, that.fsbzdjJhrmc) &&
                Objects.equals(fsbzdjJhsj, that.fsbzdjJhsj) &&
                Objects.equals(fsbzdjJsbbje, that.fsbzdjJsbbje) &&
                Objects.equals(fsbzdjJsje, that.fsbzdjJsje) &&
                Objects.equals(fsbzdjJzzz, that.fsbzdjJzzz) &&
                Objects.equals(fsbzdjJzzzid, that.fsbzdjJzzzid) &&
                Objects.equals(fsbzdjKjqj, that.fsbzdjKjqj) &&
                Objects.equals(fsbzdjLcsl, that.fsbzdjLcsl) &&
                Objects.equals(fsbzdjLymk, that.fsbzdjLymk) &&
                Objects.equals(fsbzdjNwzbz, that.fsbzdjNwzbz) &&
                Objects.equals(fsbzdjPzflag, that.fsbzdjPzflag) &&
                Objects.equals(fsbzdjPzh, that.fsbzdjPzh) &&
                Objects.equals(fsbzdjPzhsdwbh, that.fsbzdjPzhsdwbh) &&
                Objects.equals(fsbzdjPznm, that.fsbzdjPznm) &&
                Objects.equals(fsbzdjPzrq, that.fsbzdjPzrq) &&
                Objects.equals(fsbzdjQtxx, that.fsbzdjQtxx) &&
                Objects.equals(fsbzdjQxhj, that.fsbzdjQxhj) &&
                Objects.equals(fsbzdjQxhjmc, that.fsbzdjQxhjmc) &&
                Objects.equals(fsbzdjSlbh, that.fsbzdjSlbh) &&
                Objects.equals(fsbzdjTreemc, that.fsbzdjTreemc) &&
                Objects.equals(fsbzdjTrjd, that.fsbzdjTrjd) &&
                Objects.equals(fsbzdjUser, that.fsbzdjUser) &&
                Objects.equals(fsbzdjUserid, that.fsbzdjUserid) &&
                Objects.equals(fsbzdjUserxyzh, that.fsbzdjUserxyzh) &&
                Objects.equals(fsbzdjWbbh, that.fsbzdjWbbh) &&
                Objects.equals(fsbzdjWbid, that.fsbzdjWbid) &&
                Objects.equals(fsbzdjWbmc, that.fsbzdjWbmc) &&
                Objects.equals(fsbzdjWzpzh, that.fsbzdjWzpzh) &&
                Objects.equals(fsbzdjXspzh, that.fsbzdjXspzh) &&
                Objects.equals(fsbzdjYcxx, that.fsbzdjYcxx) &&
                Objects.equals(fsbzdjYear, that.fsbzdjYear) &&
                Objects.equals(fsbzdjYwlx, that.fsbzdjYwlx) &&
                Objects.equals(fsbzdjYwlxmc, that.fsbzdjYwlxmc) &&
                Objects.equals(fsbzdjYxzs, that.fsbzdjYxzs) &&
                Objects.equals(fsbzdjYxzt, that.fsbzdjYxzt) &&
                Objects.equals(fsbzdjZdr, that.fsbzdjZdr) &&
                Objects.equals(fsbzdjZdrmc, that.fsbzdjZdrmc) &&
                Objects.equals(fsbzdjZdsj, that.fsbzdjZdsj) &&
                Objects.equals(fsbzdjZtsm, that.fsbzdjZtsm) &&
                Objects.equals(fsbzdjZy, that.fsbzdjZy) &&
                Objects.equals(fsbzdjZzdjzt, that.fsbzdjZzdjzt) &&
                Objects.equals(lastmodifiedtime, that.lastmodifiedtime) &&
                Objects.equals(lastmodifier, that.lastmodifier) &&
                Objects.equals(kz01, that.kz01) &&
                Objects.equals(kz02, that.kz02) &&
                Objects.equals(kz03, that.kz03) &&
                Objects.equals(kz04, that.kz04) &&
                Objects.equals(kz05, that.kz05);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fsbzdjNm, createdtime, creator, fsbzdjBbje, fsbzdjBmid, fsbzdjBscs, fsbzdjBxr, fsbzdjBxrbmid, fsbzdjBxrdwbh, fsbzdjBxrdwnm, fsbzdjBxrmc, fsbzdjBz, fsbzdjCn, fsbzdjCnmc, fsbzdjCsr, fsbzdjCsrmc, fsbzdjCssj, fsbzdjDjbh, fsbzdjDjlx, fsbzdjDjnm, fsbzdjDjrq, fsbzdjDjywlx, fsbzdjDjzt, fsbzdjDqhj, fsbzdjDqhjmc, fsbzdjDwbh, fsbzdjDwnm, fsbzdjDycs, fsbzdjFhr, fsbzdjFhrmc, fsbzdjFhsj, fsbzdjFjzs, fsbzdjFkrq, fsbzdjFssc, fsbzdjIfbg, fsbzdjIfbs, fsbzdjIfjj, fsbzdjIfjswc, fsbzdjIfth, fsbzdjJe, fsbzdjJhr, fsbzdjJhrmc, fsbzdjJhsj, fsbzdjJsbbje, fsbzdjJsje, fsbzdjJzzz, fsbzdjJzzzid, fsbzdjKjqj, fsbzdjLcsl, fsbzdjLymk, fsbzdjNwzbz, fsbzdjPzflag, fsbzdjPzh, fsbzdjPzhsdwbh, fsbzdjPznm, fsbzdjPzrq, fsbzdjQtxx, fsbzdjQxhj, fsbzdjQxhjmc, fsbzdjSlbh, fsbzdjTreemc, fsbzdjTrjd, fsbzdjUser, fsbzdjUserid, fsbzdjUserxyzh, fsbzdjWbbh, fsbzdjWbid, fsbzdjWbmc, fsbzdjWzpzh, fsbzdjXspzh, fsbzdjYcxx, fsbzdjYear, fsbzdjYwlx, fsbzdjYwlxmc, fsbzdjYxzs, fsbzdjYxzt, fsbzdjZdr, fsbzdjZdrmc, fsbzdjZdsj, fsbzdjZtsm, fsbzdjZy, fsbzdjZzdjzt, lastmodifiedtime, lastmodifier, kz01, kz02, kz03, kz04, kz05);
    }
}
