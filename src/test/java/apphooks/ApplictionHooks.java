package apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.factory.DriverFactoryChrome;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplictionHooks {

	//1. prop initilise
	
	private ConfigReader configReader;
	Properties prop;
	private DriverFactory driverfactory;
	private DriverFactoryChrome driverfactoryChrome;
	WebDriver driver;
	
	
	@Before(order=0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		//String value = prop.getProperty("browser");
	}
	
	//2. Launch bowser
	@Before(order=1)
	public void launchBrowser() {
		String browserValue = prop.getProperty("browser");
		 driverfactory = new DriverFactory();
		 
		 // to run as chrome
		// driver = driverfactoryChrome.init_driver_crome(browserValue);
		 driver = driverfactory.init_driver(browserValue);
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot
			String scenarioName = scenario.getName().replaceAll(" ", "_");
			//Byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType<X> );
			//scenario.attach(sourcePath, "image/png", scenarioName);
		}
	}
}
