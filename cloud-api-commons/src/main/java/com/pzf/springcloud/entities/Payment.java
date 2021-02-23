package com.pzf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.pzf.springcloud
 * @ClassName: Payment
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/3 15:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial; //序列号
}
