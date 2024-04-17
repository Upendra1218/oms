package TestScripts;

import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class EnablePersonAccounts extends baseClass{
	
	private static TestData TD = new TestData();
	
	@Test
	public static void personAcconts() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_PersonAccounts, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.PersonAccounts);
			Thread.sleep(10000);
			validationspages.personAccountpage();
			RequiremestofEnablePersonAccount();
		}
	}

	
	public static void RequiremestofEnablePersonAccount() throws Exception {
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PersonAccountsEnabled)) {
			logger.info("User is Enabled the Person Account in the Person Account Page.");
			test.pass("User is Enabled the Person Account in the Person Account Page.");
		}else {
			
			OrgImpactAcknowledgement();
			CreateAccountsRecordType();
	
		}
		
	}
	
	public static void OrgImpactAcknowledgement() throws Exception {
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PersonAccountStep1Completed)) {
			logger.info("User is Org Impact Acknowledgement  is checked in the Person Account Page.");
			test.pass("User is Org Impact Acknowledgement  is checked in the Person Account Page.");
		}else {
			Actions.click(crmpopUp, CrmXpaths.PersonAccount_VoI);
			Thread.sleep(1000);
			Actions.click(crmpopUp, CrmXpaths.PersonAccount_VoI_CB);
			Thread.sleep(1000);
			Actions.click(crmpopUp, CrmXpaths.PersonAccount_VoI_Continue_Btn);
		}
	}
	
	public static void CreateAccountsRecordType() throws Exception {
		logger.info("page object");
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PersonAccountsEnabled)) {
			logger.info("User is Create Accounts Record Type is checked in the Person Account Page.");
			test.pass("User is Create Accounts Record Type is checked in the Person Account Page.");
		}else {

			
			logger.info("page object1");
			Thread.sleep(3000);
			if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.PersonAccountNewRecordType)) {
				CNRTpopUp = crmpopUp.waitForPopup(()->{
					Actions.click(crmpopUp, CrmXpaths.PersonAccountNewRecordType);
				});
				Thread.sleep(10000);
				validationspages.personAccountRecordPage();
				Actions.click(CNRTpopUp, CrmXpaths.PA_CRT_New_Btn);
				Thread.sleep(5000);
				validationspages.personAccountNewRecordPage();
				if(Actions.findTheFrmaAndElementElementPresent(CNRTpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Page_Header)) {
					Actions.findTheFrameAndFillTheInputBox(CNRTpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Input_label, TD.Account_New_RT_Label_IP_Data);
					Actions.findTheFrameAndFillTheInputBox(CNRTpopUp, CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Input_Name, TD.Account_New_RT_Label_IP_Data);
					Actions.findTheFrameAndClickAction(CNRTpopUp,CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Next_Btn);
					Thread.sleep(2000);
					Actions.findIframeandSelectValueFromDropDown(CNRTpopUp,CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Select_Dropdown, TD.SelectCurrent_IP_RecordType_Value);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(CNRTpopUp,CrmXpaths.Iframe,CrmXpaths.PA_CRT_New_Save_Btn);
					validationspages.succesfullyCreatedtheRecordType();
					CNRTpopUp.close();
					Thread.sleep(2000);
					crmpopUp.reload();
				}else {
					logger.info("3");
					Thread.sleep(3000);
					logger.info("User is Create Accounts Record Type is checked in the Person Account Page.");
					test.pass("User is Create Accounts Record Type is checked in the Person Account Page.");
				}
	        }
			
			Thread.sleep(3000);
			logger.info("page object2");
			if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.Enable_PersonAccount_A_C_Record)) {
				Actions.click(crmpopUp, CrmXpaths.Enable_PersonAccount_A_C_Record);
				Thread.sleep(2000);
				Actions.click(crmpopUp, CrmXpaths.PA_PopUp);
				Thread.sleep(3000);
				RequiremestofEnablePersonAccount();
			}
			
		}
	}

}
