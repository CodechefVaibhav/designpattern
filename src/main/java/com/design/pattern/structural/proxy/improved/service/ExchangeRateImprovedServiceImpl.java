package com.design.pattern.structural.proxy.improved.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ExchangeRateImprovedServiceImpl implements ExchangeRateImprovedService {

	// Simulating an external API call for exchange rates
	@Override
	public Map<String, Double> getExchangeRates() {
		System.out.println("Fetching exchange rates from an external service...");
		Map<String, Double> rates = new HashMap<>();
		rates.put("USD", 1.0);
		rates.put("EUR", 0.85);
		rates.put("JPY", 110.0);
		return rates;
	}
}
