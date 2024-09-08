package com.design.pattern.structural.adapter.improved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.adapter.improved.service.PaymentAdapter;

/**
 * @author vaibhav.kashyap
 * */

@RestController
public class PaymentImprovedController {

	private final PaymentAdapter paymentAdapter;

	// Constructor injection with Adapter
	public PaymentImprovedController(PaymentAdapter paymentAdapter) {
		this.paymentAdapter = paymentAdapter;
	}

	// Endpoint for processing payments
	@GetMapping("/pay")
	public String processPayment(@RequestParam String paymentType, @RequestParam String paymentProvider,
			@RequestParam double amount) {
		return paymentAdapter.process(paymentType, paymentProvider, amount);
	}
}