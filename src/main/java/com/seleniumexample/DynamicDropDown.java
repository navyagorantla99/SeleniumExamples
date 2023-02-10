package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("Webdriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
  WebDriver driver = new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
  driver.findElement(By.xpath("//a[@value='BLR']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
  
  
  
	}

}
