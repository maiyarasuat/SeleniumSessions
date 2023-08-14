package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	// open any url
	// get the count of links on d page
	// print text of each link on the console

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By links = By.tagName("a");

		List<WebElement> linklists = driver.findElements(links);
		int linkcount = linklists.size();
		System.out.println("link counts are:" + linkcount);

		// 1.index based loop
//		for (int i = 0; i < linkcount; i++) {
//			String text = linklists.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(i + ":" + text);
//			}
//
//		}
		// for each loop
		int count = 0;
		for (WebElement e : linklists) {
			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(count + ":" + text);

			}
			count++;

		}
	}
}
