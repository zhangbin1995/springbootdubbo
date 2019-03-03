package com.herobin.springboot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.herobin.springboot.dubbo.consumer.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {

		//获取容器的上下文对象
		ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);

		//注解形式里注解的默认名称是类名的首字母小写
		QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");

		quickstartConsumer.sendMessage("herobin");

	}

}
