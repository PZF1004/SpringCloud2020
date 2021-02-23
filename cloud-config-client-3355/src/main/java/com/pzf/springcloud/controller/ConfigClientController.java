package com.pzf.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.pzf.springcloud.controller
 * @ClassName: ConfigClientController
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/20 22:46
 */
@RestController
@RefreshScope //动态刷新
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
