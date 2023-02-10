package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) {
   System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/");
	//driver.get("http://admin:admin@the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Basic Auth")).click();
	}

}
