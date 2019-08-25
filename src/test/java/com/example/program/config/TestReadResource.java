package com.example.program.config;

import junit.textui.TestRunner;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestReadResource.class)
public class TestReadResource {

    @Value("#{(new com.example.program.config.ResourceConfig().loadProperties('application.properties'))}")
    private Properties properties;

    @Test
    public void testResource() throws  Exception{
        System.out.println("读取的application.properties文件为："+properties);

        properties.forEach((o,o2) ->{
            Assertions.assertThat(o).isEqualTo("server.port");
            Assertions.assertThat(o2).isEqualTo("8080");
        });

    }

}
