package com.pang.tiger.biz01.web.clouddemo001web.config;

import com.pang.tiger.biz01.web.clouddemo001web.interceptor.MdcInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @Author Tang Shixin
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MdcInterceptor mdcInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mdcInterceptor).addPathPatterns("/**");
    }
}
