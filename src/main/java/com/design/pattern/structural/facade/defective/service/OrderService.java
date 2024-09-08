package com.design.pattern.structural.facade.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class OrderService {
	public String createOrder() {
		// Simulate order creation logic
		return "Order created successfully.";
	}
}
