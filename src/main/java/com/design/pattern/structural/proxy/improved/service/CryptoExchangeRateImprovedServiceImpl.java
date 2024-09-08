package com.design.pattern.structural.proxy.improved.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class CryptoExchangeRateImprovedServiceImpl implements ExchangeRateImprovedService {

	@Override
	public Map<String, Double> getExchangeRates() {
		System.out.println("Fetching cryptocurrency exchange rates...");
		Map<String, Double> rates = new HashMap<>();
		rates.put("BTC", 45000.0);
		rates.put("ETH", 3000.0);
		return rates;
	}
}