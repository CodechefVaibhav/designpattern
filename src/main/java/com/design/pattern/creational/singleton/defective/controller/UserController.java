package com.design.pattern.creational.singleton.defective.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.singleton.defective.service.UserService;

/**
 * @author vaibhav.kashyap
 */

@RestController("UserDefectiveController")
@RequestMapping("/defective/users")
public class UserController {

	// This constructor re-instantiates UserService every time the controller is
	// created.
	private final UserService userService = new UserService();

	// Re-creating the UserService on each call simulates the issue
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
