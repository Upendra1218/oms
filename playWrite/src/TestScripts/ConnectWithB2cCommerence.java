package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class ConnectWithB2cCommerence extends baseClass{
	private static TestData TD = new TestData();
	@Test
	public static void connectwithB2c() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_B2CCommerceConnections, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.connectB2c);
			Thread.sleep(3000);
			validationspages.ConnectWithB2c();
			Thread.sleep(5000);
			ConnectionWithB2CwithValidDetails();
		}
	}

	public static void ConnectionWithB2CwithValidDetails() throws Exception {
		if(Actions.findTheElementPresent(crmpopUp, CrmXpaths.connectB2cHeader)) {
			logger.info("coing here");
			if(Actions.MultipleElementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ProvisionState )) {
				logger.info("All are in the provision state");
				test.pass("connection was succesfully established");
			}else {
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.B2cNewConnection);
				Thread.sleep(3000);
				if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.B2cNewConnectionHeader)) {
					logger.info("coming there");
					Actions.findTheFrameAndFillTheInputBox(crmpopUp,CrmXpaths.Iframe, CrmXpaths.B2cNewConnectionName,TD.Connection_Name);
					Actions.findTheFrameAndFillTheInputBox(crmpopUp,CrmXpaths.Iframe, CrmXpaths.B2cNewConnectionID,TD.Instance_ID);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.B2cNewConnectionSaveBtn);
				}
				Thread.sleep(10000);
				Actions.click(crmpopUp, CrmXpaths.allowBtn);
				Thread.sleep(10000);
				Actions.findTheFrameAndControllAll(crmpopUp, CrmXpaths.Iframe, CrmXpaths.SelectDivforAvaliableOptions);
				Thread.sleep(2000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.addArrowBtn);
				Thread.sleep(2000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveBtn);
				Thread.sleep(2000);
				Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.popUpSaveBtn);
				Thread.sleep(30000);
				crmpopUp.reload();	
				Thread.sleep(20000);
				if(Actions.MultipleElementsWithParticularCondition(crmpopUp,CrmXpaths.Iframe, CrmXpaths.ProvisionState )) {
					logger.info("All are in the provision state");
				}else if((Actions.getSingleElementSizeOfListNumber(CrmXpaths.Iframe, CrmXpaths.ProvisionState))==3) {
					Actions.findTheFrameAndControllAll(crmpopUp, CrmXpaths.Iframe, CrmXpaths.SelectDivforAvaliableOptions);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.addArrowBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.popUpSaveBtn);
				}else if((Actions.getSingleElementSizeOfListNumber(CrmXpaths.Iframe, CrmXpaths.ProvisionState))==2) {
					Actions.findTheFrameAndControllAll(crmpopUp, CrmXpaths.Iframe, CrmXpaths.SelectDivforAvaliableOptions);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.addArrowBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.popUpSaveBtn);
				}else if((Actions.getSingleElementSizeOfListNumber(CrmXpaths.Iframe, CrmXpaths.ProvisionState))==1) {
					Actions.findTheFrameAndControllAll(crmpopUp, CrmXpaths.Iframe, CrmXpaths.SelectDivforAvaliableOptions);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.addArrowBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.saveBtn);
					Thread.sleep(2000);
					Actions.findTheFrameAndClickAction(crmpopUp, CrmXpaths.Iframe, CrmXpaths.popUpSaveBtn);
				}else {
					crmpopUp.reload();
					Thread.sleep(20000);
				}
				ConnectionWithB2CwithValidDetails();
			}

		}

	}
}
