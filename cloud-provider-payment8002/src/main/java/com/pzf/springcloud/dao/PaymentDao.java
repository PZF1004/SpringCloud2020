package com.pzf.springcloud.dao;

import com.pzf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.pzf.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 14:56
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
