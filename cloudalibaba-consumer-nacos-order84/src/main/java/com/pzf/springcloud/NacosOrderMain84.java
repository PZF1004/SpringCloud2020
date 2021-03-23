package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zzyy
 * @create 2020-02-25 16:04
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class NacosOrderMain84
{
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain84.class, args);
    }
}
