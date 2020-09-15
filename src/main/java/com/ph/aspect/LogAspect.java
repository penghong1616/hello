package com.ph.aspect;

import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author penghong
 * Date 2020/8/25 10:08
 **/
@Aspect
@Component
public class LogAspect {
    private static Logger log= LoggerFactory.getLogger(LogAspect.class);
    /**
     * @Description: 连接点，记录购买过程
     * @Author: penghong
     * @Date: 2020/8/25 11:14
     * @param: []
     * @return: void
     **/
    @Before("execution(* com.ph.service.impl.BuyServiceImpl.buy(..))")
    public void buyBefore(JoinPoint joinPoint){
        log.info("前置通知:{}",joinPoint);
        Object[]args=joinPoint.getArgs();
        log.info("用户:{}购买<<{}>>",args[0],args[1]);
    }
    @After("execution(* com.ph.service.impl.BuyServiceImpl.buy(..))")
    public void buyAfter(JoinPoint joinPoint){
        Object[]args=joinPoint.getArgs();
        log.info("用户:{}购买结束",args[0]);
    }
}
