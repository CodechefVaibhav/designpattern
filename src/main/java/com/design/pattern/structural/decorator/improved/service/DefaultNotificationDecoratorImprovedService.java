package com.design.pattern.structural.decorator.improved.service;

/**
 * @author vaibhav.kashyap
 */

public class DefaultNotificationDecoratorImprovedService implements NotificationDecoratorImprovedService {

	@Override
	public String sendNotification(String message) {
		// Default implementation: Sending email logic
		return "Default Email sent with message: " + message;
	}
}