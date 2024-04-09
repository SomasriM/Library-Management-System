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

import com.tcs.librarymanagement.domain.Author;
import com.tcs.librarymanagement.domain.Book;
import com.tcs.librarymanagement.service.LibraryManagementService;


@RestController
@RequestMapping("/authors")
public class AuthorController  {
	
	@Autowired
	LibraryManagementService libraryManagement;
	
	@GetMapping
    public List<Author> getAllAuthors() {
//		AuthorController authorService = null;
		return libraryManagement.getAllAuthors();
    }
	
	@GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id) {
//		AuthorController authorService = null;
		return libraryManagement.getAuthorById(id);
    }
	
	@PostMapping
    public Author createAuthor(@RequestBody Author author) {
//		AuthorController authorService = null;
		return libraryManagement.createAuthor(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {
//    	AuthorController authorService = null;
		return libraryManagement.updateAuthor(id, author);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
//    	AuthorController authorService = null;
    	libraryManagement.deleteAuthor(id);
    }
    
}
