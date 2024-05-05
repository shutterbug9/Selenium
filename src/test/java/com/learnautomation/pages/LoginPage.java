package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
		//super(ldriver);
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name="username")WebElement uname;
	
	@FindBy(name="password")WebElement pass;
	
	@FindBy(id="submit")WebElement submitButton;
	
	public void loginToApp(String usernameApp, String passwordApp) {
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		uname.sendKeys(usernameApp);
		
		pass.sendKeys(passwordApp);
		
		submitButton.click();
		
		
	}
	
}
