package com.pzf.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Package: com.pzf.springcloud.service
 * @ClassName: PaymentFallbackService
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/6 21:00
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
