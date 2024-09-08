package com.design.pattern.structural.facade.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class OrderServiceImpl implements OrderSolutionService {
	@Override
	public String createOrder() {
		// Simulate order creation logic
		return "Order created successfully.";
	}
}
