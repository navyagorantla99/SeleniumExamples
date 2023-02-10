package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {

	public static void main(String[] args) {
    System.setProperty("WebDriver.Chrome.driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("navya.gorantla@exazeit.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7287029629");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}
	
	
	

}
