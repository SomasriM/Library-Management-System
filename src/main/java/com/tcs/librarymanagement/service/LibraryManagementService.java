package com.tcs.librarymanagement.service;

import java.util.List;
import java.util.Optional;

import com.tcs.librarymanagement.domain.Author;
import com.tcs.librarymanagement.domain.Book;
import com.tcs.librarymanagement.domain.BorrowingRecord;

public interface LibraryManagementService {

	BorrowingRecord saveBorrowingRecord(BorrowingRecord record);

	List<BorrowingRecord> getBorrowingRecordsByUser(String user);

	List<Author> getAllAuthors();

	Optional<Author> getAuthorById(Long id);

	Author createAuthor(Author author);

	Author updateAuthor(Long id, Author author);

	void deleteAuthor(Long id);

	List<Book> getAllBooks();

	Optional<Book> getBookById(Long id);

	Book createBook(Book book);

	Book updateBook(Long id, Book book);

	void deleteBook(Long id);

	List<Book> getBorrowedBooks();

}
