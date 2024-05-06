package com.library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Date publishingDate;
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
    private String description;
    private boolean availability;
    private String isbn;

    public Book(String title, String author, Date publishingDate, Genre genre, String description, boolean availability) {
        this.title = title;
        this.author = author;
        this.publishingDate = publishingDate;
        this.genre = genre;
        this.description = description;
        this.availability = availability;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
