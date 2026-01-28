package com.yonsai.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/")
	public String main() {
		
		return "";
	}
	
	@GetMapping("/add")
	public String add() {
		
		return "";
	}
	
	@GetMapping("/update")
	public String update() {
		
		return "";
	}
	
	@GetMapping("/select")
	public String select() {
		
		return "";
	}

	
}
