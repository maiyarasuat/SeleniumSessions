package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisplayedTextField {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		By textFiled = By.id("pass");
		// driver.findElement(textFiled).sendKeys("can enter");
		// org.openqa.selenium.ElementNotInteractableException:
		Boolean flag = driver.findElement(textFiled).isEnabled();
		System.out.println(flag);
		Boolean flag1 = driver.findElement(textFiled).isDisplayed();
		System.out.println(flag1);
		String att_val = driver.findElement(By.id("pass")).getAttribute("disabled");
		System.out.println(att_val);

	}

	public static Boolean checkElementIsDisplayed(By locator) {
		String valu = getElement(locator).getAttribute("disabled");
		if (valu.equals("true")) {
			return true;
		}
		return false;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
