package validations;

import com.microsoft.playwright.Locator;

import baseClass.baseClass;
import pages.CrmXpaths;

public class validationspages extends baseClass{
	
	public static void CompanyInfoHeader() throws InterruptedException {
	test.info("Verify wheather the user is able to login with valid credentials"); 
	// Find the element using CSS selector
    Locator CompanyHeader = page.locator(CrmXpaths.companyInfoHeader);
    logger.info(CompanyHeader);
    // Check if the element is found
    if (CompanyHeader != null) {
        // Element is found
    	test.pass("Successfully Clicked on the company Info link and Navigated to the company Information page");
        System.out.println("Element is found: " + CompanyHeader);
        isLoggedIn = true;
    } else {
        // Element is not found
        System.out.println("Element is not found");
    }
    Thread.sleep(5000);
	}
	
	public static void VerifyorgValidation() {
		test.info("Verify wheather the user is able to login with valid credentials of Developer edition"); 
		String orgEdition = page.frameLocator (CrmXpaths.Iframe). locator("//td[text()='Developer Edition']").textContent();
		System.out.println(orgEdition);
       // Expected alert text
       String expectedAddToCart = "Developer Edition";
       // Check if the actual alert text matches the expected text
       if (orgEdition.equals(expectedAddToCart)) {
           // Success message is displayed
       	   test.pass("Successfully Navigated to the company Information page, org edition is Developer Edition");
           logger.info("Successfully Navigated to the company Information page, org edition is Developer Edition");
           // Perform actions or assertions here for the success case
       } else {
    	   logger.info("Element is not visible.");
       }
	 }
	

}
