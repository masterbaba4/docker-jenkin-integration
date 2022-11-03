package com.baba.sample_dev;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MasterBabaController {
    @GetMapping
(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Baba is live now\"}";
	}
}


