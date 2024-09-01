package com.design.pattern.creational.prototype.defective.service;

import org.springframework.stereotype.Service;

import com.design.pattern.creational.prototype.defective.model.Report;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ReportService {
	public Report generateReport(String title, String content, String author) {
		return new Report(title, content, author);
	}
}