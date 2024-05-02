package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/count")
    public long count(){
        return bookService.count();
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/books/available")
    public List<Book> getAvailableBooks(){
        return bookService.findBooksByAvailability(true);
    }

    @GetMapping("/books/unavailable")
    public List<Book> getUnavailableBooks(){
        return bookService.findBooksByAvailability(false);
    }

    @GetMapping("/books/title")
    public List<Book> findBookByTitle(@RequestParam String title){
        return bookService.findBookByTitle(title);
    }

    @GetMapping("/books/availableTitle")
    public List<Book> findAvailableBookByTitle(@RequestParam(value = "title") String title){
        return bookService.findAvailableBookByTitle(title);
    }

    @GetMapping("/books/isbn")
    public List<Book> findByIsbn(@RequestParam String isbn){
        return bookService.findByIsbn(isbn);
    }

}
