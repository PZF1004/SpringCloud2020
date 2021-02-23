package com.pzf.springcloud.controller;

import com.pzf.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.pzf.springcloud.controller
 * @ClassName: SendMessageController
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/22 18:43
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;
    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}
