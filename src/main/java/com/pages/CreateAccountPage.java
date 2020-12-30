package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

	WebDriver driver;

	private By firstName = By.id("u_0_n");
	private By lastName = By.id("u_0_p");
	private By mobileNumber = By.id("u_0_s");
	private By newPassword = By.id("password_step_input");
	private By male = By.xpath("");
	private By signUp = By.id("u_0_14");
	
 
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createAccountUrl(String url) {
		driver.get(url);
	}

	public void enterAccountInfo(String fname, String lname, String mnumber, String nPassword, String gender) {
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(mobileNumber).sendKeys(mnumber);
		driver.findElement(newPassword).sendKeys(nPassword);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(male).click();
	}
	
	public void clickOnsignUpButton() {
		driver.findElement(signUp).click();
	}
}
