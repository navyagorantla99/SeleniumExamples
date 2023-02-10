package com.week2;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTheLinksInFooterFirstCoulum {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		
		//open the all links in seperate Tabs
		
		for(int i =1;i<coloumdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickoklinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickoklinkTab);
			Thread.sleep(5000);

			//GET THE TITLES OF EACH AND EVERY TAB
			Set<String> abc = driver.getWindowHandles();
			
			java.util.Iterator<String> iterator = abc.iterator();
			
			while(iterator.hasNext())
			{
				driver.switchTo().window(iterator.next());
				System.out.println(driver.getTitle());
			}
		}
		
		
	}

}
