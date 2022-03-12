package com.example.api.home.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.home.entity.BookEntity;
import com.example.api.home.service.BookService;

@RestController
@RequestMapping("/api/home")
public class ApiHomeController {

	public static Logger logger = LoggerFactory.getLogger(ApiHomeController.class);
	
	@Autowired
    BookService bookService;
	
	@GetMapping("/list")
	@ResponseBody
	public List<BookEntity> getBookList() throws Exception {
		logger.info("URL : api/home/list");
		
		List<BookEntity> listBook = bookService.getAllBook();
		
		return listBook;
	}
	
}
