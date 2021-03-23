package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: PaymentMain9004
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/24 21:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9004.class, args);
    }
}

