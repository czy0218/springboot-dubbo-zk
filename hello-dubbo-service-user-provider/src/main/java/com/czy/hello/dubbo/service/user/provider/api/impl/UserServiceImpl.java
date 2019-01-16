package com.czy.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.czy.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by czy0218 on 2019/1/16.
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "Hello Dubbo port=" + port;
    }
}
