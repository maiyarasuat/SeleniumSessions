package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//valid but not recommended
//		SearchContext sc = new ChromeDriver();
//		sc.findElement(null);
		
		//valid and recommended(get all methods)
		//WebDriver driver = new ChromeDriver();
		
		//valid and recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//valid for only chrome and edge
//		ChromiumDriver driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver();
		
		//valid and rec--used to remote execution/sel grid/cloud-- aws/browser stack/LT
		//WebDriver driver = new RemoteWebDriver(null, null);
		
		
		
		
		
		
	}

}
