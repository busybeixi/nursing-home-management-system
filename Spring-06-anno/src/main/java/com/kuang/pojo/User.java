package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.kuang.pojo.User"/>
@Component
public class User {

    //相当于<bean id="user" class="com.kuang.pojo.User">
    //<property name="name" value="秦疆"/>
    //</bean>
    @Value("秦疆")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}
