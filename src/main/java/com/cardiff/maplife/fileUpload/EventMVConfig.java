package com.cardiff.maplife.fileUpload;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class EventMVConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        exposeDirectory("event", registry);
    }

    private void exposeDirectory(String dirName, ResourceHandlerRegistry registry) {
        Path uploadDir = Paths.get(dirName);
        String uploadPath = uploadDir.toFile().getAbsolutePath();
        System.out.println(uploadPath);




        if (dirName.startsWith("../")) dirName = dirName.replace("../", "");

        // registry.addResourceHandler("/" + dirName + "/**").addResourceLocations("file:/" + uploadPath + "/");
        registry.addResourceHandler("/" + dirName + "/**").addResourceLocations("file://"+ uploadPath + "/");

    }

}
