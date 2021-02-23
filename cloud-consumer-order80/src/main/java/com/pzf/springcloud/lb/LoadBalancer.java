package com.pzf.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Package: com.pzf.springcloud.lb
 * @ClassName: LoadBalancer
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 17:26
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
