package com.lb.controller;

import com.lb.pojo.Books;
import com.lb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/12/10:49
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service 层

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回到一个书籍的展示页面

    @RequestMapping("/allBook")
    public String lsit(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    //跳转到增加书籍的页面

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍的请求

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("books = " + books);
        bookService.addBook(books);
        //重定向到我们的这个@Request("/allBook")请求:
        return "redirect:/book/allBook";
    }

    //跳转到修改页面,带本书过去

    @RequestMapping("/toUpdate")
    public String toUpdatePager(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks", books);
        return "updateBook";
    }

    //修改书籍

    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=》" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        List<Books> list = bookService.queryBookByName(queryBookName);
        if (list.size() == 0) {
            List<Books> books = bookService.queryAllBook();
            model.addAttribute("list", books);
        } else {
            model.addAttribute("list", list);
        }
        return "allBook";

    }
}
