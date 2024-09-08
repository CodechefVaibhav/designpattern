package com.design.pattern.structural.adapter.defective.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.adapter.defective.service.PaymentDefectiveService;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class PaymentDefectiveController {

	private final PaymentDefectiveService paymentService;

	// Constructor injection
	public PaymentDefectiveController(PaymentDefectiveService paymentService) {
		this.paymentService = paymentService;
	}

	// Defective implementation: Directly using PaymentService without flexibility
	// to switch payment processors
	@GetMapping("/pay")
	public String processPayment(@RequestParam String paymentType, @RequestParam double amount) {
		return paymentService.processPayment(paymentType, amount);
	}
}