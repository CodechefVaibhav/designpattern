package com.design.pattern.abstractfactory.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

//Concrete Product
@Service
public class PDFDocument implements Document {
	@Override
	public String process() {
		return "Processing PDF Document";
	}
}
