package com.tcs.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.librarymanagement.domain.BorrowingRecord;
import com.tcs.librarymanagement.service.LibraryManagementService;

@RestController
	@RequestMapping("/borrowing-records")
	public class BorrowingRecordController {
	
	
	@Autowired
	LibraryManagementService libraryManagement;

	  

	    @PostMapping
	    public BorrowingRecord addBorrowingRecord(@RequestBody BorrowingRecord record) {
	        return libraryManagement.saveBorrowingRecord(record);
	    }

	    @GetMapping("/user/{user}")
	    public List<BorrowingRecord> getBorrowingRecordsByUser(@PathVariable String user) {
	        return libraryManagement.getBorrowingRecordsByUser(user);
	    }
}
