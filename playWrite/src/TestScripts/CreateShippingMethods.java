package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;

public class CreateShippingMethods extends baseClass{

	private static TestData TD = new TestData();

	@Test
	public static void createPrduct() throws Exception {
//		loginTest.loginDetails();
//		Thread.sleep(5000);
		if(isLoggedIn) {
			Actions.click(crmpopUp, CrmXpaths.APP_LAUNCHER);
			Thread.sleep(3000);
			Actions.sendKeys(crmpopUp, CrmXpaths.APP_LAUNCHER_SEARCH,TD.QuickFindBox_Input_products, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.PRODUCTS_TAB);
			Thread.sleep(5000);
			if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PRODUCT_LIST_DIV)) {
				Thread.sleep(2000);
				Actions.click(crmpopUp, CrmXpaths.NEW_PRODUCT);
				Thread.sleep(1000);
				Actions.sendKeys(crmpopUp, CrmXpaths.PRODUCT_NAME,TD.Input_Prodcut_Name, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(1000);
				Actions.sendKeys(crmpopUp, CrmXpaths.PRODUCT_CODE,TD.Input_Prodcut_Code, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(2000);
				Actions.click(crmpopUp, CrmXpaths.ACTIVE_CHECKBOX);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.PRODUCT_NONE);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.PRODUCT_SHIPPING);
				Actions.sendKeys(crmpopUp, CrmXpaths.PRODUCT_DESCRIPTION,TD.IP_Prodcut_Description, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.PRODUCT_SAVE_BTN);
			}
			//orgEditionValidations.VerifyCompanypagelayout();
			Thread.sleep(5000);
			//orgEditionValidations.VerifyorgValidation();
		}
	}
}
