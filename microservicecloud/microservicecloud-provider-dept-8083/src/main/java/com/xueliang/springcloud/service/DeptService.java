package com.xueliang.springcloud.service;

import com.xueliang.springcloud.entities.Dept;

import java.util.List;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/6/8 14:12
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
