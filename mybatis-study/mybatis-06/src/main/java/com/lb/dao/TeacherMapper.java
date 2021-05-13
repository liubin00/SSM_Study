package com.lb.dao;

import com.lb.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/12/23:54
 */
public interface TeacherMapper {
    List<Teacher> getAllTeacher();

    //获取指定老师下的所有学生及老师的信息

    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
