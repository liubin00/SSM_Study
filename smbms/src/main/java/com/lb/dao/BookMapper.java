package com.lb.dao;

import com.lb.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/12/9:59
 */
public interface BookMapper {
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
    int deleteBookById(@Param("bookId") int id);

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
    Books queryBookById(@Param("bookId") int id);

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
