package com.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/search?q=gmail+login&rlz=1C1CHBF_enIN1034IN1034&oq=&aqs=chrome.0.69i59i450l8.709783400j0j15&sourceid=chrome&ie=UTF-8");
         driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
         driver.findElement(By.xpath("//a[@target='_blank']")).click();
         driver.findElement(By.className("span.laptop-desktop-only")).click();
         driver.findElement(By.className("body.mobile")).click();
	}

}
