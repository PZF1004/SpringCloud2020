package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: NacosConfigClientMain3377
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/24 17:27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosPaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9001.class, args);
    }
}
