package com.design.pattern.structural.facade.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class NotificationService {
	public String sendNotification() {
		// Simulate sending a notification
		return "Notification sent successfully.";
	}
}
