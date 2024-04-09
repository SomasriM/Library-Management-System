package com.tcs.librarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.librarymanagement.domain.BorrowingRecord;

public interface BorrowRepository extends JpaRepository<BorrowingRecord, Long>{
    List<BorrowingRecord> findByUser(String user);

}
