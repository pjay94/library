package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
//
////    @GetMapping("/start")
//    public void blabla(){
//        System.out.println("test");
//    }
//
    @GetMapping("/books/count")
    public long count(){
        return bookService.count();
    }

    @GetMapping("/books/getAll")
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

}
