package com.qf.springboot_my.config;

import com.qf.springboot_my.filter.MyFilter;
import com.qf.springboot_my.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Autowired
    private MyFilter filter;
    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(filter);//添加过滤器
        bean.setName("MyFilter");//过滤器名字
        bean.addUrlPatterns("/*");//过滤范围
        return bean;
    }
    @Autowired
    private MyListener listener;
    public ServletListenerRegistrationBean setListener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(listener);
        return bean;
    }
}
