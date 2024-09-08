package com.design.pattern.structural.adapter.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("visaProcessor")
public class VisaProcessor implements CreditCardPaymentProcessor {

	@Override
	public String process(double amount) {
		// Simulate processing by VISA
		return "Payment of $" + amount + " processed via VISA Credit Card.";
	}
}