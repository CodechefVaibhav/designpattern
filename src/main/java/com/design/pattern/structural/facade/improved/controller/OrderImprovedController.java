package com.design.pattern.structural.facade.improved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.facade.improved.service.OrderFacade;

/**
 * @author vaibhav.kashyap
 */

@RestController
public class OrderImprovedController {
	private final OrderFacade orderFacade;

	// Inject the facade through constructor injection
	public OrderImprovedController(OrderFacade orderFacade) {
		this.orderFacade = orderFacade;
	}

	@GetMapping("/placeOrder")
	public String placeOrder() {
		return orderFacade.placeOrder();
	}
}
