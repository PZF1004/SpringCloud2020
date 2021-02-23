package com.pzf.springcloud.cofig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.pzf.springcloud.cofig
 * @ClassName: FeignConfig
 * @Author: PZF
 * @Description: Feign的日志打印功能配置
 * @Date: 2021/2/5 21:04
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; //日志级别
    }
}

