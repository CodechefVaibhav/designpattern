package com.design.pattern.structural.adapter.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("masterCardProcessor")
public class MasterCardProcessor implements CreditCardPaymentProcessor {

	@Override
	public String process(double amount) {
		// Simulate processing by MasterCard
		return "Payment of $" + amount + " processed via MasterCard Credit Card.";
	}
}