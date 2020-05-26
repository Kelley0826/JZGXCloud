package com.inspur.gs.fssp.jzgx.publogic.common.core.bill;

import com.inspur.gs.fssp.pubjz.foundation.repository.JZFSBfMasterOrganizationRepository;
import com.inspur.gs.fssp.pubjz.common.entity.JZFSSPLangEnum;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFAdminOrganizationDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.JZBFCurrencyDO;
import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;
import com.inspur.gs.fssp.pubjz.foundation.repository.*;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLangService;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author inspur
 * @since 2020/04/28
 * 所有单据制单公共的代码
 */
@Service
public class JZFSZD {
    @Autowired
    private JZBFEmployeeRepository JZBFEmployeeRepository; //行政人员
    @Autowired
    private JZBFAdminOrganizationRepository JZBFAdminOrganizationRepository; //组织
    @Autowired
    private JZBFCurrencyRepository JZBFCurrencyRepository; //币种
//    @Autowired
//    private FSROMRSZRepository fsromrszRepository; //默认报账组织
    @Autowired
    private JZFSSPLangService JZFSSPLangService;  // 获取多语言
    @Autowired
    private JZFSBfMasterOrganizationRepository bfmasterorganizationRepository; // 主组织


    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(JZFSZD.class);

    /**
     * Description: 根据行政人员ID获得行政人员单位和部门实体
     * @Param: [employeeID]:行政人员ID
     * @Return: com.inspur.gs.fssp.common.foundation.entity.ResultRet
     * @Author: inspur
     * @Date: 2020/0430
     */
    public ResultRet getDWAndBMByEmployeeID(String employeeID){
        ResultRet resultRet = new ResultRet();
        Map<String,Object> dwAndbmEntityMap = new HashMap();
        JZBFAdminOrganizationDO JZBFAdminOrganizationDO,bfAdminOrganizationDWDO;
        Object[] organizationID;
        try {
            organizationID = JZBFEmployeeRepository.getOrganizationIDByEmployeeID(employeeID);
        }catch(Exception e){
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0084"));   //("获得行政人员的组织失败，请联系管理员处理");
            resultRet.setResult(false);
            return resultRet;
        }
        try {
            JZBFAdminOrganizationDO = JZBFAdminOrganizationRepository.getBFAdminOrganizationDWOrBM(organizationID[0].toString());
        }catch(Exception e){
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0085"));  //("根据行政组织ID获得行政组织信息失败，请联系管理员处理");
            resultRet.setResult(false);
            return resultRet;
        }
        //如果是单位,直接返回单位信息  如果是部门就查询单位
        if (JZBFAdminOrganizationDO.getOrgType().equals("9edf25d1-b991-4dde-90b9-30145422d24d")) {
            dwAndbmEntityMap.put("DWEntity", JZBFAdminOrganizationDO);
        } else if (JZBFAdminOrganizationDO.getOrgType().equals("33c21504-3384-42a7-8fc3-c1b5e9e982d0")) {
            bfAdminOrganizationDWDO = JZBFAdminOrganizationRepository.getBFAdminOrganizationDW(JZBFAdminOrganizationDO.getOwnerid());
            dwAndbmEntityMap.put("DWEntity", bfAdminOrganizationDWDO);
            dwAndbmEntityMap.put("BMEntity", JZBFAdminOrganizationDO);
        }else{
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0086"));  //("获得的组织数据不正确，请联系管理员处理");
            resultRet.setResult(false);
            return resultRet;
        }
        resultRet.setValue(dwAndbmEntityMap);
        resultRet.setResult(true);
        return resultRet;
    }

