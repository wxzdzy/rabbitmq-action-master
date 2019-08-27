package com.zxx.messagequeue.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.zxx.messagequeue" })
public class RunMain {
    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
    }
}