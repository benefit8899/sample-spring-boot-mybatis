package com.example.api.home.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BOOK")
@Data
public class BookEntity {
	
	@Id
    private String id;

    @Column(name = "book_name", length = 128, nullable = false)
    private String name;

    @Column(name = "author_name", length = 128, nullable = false)
    private String author;
}
