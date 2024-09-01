package com.design.pattern.creational.prototype.defective.model;

/**
 * @author vaibhav.kashyap
 */

public class Report {
	private String title;
	private String content;
	private String author;

	public Report(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}

	// Getters and Setters

	@Override
	public String toString() {
		return "Report{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", author='" + author + '\''
				+ '}';
	}
}
