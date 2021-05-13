package com.lb.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/20:44
 * <p>
 * 使用注解方式实现aop
 */

//标注这个类是一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.lb.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.lb.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.lb.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        System.out.println("proceedingJoinPoint.getSignature() = " + proceedingJoinPoint.getSignature());
        //执行方法
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("环绕后");
    }
}
