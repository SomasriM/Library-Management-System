package com.tcs.librarymanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.librarymanagement.domain.Author;
import com.tcs.librarymanagement.domain.Book;
import com.tcs.librarymanagement.domain.BorrowingRecord;
import com.tcs.librarymanagement.repository.AuthorRepository;
import com.tcs.librarymanagement.repository.BookRepository;
import com.tcs.librarymanagement.repository.BorrowRepository;

public class LibraryManagementServiceImpl implements LibraryManagementService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
    @Autowired
    private BorrowRepository borrowingRecordRepository;
	
	@Override
	public BorrowingRecord saveBorrowingRecord(BorrowingRecord record) {
		return borrowingRecordRepository.save(record);
	}

	@Override
	public List<BorrowingRecord> getBorrowingRecordsByUser(String user) {
		return borrowingRecordRepository.findByUser(user);
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Author> getAuthorById(Long id) {
		return Optional.of(authorRepository.findById(id).orElse(null));
	}

	@Override
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public Author updateAuthor(Long id, Author author) {
		return authorRepository.save(author);
	}

	@Override
	public void deleteAuthor(Long id) {
		authorRepository.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
	}

	@Override
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Long id, Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public List<Book> getBorrowedBooks() {
//		return borrowingRecordRepository.findByUser(null)
		return null;
	}

}
