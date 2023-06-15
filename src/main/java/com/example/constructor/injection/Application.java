package com.example.constructor.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


/**
 *  @SpringBootApplication consist of following
 * 	1. @EnableAutoCOnfiguration -->
 * 	2. @ComponnetScan -->
 *  3. @Configuration -->
 * 
 * 
 *  NOte: use scanBasePackages to scan the package outside the path using comma delimiter
 */