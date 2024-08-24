package com.design.pattern.singleton.defective.service;

import java.util.*;

/**
 * @author vaibhav.kashyap
 */

public class UserService {

	private Map<String, List<String>> users = new HashMap<>();
	private int counter = 0;

	public UserService() {
		// Simulate some initial data
		users.put("Alice", Arrays.asList("Admin", "User"));
		users.put("Bob", Arrays.asList("User"));
	}

	public Map<String, List<String>> getAllUsers() {
		return users;
	}

	public void addUser(String name, List<String> roles) {
		users.put(name, roles);
	}

	public String getWelcomeMessage() {
		counter++;
		return "Welcome! You have accessed this service " + counter + " times.";
	}
}
