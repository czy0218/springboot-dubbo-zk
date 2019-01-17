package com.czy.hello.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.czy.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czy0218 on 2019/1/16.
 */
@RestController
public class UserController {
    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "/hi")
    public String sayHi() {
        return userService.sayHi();
    }

    @RequestMapping(value = "/hystrix")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hystrix() {
        return userService.hiHystrix();
    }

    public String hiError() {
        return "触发熔断--Hystrix";
    }

}
