package com.pzf.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.pzf.springcloud.entities.CommonResult;

/**
 * @Package: com.pzf.springcloud.handler
 * @ClassName: CustomerBlockHandler
 * @Author: PZF
 * @Description:
 * @Date: 2021/3/21 16:21
 */
//自定义限流处理类
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
