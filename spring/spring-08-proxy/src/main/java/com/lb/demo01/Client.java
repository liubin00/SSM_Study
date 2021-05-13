package com.lb.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/15:58
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        //代理，中介帮房东组房子，但是呢,代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(new Host());

        //你不用面对房东直接找中介租房即可
        proxy.rent();
    }
}
