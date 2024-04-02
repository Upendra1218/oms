package pages;

import com.microsoft.playwright.Page;

import data.TestData;

public class LoginPage {
	
	private static TestData TD = new TestData();
	
	 Page  page;
	// 1. String Locators OR
	private static String userName = "//input[@id='username']";
	private static String Pwd = "//input[@id='password']";
	private static String loginBtn = "//input[@id='Login']";
	public static String homeDiv = "//div[@id='brandBand_2']";
	
	
	// 2. page constructor:
	public LoginPage (Page page) {
	 this.page = page;
	}
	
	public void login() throws InterruptedException {
		// Enter username
        page.fill(userName, TD.userName);
        Thread.sleep(1000);
        // Enter password
        page.fill(Pwd, TD.password);
        Thread.sleep(1000);
        // Click on the login button
        page.click(loginBtn);
       
	}

}
