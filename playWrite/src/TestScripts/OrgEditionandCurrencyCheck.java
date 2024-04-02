package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class OrgEditionandCurrencyCheck extends baseClass{
	
	private static TestData TD = new TestData();
	
	@Test
	public static void orgEdtitionCheck() throws InterruptedException {
		if(isLoggedIn) {
			Actions.sendKeys(page, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_CompanyInfo, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actions.click(page, CrmXpaths.companyInfo);
			Thread.sleep(2000);
			validationspages.CompanyInfoHeader();
			Thread.sleep(10000);
			validationspages.VerifyorgValidation();
		}
	}
	
	@Test
	public static void currecyIsSetToUsd() throws InterruptedException {
		if(isLoggedIn) {
			if(Actions.findTheFrmaAndElementElementPresent(page, CrmXpaths.Iframe, CrmXpaths.Currency)) {
				logger.info("currency is set to usd");
			}else {
				logger.info("currency is not set to usd");
				Actions.findTheFrameAndClickAction(page, CrmXpaths.Iframe, CrmXpaths.editbutton);
				
				Thread.sleep(10000000);
				
			}
		}
	}

}
