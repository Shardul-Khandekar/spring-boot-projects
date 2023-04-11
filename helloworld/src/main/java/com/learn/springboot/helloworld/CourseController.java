package com.learn.springboot.helloworld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/listcourses")
	public List<Course> retrieveCourses() {

		return Arrays.asList(new Course(1, "GCP"), new Course(2, "DevOps"));
	}

}
