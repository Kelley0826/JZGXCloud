package com.inspur.gs.fssp.pubjz.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志记录
 *
 * @author johnyang
 * since  version 1.0.0
 */
public class JZFSSPLoggerFactory {

    private JZFSSPLoggerFactory() {
    }

    Logger logger;

    /*
     * 初始化
     */
    public static JZFSSPLoggerFactory getLogger(Class<?> clazz) {
        JZFSSPLoggerFactory fsspLogger = new JZFSSPLoggerFactory();

        fsspLogger.logger = LoggerFactory.getLogger(clazz);
        return fsspLogger;
    }

    /*
     * 初始化
     */
    public static JZFSSPLoggerFactory getLogger(String name) {
        JZFSSPLoggerFactory fsspLogger = new JZFSSPLoggerFactory();

        fsspLogger.logger = LoggerFactory.getLogger(name);
        return fsspLogger;
    }

    /*
     * 输出为debug日志
     */
    public void debug(String val) {
        logger.debug(val);
    }

    /*
     * 输出为info日志
     */
    public void info(String val) {
        logger.info(val);
    }

    /*
     * 输出为error日志
     */
    public void error(String val) {
        logger.error(val);
    }

    /*
     * 输出为trace日志
     */
    public void trace(String val) {
        logger.trace(val);
    }

    /*
    * 输出为warn日志
     */
    public void warn(String val) {
        logger.warn(val);
    }
}
