package com.design.pattern.structural.adapter.improved.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentAdapter {

	// Injecting map of CreditCard and Wallet payment processors directly from
	// Spring context
	private final Map<String, CreditCardPaymentProcessor> creditCardProcessors;
	private final Map<String, WalletPaymentProcessor> walletProcessors;

	// Constructor injection for Map-based implementations
	public PaymentAdapter(Map<String, CreditCardPaymentProcessor> creditCardProcessors,
			Map<String, WalletPaymentProcessor> walletProcessors) {
		this.creditCardProcessors = creditCardProcessors;
		this.walletProcessors = walletProcessors;
	}

	// Adapter method to process payment using a Map-based lookup
	public String process(String paymentType, String paymentProvider, double amount) {
		if ("CreditCard".equalsIgnoreCase(paymentType)) {
			CreditCardPaymentProcessor processor = creditCardProcessors.get(paymentProvider);
			if (processor != null) {
				return processor.process(amount);
			} else {
				return "Unsupported credit card provider!";
			}
		} else if ("Wallet".equalsIgnoreCase(paymentType)) {
			WalletPaymentProcessor processor = walletProcessors.get(paymentProvider);
			if (processor != null) {
				return processor.process(amount);
			} else {
				return "Unsupported wallet provider!";
			}
		} else {
			return "Unsupported payment type!";
		}
	}
}