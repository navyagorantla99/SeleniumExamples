package com.seleniumexample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {
     System.setProperty("WebDriver.Chrome.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     Actions a = new Actions(driver);
     a.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 ']"))).build().perform();
     
	}

}
