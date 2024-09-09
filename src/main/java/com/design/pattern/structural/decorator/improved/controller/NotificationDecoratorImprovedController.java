package com.design.pattern.structural.decorator.improved.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.decorator.improved.service.NotificationDecoratorImprovedService;

/**
 * @author vaibhav.kashyap
 */

/**
 * <p>
 * Explanation of Improvements:</br>
 * 1) Open for Extension, Closed for Modification: The
 * NotificationDecoratorImprovedController now depends on the
 * NotificationDecoratorImprovedService interface, which can be decorated with
 * new behaviors without modifying the controller. </br>
 * 2) Flexibility: We can now easily add new types of notifications like SMS or
 * Slack by decorating the NotificationDecoratorImprovedService. </br>
 * 3) Reusability: Each decorator can be used independently or in combination
 * with others.
 * </p>
 */

@RestController
public class NotificationDecoratorImprovedController {

	private final NotificationDecoratorImprovedService notificationService;

	// Constructor injection for the decorated service
	public NotificationDecoratorImprovedController(
			@Qualifier("emailSmsSlackNotificationService") NotificationDecoratorImprovedService emailSmsSlackNotificationService) {
		this.notificationService = emailSmsSlackNotificationService; // This will inject the email + SMS + Slack
																		// notification service
	}

	@PostMapping("/send")
	public String sendNotification(@RequestParam String message) {
		return notificationService.sendNotification(message); // This will trigger Email + SMS + Slack notifications
	}
}