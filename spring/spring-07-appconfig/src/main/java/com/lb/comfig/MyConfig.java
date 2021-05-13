package com.lb.comfig;

import com.lb.pojo.User;
import org.springframework.context.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/15:22
 * <p>
 * 这个注解也会被spring容器托管，注册到容器中，因为他本俩就是一个@Component   @Configuration代表这是一个配置类，就和我们之前看的beans.xml是一样的
 */
@Configuration
@ComponentScan("com.lb.pojo")
@Import(MyConfig2.class)
public class MyConfig {


    //注册一个bean,就相当于我们之前写的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser() {
        //就是返回要注入到bean的对象
        return new User();
    }
}
