package Selenium_Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgramTest {
	@Test
	public static void testCase() 
	{
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.quit();
	

	}

}
