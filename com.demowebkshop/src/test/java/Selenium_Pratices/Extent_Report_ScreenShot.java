package Selenium_Pratices;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report_ScreenShot {
	@Test
	public void testcase() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		
		ExtentSparkReporter spark= new ExtentSparkReporter("C:\\Users\\churc\\eclipse-workspace\\selenium\\com.demowebkshop\\Extents Report\\Extent.html");
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("testcase");
		
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"ScreenShot Has been Attached");
		
		report.flush();
		
		
		
	}

}
