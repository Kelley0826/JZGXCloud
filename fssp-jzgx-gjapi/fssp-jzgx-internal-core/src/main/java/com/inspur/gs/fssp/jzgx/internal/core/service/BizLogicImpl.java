package com.inspur.gs.fssp.jzgx.internal.core.service;

import com.inspur.gs.fssp.jzgx.data.entity.pub.PubInformationEntity;
import com.inspur.gs.fssp.jzgx.data.repository.pub.FsbzdjRepository;
import com.inspur.gs.fssp.jzgx.internal.api.BizLogicApi;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPSession;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inspur.gs.fssp.pubjz.foundation.entity.*;
import com.inspur.gs.fssp.pubjz.foundation.repository.*;
import com.inspur.gs.fssp.jzgx.publogic.common.core.bill.JZFSZD;


import java.util.*;

/**
 * @Description:
 * @author: db
 * @date: 2020/5/13 14:50
 */
@Service
public class BizLogicImpl implements BizLogicApi {

    @Autowired
    private JZGSPUserRepository JZGSPUserRepository;
    @Autowired
    private JZBFEmployeeRepository JZBFEmployeeRepository;
    @Autowired
    private JZBFExchangeRateRepository JZBFExchangeRateRepository;
    @Autowired
    private JZBFExchangeRateValueRepository JZBFExchangeRateValueRepository;
    @Autowired
    private JZFSZD JZFSZD; //公共代码
    @Autowired
    private FsbzdjRepository fsbzdjRepository; //公共代码

    /**
      * 新增用户信息后获取单据信息
      */
    @Override
    public ResultRet getBillInfoOnAdd(Map<String,Object> inputInfo){
        ResultRet resultRet = new ResultRet();
        PubInformationEntity billInfo = new PubInformationEntity();
        //0 常量
        String billUserId = JZFSSPSession.current.getUserId();
        //1.用户信息
        JZGSPUserDO doGspUser = JZGSPUserRepository.getUserAllInfo(billUserId);
        billInfo.gspuser_id = billUserId;
        billInfo.gspuser_code = doGspUser.getCode();
        billInfo.gspuser_name =doGspUser.getName_chs();
        //2 行政人员信息
        List<JZBFEmployeeDO> listEmployees = JZBFEmployeeRepository.getEmployeeByUserid(billUserId);
        if(listEmployees==null||listEmployees.size()<=0){
            resultRet.setResult(false);
            resultRet.setMessage("当前用户没有配置行政人员信息导致无法制单,请联系管理员创建行政人员");
            return resultRet;
        }
        JZBFEmployeeDO doBFEmployee = listEmployees.get(0);
        employeeAssignment(billInfo, doBFEmployee);

        //3.行政人员单位部门
        //4.报账单位，报账部门
        //5.核算单位，核算部门，核算人员
        //6.本位币
        resultRet = JZFSZD.getXZAndBZByEmployeeId(String.valueOf(doBFEmployee.getId()));
        if(!resultRet.isResult()){
            return resultRet;
        }
        String strBillInfo = JZFSSPJSONSerializer.serialize(resultRet.getValue());
        Map<String, Object> mapBillInfo = JZFSSPJSONSerializer.deserialize(strBillInfo, Map.class);

        //3.1 行政人员的单位
        billInfo.organization_id = String.valueOf(mapBillInfo.get("organization_id"));
        billInfo.organization_code = String.valueOf(mapBillInfo.get("organization_code"));
        billInfo.organization_name = String.valueOf(mapBillInfo.get("organization_name"));
        //3.1 行政人员的部门
        billInfo.organization_DepartmentID = String.valueOf(mapBillInfo.get("organization_DepartmentID"));
        billInfo.organization_DepartmentCode = String.valueOf(mapBillInfo.get("organization_DepartmentCode"));
        billInfo.organization_DepartmentName = String.valueOf(mapBillInfo.get("organization_DepartmentName"));
        billInfo.organization_DepartmentHead = String.valueOf(mapBillInfo.get("organization_DepartmentHead"));
        billInfo.organization_DepartmentHeadName = String.valueOf(mapBillInfo.get("organization_DepartmentHeadName"));
        //4.1 报账单位
        billInfo.bzzz_dwnm = String.valueOf(mapBillInfo.get("bzzz_dwnm"));
        billInfo.bzzz_dwcode = String.valueOf(mapBillInfo.get("bzzz_dwcode"));
        billInfo.bzzz_dwname = String.valueOf(mapBillInfo.get("bzzz_dwname"));
        //4.1 报账部门默认值
        billInfo.bzzz_bmnm = (String)mapBillInfo.get("bzzz_bmnm");
        billInfo.bzzz_bmcode= (String)mapBillInfo.get("bzzz_bmcode");
        billInfo.bzzz_bmname = (String)mapBillInfo.get("bzzz_bmname");

        //6 本位币
        resultRet = JZFSZD.getBWB(String.valueOf(billInfo.organization_id));
        if(!resultRet.isResult()){
            return resultRet;
        }
        String strBWBInfo = JZFSSPJSONSerializer.serialize(resultRet.getValue());
        Map<String, Object> mapBWBInfo = JZFSSPJSONSerializer.deserialize(strBWBInfo, Map.class);

        billInfo.bfcurrency_id = String.valueOf(mapBWBInfo.get("bfcurrency_id"));
        billInfo.bfcurrency_code = String.valueOf(mapBWBInfo.get("bfcurrency_code"));
        billInfo.bfcurrency_name = String.valueOf(mapBWBInfo.get("bfcurrency_name"));
        billInfo.bfcurrency_symbol = String.valueOf(mapBWBInfo.get("bfcurrency_symbol"));
        billInfo.bfcurrency_accuracy = String.valueOf(mapBWBInfo.get("bfcurrency_accuracy"));

        // 汇率
        billInfo.rate = 1.00;

        resultRet.setResult(true);
        resultRet.setMessage("新增获取人员信息成功。");
        resultRet.setValue(billInfo);
        return resultRet;
    }

