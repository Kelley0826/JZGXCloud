package com.inspur.gs.fssp.pubjz.foundation.vo;

import java.io.Serializable;

/**
 * @author liuxiaosong on 2019/10/19
 * 影像回写VO
 */
public class JZImageCallBackResultVO implements Serializable {
    //1：成功 0：失败
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ImageCallBackResultVO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
