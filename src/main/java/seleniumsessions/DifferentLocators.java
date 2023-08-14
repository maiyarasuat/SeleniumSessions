package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1.ID:unique locator(attribute)
		// ele1 -- naveen
		// ele2 -- selenium
//		driver.findElement(By.id("selenium")).sendKeys(args);

		// 2.Name:can b duplicate,99% unique(attribute)
		// ele1 -- naveen
		// ele2 -- naveen
		// if multiple same elements are present selenium will intract with first elem
//		driver.findElement(By.name("naveen")).sendKeys("naveen@gmail.com");

		// 3. CLASSNAME:can b duplicate and most of the time duplicate(attribute)
//		driver.findElement(By.className("form-control")).sendKeys("naveen");

		// 4. X-PATH(X-xml) - not an attribute ... address of the element in html dom
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test");
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

//		By fName_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By lName_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By pWord_xpath = By.xpath("//*[@id=\"input-password\"]");
//		By privacypolicy_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		doSendKeys(fName_xpath, "naveentesting");
//		doSendKeys(lName_xpath, "Automation");
//		doSendKeys(pWord_xpath, "test123");
//		doClick(privacypolicy_xpath);
//		doClick(continue_xpath);

		// 5. CSS-SELECTOR(Copy Selector)(not an attribute)(it not contains address of
		// the element like xpath)
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9887462656");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
//		
//		By fName_Css = By.cssSelector("#input-firstname");
//		By email_Css = By.cssSelector("#input-email");
//		By pass_Css = By.cssSelector("#input-confirm");
//		By privacy_Css = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
//		By conButton_Css = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
//		doSendKeys(fName_Css, "Ajith");
//		doSendKeys(email_Css, "ajithbest@gmail.com");
//		doSendKeys(pass_Css, "dostetios");
//		doClick(privacy_Css);
//		doClick(conButton_Css);

		// 6. Link Text - only for links with the text of the link
		// html tag -- <a>
		// attributes ,linktest
		// driver.findElement(By.linkText("Delivery Information")).click();
//		By deliveryInfoLink = By.linkText("Delivery Information");
//		doClick(deliveryInfoLink);

		// 7. Partial LinkText - only for links with the partial text of the link
		// using for long links
//		driver.findElement(By.partialLinkText("Forgotten Password"));
		// forgotten username
		// forgotten password
		// both have forgotten so selenium will click on first forgotten
		// better you use link test instead of using partial link text

		// 8. TAG NAME - html tag , not an attribute, if tagname wil be unique then only
		// ..use tagName(); otherwise not make sense
		// driver.findElement(By.tagName("input")).sendKeys("naveen");
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}
}
