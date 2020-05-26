package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 执行构件触发内容
 * @author johnyang
 * @date 2019年10月15日
 */
@Entity
@Data
@Table(name = "fsspcmp")
public class JZFSSPCMPDO {

    /**
     * 构件内码
     */
    @Id
    private String fsspcmp_nm;

    /*
     * 访问前缀
     */
    private String fsspcmp_head;

    /*
    * 访问IP
     */
    private String fsspcmp_ip;

    /**
     * 访问端口
     */
    private String fsspcmp_port;

    /**
     * 访问路径
     */
    private String fsspcmp_urlpath;

    private String creator;

    private Date createdtime;

    private String lastmodifier;

    private Date lastmodifiedtime;

    private String fsspcmp_name;

    private String fsspcmp_requsettype;

    public String getFsspcmp_requsettype() {
        return fsspcmp_requsettype;
    }

    public void setFsspcmp_requsettype(String fsspcmp_requsettype) {
        this.fsspcmp_requsettype = fsspcmp_requsettype;
    }


    public String getFsspcmp_name() {
        return fsspcmp_name;
    }

    public void setFsspcmp_name(String fsspcmp_name) {
        this.fsspcmp_name = fsspcmp_name;
    }

    public String getFsspcmp_nm() {
        return fsspcmp_nm;
    }

    public void setFsspcmp_nm(String fsspcmp_nm) {
        this.fsspcmp_nm = fsspcmp_nm;
    }

    public String getFsspcmp_head() {
        return fsspcmp_head;
    }

    public void setFsspcmp_head(String fsspcmp_head) {
        this.fsspcmp_head = fsspcmp_head;
    }
    public String getFsspcmp_ip() {
        return fsspcmp_ip;
    }

    public void setFsspcmp_ip(String fsspcmp_ip) {
        this.fsspcmp_ip = fsspcmp_ip;
    }

    public String getFsspcmp_port() {
        return fsspcmp_port;
    }

    public void setFsspcmp_port(String fsspcmp_port) {
        this.fsspcmp_port = fsspcmp_port;
    }

    public String getFsspcmp_urlpath() {
        return fsspcmp_urlpath;
    }

    public void setFsspcmp_urlpath(String fsspcmp_urlpath) {
        this.fsspcmp_urlpath = fsspcmp_urlpath;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier;
    }

    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }
}
