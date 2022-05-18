package com.automationpractice.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Barbie Sirena")).click();
		
		Thread.sleep(2000);
		
		String productTitle = driver.findElement(By.id("productTitle")).getText();
		
		System.out.println("productTitle: " + productTitle);
		driver.quit();

	}

}
