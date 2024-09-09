package com.design.pattern.structural.decorator.defective.service;

/**
 * @author vaibhav.kashyap
 */

public class EmailNotificationDefectiveDecoratorService implements NotificationDecoratorDefectiveService {

	@Override
	public String sendNotification(String message) {
		// Sending email logic
		return "Email sent with message: " + message;
	}
}