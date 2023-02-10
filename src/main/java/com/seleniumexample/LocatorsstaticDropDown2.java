package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsstaticDropDown2 {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("WebDriver.Edge.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\edgedriver\\msedgedriver.exe\"");
  WebDriver driver = new EdgeDriver();
  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  driver.findElement(By.id("divpaxinfo")).click();
  Thread.sleep(2000);
  int i = 1;
  while(i<5)
  {
  driver.findElement(By.id("hrefIncAdt")).click();
  i++;
  }
  driver.findElement(By.id("btnclosepaxoption")).click();
  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
  
  
  
  
	}

}
