package com.design.pattern.creational.singleton.improved.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.singleton.improved.service.UserImprovedService;

/**
 * @author vaibhav.kashyap
 */

@RestController("UserImprovedController")
@RequestMapping("/improved/users")
public class UserController {

	private final UserImprovedService userService;

	// Constructor injection of the manually managed singleton service
	public UserController() {
		this.userService = UserImprovedService.getInstance(); // Correct approach
	}

	@GetMapping("/all")
	public Map<String, List<String>> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/add")
	public String addUser(@RequestParam String name, @RequestParam List<String> roles) {
		userService.addUser(name, roles);
		return "User added.";
	}

	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return userService.getWelcomeMessage();
	}
}
