package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

/**
 * 返回信息
 */
@Data
public class ResultRet {

    /*
     * 返回结果 成功：true  失败:false
     * */
    private boolean result;
    /**
     * 操作是否成功 0：失败  1：成功
     */
    private int Code;
    /**
     * 操作失败时返回失败原因
     */
    private String Message;
    /**
     * 用于返回其他有用信息
     */
    private Object value;


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
