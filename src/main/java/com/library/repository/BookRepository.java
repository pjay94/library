package com.library.repository;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    long count();

    @Override
    List<Book> findAll();

    List<Book> findByAvailability(boolean availability);

    List<Book> findByTitle(String title);

    List<Book> findByAvailabilityAndTitle(boolean availability, String title);

    List<Book> findByIsbn(String isbn);

//    List<Book>
}
