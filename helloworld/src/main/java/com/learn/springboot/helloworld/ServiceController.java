package com.learn.springboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Autowired
	private ServiceConfiguration configuration;

	@RequestMapping("/serviceconfiguration")
	public ServiceConfiguration serviceconfiguration() {
		return configuration;
	}

}
