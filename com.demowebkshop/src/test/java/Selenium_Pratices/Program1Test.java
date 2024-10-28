package Selenium_Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1Test {
	@Test
	public void testcase() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.meesho.com/");
	   driver.quit();
		
	}


	@Test
	public void testcase1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.myntra.com/");
	    driver.quit();
		
		
	}
}
