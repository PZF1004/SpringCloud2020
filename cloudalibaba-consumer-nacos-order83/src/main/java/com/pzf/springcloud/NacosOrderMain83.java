package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: OrderNacosMain83
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/24 21:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain83.class, args);
    }
}
