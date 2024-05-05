package com.learnautomation.testcases;

import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestCaseWithoutFramework{
	
	@Test
	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.quit();
		
		
	}
}