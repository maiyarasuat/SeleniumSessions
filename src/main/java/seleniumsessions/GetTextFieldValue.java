package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn_Name = By.id("input-firstname");
		
		driver.findElement(fn_Name).sendKeys("BestTravlesandTransport");
//		String fn_name = driver.findElement(fn_Name).getText(); //it willn't print anything
//		System.out.println(fn_name);
		
		String att_value = driver.findElement(fn_Name).getAttribute("value");
		System.out.println(att_value);
		
		
		
	}

}
