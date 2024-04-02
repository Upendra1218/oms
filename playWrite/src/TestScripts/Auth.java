package TestScripts;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import baseClass.baseClass;

public class Auth extends baseClass{
	@Test
	public static void main() throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		logger.info("launching");

		Page page = browser.newPage();
		// Navigate to the URL
		page.navigate("https://zzqi-002.dx.commercecloud.salesforce.com/on/demandware.store/Sites-RefArch-Site/en_US");
		Thread.sleep(3000);
		// Maximize the window
		page.setViewportSize(1920, 1080);
		logger.info("launching");
		// Get page title and URL
		String title = page.title();
		System.out.println("Page title is " + title);
		String url = page.url();
		System.out.println("URL is " + url);
		
		page.click("//div[@class='user mr-3 d-none d-lg-block']//span[@class='user-message']");
		Thread.sleep(3000);
		
		test.fail("testcasePassed");

		
		// Enter username
        page.fill("//input[@name='loginEmail']", "salesforcepayment@gmail.com");
        Thread.sleep(1000);
        // Enter password
        page.fill("//input[@name='loginPassword']", "rquNbHzF3G8U@BP");
        Thread.sleep(1000);
        // Click on the login button
        page.click("//button[contains(text(), 'Logqin')]");

        
        Thread.sleep(10000);



        //browserContext.close();
//        page.close();
//        playwright.close();
        //brContext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("login.json")));
		
	}

}
