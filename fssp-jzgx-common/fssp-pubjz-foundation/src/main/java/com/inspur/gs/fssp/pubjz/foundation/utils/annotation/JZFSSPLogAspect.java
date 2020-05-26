package com.inspur.gs.fssp.pubjz.foundation.utils.annotation;

import com.inspur.gs.fssp.pubjz.foundation.entity.JZGSPUserDO;
import com.inspur.gs.fssp.pubjz.foundation.repository.JZGSPUserRepository;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPJSONSerializer;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPLoggerFactory;
import com.inspur.gs.fssp.pubjz.common.utils.JZFSSPSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author tangchm01
 * @Date 2019/12/24 19:15
 * @Version 1.0
 * 切面入口
 */
@Aspect
@Component
public class JZFSSPLogAspect {
    @Autowired
    private JZGSPUserRepository JZGSPUserRepository;

    //controller层切点
    @Pointcut("execution(* *(..)) &&@annotation(com.inspur.gs.fssp.common.foundation.utils.annotation.FSSPOutLogger)")
    public void fsspLogAspectPointCut() {
    }

    /**
     * 前置通知：目标方法执行之前执行以下方法体的内容
     *
     * @param jp
     */
    @Before("fsspLogAspectPointCut()")
    public void beforeMethod(JoinPoint jp) {
        StringBuffer strLog = new StringBuffer();
        String serviceUnit = "";
        String action = "";
        String description = "";
        try {
            serviceUnit = getFSSPOutLoggerSu(jp);
            action = getFSSPOutLoggerAction(jp);
            description = getFSSPOutLoggerDescription(jp);
        } catch (Exception ex) {
            JZFSSPLoggerFactory.getLogger("Error").error("获取打印注解信息失败");
        }
        strLog.append("\n    ******开始 :" + "\n    ******方法：" + action + "\n    ******描述：" + description + "\n");
        //打印登录用户信息
        if (!StringUtils.isEmpty(JZFSSPSession.current.getUserId())) {
            JZGSPUserDO userAllInfo = null;
            try {
                userAllInfo = JZGSPUserRepository.getUserAllInfo(JZFSSPSession.current.getUserId());
            } catch (Exception e) {
                JZFSSPLoggerFactory.getLogger("Error").error("查询登录用户出错！");
            }
            strLog.append("    ******用户 ： " + userAllInfo.getName_chs() + "\n");
        }
        Object[] args = jp.getArgs();
        if (args == null || args.length == 0) {
            strLog.append("    ******入参 ： " + "无\n");
        } else {
            strLog.append("    ******入参 ： " + Arrays.toString(args) + "\n");
        }
        JZFSSPLoggerFactory.getLogger(serviceUnit).info(strLog.toString());
    }

    /**
     * 后置通知
     * @param jp
     * @param ret
     */
    @AfterReturning(value = "fsspLogAspectPointCut()",returning = "ret")
    public  void doAfterReturning(JoinPoint jp,Object ret)
    {
        StringBuffer strLog=new StringBuffer();
        String serviceUnit = "";
        String action = "";
        String description = "";
        try {
            serviceUnit = getFSSPOutLoggerSu(jp);
            action = getFSSPOutLoggerAction(jp);
            description = getFSSPOutLoggerDescription(jp);
        } catch (Exception ex) {
            JZFSSPLoggerFactory.getLogger("Error").error("获取打印注解信息失败");
        }
        if(ret!=null){
            strLog.append("\n    ******返回 ： "+ JZFSSPJSONSerializer.serialize(ret) +"\n");
        }else{
            strLog.append("\n    ******返回 ： "+"无\n");
        }
        strLog.append("    ******结束 ： "+serviceUnit+"-"+action+"\n");
        JZFSSPLoggerFactory.getLogger(JZFSSPSession.current.getCurrentDateTimeForString()).info(strLog.toString());
    }

    /**
     * 异常
     * @param jp
     * @param e
     */
    @AfterThrowing(pointcut = "fsspLogAspectPointCut()",throwing = "e")
    public void doAfterThrowing(JoinPoint jp,Throwable e)
    {
        StringBuffer strLog=new StringBuffer();
        String serviceUnit = "";
        String action = "";
        String description = "";
        try {
            serviceUnit = getFSSPOutLoggerSu(jp);
            action = getFSSPOutLoggerAction(jp);
            description = getFSSPOutLoggerDescription(jp);
        } catch (Exception ex) {
            JZFSSPLoggerFactory.getLogger("Error").error("获取打印注解信息失败");
        }
        strLog.append("    ******方法内部错误 ： "+"\n    ******方法：" + action + "\n    ******" + description + "\n");
        strLog.append("    ******方法内部错误 ： "+e.toString());
        JZFSSPLoggerFactory.getLogger(serviceUnit).error(strLog.toString());
    }

    /**
     * 获取对应注解SU
     *
     * @param joinPoint
     * @return
     * @throws Exception
     */
    private String getFSSPOutLoggerSu(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String serviceUnit = null;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    serviceUnit = method.getAnnotation(JZFSSPOutLogger.class).su();
                    break;
                }
            }
        }
        return serviceUnit;
    }

    /**
     * 获取注解action
     *
     * @param joinPoint
     * @return
     */
    private String getFSSPOutLoggerAction(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String action = null;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    action = method.getAnnotation(JZFSSPOutLogger.class).action();
                    break;
                }
            }
        }
        return action;
    }

    /**
     * 获取 description
     *
     * @param joinPoint
     * @return description
     * @throws Exception
     */
    private String getFSSPOutLoggerDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = null;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(JZFSSPOutLogger.class).description();
                    break;
                }
            }
        }
        return description;
    }
}
