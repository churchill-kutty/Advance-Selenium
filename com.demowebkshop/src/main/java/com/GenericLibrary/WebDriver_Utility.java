
package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	public static WebDriver driver;
	public static Properties pro;
	public static Workbook workbook;
	public static JavascriptExecutor js;
	public static TakesScreenshot screenShot;
	public static Select select;
	public static Actions action;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	
	/*
	 * This Method is used to navigate to the particular url
	 */
	public static void navigateUrl(String url) {
		driver.get(url);
	}
	
	/*
	 *This method is used to maximize the browser
	 * 	 */
	public static void maximizeBrowser() {
     driver.manage().window().maximize();
	}
	
	 /*
	  * This Method is used to wait for the webelement to load on the webpage
	  */
	 public static void loadTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstant.implicit_Wait));
	  }
	 /*
	  * This Method is used to fetch Current Url of the WebPage
	  */
	 public static String currentUrl() {
		 return driver.getCurrentUrl();
	 }
	/*
	 * This Method is used to fetch current title of the WebPage
	 */
	 public static String title() {
        return driver.getTitle();
	 }
	 
	 /*
	  * This Method is used to get the source code of the WebPage
	  */
	 public static String pageSource() {
		return driver.getPageSource();
	 }
	 
	 
	 /*
	  * This Method is used to get the current window address of the WebPage
	  */
	 public static String windowAddress() {
		 return driver.getWindowHandle();	
	 }
	 
	 /*
	  * This Method is used to get all window addresses of the WebPage
	  */
	 public static Set<String> allWindowAddress() {
			return driver.getWindowHandles();	 
		 }
	 
	 /*
		 * This Method is used to navigate to the particular url of the webpage
		 */
	 public static void navigateTo(String url) {
		 driver.navigate().to(url);
	 }
	 
	 /*
		 * This Method is used to go forward of the webpage
		 */
    public static void moveForward() {
    	 driver.navigate().forward();
	 }
    

	 /*
		 * This Method is used to go backward of the webpage
		 */
    public static void moveBackward() {
    	 driver.navigate().back();
	 }
    

	 /*
		 * This Method is used to refresh the webpage
		 */
    public static void refreshPage() {
    	 driver.navigate().refresh();
	 }
    

	 /*
		 * This Method is used to switch your control from one window to another window
		 */
    public static void switchToWindow(String expectedUrl) {
    	Set<String> all=driver.getWindowHandles();
    	for(String s:all) {
    	driver.switchTo().window(s);
    	String actualUrl=driver.getCurrentUrl();
    	if(expectedUrl.contains(actualUrl)) {
    		break;
    	}
    	}	
    }
    
    /*
	 * This Method is used to switch your control from webpage to alert Box it will help to click OK button in the alert dialog box
	 */
    public static void switchToSimpleAlert() {
    	Alert alt=driver.switchTo().alert();
    	alt.accept();
    }
    /*
	 * This Method is used to switch your control from webpage to alert Box it will help to click OK button or CANCEL button in the alert dialog box
	 */
    public static void switchToConfirmationAlert(String option) {
    	Alert alt=driver.switchTo().alert();
    	if(option.contains("ok")) {
    		alt.accept();
    	}
    	else {
    		alt.dismiss();
    	}
    		
    }
    /*
	 * This Method is used to switch your control from webpage to alert Box it will help you to send message in the alert dialog box
	 */
    public static void switchToPromptAlert(String message) {
    	Alert alt=driver.switchTo().alert();
    	alt.sendKeys(message);
    }
   /*
    * This Method is used to switch your control from webpage to Iframe page with respective Index value
    */
    public static void switchToIFrame(int index) {
    	driver.switchTo().frame(index);
   	}
    /*
     * This Method is used to switch your control from webpage to Iframe page with respective Id attribute or Name Attribute
     */
    public static void switchToIFrame(String attributeValue) {
    	driver.switchTo().frame(attributeValue);
   	}
    
 
   /*
    * This Method is used to switch your control from Webpage to Iframe page with respective WebElement address
    */
    public static void switchToIFrame(WebElement element) {
    	driver.switchTo().frame(element);
   	}
    
    /*
     * This Method is  used to switch control from Frame Page to Main Page
     */
    public static void switchToBackMainFrame() {
    	driver.switchTo().defaultContent();
    }
    
   /*
    * This Method is used to switch control from Frame page to immediate page
    */
    public static void switchToImmediateParentFrame() {
    	driver.switchTo().parentFrame();
    }
	 
}