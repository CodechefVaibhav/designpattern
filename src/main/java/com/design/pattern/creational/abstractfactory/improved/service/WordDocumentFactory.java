package com.design.pattern.creational.abstractfactory.improved.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author vaibhav.kashyap
 */

//Concrete Product
@Component("WordDocumentImprovedFactory")
public class WordDocumentFactory implements DocumentFactory {

	private final ApplicationContext context;

	@Autowired
	public WordDocumentFactory(ApplicationContext context) {
		this.context = context;
	}

	@Override
	public Document createDocument() {
		// Using ApplicationContext to get the bean, which ensures proper Spring
		// lifecycle management
		return context.getBean(WordDocument.class);
	}
}
