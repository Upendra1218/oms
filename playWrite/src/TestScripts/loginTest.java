package TestScripts;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import pages.LoginPage;

public class loginTest extends baseClass{
	
	private static TestData TD = new TestData();
	
	@Test//(dependsOnMethods = {"testScripts.CheckTheOrgEditionTests.VerifyingCompanyInfoSearchAndOrgEdition"})
    public void Verifyinglogin()throws Exception {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login();
		logger.info("coming");
		// Check if the login form is visible
		// Find the element using CSS selector
        Locator elementHandle = page.locator("div#brandBand_2");
        logger.info(elementHandle);
        // Check if the element is found
        if (elementHandle != null) {
            // Element is found
        	test.pass("Successfully page is user is login to salesforce");
            System.out.println("Element is found: " + elementHandle);
            isLoggedIn = true;
        } else {
            // Element is not found
            System.out.println("Element is not found");
        }
        Thread.sleep(5000);
        
    }

}
