package com.pzf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.pzf.springcloud.com.pzf.springcloud.entities
 * @ClassName: CommonResult
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 15:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
