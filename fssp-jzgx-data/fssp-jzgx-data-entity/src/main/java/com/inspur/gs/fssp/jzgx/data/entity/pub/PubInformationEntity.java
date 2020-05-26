package com.inspur.gs.fssp.jzgx.data.entity.pub;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description: 单据上公共信息实体
 * @author: db
 * @date: 2020/5/2 16:48
 */
@Entity
@Data
public class PubInformationEntity {

    @Id
    private String id;


    /*-----------------------------------*/
    /* 1 用户信息                       */
    /*-----------------------------------*/
    /**
     *用户id
     */
    public  String gspuser_id; //3 用户信息
    /**
     *用户编号
     */
    public  String gspuser_code;
    /**
     *用户名称
     */
    public  String gspuser_name;


    /*-----------------------------------*/
    /* 2 行政人员信息                  */
    /*-----------------------------------*/
    /**
     * 行政人员内码
     */
    public  String bfemployee_id ;
    /**
     * 行政人员编号
     */
    public  String bfemployee_code;
    /**
     * 行政人员名称
     */
    public  String bfemployee_name;
    /**
     *手机号
     */
    public  String bfemployee_phone;
    /**
     *邮箱
     */
    public  String bfemployee_email;
    /**
     *密级
     */
    public  String bfemployee_mj;
    /**
     *证件id
     */
    public  String bfemployee_IDNumber;
    /**
     *证件类型
     */
    public  String bfemployee_IDType;
    /**
     *所属国际或区域
     */
    public  String bfemployee_country;
    /**
     *常驻地
     */
    public  String bfemployee_location;
    /**
     *显示名称
     */
    public  String bfemployee_displayName;
    /**
     *性别
     */
    public  String bfemployee_gender;
    /**
     *状态
     */
    public  String bfemployee_state;


    /*-----------------------------------*/
    /* 3 行政组织                       */
    /*-----------------------------------*/
    /**
     *行政组织id
     */
    public  String organization_id;//2行政组织
    /**
     *行政组织编号
     */
    public  String organization_code;
    /**
     *行政组织名称
     */
    public  String organization_name;
    /**
     *行政部门id
     */
    public  String organization_DepartmentID;
    /**
     *行政部门编号
     */
    public  String organization_DepartmentCode;
    /**
     *行政部门名称
     */
    public  String organization_DepartmentName;
    /**
     *行政组织部门负责人
     */
    public  String organization_DepartmentHead ;
    /**
     *行政组织部门负责人名称
     */
    public  String organization_DepartmentHeadName;
    /**
     *行政组织法人代表
     */
    public  String organization_Representative;



    /*-----------------------------------*/
    /* 4 行政人员职务职务          */
    /*-----------------------------------*/
    /**
     *职务编号
     */
    public  String bfduty_code;
    /**
     *职务名称
     */
    public  String bfduty_name;
    /**
     *职位编号
     */
    public  String bfposition_code;
    /**
     *职位名称
     */
    public  String bfposition_name;

    /*-----------------------------------*/
    /* 5 报账组织报账部门                 */
    /*-----------------------------------*/
    /**
     * 报账组织内码
     */
    public  String bzzz_dwnm;
    /**
     * 报账组织编号
     */
    public  String bzzz_dwcode;
    /**
     * 报账组织名称
     */
    public  String bzzz_dwname;
    /**
     * 报账部门内码
     */
    public  String bzzz_bmnm;
    /**
     * 报账部门编号
     */
    public  String bzzz_bmcode;
    /**
     * 报账部门名称
     */
    public  String bzzz_bmname;


    /*-----------------------------------*/
    /* 7本位币信息               */
    /*-----------------------------------*/

    /**
     *本位币币种编号id
     */
    public  String bfcurrency_id;
    /**
     *本位币币种编号
     */
    public  String bfcurrency_code;
    /**
     *本位币币种名称
     */
    public  String bfcurrency_name;
    /**
     *本位币币种符号
     */
    public  String bfcurrency_symbol;
    /**
     *本位币币种精度
     */
    public  String bfcurrency_accuracy;

    /*-----------------------------------*/
    /* 8汇率             */
    /*-----------------------------------*/

    public Double rate;  // 汇率
}
