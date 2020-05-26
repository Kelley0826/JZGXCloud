package com.inspur.gs.fssp.pubjz.foundation.vo;

import java.io.Serializable;

/**
 * @author liuxiaosong on 2019/9/27
 */
public class JZImageMangerResultItem implements Serializable {
    private String serviceid;
    private String result;
    private String success;
    private String errormsg;
    private String datas;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "ImageMangerResultItem{" +
                "serviceid='" + serviceid + '\'' +
                ", result='" + result + '\'' +
                ", success='" + success + '\'' +
                ", errormsg='" + errormsg + '\'' +
                ", datas='" + datas + '\'' +
                '}';
    }
}
