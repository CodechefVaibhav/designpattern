package com.design.pattern.creational.abstractfactory.improved.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

//Concrete Product
@Service
public class WordDocument implements Document {
	@Override
	public String process() {
		return "Processing Word Document";
	}
}
