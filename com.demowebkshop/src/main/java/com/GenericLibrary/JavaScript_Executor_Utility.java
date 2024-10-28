
package com.GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_Executor_Utility extends WebDriver_Utility {

	/*
	 * This Method is used to scroll Up of the WebPage
	 * @param xaxis
	 * @param yaxis
	 */
public static void scrollUp(int xaxis,int yaxis){
	
	js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
}

/*
 *  This Method is used to scroll Down of the WebPage
 *  @param xaxis
 *  @param yaxis
 */
public static void scrollDown(int xaxis,int yaxis) {
	js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+xaxis+","+-yaxis+")");
}

/*
 * This Method is used to scroll Extreme Top of the WebPage
 */
public static void scrollTopWebPage() {
	js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollTop)");
}

/*
 * This Method is used to scroll Extreme Bottom of the WebPage 
 */
public static void scrollBottomWebPage() {
	js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}

/*
 * This Method is used to scroll according to the WebElement
 * @param element
 */
public static void scrollToWebElement(WebElement element) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
}

}