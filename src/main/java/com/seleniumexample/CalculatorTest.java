package com.seleniumexample;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class CalculatorTest {
	public static void main(String[] args) {
		new CalculatorTest().googleCalculator();
	}

	//Tests google calculator
	public void googleCalculator(){
		
	    // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Exaze\\Desktop\\108\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  ō
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();     
	}

}
