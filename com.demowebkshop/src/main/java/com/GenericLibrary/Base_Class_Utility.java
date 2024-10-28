package com.GenericLibrary;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listener_Implementation_Utility.class)
public class Base_Class_Utility extends WebDriver_Utility {
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connect To The Server",true);
	}
	@BeforeTest
   public void connectDatabase() {
		Reporter.log("Connect To The DataBase",true);
	}
	@BeforeClass
   public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		maximizeBrowser();
		loadTime();
		navigateUrl(Property_File_Utility.propertyData("url"));
		currentUrl();
		Reporter.log("Browser Opened",true);
	}
	@BeforeMethod
   public void login() {
		Reporter.log("Login Done",true);
	}
	@AfterMethod
    public void logout() {
		Reporter.log("LogOut Done",true);
	}
	@AfterClass
   public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser Closed",true);
	}
	@AfterTest
    public void disconnectDataBase() {
		Reporter.log("DisConnect To The DataBase",true);
	}
	@AfterSuite
   public void disconnectServer() {
		Reporter.log("DisConnect To The Server",true);
	}
}
