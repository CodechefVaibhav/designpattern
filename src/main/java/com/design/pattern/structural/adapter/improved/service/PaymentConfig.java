package com.design.pattern.structural.adapter.improved.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vaibhav.kashyap
 */

@Configuration
public class PaymentConfig {

	@Bean
	public LegacyPaymentImprovedService legacyPaymentService() {
		return new LegacyPaymentImprovedService();
	}

	@Bean
	public ModernPaymentImprovedService modernPaymentService() {
		return new ModernPaymentImprovedService();
	}

	@Bean
	public PaymentImprovedProcessor paymentProcessor(LegacyPaymentImprovedService legacyPaymentService) {
		// Switch between modern or legacy by returning a different implementation
		 return new LegacyPaymentAdapter(legacyPaymentService); // Using
		// LegacyPaymentAdapter here
		//return modernPaymentService(); // Uncomment to use the modern payment service
	}
}