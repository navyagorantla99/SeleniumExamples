package com.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentications {

	public static void main(String[] args) {
   System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Basic Auth")).click();
	}
	

}
