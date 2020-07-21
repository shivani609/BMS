package com.qa.BMS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTechnologyPage extends BasePage {
	private By technology=By.name("technology");
	private By description=By.id("techdes");
	private By link=By.id("techlink");
	private By add=By.name("add"); 
	
	public AddTechnologyPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getTechnology() {
		return getElement(technology);
	}

	public WebElement getDescription() {
		return getElement (description);
	}

	public WebElement getLink() {
		return getElement (link);
	}
	public WebElement getAdd() {
		return getElement (add);
	}


	public  AddTechnologyPage enterData(String technology,String description,String link)
	{
		getTechnology().sendKeys(technology);
		getDescription().sendKeys(description);
		getLink().sendKeys(link);
		getAdd().click();
		return new AddTechnologyPage(driver);
	}

}
