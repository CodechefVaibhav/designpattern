package com.design.pattern.creational.factory.improved.service;

import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 */

@Component("paypalProcessor")
public class PayPalPaymentProcessor implements PaymentProcessor {

	@Override
	public String processPayment(double amount) {
		return "Processing PayPal payment of $" + amount;
	}
}
