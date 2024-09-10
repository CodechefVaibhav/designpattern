package com.design.pattern.structural.adapter.defective.service;

/**
 * @author vaibhav.kashyap
 */

public class LegacyPaymentDefectiveService {
	public void processLegacyPayment(String details) {
		System.out.println("Processing payment using the legacy system: " + details);
	}
}
