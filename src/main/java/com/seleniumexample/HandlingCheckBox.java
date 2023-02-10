package com.seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("WebDriver.Chrome.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
 WebDriver driver = new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
 System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
 driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
 System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
 
 driver.findElement(By.id("autosuggest")).sendKeys("ind");
 Thread.sleep(3000);
List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']a"));
for(WebElement option :options)
{
	  if(option.getText().equalsIgnoreCase("India"))
	  {
		  option.click();
		  break;
	  }
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.xpath("//a[@value='BLR']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	  
}
	}

}
