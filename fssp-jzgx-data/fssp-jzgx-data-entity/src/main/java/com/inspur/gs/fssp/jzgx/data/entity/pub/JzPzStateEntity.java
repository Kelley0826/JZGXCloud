package com.inspur.gs.fssp.jzgx.data.entity.pub;

/**
 * @Description:  凭证状态
 * @author: db
 * @date: 2020/5/2 15:37
 */
public class JzPzStateEntity {
    /**
     * 未生成凭证
     * */
    public  static  final String  NoVoucer = "0";

    /**
     *正式凭证
     */
    public static final String  Voucer = "1";

    /**
     *预制凭证已复核
     */
    public  static final  String  PreVoucerPass = "2";

    /**
     *预制复核退回
     */
    public  static final String  PreVoucerRollback = "3";

    /**
     *正式已审核
     */
    public  static final String  VoucerPass = "5";
    /**
     * 虚拟凭证
     * */
    public   static final  String  VirVoucer= "8";
    /**
     * 预制凭证
     * */
    public   static final String PreVoucer = "9";
    /**
     * 凭证作废
     * */
    public   static final String VoucerZF= "11";

}
