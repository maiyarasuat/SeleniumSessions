package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElememtUtils {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		List<WebElement> imagelists = driver.findElements(images);
//		List<WebElement> linklists = driver.findElements(links);

//		int elecountlists = getElementCount(images);
//		int elecountlists2 = getElementCount(links);
//		System.out.println("total image count list is:" + elecountlists);
//		System.out.println("total link count list is:" + elecountlists2);

		List<String> actelementtextlist = getElementTextList(links);
		System.out.println(actelementtextlist);
		if (actelementtextlist.contains("About Us")) {
			System.out.println("About Us---PASS");
		}
		if(actelementtextlist.contains("Site Map")) {
			System.out.println("Site Map---PASS");
		}

	}

	public static List<String> getElementTextList(By locator) {
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

	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
