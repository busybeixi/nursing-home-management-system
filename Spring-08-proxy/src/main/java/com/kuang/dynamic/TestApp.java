package com.kuang.dynamic;

import com.kuang.dynamic.service.HelloService;
import com.kuang.dynamic.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloService service =new HelloServiceImpl();
//        service.sayHello("张三");

        //通过反射机制执行sayHello方法。核心Method（类中的方法）
        HelloService target=new HelloServiceImpl();
        //获取sayHello名称对应的Method类对象
        Method method=HelloService.class.getMethod("sayHello", String.class);
        //通过Method可以执行sayHello方法调用
        /**
         * invoke是method类中的一个方法。表示执行方法的调用
         * 参数：
         *  1.Object：表示对象的，要执行这个对象的method方法
         *  2.Object... args，方法执行时的参数值
         */
        //表达的意思是，执行target对象的sayHello，参数是李四
        Object ret=method.invoke(target,"李四");

    }
}
