package com.design.pattern.structural.adapter.defective.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.adapter.defective.service.LegacyPaymentDefectiveService;
import com.design.pattern.structural.adapter.defective.service.ModernPaymentDefectiveService;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class PaymentDefectiveController {

	private final LegacyPaymentDefectiveService legacyPaymentService;
	private final ModernPaymentDefectiveService modernPaymentService;

	// Constructor Injection of both services
	public PaymentDefectiveController(LegacyPaymentDefectiveService legacyPaymentService,
			ModernPaymentDefectiveService modernPaymentService) {
		this.legacyPaymentService = legacyPaymentService;
		this.modernPaymentService = modernPaymentService;
	}

	@GetMapping("/processLegacyPayment")
	public String processLegacyPayment(@RequestParam String details) {
		legacyPaymentService.processLegacyPayment(details);
		return "Legacy payment processed.";
	}

	@GetMapping("/processModernPayment")
	public String processModernPayment(@RequestParam String details) {
		modernPaymentService.processPayment(details);
		return "Modern payment processed.";
	}
}