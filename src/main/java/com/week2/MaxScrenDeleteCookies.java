package com.week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxScrenDeleteCookies {

	public static void main(String[] args) {
  System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
  WebDriver driver = new ChromeDriver();	
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
//driver.manage().deleteCookieNamed("sessionKey");
//click on any link
  //login page - verify login url
  driver.get("http://google.com");
	}

}
