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
//
//    public void saveBook(Book book){
//        bookRepository.save(book);
//    }
//

}