package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	String expectedTitle=("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	System.setProperty("webdriver.Chrome.driver","\"C:\\Users\\Exaze\\Desktop\\Navya\\seleniumDriver\\chrome-108\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.in");
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	if(expectedTitle.equals(actualTitle))
		System.out.println("Testscript Pass");
	else
		System.out.println("Testscript Fail");
	driver.close();

}
}