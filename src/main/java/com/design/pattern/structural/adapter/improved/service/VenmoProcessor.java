package com.design.pattern.structural.adapter.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("venmoProcessor")
public class VenmoProcessor implements WalletPaymentProcessor {

	@Override
	public String process(double amount) {
		// Simulate processing by Venmo
		return "Payment of $" + amount + " processed via Venmo Wallet.";
	}
}