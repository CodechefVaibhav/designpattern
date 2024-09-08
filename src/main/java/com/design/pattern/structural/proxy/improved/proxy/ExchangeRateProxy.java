package com.design.pattern.structural.proxy.improved.proxy;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.design.pattern.structural.proxy.improved.service.ExchangeRateImprovedService;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ExchangeRateProxy implements ExchangeRateImprovedService {

	private final ExchangeRateImprovedService generalService;
	private final ExchangeRateImprovedService cryptoService;
	private Map<String, Double> cachedGeneralRates;
	private Map<String, Double> cachedCryptoRates;
	private long lastFetchTime;

	// Injecting ExchangeRateService with Qualifiers to distinguish between
	// implementations
	public ExchangeRateProxy(@Qualifier("generalService") ExchangeRateImprovedService generalService,
			@Qualifier("cryptoService") ExchangeRateImprovedService cryptoService) {
		this.generalService = generalService;
		this.cryptoService = cryptoService;
	}

	@Override
	public Map<String, Double> getExchangeRates() {
		// Defaulting to general rates in this method (can be modified based on logic)
		return getGeneralRates();
	}

	public Map<String, Double> getGeneralRates() {
		long currentTime = System.currentTimeMillis();
		if (cachedGeneralRates == null || (currentTime - lastFetchTime) > 300_000) {
			cachedGeneralRates = generalService.getExchangeRates();
			lastFetchTime = currentTime;
		} else {
			System.out.println("Returning cached general exchange rates...");
		}
		return cachedGeneralRates;
	}

	public Map<String, Double> getCryptoRates() {
		long currentTime = System.currentTimeMillis();
		if (cachedCryptoRates == null || (currentTime - lastFetchTime) > 300_000) {
			cachedCryptoRates = cryptoService.getExchangeRates();
			lastFetchTime = currentTime;
		} else {
			System.out.println("Returning cached cryptocurrency rates...");
		}
		return cachedCryptoRates;
	}
}
