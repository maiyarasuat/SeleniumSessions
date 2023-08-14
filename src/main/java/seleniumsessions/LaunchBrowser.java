package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// open the browser
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
//		SafariDriver driver = new SafariDriver();
		
		WebDriver driver = new ChromeDriver();
		
		

		// enter the url:
		driver.get("https://www.google.com");

		// get the title
		String title = driver.getTitle();
		System.out.println("actual title is: " + title);
		System.out.println(driver.getPageSource());

		// verify the title- actual vs expected
		if (title.equals("Amazon")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is incorrect");
		}
		driver.quit();
	}

}
