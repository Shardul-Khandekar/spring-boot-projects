package com.rest.webservices.restfulservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello, World!";
	}

	@GetMapping("/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World from Spring Bean", "How you doing?");
	}
	
	@GetMapping("/helloworldcustom/{name}")
	public HelloWorldBean helloWorldCustom(@PathVariable String name) {
		return new HelloWorldBean(name, "How you doing?");
	}

}
