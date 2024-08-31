package com.design.pattern.creational.builder.defective.model;

/**
 * @author vaibhav.kashyap
 */

public class Product {
	private String name;
	private double price;
	private String description;
	private String category;

	// Multiple constructors with many parameters
	public Product(String name) {
		this.name = name;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Product(String name, double price, String description, String category) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}
}
