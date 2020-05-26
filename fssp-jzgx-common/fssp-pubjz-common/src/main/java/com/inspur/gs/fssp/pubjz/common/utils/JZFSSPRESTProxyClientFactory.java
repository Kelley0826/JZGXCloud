package com.inspur.gs.fssp.pubjz.common.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.iec.edp.caf.rest.client.RESTProxyClientFactory;
import io.iec.edp.caf.security.form.FormLoginAuthorizationManagerFilter;
import io.iec.edp.caf.security.form.FormLoginConfigurationProperties;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.ws.rs.client.ClientRequestFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 远程调用RESTFul服务
 *
 * @author johnyang
 * since  version 1.0.0
 */
//@EnableAutoConfiguration
public class JZFSSPRESTProxyClientFactory {

    public static <S> S build(Class<S> s, URL baseUrl, Object... providers) {
        if(providers==null) {
            return RESTProxyClientFactory.build(s, baseUrl, new Object());
        }
        return RESTProxyClientFactory.build(s, baseUrl, providers);
    }

    public static <S> S build(Class<S> s, int port, String basePath, Object... providers) {
        if(providers==null) {
            return RESTProxyClientFactory.build(s, port, basePath, new Object());
        }

        return RESTProxyClientFactory.build(s, port, basePath, providers);
    }
}
