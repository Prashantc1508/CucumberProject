package com.stepdeff;

import java.util.List;
import java.util.Map;

import com.pages.CreateAccountPage;
import com.qa.factory.DriverFactory;
import com.qa.factory.DriverFactoryChrome;
import com.qa.util.ConfigReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateAccountStep {

	private CreateAccountPage createAccountPage = new CreateAccountPage(DriverFactory.getDriver());
	ConfigReader read = new ConfigReader();

	@Given("User navigates to create account page")
	public void user_enter_username() {
		String url = read.init_prop().getProperty("createAccountURL");
		createAccountPage.createAccountUrl(url);
	}
	
	@When("User enters account details")
	public void user_enter_username(DataTable accountData) {
	List<Map<String, String>> data = accountData.asMaps();
	String fName = data.get(0).get("First Name");
	String lName = data.get(0).get("Last Name");
	String mNumber = data.get(0).get("Mobile Number");
	String nPassword = data.get(0).get("New Password");
	String gender = data.get(0).get("Gender");
	createAccountPage.enterAccountInfo(fName, lName, mNumber, nPassword, gender);
	}	
	
	@And("User clicks on SignIn button")
	public void clickOnSign() {
		createAccountPage.clickOnsignUpButton();
	}
	
	//9639882488 --arvind kumar pradhan 
	
}
