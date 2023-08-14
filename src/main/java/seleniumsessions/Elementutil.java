package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CustomException.FrameworkException;

public class Elementutil {// util class shouldn't have static keyword
	// if use static these methods will go to CMA
	// 1 copy will be created

	private WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;

	}

	public Boolean checkElementIsDisplayed(By locator) {
		String valu = getElement(locator).getAttribute("disabled");
		if (valu.equals("true")) {
			return true;
		}
		return false;
	}

	public String getElementAttributeName(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public Boolean checkElemIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text is:" + eleText);
		return eleText;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;// here bcoz need element access to this method over try block only
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("getting element exception pls check the locator again");
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(locator);
		return element;
		// concept - if element(locator) is getting nosuchele excep we will handled it
		// properly
		// then use thread.sleep to wait our driver to 2 secs
		// after 2 scs we will give another chance to line - 57
		// then return element

	}

	public void doSendKeys(By locator, String value) {

		if (value == null) {
			throw new FrameworkException("CANNOTENTERNULLVALUE");

		}
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public List<String> getElementTextList(By locator) {
		List<WebElement> elelist = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// physical capacity - 0
		for (WebElement e : elelist) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	// ***************DropDown Utils***************
	public void doSelectDropdownByIndex(By locator, int index) {

		if (index < 0) {
			System.out.println("please pass the right (+ve) index number");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectDropdownByVisibleText(By locator, String visibleText) {

		if (visibleText == null) {
			System.out.println("dont pass the null value");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);

	}

	public void doSelectDropdownByValue(By locator, String value) {

		if (value == null) {
			System.out.println("dont pass the null value");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

}
