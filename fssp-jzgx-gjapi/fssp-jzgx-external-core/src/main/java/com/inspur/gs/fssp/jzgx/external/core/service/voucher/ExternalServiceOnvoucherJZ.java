package com.inspur.gs.fssp.jzgx.external.core.service.voucher;

import com.inspur.gs.fssp.pubjz.foundation.entity.ResultRet;

import com.inspur.gs.fssp.pubjz.foundation.utils.annotation.JZFSSPOutLogger;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
//import com.inspur.gs.fssp.ro.common.entity.setting.ROBXLXDO;
//import com.inspur.gs.fssp.ro.common.entity.setting.ROJKLXDO;
//import com.inspur.gs.fssp.ro.common.entity.setting.ROSQLXDO;
//import com.inspur.gs.fssp.ro.common.entity.setting.vo.ROBillVO;
//import com.inspur.gs.fssp.ro.dbcommon.function.repository.FSVoucherBackRepository;
//import com.inspur.gs.fssp.ro.dbcommon.setting.repository.ROBXLXJpaRepository;
//import com.inspur.gs.fssp.ro.dbcommon.setting.repository.ROJKLXJpaRepository;
//import com.inspur.gs.fssp.ro.dbcommon.setting.repository.ROSQLXJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExternalServiceOnvoucherJZ {
    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(ExternalServiceOnvoucherJZ.class);

    /*
    @Autowired
    ROBXLXJpaRepository robxlxJpaRepository;
    @Autowired
    ROSQLXJpaRepository rosqlxJpaRepository;
    @Autowired
    ROJKLXJpaRepository rojklxJpaRepository;
    @Autowired
    FSVoucherBackRepository fsVoucherBackRepository;
    @Autowired
    FSROFormTypeSetRepository fsroFormTypeSetRepository;
    @Autowired
    FSRoformywclassRepository fsRoformywclassRepository;

    /**
     * @param accDocID     3凭证id
     * @param accDocCode   编号
     * @param year         年度
     * @param accOrgID     组织
     * @param dataSourceID 业务数据源
     * @param businessType 业务类型
     * @param businessIDs  单据编号
     * @param accDocDate   凭证日期
     * @param accDocPeriod 会计期间 1
     * @return
     */
    @JZFSSPOutLogger(description="凭证回写RO")
    public ResultRet SaveBack(String accDocID, String accDocCode, String year, String accOrgID, String dataSourceID, String businessType, List<String> businessIDs, String accDocDate, String accDocPeriod) {
        ResultRet backInfo = new ResultRet();
/*        String tableCode = GetTableByDataSourceIDAndLxnm(dataSourceID, businessType);
        String fieldPrefix = GetFieldPrefixByDataSourceIDAndLxnm(dataSourceID, businessType);
        logger.info("进入网报回写:tableCode="+tableCode+"  fieldPrefix="+fieldPrefix);
        for (String bussinessId : businessIDs) {
            ROBillVO roBillVO = fsVoucherBackRepository.getCurBillInfo(tableCode, bussinessId, fieldPrefix);
            String pzinfo = String.format(accDocID + ";" + year + ";" + accOrgID + ";" + accDocDate);
            String oldPzcode = roBillVO.getPzbh();
            String addPzCode = String.format(oldPzcode + "," + accDocCode);
            if (StringUtils.isEmpty(oldPzcode) || "null".equals(oldPzcode)) {
                addPzCode = accDocCode;
            }
            String curPzCode = StringUtils.isEmpty(String.valueOf(roBillVO.getPzbh())) ? accDocCode : (String.valueOf(roBillVO.getPzbh()).contains(accDocCode) ? String.valueOf(roBillVO.getPzbh()) : addPzCode);
            String pzFlag = String.valueOf(roBillVO.getPzflag());
            String curpzFlag = "1";
            Boolean yxzt = false;
            if ("1".equals(String.valueOf(roBillVO.getYxzt()))) {
                yxzt = true;
            }
            String djzt = String.valueOf(roBillVO.getDjzt());
            fsVoucherBackRepository.writeBackInfo(tableCode, accDocID, curPzCode, year, bussinessId, accDocPeriod, curpzFlag, pzinfo, yxzt, "6", djzt, accOrgID, businessType, fieldPrefix);
        }

 */
        backInfo.setResult(true);
        return backInfo;
    }

    /**
     * @param accDocID     凭证id
     * @param accDocCode   编号
     * @param year         年度
     * @param accOrgID     组织
     * @param dataSourceID 业务数据源(moudule？
     * @param businessType 类型(具体的类型内码) code？or be
     * @param businessIDs  单据编号
     * @param accDocDate   凭证日期
     * @param accDocPeriod 会计期间
     * @return
     */
    public ResultRet DeleteBack(String accDocID, String accDocCode, String year, String accOrgID, String dataSourceID, String businessType, List<String> businessIDs, String accDocDate, String accDocPeriod) {
        ResultRet backInfo = new ResultRet();
/*        String tableCode = GetTableByDataSourceIDAndLxnm(dataSourceID, businessType);
        String fieldPrefix = GetFieldPrefixByDataSourceIDAndLxnm(dataSourceID, businessType);
        for (String bussinessId : businessIDs) {
            ROBillVO roBillVO = fsVoucherBackRepository.getCurBillInfo(tableCode, bussinessId,fieldPrefix);
            String pzinfo = String.format(accDocID + ";" + year + ";" + accOrgID + ";" + accDocDate);
            String curPzCode = String.valueOf(roBillVO.getPzbh());
            Boolean yxzt = false;
            if ("1".equals(String.valueOf(roBillVO.getYxzt()))) {
                yxzt = true;
            }
            String djzt = "30";
            String curpzFlag = "0";
            fsVoucherBackRepository.writeBackInfo(tableCode, accDocID, curPzCode, year, bussinessId, accDocPeriod, curpzFlag, pzinfo, yxzt, "2", djzt, accOrgID, businessType,fieldPrefix);

        }

 */
        backInfo.setResult(true);
        return backInfo;
    }

    /**
     * 根据sourceID获取类型
     *
     * @param dataSourceID
     * @return
     */
    public String GetLxByDataSourceID(String dataSourceID) {
        String ywdl = dataSourceID.toUpperCase().substring(0, 6);
        if ("FSROBX".equals(ywdl)) {
            return "robxlx";
        }
        if ("FSROSQ".equals(ywdl)) {
            return "rosqlx";
        }
        if ("FSROJK".equals(ywdl)) {
            return "rojklx";
        }
        if ("FSROHK".equals(ywdl)) {
            return "rohklx";
        }
        if ("FSROZC".equals(ywdl)) {
            return "fsrozc";
        }
        return "robxlx";
    }

    /**
     * 获取字段前缀
     *
     * @param dataSourceID
     * @param lxnm
     * @return
     */
    public String GetFieldPrefixByDataSourceIDAndLxnm(String dataSourceID, String lxnm) {
        String lx = GetLxByDataSourceID(dataSourceID);
        if ("robxlx".equals(lx)) {
            return "robxdj";
        }
        if ("rosqlx".equals(lx)) {
            return "rosqdj";
        }
        if ("rojklx".equals(lx)) {
            return "roywsq";
        }
        if("fsrozc".equals(lx))
        {
            return "fsrozczj";
        }
        return "rohkdj";
    }

    /**
     * 获取表名
     *
     * @param dataSourceID
     * @param lxnm
     * @return
     */
    public String GetTableByDataSourceIDAndLxnm(String dataSourceID, String lxnm) {
/*
        Optional<FSROFormTypeSetDO> fsroFormTypeSetDOs =fsroFormTypeSetRepository.findById(lxnm);
        if(fsroFormTypeSetDOs.isPresent())
        {
            String formywClassId=fsroFormTypeSetDOs.get().getFormywclassid();
            Optional<FSRoformywclassDO> fsRoformywclassDOs= fsRoformywclassRepository.findById(formywClassId);
            if(fsRoformywclassDOs.isPresent())
            {
                return fsRoformywclassDOs.get().getTablename().toLowerCase();
            }
        }

 */
        return "robxdj";
    }

}
