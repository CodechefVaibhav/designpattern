package com.design.pattern.creational.prototype.defective.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.prototype.defective.model.Report;
import com.design.pattern.creational.prototype.defective.service.ReportService;

/**
 * @author vaibhav.kashyap
 * */

@RestController
@RequestMapping("/defective-reports")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/generateReport")
    public String generateReport(@RequestParam String title,
                                 @RequestParam String content,
                                 @RequestParam String author) {
        Report report = reportService.generateReport(title, content, author);
        return report.toString();
    }
}