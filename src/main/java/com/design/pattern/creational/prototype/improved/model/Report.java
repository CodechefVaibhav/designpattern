package com.design.pattern.creational.prototype.improved.model;

/**
 * @author vaibhav.kashyap
 */

public class Report implements Cloneable {
	private String title;
	private String content;
	private String author;

	public Report(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public Report clone() {
		try {
			return (Report) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Cloning not supported", e);
		}
	}

	@Override
	public String toString() {
		return "Report{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", author='" + author + '\''
				+ '}';
	}
}