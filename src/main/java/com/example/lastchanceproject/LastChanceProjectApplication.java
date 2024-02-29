package com.example.lastchanceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LastChanceProjectApplication {

//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/amanhamdan/last-chance.git
//	git push -u origin main

	public String hello(){
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(LastChanceProjectApplication.class, args);
	}

}
