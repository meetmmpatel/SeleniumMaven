package com.selenium.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.testbase.BaseTestClass;

public class LogInPage extends BaseTestClass {

	@Test(priority=0)
	public void passUserName() {
		webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@Test(priority=1)
	public void passPassword() {
		webDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Test(priority=2)
	public void logButtonClick() {
		webDriver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(4000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
