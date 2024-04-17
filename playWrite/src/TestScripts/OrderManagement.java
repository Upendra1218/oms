package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class OrderManagement extends baseClass{
	private static TestData TD = new TestData();

	@Test
	public static void orderManagement() throws Exception {
		if(isLoggedIn) {
			Actions.sendKeys(crmpopUp, CrmXpaths.qucikFindbox,TD.QuickFindBox_Input_Ordermanagment, TD.QuickFindBox_IP_FieldName);
			Thread.sleep(2000);
			Actions.click(crmpopUp, CrmXpaths.orderManageent);
			Thread.sleep(3000);
			validationspages.OrderManagementPage();
			Thread.sleep(5000);
			enableCheckBoxesExcectB2C();
		}
	}
	
	public static void enableCheckBoxesExcectB2C() throws Exception {
		if(Actions.getSizeOfList(CrmXpaths.CheckedCheckBoxes)) {
			logger.info("Sucessfully All Required CheckBoxs are Checked on the Order Management");
			test.pass("Sucessfully All Required CheckBoxs are Checked on the Order Management");
		}else {
			logger.info("All buttons are not in  active");	
			Actions.selectMultipleCheckBoxes(CrmXpaths.checkboxes);
			Thread.sleep(3000);
			enableCheckBoxesExcectB2C();
		}
		
	}
	
}
