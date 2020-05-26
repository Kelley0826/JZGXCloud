package com.inspur.gs.fssp.jzgx.internal.core.config;

import com.inspur.gs.fssp.jzgx.internal.api.*;
import com.inspur.gs.fssp.jzgx.internal.core.service.*;
import io.iec.edp.caf.rest.RESTEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories()
@EntityScan()
@ComponentScan("com.inspur.gs.fssp.jzgx.internal.api")
public class InternalConfigJZ {
    @Bean
    @ConditionalOnBean(InternalApiJZ.class)
    public RESTEndpoint orderJZGXInternalService(InternalApiJZ internalApiJZ,
                                                 JZGXImageManagerAPI jzgxImageManagerAPI,
                                                 BizLogicApi bizLogicApi
    ) {
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0/jzgxint",
                internalApiJZ,
                jzgxImageManagerAPI,
                bizLogicApi

        );
    }

    @Bean
    public InternalApiJZ internalApiJZ() {
        return new InternalImplJZ();
    }

    @Bean
    public JZGXImageManagerAPI jzgxImageManagerAPI() {
        return new JZGXImageManagerImpl();
    }

    @Bean
    public BizLogicApi bizLogicApi() {
        return new BizLogicImpl();
    }

}
