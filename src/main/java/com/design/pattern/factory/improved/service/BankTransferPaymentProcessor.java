package com.design.pattern.factory.improved.service;

/**
 * @author vaibhav.kashyap
 * */

import org.springframework.stereotype.Component;

@Component("bankTransferProcessor")
public class BankTransferPaymentProcessor implements PaymentProcessor {

	@Override
	public String processPayment(double amount) {
		return "Processing bank transfer payment of $" + amount;
	}
}
