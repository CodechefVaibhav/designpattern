package com.design.pattern.creational.builder.exercise.defective;

/**
 * @author vaibhav.kashyap
 * */

public class Pizza {
	private String dough;
	private String sauce;
	private String topping;

	public Pizza(String dough, String sauce, String topping) {
		this.dough = dough;
		this.sauce = sauce;
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
}
