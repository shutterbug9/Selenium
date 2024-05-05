package com.learnautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;


public class LoginTestApp extends BaseClass {
	
	@Test
	public void loginApp() {
		
		
		//Adding logs to the extent report
		logger = report.createTest("Login to App");
		
		//System.out.println(driver.getTitle());
		
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		//Adding log type such as info,pass, fail to the extent report
		logger.info("Starting Application");
		
		//loginPage.loginToApp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		logger.pass("Login Success");
		
	}
	
	@Test
	public void IncorrectUsername() {
		
		driver.findElement(By.name("username")).sendKeys("Student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	@Test
	public void IncorrectPassword() {
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
}



