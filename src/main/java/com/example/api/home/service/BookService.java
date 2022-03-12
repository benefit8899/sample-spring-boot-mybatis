package com.example.api.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api.home.dao.BookRespository;
import com.example.api.home.entity.BookEntity;

@Component
public class BookService {

	@Autowired
    BookRespository bookRes;
	
	public List<BookEntity> getAllBook() {
		return bookRes.findAll();
	}
	
	public BookEntity findBook(String id) {
		return bookRes.findById(id).get();
	}
}
