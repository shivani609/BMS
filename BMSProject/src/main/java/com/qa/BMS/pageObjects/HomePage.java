package com.qa.BMS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	public class HomePage extends BasePage {
		private By welcomeLink=(By.xpath("//span[text()='Welcome jashan ']"));
		private By logOutLink=(By.xpath("//span[text()='Logout']"));
		private By dashBrdHeading=By.xpath("//span[text()='Logout']");
//		private By technologyManagement=By.xpath("//span[text()='Technology Management']");
//		private By addTechnology=By.xpath("//a[contains(text(),'ADD Technology')]");
		public HomePage(WebDriver driver) {
			super(driver);
		}

		public WebElement  getWelcomeLink() {
			return getElement (welcomeLink);
		}
		public WebElement getLogOutLink() {
			return getElement (logOutLink);
		}
		public String homePageHeading() {
			return getElement(dashBrdHeading).getText();
			
		}
//		public WebElement getTechnologyManagement() {
//			return getElement(technologyManagement);
//		}
//	    public WebElement  getAddTechnology () {
//		    return getElement(addTechnology);
//	    }
		
		public void logout() {
			getWelcomeLink().click();
			getLogOutLink().click();
//			getTechnologyManagement().click();
//			getAddTechnology().click();
		}
	}
