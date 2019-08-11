package com.tom.base;

import entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;

/**
 * @CLASSNAME BaseApplication
 * @Description
 * @Author miaomiaole
 * @Date 2019/08/08/17:57
 * Version 1.0
 **/
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }

    //将idwork放入spring容器

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
