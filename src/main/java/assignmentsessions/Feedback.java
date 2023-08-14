package assignmentsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feedback {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/feedback-form/ExperienceWithUsMain");
		driver.findElement(By.className("ExperienceWithUs_item_desc__en8YT")).click();
		driver.findElement(By.xpath("//span[text()='Add another flight']")).click();
		
		
		
		
		
		
	}

}
