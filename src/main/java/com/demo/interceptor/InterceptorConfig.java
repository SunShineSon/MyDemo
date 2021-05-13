package com.demo.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : Ada
 * @CreateTime : 5/13/2021 5:00 PM
 * @Description :
 **/
public class InterceptorConfig implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry){
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(loggerInterceptor());
        registry.addInterceptor(authenticateInterceptor());
    }

    //logger interceptor
    @Bean("loggerInterceptor")
    public LoggerInterceptor loggerInterceptor(){
        LoggerInterceptor interceptor = new  LoggerInterceptor();
        return interceptor;
    }

    //authenticate interceptor, security interceptor
    @Bean("authenticateInterceptor")
    public AuthenticateInterceptor authenticateInterceptor(){
        AuthenticateInterceptor interceptor = new AuthenticateInterceptor();
        return interceptor;
    }
}
