package com.inspur.gs.fssp.pubjz.common.entity;

import javax.persistence.Id;
import java.util.Date;

public class JZFSSPBillApp {
    /**
     * 单据内码
     */
    @Id
    public final static String BILLID = "BILLID";
    /**
     * 业务领域，类似 BZJC 或RO
     */
    public final static String BIZAREA = "BIZAREA";
    /**
     * 业务来源，类似ROBX、ROJK、ROHK等
     */
    public final static String BIZCATEGORY = "BIZCATEGORY";
    /**
     * 单据类型内码
     */
    public final static String FORMTYPE = "FORMTYPE";
    /**
     * 业务单据数据
     */
    public final static String BILLDATA = "BILLDATA";
    /**
     * 审批结论
     */
    public final static String SPJL = "SPJL";
    /**
     * 审批意见
     */
    public final static String SPYJ = "SPYJ";
    /**
     * 标志 1：成功 0：失败
     */
    public final static String RESULTFLAG = "RESULTFLAG";
    /**
     * 错误消息
     */
    public final static String ERRORMESSAGE = "ERRORMESSAGE";
    /**
     * 业务单据模型ID
     */
    public final static String DATAMODELID = "DATAMODELID";
    /**
     * 共享报账单单据内码
     */
    public final static String GXBILLID = "GXBILLID";
    /**
     * 任务内码
     */
    public final static String taskid = "TASKID";
    /**
     * 当前功能节点
     */
    public final static String GNID = "GNID";
    /**
     * 下一功能节点
     */
    public final static String NEXTGNID = "NEXTGNID";
    /**
     * 上一功能节点
     */
    public final static String OLDGNID = "OLDGNID";
    /**
     * 是否加急 0：否 1：是 默认为0
     */
    public final static String IFJJ = "IFJJ";
    /**
     * 是否回退  0：否  1：回退
     */
    public final static String ISROBACK = "ISROBACK";
    /**
     * 任务处理人姓名
     */
    public final static String LOCKER = "LOCKER";
    /**
     * 任务处理人id
     */
    public final static String LOCKERID = "LOCKERID";
    /**
     * 单据树ID
     */
    public final static String TREEID = "TREEID";
    /**
     * 业务类型
     */
    public final static String YWLX = "YWLX";
    /**
     * 单位编号
     */
    public final static String DWBH = "DWBH";
    /**
     * 单位内码
     */
    public final static String DWID = "DWID";
    /**
     * 共享中心内码
     */
    public final static String FSSC = "FSSC";
    /**
     * 部门id
     */
    public final static String BMID = "BMID";
    /**
     * 制单人id
     */
    public final static String USERID = "USERID";
    /**
     * 制单人编号
     */
    public final static String USERCODE = "USERCODE";
    /**
     * 制单人姓名
     */
    public final static String USER = "USER";
    /**
     * 单据编号
     */
    public final static String DJBH = "DJBH";
    /**
     * 单据日期
     */
    public final static String DJRQ = "DJRQ";
    /**
     * 摘要
     */
    public final static String ZY = "ZY";
    /**
     * 金额
     */
    public final static String BZJE = "BZJE";
    /**
     * 报销人id
     */
    public final static String BXRID = "BXRID";
    /**
     * 报销人姓名
     */
    public final static String BXR = "BXR";
    /**
     * 本币金额
     */
    public final static String JSBBJE = "JSBBJE";
    /**
     * 汇率
     */
    public final static String HL = "HL";
    /**
     * 结算金额
     */
    public final static String JSJE = "JSJE";
    /**
     * 结算状态
     */
    public final static String JSZT = "JSZT";
    /**
     * 结算组织
     */
    public final static String JSZZ = "JSZZ";
    /**
     * 记账组织
     */
    public final static String JZZZ = "JZZZ";
    /**
     * 流程实例
     */
    public final static String LCSL = "LCSL";
    /**
     * 是否生成凭证：0不生成1生成
     */
    public final static String IFPZ = "IFPZ";
    /**
     * 是否共享中心模式
     */
    public final static String ISFSSC = "ISFSSC";
    /**
     * 业务单据联查地址
     */
    public final static String URL = "URL";
    /**
     * 内部账户编号
     */
    public final static String NBZH = "NBZH";
    /**
     * 内部账户名称
     */
    public final static String NBZHMC = "NBZHMC";
    /**
     * 外币编号
     */
    public final static String WBBH = "WBBH";
    /**
     * 凭证数据源ID
     */
    public final static String DSID = "DSID";
    /**
     * 填报说明
     */
    public final static String TBSM = "TBSM";
    /**
     * 维度1
     */
    public final static String WD1 = "WD1";
    /**
     * 维度2
     */
    public final static String WD2 = "WD2";
    /**
     * 生效日期
     */
    public final static String SXRQ = "SXRQ";
    /**
     * 截止日期
     */
    public final static String JZRQ = "JZRQ";
    /**
     * 影像状态
     */
    public final static String YXZT = "YXZT";
    /**
     * 附件张数
     */
    public final static String FJZS = "FJZS";
    /**
     * 是否启用影像
     */
    public final static String IFQYYX = "IFQYYX";
    /**
     * 取数SQL
     */
    public final static String SQL = "SQL";
    /**
     * 是否允许重扫
     */
    public final static String IFRESCAN = "IFRESCAN";
    /**
     * 是否拥有权限
     */
    public final static String IFAUTH = "IFAUTH";
    /**
     * 影像业务类型
     */
    public final static String CALLINGID = "CALLINGID";
    /**
     * 影像设置类型
     */
    public final static String IMAGEMODE = "IMAGEMODE";
    /**
     * 影像回写构件调用id
     */
    public final static String FSSCCALLINGID = "FSSCCALLINGID";
    /**
     * 原始票据状态
     */
    public final static String LZZT = "LZZT";
    /**
     * 单据状态
     */
    public final static String DJZT = "DJZT";
    /**
     * 影像张数
     */
    public final static String YXZS = "YXZS";
    /**
     * 结算日期
     */
    public final static String JSRQ = "JSRQ";
    /**
     * 挂起、申请调整原因
     */
    public final static String REASON = "REASON";
}
