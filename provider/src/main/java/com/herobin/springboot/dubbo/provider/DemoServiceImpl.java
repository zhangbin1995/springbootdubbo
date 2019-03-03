package com.herobin.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.herobin.springboot.dubbo.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by binzhang on 2019/3/2.
 */

@Component
@Service(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sendMessage(String message) {
        return "hello" + message;
    }
}
