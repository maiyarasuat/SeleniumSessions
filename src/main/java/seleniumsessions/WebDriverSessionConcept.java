package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();// sid=46bbdab50e49f3c742d

		driver.get("https://www.amazon.com");// sid=46bbdab50e49f3c742d

		System.out.println(driver.getTitle());// sid=46bbdab50e49f3c742d7d0d7251e4128)

		System.out.println(driver.getCurrentUrl());// sid=123

		driver.quit();// sid=123
		// driver.close();
		// System.out.println(driver.getCurrentUrl());// sid=
		// NoSuchSessionException: Session ID is null. Using WebDriver after calling
		// quit()?

		driver = new ChromeDriver();// sid=4565
		driver.get("https://www.flipkart.com");// sid=4565
		System.out.println(driver.getTitle());// sid=4565
		driver.close();

	}

}
