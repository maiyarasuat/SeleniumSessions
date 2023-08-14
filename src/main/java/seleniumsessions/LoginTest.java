package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {

		BrowserUtil brwUtil = new BrowserUtil();
		WebDriver driver = brwUtil.launchBrowser("chrome");
		brwUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email_id = By.id("input-email");
		By pass_word = By.id("input-password");

		Elementutil eleUtil = new Elementutil(driver);
		eleUtil.doSendKeys(email_id, "www.best.com");
		eleUtil.doSendKeys(pass_word, "ajith_settu");
		System.out.println("page title is:" + " " + brwUtil.getPageTitle());
		//brwUtil.quitBrowser();
	}

}
