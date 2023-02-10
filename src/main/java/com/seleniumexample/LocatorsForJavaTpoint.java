package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsForJavaTpoint {

	public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\mozilla-driver\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("navyagorantla99@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("9848863672");
    driver.findElement(By.name("login")).click();
	}

}
