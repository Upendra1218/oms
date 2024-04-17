package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class AddOrderSummeryStatusPicklistValues extends baseClass{

	private static TestData TD = new TestData();

	@Test
	public static void picklist() throws Exception {
		//loginTest.loginDetails();
		if(isLoggedIn) {
			Actions.click(crmpopUp,CrmXpaths.ObjectManager);
			Thread.sleep(3000);
			validationspages.VerifyObjecmanagerClick();
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_Ordersummery, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.ORDER_SUMMARY_OM);
			Thread.sleep(2000);
			Actions.click(crmpopUp,CrmXpaths.product_O_FR);
			validationspages.VerifyFieldandReloationsClick();
			Thread.sleep(5000);
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_OrderStatus, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.ORDER_SUMMARY_O_FR_PF);
			//validationspages.VerifyNewPicklistClick();
			//ProductFamailyValidations.VerifyNewPicklistClick();
			Thread.sleep(5000);

			InReviewSet();
			ApprovedSet();
			FufilledSet();
			CanceledSet();
			ReturnedSet();

		}
	}

	public static void InReviewSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_IR)) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_N);
			Thread.sleep(5000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_SUMMARY_O_FR_PF_TA, TD.QuickFindBox_Input_OrderStatus_Data_InReview);
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_S);
			Thread.sleep(2000);
		}
	}

	public static void ApprovedSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_AP)) {
			logger.info("pick list already added");
		}else {

			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_N);
			Thread.sleep(5000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_SUMMARY_O_FR_PF_TA, TD.QuickFindBox_Input_OrderStatus_Data_Approved);
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);
			Thread.sleep(2000);

		}

	}

	public static void FufilledSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_FF)) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_N);
			Thread.sleep(5000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_SUMMARY_O_FR_PF_TA, TD.QuickFindBox_Input_OrderStatus_Data_Fufilled);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);
			Thread.sleep(2000);
		}
	}

	public static void CanceledSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_C)) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_SUMMARY_O_FR_PF_TA, TD.QuickFindBox_Input_OrderStatus_Data_Canceled);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);
			Thread.sleep(2000);
		}
	}

	public static void ReturnedSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_R)) {
			logger.info("pick list already added");
		}else {
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_SUMMARY_O_FR_PF_N);
			Thread.sleep(5000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_SUMMARY_O_FR_PF_TA, TD.QuickFindBox_Input_OrderStatus_Data_Returned);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);	
			Thread.sleep(2000);
		}
	}


}
