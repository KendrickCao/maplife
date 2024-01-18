package com.cardiff.maplife.fileUpload;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        Path uploadDir = Paths.get(dirName);
        String uploadPath = uploadDir.toFile().getAbsolutePath();
        String osName=System.getProperty("os.name");
        //if windows
        if (osName.toLowerCase().startsWith("win")){
            if (dirName.startsWith("../")) dirName = dirName.replace("../", "");
            registry.addResourceHandler("/" + dirName + "/**").addResourceLocations("file:/"+ uploadPath + "/");
        }
        else{
            //if linux
            registry.addResourceHandler("/event/**")
            .addResourceLocations("file:/maplife/event/");
        }
    }

}
