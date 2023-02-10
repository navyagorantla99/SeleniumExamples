package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://altoconvertpdftojpg.com");
	
	}

}
