package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.cssSelector("button[id='W0wltc']")).click();
		 driver.close();
		 //driver.quit();

		 //System.out.println(driver.getTitle());
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 System.out.println(driver.getTitle());
 
	}

}
