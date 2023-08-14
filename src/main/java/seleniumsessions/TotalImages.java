package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By images = By.tagName("img");

		List<WebElement> imagelists = driver.findElements(images);

		System.out.println("total images are:" + imagelists.size());

		for (WebElement e : imagelists) {
			String srcval = e.getAttribute("src");
			String altval = e.getAttribute("alt");
			System.out.println(srcval + ":" + altval);

		}

	}

}
