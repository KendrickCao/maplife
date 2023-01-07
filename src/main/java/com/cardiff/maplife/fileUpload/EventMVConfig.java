package com.cardiff.maplife.fileUpload;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class EventMVConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        exposeDirectory("event", registry);
    }
    private void exposeDirectory(String dirName, ResourceHandlerRegistry registry) {
    //if linux
            registry.addResourceHandler("/event/**")
            .addResourceLocations("file:/maplife/event/");
    }

}
