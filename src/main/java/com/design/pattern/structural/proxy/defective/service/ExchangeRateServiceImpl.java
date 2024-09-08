package com.design.pattern.structural.proxy.defective.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

	@Override
	public Map<String, Double> getExchangeRates() {
		System.out.println("Fetching exchange rates from a general service...");
		Map<String, Double> rates = new HashMap<>();
		rates.put("USD", 1.0);
		rates.put("EUR", 0.85);
		return rates;
	}
}
