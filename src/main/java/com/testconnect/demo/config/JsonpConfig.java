package com.testconnect.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
@EnableWebMvc
public class JsonpConfig {
    @Bean
    public WebMvcConfigurer getCoreConfig(){
        return new WebMvcConfigurer() {
            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
               StringHttpMessageConverter converter =  new StringHttpMessageConverter(Charset.forName("utf-8")) ;
                converters.add(converter) ;
            }
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/cors/**")//指定匹配路径     ** 连续的路径
                        .allowedHeaders("*")//进
                        .allowedMethods("*")//
                        .allowCredentials(true)//允许客户端 cookies的传递
                        .allowedOrigins("*")//接收任何域名的请求
                        .maxAge(3600) ;
            }
        } ;

    }
}
