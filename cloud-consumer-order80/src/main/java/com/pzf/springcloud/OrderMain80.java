package com.pzf.springcloud;

import com.pzf.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: OrderConsulMain80
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 16:50
 */
@SpringBootApplication
@EnableEurekaClient
// @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
