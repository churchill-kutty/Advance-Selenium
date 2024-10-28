
package com.GenericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_Utility {

	Select select;
	
	public Select_Class_Utility(WebElement element)
	{
		select =new Select(element);
	}

	/**
	 * this method is used to select the option which is present in the  dropdown
	 * with respect to index values
	 * @param index
	 */
	public void index(int index)
	{
		select.selectByIndex(index);
	}
	
	/**
	 * this method is used to select the option which is present in the  dropdown
	 * with respect to text function values
	 * @param text
	 */
	public void text(String text)
	{
		select.selectByVisibleText(text);
	}
	
	/**
	 * this method is used to select the option which is present in the  dropdown
	 * with respect to attribute values
	 * @param value
	 */
	public void value(String value)
	{
		select.selectByValue(value);
	}
	
	/*
	 * This Method is used to De-Select the option which is present in the dropdown with respect to Index Value
	 */
	public void deselectIndex(int index) {
		select.deselectByIndex(index);
	}
	

	/*
	 * This Method is used to De-Select the option which is present in the dropdown with respect to Attribute Values
	 */
	public void deselectValue(String value) {
		select.deselectByValue(value);
	}
	
	/*
	 * This Method is used to De-Select the option which is present in the dropdown with respect to Text Function Value
	 */
	public void deselectText(String text) {
		select.deselectByVisibleText(text);
	}
	
	/*
	 * This Method is used to give you the first selected option present in the dropdown
	 */
	public WebElement firstSelected() {
		WebElement element=select.getFirstSelectedOption();
		return element;
	}
	
	/*
	 * This Method is used to give you all the selected option which is present in the dropdown
	 */
	public List<WebElement> allSelected(){
			List<WebElement> allElement=select.getAllSelectedOptions();
			return allElement;
	}
	
	/*
	 * This Method is used to give you all the option which is present in the dropdown
	 */
	public List<WebElement> getAllOptions(){
		List<WebElement> allOptions=select.getOptions();
		return allOptions;
     }
	
	/*
	 * This Method is used to De-Select all the option which is present in the dropdown
	 */
	public void clearAll(){
		select.deselectAll();
     }
	
	/*
	 * This Method is used to get the size of the dropdown
	 */
	public int size(){
		int size=select.getOptions().size();
		return size;
		}
	
	/*
	 * This Method is used to get the dropdown whether the dropdown is multi select or not it will return True or False
	 */
	public boolean isMultiSelect(){
		boolean b=select.isMultiple();
		return b;
		}
	
	
}