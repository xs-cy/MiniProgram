package com.example.program.config;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

public class ResourceConfig {

    public static Properties getStatisProperties(String path){
        return getProperties(path);
    }

    public Properties loadProperties(String path){
        return getProperties(path);
    }


    private static Properties getProperties(String path){
        Properties properties = new Properties();
        try{
            Resource resource = new ClassPathResource(path);
            properties.load(resource.getInputStream());
        }catch (IOException e){
            e.printStackTrace();
        }

        return properties;

    }
}
