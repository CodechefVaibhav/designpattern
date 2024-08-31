package com.design.pattern.creational.abstractfactory.improved.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 */

//Concrete Factory
@Component("PDFDocumentImprovedFactory")
public class PDFDocumentFactory implements DocumentFactory {

	private final ApplicationContext context;

	@Autowired
	public PDFDocumentFactory(ApplicationContext context) {
		this.context = context;
	}

	@Override
	public Document createDocument() {
		// Using ApplicationContext to get the bean, which ensures proper Spring
		// lifecycle management
		return context.getBean(PDFDocument.class);
	}
}
