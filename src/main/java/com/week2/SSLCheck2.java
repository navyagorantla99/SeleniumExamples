package com.week2;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck2 {

	public static void main(String[] args) {
 ChromeOptions options = new ChromeOptions();
 Proxy proxy = new Proxy();
 proxy.setHttpProxy("ipaddress:4444");
 options.setCapability("proxy",proxy);
 Map<String, Object>prefs = new HashMap<String,Object>();
 prefs.put("download.default_directory", "/directory/path");
 options.setExperimentalOption("Prefs", prefs);
// ChromeOptions options = new ChromeOptions();
 // FirefoxOptions options1 = new FirefoxOptions();
 // EdgeOptions options2 = new EdgeOptions();
  options.setAcceptInsecureCerts(true);
  System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	
 
	}

}
