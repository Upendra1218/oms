package validations;

import com.microsoft.playwright.Locator;

import baseClass.baseClass;
import functionality.Actions;
import pages.CrmXpaths;

public class validationspages extends baseClass{

	public static void CompanyInfoHeader() throws InterruptedException {
		test.info("Verify wheather the user is able to login with valid credentials"); 
		// Find the element using CSS selector
		Locator CompanyHeader = crmpopUp.locator(CrmXpaths.companyInfoHeader);
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
		String orgEdition = crmpopUp.frameLocator (CrmXpaths.Iframe). locator("//td[text()='Developer Edition']").textContent();
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

	public static void ordersettingspage() {
		test.info("Verify wheather the user is able to click on the Order Settings on the side Menu"); 
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.OrderSettinsHeader)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Order Settings on the side Menu and Navigated to the Order Settings Page ");
			logger.info("Successfully clicked on the Order Settings on the side Menu and Navigated to the Order Settings Page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}

	public static void personAccountpage() {
		test.info("Verify wheather the user is able to click on the Person Accounts on the side Menu"); 
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PersonAccountsHeader)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Person Accounts on the side Menu and Navigated to the Person Accounts Page ");
			logger.info("Successfully clicked on the Person Accounts on the side Menu and Navigated to the Person Accounts Page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}

	public static void personAccountRecordPage() {
		logger.info("page");
		test.info("Verify wheather the user is able to click on the New button  on the Account Record type");
		if(Actions.findTheElementPresent(CNRTpopUp, CrmXpaths.PA_CRT_Page_Header)) {
			// Success message is displayed
			test.pass("Successfully clicked on the New button  on the Account Record type and Navigated to the New Record Type Creation page ");
			logger.info("Successfully clicked on the New button  on the Account Record type and Navigated to the New Record Type Creation page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}


	public static void personAccountNewRecordPage() {
		test.info("Verify wheather the user is able to Create, New Record creation on the Account Record type"); 
		if(Actions.findTheFrmaAndElementElementPresent(CNRTpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Page_Header)) {
			// Success message is displayed
			test.pass("Successfully User is Created New Account Record type and Navigated to the New Record Type Creation page ");
			logger.info("Successfully User is Created New Account Record type and Navigated to the New Record Type Creation page");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}


	public static void succesfullyCreatedtheRecordType() {
		test.info("Verify wheather the user is able to Create, New Record creation on the Account Record type");
		if (Actions.findTheFrmaAndElementElementPresent(CNRTpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Page_header)) {
			// Success message is displayed
			test.pass("Successfully User is Created New Account Record type and Navigated to the New Record Type page ");
			logger.info("Successfully User is Created New Account Record type and Navigated to the New Record Type page");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}

	public static void OrderManagementPage() {
		test.info("Verify wheather the user is able to click on the Order Management on the side Menu"); 
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.orderManagementHeader)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Order Management on the side Menu and Navigated to the Order Management Page ");
			logger.info("Successfully clicked on the Order Management on the side Menu and Navigated to the Order Management Page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}

	}

	public static void OmniChannel() {
		test.info("Verify wheather the user is able to click on the Omni channel Inverntry on the side Menu"); 
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.OmnichannelHeader)) {
			// Success message is displayed
			// Success message is displayed
			test.pass("Successfully clicked on the Omni Channel Inventry on the side Menu and Navigated to the Omni Channel Inventry Page ");
			logger.info("Successfully clicked on the Omni Channel Inventry on the side Menu and Navigated to the Omni Channel Inventry Page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		}
	}


	public static void ConnectWithB2c() {
		test.info("Verify wheather the user is able to click on the Connect with B2C on the side Menu"); 
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.connectB2cHeader)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
			logger.info("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
		} else {
			logger.info("Element is not visible.");
		}

	}

	public static void PathSettings() {
		test.info("Verify wheather the user is able to click on the Connect with B2C on the side Menu"); 
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.pathsettingsHeader)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
			logger.info("Successfully clicked on the Connect with B2C on the side Menu and Navigated to the Connect with B2C Page ");
		} else {
			logger.info("Element is not visible.");
		} 
	}

	public static void installPackage() {
		test.info("Verify wheather the user is able to Download the package"); 
		if(Actions.findTheElementPresent(instllpopUp, CrmXpaths.downloadCOmpleted)) {
			// Success message is displayed
			test.pass("Successfully clicked on the  install button  on the packeage install page and Download the package ");
			logger.info("Successfully clicked on the  install button  on the packeage install page and Download the package");
		} else {
			logger.info("Element is not visible.");
		} 
	}


	public static void VerifyObjecmanagerClick() throws Exception {
		test.info("Verify wheather the user is able to click on the Object Manager on the Home page"); 
		if (Actions.findTheElementPresent(crmpopUp, CrmXpaths.OM_Header)) {
			// Success message is displayed
			test.pass("Successfully clicked on the Object Manager on the Home page and Navigated to the Object Manager Page ");
			logger.info("Successfully clicked on the Object Manager on the Home page and Navigated to the Object Manager Page ");
			// Perform actions or assertions here for the success case
		} else {
			logger.info("Element is not visible.");
		} 
	}
	
	public static void VerifyProductClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the Product on the Object Manager page"); 
		   Thread.sleep(5000);
	       if (Actions.findTheElementPresent(crmpopUp, CrmXpaths.product_Header)) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the Project on the Object Manager page and Navigated to the Product Page ");
	           logger.info("Successfully clicked on the Project on the Object Manager page and Navigated to the Product Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	}
	
	public static void VerifyFieldandReloationsClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the FieldandReloations on the product page"); 
		   Thread.sleep(3000);
	       if (Actions.findTheElementPresent(crmpopUp, CrmXpaths.product_FR)) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the FieldandReloations on the product page and Navigated to the FieldandReloations Page ");
	           logger.info("Successfully clicked on the FieldandReloations on the product page and Navigated to the FieldandReloations Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	}
	
	public static void VerifyNewPicklistClick() throws Exception {
		   test.info("Verify wheather the user is able to click on the product family on the product family and edit page page"); 
	       if (Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Page_header)) {
	           // Success message is displayed
	       	   test.pass("Successfully clicked on the prodcut family on the product page and Navigated to the prodcut family Page ");
	           logger.info("Successfully clicked on the prodcut family on the product page and Navigated to the prodcut family Page ");
	           // Perform actions or assertions here for the success case
	       } else {
	    	   logger.info("Element is not visible.");
	       } 
	}


}
