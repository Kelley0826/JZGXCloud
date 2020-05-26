package com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dxjj;

import com.inspur.gs.fssp.pubjz.common.entity.JZFSSaveDataVO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjj.DXJJZDApi;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.service.dxjj.DXJJZDService;
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
public class DXJJZDImpl implements DXJJZDApi {

    @Autowired
    private DXJJZDService dxjjzdservice;


    /**
      * 保存
      */
    @Override
    public ResultRet saveBill(JZFSSaveDataVO saveData) {
        ResultRet resultRet = dxjjzdservice.saveBill(saveData);
        return resultRet;
    }

    /**
     * 编辑前检查
     */
    @Override
    public ResultRet checkEdit(Map<String, Object> object) {
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        return  dxjjzdservice.checkEdit(object);
    }

    /**
     * 保存后
     */
    @Override
    public ResultRet savebillAfter(Map<String, Object> object) {
        return dxjjzdservice.savebillAfter(object);
    }


    /**
      * 提交前
      */
    @Override
    public ResultRet submitBefore(Map<String, Object> data) {
        return dxjjzdservice.submitBefore(data);
    }

    /**
      * 提交
      */
    @Override
    public ResultRet submit(Map<String, Object> data) {
        return dxjjzdservice.submit(data);
    }

    /**
      * 提交后
      */
    @Override
    public ResultRet submitAfter(Map<String, Object> data) {
        return dxjjzdservice.submitAfter(data);
    }

    /**
      * 撤回前
      */
    @Override
    public ResultRet retractBefore(Map<String, Object> data) {
        return dxjjzdservice.retractBefore(data);
    }

    /**
      * 撤回
      */
    @Override
    public ResultRet retract(Map<String, Object> data) {
        return dxjjzdservice.retract(data);
    }

    /**
      * 撤回后
      */
    @Override
    public ResultRet retractAfter(Map<String, Object> data) {
        return dxjjzdservice.retractAfter(data);
    }

    /**
      * 删除前
      */
    @Override
    public ResultRet deleteBefore(Map<String, Object> data) {
        return dxjjzdservice.deleteBillBefore(data);
    }

    /**
      * 删除
      */
    @Override
    public ResultRet deleteBill(Map<String, Object> data) {
        return dxjjzdservice.deleteBill(data);
    }

    /**
      * 删除后
      */
    @Override
    public ResultRet deleteBillAfter(Map<String, Object> data) {
        return dxjjzdservice.deleteBillAfter(data);
    }

    /**
     * 查看影像
     */
    @Override
    public ResultRet viewImage(String billNM) {
        return null;
    }







}
