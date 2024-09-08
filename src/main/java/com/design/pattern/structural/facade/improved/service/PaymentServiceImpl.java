package com.design.pattern.structural.facade.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentServiceImpl implements PaymentSolutionService {
	@Override
	public String processPayment() {
		// Simulate payment processing logic
		return "Payment processed successfully.";
	}
}