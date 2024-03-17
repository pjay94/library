package com.library.controller;

import com.library.model.Book;
import com.library.model.Genre;
import com.library.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    private BookRepository bookRepository;//annotation needed
    private List<Book> books = new ArrayList<>();

    @GetMapping("/start")
    public void start(){
        books.add(new Book("Lalka", "Prus", null, Genre.NOVEL, "Description", true));
        books.add(new Book("Lalka2", "Prus2", null, Genre.NOVEL, "Description2", true));
        books.add(new Book("Lalka3", "Prus3", null, Genre.NOVEL, "Description3", true));
    }
    @GetMapping("/books")
    public List<Book> getAll(){
        return books;
    }

    @PostMapping("/books/add")
    public void add(@RequestBody Book book){
        books.add(book);
    }

    @PutMapping("/books/update")
    public void updateCompleteBook(@RequestBody Book book){
        books.remove(books.size() - 1);
        books.add(book);
    }

    @DeleteMapping("/books/deleteAll")
    public void deleteAll(){
        books.clear();
    }

}
