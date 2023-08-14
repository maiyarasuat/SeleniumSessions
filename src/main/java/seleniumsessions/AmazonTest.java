package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = " Firefox";

		BrowserUtil brUtil = new BrowserUtil();
//		brUtil.driver = new ChromeDriver();
//		brUtil.driver.get("https://www.amazon.com");
		brUtil.launchBrowser(browserName);
		brUtil.enterUrl("http://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		String urlTitle = brUtil.getPageUrl();
		if(urlTitle.contains("amazon")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url");
		}
		brUtil.quitBrowser();

	}

}
