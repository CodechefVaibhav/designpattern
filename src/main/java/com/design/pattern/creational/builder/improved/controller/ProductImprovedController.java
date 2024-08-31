package com.design.pattern.creational.builder.improved.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.builder.improved.model.ProductImproved;
import com.design.pattern.creational.builder.improved.service.ProductImprovedService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/products")
public class ProductImprovedController {

	private final ProductImprovedService productService;

	public ProductImprovedController(ProductImprovedService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ProductImproved createProduct(@RequestParam String name, @RequestParam double price,
			@RequestParam String description, @RequestParam String category) {
		return productService.createProduct(name, price, description, category);
	}
}
