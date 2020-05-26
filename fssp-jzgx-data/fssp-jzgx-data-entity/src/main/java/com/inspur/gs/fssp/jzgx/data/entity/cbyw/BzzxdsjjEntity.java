package com.inspur.gs.fssp.jzgx.data.entity.cbyw;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/7 16:29
 */
@Entity
@Table(name = "BZZXDSJJ", schema = "LC002")
public class BzzxdsjjEntity {
    private String dsjjDjnm;
    private String dsjjDjbh;
    private Date dsjjRq;
    private String dsjjDwid;
    private String dsjjDwbh;
    private String dsjjDwmc;
    private String dsjjBmid;
    private String dsjjBmbh;
    private String dsjjBmmc;
    private Long dsjjBzzt;
    private String dsjjUserid;
    private String dsjjUsercode;
    private String dsjjUsername;
    private String dsjjYwlx;
    private String dsjjYwlxmc;
    private String dsjjBzsy;
    private String dsjjZy;
    private String dsjjFjid;
    private Long dsjjFjzs;
    private String dsjjBwbbh;
    private String dsjjBwbmc;
    private String dsjjBzbh;
    private String dsjjBzmc;
    private Date dsjjJlksrq;
    private Date dsjjJljzrq;
    private String dsjjDfjbr;
    private Long dsjjDqjlje;
    private Long dsjjDqjljebb;
    private Long dsjjLjjlje;
    private Long dsjjLjjljebb;
    private String dsjjSfyqr;
    private String dsjjFplx;
    private String dsjjJsff;
    private Long dsjjBhsje;
    private Long dsjjBhsjebb;
    private Long dsjjSe;
    private Long dsjjSebb;
    private Long dsjjJshj;
    private Long dsjjJshjbb;
    private String dsjjXmnm;
    private String dsjjXmbh;
    private String dsjjXmmc;
    private String dsjjHtnm;
    private String dsjjHtbh;
    private String dsjjHtmc;
    private String dsjjWldwbh;
    private String dsjjWldwmc;
    private String dsjjPzflag;
    private String dsjjPznm;
    private String dsjjPzbh;
    private String dsjjWfid;
    private Long dsjjYxzt;
    private String dsjjCsr;
    private Date dsjjCsrq;
    private String dsjjJhr;
    private Date dsjjJhrq;
    private String dsjjFhr;
    private Date dsjjFhrq;
    private String dsjjZzr;
    private Date dsjjZzrq;
    private String creator;
    private Date createdtime;
    private String lastmodifier;
    private Date lastmodifiedtime;
    private String djlyxt;
    private String djlygn;
    private String qtxtdjnm;
    private String bzdlx;
    private String dsjjGnm1;
    private String dsjjGnm2;
    private String dsjjGnm3;
    private String dsjjGnm4;
    private String dsjjGnm5;
    private String dsjjGnm6;
    private String dsjjGnm7;
    private String dsjjGnm8;
    private String dsjjGnm9;
    private String dsjjGnm10;
    private String dsjjGxm1;
    private String dsjjGxm2;
    private String dsjjGxm3;
    private String dsjjGxm4;
    private String dsjjGxm5;
    private String dsjjGxm6;
    private String dsjjGxm7;
    private String dsjjGxm8;
    private String dsjjGxm9;
    private String dsjjGxm10;
    private Long dsjjSz1;
    private Long dsjjSz2;
    private Long dsjjSz3;
    private Long dsjjSz4;
    private Long dsjjSz5;
    private Long dsjjSz6;
    private Long dsjjSz7;
    private Long dsjjSz8;
    private Long dsjjSz9;
    private Long dsjjSz10;
    private Date dsjjRq1;
    private Date dsjjRq2;
    private Date dsjjRq3;
    private Date dsjjRq4;
    private Date dsjjRq5;
    private Date dsjjRq6;
    private Date dsjjRq7;
    private Date dsjjRq8;
    private Date dsjjRq9;
    private Date dsjjRq10;
    private String dsjjGbz1;
    private String dsjjGbz2;
    private String dsjjGbz3;
    private String dsjjGbz4;
    private String dsjjGbz5;
    private String dsjjGbz6;
    private String dsjjGbz7;
    private String dsjjGbz8;
    private String dsjjGbz9;
    private String dsjjGbz10;
    private byte[] dsjjFjsc;
    private String dsjjDjzt;
    private Long dsjjHl;
    private String dsjjJsfs;
    private String dsjjFkzhbh;
    private String dsjjFkzhmc;
    private String dsjjSkzhbh;
    private String dsjjSkzhmc;
    private String dsjjKhyh;
    private String dsjjKhs;
    private String dsjjKhcs;
    private String dsjjNote;

    @Id
    @Column(name = "DSJJ_DJNM")
    public String getDsjjDjnm() {
        return dsjjDjnm;
    }

    public void setDsjjDjnm(String dsjjDjnm) {
        this.dsjjDjnm = dsjjDjnm;
    }

    @Basic
    @Column(name = "DSJJ_DJBH")
    public String getDsjjDjbh() {
        return dsjjDjbh;
    }

    public void setDsjjDjbh(String dsjjDjbh) {
        this.dsjjDjbh = dsjjDjbh;
    }

    @Basic
    @Column(name = "DSJJ_RQ")
    public Date getDsjjRq() {
        return dsjjRq;
    }

    public void setDsjjRq(Date dsjjRq) {
        this.dsjjRq = dsjjRq;
    }

    @Basic
    @Column(name = "DSJJ_DWID")
    public String getDsjjDwid() {
        return dsjjDwid;
    }

    public void setDsjjDwid(String dsjjDwid) {
        this.dsjjDwid = dsjjDwid;
    }

    @Basic
    @Column(name = "DSJJ_DWBH")
    public String getDsjjDwbh() {
        return dsjjDwbh;
    }

    public void setDsjjDwbh(String dsjjDwbh) {
        this.dsjjDwbh = dsjjDwbh;
    }

    @Basic
    @Column(name = "DSJJ_DWMC")
    public String getDsjjDwmc() {
        return dsjjDwmc;
    }

    public void setDsjjDwmc(String dsjjDwmc) {
        this.dsjjDwmc = dsjjDwmc;
    }

    @Basic
    @Column(name = "DSJJ_BMID")
    public String getDsjjBmid() {
        return dsjjBmid;
    }

