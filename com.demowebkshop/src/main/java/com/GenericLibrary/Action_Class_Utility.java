package com.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Utility {
Actions action;
	
	public Action_Class_Utility(WebDriver driver) {
		action=new Actions(driver);
	}
	
	/*
	 * This Method is used to perform the multiple action on the webelement
	 */
	public void doAction() {
		action.perform();
	}
	
	/*
	 * This Method is used to move my cursor to the particular webelement
	 */
	public Action_Class_Utility moveCursor(WebElement element) {
		action.moveToElement(element);
		return this;
		
	}
	
	/*
	 *  This Method is used to do right click on the webpage wherever the cursor is present
	 */
	public Action_Class_Utility rightClick() {
		action.contextClick();
		return this;
	}
	
	/*
	 *  This Method is used to do right click on the webelement
	 */
	public Action_Class_Utility rightClick(WebElement element) {
		action.contextClick(element);
		return this;
	}
	
	/*
	 *  This Method is used to do double click on the webpage wherever the cursor is present
	 */
	public Action_Class_Utility clickDouble() {
      action.doubleClick();
		return this;
	}
	
	/*
	 *  This Method is used to do double click on the webelement
	 */
	public Action_Class_Utility clickDouble(WebElement element) {
	      action.doubleClick(element);
			return this;
		}
	
	/*
	 *  This Method is used to do drag and drop action
	 */
	public void pickAndDrop(WebElement source,WebElement destination) {
		action.dragAndDrop(source,destination);
	}
}


