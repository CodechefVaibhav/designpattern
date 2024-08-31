package com.design.pattern.creational.builder.defective.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.builder.defective.model.Product;
import com.design.pattern.creational.builder.defective.service.ProductService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/defective-products")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public Product createProduct(@RequestParam String name, @RequestParam double price,
			@RequestParam String description, @RequestParam String category) {
		return productService.createProduct(name, price, description, category);
	}
}
