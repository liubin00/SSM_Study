package com.lb.service;

import com.lb.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/12/10:11
 */
public interface BookService {
    /**
     * 增加一本书
     *
     * @param books
     * @return
     */
    int addBook(Books books);

    /**
     * 删除一本书
     *
     * @param id
     * @return
     */
    int deleteBookById(int id);

    /**
     * 修改一本书
     *
     * @param books
     * @return
     */
    int updateBook(Books books);

    /**
     * 查询一本书
     *
     * @param id
     * @return
     */
    Books queryBookById(int id);

    /**
     * 查询全部书
     *
     * @return
     */
    List<Books> queryAllBook();

    /**
     * 通过书名查书籍
     *
     * @param bookName
     * @return
     */
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
