package com.seleniumexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
    System.setProperty("WebDriver.Chrome.Driver","\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.path2usa.com/travel-companion/");
    driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
    while(!driver.findElement(By.cssSelector("[class='datepicker-day'][class='datepicker-swith']")).getText().contains("April"));
    		{
    	     driver.findElement(By.cssSelector("[class=''")).click();
    		}
    List<WebElement> dates = driver.findElements(By.className("day"));
    int count = driver.findElements(By.className("day")).size();
    for(int i=0;i<count;i++)
    {
    	String text = driver.findElements(By.className("day")).get(i).getText();
    	if(text.equalsIgnoreCase("23"))
    	{
    		driver.findElements(By.className("day")).get(i).click();
    		break;
    	}
    }
    
	}

}
