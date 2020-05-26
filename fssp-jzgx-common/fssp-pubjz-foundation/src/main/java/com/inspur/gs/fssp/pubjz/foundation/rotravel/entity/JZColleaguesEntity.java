package com.inspur.gs.fssp.pubjz.foundation.rotravel.entity;

/**
 * @author jiangshaoshuai
 * @since 2020/2/27 11:58
 * 同行人员
 */
public class JZColleaguesEntity {
    /// <summary>
    /// 出行人ID
    /// </summary>
    public String PersonId ;
    /// <summary>
    /// 出行人名称
    /// </summary>
    public String PersonName ;
    /// <summary>
    /// 出行人员手机号
    /// </summary>
    public String PersonMobile ;
    /// <summary>
    /// 出行人类型 1为员工 2为外部人员(东美)
    /// </summary>
    public String PersonCxrlx ;
    /// <summary>
    /// 出操作类型（东美）I-新增 D-删除 U-修改
    /// </summary>
    public String CzLx ;
}
