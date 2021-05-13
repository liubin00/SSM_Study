package com.lb.pojo;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/11/18:25
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
