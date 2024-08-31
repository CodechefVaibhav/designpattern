package com.design.pattern.creational.builder.defective.service;

import org.springframework.stereotype.Service;

import com.design.pattern.creational.builder.defective.model.Product;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ProductService {

	public Product createProduct(String name, double price, String description, String category) {
		return new Product(name, price, description, category);
	}
}
