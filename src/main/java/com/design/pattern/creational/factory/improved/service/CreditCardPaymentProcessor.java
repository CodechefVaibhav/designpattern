package com.design.pattern.creational.factory.improved.service;

import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 */

@Component("creditCardProcessor")
public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public String processPayment(double amount) {
		return "Processing credit card payment of $" + amount;
	}
}
