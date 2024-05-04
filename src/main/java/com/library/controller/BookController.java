package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/books")
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
        return bookService.findAvailableBooks(true);
    }

    @GetMapping("/books/unavailable")
    public List<Book> getUnavailableBooks(){
        return bookService.findAvailableBooks(false);
    }

    @GetMapping("/books/availableTitle")
    public List<Book> findAvailableBookByTitle(@RequestParam(value = "title")/*not needed*/ String title){
        return bookService.findAvailableBookByTitle(title);
    }

    @GetMapping("/books/search")
    public List<Book> findBookByTitle(@RequestParam String title){
        return bookService.findBookByTitle(title);
    }

    @GetMapping("/books/isbn")
    public List<Book> findByIsbn(@RequestParam String isbn){
        return bookService.findBookByIsbn(isbn);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @DeleteMapping("/books")
    public void deleteBook(@RequestBody Book book){
        bookService.deleteBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }

    @DeleteMapping("/books/title")
    public void deleteBookByTitle(@RequestParam(value = "title") String title){
        bookService.deleteBookByTitle(title);
    }
}
