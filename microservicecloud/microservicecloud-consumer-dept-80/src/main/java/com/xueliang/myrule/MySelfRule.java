package com.xueliang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //return new RandomRule();//默认轮询，自定义随机
        return new RandomRule_ZY(); //自定义每个机器被访问5次
    }
}
