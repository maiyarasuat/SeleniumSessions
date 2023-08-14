package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;

/**
 * 
 * @author maiyarasu
 *
 */
public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is initalize the driver on the basis of browser name & valid
	 * browsers are chrome/edge/firefox,safari.
	 * 
	 * @param browserName
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("your browser name is:" + browserName);

		if (browserName == null) {
			System.out.println("Browser can not be null");
			throw new FrameworkException("BROWSERCANNTOBENULL");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please pass the right browser:" + browserName);
			throw new FrameworkException("NOTVALIDBROWSER");
		}
		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void enterUrl(String url) {
		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new FrameworkException("url should have http");

		}

	}

	public void enterUrl(URL url) {
		if (String.valueOf(url).contains("http(s)")) {
			driver.navigate().to(url);
		} else {
			throw new FrameworkException("url should have http");

		}

	}

	/**
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
