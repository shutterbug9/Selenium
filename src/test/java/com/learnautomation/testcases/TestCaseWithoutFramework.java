package com.learnautomation.testcases;

import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestCaseWithoutFramework{
	
	@Test(priority = 1)
	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.quit();
		
		
	}
	
	@Test(priority = 2)
	public void IncorrectUsername() {
		
		System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.name("username")).sendKeys("Student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.quit();
	}
	
	@Test(priority = 3)
	public void IncorrectPassword() {
		
		System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.quit();
	}
}