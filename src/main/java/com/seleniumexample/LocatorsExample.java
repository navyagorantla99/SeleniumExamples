package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("Webdriver.Chrome.driver", " \"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("navyagorantal99@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9848863672");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
         driver.findElement(By.className("")).getText();
	}

}
