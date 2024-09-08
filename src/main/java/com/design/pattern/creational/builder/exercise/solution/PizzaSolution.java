package com.design.pattern.creational.builder.exercise.solution;

/**
 * @author vaibhav.kashyap
 */

public class PizzaSolution {
	private String dough;
	private String sauce;
	private String topping;

	private PizzaSolution(Builder builder) {
		this.dough = builder.dough;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
	}

	public static class Builder {
		private String dough;
		private String sauce;
		private String topping;

		public Builder setDough(String dough) {
			this.dough = dough;
			return this;
		}

		public Builder setSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public Builder setTopping(String topping) {
			this.topping = topping;
			return this;
		}

		public PizzaSolution build() {
			return new PizzaSolution(this);
		}
	}

	@Override
	public String toString() {
		return "PizzaSolution [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
}
