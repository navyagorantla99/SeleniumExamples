package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample3 {

	public static void main(String[] args) {
    System.setProperty("WebDriver.Chrome.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("navyagorantla99@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("984886367");
    driver.findElement(By.xpath("//button[@name='login']")).click();
    System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
    driver.findElement(By.xpath("//a[@class='_97w4']")).click();
    
	}

}
