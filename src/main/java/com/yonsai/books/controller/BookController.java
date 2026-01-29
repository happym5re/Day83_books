package com.yonsai.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 홈페이지 url 관련된 컨트롤러
 * */

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
