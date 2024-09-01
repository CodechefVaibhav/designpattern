package com.design.pattern.creational.prototype.improved.model;

import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 * */

@Component
public class ReportPrototype {
	private final Report report;

	public ReportPrototype() {
		// Creating a prototype with default content
		this.report = new Report("Default Title", "Default Content", "Admin");
	}

	public Report cloneReport() {
		return report.clone();
	}
}