package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports report;
	public static ExtentReports getReportInstance() {
		if(report==null) {
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(
			System.getProperty("user.dir")+"report.html");
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		
		htmlReport.config().setDocumentTitle("AutomationResults");
		htmlReport.config().setReportName("Exploring Meesho App");
		
	    }
		return report;
	}

}
