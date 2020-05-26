package com.inspur.gs.fssp.pubjz.foundation.utils;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author tangchm01
 * @Date 2019/12/30 18:55
 * @Version 1.0
 */
@Component
public class JZFSSPIpConfig implements ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
    }

    public int getPort() {
        return this.serverPort;
    }
}

