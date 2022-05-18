package com.automationpractice.qa.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dezlearn.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
