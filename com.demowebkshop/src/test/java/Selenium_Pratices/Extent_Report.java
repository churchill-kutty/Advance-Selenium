package Selenium_Pratices;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {
	@Test
	public void TestCase() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\churc\\eclipse-workspace\\selenium\\com.demowebkshop\\Extents Report\\Extent.html");
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(spark);
		
		ExtentTest test =report.createTest("TestCase");
		
		test.log(Status.PASS, "File has Been Atteached");
		report.flush();
	}

}

