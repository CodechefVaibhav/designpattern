package com.design.pattern.structural.proxy.defective.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.proxy.defective.service.ExchangeRateService;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class ExchangeRateController {

	private final ExchangeRateService generalService;
	private final ExchangeRateService cryptoService;

	public ExchangeRateController(@Qualifier("exchangeRateServiceImpl") ExchangeRateService generalService,
			@Qualifier("cryptoExchangeRateServiceImpl") ExchangeRateService cryptoService) {
		this.generalService = generalService;
		this.cryptoService = cryptoService;
	}

	@GetMapping("/rates/general")
	public Map<String, Double> getGeneralRates() {
		return generalService.getExchangeRates();
	}

	@GetMapping("/rates/crypto")
	public Map<String, Double> getCryptoRates() {
		return cryptoService.getExchangeRates();
	}
}
