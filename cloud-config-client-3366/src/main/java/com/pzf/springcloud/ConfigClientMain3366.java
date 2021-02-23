package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: ConfigClientMain3366
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/21 20:22
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
    }
}
