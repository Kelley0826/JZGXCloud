package com.inspur.gs.fssp.pubjz.foundation.rotravel.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jiangshaoshuai
 * @since 2020/2/27 11:05
 * 主表
 */
public class JZTravelBillMainEntity {
    /// <summary>
    /// 唯一标识
    /// </summary>
    public String Id ;
    /// <summary>
    /// 租户
    /// </summary>
    public String TenancyId ;

    /// <summary>
    /// 申请单位
    /// </summary>
    public String CompanyId ;
    /// <summary>
    /// 申请单位名称
    /// </summary>
    public String CompanyName ;

    /// <summary>
    /// 申请部门
    /// </summary>
    public String DepartmentId ;
    /// <summary>
    /// 申请部门名称
    /// </summary>
    public String DepartmentName ;
    /// <summary>
    /// 申请人
    /// </summary>
    public String ApplicantId ;
    /// <summary>
    /// 申请人姓名
    /// </summary>
    public String ApplicantName ;
    /// <summary>
    /// 申请单号
    /// </summary>
    public String BillCode ;
    /// <summary>
    /// 申请日期
    /// </summary>
    public Date AppDate ;
    /// <summary>
    /// 出差事由
    /// </summary>
    public String RequestName ;
    /// <summary>
    /// 同行人员
    /// </summary>
    public String AccompaniedPerson ;
    /// <summary>
    /// 开始时间
    /// </summary>
    public Date StartDatetime ;
    /// <summary>
    /// 结束时间
    /// </summary>
    public Date EndDatetime ;
    /// <summary>
    /// 出差天数
    /// </summary>
    public int TravelDays ;
    /// <summary>
    /// 备注
    /// </summary>
    public String Comment ;
    /// <summary>
    /// 预计金额合计
    /// </summary>
    public BigDecimal AmountSum ;
    /// <summary>
    /// 状态
    /// </summary>
    public int States ;
    /// <summary>
    /// 费用承担部门ID
    /// </summary>
    public String CostBearingDepartmentId ;
    /// <summary>
    /// 费用承担部门名称
    /// </summary>
    public String CostBearingDepartmentName ;
    /// <summary>
    /// 费用承担单位ID
    /// </summary>
    public String CostBearingCompanyId ;
    /// <summary>
    /// 费用承担单位名称
    /// </summary>
    public String CostBearingCompanyName ;
    /// <summary>
    /// 分摊项目
    /// </summary>
    public String CostBearingItemId ;
    /// <summary>
    /// 分摊项目名称
    /// </summary>
    public String CostBearingItemName ;
    /// <summary>
    /// 申请人手机号
    /// </summary>
    public String ApplicantMobile ;
    /// <summary>
    /// 审批单过期时间 格式：2017-01-01（携程）
    /// </summary>
    public String ExpiredTime ;
    /// <summary>
    /// 职级
    /// </summary>
    public JZRankInfoEntity rankInfo = new JZRankInfoEntity();
    /// <summary>
    /// 操作类型（东美）I-新增 D-删除 U-修改
    /// </summary>
    public String CzLx ;


}
