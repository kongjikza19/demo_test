package com.example.demo_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}
	
	@GetMapping
	public String getName() {
		return "Kong demo";
	}

}
