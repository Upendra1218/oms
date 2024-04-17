package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class omniChannelInventry extends baseClass{
	private static TestData TD = new TestData();
	@Test
	public static void OmniChannelInventry() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_OmniChannelInvertry, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.Omnichannel);
			Thread.sleep(3000);
			validationspages.OmniChannel();
			Thread.sleep(5000);
			enableCheckBoxesofOmniChannelInventry();
		}
	}
	
	public static void enableCheckBoxesofOmniChannelInventry() throws Exception {
		if(Actions.countOfElementscrmpopup(crmpopUp, CrmXpaths.OmnichannelHeader) && Actions.getSingleElementSizeOfList(CrmXpaths.CheckedCheckBoxes)) {
			logger.info("Sucessfully All Required CheckBoxs are Checked on the Omni Channel Inventary");
			test.pass("Sucessfully All Required CheckBoxs are Checked on the Omni Channel Inventary");
		}else {
			Thread.sleep(5000);
			logger.info("All buttons are not in  active");	
			if(Actions.getSingleElementSizeOfList(CrmXpaths.CheckBoxesInActive)) {
				Actions.selectsingelBoxes(CrmXpaths.checkboxes);
				Thread.sleep(1000);
				crmpopUp.reload();
			}
			Thread.sleep(2000);
			enableCheckBoxesofOmniChannelInventry();
			Thread.sleep(5000);
		}
		
	}
	

}
