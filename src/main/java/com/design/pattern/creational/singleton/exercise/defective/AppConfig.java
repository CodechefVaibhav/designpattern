package com.design.pattern.creational.singleton.exercise.defective;

/**
 * @author vaibhav.kashyap
 */

public class AppConfig {
	private String config;

	public AppConfig() {
		this.config = "default";
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
}
