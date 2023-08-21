package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;
/**
 * This method is used to initialize the driver based on the browsername
 * @param browserName
 * @return  This returns a driver
 */
	public WebDriver initDriver(String browserName) {

		System.out.println("you have provided a browser  " + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		}
		else {
			System.out.println("please pass correct browse");
		}
		return driver;

	}
	
	
	public void luanchUrl(String url) {
		if(url == null) {
			System.out.println("url is null");
			return;
		}
		
		driver.get(url);
		
		
		
	}
	
	public String getPageTitle() {
		
		String title= driver.getTitle();
		System.out.println("title is " + title);
		return title;
	} 
	
	public String getPageUrl() {
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("title is " + currentUrl);
			return currentUrl;
	}

}
