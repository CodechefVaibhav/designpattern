package com.design.pattern.structural.decorator.improved.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

	@Bean
	public NotificationDecoratorImprovedService defaultNotificationService() {
		return new DefaultNotificationDecoratorImprovedService(); // Default email notification
	}

	@Bean
	public NotificationDecoratorImprovedService emailAndSmsNotificationService() {
		NotificationDecoratorImprovedService defaultService = defaultNotificationService(); // Use the default
																							// implementation
		return new SmsNotificationDecoratorImprovedService(defaultService); // Decorate with SMS functionality
	}

	// You can also create another bean for email + SMS + Slack notifications
	@Bean
	public NotificationDecoratorImprovedService emailSmsSlackNotificationService() {
		NotificationDecoratorImprovedService emailSmsService = emailAndSmsNotificationService(); // Email + SMS
		return new SlackNotificationDecoratorImprovedService(emailSmsService); // Decorate with Slack functionality
	}
}