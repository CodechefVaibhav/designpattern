package com.design.pattern.creational.factory.exercise.solution;

/**
 * @author vaibhav.kashyap
 */

public class TransportFactory {
	public static TransportSolution getTransport(String type) {
		if (type.equals("CarSolution")) {
			return new CarSolution();
		} else if (type.equals("BikeSolution")) {
			return new BikeSolution();
		}
		return null;
	}
}