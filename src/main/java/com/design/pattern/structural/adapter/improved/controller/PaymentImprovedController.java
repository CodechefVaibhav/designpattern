package com.design.pattern.structural.adapter.improved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.adapter.improved.service.PaymentImprovedProcessor;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class PaymentImprovedController {

	private final PaymentImprovedProcessor paymentProcessor;

	// Constructor Injection of the payment processor (could be any implementation)
	public PaymentImprovedController(PaymentImprovedProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	@GetMapping("/processPayment")
	public String processPayment(@RequestParam String details) {
		paymentProcessor.processPayment(details);
		return "Payment processed.";
	}
}