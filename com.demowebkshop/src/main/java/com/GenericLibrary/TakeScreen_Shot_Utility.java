
package com.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class TakeScreen_Shot_Utility  extends WebDriver_Utility{
public static void ScreenShotFailure() throws IOException {
	
	//String systemDate=Java_Utility.date();
	screenShot=(TakesScreenshot) driver;
	File source=screenShot.getScreenshotAs(OutputType.FILE);
	File destination=new File(Iconstant.screenShotFailure_FilePath);
    Files.copy(source,destination);
}

public static void ElementFailure(WebElement element) throws IOException {
	
	//String systemDate=Java_Utility.date();
	screenShot=(TakesScreenshot) driver;
	File source=element.getScreenshotAs(OutputType.FILE);
	File destination=new File(Iconstant.elementFailure_FilePath);
    Files.copy(source,destination);
}
}