    /**
     * Description: 【3,4】通过行政人员ID获得行政人员部门和单位，获得报账组织和部门
     * @Param: [billInfo, billYGNM]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.ResultRet
     * @Author: inspur
     * @Date: 2020/04/30
     */
    public ResultRet getXZAndBZByEmployeeId(String billYGNM){
        ResultRet resultRet = new ResultRet();
        Map<String,Object> billInfo = new HashMap();
        //3 行政组织信息
        //4.报账组织信息，报账单位部门
        JZBFAdminOrganizationDO doAdminOrganizationDW = null,doAdminOrganizationBM = null;
        resultRet = getDWAndBMByEmployeeID(billYGNM);
        if(!resultRet.isResult()){
            return resultRet;
        }
        String dwAndbmEntityObj = JZFSSPJSONSerializer.serialize(resultRet.getValue());
        Map<String, Object> dwAndbmEntity = JZFSSPJSONSerializer.deserialize(dwAndbmEntityObj, Map.class);
        String strDWEntity = JZFSSPJSONSerializer.serialize(dwAndbmEntity.get("DWEntity"));
        doAdminOrganizationDW = JZFSSPJSONSerializer.deserialize(strDWEntity, JZBFAdminOrganizationDO.class);
        String strBMEntity = JZFSSPJSONSerializer.serialize(dwAndbmEntity.get("BMEntity"));
        doAdminOrganizationBM = JZFSSPJSONSerializer.deserialize(strBMEntity, JZBFAdminOrganizationDO.class);
        if(doAdminOrganizationDW != null){
            //3.1 行政人员的单位
            billInfo.put("organization_id",  String.valueOf(doAdminOrganizationDW.getId()));
            billInfo.put("organization_code",  String.valueOf(doAdminOrganizationDW.getCode()));
            billInfo.put("organization_name", String.valueOf(doAdminOrganizationDW.getName_chs()));
            //4.1 报账单位默认值
            billInfo.put("bzzz_dwnm",  String.valueOf(doAdminOrganizationDW.getId()));
            billInfo.put("bzzz_dwcode",  String.valueOf(doAdminOrganizationDW.getCode()));
            billInfo.put("bzzz_dwname",  String.valueOf(doAdminOrganizationDW.getName_chs()));
        }
        if(doAdminOrganizationBM != null){
            //3.1 部门
            billInfo.put("organization_DepartmentID",  String.valueOf(doAdminOrganizationBM.getId()));
            billInfo.put("organization_DepartmentCode",  String.valueOf(doAdminOrganizationBM.getCode()));
            billInfo.put("organization_DepartmentName",  String.valueOf(doAdminOrganizationBM.getName_chs()));
            billInfo.put("organization_DepartmentHead",  String.valueOf(doAdminOrganizationBM.getDepartmenthead()));
            billInfo.put("organization_DepartmentHeadName",  String.valueOf(doAdminOrganizationBM.getDepartmentheadName()));
            //4.1 报账部门默认值
            billInfo.put("bzzz_bmnm",  String.valueOf(doAdminOrganizationBM.getId()));
            billInfo.put("bzzz_bmcode",  String.valueOf(doAdminOrganizationBM.getCode()));
            billInfo.put("bzzz_bmname",  String.valueOf(doAdminOrganizationBM.getName_chs()));
        }
/*
        //4.2 查找设置的默认报账组织
        ArrayList<String[]> MRZZ= new ArrayList<String[]>();
        try{
            MRZZ = fsromrszRepository.findMRZZByYGNM(billYGNM);
        } catch (RuntimeException ex) {
            resultRet.setMessage(fsspLangService.getLanguageString(FSSPLangEnum.FSROBack,"FSROBack0087"));  //("查询默认报账组织出错，请联系管理员处理");
            resultRet.setResult(false);
            logger.error("查询默认报账组织出错" + ex);
        }
        if(!CollectionUtils.isEmpty(MRZZ)){
            billInfo.put("bzzz_dwnm", String.valueOf(MRZZ.get(0)[1]));
            billInfo.put("bzzz_dwcode", String.valueOf(MRZZ.get(0)[2]));
            billInfo.put("bzzz_dwname", String.valueOf(MRZZ.get(0)[3]));
            billInfo.put("bzzz_bmnm", String.valueOf(MRZZ.get(0)[4]));
            billInfo.put("bzzz_bmcode", String.valueOf(MRZZ.get(0)[5]));
            billInfo.put("bzzz_bmname", String.valueOf(MRZZ.get(0)[6]));
        }
*/
        resultRet.setResult(true);
        resultRet.setValue(billInfo);
        return resultRet;
    }

    /**
     * Description: 【6】通过单位ID获得本位币
     * @Param: [billInfo, billDWID]
     * @Return: com.inspur.gs.fssp.common.foundation.entity.ResultRet
     * @Author: inspur
     * @Date: 2020/04/30
     */
    public ResultRet getBWB(String billDWID){
        ResultRet resultRet = new ResultRet();
        Map<String,Object> billInfo = new HashMap();
        JZBFCurrencyDO JZBFCurrencyDO;
        String bfmasteorgid = JZBFAdminOrganizationRepository.getmasterorgid(billDWID);
        String bfcurrencyid = bfmasterorganizationRepository.getcurrencyid(bfmasteorgid);
        try {
            if(StringUtils.isBlank(bfcurrencyid)){
                billInfo.put("bfcurrency_id", "");
                billInfo.put("bfcurrency_code", "");
                billInfo.put("bfcurrency_name", "");
                //精度
                billInfo.put("bfcurrency_symbol", "");
                //符号
                billInfo.put("bfcurrency_accuracy", "");
            }else{
                JZBFCurrencyDO = JZBFCurrencyRepository.getCurrencyAllInfoById(bfcurrencyid);
                //给编号名称精度符号赋值
                billInfo.put("bfcurrency_id", JZBFCurrencyDO.getId());
                billInfo.put("bfcurrency_code", JZBFCurrencyDO.getCode());
                billInfo.put("bfcurrency_name", JZBFCurrencyDO.getname_chs());
                //精度
                billInfo.put("bfcurrency_symbol", JZBFCurrencyDO.getSymbol());
                //符号
                billInfo.put("bfcurrency_accuracy", String.valueOf(JZBFCurrencyDO.getaccuracy()));
            }
        }catch(Exception e){
            resultRet.setResult(false);
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0161"));  //("获取币种失败，请联系管理员处理");
            return resultRet;
        }
        resultRet.setResult(true);
        resultRet.setValue(billInfo);
        return resultRet;
    }


    /**
     * 校验入参
     * @param param 入参
     * @return
     */
    private ResultRet checkParamater(String param){
        ResultRet resultRet = new ResultRet();
        resultRet.setResult(true);
        if(StringUtils.isEmpty(param)){
            resultRet.setResult(false);
            //resultRet.setMessage("内码不允许为空");
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0045"));
            return resultRet;
        }
        String[] listNm = param.split(";");
        if(listNm.length>1){
            resultRet.setResult(false);
            //resultRet.setMessage("不支持批量");
            resultRet.setMessage(JZFSSPLangService.getLanguageString(JZFSSPLangEnum.FSROBack,"FSROBack0045"));
            return resultRet;
        }
        resultRet.setValue(listNm);
        return resultRet;
    }
}
