package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		Thread.sleep(2000);
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		
		
		
		
		
		
	}

}
