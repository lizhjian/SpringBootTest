package com.ziroom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(profiles = "test")
class SpringBootDemoApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${filename}")
    private String filename;

    @Test
    void profile() {
        System.out.println("current file:" + filename);
    }


    @Test
    void contextLoads() {

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        System.out.println("current file:" + filename);

        System.out.println("bean size:" + beanDefinitionNames.length);
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }



}
