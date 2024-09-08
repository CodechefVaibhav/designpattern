package com.design.pattern.structural.adapter.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("payPalProcessor")
public class PayPalProcessor implements WalletPaymentProcessor {

	@Override
	public String process(double amount) {
		// Simulate processing by PayPal
		return "Payment of $" + amount + " processed via PayPal Wallet.";
	}
}