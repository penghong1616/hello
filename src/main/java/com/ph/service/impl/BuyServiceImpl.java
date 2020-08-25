package com.ph.service.impl;

import com.ph.service.BuyService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author penghong
 * Date 2020/8/25 9:35
 **/
@Component("buyService")
public class BuyServiceImpl implements BuyService {

    @Override
    public String buy(String userId,String productName) {
        System.out.println(
                userId+"买----"+productName
        );
        return userId+"买----"+productName;
    }
}
