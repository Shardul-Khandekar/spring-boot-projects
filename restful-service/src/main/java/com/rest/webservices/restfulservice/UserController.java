package com.rest.webservices.restfulservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.restfulservice.entity.User;
import com.rest.webservices.restfulservice.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

//	@PostMapping("/users/add")
//	public String addUser(@RequestParam String name, @RequestParam String email) {
//
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		userRepository.save(user);
//
//		return "User Added!";
//	}

	@PostMapping("/users/add")
	public String addUser(@RequestBody User user) {

		userRepository.save(user);

		return "User Added!";
	}

	@GetMapping("/users/all")
	public Iterable<User> getAllUsers() {

		return userRepository.findAll();
	}

	@GetMapping("/users")
	public Optional<User> getUserDetails(@RequestParam Integer id) {

		return userRepository.findById(id);

	}

}
