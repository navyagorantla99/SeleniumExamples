package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assesment2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/angularpractice/");
		   driver.findElement(By.name("name")).click();
		   driver.findElement(By.name("name")).sendKeys("Navya Rani");
		   driver.findElement(By.name("email")).click();
		   driver.findElement(By.name("email")).sendKeys("navyagorantla99@gmail.com");
		   driver.findElement(By.xpath("//input[@type='password']")).click();
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9848863672");
		   driver.findElement(By.id("exampleCheck1")).click();
		   WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		   Select dropdown = new Select(staticDropdown);
		   dropdown.selectByIndex(0);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  driver.findElement(By.id("inlineRadio2")).click();
		  driver.findElement(By.name("bday")).sendKeys("07/03/2022");
		  driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		  System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		  
		   
		
		   
		   
		   
		   
		   
		   
		   
	}

}
