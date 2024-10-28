package Selenium_Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3Test {
	@Test
	public void testcase3() {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.ajio.com/");
		 driver.quit();
	}

}
