package com.tcs.librarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.librarymanagement.domain.Author;
import com.tcs.librarymanagement.domain.Book;
import com.tcs.librarymanagement.domain.BookStatus;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(Author author);
    List<Book> findByStatus(BookStatus status);
}
