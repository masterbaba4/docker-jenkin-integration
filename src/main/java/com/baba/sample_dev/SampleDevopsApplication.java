package com.baba.sample_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDevopsApplication.class, args);
		@RestController class MasterBabaController{
			@GetMapping
			(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Baba is live now\"}";
	}
		}
		// System.out.println("Baba is live now");
	}

}
