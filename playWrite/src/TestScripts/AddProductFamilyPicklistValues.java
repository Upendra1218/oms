package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class AddProductFamilyPicklistValues extends baseClass{
	
private static TestData TD = new TestData();
	
    @Test
	public static void picklist() throws Exception {
    	loginTest.loginDetails();
    	
		if(isLoggedIn) {
			Actions.click(crmpopUp,CrmXpaths.ObjectManager);
			Thread.sleep(3000);
			validationspages.VerifyObjecmanagerClick();
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_Product, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.productOM);
			validationspages.VerifyProductClick();
			Thread.sleep(2000);
			Actions.click(crmpopUp,CrmXpaths.product_O_FR);
			validationspages.VerifyFieldandReloationsClick();
			Thread.sleep(2000);
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_ProductFamily, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.product_O_FR_PF);
			//validationspages.VerifyNewPicklistClick();
			Thread.sleep(5000);
			if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.product_FH_ALE)) {
				logger.info("pick list already added");
			}else {
				Thread.sleep(2000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.product_O_FR_PF_N);
				Thread.sleep(5000);
				//ProductFamailyValidations.VerifyNewPicklistClick();
				Thread.sleep(2000);
				Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.product_O_FR_PF_TA, TD.QuickFindBox_Input_ProductFamily_Data);
				Thread.sleep(1000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.product_O_FR_PF_S);
				Thread.sleep(2000);
				//ProductFamailyValidations.VerifyNewPicklistClick();
			}

		}
	}

}
