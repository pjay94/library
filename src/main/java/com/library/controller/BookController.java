package com.library.controller;

import com.library.model.Book;
import com.library.model.Genre;
import com.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    private List<Book> books = new ArrayList<>();

    @GetMapping("/start")
    public void start(){
//        books.add(new Book("Lalka", "Prus", null, Genre.NOVEL, "Description", true));
//        books.add(new Book("Lalka2", "Prus2", null, Genre.NOVEL, "Description2", true));
//        books.add(new Book("Lalka3", "Prus3", null, Genre.NOVEL, "Description3", true));
        bookService.saveBook(new Book("Lalka3", "Prus3", null, Genre.NOVEL, "Description3", true));
        System.out.println("adasdadasda");
    }
    @GetMapping("/books")
    public List<Book> getAll(){
//        return books;
        return bookService.findAllBooks();
    }

    @PostMapping("/books/add")
    public void add(@RequestBody Book book){
//        books.add(book);
    }

    @PutMapping("/books/update")
    public void updateCompleteBook(@RequestBody Book book){
//        books.add(book);
        books.remove(books.size() - 1);
    }

    @DeleteMapping("/books/deleteAll")
    public void deleteAll(){
//        books.clear();
    }

}
