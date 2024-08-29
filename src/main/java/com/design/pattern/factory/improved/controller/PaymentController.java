package com.design.pattern.factory.improved.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.factory.improved.service.PaymentProcessor;
import com.design.pattern.factory.improved.service.PaymentProcessorFactory;

/**
 * @author vaibhav.kashyap
 */

@RestController("ImprovedPaymentController")
@RequestMapping("/payments")
public class PaymentController {

	private final PaymentProcessorFactory paymentProcessorFactory;

	// Constructor injection of the factory
	public PaymentController(PaymentProcessorFactory paymentProcessorFactory) {
		this.paymentProcessorFactory = paymentProcessorFactory;
	}

	@PostMapping("/process")
	public String processPayment(@RequestParam String paymentType, @RequestParam double amount) {
		PaymentProcessor processor = paymentProcessorFactory.createPaymentProcessor(paymentType);
		return processor.processPayment(amount);
	}
}
