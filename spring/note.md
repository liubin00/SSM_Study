## 常用依赖
```xml
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>

        <!--junit-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
        </dependency>
```

##注解说明
- @Autowired ：自动装配通过类型，名字
      如果@Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value=x)
- @Nullable  : 字段标记了这个注解，说明这个字段可以为null
- @Resource  : 自动装配通过名字，类型


- @Component : 组件放在类上，说明这个类被Spring管理了，就是bean!
- @Value     : 给属性赋值

- @Repository :
- @Service    :
- @Controller :
_ @Scope      :
