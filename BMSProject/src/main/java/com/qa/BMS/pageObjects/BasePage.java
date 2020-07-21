package com.qa.BMS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver;	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getElement(By locator) {
		//System.out.println(driver);
		WebElement elm=driver.findElement(locator);
		return elm;
		
	}
	public String pageTitle() {
		return driver.getTitle();		
	}
	public WebElement pageHeading(By locator) {
		WebElement elm=getElement(locator);
		return elm;
		

	}

}
