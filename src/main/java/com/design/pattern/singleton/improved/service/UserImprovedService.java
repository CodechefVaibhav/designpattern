package com.design.pattern.singleton.improved.service;

import java.util.*;

/**
 * @author vaibhav.kashyap
 */

public class UserImprovedService {

	// Volatile keyword ensures visibility across threads
	private static volatile UserImprovedService instance;
	private Map<String, List<String>> users = new HashMap<>();
	private static volatile int counter = 0;

	// Private constructor to prevent instantiation
	private UserImprovedService() {
		// Simulate some initial data
		users.put("Alice", Arrays.asList("Admin", "User"));
		users.put("Bob", Arrays.asList("User"));
	}

	// Global access point for the singleton instance
	public static UserImprovedService getInstance() {
		if (instance == null) {
			synchronized (UserImprovedService.class) {
				if (instance == null) {
					instance = new UserImprovedService();
				}
			}
		}
		return instance;
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
