package com.example.web.home.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.home.entity.AuthorEntity;
import com.example.web.home.service.AuthorService;

@Controller
public class HomeController {

	public static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    AuthorService authorService;
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView getHomePage() throws Exception {
		logger.info("Home page");
		
		ModelAndView mnv = new ModelAndView("home/home");
		List<AuthorEntity> list = authorService.getAllAuthor();
		mnv.addObject("listAuthor", list);
		return mnv;
	}
	
}
