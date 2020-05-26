package com.inspur.gs.fssp.pubjz.foundation.config;

import com.inspur.gs.fssp.pubjz.foundation.api.JZBillBeApi;
import com.inspur.gs.fssp.pubjz.foundation.api.JZFSSPLangServiceApi;
import com.inspur.gs.fssp.pubjz.foundation.service.JZBillBeImpl;
import com.inspur.gs.fssp.pubjz.foundation.service.JZFSSPLangServiceImpl;
import io.iec.caf.data.jpa.repository.config.EnableCafJpaRepositories;
import io.iec.edp.caf.rest.RESTEndpoint;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author tangchm01
 * @Date 2020/2/17 17:00
 * @Version 1.0
 */
@Configuration
@EnableCafJpaRepositories("com.inspur.gs.fssp.pubjz.foundation.repository")
@EntityScan("com.inspur.gs.fssp.pubjz.foundation.entity")
@ComponentScan("com.inspur.gs.fssp.pubjz.foundation.**")
public class JZFSSPPubjzFoundationConfig {

    @Bean
    //@Lazy(false)
    public RESTEndpoint jzfsspCommonServiceConfig(JZBillBeApi JZBillBeApi, JZFSSPLangServiceApi fsspLangService) {
        return new RESTEndpoint(
                "/runtime/fssp/pubjz/v1.0",
                JZBillBeApi,fsspLangService
        );
    }

    @Bean
    //@Lazy(false)
    public JZBillBeApi jzbillBeApi() {
        return new JZBillBeImpl();
    }

    @Bean
    public JZFSSPLangServiceApi jzfsspLangService(){return new JZFSSPLangServiceImpl();}


}