    public void setDsjjBmid(String dsjjBmid) {
        this.dsjjBmid = dsjjBmid;
    }

    @Basic
    @Column(name = "DSJJ_BMBH")
    public String getDsjjBmbh() {
        return dsjjBmbh;
    }

    public void setDsjjBmbh(String dsjjBmbh) {
        this.dsjjBmbh = dsjjBmbh;
    }

    @Basic
    @Column(name = "DSJJ_BMMC")
    public String getDsjjBmmc() {
        return dsjjBmmc;
    }

    public void setDsjjBmmc(String dsjjBmmc) {
        this.dsjjBmmc = dsjjBmmc;
    }

    @Basic
    @Column(name = "DSJJ_BZZT")
    public Long getDsjjBzzt() {
        return dsjjBzzt;
    }

    public void setDsjjBzzt(Long dsjjBzzt) {
        this.dsjjBzzt = dsjjBzzt;
    }

    @Basic
    @Column(name = "DSJJ_USERID")
    public String getDsjjUserid() {
        return dsjjUserid;
    }

    public void setDsjjUserid(String dsjjUserid) {
        this.dsjjUserid = dsjjUserid;
    }

    @Basic
    @Column(name = "DSJJ_USERCODE")
    public String getDsjjUsercode() {
        return dsjjUsercode;
    }

    public void setDsjjUsercode(String dsjjUsercode) {
        this.dsjjUsercode = dsjjUsercode;
    }

    @Basic
    @Column(name = "DSJJ_USERNAME")
    public String getDsjjUsername() {
        return dsjjUsername;
    }

    public void setDsjjUsername(String dsjjUsername) {
        this.dsjjUsername = dsjjUsername;
    }

    @Basic
    @Column(name = "DSJJ_YWLX")
    public String getDsjjYwlx() {
        return dsjjYwlx;
    }

    public void setDsjjYwlx(String dsjjYwlx) {
        this.dsjjYwlx = dsjjYwlx;
    }

    @Basic
    @Column(name = "DSJJ_YWLXMC")
    public String getDsjjYwlxmc() {
        return dsjjYwlxmc;
    }

    public void setDsjjYwlxmc(String dsjjYwlxmc) {
        this.dsjjYwlxmc = dsjjYwlxmc;
    }

    @Basic
    @Column(name = "DSJJ_BZSY")
    public String getDsjjBzsy() {
        return dsjjBzsy;
    }

    public void setDsjjBzsy(String dsjjBzsy) {
        this.dsjjBzsy = dsjjBzsy;
    }

    @Basic
    @Column(name = "DSJJ_ZY")
    public String getDsjjZy() {
        return dsjjZy;
    }

    public void setDsjjZy(String dsjjZy) {
        this.dsjjZy = dsjjZy;
    }

    @Basic
    @Column(name = "DSJJ_FJID")
    public String getDsjjFjid() {
        return dsjjFjid;
    }

    public void setDsjjFjid(String dsjjFjid) {
        this.dsjjFjid = dsjjFjid;
    }

    @Basic
    @Column(name = "DSJJ_FJZS")
    public Long getDsjjFjzs() {
        return dsjjFjzs;
    }

    public void setDsjjFjzs(Long dsjjFjzs) {
        this.dsjjFjzs = dsjjFjzs;
    }

    @Basic
    @Column(name = "DSJJ_BWBBH")
    public String getDsjjBwbbh() {
        return dsjjBwbbh;
    }

    public void setDsjjBwbbh(String dsjjBwbbh) {
        this.dsjjBwbbh = dsjjBwbbh;
    }

    @Basic
    @Column(name = "DSJJ_BWBMC")
    public String getDsjjBwbmc() {
        return dsjjBwbmc;
    }

    public void setDsjjBwbmc(String dsjjBwbmc) {
        this.dsjjBwbmc = dsjjBwbmc;
    }

    @Basic
    @Column(name = "DSJJ_BZBH")
    public String getDsjjBzbh() {
        return dsjjBzbh;
    }

    public void setDsjjBzbh(String dsjjBzbh) {
        this.dsjjBzbh = dsjjBzbh;
    }

    @Basic
    @Column(name = "DSJJ_BZMC")
    public String getDsjjBzmc() {
        return dsjjBzmc;
    }

    public void setDsjjBzmc(String dsjjBzmc) {
        this.dsjjBzmc = dsjjBzmc;
    }

    @Basic
    @Column(name = "DSJJ_JLKSRQ")
    public Date getDsjjJlksrq() {
        return dsjjJlksrq;
    }

    public void setDsjjJlksrq(Date dsjjJlksrq) {
        this.dsjjJlksrq = dsjjJlksrq;
    }

    @Basic
    @Column(name = "DSJJ_JLJZRQ")
    public Date getDsjjJljzrq() {
        return dsjjJljzrq;
    }

    public void setDsjjJljzrq(Date dsjjJljzrq) {
        this.dsjjJljzrq = dsjjJljzrq;
    }

    @Basic
    @Column(name = "DSJJ_DFJBR")
    public String getDsjjDfjbr() {
        return dsjjDfjbr;
    }

    public void setDsjjDfjbr(String dsjjDfjbr) {
        this.dsjjDfjbr = dsjjDfjbr;
    }

    @Basic
    @Column(name = "DSJJ_DQJLJE")
    public Long getDsjjDqjlje() {
        return dsjjDqjlje;
    }

    public void setDsjjDqjlje(Long dsjjDqjlje) {
        this.dsjjDqjlje = dsjjDqjlje;
    }

    @Basic
    @Column(name = "DSJJ_DQJLJEBB")
    public Long getDsjjDqjljebb() {
        return dsjjDqjljebb;
    }

    public void setDsjjDqjljebb(Long dsjjDqjljebb) {
        this.dsjjDqjljebb = dsjjDqjljebb;
    }

    @Basic
    @Column(name = "DSJJ_LJJLJE")
    public Long getDsjjLjjlje() {
        return dsjjLjjlje;
    }

    public void setDsjjLjjlje(Long dsjjLjjlje) {
        this.dsjjLjjlje = dsjjLjjlje;
    }

    @Basic
    @Column(name = "DSJJ_LJJLJEBB")
    public Long getDsjjLjjljebb() {
        return dsjjLjjljebb;
    }

    public void setDsjjLjjljebb(Long dsjjLjjljebb) {
        this.dsjjLjjljebb = dsjjLjjljebb;
    }

