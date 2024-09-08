package com.design.pattern.structural.facade.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentService {
	public String processPayment() {
		// Simulate payment processing logic
		return "Payment processed successfully.";
	}
}
