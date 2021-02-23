package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: PaymentMain8001
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 14:53
 */
@SpringBootApplication
@EnableEurekaClient
// @EnableDiscoveryClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
