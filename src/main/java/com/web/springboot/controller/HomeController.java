package com.web.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class HomeController {

	@GetMapping("/")
	public String get()
	{
		return "Hi, your Spring boot app is in live";
	}
	
	@GetMapping("/render")
	public String onrender()
	{
		return "Your project is live on render.com";
	}
	
	
}