    /**
      * 切换报账人后获取行政人员信息
      */
    @Override
    public ResultRet getUserInfoOnAdd(Map<String,Object> inputInfo) {
        PubInformationEntity  userInfo = new PubInformationEntity();
        ResultRet resInfo = new ResultRet();
        //0 常量
        String FORMTYPE = String.valueOf(inputInfo.get("FORMTYPE"));//单据类型内码
        String billYGNM = String.valueOf(inputInfo.get("billYGNM"));//行政人员内码
        //2 行政人员信息
        JZBFEmployeeDO doBFEmployee = JZBFEmployeeRepository.getEmployeeInfoById(billYGNM);
        if(doBFEmployee == null){
            resInfo.setResult(false);
            resInfo.setMessage("当前用户没有配置行政人员信息导致无法制单,请联系管理员创建行政人员");
            return resInfo;
        }
        employeeAssignment(userInfo, doBFEmployee);
        //3 行政组织信息
        resInfo = JZFSZD.getXZAndBZByEmployeeId(String.valueOf(doBFEmployee.getId()));
        if(!resInfo.isResult()){
            return resInfo;
        }
        String strDWAndBMBillInfo = JZFSSPJSONSerializer.serialize(resInfo.getValue());
        Map<String, Object> mapDWAndBMBillInfo = JZFSSPJSONSerializer.deserialize(strDWAndBMBillInfo, Map.class);

        depAndorgAssignment(userInfo,mapDWAndBMBillInfo);

        //5 本位币
        resInfo = JZFSZD.getBWB(String.valueOf(userInfo.organization_id));
        if(!resInfo.isResult()){
            return resInfo;
        }
        String strBWBInfo = JZFSSPJSONSerializer.serialize(resInfo.getValue());
        Map<String, Object> mapBWBInfo = JZFSSPJSONSerializer.deserialize(strBWBInfo, Map.class);

        userInfo.bfcurrency_id = String.valueOf(mapBWBInfo.get("bfcurrency_id"));
        userInfo.bfcurrency_code = String.valueOf(mapBWBInfo.get("bfcurrency_code"));
        userInfo.bfcurrency_name = String.valueOf(mapBWBInfo.get("bfcurrency_name"));
        userInfo.bfcurrency_symbol = String.valueOf(mapBWBInfo.get("bfcurrency_symbol"));
        userInfo.bfcurrency_accuracy = String.valueOf(mapBWBInfo.get("bfcurrency_accuracy"));
        userInfo.rate = 1.00;
        resInfo.setResult(true);
        resInfo.setMessage("获取人员信息成功");
        resInfo.setValue(userInfo);
        return  resInfo;
    }


