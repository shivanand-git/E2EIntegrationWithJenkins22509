package com.test.automation.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_0002_LaunchSauceDemoLogout {
	
	
	WebDriver driver;
	
	@Test
	
	public void tc_0001_launchApplication() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.close();
	}
	

}
