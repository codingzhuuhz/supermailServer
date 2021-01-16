package com.testconnect.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UploadConfig implements WebMvcConfigurer {
    @Value("${file.staticAccessPath}")
    private String staticAccessPath;
    @Value("${file.uploadFolder}")
    private String uploadFolder;
//    @Value("${file.uploadIntroFolder}")
//    private String uploadIntroFolder;
//    @Value("${file.uploadTopFolder}")
//    private String uploadTopFolder;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadFolder);
//        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadTopFolder);
//        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadIntroFolder);
    }
}
