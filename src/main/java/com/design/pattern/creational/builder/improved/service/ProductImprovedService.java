package com.design.pattern.creational.builder.improved.service;

import org.springframework.stereotype.Service;

import com.design.pattern.creational.builder.improved.model.ProductImproved;
import com.design.pattern.creational.builder.improved.model.ProductImproved.ProductImprovedBuilder;

/**
 * @author vaibhav.kashyap
 */

//Using Builder Pattern
@Service
public class ProductImprovedService {

	public ProductImproved createProduct(String name, double price, String description, String category) {
		return new ProductImproved.ProductImprovedBuilder(name).price(price).description(description).category(category)
				.build();
	}
}
