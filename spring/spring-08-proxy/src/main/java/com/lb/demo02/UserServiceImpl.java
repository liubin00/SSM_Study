package com.lb.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/16:14
 */
//真实对象
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
