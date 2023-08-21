package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;

	@BeforeTest
	public void setup(){
    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

	
	@Test
	public void logoTest() {
		boolean flag =driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
	Assert.assertEquals(flag, true);
	
	}
	
	@Test
	public void forgotPWDLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMessage =driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMessage);
		Assert.assertEquals(errorMessage,"Warning: No match for E-Mail Address and/or Password.");

		

	}

}
