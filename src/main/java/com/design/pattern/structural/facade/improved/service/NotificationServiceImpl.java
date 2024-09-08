package com.design.pattern.structural.facade.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class NotificationServiceImpl implements NotificationSolutionService {
	@Override
	public String sendNotification() {
		// Simulate sending a notification
		return "Notification sent successfully.";
	}
}