    @Basic
    @Column(name = "DSJJ_SFYQR")
    public String getDsjjSfyqr() {
        return dsjjSfyqr;
    }

    public void setDsjjSfyqr(String dsjjSfyqr) {
        this.dsjjSfyqr = dsjjSfyqr;
    }

    @Basic
    @Column(name = "DSJJ_FPLX")
    public String getDsjjFplx() {
        return dsjjFplx;
    }

    public void setDsjjFplx(String dsjjFplx) {
        this.dsjjFplx = dsjjFplx;
    }

    @Basic
    @Column(name = "DSJJ_JSFF")
    public String getDsjjJsff() {
        return dsjjJsff;
    }

    public void setDsjjJsff(String dsjjJsff) {
        this.dsjjJsff = dsjjJsff;
    }

    @Basic
    @Column(name = "DSJJ_BHSJE")
    public Long getDsjjBhsje() {
        return dsjjBhsje;
    }

    public void setDsjjBhsje(Long dsjjBhsje) {
        this.dsjjBhsje = dsjjBhsje;
    }

    @Basic
    @Column(name = "DSJJ_BHSJEBB")
    public Long getDsjjBhsjebb() {
        return dsjjBhsjebb;
    }

    public void setDsjjBhsjebb(Long dsjjBhsjebb) {
        this.dsjjBhsjebb = dsjjBhsjebb;
    }

    @Basic
    @Column(name = "DSJJ_SE")
    public Long getDsjjSe() {
        return dsjjSe;
    }

    public void setDsjjSe(Long dsjjSe) {
        this.dsjjSe = dsjjSe;
    }

    @Basic
    @Column(name = "DSJJ_SEBB")
    public Long getDsjjSebb() {
        return dsjjSebb;
    }

    public void setDsjjSebb(Long dsjjSebb) {
        this.dsjjSebb = dsjjSebb;
    }

    @Basic
    @Column(name = "DSJJ_JSHJ")
    public Long getDsjjJshj() {
        return dsjjJshj;
    }

    public void setDsjjJshj(Long dsjjJshj) {
        this.dsjjJshj = dsjjJshj;
    }

    @Basic
    @Column(name = "DSJJ_JSHJBB")
    public Long getDsjjJshjbb() {
        return dsjjJshjbb;
    }

    public void setDsjjJshjbb(Long dsjjJshjbb) {
        this.dsjjJshjbb = dsjjJshjbb;
    }

    @Basic
    @Column(name = "DSJJ_XMNM")
    public String getDsjjXmnm() {
        return dsjjXmnm;
    }

    public void setDsjjXmnm(String dsjjXmnm) {
        this.dsjjXmnm = dsjjXmnm;
    }

    @Basic
    @Column(name = "DSJJ_XMBH")
    public String getDsjjXmbh() {
        return dsjjXmbh;
    }

    public void setDsjjXmbh(String dsjjXmbh) {
        this.dsjjXmbh = dsjjXmbh;
    }

    @Basic
    @Column(name = "DSJJ_XMMC")
    public String getDsjjXmmc() {
        return dsjjXmmc;
    }

    public void setDsjjXmmc(String dsjjXmmc) {
        this.dsjjXmmc = dsjjXmmc;
    }

    @Basic
    @Column(name = "DSJJ_HTNM")
    public String getDsjjHtnm() {
        return dsjjHtnm;
    }

    public void setDsjjHtnm(String dsjjHtnm) {
        this.dsjjHtnm = dsjjHtnm;
    }

    @Basic
    @Column(name = "DSJJ_HTBH")
    public String getDsjjHtbh() {
        return dsjjHtbh;
    }

    public void setDsjjHtbh(String dsjjHtbh) {
        this.dsjjHtbh = dsjjHtbh;
    }

    @Basic
    @Column(name = "DSJJ_HTMC")
    public String getDsjjHtmc() {
        return dsjjHtmc;
    }

    public void setDsjjHtmc(String dsjjHtmc) {
        this.dsjjHtmc = dsjjHtmc;
    }

    @Basic
    @Column(name = "DSJJ_WLDWBH")
    public String getDsjjWldwbh() {
        return dsjjWldwbh;
    }

    public void setDsjjWldwbh(String dsjjWldwbh) {
        this.dsjjWldwbh = dsjjWldwbh;
    }

    @Basic
    @Column(name = "DSJJ_WLDWMC")
    public String getDsjjWldwmc() {
        return dsjjWldwmc;
    }

    public void setDsjjWldwmc(String dsjjWldwmc) {
        this.dsjjWldwmc = dsjjWldwmc;
    }

    @Basic
    @Column(name = "DSJJ_PZFLAG")
    public String getDsjjPzflag() {
        return dsjjPzflag;
    }

    public void setDsjjPzflag(String dsjjPzflag) {
        this.dsjjPzflag = dsjjPzflag;
    }

    @Basic
    @Column(name = "DSJJ_PZNM")
    public String getDsjjPznm() {
        return dsjjPznm;
    }

    public void setDsjjPznm(String dsjjPznm) {
        this.dsjjPznm = dsjjPznm;
    }

    @Basic
    @Column(name = "DSJJ_PZBH")
    public String getDsjjPzbh() {
        return dsjjPzbh;
    }

    public void setDsjjPzbh(String dsjjPzbh) {
        this.dsjjPzbh = dsjjPzbh;
    }

    @Basic
    @Column(name = "DSJJ_WFID")
    public String getDsjjWfid() {
        return dsjjWfid;
    }

    public void setDsjjWfid(String dsjjWfid) {
        this.dsjjWfid = dsjjWfid;
    }

    @Basic
    @Column(name = "DSJJ_YXZT")
    public Long getDsjjYxzt() {
        return dsjjYxzt;
    }

    public void setDsjjYxzt(Long dsjjYxzt) {
        this.dsjjYxzt = dsjjYxzt;
    }

    @Basic
    @Column(name = "DSJJ_CSR")
    public String getDsjjCsr() {
        return dsjjCsr;
    }

    public void setDsjjCsr(String dsjjCsr) {
        this.dsjjCsr = dsjjCsr;
    }

    @Basic
    @Column(name = "DSJJ_CSRQ")
    public Date getDsjjCsrq() {
        return dsjjCsrq;
    }

    public void setDsjjCsrq(Date dsjjCsrq) {
        this.dsjjCsrq = dsjjCsrq;
    }

