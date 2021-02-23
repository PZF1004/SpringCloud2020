package com.pzf.springcloud.service.impl;

import com.pzf.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Package: com.pzf.springcloud.service.impl
 * @ClassName: MessageProviderImpl
 * @Author: PZF
 * @Description:
 * @Date: 2021/2/22 18:41
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息发送管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}
