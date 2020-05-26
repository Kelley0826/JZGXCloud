package com.inspur.gs.fssp.pubjz.foundation.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiaosong on 2019/9/27
 * 查看影像返回结果参数
 */
public class JZImageManagerResultVO implements Serializable {
    private String result;
    private String success;
    private String errormsg;
    private List<JZImageMangerResultItem> items = new ArrayList<>();

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

    public List<JZImageMangerResultItem> getItems() {
        return items;
    }

    public void setItems(List<JZImageMangerResultItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ImageManagerResultVO{" +
                "result='" + result + '\'' +
                ", success='" + success + '\'' +
                ", errormsg='" + errormsg + '\'' +
                ", items=" + items +
                '}';
    }
}
