package com.tcs.librarymanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.librarymanagement.domain.Book;
import com.tcs.librarymanagement.service.LibraryManagementService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	LibraryManagementService libraryManagement;
	 @GetMapping
	    public List<Book> getAllBooks() {
//	        BookController bookService = null;
			return libraryManagement.getAllBooks();
	    }

	    @GetMapping("/{id}")
	    public Optional<Book> getBookById(@PathVariable Long id) {
//	        BookController bookService = null;
			return libraryManagement.getBookById(id);
	    }

	    @PostMapping
	    public Book createBook(@RequestBody Book book) {
//	        BookController bookService = null;
			return libraryManagement.createBook(book);
	    }

	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
//	        BookController bookService = null;
			return libraryManagement.updateBook(id, book);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Long id) {
//	        BookController bookService = null;
	    	libraryManagement.deleteBook(id);
	    }
	    
	    @GetMapping("/borrowed")
	    public List<Book> getBorrowedBooks() {
//	        BookController bookService = null;
			return libraryManagement.getBorrowedBooks();
	    }

}
