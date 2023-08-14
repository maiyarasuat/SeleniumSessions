package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// create a webelement + perform actions(click,sendkeys,getText,isDisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen123");

		// 2:
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen123");
//		emailId.sendKeys("admin@gmail.com");
//		
		// 3:By locator
//		By email_id = By.id("input-email");
//		By pass_word = By.id("input-password");
//		WebElement email_Id = driver.findElement(email_id);
//		WebElement pass_Word = driver.findElement(pass_word);
//		email_Id.sendKeys("naveen@gmail.com");
//		pass_Word.sendKeys("naveen123");

		// 4:By locator with webelement genric method
//		By email_id = By.id("input-email");
//		By pass_word = By.id("input-password");
//		getElement(email_id).sendKeys("naveen@gmail.com");
//		getElement(pass_word).sendKeys("naveen123");

		// 5:By locator with webelement and action genric method
//		By email_id = By.id("input-email");
//		By pass_word = By.id("input-password");
//		
//		doSendKeys(email_id, "naveen@gmail.com");
//		doSendKeys(pass_word, "naveen123");

		// 6:By locator with webelement and action genric method in utility class
		By email_id = By.id("input-email");
		By pass_word = By.id("input-password");

		Elementutil elemUtil = new Elementutil(driver);
		elemUtil.doSendKeys(email_id, "naveen@gmail.com");
		elemUtil.doSendKeys(pass_word, "naveen123");

		// 7:By locator with webelement and action genric method in utility class
		// using caller class(LoginTest.java) to call brwUtil and elemUtil

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
