package com.design.pattern.structural.facade.improved.service;

import org.springframework.stereotype.Service;

import com.design.pattern.structural.facade.defective.service.NotificationService;
import com.design.pattern.structural.facade.defective.service.OrderService;
import com.design.pattern.structural.facade.defective.service.PaymentService;

/**
 * @author vaibhav.kashyap
 */

@Service
public class OrderFacadeImpl implements OrderFacade {
	private final OrderService orderService;
	private final PaymentService paymentService;
	private final NotificationService notificationService;

	public OrderFacadeImpl(OrderService orderService, PaymentService paymentService,
			NotificationService notificationService) {
		this.orderService = orderService;
		this.paymentService = paymentService;
		this.notificationService = notificationService;
	}

	@Override
	public String placeOrder() {
		String orderResult = orderService.createOrder();
		String paymentResult = paymentService.processPayment();
		String notificationResult = notificationService.sendNotification();
		return orderResult + " " + paymentResult + " " + notificationResult;
	}
}
