package com.seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Project1 {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
  WebDriver driver = new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("ind");
  Thread.sleep(3000);
  List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
  for(WebElement option:options)
  {
	  if(option.getText().equalsIgnoreCase("India"))
	  {
		  option.click();
		  break;
	  }
  }
	  
  driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
  driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
  driver.findElement(By.xpath("//a[@value='MAA']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
  driver.findElement(By.id("familyandfriend")).click();
  driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
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
  WebElement staticDropdown = driver.findElement(By.xpath("//select[name='ctl00$mainContent$DropDownListCurrency']"));
  Select dropdown = new Select(staticDropdown);
 dropdown.selectByIndex(0);
 System.out.println(dropdown.getFirstSelectedOption().getText());
 Thread.sleep(2000);
//dropdown.selectByVisibleText("AED");
 System.out.println(dropdown.getFirstSelectedOption().getText()); 
 Thread.sleep(2000); 
 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); 
  
	}

}
