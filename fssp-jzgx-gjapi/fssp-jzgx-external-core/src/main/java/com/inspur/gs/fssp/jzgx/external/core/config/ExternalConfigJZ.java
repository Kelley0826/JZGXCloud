package com.inspur.gs.fssp.jzgx.external.core.config;


import com.inspur.gs.fssp.jzgx.external.api.fspf.*;
import com.inspur.gs.fssp.jzgx.external.api.fssp.*;
import com.inspur.gs.fssp.jzgx.external.api.voucher.ExternalApiOnVoucherJZ;
import com.inspur.gs.fssp.jzgx.external.core.impl.fspf.*;
import com.inspur.gs.fssp.jzgx.external.core.impl.fssp.*;
import com.inspur.gs.fssp.jzgx.external.core.impl.voucher.ExternalImplOnvoucherJZ;
import io.iec.edp.caf.rest.RESTEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories()
@EntityScan({"com.inspur.gs.fssp.pubjz.foundation.**"})
@ComponentScan({"com.inspur.gs.fssp.jzgx.external.**"})
public class ExternalConfigJZ {
    @Bean
    @ConditionalOnBean(ExternalApiJZGXOnFSSP.class)
    public RESTEndpoint orderJZGXEXternalService(
            ExternalApiJZGXOnFSPF externalApiJZGXOnFSPF,
            ExternalApiJZGXOnFSSP externalApiJZGXOnFSSP,
            ExternalApiOnVoucherJZ externalApiOnVoucherJZ,
            ExternalApiBillViewOnFSSPJZ externnalApiBillviewOnFSSP


    ){
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0",
                externalApiJZGXOnFSPF,
                externalApiJZGXOnFSSP,
                externalApiOnVoucherJZ,
                externnalApiBillviewOnFSSP
        );
    }

    @Bean
    public ExternalApiJZGXOnFSPF externalApiJZGXOnFSPF(){ return new ExternalImplJZGXOnFSPF(); }
    @Bean
    public ExternalApiJZGXOnFSSP externalApiJZGXOnFSSP(){ return new ExternalImplJZGXOnFSSP(); }
    @Bean
    public ExternalApiBillViewOnFSSPJZ externalApiBillviewOnFSSPJZ(){ return new ExternalImplBillViewOnFSSPJZ(); }
    @Bean
    public ExternalApiOnVoucherJZ externalApiOnVoucherJZ(){ return new ExternalImplOnvoucherJZ(); }
}

