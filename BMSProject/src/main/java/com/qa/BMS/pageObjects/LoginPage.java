package com.qa.BMS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage{
	//locators
	private By userRole=By.xpath("//select[@name='user_role']");
	private By loginUsername=By.name("user_name");
	private By loginPass=By.name("password");
	private By loginBtn=By.name("login");
	private By technologyManagement=By.xpath("//span[text()='Technology Management']");
	private By addTechnology=By.xpath("//a[contains(text(),'ADD Technology')]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public WebElement getUserRole() {
		return getElement(userRole);
	}
	//Encapsulation
	public WebElement getLoginUsername() {
		return getElement(loginUsername);
	}
	public WebElement getLoginPass() {
		return getElement(loginPass);
	}
	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	public WebElement getTechnologyManagement() {
		return getElement(technologyManagement);
	}
    public WebElement  getAddTechnology () {
	    return getElement(addTechnology);
    }
	public HomePage doLogin(String username,String password) 
	{        
		Select slc=new Select(getUserRole());
		slc.selectByVisibleText("Admin");
		getLoginUsername().sendKeys(username);
		getLoginPass().sendKeys(password);
		getLoginBtn().click();
		getTechnologyManagement().click();
     	getAddTechnology().click();
		return new HomePage(driver);
	}
//	public AddTechnologyPage clickOnAddTechnology(String string, String string2, String string3) {
//		getTechnologyManagement().click();
//		getAddTechnology().click();
//		return new AddTechnologyPage(driver);
//	}

}
