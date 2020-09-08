package com.ph.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author penghong
 * Date 2020/8/25 10:08
 **/
@Aspect
@Component
public class LogAspect {
    /**
     * @Description: 连接点，记录购买过程
     * @Author: penghong
     * @Date: 2020/8/25 11:14
     * @param: []
     * @return: void
     **/
    @Before("execution(* com.ph.service.impl.BuyServiceImpl.buy(..))")
    public void buyBefore(JoinPoint joinPoint){
        System.out.println("joinPoint---"+joinPoint.toString());
        Object[]args=joinPoint.getArgs();
        for (Object obj:args){
            System.out.println(obj);
        }
        System.out.println("用户开始购买");
    }
    @After("execution(* com.ph.service.impl.BuyServiceImpl.buy(..))")
    public void buyAfter(){
        System.out.println("用户购买结束");
    }
}
