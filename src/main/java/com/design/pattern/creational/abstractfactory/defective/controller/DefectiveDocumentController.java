package com.design.pattern.creational.abstractfactory.defective.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.abstractfactory.defective.service.PDFDocumentService;
import com.design.pattern.creational.abstractfactory.defective.service.WordDocumentService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/defective-documents")
public class DefectiveDocumentController {

	private final PDFDocumentService pdfDocumentService;
	private final WordDocumentService wordDocumentService;

	public DefectiveDocumentController() {
		// Defective: Direct instantiation of services leads to tight coupling
		this.pdfDocumentService = new PDFDocumentService();
		this.wordDocumentService = new WordDocumentService();
	}

	@GetMapping("/process-pdf")
	public String processPDF() {
		return pdfDocumentService.process();
	}

	@GetMapping("/process-word")
	public String processWord() {
		return wordDocumentService.process();
	}
}
