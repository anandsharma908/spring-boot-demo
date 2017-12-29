package com.sharma.springbootdemo.controller.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * author anand.
 * since on 29/12/17.
 */
@Configurable
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MandatoryParameterInterceptor()).excludePathPatterns("/docs/**")
                .excludePathPatterns("/v2/**").excludePathPatterns("/version")
                .excludePathPatterns("/configuration/**").excludePathPatterns("/swagger-resources/**")
                .excludePathPatterns("/swagger-ui.html");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/docs/v2/api-docs", "/v2/api-docs");
        registry.addRedirectViewController("/docs/configuration/ui", "/configuration/ui");
        registry.addRedirectViewController("/docs/configuration/security", "/configuration/security");
        registry.addRedirectViewController("/docs/swagger-resources", "/swagger-resources");
        registry.addRedirectViewController("/docs", "/swagger-ui.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/docs/**").addResourceLocations("classpath:/META-INF/resources/");
    }
}
