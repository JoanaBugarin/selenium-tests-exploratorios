package com.automationpractice.qa.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com");
		System.out.println(driver.getTitle());
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		/*
		 * regresa a la página anterior (google)
		 */
		driver.navigate().back();
		System.out.println(driver.getTitle()); //google
		
		/*
		 * botón siguiente, vuelve a la página posterior
		 */
		driver.navigate().forward();
		System.out.println(driver.getTitle()); //facebook
		
		/*
		 * Refresca la página, sigue en el mismo sitio
		 */
		driver.navigate().refresh();
		
		/*
		 * Obtener URL
		 */
		System.out.println(driver.getCurrentUrl());
		
		/*
		 * Obtener título
		 */
		System.out.println(driver.getTitle());
		
		/*
		 * Obtener código fuente
		 */
		System.out.println(driver.getPageSource());
		
		/*
		 * Obtener el identificador (window handle)
		 */
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}

}
