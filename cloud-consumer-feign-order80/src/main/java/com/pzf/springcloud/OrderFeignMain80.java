package com.pzf.springcloud;

import cn.hutool.db.sql.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: OrderFeignMain80
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/5 20:26
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class);
    }
}
