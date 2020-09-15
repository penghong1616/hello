package com.ph.service;

import com.ph.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author penghong
 * Date 2020/9/10 16:10
 **/
public class HelloServiceTest {
    @Test
    public void say(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Object object=context.getBean("helloFactoryBean");
        System.out.println(object.toString());
    }
}
