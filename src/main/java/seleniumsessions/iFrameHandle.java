package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();

		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		Thread.sleep(1000);

		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("naveenautomation");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Labs");

		driver.switchTo().defaultContent();
		String info = driver.findElement(By.id("tooltip")).getText();
		System.out.println(info);

	}

}
