package com.cardiff.maplife.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        exposeDirectory("image", registry);
    }
    private void exposeDirectory(String dirName, ResourceHandlerRegistry registry) {
    //if linux
            registry.addResourceHandler("/image/**")
            .addResourceLocations("file:/maplife/image/");
    }
}