package com.inspur.gs.fssp.pubjz.foundation.utils.annotation;

import java.lang.annotation.*;

/**
 * @Author tangchm01
 * @Date 2019/12/24 19:03
 * @Version 1.0
 * 定义注解（annocation  ）：FSSPOutLogger
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JZFSSPOutLogger {
    /** 方法模块 */
    String su() default "";
    /** 功能 */
    String action() default "";
    /**描述*/
    String description()  default "";
}
