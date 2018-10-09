package com.selenium.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.selenium.testbase.BaseTestClass;

public class HomePageTest extends BaseTestClass {

	@Test
	public void homePageTest() {
		webDriver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
