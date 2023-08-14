package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn_Name = By.id("input-firstname");

		//driver.findElement(fn_Name).sendKeys(null);
		//driver.findElement(fn_Name).sendKeys("");
		//driver.findElement(fn_Name).sendKeys(" ");
		//driver.findElement(fn_Name).sendKeys(123);
		
		String str = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("labs");
		driver.findElement(fn_Name).sendKeys(str,sb,sf);
		
	}
	

}
