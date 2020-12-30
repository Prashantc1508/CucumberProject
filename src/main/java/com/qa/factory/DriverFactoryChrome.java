package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryChrome {

	
	//1. initialise webdriver
	
		public static WebDriver driver;
		//2 creating a method
		
		public static WebDriver init_driver_crome(String browser) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "G:\\software\\chromedriver_win32\\chromedriver.exe");
				
				System.out.println("Browser is initialised" +browser);
			}
			else {
				System.out.println("Browser is not initialised" +browser);
			}
			return getDriverChrome();
		}
		
		public static synchronized WebDriver getDriverChrome() {
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver = driver1;
			return driver;
		}

	
	
}
