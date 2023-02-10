package com.seleniumexample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChaildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		Thread.sleep(3000);
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String emailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

	
}
