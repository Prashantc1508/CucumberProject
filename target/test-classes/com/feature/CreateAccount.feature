@CreateAccount
Feature: Create Account Feature
Scenario: Create Account scenario

Given User navigates to create account page
When User enters account details
	| First Name | Last Name | Mobile Number | New Password | Gender |
	| Prashant   | Chaudhary | 9536367385	   | Password     | Male   |
	#When User enters account details
	#| First Name | Last Name | Mobile Number | New Password | DOB 			 | Gender |
	#| Prashant   | Chaudhary | 9536367385	   | Password     | 15/08/1994 | Male   |
And User clicks on SignIn button