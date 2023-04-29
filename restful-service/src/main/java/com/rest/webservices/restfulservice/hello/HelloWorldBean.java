package com.rest.webservices.restfulservice.hello;

public class HelloWorldBean {

	private String message;
	private String greeting;

	public HelloWorldBean(String message, String greeting) {
		this.message = message;
		this.setGreeting(greeting);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
