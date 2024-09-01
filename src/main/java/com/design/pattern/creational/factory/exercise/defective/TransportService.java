package com.design.pattern.creational.factory.exercise.defective;

/**
 * @author vaibhav.kashyap
 */

public class TransportService {
	public void getTransport(String type) {
		if (type.equals("Car")) {
			Car car = new Car();
			car.drive();
		} else if (type.equals("Bike")) {
			Bike bike = new Bike();
			bike.drive();
		}
	}
}