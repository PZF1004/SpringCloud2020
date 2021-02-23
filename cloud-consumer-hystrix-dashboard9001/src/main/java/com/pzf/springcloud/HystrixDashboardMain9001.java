package com.pzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: HystrixDashboardMain9001
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/12 21:40
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class);
    }
}
