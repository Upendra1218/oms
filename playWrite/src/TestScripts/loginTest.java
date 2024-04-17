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
		loginDetails();
		
        Thread.sleep(15000);
        
    }
	
	public static void loginDetails() throws Exception {
		crmpopUp = page.waitForPopup(()->{
			Actions.click(page, "a[target='_blank']");
		});
		crmpopUp.waitForLoadState();
		crmpopUp.navigate(TD.baseURL);
		crmpopUp.fill(CrmXpaths.userName, TD.userName);
		Thread.sleep(1000);
		// Enter password
		crmpopUp.fill(CrmXpaths.Pwd, TD.password);
		Thread.sleep(1000);
		// Click on the login button
		crmpopUp.click(CrmXpaths.loginBtn);
		Thread.sleep(5000);
		
		Locator elementHandle = crmpopUp.locator("div#brandBand_2");
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
	}

}
