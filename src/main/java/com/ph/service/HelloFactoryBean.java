package com.ph.service;

import com.ph.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description
 * @Author penghong
 * Date 2020/9/10 16:06
 **/
public class HelloFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user=new User();
        user.setId(1);
        user.setName("ph");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
