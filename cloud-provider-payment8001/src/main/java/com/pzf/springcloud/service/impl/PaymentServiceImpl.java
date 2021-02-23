package com.pzf.springcloud.service.impl;

import com.pzf.springcloud.dao.PaymentDao;
import com.pzf.springcloud.entities.Payment;
import com.pzf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Package: com.pzf.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 15:53
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
