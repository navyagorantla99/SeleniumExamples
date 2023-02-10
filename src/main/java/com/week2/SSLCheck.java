package com.week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
   ChromeOptions options = new ChromeOptions();
  // FirefoxOptions options1 = new FirefoxOptions();
  // EdgeOptions options2 = new EdgeOptions();
   options.setAcceptInsecureCerts(true);
   System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	
	}

}
