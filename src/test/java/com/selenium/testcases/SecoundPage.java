package com.selenium.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.testbase.BaseTestClass;

public class SecoundPage extends BaseTestClass {

	@Test
	public void testClickOneTimeSection() {

		webDriver.findElement(By.id("menu_time_viewTimeModule")).click();
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
