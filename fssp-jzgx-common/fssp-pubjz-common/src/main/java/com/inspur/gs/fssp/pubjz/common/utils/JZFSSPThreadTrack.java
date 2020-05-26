package com.inspur.gs.fssp.pubjz.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JZFSSPThreadTrack {

    private static final JZFSSPLoggerFactory logger = JZFSSPLoggerFactory.getLogger(JZFSSPSession.class);

    public static void printTrack() {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info("当前时间：" + sdf.format(d)+"\r\n");

        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        if (st == null) {
            logger.info("无堆栈...");
            return;
        }
        StringBuffer sbf = new StringBuffer();
        for (StackTraceElement e : st) {
            if (sbf.length() > 0) {
                sbf.append(" <- ");
                sbf.append(System.getProperty("line.separator"));
            }
            sbf.append(java.text.MessageFormat.format("{0}.{1}() {2}"
                    , e.getClassName()
                    , e.getMethodName()
                    , e.getLineNumber()));
        }
        logger.info("堆栈："+sbf.toString()+"\r\n");
    }

}
