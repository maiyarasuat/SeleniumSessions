package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// fetch the link
		By forgotPassword = By.linkText("Forgotten Password");

		By fn_Name = By.id("input-firstname");

		By logoImage = By.className("img-responsive");

		String forgotpwd_href = driver.findElement(forgotPassword).getAttribute("href");
		System.out.println(forgotpwd_href);
//
//		String fn_placeholder_value = driver.findElement(fn_Name).getAttribute("placeholder");
//		System.out.println(fn_placeholder_value);
//
//		WebElement logo_ele = driver.findElement(logoImage);
//		String src_ele = logo_ele.getAttribute("src");
//		String title_ele = logo_ele.getAttribute("title");
//		String alt_ele = logo_ele.getAttribute("alt");
//
//		System.out.println(src_ele);
//		System.out.println(title_ele);
//		System.out.println(alt_ele);
//
//		String src_value = getElementAttributeName(logoImage, "src");
//		String title_value = getElementAttributeName(logoImage, "title");
//		String alt_value = getElementAttributeName(logoImage, "alt");
//		String placeholder_value = getElementAttributeName(fn_Name, "placeholder");
//		
//		//System.out.println(src_value+" "+title_value+" "+alt_value+" "+placeholder_value+" ");
//		//https://naveenautomationlabs.com/opencart/image/catalog/opencart-logo.pngnaveenopencart naveenopencart First Name 
//		System.out.println(src_value);
//		System.out.println(title_value);
//		System.out.println(alt_value);
//		System.out.println(placeholder_value);
		//https://naveenautomationlabs.com/opencart/image/catalog/opencart-logo.png
//		naveenopencart
//		naveenopencart
//		First Name


	}

	public static String getElementAttributeName(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
