package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;


public class orderSettings extends baseClass{
	private static TestData TD = new TestData();

	@Test
	public static void EnableOrderSettings() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_OrderSettings, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.OrderSettins);
			Thread.sleep(2000);
			validationspages.ordersettingspage();
			Thread.sleep(2000);	
			EnableAllReqCheckBoxes();
		}
	}
	
	public static void EnableAllReqCheckBoxes() throws Exception {
		logger.info("coming here");
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableReductionOrdersCheckBoxlist) 
				&& Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableNegativeQuantityCheckBoxlist)
				&& Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableZeroQuantityCheckBoxlist)
				&& Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOptionalPriceforOrdersCheckBoxlist)
				&& Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableEnhancedCommerceOrderslist)
				&& Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOrderEventsCheckBoxlist)
				) {
			logger.info("User is Enabled the All the Requied Check Boxs On the Order Settings crmpopUp.");
			test.pass("User is Enabled the All the Requied Check Boxs On the Order Settings crmpopUp.");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveOrderSettings);
		}else {
			logger.info("elseblock");
			EnableReductionOrdersCheckBox();
			EnableNegativeQuantityCheckBox();
			EnableEnhancedCommerceOrders();
			EnableZeroQuantityCheckBox();
			EnableOptionalPriceforOrdersCheckBox();
			EnableOrderEventsCheckBox();
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveOrderSettings);
		}
	}
	public static void EnableReductionOrdersCheckBox() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableReductionOrdersCheckBoxlist)) {
			logger.info("User is Enabled the Check Box of Enable Reduction Orders.");
			test.pass("User is Enabled the Check Box of Enable Reduction Orders.");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableReductionOrdersCheckBox);
			test.pass("User is Enabled the Check Box of Enable Reduction Orders.");
		}
	}

	public static void EnableNegativeQuantityCheckBox() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableNegativeQuantityCheckBoxlist)) {
			logger.info("User is Enabled the Check Box of Enable Negative Quantity.");
			test.pass("User is Enabled the Check Box of Enable Negative Quantity.");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableNegativeQuantityCheckBox);
			test.pass("User is Enabled the Check Box of Enable Negative Quantity.");
		}
	}
	
	public static void EnableEnhancedCommerceOrders() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableEnhancedCommerceOrderslist)) {
			logger.info("User is Enabled the Check Box of Enhanced Commerce Orders.");
			test.pass("User is Enabled the Check Box of Enhanced Commerce Orders.");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableEnhancedCommerceOrders);
			test.pass("User is Enabled the Check Box of Enhanced Commerce Orders.");
		}
	}

	public static void EnableZeroQuantityCheckBox() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableZeroQuantityCheckBoxlist)) {
			logger.info("User is Enabled the Check Box of Enable Zero Quantity.");
			test.pass("User is Enabled the Check Box of Enable Zero Quantity.");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableZeroQuantityCheckBox);
			test.pass("User is Enabled the Check Box of Enable Zero Quantity.");
		}
	}

	public static void EnableOptionalPriceforOrdersCheckBox() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOptionalPriceforOrdersCheckBoxlist)) {
			logger.info("User is Enabled the Check Box of Enable Optional Price for Orders");
			test.pass("User is Enabled the Check Box of Enable Optional Price for Orders");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOptionalPriceforOrdersCheckBox);
			test.pass("User is Enabled the Check Box of Enable Optional Price for Orders");
		}
	}

	public static void EnableOrderEventsCheckBox() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOrderEventsCheckBoxlist)) {
			logger.info("User is Enabled the Check Box of Enable Order Events");
			test.pass("User is Enabled the Check Box of Enable Order Events.");
		}else {
			logger.info("user Not checked this check box");
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.EnableOrderEventsCheckBox);
			test.pass("User is Enabled the Check Box of Enable Order Events.");
		}
	}

}
