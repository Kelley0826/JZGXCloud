package com.inspur.gs.fssp.jzgx.data.entity.pub;

/**
 * @Description:  影像状态
 * @author: db
 * @date: 2020/5/2 15:36
 */
public class JzImageStateEntity {
    /**
     * 99:未启用影像
     * */
    public static final String  NoImage = "99";

    /**
     * 0：待登记接收
     * */
    public static final  String  ReceiveWaiting= "0";

    /**
     * 1 :已登记接收
     * */
    public  static final String  RegisteredReceived = "1";

    /**
     * 2:扫描完成
     * */
    public static final  String ReceiveCompleted = "2";


    /**
     * 3:重新扫描
     * */
    public static final  String  ScanCompleted = "3";


    /**
     * 4:重扫完成
     * */
    public static  final String  RescanCompleted = "4";


    /**
     * 5:已经退单
     * */
    public static final String  Returned="5";

    /**
     * 6:已经归档
     * */
    public static final  String  ArchiveCompleted= "6";


    /**
     * 7:待后补中
     * */
    public static final String  RepairWaiting= "7";

    /**
     * 8:后补完成
     * */
    public static final String  RepairCompleted= "8";

    /**
     * 90:启用但无需扫描
     * */
    public static final String  Imagenoneed = "90" ;

    /*
     * 影像控制方式 0 不控制 1完整性控制 2强制性控制
     * */

    /*
     * 发起方式，分为无、自动发起、手工发起三种
     * */

    /*
     * 是否允许重扫 分为允许、不允许
     * */

}
