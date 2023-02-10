package com.seleniumexample;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleItemsAddInEcart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver",
				"\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Tomato", "Beans", "Brinjal" };
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		// MultipleItemsAddInEcart E = new MultipleItemsAddInEcart();
		// E.addItems(driver, itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		String[] itemsNeeded1 = { "Brocolli", "Cucumber", "Tomato", "Beans", "Brinjal" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded1);
			int j = 0;
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded1.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

		/* WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[select='select']"))); */
		//driver.findElement(By.xpath("//select[select='select']")).click();
		driver.findElement(By.cssSelector("input.chkAgree")).click();
	
	
	}

}
