package com.inspur.gs.fssp.pubjz.common.utils;

import io.iec.edp.caf.boot.context.CAFContext;
import io.iec.edp.caf.commons.dataaccess.DbType;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Session获取当前登录用户
 *
 * @author johnyang
 * since  version 1.0.0
 */
public class JZFSSPSession {
    public static final JZFSSPSession current = new JZFSSPSession();

    /*
     * 获取登陆用户
     */
    public String getUserId() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getUserId();
    }

    /*
     * 获取登陆Session
     */
    public String getSessionId() {
        if (CAFContext.current == null)
            return "";
        return CAFContext.current.getSessionId();
    }

    /*
     * 获取实例编号
     */
    public String getAppCode() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getAppCode();
    }

    /*
     * 获取登陆时间
     */
    public LocalDateTime getLoginTime() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getLoginTime().toLocalDateTime();
    }

    /*
     * 获取登陆时间
     */
    public OffsetDateTime getLoginTimeForOffsetDateTime() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getLoginTime();
    }
    /*
     * 获取当前语言
     */

    public String getLanguage() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getLanguage();
    }

    /*
     * 获取系统当前时间
     */
    public LocalDateTime getCurrentDateTime() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getCurrentDateTime().toLocalDateTime();
    }

    /*
     * 获取系统当前时间
     */
    public OffsetDateTime getCurrentDateTimeForOffsetDateTime() {
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getCurrentDateTime();
    }

    /*
     * 获取系统当前时间,日期+时间
     */
    public String getCurrentDateTimeForString() {
        if (CAFContext.current == null)
            return null;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return df.format(JZFSSPSession.current.getCurrentDateTime());
    }
    /*
     * 获取系统当前时间,只有日期部分
     */
    public String getCurrentDateForString() {
        if (CAFContext.current == null)
            return null;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return df.format(JZFSSPSession.current.getCurrentDateTime());
    }

    public DbType getDbType(){
        if (CAFContext.current == null)
            return null;
        return CAFContext.current.getDbType();
    }
}
