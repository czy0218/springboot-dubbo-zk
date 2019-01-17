package com.czy.hello.dubbo.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by czy0218 on 2019/1/16.
 */
@SpringBootApplication
@EnableHystrix
public class HelloDubboServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserProviderApplication.class, args);
        Main.main(args);
    }
}
