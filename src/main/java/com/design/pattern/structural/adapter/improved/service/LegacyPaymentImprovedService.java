package com.design.pattern.structural.adapter.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class LegacyPaymentImprovedService {
	public void processLegacyPayment(String details) {
		System.out.println("Processing payment using the legacy system: " + details);
	}
}