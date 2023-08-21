package seleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1.) top casting between webdriver and respective browser classes

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new SafariDriver();
		WebDriver driver2 = new FirefoxDriver();

		// 2.) no cross browser code can be written with this
		ChromeDriver d1 = new ChromeDriver();
		// 3

		RemoteWebDriver d5 = new ChromeDriver();
		// 4 casting between webdriver and remote webdriver

		//WebDriver rwd = new RemoteWebDriver( null, null);

	 // 5
		SearchContext sc = new ChromeDriver();
		
	}

}
