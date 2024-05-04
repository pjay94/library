package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}

/*
INSERT INTO books (id, title, author, publishing_date, genre, description, availability, isbn)

VALUES
		(1, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 1, 'A novel of the Jazz Age', TRUE, '9780743273565'),
(2, '1984', 'George Orwell', '1949-06-08', 1, 'A dystopian novel', TRUE, '9780451524935'),
		(3, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 1, 'A novel that explores racial injustice', FALSE, '9780060935467'),
		(4, 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 1, 'A novel of manners', FALSE, '9780141037014'),
		(5, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 1, 'A novel that explores the disillusionment of youth', TRUE, '9780316769174'),
		(6, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 1, 'A fantasy novel', FALSE, '9780007449736'),
		(7, 'The Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 1, 'A fantasy epic', TRUE, '9780007139609'),
		(8, 'The Da Vinci Code', 'Dan Brown', '2003-05-14', 1, 'A thriller novel', TRUE, '9780307474278'),
		(9, 'The Girl with the Dragon Tattoo', 'Stieg Larsson', '2005-09-12', 1, 'A crime novel', TRUE, '9780385609083'),
		(10, 'Harry Potter and the Philosophers Stone', 'J.K. Rowling', '1997-06-26', 1, 'A fantasy novel', FALSE, '9780747532699');
*/