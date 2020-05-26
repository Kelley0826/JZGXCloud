package com.inspur.gs.fssp.pubjz.common.utils;

import io.iec.edp.caf.rpc.api.service.RpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Component
@Primary
public class JZFSSPRpcClient {

    private JZFSSPRpcClient() {
    }

    private static JZFSSPRpcClient m_JZFSSPRpcClient = null;

    @PostConstruct
    private void init() {
        m_JZFSSPRpcClient = this;
    }

    public JZFSSPRpcClient getInstance() {
        return m_JZFSSPRpcClient;
    }

    @Autowired
    private RpcClient rpcClient; //RPC远程调用


    public <T> T invoke (Class<T> inMapClass, String fullPackMethPath, String su, LinkedHashMap<String, Object> mapAll, HashMap<String, String> var5) {
        try {
            return rpcClient.invoke(inMapClass, fullPackMethPath, su, mapAll, var5);
        } catch (Exception e) {
            throw new RuntimeException(getErrorMassage(e));
        }
    }


    public String invoke(String fullPackMethPath, String su, LinkedHashMap<String, Object> mapAll, HashMap<String, String> var4) {
        try {
            return rpcClient.invoke(fullPackMethPath, su, mapAll, var4);
        } catch (Exception e) {
            throw new RuntimeException(getErrorMassage(e));
        }

    }


    @Deprecated
    public <T> T invokeService(Class<T> inMapClass, String fullPackMethPath, String su, HashMap<String, Object> mapAll, HashMap<String, String> var5) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, MalformedURLException {

        try {
            return rpcClient.invokeService(inMapClass, fullPackMethPath, su, mapAll, var5);
        } catch (Exception e) {
            throw new RuntimeException(getErrorMassage(e));
        }
    }

    @Deprecated
    public String InvokeService(String fullPackMethPath, String su, HashMap<String, Object> mapAll, HashMap<String, String> var4) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, MalformedURLException {
        try {
            return rpcClient.InvokeService(fullPackMethPath, su, mapAll, var4);
        } catch (Exception e) {
            throw new RuntimeException(getErrorMassage(e));
        }

    }


    public static String getErrorMassage(Exception e) {
        String errorMessage = "";
        if (e != null) {
            if (e.getCause() instanceof Error) {
                e.printStackTrace();
                return e.toString();
            }

            Exception firstExc = (Exception) e.getCause();
            if (firstExc != null) {
                if (firstExc.getCause() instanceof Error) {
                    firstExc.printStackTrace();
                    return firstExc.toString();
                }

                Exception secondExc = (Exception) firstExc.getCause();
                if (secondExc != null) {
                    errorMessage = secondExc.getLocalizedMessage();
                } else {
                    errorMessage = e.getMessage();
                }
            } else {
                errorMessage = e.getMessage();
            }
        }

        return errorMessage;
    }
}
