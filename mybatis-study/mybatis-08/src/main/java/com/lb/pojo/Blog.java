package com.lb.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/14/23:02
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;


    //属性名跟字段名不一致

    private Date createTime;
    private int views;
}
