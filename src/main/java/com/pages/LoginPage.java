package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//1. By locatores
	private By mailId = By.id("email");
	private By passID = By.id("pass");
	private By logginBtn = By.id("u_0_b");
	
	//2. creating the construcor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	} 
	
	//3. java methods
	public void enterUserName(String userName) {
		driver.findElement(mailId).sendKeys(userName);
	}
	public void enterUserPassword(String password) {
		driver.findElement(passID).sendKeys(password);
	}
	public void loginButton() {
		driver.findElement(logginBtn).click();
	}
}
