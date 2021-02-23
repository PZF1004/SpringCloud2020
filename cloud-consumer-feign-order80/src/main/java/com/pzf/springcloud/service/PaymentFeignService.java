package com.pzf.springcloud.service;

import com.pzf.springcloud.entities.CommonResult;
import com.pzf.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package: com.pzf.springcloud.service
 * @ClassName: PaymentFeignService
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/5 20:33
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/provider/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/provider/payment/feign/timeout")
    public String paymentFeignTimeout();
}
