package com.design.pattern.creational.factory.improved.service;

/**
 * @author vaibhav.kashyap
 */

//PaymentProcessor interface for different payment methods
public interface PaymentProcessor {
	String processPayment(double amount);
}
