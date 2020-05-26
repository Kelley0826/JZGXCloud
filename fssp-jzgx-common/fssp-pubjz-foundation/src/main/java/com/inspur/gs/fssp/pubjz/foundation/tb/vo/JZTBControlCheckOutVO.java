package com.inspur.gs.fssp.pubjz.foundation.tb.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 预算检查 输出
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class JZTBControlCheckOutVO implements Serializable {
    /**
     * 0代码通过，1代表提示，2代表警告，3代表拒绝
     */
    private String result;

    /**
     * 提示警告拒绝时的具体信息
     */
    private String kzxx;

    /**
     * 提示警告拒绝的格式化数据
     */
    private String kzxxjson;

    /**
     * 异常信息
     */
    private String error;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getKzxx() {
        return kzxx;
    }

    public void setKzxx(String kzxx) {
        this.kzxx = kzxx;
    }

    public String getKzxxjson() {
        return kzxxjson;
    }

    public void setKzxxjson(String kzxxjson) {
        this.kzxxjson = kzxxjson;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "TBControlCheckOutVO{" +
                "result='" + result + '\'' +
                ", kzxx='" + kzxx + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
