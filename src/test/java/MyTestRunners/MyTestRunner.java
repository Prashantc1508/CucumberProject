package MyTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\prashant\\eclipse-workspace\\CucumberEclipse\\Pras\\src\\test\\resources\\com\\feature",
		glue = {"com.stepdeff","apphooks"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = "@CreateAccount"
		)

public class MyTestRunner {

	
	
}
