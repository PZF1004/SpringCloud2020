package com.pzf.springcloud.service;

import com.pzf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.pzf.springcloud.service
 * @ClassName: PaymentService
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 15:53
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
