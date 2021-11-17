package com.example.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		boolean b = Boolean.valueOf("true1");
		System.out.println(b);
		SpringApplication.run(TestingApplication.class, args);
	}

}
