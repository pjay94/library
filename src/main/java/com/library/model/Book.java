package com.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private Date publishingDate;
    private Genre genre;
    private String description;
    private boolean availability;

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
}
