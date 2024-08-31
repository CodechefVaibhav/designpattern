package com.design.pattern.creational.factory.defective.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaibhav.kashyap
 * */

@RestController
@RequestMapping("/defective-payments")
public class PaymentController {

	@PostMapping("/process")
	public String processPayment(@RequestParam String paymentType, @RequestParam double amount) {
		if ("credit_card".equalsIgnoreCase(paymentType)) {
			// Credit Card Payment Logic
			return "Processing credit card payment of $" + amount;
		} else if ("paypal".equalsIgnoreCase(paymentType)) {
			// PayPal Payment Logic
			return "Processing PayPal payment of $" + amount;
		} else if ("bank_transfer".equalsIgnoreCase(paymentType)) {
			// Bank Transfer Payment Logic
			return "Processing bank transfer payment of $" + amount;
		} else {
			return "Invalid payment type.";
		}
	}
}
