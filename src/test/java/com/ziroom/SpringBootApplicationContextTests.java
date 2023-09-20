package com.ziroom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
//class SpringBootApplicationContextTests implements ApplicationContextAware { 方式3
class SpringBootApplicationContextTests {

    private ApplicationContext applicationContext;// 方式2/3


    public SpringBootApplicationContextTests(ApplicationContext applicationContext) { // 方式2
        this.applicationContext = applicationContext;
    }

    //    @Autowired 方式1
//    private ApplicationContext applicationContext;
//
//
//
//    /**
//     * desc : 方式1 自动注入方式
//     * @author lizj
//     * @date 2023-08-12 23:43:16
//     * @param
//     * @return void
//     */
//    @Test
//    void test01() {
//        Class<? extends ApplicationContext> aClass = applicationContext.getClass();
//        System.out.println("方式1:"+aClass);
//    }
//

//    @Test 方式2
//    void test02() {
//        Class<? extends ApplicationContext> aClass = applicationContext.getClass();
//        System.out.println("方式2:" + aClass);
//    }


//    @Override 方式3
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//
//    }
//
//    @Test
//    void test03() {
//        System.out.println("方式3:" + applicationContext.getClass());
//    }
}
