package com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dxjjcs;

import com.inspur.gs.fssp.pubjz.common.entity.JZFSSaveDataVO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs.DXJJCSZDApi;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dxjjcs.DXJJCSZDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * @Description:
 * @author: db
 * @date: 2020/5/12 17:37
 */
@Service
@Primary
public class DXJJCSZDImpl implements DXJJCSZDApi {

    @Autowired
    private DXJJCSZDService dxjjcszdservice;


    /**
      * 保存
      */
    @Override
    public ResultRet saveBill(JZFSSaveDataVO saveData) {
        ResultRet resultRet = dxjjcszdservice.saveBill(saveData);
        return resultRet;
    }

    /**
     * 编辑前检查
     */
    @Override
    public ResultRet checkEdit(Map<String, Object> object) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return  dxjjcszdservice.checkEdit(object);
    }

    /**
     * 保存后
     */
    @Override
    public ResultRet savebillAfter(Map<String, Object> object) {
        return dxjjcszdservice.savebillAfter(object);
    }


    /**
      * 提交前
      */
    @Override
    public ResultRet submitBefore(Map<String, Object> data) {
        return dxjjcszdservice.submitBefore(data);
    }

    /**
      * 提交
      */
    @Override
    public ResultRet submit(Map<String, Object> data) {
        return dxjjcszdservice.submit(data);
    }

    /**
      * 提交后
      */
    @Override
    public ResultRet submitAfter(Map<String, Object> data) {
        return dxjjcszdservice.submitAfter(data);
    }

    /**
      * 撤回前
      */
    @Override
    public ResultRet retractBefore(Map<String, Object> data) {
        return dxjjcszdservice.retractBefore(data);
    }

    /**
      * 撤回
      */
    @Override
    public ResultRet retract(Map<String, Object> data) {
        return dxjjcszdservice.retract(data);
    }

    /**
      * 撤回后
      */
    @Override
    public ResultRet retractAfter(Map<String, Object> data) {
        return dxjjcszdservice.retractAfter(data);
    }

    /**
      * 删除前
      */
    @Override
    public ResultRet deleteBefore(Map<String, Object> data) {
        return dxjjcszdservice.deleteBillBefore(data);
    }

    /**
      * 删除
      */
    @Override
    public ResultRet deleteBill(Map<String, Object> data) {
        return dxjjcszdservice.deleteBill(data);
    }

    /**
      * 删除后
      */
    @Override
    public ResultRet deleteBillAfter(Map<String, Object> data) {
        return dxjjcszdservice.deleteBillAfter(data);
    }

    /**
     * 查看影像
     */
    @Override
    public ResultRet viewImage(String billNM) {
        return null;
    }







}
