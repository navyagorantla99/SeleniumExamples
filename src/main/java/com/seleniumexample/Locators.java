package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driver.findElement(By.id("email")).sendKeys("Navya");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.className("btn-primary")).click();
        

        
        


	}

}
