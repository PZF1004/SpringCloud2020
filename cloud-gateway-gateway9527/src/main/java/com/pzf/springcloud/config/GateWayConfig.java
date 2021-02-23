package com.pzf.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.pzf.springcloud.config
 * @ClassName: GateWayConfig
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/13 20:17
 */
@Configuration
public class GateWayConfig {
    /**
     * 配置了一个id为route-pzf的路由规则，
     * 当访问地址为 http://localhost:9527/guonei时就会自动转发到地址 http://news.baidu.com/guonei
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("route-pzf",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("route-pzf2",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }


}
