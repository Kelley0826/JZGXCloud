package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Description:汇率
 * Author: sun mingzhi
 * Date:  2019/9/30 14:36
 * Company: Inspur
 */
@Entity
@Data
@Table(name="bfexchangeratevalue")
public class JZBFExchangeRateValueDo {
    @Id
    private String id;

    private Date endtime;

    private Double exchangeratevalue;

    private String parentid;

    private Date starttime;

    private String  timestamp_createdby;

    private Date timestamp_createdon;

    private String timestamp_lastchangedby;

    private Date timestamp_lastchangedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Double getExchangeratevalue() {
        return exchangeratevalue;
    }

    public void setExchangeratevalue(Double exchangeratevalue) {
        this.exchangeratevalue = exchangeratevalue;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getTimestamp_createdby() {
        return timestamp_createdby;
    }

    public void setTimestamp_createdby(String timestamp_createdby) {
        this.timestamp_createdby = timestamp_createdby;
    }

    public Date getTimestamp_createdon() {
        return timestamp_createdon;
    }

    public void setTimestamp_createdon(Date timestamp_createdon) {
        this.timestamp_createdon = timestamp_createdon;
    }

    public String getTimestamp_lastchangedby() {
        return timestamp_lastchangedby;
    }

    public void setTimestamp_lastchangedby(String timestamp_lastchangedby) {
        this.timestamp_lastchangedby = timestamp_lastchangedby;
    }

    public Date getTimestamp_lastchangedon() {
        return timestamp_lastchangedon;
    }

    public void setTimestamp_lastchangedon(Date timestamp_lastchangedon) {
        this.timestamp_lastchangedon = timestamp_lastchangedon;
    }

    @Override
    public String toString() {
        return "BFExchangeRateValueDo{" +
                "id='" + id + '\'' +
                ", endtime=" + endtime +
                ", exchangeratevalue=" + exchangeratevalue +
                ", parentid='" + parentid + '\'' +
                ", starttime=" + starttime +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon=" + timestamp_lastchangedon +
                '}';
    }
}
