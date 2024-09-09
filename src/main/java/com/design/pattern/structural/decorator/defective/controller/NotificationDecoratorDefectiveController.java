package com.design.pattern.structural.decorator.defective.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.structural.decorator.defective.service.EmailNotificationDefectiveDecoratorService;
import com.design.pattern.structural.decorator.defective.service.NotificationDecoratorDefectiveService;

/**
 * @author vaibhav.kashyap
 */

/**
 * <P>
 * Issues with the Defective Code: </br>
 * 1) Rigid Notification Service: The current implementation is tightly coupled
 * to EmailNotificationService. Adding new types of notifications (like SMS,
 * Slack, etc.) would require changes in the NotificationController. </br>
 * 2) Violation of the Open/Closed Principle: The NotificationController needs
 * to be modified to support additional types of notifications, which violates
 * the open/closed principle.</br>
 * 3) Extensibility: To add a new notification type, a new service needs to be
 * implemented and additional logic must be added to the controller.
 * </p>
 */

@RestController
public class NotificationDecoratorDefectiveController {

	private final NotificationDecoratorDefectiveService notificationService;

	// Injecting using constructor injection
	public NotificationDecoratorDefectiveController(
			EmailNotificationDefectiveDecoratorService emailNotificationService) {
		this.notificationService = emailNotificationService;
	}

	@PostMapping("/send")
	public String sendNotification(@RequestParam String message) {
		// Currently, we only support email notifications. What if we want to extend
		// this to support SMS or other channels?
		return notificationService.sendNotification(message);
	}
}