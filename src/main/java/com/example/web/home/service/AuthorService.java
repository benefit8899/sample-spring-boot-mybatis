package com.example.web.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.web.home.dao.AuthorMapper;
import com.example.web.home.entity.AuthorEntity;

@Component
public class AuthorService {

	@Autowired
    AuthorMapper authorMapper;
	
	public List<AuthorEntity> getAllAuthor() {
		return authorMapper.getAllAuthor();
	}
	
	public AuthorEntity findAuthor(String id) {
		return authorMapper.findAuthor(id);
	}
}
