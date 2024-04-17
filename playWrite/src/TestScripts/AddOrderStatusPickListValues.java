package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class AddOrderStatusPickListValues extends baseClass{
	private static TestData TD = new TestData();

	@Test
	public static void Statuspicklist() throws Exception {
		//loginTest.loginDetails();
		if(isLoggedIn) {
			Actions.click(crmpopUp, CrmXpaths.ObjectManager);
			Thread.sleep(3000);
			validationspages.VerifyObjecmanagerClick();
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_Order, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.ORDER_OM);
			//ProductFamailyValidations.VerifyProductClick();
			Thread.sleep(2000);
			Actions.click(crmpopUp,CrmXpaths.product_O_FR);
			validationspages.VerifyFieldandReloationsClick();
			Thread.sleep(2000);
			Actions.sendKeys(crmpopUp, CrmXpaths.Quickfind,TD.QuickFindBox_Input_OrderStatus, TD.QuickFindBox_IP_FieldName);
			Actions.click(crmpopUp,CrmXpaths.ORDER_O_FR_PF);
			//ProductFamailyValidations.VerifyNewPicklistClick();
			Thread.sleep(2000);
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
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_L, TD.QuickFindBox_Input_OrderStatus_Data_InReview);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_API, TD.QuickFindBox_Input_OrderStatus_Data_InReview);
			Actions.findIframeandSelectValueFromDropDown(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_SE, TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);
			Thread.sleep(2000);
		}
	}

	public static void ApprovedSet() throws Exception {
		Thread.sleep(5000);
		if(Actions.SinglelementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe,CrmXpaths.ORDER_FH_ALE_AP)) {
			logger.info("pick list already added");
		}else {

			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_L, TD.QuickFindBox_Input_OrderStatus_Data_Approved);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_API, TD.QuickFindBox_Input_OrderStatus_Data_Approved);
			Actions.findIframeandSelectValueFromDropDown(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_SE, TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
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
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_L, TD.QuickFindBox_Input_OrderStatus_Data_Fufilled);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_API, TD.QuickFindBox_Input_OrderStatus_Data_Fufilled);
			Actions.findIframeandSelectValueFromDropDown(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_SE, TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
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
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_L, TD.QuickFindBox_Input_OrderStatus_Data_Canceled);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_API, TD.QuickFindBox_Input_OrderStatus_Data_Canceled);
			Actions.findIframeandSelectValueFromDropDown(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_SE, TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Thread.sleep(2000);
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
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_L, TD.QuickFindBox_Input_OrderStatus_Data_Returned);
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(crmpopUp, CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_API, TD.QuickFindBox_Input_OrderStatus_Data_Returned);
			Actions.findIframeandSelectValueFromDropDown(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ORDER_O_FR_PF_N_IP_SE, TD.SelectCurrent_IP_CompanyInfo_ValueStatus);
			Thread.sleep(2000);
			Thread.sleep(2000);
			Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe,CrmXpaths.ORDER_O_FR_PF_N_S);	
			Thread.sleep(2000);
		}
	}


}
