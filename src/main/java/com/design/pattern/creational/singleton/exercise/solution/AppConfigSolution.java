package com.design.pattern.creational.singleton.exercise.solution;

/**
 * @author vaibhav.kashyap
 */

public class AppConfigSolution {
	private static AppConfigSolution instance;
	private String config;

	private AppConfigSolution() {
		this.config = "default";
	}

	public static AppConfigSolution getInstance() {
		if (instance == null) {
			instance = new AppConfigSolution();
		}
		return instance;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
}
