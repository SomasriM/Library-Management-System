package com.tcs.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.librarymanagement.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
