package org.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/*
	 * RestController combines @Controller and @ResponseBody that return data rather
	 * than a view
	 */

	@GetMapping("/")
	public String indexHelloWorld() {
		return "Greetings from Spring Boot!";
	}
}
