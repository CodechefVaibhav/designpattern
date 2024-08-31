package com.design.pattern.creational.builder.improved.model;

/**
 * @author vaibhav.kashyap
 */

public class ProductImproved {
	private String name;
	private double price;
	private String description;
	private String category;

	// Private constructor to enforce object creation via the Builder
	private ProductImproved(ProductImprovedBuilder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.description = builder.description;
		this.category = builder.category;
	}

	// Static nested Builder class
	public static class ProductImprovedBuilder {
		private String name;
		private double price;
		private String description;
		private String category;

		public ProductImprovedBuilder(String name) {
			this.name = name;
		}

		public ProductImprovedBuilder price(double price) {
			this.price = price;
			return this;
		}

		public ProductImprovedBuilder description(String description) {
			this.description = description;
			return this;
		}

		public ProductImprovedBuilder category(String category) {
			this.category = category;
			return this;
		}

		public ProductImproved build() {
			return new ProductImproved(this);
		}
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
