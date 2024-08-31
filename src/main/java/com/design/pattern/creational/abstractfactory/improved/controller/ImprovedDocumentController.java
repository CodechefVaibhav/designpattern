package com.design.pattern.creational.abstractfactory.improved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.abstractfactory.improved.service.Document;
import com.design.pattern.creational.abstractfactory.improved.service.DocumentFactory;

/**
 * @author vaibhav.kashyap
 */

@RestController("ImprovedDocumentController")
@RequestMapping("/documents")
public class ImprovedDocumentController {

	private final DocumentFactory pdfDocumentFactory;
	private final DocumentFactory wordDocumentFactory;

	public ImprovedDocumentController(@Qualifier("PDFDocumentImprovedFactory") DocumentFactory pdfDocumentFactory,
			@Qualifier("WordDocumentImprovedFactory") DocumentFactory wordDocumentFactory) {
		// Using constructor injection for better testability and maintainability
		this.pdfDocumentFactory = pdfDocumentFactory;
		this.wordDocumentFactory = wordDocumentFactory;
	}

	@GetMapping("/process-pdf")
	public String processPDF() {
		Document pdfDocument = pdfDocumentFactory.createDocument();
		return pdfDocument.process();
	}

	@GetMapping("/process-word")
	public String processWord() {
		Document wordDocument = wordDocumentFactory.createDocument();
		return wordDocument.process();
	}
}
