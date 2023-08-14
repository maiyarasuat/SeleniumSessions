package testNgSessions;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void connectWithDb() {
		System.out.println("BS----connectWithDb");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT----createUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC----launchBrowser");
	}

	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM---logintoApp");
	}

	@Test
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
