package com.cardiff.maplife.config;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        String osName=System.getProperty("os.name");
        //if windows
        if (osName.toLowerCase().startsWith("win")){
            Path uploadDir2 = Paths.get(dirName);
            String uploadPath = uploadDir2.toFile().getAbsolutePath();
            String realUploadPath="\\src\\main\\resources\\static\\image";
            uploadPath = uploadPath.replace("image", realUploadPath);
            registry.addResourceHandler("/image/**")
                    .addResourceLocations("file:/"+ uploadPath + "/");
                    System.out.println("windows");
        }else{
        //if linux
                registry.addResourceHandler("/image/**")
                .addResourceLocations("file:/maplife/image/");
            }
        }
}