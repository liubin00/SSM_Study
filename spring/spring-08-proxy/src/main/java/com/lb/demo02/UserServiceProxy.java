package com.lb.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/16:17
 */
public class UserServiceProxy implements UserService {
    UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;

    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
