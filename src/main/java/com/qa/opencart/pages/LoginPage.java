package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By email = By.id("input-email");
	private By pwd  = By.id("input-password");
	private By loginBtn  = By.xpath("//input[@value='Login']");	
	
	private By forgotPwdLink  = By.linkText("Forgotten Password");	
	
	
	public LoginPage( WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		return loginPageTitle;
	}
	public String getLoginPageUrl() {
	   String loginpageUrl = driver.getCurrentUrl();
	   return loginpageUrl;
	}
	
	public boolean isforgotpwdlinkExists() {
		
		boolean forgorPwdLink=driver.findElement(forgotPwdLink).isDisplayed();
	    return forgorPwdLink;
	}
	
	public String doLogin(String username , String password) {
		driver.findElement(email).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginBtn).click();
		return driver.getTitle();

	}

	

}
