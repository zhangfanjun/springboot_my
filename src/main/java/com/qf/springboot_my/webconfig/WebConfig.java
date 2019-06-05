package com.qf.springboot_my.webconfig;

import com.qf.springboot_my.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor my;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //这里是拦截器，有/*和/**的区别
        registry.addInterceptor(my).addPathPatterns("/**");
    }
}
