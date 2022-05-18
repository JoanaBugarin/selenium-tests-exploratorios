package com.automationpractice.qa.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrearXPathRelativoUsandoTexto {
	
	/*
	 * XPath relativo usando texto
	 * Sintaxis: //TagName[text()="Text"]
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Woolita/eclipse-workspace_ArgentinaP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='¿Olvidaste tu contraseña?']")).click();
		Boolean llegaUrlFinal = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0"));
		if (llegaUrlFinal) {
			System.out.println("Resultado esperado: redirección a recuperación de pass");
		} else {
			System.out.println("Test  no pasó, no llegó a url esperada");
		}
		driver.quit();
	}

}
