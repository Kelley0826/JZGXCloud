package com.inspur.gs.fssp.pubjz.foundation.utils;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

/**
 * @author:gaolechuan
 * @date: 2019/10/22
 * @note：null
 */
public class JZResultRetUtil {
    //成功结果
    public static ResultRet newSuccessResultRet(){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(true);
        return resultRet;
    }
    public static ResultRet newSuccessResultRet(Object value){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(true);
        resultRet.setValue(value);
        return resultRet;
    }
    public static ResultRet newSuccessResultRet(Object value, String message){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(true);
        resultRet.setValue(value);
        resultRet.setMessage(message);
        return resultRet;
    }
    public static ResultRet newSuccessResultRet(Object value, String message, Integer code){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(true);
        resultRet.setValue(value);
        resultRet.setMessage(message);
        resultRet.setCode(code);
        return resultRet;
    }
    //失败结果
    public static ResultRet newFailureResultRet(){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(false);
        return resultRet;
    }
    public static ResultRet newFailureResultRet(String message){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(false);
        resultRet.setMessage(message);
        return resultRet;
    }
    public static ResultRet newFailureResultRet(Object value, String message){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(false);
        resultRet.setValue(value);
        resultRet.setMessage(message);
        return resultRet;
    }
    public static ResultRet newFailureResultRet(Object value, String message, Integer code){
        ResultRet resultRet=new ResultRet();
        resultRet.setResult(false);
        resultRet.setValue(value);
        resultRet.setMessage(message);
        resultRet.setCode(code);
        return resultRet;
    }
}
