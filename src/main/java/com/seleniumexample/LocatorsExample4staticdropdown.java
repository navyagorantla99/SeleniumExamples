package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsExample4staticdropdown {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    WebElement staticDropdown = driver.findElement(By.id("ct100_mainContent_DropDownListCurrency"));
    Select dropdown = new Select(staticDropdown);
   dropdown.selectByIndex(0);
   System.out.println(dropdown.getFirstSelectedOption().getText());
   Thread.sleep(2000);
  dropdown.selectByVisibleText("INR");
   System.out.println(dropdown.getFirstSelectedOption().getText()); 
   Thread.sleep(2000);
   dropdown.selectByValue("AED");
   System.out.println(dropdown.getFirstSelectedOption().getText());
    
	}

}
