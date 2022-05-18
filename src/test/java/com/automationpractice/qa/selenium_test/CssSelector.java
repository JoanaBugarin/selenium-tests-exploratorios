package com.automationpractice.qa.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelector {

	public static void main(String[] args) {
		
		/*
		 ******** Creando Selector CSS usando atributos ********
		 * Sintaxis: TagName[Att1=Value]
		 * Si Att1 es 'id' se puede reemplazar por #
		 * Si Att1 es 'class' se puede reemplazar por .
		 * Ejemplo: div#u123 Ejemplo2: span.layerParent
		 */

		System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/-/es/");
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		driver.findElement(By.partialLinkText("Amazon Music")).click();
		WebElement podcast = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Podcast")));
		podcast.click();
		Boolean llegaUrlFinal = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://www.amazon.com/-/es/music/lp/podcasts?ref_=nav_em__dm_nav_rh_0_2_2_4"));
		if (llegaUrlFinal == true) {
			System.out.println("Test pasó");
		} else {
			System.out.println("Test no pasó");
		}
		driver.quit();
		
	}

}
