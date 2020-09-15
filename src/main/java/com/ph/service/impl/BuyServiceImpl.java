package com.ph.service.impl;

import com.ph.aspect.LogAspect;
import com.ph.service.BuyService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author penghong
 * Date 2020/8/25 9:35
 **/
@Component("buyService")
public class BuyServiceImpl implements BuyService {
    LogAspect logAspect;

    @Override
    public String buy(String userId,String productName) {
        return userId+"买----"+productName;
    }
}
