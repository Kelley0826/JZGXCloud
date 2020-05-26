package com.inspur.gs.fssp.pubjz.foundation.rotravel.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jiangshaoshuai
 * @since 2020/2/27 11:54
 * 差旅明细
 */
public class JZTravelBillDetailEntity {
    /// <summary>
    /// 唯一标识
    /// </summary>
    public String Id ;

    /// <summary>
    /// 差旅申请ID
    /// </summary>
    public String TravelBillId ;

    /// <summary>
    /// 差旅行程明细ID
    /// </summary>
    public String LtineraryListId ;
    /// <summary>
    /// 序号
    /// </summary>
    public int OrderNumber ;
    /// <summary>
    /// 消费类型
    /// </summary>
    public String ExpenseType ;

    /// <summary>
    /// 消费平台
    /// </summary>
    public String PlatformId ;
    /// <summary>
    /// 消费平台名称
    /// </summary>
    public String PlatformName ;
    /// <summary>
    /// 预计金额
    /// </summary>
    public BigDecimal Amount ;
    /// <summary>
    /// 航程类型
    /// </summary>
    public String VoyageTrip ;
    /// <summary>
    /// 航班类型
    /// </summary>
    public String FlightType ;
    /// <summary>
    /// 出发时间、入住时间、用车时间
    /// </summary>
    public Date StartTime ;
    /// <summary>
    /// 返程时间\退房时间
    /// </summary>
    public Date EndTime ;
    /// <summary>
    /// 出发城市
    /// </summary>
    public String Departure ;
    /// <summary>
    /// 到达城市、消费城市
    /// </summary>
    public String Destination ;

    /// <summary>
    /// 舱位等级、坐席等级
    /// </summary>
    public String Shippingspace ;

    /// <summary>
    /// 舱位等级、坐席等级名称
    /// </summary>
    public String ShippingSpaceName ;
    /// <summary>
    /// 送机服务
    /// </summary>
    public String DropOff ;
    /// <summary>
    /// 送机时间
    /// </summary>
    public Date DropOffTime ;
    /// <summary>
    /// 送机地点
    /// </summary>
    public String DropOffPlace ;
    /// <summary>
    /// 送机备注
    /// </summary>
    public String DropOffRemark ;
    /// <summary>
    /// 间*夜数
    /// </summary>
    public int OneNight ;
    /// <summary>
    /// 备注
    /// </summary>
    public String Remark ;

    /// <summary>
    /// 创建者
    /// </summary>
    public String CreatePerson ;
    /// <summary>
    /// 创建者姓名
    /// </summary>
    public String CreatePersonName ;

    /// <summary>
    /// 创建时间
    /// </summary>
    public Date CreateDatetime ;

    /// <summary>
    /// 最后修改者
    /// </summary>
    public String LastmodifyPerson ;
    /// <summary>
    /// 最后修改者姓名
    /// </summary>
    public String LastmodifyPersonName ;

    /// <summary>
    /// 最后修改时间
    /// </summary>
    public Date LastmodifyDatetime ;
    /// <summary>
    /// 是否删除
    /// </summary>
    public String IsDelete ;
    /// <summary>
    /// 超标
    /// </summary>
    public String OverProof ;
    /// <summary>
    /// 中转城市
    /// </summary>
    public String TransferCity ;

}
