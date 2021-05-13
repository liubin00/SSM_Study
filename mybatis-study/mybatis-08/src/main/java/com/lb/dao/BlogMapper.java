package com.lb.dao;

import com.lb.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/14/23:05
 */
public interface BlogMapper {
    int addBook(Blog blog);

    List<Blog> queryBlogIF(Map map);


    List<Blog> queryBlogChoosee(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}
