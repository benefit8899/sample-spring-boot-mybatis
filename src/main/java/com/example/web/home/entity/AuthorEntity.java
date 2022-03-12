package com.example.web.home.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "AUTHOR")
@Data
public class AuthorEntity {
	
	@Id
    private String id;

    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @Column(name = "birth")
    private Date birth;
}
