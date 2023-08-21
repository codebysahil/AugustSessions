package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public DriverFactory df;
	public LoginPage lp;
	
	@BeforeTest
	
	public void setup() {
		df = new DriverFactory();
		driver = df.initDriver("chrome");
		lp = new LoginPage(driver);
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}

}
