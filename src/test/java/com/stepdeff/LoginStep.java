package com.stepdeff;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("^User is on login page$")
	public void openUrl() {
		DriverFactory.getDriver().get("https://www.facebook.com");
		System.out.println("URL is =" + DriverFactory.getDriver().getCurrentUrl());
	}
	
	@When("User enters username {string}")
	public void user_enter_username(String username) {
		loginPage.enterUserName(username);
	}
	@And("User enters password {string}")
	public void user_enter_password(String password) {
		loginPage.enterUserPassword(password);
	}
	@And("User clicks on login button")
	public void user_click_on_login_buton() {
		loginPage.loginButton();
	}
}
