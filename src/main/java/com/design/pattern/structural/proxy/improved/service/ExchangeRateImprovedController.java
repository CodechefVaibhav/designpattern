package com.design.pattern.structural.proxy.improved.service;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class ExchangeRateImprovedController {

	private final ExchangeRateImprovedService exchangeRateProxy;

	// Constructor injection of proxy service
	public ExchangeRateImprovedController(ExchangeRateImprovedService exchangeRateProxy) {
		this.exchangeRateProxy = exchangeRateProxy;
	}

	@GetMapping("/rates")
	public Map<String, Double> getRates() {
		return exchangeRateProxy.getExchangeRates();
	}
}
