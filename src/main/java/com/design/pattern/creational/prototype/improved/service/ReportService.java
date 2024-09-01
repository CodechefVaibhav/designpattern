package com.design.pattern.creational.prototype.improved.service;

import org.springframework.stereotype.Service;

import com.design.pattern.creational.prototype.improved.model.Report;
import com.design.pattern.creational.prototype.improved.model.ReportPrototype;

/**
 * @author vaibhav.kashyap
 * */

@Service("ReportServiceImproved")
public class ReportService {
    private final ReportPrototype reportPrototype;

    public ReportService(ReportPrototype reportPrototype) {
        this.reportPrototype = reportPrototype;
    }

    public Report generateReport(String title, String content) {
        Report clonedReport = reportPrototype.cloneReport();
        clonedReport.setTitle(title);
        clonedReport.setContent(content);
        return clonedReport;
    }
}
