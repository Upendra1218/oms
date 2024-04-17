package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;

public class CreateOrderDeliveryMethods extends baseClass{

	private static TestData TD = new TestData();
	@Test
	public static void createNewDeliveryMethods() throws Exception {
		//loginTest.loginDetails();
		Thread.sleep(5000);
		if(isLoggedIn) {
			Actions.click(crmpopUp, CrmXpaths.APP_LAUNCHER);
			Thread.sleep(5000);
			Actions.sendKeys(crmpopUp, CrmXpaths.APP_LAUNCHER_SEARCH,TD.QuickFindBox_Input_OrderDeliveryMethod, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(3000);
			Actions.click(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_TAB);
			Thread.sleep(5000);
			if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.LIST_VIEW_ORDER_DELIVERY_METHOD)) {
				Thread.sleep(2000);
				Actions.click(crmpopUp, CrmXpaths.NEW_ORDER_DELIVERY_METHOD);
				Thread.sleep(1000);
				Actions.sendKeys(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_NAME,TD.Input_Prodcut_Name, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(1000);
				Actions.sendKeys(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_CODE,TD.Input_Prodcut_Code, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(2000);
				Actions.click(crmpopUp, CrmXpaths.ACTIVE_CHECKBOX);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.PRODUCT_SHIPPING);
				Actions.sendKeys(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_DESCRIPTION,TD.IP_Prodcut_Description, TD.QuickFindBox_IP_FieldName);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_LIST_BOX);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_METHOD);
				Thread.sleep(1000);
				Actions.click(crmpopUp, CrmXpaths.ORDER_DELIVERY_METHOD_SAVE_BTN);
			}
			//orgEditionValidations.VerifyCompanypagelayout();
			Thread.sleep(5000);
			//orgEditionValidations.VerifyorgValidation();
		}

		Thread.sleep(3000);
		crmpopUp.close();
		Thread.sleep(3000);

	}

}
