package Selenium_Pratices;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GenericLibrary.Excel_File_Utility;
import com.GenericLibrary.Property_File_Utility;

public class Program2Test {

	
	@Test
	public void Testcase() throws IOException {
		
		System.out.println(Property_File_Utility.propertyData("url"));
		System.out.println(Excel_File_Utility.Excel_Data("Sheet1", 0, 0));
		System.out.println(Excel_File_Utility.excelAllData("Sheet1"));
	}
}
