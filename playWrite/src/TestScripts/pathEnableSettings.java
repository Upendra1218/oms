package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class pathEnableSettings extends baseClass{

	private static TestData TD = new TestData();
    @Test
	public static void pathsettings() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_PathSettings, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.pathsettings);
			Thread.sleep(3000);
			validationspages.PathSettings();
			Thread.sleep(5000);
			pathsettinsEnable();
		}
	}
	
	public static void pathsettinsEnable() throws Exception {
		if(Actions.findTheFrmaAndElementElementPresent(crmpopUp, CrmXpaths.Iframe, CrmXpaths.pathsettingsNewPath)) {
			logger.info("path setting are already enabled");
		}else {
			Actions.findTheFrameAndClickAction(crmpopUp,  CrmXpaths.Iframe, CrmXpaths.pathsettingsEnable);
			Thread.sleep(2000);
			pathsettinsEnable();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		crmpopUp.close();
		
		
	}
}