    @Basic
    @Column(name = "DSJJ_JHR")
    public String getDsjjJhr() {
        return dsjjJhr;
    }

    public void setDsjjJhr(String dsjjJhr) {
        this.dsjjJhr = dsjjJhr;
    }

    @Basic
    @Column(name = "DSJJ_JHRQ")
    public Date getDsjjJhrq() {
        return dsjjJhrq;
    }

    public void setDsjjJhrq(Date dsjjJhrq) {
        this.dsjjJhrq = dsjjJhrq;
    }

    @Basic
    @Column(name = "DSJJ_FHR")
    public String getDsjjFhr() {
        return dsjjFhr;
    }

    public void setDsjjFhr(String dsjjFhr) {
        this.dsjjFhr = dsjjFhr;
    }

    @Basic
    @Column(name = "DSJJ_FHRQ")
    public Date getDsjjFhrq() {
        return dsjjFhrq;
    }

    public void setDsjjFhrq(Date dsjjFhrq) {
        this.dsjjFhrq = dsjjFhrq;
    }

    @Basic
    @Column(name = "DSJJ_ZZR")
    public String getDsjjZzr() {
        return dsjjZzr;
    }

    public void setDsjjZzr(String dsjjZzr) {
        this.dsjjZzr = dsjjZzr;
    }

    @Basic
    @Column(name = "DSJJ_ZZRQ")
    public Date getDsjjZzrq() {
        return dsjjZzrq;
    }

