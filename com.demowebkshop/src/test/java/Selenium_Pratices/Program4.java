package Selenium_Pratices;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program4 {

	
	@Test
	public void testcase() {
		String url= System.getProperty("url");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}
}
