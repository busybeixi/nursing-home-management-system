package com.kuang.dynamic.service.impl;

import com.kuang.dynamic.service.HelloService;

public class HelloServiceImpl implements HelloService {

    public void sayHello(String name) {
        System.out.println("你好： " + name);
    }
}
