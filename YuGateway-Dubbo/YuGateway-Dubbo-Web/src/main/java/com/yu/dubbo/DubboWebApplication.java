package com.yu.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yu.dubbo")
@EnableDubbo
public class DubboWebApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(DubboWebApplication.class, args);
    }
}
