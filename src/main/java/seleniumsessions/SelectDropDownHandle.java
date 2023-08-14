package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free/");
		Thread.sleep(1000);
		By country = By.id("Form_getForm_Country");
//
//		WebElement country_ele = driver.findElement(country);
//		Select select = new Select(country_ele);
//		// select.selectByIndex(5);
//		// select.selectByVisibleText("India");
//		select.selectByValue("Bhutan");

		// if 10 dropdown available on same page you need to create 10 diff obj for that
//		example : select by state , city ... 

		//doSelectDropdownByIndex(country, 1);
		doSelectDropdownByVisibleText(country, "Brazil");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByIndex(By locator, int index) {

		if (index < 0) {
			System.out.println("please pass the right (+ve) index number");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public static void doSelectDropdownByVisibleText(By locator, String visibleText) {

		if (visibleText == null) {
			System.out.println("dont pass the null value");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);

	}

	public static void doSelectDropdownByValue(By locator, String value) {

		if (value == null) {
			System.out.println("dont pass the null value");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

}
