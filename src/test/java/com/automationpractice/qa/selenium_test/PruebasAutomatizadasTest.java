package com.automationpractice.qa.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebasAutomatizadasTest {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://pruebasautomatizadas.foroactivo.com/");
			driver.findElement(By.linkText("FAQ")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.urlToBe("https://pruebasautomatizadas.foroactivo.com/faq"));

			WebElement faqingreso = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText("¿Por qué no puedo ingresar?")));
			faqingreso.click();
			
			String textoEsperado = driver.findElement(By.xpath("//p[contains(text(),'¿Ya te registraste? Debes registrarte en el sistem')]")).getText();
			
			System.out.println(textoEsperado);
			
			driver.quit();
	}

}
