package com.qa.BMS.pageTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.BMS.pageObjects.AddTechnologyPage;
import com.qa.BMS.pageObjects.BasePage;
import com.qa.BMS.pageObjects.HomePage;
import com.qa.BMS.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	BasePage basePage;
	LoginPage loginPage;
	AddTechnologyPage addTechnologyPage;
	
	@Test
	public void browserLaunch() {
		String browserName="firefox";
		if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://bmstestingportal.000webhostapp.com/admin/admin/HTML/fetchadmin.php");
		basePage=new BasePage(driver);
		loginPage=new LoginPage(driver);
		addTechnologyPage =new AddTechnologyPage(driver);
	}
}
