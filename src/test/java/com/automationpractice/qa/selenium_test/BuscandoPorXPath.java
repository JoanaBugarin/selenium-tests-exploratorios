package com.automationpractice.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscandoPorXPath {

	/*
	 * Busca por el XPath relativo los campos de correo y password en 
	 * el login de Facebook y escribe en cada uno
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("woolita@hotmail.es");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xxxxxx");
		driver.quit();
	}

}
