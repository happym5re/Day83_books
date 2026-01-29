package com.yonsai.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonsai.books.entity.Book;
import com.yonsai.books.repository.BookRepository;

import lombok.RequiredArgsConstructor;

/**
 * 홈페이지 url 관련된 컨트롤러
 * */

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
	
	private final BookRepository bookRepo;


	@GetMapping
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}

	
	
	
	
	
//	@GetMapping("/add")
//	public String add() {
//		
//		return "";
//	}
//	
//	@GetMapping("/update")
//	public String update() {
//		
//		return "";
//	}
//	
//	@GetMapping("/select")
//	public String select() {
//		
//		return "";
//	}

	
}
