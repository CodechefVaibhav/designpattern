package com.design.pattern.structural.decorator.improved.service;

/**
 * vaibhav.kashyap
 */

public class CustomNotificationDecoratorImprovedService implements NotificationDecoratorImprovedService {

	@Override
	public String sendNotification(String message) {
		// Custom implementation: Sending custom notification
		return "Custom Notification: " + message;
	}
}