package com.lb.diy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/20:35
 */
public class DiyPointCut {
    public void before() {
        System.out.println("======方法执行前===========");
    }

    public void after() {
        System.out.println("=========方法执行后===========");
    }
}
