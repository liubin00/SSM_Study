package com.lb.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/20:18
 */
public class Log implements MethodBeforeAdvice {

    /**
     * @param method  要执行的目标对象的方法
     * @param objects 参数
     * @param o       目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
