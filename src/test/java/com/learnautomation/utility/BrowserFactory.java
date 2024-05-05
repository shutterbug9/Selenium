package com.learnautomation.utility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
		
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {
		
		if(browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
				
			
		}
		else if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
			
			
			System.out.println("Browser not supported");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}
	
}