    /**
      * 获取汇率
      */
    @Override
    public ResultRet getbfexchangeRateValue(Map<String,Object> inputInfo){
        ResultRet resultRet = new ResultRet();
        JZBFExchangeRateDO JZBFExchangeRateDO =new JZBFExchangeRateDO();
        JZBFExchangeRateValueDo JZBFExchangeRateValueDo =new JZBFExchangeRateValueDo();
        JZBFExchangeRateValueVo bill=new JZBFExchangeRateValueVo();
        //原币
        bill.originalcurrency=String.valueOf(inputInfo.get("oriid"));
        bill.originalcurrency_code=String.valueOf(inputInfo.get("oribh"));
        bill.originalcurrency_name=String.valueOf(inputInfo.get("orimc"));
        //转化币
        bill.convertcurrency=String.valueOf(inputInfo.get("conid"));
        bill.convertcurrency_code=String.valueOf(inputInfo.get("conbh"));
        bill.convertcurrency_name=String.valueOf(inputInfo.get("conmc"));
        if(bill.originalcurrency.equals(bill.convertcurrency)){
            bill.setExchangertevalue(1.00);
            resultRet.setResult(true);
            resultRet.setMessage("获取汇率成功。");
            resultRet.setValue(bill);
            return resultRet;
        }
        JZBFExchangeRateDO = JZBFExchangeRateRepository.getExchangeRateIdByorco(bill.originalcurrency, bill.convertcurrency);
        if(JZBFExchangeRateDO ==null) {
            resultRet.setResult(false);
            resultRet.setMessage("无对应汇率，联系相关人员设置汇率");
            resultRet.setValue(bill);
            return resultRet;
        }
        bill.parentid= JZBFExchangeRateDO.getId();
        bill.state_isenabled= JZBFExchangeRateDO.getState_IsEnabled();
        bill.ratetype= JZBFExchangeRateDO.getExchangeRateType();
        JZBFExchangeRateValueDo = JZBFExchangeRateValueRepository.getExchangeRateValueAllInfoById(bill.parentid);
        bill.id= JZBFExchangeRateValueDo.getId();
        bill.exchangertevalue= JZBFExchangeRateValueDo.getExchangeratevalue();
        bill.starttime= JZBFExchangeRateValueDo.getStarttime();
        bill.endtime= JZBFExchangeRateValueDo.getEndtime();
        resultRet.setResult(true);
        resultRet.setMessage("获取汇率成功。");
        resultRet.setValue(bill);
        return resultRet;
    }

    /**
     * 获取列表单据状态
     */
    @Override
    public ResultRet getListStatus(Map<String,Object> inputInfo){
        ResultRet result = new ResultRet();
        result.setResult(true);
        System.out.println("开始获取状态");
        String ztsm = fsbzdjRepository.getDjztsmByDjnm(String.valueOf(inputInfo.get("DJNM")));
        System.out.println("状态说明:"+ztsm);
        if(ztsm==null)
            ztsm = "制单";
        result.setValue(ztsm);
        return result;
    }


    /**
     * 行政人员单位、部门信息
     * @param billInfo
     * @param mapBillInfo
     */
    private void depAndorgAssignment(PubInformationEntity billInfo,Map<String,Object> mapBillInfo){
        //3.1 行政人员的单位
        billInfo.organization_id = String.valueOf(mapBillInfo.get("organization_id"));
        billInfo.organization_code = String.valueOf(mapBillInfo.get("organization_code"));
        billInfo.organization_name = String.valueOf(mapBillInfo.get("organization_name"));
        //3.1 行政人员的部门
        billInfo.organization_DepartmentID = String.valueOf(mapBillInfo.get("organization_DepartmentID"));
        billInfo.organization_DepartmentCode = String.valueOf(mapBillInfo.get("organization_DepartmentCode"));
        billInfo.organization_DepartmentName = String.valueOf(mapBillInfo.get("organization_DepartmentName"));
        billInfo.organization_DepartmentHead = String.valueOf(mapBillInfo.get("organization_DepartmentHead"));
        billInfo.organization_DepartmentHeadName = String.valueOf(mapBillInfo.get("organization_DepartmentHeadName"));
        //4.1 报账单位
        billInfo.bzzz_dwnm = String.valueOf(mapBillInfo.get("bzzz_dwnm"));
        billInfo.bzzz_dwcode = String.valueOf(mapBillInfo.get("bzzz_dwcode"));
        billInfo.bzzz_dwname = String.valueOf(mapBillInfo.get("bzzz_dwname"));
        //4.1 报账部门默认值
        billInfo.bzzz_bmnm = (String)mapBillInfo.get("bzzz_bmnm");
        billInfo.bzzz_bmcode= (String)mapBillInfo.get("bzzz_bmcode");
        billInfo.bzzz_bmname = (String)mapBillInfo.get("bzzz_bmname");
    }

    /**
     * 员工信息
     */
    private void employeeAssignment(PubInformationEntity billInfo, JZBFEmployeeDO JZBFEmployeeDO){
        billInfo.bfemployee_id = JZBFEmployeeDO.getId();
        billInfo.bfemployee_code = JZBFEmployeeDO.getCode();
        billInfo.bfemployee_name = JZBFEmployeeDO.getName();
        billInfo.bfemployee_phone = JZBFEmployeeDO.getContactinfo();
        billInfo.bfemployee_email = JZBFEmployeeDO.getEmail();
        billInfo.bfemployee_mj = JZBFEmployeeDO.getConfidentiallevel();
        billInfo.bfemployee_IDNumber = JZBFEmployeeDO.getIdNumber();
        billInfo.bfemployee_IDType = JZBFEmployeeDO.getIdentityType();
        billInfo.bfemployee_country = JZBFEmployeeDO.getCountryOrAera();
        billInfo.bfemployee_location = JZBFEmployeeDO.getLocation();
        billInfo.bfemployee_displayName  = JZBFEmployeeDO.getDisplayName();
        billInfo.bfemployee_gender = JZBFEmployeeDO.getGender();
        billInfo.bfemployee_state = String.valueOf(JZBFEmployeeDO.getState_isenabled());
    }












}
