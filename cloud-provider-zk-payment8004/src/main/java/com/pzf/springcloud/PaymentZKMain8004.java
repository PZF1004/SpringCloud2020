package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: PaymentMain8004
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/5 10:16
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentZKMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class,args);
    }
}
