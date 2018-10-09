package com.selenium.testbase;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {

	public static WebDriver webDriver;
	public static Properties config = new Properties();

	@BeforeSuite
	public void setUp() {
		System.out.println("Please enter the browser type frome below:  ");
		System.out.println("The options are Chrome Or Firefox  ");
		Scanner scan = new Scanner(System.in);
		String browser = scan.nextLine();

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-2");
			webDriver = new ChromeDriver();

			webDriver.manage().window().fullscreen();
			webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver");

			webDriver = new FirefoxDriver();

			webDriver.manage().window().fullscreen();
			webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		}
		else {
			try {
				throw new FileNotFoundException();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@AfterSuite
	public void cleanUp() {
		webDriver.quit();
	}

}
