package com.example.springdemo;

import com.example.springdemo.bean.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean
    public A registerA(){
        log.info("-----A注册-----");
        return new A();
    }

    @Bean
    public B registerB(){
        log.info("-----B注册-----");
        return new B();
    }

    @Bean
    public E registerE(){
        log.info("-----E注册-----");
        return new E();
    }
}
