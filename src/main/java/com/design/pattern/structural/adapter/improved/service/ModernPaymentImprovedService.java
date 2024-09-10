package com.design.pattern.structural.adapter.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class ModernPaymentImprovedService implements PaymentImprovedProcessor {

	@Override
	public void processPayment(String details) {
		System.out.println("Processing payment using the modern system: " + details);
	}
}
