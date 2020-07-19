package com.xueliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/6/8 17:49
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsurmer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsurmer80_App.class,args);
    }
}
