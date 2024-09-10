package com.design.pattern.structural.adapter.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class LegacyPaymentAdapter implements PaymentImprovedProcessor {

	private final LegacyPaymentImprovedService legacyPaymentService;

	public LegacyPaymentAdapter(LegacyPaymentImprovedService legacyPaymentService) {
		this.legacyPaymentService = legacyPaymentService;
	}

	@Override
	public void processPayment(String details) {
		// Adapting the legacy method to match the interface
		legacyPaymentService.processLegacyPayment(details);
	}
}