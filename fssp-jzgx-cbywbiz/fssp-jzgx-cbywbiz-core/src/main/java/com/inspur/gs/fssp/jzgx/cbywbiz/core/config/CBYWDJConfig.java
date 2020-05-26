package com.inspur.gs.fssp.jzgx.cbywbiz.core.config;

import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjj.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dsjjcs.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjj.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.api.dxjjcs.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.jzht.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.api.tx.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dsjj.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dsjjcs.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dxjj.*;
import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.dxjjcs.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.jzht.*;
//import com.inspur.gs.fssp.jzgx.cbywbiz.core.impl.tx.*;

import io.iec.edp.caf.rest.RESTEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"com.inspur.gs.fssp.jzgx.data.repository"})
@EntityScan({"com.inspur.gs.fssp.jzgx.data.entity"})
@ComponentScan("com.inspur.gs.fssp.jzgx.cbywbiz.**")
public class CBYWDJConfig {
    @Bean
    @ConditionalOnBean(DSJJZDApi.class)
    public RESTEndpoint orderDSJJDJService(DSJJZDApi dsjjzdapi,
                                           DSJJProcessApi dsjjprocessapi
                                           ){
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0/dsjjbiz",
                dsjjzdapi,
                dsjjprocessapi
        );
    }
    @Bean
    @ConditionalOnBean(DSJJCSZDApi.class)
    public RESTEndpoint orderDSJJCSDJService(DSJJCSZDApi dsjjcszdapi,
                                           DSJJCSProcessApi dsjjcsprocessapi
    ){
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0/dsjjcsbiz",
                dsjjcszdapi,
                dsjjcsprocessapi
        );
    }
    @Bean
    @ConditionalOnBean(DXJJZDApi.class)
    public RESTEndpoint orderDXJJDJService(DXJJZDApi dxjjzdapi,
                                             DXJJProcessApi dxjjprocessapi
    ){
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0/dxjjbiz",
                dxjjzdapi,
                dxjjprocessapi
        );
    }
    @Bean
    @ConditionalOnBean(DXJJCSZDApi.class)
    public RESTEndpoint orderDXJJCSDJService(DXJJCSZDApi dxjjcszdapi,
                                           DXJJCSProcessApi dxjjcsprocessapi
    ){
        return new RESTEndpoint(
                "/runtime/fssp/jzgx/v1.0/dxjjcsbiz",
                dxjjcszdapi,
                dxjjcsprocessapi
        );
    }



    @Bean
    public DSJJZDApi dsjjzdapi(){
        return new DSJJZDImpl();
    }
    @Bean
    public DSJJProcessApi dsjjprocessapi(){
        return new DSJJProcessImpl();
    }
    @Bean
    public DSJJCSZDApi dsjjcszdapi(){
        return new DSJJCSZDImpl();
    }
    @Bean
    public DSJJCSProcessApi dsjjcsprocessapi(){
        return new DSJJCSProcessImpl();
    }
    @Bean
    public DXJJZDApi dxjjzdapi(){
        return new DXJJZDImpl();
    }
    @Bean
    public DXJJProcessApi dxjjprocessapi(){
        return new DXJJProcessImpl();
    }
    @Bean
    public DXJJCSZDApi dxjjcszdapi(){
        return new DXJJCSZDImpl();
    }
    @Bean
    public DXJJCSProcessApi dxjjcsprocessapi(){
        return new DXJJCSProcessImpl();
    }

}
