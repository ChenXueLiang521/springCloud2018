package com.xueliang.springcloud.controller;

import com.xueliang.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/6/8 17:35
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8081";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public Boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }
}

