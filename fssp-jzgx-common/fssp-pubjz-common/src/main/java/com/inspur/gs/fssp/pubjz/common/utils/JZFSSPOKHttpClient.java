package com.inspur.gs.fssp.pubjz.common.utils;

import okhttp3.*;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
 * 获取Post远程传参
 */
public class JZFSSPOKHttpClient {

    public static String postResultJson(String url, String requsetBody) throws Exception {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .dns(new JZHttpDns())
//                .addNetworkInterceptor(new  IPInterceptor() )
                .retryOnConnectionFailure(true)
                .build();
       MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requsetBody);
        Cookie[] cookies;
        //request为null
        if (null != PhaseInterceptorChain.getCurrentMessage()) {
            HttpServletRequest requestInit = (HttpServletRequest) PhaseInterceptorChain.getCurrentMessage().get("HTTP.REQUEST");
            cookies = requestInit.getCookies();
        } else {
            cookies = new Cookie[]{};
        }
        String cookiesList = "";
        if (cookies.length > 0) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookieOne = cookies[i];
                if (cookieOne != null) {
                    cookiesList += cookieOne.getName() + "=" + cookieOne.getValue() + ";";

                }
            }
        }
        String sessionId = StringUtils.isEmpty(JZFSSPSession.current.getSessionId()) ? "" : JZFSSPSession.current.getSessionId();

        Request request = new Request.Builder().url(url)
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("SessionId", sessionId)
                .addHeader("Cookie", cookiesList)
                .build();
        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {

            String result = response.body().string();
            return result;
        } else {

            String result = response.body().string();
            if (result.length() == 0) {
                throw new Exception("url:" + url + " ~requsetBody:" + requsetBody + " ~response" + response.message());
            } else {
                throw new Exception(result);
            }
        }
    }

    public static String putResultJson(String url, String requsetBody) throws Exception {

        OkHttpClient client = new OkHttpClient.Builder().
                connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .dns(new JZHttpDns())
//                .addNetworkInterceptor(new  IPInterceptor() )
                .retryOnConnectionFailure(true)
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requsetBody);
        HttpServletRequest requestInit = (HttpServletRequest) PhaseInterceptorChain.getCurrentMessage().get("HTTP.REQUEST");
        Cookie[] cookies = requestInit.getCookies();
        String cookiesList = "";
        if (cookies.length > 0) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookieOne = cookies[i];
                if (cookieOne != null) {
                    cookiesList += cookieOne.getName() + "=" + cookieOne.getValue() + ";";

                }
            }
        }
        Request request = new Request.Builder().url(url)
                .put(body)
                .addHeader("content-type", "application/json")
                .addHeader("SessionId", JZFSSPSession.current.getSessionId())
                .addHeader("Cookie", cookiesList)
                .build();
        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {
            String result = response.body().string();
            return result;
        } else {
            String result = response.body().string();
            if (result.length() == 0) {
                throw new Exception("url:" + url + " ~requsetBody:" + requsetBody + " ~response" + response.message());

            } else {
                throw new Exception(result);
            }

        }
    }

}

class JZHttpDns implements Dns {

    @Override
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {

        try {
            List<InetAddress> result = new ArrayList<>();
            if ("localhost".equals(hostname) || "127.0.0.1".equals(hostname)) {
                result.add(InetAddress.getByName("127.0.0.1"));
                return result;
            } else {
                return Dns.SYSTEM.lookup(hostname);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //当有异常发生时，使用默认解析
        return Dns.SYSTEM.lookup(hostname);
    }
}

class JZIPInterceptor implements Interceptor {
    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();
        Response response = chain.proceed(request);

        long t2 = System.nanoTime();

        return response;
    }
}