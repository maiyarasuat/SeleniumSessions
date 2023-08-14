package assignmentsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By links = By.tagName("a");

		List<WebElement> all_links = driver.findElements(links);
		System.out.println("total links are:" + all_links.size());
		
		
		for(WebElement e : all_links) {
			String href_val = e.getAttribute("href");
			System.out.println(href_val);
		}
		
		
		
		

	}

}
