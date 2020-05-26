package com.inspur.gs.fssp.pubjz.foundation.rotravel.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangshaoshuai
 * @since 2020/3/6 9:02
 */
public class JZTravelBillEntity {
    /// <summary>
    /// 主表
    /// </summary>
    public JZTravelBillMainEntity JZTravelBillMainEntity = new JZTravelBillMainEntity();
    /// <summary>
    /// 消费明细
    /// </summary>
    public List<JZTravelBillDetailEntity> travelBillDetailList= new ArrayList<JZTravelBillDetailEntity>() ;
    /// <summary>
    /// 同行人员
    /// </summary>
    public List<JZColleaguesEntity> colleaguesList= new ArrayList<JZColleaguesEntity>() ;

}
