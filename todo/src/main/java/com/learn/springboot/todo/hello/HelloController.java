package com.learn.springboot.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}

	@RequestMapping("/hello-html")
	@ResponseBody
	public String hellohtml() {

		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>Hello HTML</title></head><body><p>Rendering HTML</p></body></html>");
		return sb.toString();
	}

	@RequestMapping("/hello-jsp")
	public String hellojsp() {
		return "hello";
	}

}