package com.example.web.home.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.web.home.entity.AuthorEntity;

@Repository
@Mapper
public interface AuthorMapper {
	List<AuthorEntity> getAllAuthor();
	AuthorEntity findAuthor(String id);
}
