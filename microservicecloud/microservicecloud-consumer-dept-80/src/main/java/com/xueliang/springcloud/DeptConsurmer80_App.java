package com.xueliang.springcloud;

import com.xueliang.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/6/8 17:49
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsurmer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsurmer80_App.class,args);
    }
}
