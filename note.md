##常用依赖
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
##注解说明
###自动装配
 - @Autowired : 自动装配通过类型，名字
    - 如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier（value=“xxx”）
 - @Resource : 自动装配通过名字，类型
 - @Nullable：字段标记了这个注解，说明在这个字段可以为null
 
###Component注解
 - @Component: 组件，放到类上，说明这个类被spring管理了，就是bean！
   - dao (@Repository)
   - service (@Service)
   - controller (@Controller)

###bean作用域
 - @Scope("prototype")原型模式
 - @Scope("singleton")单例模式