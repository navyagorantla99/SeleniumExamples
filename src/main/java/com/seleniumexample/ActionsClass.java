package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
  System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
  Actions a = new Actions(driver);
  WebElement move= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
  a.moveToElement(move).contextClick().build().perform();
	}

}
