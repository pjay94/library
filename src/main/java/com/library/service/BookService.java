package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public long count() {
        return bookRepository.count();
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findBooksByAvailability(boolean availability){
        return bookRepository.findByAvailability(availability);
    }

    public List<Book> findBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public List<Book> findAvailableBookByTitle(String title){
        return bookRepository.findByAvailabilityAndTitle(true, title);
    }

    public List<Book> findByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

}