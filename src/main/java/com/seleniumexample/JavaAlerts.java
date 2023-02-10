package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		String text = "Navya";
		System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		  driver.findElement(By.id("alertbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 //driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); 
	}

}
