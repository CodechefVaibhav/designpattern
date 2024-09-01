package com.design.pattern.creational.prototype.improved.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.creational.prototype.improved.model.Report;
import com.design.pattern.creational.prototype.improved.service.ReportService;

/**
 * @author vaibhav.kashyap
 * */

@RestController
@RequestMapping("ReportControllerImproved")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/generateReport")
    public String generateReport(@RequestParam String title,
                                 @RequestParam String content) {
        Report report = reportService.generateReport(title, content);
        return report.toString();
    }
}