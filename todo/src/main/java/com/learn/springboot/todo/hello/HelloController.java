package com.learn.springboot.todo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	@RequestMapping("/hello-html")
	public String hellohtml() {

		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>Hello HTML</title></head><body><p>Rendering HTML</p></body></html>");
		return sb.toString();
	}
}
