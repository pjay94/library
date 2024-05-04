package com.library.service;

import com.library.model.Book;
import com.library.model.Genre;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    public List<Book> findAvailableBooks(boolean availability){
        return bookRepository.findByAvailability(availability);
    }

    public List<Book> findBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public List<Book> findAvailableBookByTitle(String title){
        return bookRepository.findByAvailabilityAndTitle(true, title);
    }

    public List<Book> findBookByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    public Book saveBook(Book entity){
        return bookRepository.save(entity);
    }

    public void deleteBook(Book entity){
        bookRepository.delete(entity);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }

    @Transactional
    public void deleteBookByTitle(String title){
        bookRepository.deleteByTitle(title);
    }

    public Book updateBook(Long id, Book bookFromRequest) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found."));
        String title = bookFromRequest.getTitle();
        if (title != null) book.setTitle(title);
        String author = bookFromRequest.getAuthor();
        if (author != null) book.setAuthor(author);
        Date publishingDate = bookFromRequest.getPublishingDate();
        if (publishingDate != null) book.setPublishingDate(publishingDate);
        Genre genre = bookFromRequest.getGenre();
        if (genre != null) book.setGenre(genre);
        String description = bookFromRequest.getDescription();
        if (description != null) book.setDescription(description);
        book.setAvailability(bookFromRequest.isAvailability());

        return bookRepository.save(book);
    }
}