package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free/");
		Thread.sleep(1000);
		By country = By.id("Form_getForm_Country");

		if (getDropDownTextList(country).contains("Indian")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));

		List<WebElement> optionsLists = select.getOptions();
		List<String> optionTextList = new ArrayList<String>();

		for (WebElement e : optionsLists) {
			String text = e.getText();
			optionTextList.add(text);

		}
		return optionTextList;
	}

}
