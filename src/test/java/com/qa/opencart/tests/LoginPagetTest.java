package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class LoginPagetTest extends BaseTest {
	
	
	
	@Test
	public void loginpageTitleTest() {
		String actTitle=lp.getLoginPageTitle();
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE);
		
	}
	
	 @Test
	 
	public void doLoginTest() {
		String homeTitle =lp.doLogin("naveenanimation20@gmail.com","Selenium@12345");
		Assert.assertEquals(homeTitle,AppConstants.ACCOUNTS_PAGE_TITLE );
		
	}

	@Test
	public void loginPageUrlTest() {
		String actUrl = lp.getLoginPageUrl();
		System.out.println("the actual URL of the page is  " + actUrl);
		actUrl.contains("route=account/login");
		Assert.assertEquals(actUrl, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertEquals(actUrl.contains(AppConstants.LOGIN_PAGE_URL_FACTION),true);
	}
	@Test
	public void forgotPwdLinkExistsTest() {
		//lp.isforgotpwdlinkExists();
		
		Assert.assertTrue(lp.isforgotpwdlinkExists());
		
	}
}
