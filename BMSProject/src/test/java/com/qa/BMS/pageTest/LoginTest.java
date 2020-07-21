package com.qa.BMS.pageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.BMS.pageObjects.AddListingPage;
import com.qa.BMS.pageObjects.AddTechnologyPage;
import com.qa.BMS.pageObjects.HomePage;

	public class LoginTest extends BaseTest{
		@Test
		public void verifyLogin() {
			HomePage hp=loginPage.doLogin("admin","admin");
			String actPageHeading=hp.homePageHeading();
			Assert.assertEquals(actPageHeading,"Logout","Something went wrong!!");
			System.out.println("[INFO]:login sucessfully");
			
			
	}
	}
