package com.design.pattern.structural.decorator.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class SmsNotificationDecoratorImprovedService implements NotificationDecoratorImprovedService {

	private final NotificationDecoratorImprovedService wrappedNotificationService;

	public SmsNotificationDecoratorImprovedService(NotificationDecoratorImprovedService notificationService) {
		this.wrappedNotificationService = notificationService;
	}

	@Override
	public String sendNotification(String message) {
		// Adding SMS notification logic before or after the original service
		String originalNotification = wrappedNotificationService.sendNotification(message);
		return originalNotification + " and SMS sent with message: " + message;
	}
}