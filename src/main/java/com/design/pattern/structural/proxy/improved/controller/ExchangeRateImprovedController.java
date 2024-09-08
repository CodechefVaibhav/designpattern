package com.design.pattern.structural.proxy.improved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.proxy.improved.proxy.ExchangeRateProxy;

import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class ExchangeRateImprovedController {

	private final ExchangeRateProxy exchangeRateProxy;

	// Constructor injection of the proxy service
	public ExchangeRateImprovedController(ExchangeRateProxy exchangeRateProxy) {
		this.exchangeRateProxy = exchangeRateProxy;
	}

	@GetMapping("/rates/general")
	public Map<String, Double> getGeneralRates() {
		return exchangeRateProxy.getGeneralRates();
	}

	@GetMapping("/rates/crypto")
	public Map<String, Double> getCryptoRates() {
		return exchangeRateProxy.getCryptoRates();
	}
}
