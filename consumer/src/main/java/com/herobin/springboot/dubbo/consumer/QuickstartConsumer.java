package com.herobin.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.herobin.springboot.dubbo.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by binzhang on 2019/3/3.
 */
@Component
public class QuickstartConsumer {

    //注意是dubbo的@Reference，意指去哪找到这个url，20880是dubbo的默认端口号
    @Reference(url = "dubbo://localhost:20880")
    DemoService demoService;

    public void sendMessage(String message){
        System.out.println(demoService.sendMessage(message));
    }

}
