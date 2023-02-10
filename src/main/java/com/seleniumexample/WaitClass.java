package com.seleniumexample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitClass {

	public static void main(String[] args) {
    System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/blog/index.php/2021/06/05/end-to-end-practice-project-with-complete-methods-in-selenium-python/");
    driver.manage().window().maximize();
   driver.switchTo().alert().accept();
    
   //implicitwait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    //explicitwait
      
    
	}

}