    public void setDsjjZzrq(Date dsjjZzrq) {
        this.dsjjZzrq = dsjjZzrq;
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
    @Column(name = "CREATEDTIME")
    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
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
    @Column(name = "LASTMODIFIEDTIME")
    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    @Basic
    @Column(name = "DJLYXT")
    public String getDjlyxt() {
        return djlyxt;
    }

    public void setDjlyxt(String djlyxt) {
        this.djlyxt = djlyxt;
    }

    @Basic
    @Column(name = "DJLYGN")
    public String getDjlygn() {
        return djlygn;
    }

    public void setDjlygn(String djlygn) {
        this.djlygn = djlygn;
    }

    @Basic
    @Column(name = "QTXTDJNM")
    public String getQtxtdjnm() {
        return qtxtdjnm;
    }

    public void setQtxtdjnm(String qtxtdjnm) {
        this.qtxtdjnm = qtxtdjnm;
    }

    @Basic
    @Column(name = "BZDLX")
    public String getBzdlx() {
        return bzdlx;
    }

    public void setBzdlx(String bzdlx) {
        this.bzdlx = bzdlx;
    }

    @Basic
    @Column(name = "DSJJ_GNM1")
    public String getDsjjGnm1() {
        return dsjjGnm1;
    }

    public void setDsjjGnm1(String dsjjGnm1) {
        this.dsjjGnm1 = dsjjGnm1;
    }

    @Basic
    @Column(name = "DSJJ_GNM2")
    public String getDsjjGnm2() {
        return dsjjGnm2;
    }

    public void setDsjjGnm2(String dsjjGnm2) {
        this.dsjjGnm2 = dsjjGnm2;
    }

    @Basic
    @Column(name = "DSJJ_GNM3")
    public String getDsjjGnm3() {
        return dsjjGnm3;
    }

    public void setDsjjGnm3(String dsjjGnm3) {
        this.dsjjGnm3 = dsjjGnm3;
    }

    @Basic
    @Column(name = "DSJJ_GNM4")
    public String getDsjjGnm4() {
        return dsjjGnm4;
    }

    public void setDsjjGnm4(String dsjjGnm4) {
        this.dsjjGnm4 = dsjjGnm4;
    }

    @Basic
    @Column(name = "DSJJ_GNM5")
    public String getDsjjGnm5() {
        return dsjjGnm5;
    }

    public void setDsjjGnm5(String dsjjGnm5) {
        this.dsjjGnm5 = dsjjGnm5;
    }

    @Basic
    @Column(name = "DSJJ_GNM6")
    public String getDsjjGnm6() {
        return dsjjGnm6;
    }

    public void setDsjjGnm6(String dsjjGnm6) {
        this.dsjjGnm6 = dsjjGnm6;
    }

    @Basic
    @Column(name = "DSJJ_GNM7")
    public String getDsjjGnm7() {
        return dsjjGnm7;
    }

    public void setDsjjGnm7(String dsjjGnm7) {
        this.dsjjGnm7 = dsjjGnm7;
    }

    @Basic
    @Column(name = "DSJJ_GNM8")
    public String getDsjjGnm8() {
        return dsjjGnm8;
    }

    public void setDsjjGnm8(String dsjjGnm8) {
        this.dsjjGnm8 = dsjjGnm8;
    }

    @Basic
    @Column(name = "DSJJ_GNM9")
    public String getDsjjGnm9() {
        return dsjjGnm9;
    }

    public void setDsjjGnm9(String dsjjGnm9) {
        this.dsjjGnm9 = dsjjGnm9;
    }

    @Basic
    @Column(name = "DSJJ_GNM10")
    public String getDsjjGnm10() {
        return dsjjGnm10;
    }

    public void setDsjjGnm10(String dsjjGnm10) {
        this.dsjjGnm10 = dsjjGnm10;
    }

    @Basic
    @Column(name = "DSJJ_GXM1")
    public String getDsjjGxm1() {
        return dsjjGxm1;
    }

    public void setDsjjGxm1(String dsjjGxm1) {
        this.dsjjGxm1 = dsjjGxm1;
    }

    @Basic
    @Column(name = "DSJJ_GXM2")
    public String getDsjjGxm2() {
        return dsjjGxm2;
    }

    public void setDsjjGxm2(String dsjjGxm2) {
        this.dsjjGxm2 = dsjjGxm2;
    }

    @Basic
    @Column(name = "DSJJ_GXM3")
    public String getDsjjGxm3() {
        return dsjjGxm3;
    }

    public void setDsjjGxm3(String dsjjGxm3) {
        this.dsjjGxm3 = dsjjGxm3;
    }

    @Basic
    @Column(name = "DSJJ_GXM4")
    public String getDsjjGxm4() {
        return dsjjGxm4;
    }

    public void setDsjjGxm4(String dsjjGxm4) {
        this.dsjjGxm4 = dsjjGxm4;
    }

    @Basic
    @Column(name = "DSJJ_GXM5")
    public String getDsjjGxm5() {
        return dsjjGxm5;
    }

    public void setDsjjGxm5(String dsjjGxm5) {
        this.dsjjGxm5 = dsjjGxm5;
    }

    @Basic
    @Column(name = "DSJJ_GXM6")
    public String getDsjjGxm6() {
        return dsjjGxm6;
    }

    public void setDsjjGxm6(String dsjjGxm6) {
        this.dsjjGxm6 = dsjjGxm6;
    }

    @Basic
    @Column(name = "DSJJ_GXM7")
    public String getDsjjGxm7() {
        return dsjjGxm7;
    }

    public void setDsjjGxm7(String dsjjGxm7) {
        this.dsjjGxm7 = dsjjGxm7;
    }

    @Basic
    @Column(name = "DSJJ_GXM8")
    public String getDsjjGxm8() {
        return dsjjGxm8;
    }

    public void setDsjjGxm8(String dsjjGxm8) {
        this.dsjjGxm8 = dsjjGxm8;
    }

    @Basic
    @Column(name = "DSJJ_GXM9")
    public String getDsjjGxm9() {
        return dsjjGxm9;
    }

    public void setDsjjGxm9(String dsjjGxm9) {
        this.dsjjGxm9 = dsjjGxm9;
    }

    @Basic
    @Column(name = "DSJJ_GXM10")
    public String getDsjjGxm10() {
        return dsjjGxm10;
    }

    public void setDsjjGxm10(String dsjjGxm10) {
        this.dsjjGxm10 = dsjjGxm10;
    }

    @Basic
    @Column(name = "DSJJ_SZ1")
    public Long getDsjjSz1() {
        return dsjjSz1;
    }

    public void setDsjjSz1(Long dsjjSz1) {
        this.dsjjSz1 = dsjjSz1;
    }

    @Basic
    @Column(name = "DSJJ_SZ2")
    public Long getDsjjSz2() {
        return dsjjSz2;
    }

    public void setDsjjSz2(Long dsjjSz2) {
        this.dsjjSz2 = dsjjSz2;
    }

    @Basic
    @Column(name = "DSJJ_SZ3")
    public Long getDsjjSz3() {
        return dsjjSz3;
    }

    public void setDsjjSz3(Long dsjjSz3) {
        this.dsjjSz3 = dsjjSz3;
    }

    @Basic
    @Column(name = "DSJJ_SZ4")
    public Long getDsjjSz4() {
        return dsjjSz4;
    }

    public void setDsjjSz4(Long dsjjSz4) {
        this.dsjjSz4 = dsjjSz4;
    }

    @Basic
    @Column(name = "DSJJ_SZ5")
    public Long getDsjjSz5() {
        return dsjjSz5;
    }

    public void setDsjjSz5(Long dsjjSz5) {
        this.dsjjSz5 = dsjjSz5;
    }

    @Basic
    @Column(name = "DSJJ_SZ6")
    public Long getDsjjSz6() {
        return dsjjSz6;
    }

    public void setDsjjSz6(Long dsjjSz6) {
        this.dsjjSz6 = dsjjSz6;
    }

    @Basic
    @Column(name = "DSJJ_SZ7")
    public Long getDsjjSz7() {
        return dsjjSz7;
    }

    public void setDsjjSz7(Long dsjjSz7) {
        this.dsjjSz7 = dsjjSz7;
    }

    @Basic
    @Column(name = "DSJJ_SZ8")
    public Long getDsjjSz8() {
        return dsjjSz8;
    }

    public void setDsjjSz8(Long dsjjSz8) {
        this.dsjjSz8 = dsjjSz8;
    }

    @Basic
    @Column(name = "DSJJ_SZ9")
    public Long getDsjjSz9() {
        return dsjjSz9;
    }

    public void setDsjjSz9(Long dsjjSz9) {
        this.dsjjSz9 = dsjjSz9;
    }

    @Basic
    @Column(name = "DSJJ_SZ10")
    public Long getDsjjSz10() {
        return dsjjSz10;
    }

    public void setDsjjSz10(Long dsjjSz10) {
        this.dsjjSz10 = dsjjSz10;
    }

    @Basic
    @Column(name = "DSJJ_RQ1")
    public Date getDsjjRq1() {
        return dsjjRq1;
    }

    public void setDsjjRq1(Date dsjjRq1) {
        this.dsjjRq1 = dsjjRq1;
    }

    @Basic
    @Column(name = "DSJJ_RQ2")
    public Date getDsjjRq2() {
        return dsjjRq2;
    }

    public void setDsjjRq2(Date dsjjRq2) {
        this.dsjjRq2 = dsjjRq2;
    }

    @Basic
    @Column(name = "DSJJ_RQ3")
    public Date getDsjjRq3() {
        return dsjjRq3;
    }

    public void setDsjjRq3(Date dsjjRq3) {
        this.dsjjRq3 = dsjjRq3;
    }

    @Basic
    @Column(name = "DSJJ_RQ4")
    public Date getDsjjRq4() {
        return dsjjRq4;
    }

    public void setDsjjRq4(Date dsjjRq4) {
        this.dsjjRq4 = dsjjRq4;
    }

    @Basic
    @Column(name = "DSJJ_RQ5")
    public Date getDsjjRq5() {
        return dsjjRq5;
    }

    public void setDsjjRq5(Date dsjjRq5) {
        this.dsjjRq5 = dsjjRq5;
    }

    @Basic
    @Column(name = "DSJJ_RQ6")
    public Date getDsjjRq6() {
        return dsjjRq6;
    }

    public void setDsjjRq6(Date dsjjRq6) {
        this.dsjjRq6 = dsjjRq6;
    }

    @Basic
    @Column(name = "DSJJ_RQ7")
    public Date getDsjjRq7() {
        return dsjjRq7;
    }

    public void setDsjjRq7(Date dsjjRq7) {
        this.dsjjRq7 = dsjjRq7;
    }

    @Basic
    @Column(name = "DSJJ_RQ8")
    public Date getDsjjRq8() {
        return dsjjRq8;
    }

    public void setDsjjRq8(Date dsjjRq8) {
        this.dsjjRq8 = dsjjRq8;
    }

    @Basic
    @Column(name = "DSJJ_RQ9")
    public Date getDsjjRq9() {
        return dsjjRq9;
    }

    public void setDsjjRq9(Date dsjjRq9) {
        this.dsjjRq9 = dsjjRq9;
    }

    @Basic
    @Column(name = "DSJJ_RQ10")
    public Date getDsjjRq10() {
        return dsjjRq10;
    }

    public void setDsjjRq10(Date dsjjRq10) {
        this.dsjjRq10 = dsjjRq10;
    }

    @Basic
    @Column(name = "DSJJ_GBZ1")
    public String getDsjjGbz1() {
        return dsjjGbz1;
    }

    public void setDsjjGbz1(String dsjjGbz1) {
        this.dsjjGbz1 = dsjjGbz1;
    }

    @Basic
    @Column(name = "DSJJ_GBZ2")
    public String getDsjjGbz2() {
        return dsjjGbz2;
    }

    public void setDsjjGbz2(String dsjjGbz2) {
        this.dsjjGbz2 = dsjjGbz2;
    }

    @Basic
    @Column(name = "DSJJ_GBZ3")
    public String getDsjjGbz3() {
        return dsjjGbz3;
    }

    public void setDsjjGbz3(String dsjjGbz3) {
        this.dsjjGbz3 = dsjjGbz3;
    }

    @Basic
    @Column(name = "DSJJ_GBZ4")
    public String getDsjjGbz4() {
        return dsjjGbz4;
    }

    public void setDsjjGbz4(String dsjjGbz4) {
        this.dsjjGbz4 = dsjjGbz4;
    }

    @Basic
    @Column(name = "DSJJ_GBZ5")
    public String getDsjjGbz5() {
        return dsjjGbz5;
    }

    public void setDsjjGbz5(String dsjjGbz5) {
        this.dsjjGbz5 = dsjjGbz5;
    }

    @Basic
    @Column(name = "DSJJ_GBZ6")
    public String getDsjjGbz6() {
        return dsjjGbz6;
    }

    public void setDsjjGbz6(String dsjjGbz6) {
        this.dsjjGbz6 = dsjjGbz6;
    }

    @Basic
    @Column(name = "DSJJ_GBZ7")
    public String getDsjjGbz7() {
        return dsjjGbz7;
    }

    public void setDsjjGbz7(String dsjjGbz7) {
        this.dsjjGbz7 = dsjjGbz7;
    }

    @Basic
    @Column(name = "DSJJ_GBZ8")
    public String getDsjjGbz8() {
        return dsjjGbz8;
    }

    public void setDsjjGbz8(String dsjjGbz8) {
        this.dsjjGbz8 = dsjjGbz8;
    }

    @Basic
    @Column(name = "DSJJ_GBZ9")
    public String getDsjjGbz9() {
        return dsjjGbz9;
    }

    public void setDsjjGbz9(String dsjjGbz9) {
        this.dsjjGbz9 = dsjjGbz9;
    }

    @Basic
    @Column(name = "DSJJ_GBZ10")
    public String getDsjjGbz10() {
        return dsjjGbz10;
    }

    public void setDsjjGbz10(String dsjjGbz10) {
        this.dsjjGbz10 = dsjjGbz10;
    }

    @Basic
    @Column(name = "DSJJ_FJSC")
    public byte[] getDsjjFjsc() {
        return dsjjFjsc;
    }

    public void setDsjjFjsc(byte[] dsjjFjsc) {
        this.dsjjFjsc = dsjjFjsc;
    }

    @Basic
    @Column(name = "DSJJ_DJZT")
    public String getDsjjDjzt() {
        return dsjjDjzt;
    }

    public void setDsjjDjzt(String dsjjDjzt) {
        this.dsjjDjzt = dsjjDjzt;
    }

    @Basic
    @Column(name = "DSJJ_HL")
    public Long getDsjjHl() {
        return dsjjHl;
    }

    public void setDsjjHl(Long dsjjHl) {
        this.dsjjHl = dsjjHl;
    }

    @Basic
    @Column(name = "DSJJ_JSFS")
    public String getDsjjJsfs() {
        return dsjjJsfs;
    }

    public void setDsjjJsfs(String dsjjJsfs) {
        this.dsjjJsfs = dsjjJsfs;
    }

    @Basic
    @Column(name = "DSJJ_FKZHBH")
    public String getDsjjFkzhbh() {
        return dsjjFkzhbh;
    }

    public void setDsjjFkzhbh(String dsjjFkzhbh) {
        this.dsjjFkzhbh = dsjjFkzhbh;
    }

    @Basic
    @Column(name = "DSJJ_FKZHMC")
    public String getDsjjFkzhmc() {
        return dsjjFkzhmc;
    }

    public void setDsjjFkzhmc(String dsjjFkzhmc) {
        this.dsjjFkzhmc = dsjjFkzhmc;
    }

    @Basic
    @Column(name = "DSJJ_SKZHBH")
    public String getDsjjSkzhbh() {
        return dsjjSkzhbh;
    }

    public void setDsjjSkzhbh(String dsjjSkzhbh) {
        this.dsjjSkzhbh = dsjjSkzhbh;
    }

    @Basic
    @Column(name = "DSJJ_SKZHMC")
    public String getDsjjSkzhmc() {
        return dsjjSkzhmc;
    }

    public void setDsjjSkzhmc(String dsjjSkzhmc) {
        this.dsjjSkzhmc = dsjjSkzhmc;
    }

    @Basic
    @Column(name = "DSJJ_KHYH")
    public String getDsjjKhyh() {
        return dsjjKhyh;
    }

    public void setDsjjKhyh(String dsjjKhyh) {
        this.dsjjKhyh = dsjjKhyh;
    }

    @Basic
    @Column(name = "DSJJ_KHS")
    public String getDsjjKhs() {
        return dsjjKhs;
    }

    public void setDsjjKhs(String dsjjKhs) {
        this.dsjjKhs = dsjjKhs;
    }

    @Basic
    @Column(name = "DSJJ_KHCS")
    public String getDsjjKhcs() {
        return dsjjKhcs;
    }

    public void setDsjjKhcs(String dsjjKhcs) {
        this.dsjjKhcs = dsjjKhcs;
    }

    @Basic
    @Column(name = "DSJJ_NOTE")
    public String getDsjjNote() {
        return dsjjNote;
    }

    public void setDsjjNote(String dsjjNote) {
        this.dsjjNote = dsjjNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BzzxdsjjEntity that = (BzzxdsjjEntity) o;
        return Objects.equals(dsjjDjnm, that.dsjjDjnm) &&
                Objects.equals(dsjjDjbh, that.dsjjDjbh) &&
                Objects.equals(dsjjRq, that.dsjjRq) &&
                Objects.equals(dsjjDwid, that.dsjjDwid) &&
                Objects.equals(dsjjDwbh, that.dsjjDwbh) &&
                Objects.equals(dsjjDwmc, that.dsjjDwmc) &&
                Objects.equals(dsjjBmid, that.dsjjBmid) &&
                Objects.equals(dsjjBmbh, that.dsjjBmbh) &&
                Objects.equals(dsjjBmmc, that.dsjjBmmc) &&
                Objects.equals(dsjjBzzt, that.dsjjBzzt) &&
                Objects.equals(dsjjUserid, that.dsjjUserid) &&
                Objects.equals(dsjjUsercode, that.dsjjUsercode) &&
                Objects.equals(dsjjUsername, that.dsjjUsername) &&
                Objects.equals(dsjjYwlx, that.dsjjYwlx) &&
                Objects.equals(dsjjYwlxmc, that.dsjjYwlxmc) &&
                Objects.equals(dsjjBzsy, that.dsjjBzsy) &&
                Objects.equals(dsjjZy, that.dsjjZy) &&
                Objects.equals(dsjjFjid, that.dsjjFjid) &&
                Objects.equals(dsjjFjzs, that.dsjjFjzs) &&
                Objects.equals(dsjjBwbbh, that.dsjjBwbbh) &&
                Objects.equals(dsjjBwbmc, that.dsjjBwbmc) &&
                Objects.equals(dsjjBzbh, that.dsjjBzbh) &&
                Objects.equals(dsjjBzmc, that.dsjjBzmc) &&
                Objects.equals(dsjjJlksrq, that.dsjjJlksrq) &&
                Objects.equals(dsjjJljzrq, that.dsjjJljzrq) &&
                Objects.equals(dsjjDfjbr, that.dsjjDfjbr) &&
                Objects.equals(dsjjDqjlje, that.dsjjDqjlje) &&
                Objects.equals(dsjjDqjljebb, that.dsjjDqjljebb) &&
                Objects.equals(dsjjLjjlje, that.dsjjLjjlje) &&
                Objects.equals(dsjjLjjljebb, that.dsjjLjjljebb) &&
                Objects.equals(dsjjSfyqr, that.dsjjSfyqr) &&
                Objects.equals(dsjjFplx, that.dsjjFplx) &&
                Objects.equals(dsjjJsff, that.dsjjJsff) &&
                Objects.equals(dsjjBhsje, that.dsjjBhsje) &&
                Objects.equals(dsjjBhsjebb, that.dsjjBhsjebb) &&
                Objects.equals(dsjjSe, that.dsjjSe) &&
                Objects.equals(dsjjSebb, that.dsjjSebb) &&
                Objects.equals(dsjjJshj, that.dsjjJshj) &&
                Objects.equals(dsjjJshjbb, that.dsjjJshjbb) &&
                Objects.equals(dsjjXmnm, that.dsjjXmnm) &&
                Objects.equals(dsjjXmbh, that.dsjjXmbh) &&
                Objects.equals(dsjjXmmc, that.dsjjXmmc) &&
                Objects.equals(dsjjHtnm, that.dsjjHtnm) &&
                Objects.equals(dsjjHtbh, that.dsjjHtbh) &&
                Objects.equals(dsjjHtmc, that.dsjjHtmc) &&
                Objects.equals(dsjjWldwbh, that.dsjjWldwbh) &&
                Objects.equals(dsjjWldwmc, that.dsjjWldwmc) &&
                Objects.equals(dsjjPzflag, that.dsjjPzflag) &&
                Objects.equals(dsjjPznm, that.dsjjPznm) &&
                Objects.equals(dsjjPzbh, that.dsjjPzbh) &&
                Objects.equals(dsjjWfid, that.dsjjWfid) &&
                Objects.equals(dsjjYxzt, that.dsjjYxzt) &&
                Objects.equals(dsjjCsr, that.dsjjCsr) &&
                Objects.equals(dsjjCsrq, that.dsjjCsrq) &&
                Objects.equals(dsjjJhr, that.dsjjJhr) &&
                Objects.equals(dsjjJhrq, that.dsjjJhrq) &&
                Objects.equals(dsjjFhr, that.dsjjFhr) &&
                Objects.equals(dsjjFhrq, that.dsjjFhrq) &&
                Objects.equals(dsjjZzr, that.dsjjZzr) &&
                Objects.equals(dsjjZzrq, that.dsjjZzrq) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(createdtime, that.createdtime) &&
                Objects.equals(lastmodifier, that.lastmodifier) &&
                Objects.equals(lastmodifiedtime, that.lastmodifiedtime) &&
                Objects.equals(djlyxt, that.djlyxt) &&
                Objects.equals(djlygn, that.djlygn) &&
                Objects.equals(qtxtdjnm, that.qtxtdjnm) &&
                Objects.equals(bzdlx, that.bzdlx) &&
                Objects.equals(dsjjGnm1, that.dsjjGnm1) &&
                Objects.equals(dsjjGnm2, that.dsjjGnm2) &&
                Objects.equals(dsjjGnm3, that.dsjjGnm3) &&
                Objects.equals(dsjjGnm4, that.dsjjGnm4) &&
                Objects.equals(dsjjGnm5, that.dsjjGnm5) &&
                Objects.equals(dsjjGnm6, that.dsjjGnm6) &&
                Objects.equals(dsjjGnm7, that.dsjjGnm7) &&
                Objects.equals(dsjjGnm8, that.dsjjGnm8) &&
                Objects.equals(dsjjGnm9, that.dsjjGnm9) &&
                Objects.equals(dsjjGnm10, that.dsjjGnm10) &&
                Objects.equals(dsjjGxm1, that.dsjjGxm1) &&
                Objects.equals(dsjjGxm2, that.dsjjGxm2) &&
                Objects.equals(dsjjGxm3, that.dsjjGxm3) &&
                Objects.equals(dsjjGxm4, that.dsjjGxm4) &&
                Objects.equals(dsjjGxm5, that.dsjjGxm5) &&
                Objects.equals(dsjjGxm6, that.dsjjGxm6) &&
                Objects.equals(dsjjGxm7, that.dsjjGxm7) &&
                Objects.equals(dsjjGxm8, that.dsjjGxm8) &&
                Objects.equals(dsjjGxm9, that.dsjjGxm9) &&
                Objects.equals(dsjjGxm10, that.dsjjGxm10) &&
                Objects.equals(dsjjSz1, that.dsjjSz1) &&
                Objects.equals(dsjjSz2, that.dsjjSz2) &&
                Objects.equals(dsjjSz3, that.dsjjSz3) &&
                Objects.equals(dsjjSz4, that.dsjjSz4) &&
                Objects.equals(dsjjSz5, that.dsjjSz5) &&
                Objects.equals(dsjjSz6, that.dsjjSz6) &&
                Objects.equals(dsjjSz7, that.dsjjSz7) &&
                Objects.equals(dsjjSz8, that.dsjjSz8) &&
                Objects.equals(dsjjSz9, that.dsjjSz9) &&
                Objects.equals(dsjjSz10, that.dsjjSz10) &&
                Objects.equals(dsjjRq1, that.dsjjRq1) &&
                Objects.equals(dsjjRq2, that.dsjjRq2) &&
                Objects.equals(dsjjRq3, that.dsjjRq3) &&
                Objects.equals(dsjjRq4, that.dsjjRq4) &&
                Objects.equals(dsjjRq5, that.dsjjRq5) &&
                Objects.equals(dsjjRq6, that.dsjjRq6) &&
                Objects.equals(dsjjRq7, that.dsjjRq7) &&
                Objects.equals(dsjjRq8, that.dsjjRq8) &&
                Objects.equals(dsjjRq9, that.dsjjRq9) &&
                Objects.equals(dsjjRq10, that.dsjjRq10) &&
                Objects.equals(dsjjGbz1, that.dsjjGbz1) &&
                Objects.equals(dsjjGbz2, that.dsjjGbz2) &&
                Objects.equals(dsjjGbz3, that.dsjjGbz3) &&
                Objects.equals(dsjjGbz4, that.dsjjGbz4) &&
                Objects.equals(dsjjGbz5, that.dsjjGbz5) &&
                Objects.equals(dsjjGbz6, that.dsjjGbz6) &&
                Objects.equals(dsjjGbz7, that.dsjjGbz7) &&
                Objects.equals(dsjjGbz8, that.dsjjGbz8) &&
                Objects.equals(dsjjGbz9, that.dsjjGbz9) &&
                Objects.equals(dsjjGbz10, that.dsjjGbz10) &&
                Arrays.equals(dsjjFjsc, that.dsjjFjsc) &&
                Objects.equals(dsjjDjzt, that.dsjjDjzt) &&
                Objects.equals(dsjjHl, that.dsjjHl) &&
                Objects.equals(dsjjJsfs, that.dsjjJsfs) &&
                Objects.equals(dsjjFkzhbh, that.dsjjFkzhbh) &&
                Objects.equals(dsjjFkzhmc, that.dsjjFkzhmc) &&
                Objects.equals(dsjjSkzhbh, that.dsjjSkzhbh) &&
                Objects.equals(dsjjSkzhmc, that.dsjjSkzhmc) &&
                Objects.equals(dsjjKhyh, that.dsjjKhyh) &&
                Objects.equals(dsjjKhs, that.dsjjKhs) &&
                Objects.equals(dsjjKhcs, that.dsjjKhcs) &&
                Objects.equals(dsjjNote, that.dsjjNote);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(dsjjDjnm, dsjjDjbh, dsjjRq, dsjjDwid, dsjjDwbh, dsjjDwmc, dsjjBmid, dsjjBmbh, dsjjBmmc, dsjjBzzt, dsjjUserid, dsjjUsercode, dsjjUsername, dsjjYwlx, dsjjYwlxmc, dsjjBzsy, dsjjZy, dsjjFjid, dsjjFjzs, dsjjBwbbh, dsjjBwbmc, dsjjBzbh, dsjjBzmc, dsjjJlksrq, dsjjJljzrq, dsjjDfjbr, dsjjDqjlje, dsjjDqjljebb, dsjjLjjlje, dsjjLjjljebb, dsjjSfyqr, dsjjFplx, dsjjJsff, dsjjBhsje, dsjjBhsjebb, dsjjSe, dsjjSebb, dsjjJshj, dsjjJshjbb, dsjjXmnm, dsjjXmbh, dsjjXmmc, dsjjHtnm, dsjjHtbh, dsjjHtmc, dsjjWldwbh, dsjjWldwmc, dsjjPzflag, dsjjPznm, dsjjPzbh, dsjjWfid, dsjjYxzt, dsjjCsr, dsjjCsrq, dsjjJhr, dsjjJhrq, dsjjFhr, dsjjFhrq, dsjjZzr, dsjjZzrq, creator, createdtime, lastmodifier, lastmodifiedtime, djlyxt, djlygn, qtxtdjnm, bzdlx, dsjjGnm1, dsjjGnm2, dsjjGnm3, dsjjGnm4, dsjjGnm5, dsjjGnm6, dsjjGnm7, dsjjGnm8, dsjjGnm9, dsjjGnm10, dsjjGxm1, dsjjGxm2, dsjjGxm3, dsjjGxm4, dsjjGxm5, dsjjGxm6, dsjjGxm7, dsjjGxm8, dsjjGxm9, dsjjGxm10, dsjjSz1, dsjjSz2, dsjjSz3, dsjjSz4, dsjjSz5, dsjjSz6, dsjjSz7, dsjjSz8, dsjjSz9, dsjjSz10, dsjjRq1, dsjjRq2, dsjjRq3, dsjjRq4, dsjjRq5, dsjjRq6, dsjjRq7, dsjjRq8, dsjjRq9, dsjjRq10, dsjjGbz1, dsjjGbz2, dsjjGbz3, dsjjGbz4, dsjjGbz5, dsjjGbz6, dsjjGbz7, dsjjGbz8, dsjjGbz9, dsjjGbz10, dsjjDjzt, dsjjHl, dsjjJsfs, dsjjFkzhbh, dsjjFkzhmc, dsjjSkzhbh, dsjjSkzhmc, dsjjKhyh, dsjjKhs, dsjjKhcs, dsjjNote);
        result = 31 * result + Arrays.hashCode(dsjjFjsc);
        return result;
    }
}
