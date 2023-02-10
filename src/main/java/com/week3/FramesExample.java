package com.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {
   System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
   WebDriver driver = new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/nested_frames");
   driver.findElement(By.linkText("Nested Frames")).click();
   driver.switchTo().frame("frame-top");
   driver.switchTo().frame("frame-middle");
   System.out.println(driver.findElement(By.id("content")).getText());
   
	}

}
