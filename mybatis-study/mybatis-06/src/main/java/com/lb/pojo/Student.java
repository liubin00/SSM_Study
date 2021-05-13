package com.lb.pojo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/11/18:24
 */
@Data
public class Student {
    private int id;
    private String name;
    /**
     * 学生需要关联一个老师
     */
    private int tid;
}
