package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;

public class loginToCC extends baseClass{
	private static TestData TD = new TestData();
	@Test
	public static void logintoCCSandBox() throws Exception {
		
		page.fill(CrmXpaths.ccuserName, TD.userName_002);
		Thread.sleep(3000);
		Actions.click(page, CrmXpaths.ccLoginBtn);
        // Enter password
        page.fill(CrmXpaths.ccPWD, TD.password_002);
		Thread.sleep(5000);
		Actions.click(page, CrmXpaths.ccLoginBtn);
	    Thread.sleep(50000);
	    Actions.click(page, CrmXpaths.selectSite);
	    Thread.sleep(1000);
	    Actions.click(page, CrmXpaths.refrachsiteSelect);
	    Thread.sleep(10000);
	   
		}

}
