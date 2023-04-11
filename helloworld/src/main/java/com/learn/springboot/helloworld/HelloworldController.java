package com.learn.springboot.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello from Spring Boot";
	}

}
