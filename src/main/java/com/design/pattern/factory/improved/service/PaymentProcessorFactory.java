package com.design.pattern.factory.improved.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 */

@Component
public class PaymentProcessorFactory {

	private final ApplicationContext applicationContext;

	// Inject the ApplicationContext
	public PaymentProcessorFactory(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public PaymentProcessor createPaymentProcessor(String paymentType) {
		switch (paymentType.toLowerCase()) {
		case "credit_card":
			return (PaymentProcessor) applicationContext.getBean("creditCardProcessor");
		case "paypal":
			return (PaymentProcessor) applicationContext.getBean("paypalProcessor");
		case "bank_transfer":
			return (PaymentProcessor) applicationContext.getBean("bankTransferProcessor");
		default:
			throw new IllegalArgumentException("Invalid payment type: " + paymentType);
		}
	}
}
