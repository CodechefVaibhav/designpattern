package com.design.pattern.structural.facade.defective.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.facade.defective.service.NotificationService;
import com.design.pattern.structural.facade.defective.service.OrderService;
import com.design.pattern.structural.facade.defective.service.PaymentService;

/**
 * @author vaibhav.kashyap
 */	

@RestController
public class OrderController {
	private final OrderService orderService;
	private final PaymentService paymentService;
	private final NotificationService notificationService;

	public OrderController(OrderService orderService, PaymentService paymentService,
			NotificationService notificationService) {
		this.orderService = orderService;
		this.paymentService = paymentService;
		this.notificationService = notificationService;
	}

	@GetMapping("/placeOrder")
	public String placeOrder() {
		String orderResult = orderService.createOrder();
		String paymentResult = paymentService.processPayment();
		String notificationResult = notificationService.sendNotification();
		return orderResult + " " + paymentResult + " " + notificationResult;
	}
}
