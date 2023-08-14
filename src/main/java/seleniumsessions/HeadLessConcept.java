package seleniumsessions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {

		// ChromeOptions co = new ChromeOptions();
		// co.setHeadless(true);--deprecated
		// co.addArguments("--headless=new");
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");//new is only apllicable for chromeBrowser(chrome=new).
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		//safarioptions-- safari browser are not support headless mode.
		
		
		

		// WebDriver driver = new ChromeDriver(co);
//		FirefoxDriver driver = new FirefoxDriver(fo);
		EdgeDriver driver = new EdgeDriver(eo);
		driver.get("https://www.Ajio.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
