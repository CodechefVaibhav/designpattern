package com.design.pattern.structural.adapter.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentDefectiveService {

	// Defective implementation: Hardcoded payment logic
	public String processPayment(String paymentType, double amount) {
		if ("CreditCard".equalsIgnoreCase(paymentType)) {
			return "Payment of $" + amount + " processed via VISA Credit Card.";
		} else if ("Wallet".equalsIgnoreCase(paymentType)) {
			return "Payment of $" + amount + " processed via Venmo Wallet.";
		} else {
			return "Unsupported payment type!";
		}
	}
}