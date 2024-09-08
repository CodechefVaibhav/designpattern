package com.design.pattern.creational.factory.exercise.solution;

/**
 * @author vaibhav.kashyap
 */

public class TransportServiceSolution {
	public void getTransport(String type) {
		TransportSolution transport = TransportFactory.getTransport(type);
		if (transport != null) {
			transport.drive();
		} else {
			System.out.println("Invalid transport type");
		}
	}
}
