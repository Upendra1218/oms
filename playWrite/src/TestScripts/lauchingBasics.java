package TestScripts;


import java.nio.file.Paths;

import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import baseClass.baseClass;

public class lauchingBasics extends baseClass{
	
	static baseClass testClass = new baseClass();

	@Test
	public static void main12353() throws InterruptedException {
		
		
		
		page.click("//div[@class='user mr-3 d-none d-lg-block']//span[@class='user-message']");
		Thread.sleep(3000);
		

		//testClass.afterMethod(new TestResult());
		
		// Enter username
        page.fill("//input[@name='loginEmail']", "salesforcepayment@gmail.com");
        Thread.sleep(1000);
        // Enter password
        page.fill("//input[@name='loginPassword']", "rquNbHzF3G8U@BP");
        Thread.sleep(1000);
        // Click on the login button
        page.click("//button[contains(text(), 'Login')]");

        

        Thread.sleep(1000);
//		browser.close();
//		playwright.close();
		
		
	}

}
