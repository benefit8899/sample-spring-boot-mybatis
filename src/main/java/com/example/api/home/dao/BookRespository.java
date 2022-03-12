package com.example.api.home.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.home.entity.BookEntity;

public interface BookRespository extends JpaRepository<BookEntity, String>{

}
