package com.design.pattern.structural.decorator.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class SlackNotificationDecoratorImprovedService implements NotificationDecoratorImprovedService {

	private final NotificationDecoratorImprovedService wrappedNotificationService;

	public SlackNotificationDecoratorImprovedService(NotificationDecoratorImprovedService notificationService) {
		this.wrappedNotificationService = notificationService;
	}

	@Override
	public String sendNotification(String message) {
		// Adding Slack notification logic
		String originalNotification = wrappedNotificationService.sendNotification(message);
		return originalNotification + " and Slack notification sent with message: " + message;
	}
}