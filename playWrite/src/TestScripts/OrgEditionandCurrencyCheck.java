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
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_CompanyInfo, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(1000);
			Actions.click(crmpopUp, CrmXpaths.companyInfo);
			Thread.sleep(2000);
			validationspages.CompanyInfoHeader();
			Thread.sleep(10000);
			validationspages.VerifyorgValidation();
		}
	}
	
	@Test
	public static void currecyIsSetToUsd() throws InterruptedException {
		if(isLoggedIn) {
			if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.Currency)) {
				logger.info("currency is set to usd");
				test.pass("User is selected Currency field as USD");
			}else {
				logger.info("currency is not set to usd");
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.editbutton);
				Thread.sleep(3000);
				Actions.findIframeandSelectValueFromDropDown(crmpopUp, CrmXpaths.Iframe, CrmXpaths.currncyDropDown, TD.SelectCurrent_IP_CompanyInfo_Value);
				Thread.sleep(3000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.currncySaveBtn);
				Thread.sleep(3000);
				Actions.javascriptAlert();
				Thread.sleep(3000);
				currecyIsSetToUsd();
				Thread.sleep(10000);
				
			}
		}
	}

}
