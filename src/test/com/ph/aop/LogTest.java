package com.ph.aop;

import com.ph.service.BuyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author penghong
 * Date 2020/8/25 11:15
 **/
public class LogTest {
    @Test
    public void logBuy(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyService buyService=context.getBean("buyService",BuyService.class);
        System.out.println(buyService.buy("ph1616","城南旧事"));;
    }
}
