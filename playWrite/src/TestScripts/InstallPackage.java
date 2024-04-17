package TestScripts;

import org.testng.annotations.Test;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;
import validations.validationspages;

public class InstallPackage extends baseClass{
	private static TestData TD = new TestData();
	@Test
	public static void InstallPackageInCRM() throws InterruptedException {

		instllpopUp = page.waitForPopup(()->{
			Actions.click(page, "a[target='_blank']");
		});
		instllpopUp.waitForLoadState();
		instllpopUp.navigate(TD.PackageUrl);
		instllpopUp.fill(CrmXpaths.userName, TD.userName);
		Thread.sleep(1000);
		// Enter password
		instllpopUp.fill(CrmXpaths.Pwd, TD.password);
		Thread.sleep(1000);
		// Click on the login button
		instllpopUp.click(CrmXpaths.loginBtn);
		Thread.sleep(10000);
		if(Actions.countOfElements(instllpopUp, CrmXpaths.updatepackager)) {
			logger.info("Package is already installed");
		}else {
			Actions.sendKeys(instllpopUp, CrmXpaths.deploymentKey,TD.Package_Key, TD.QuickFindBox_IP_FieldName);     
			Thread.sleep(2000);
			Actions.click(instllpopUp,CrmXpaths.ContinueBtn);
			Thread.sleep(3000);
			Actions.click(instllpopUp, CrmXpaths.installBtn);
			validationspages.installPackage();
			Thread.sleep(5000);
			Actions.click(instllpopUp,CrmXpaths.doneBtn);
			Thread.sleep(3000);
		}
		
		Thread.sleep(5000);
		instllpopUp.close();

	}

}