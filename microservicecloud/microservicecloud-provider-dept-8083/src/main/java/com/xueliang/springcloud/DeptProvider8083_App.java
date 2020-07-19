package com.xueliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/6/8 14:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class DeptProvider8083_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8083_App.class,args);
    }
}
