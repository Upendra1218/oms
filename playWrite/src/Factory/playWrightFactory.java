package Factory;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class playWrightFactory {
	
	static Playwright playwright;
	static Browser browser;
	static BrowserContext browserContext;
	static Page page;
	Properties prop;
	
	public static void initBrowser (String browserName) throws InterruptedException {
		System.out.println("browser name is : "+browserName);
//		playwright = Playwright.create();
//		switch (browserName.toLowerCase()) {
//		case "chromium":
//			browser = playwright.chromium().launch(new BrowserType. LaunchOptions().setHeadless (false));
//			break;
//		case "firefox":
//		browser = playwright.firefox(). launch (new BrowserType. LaunchOptions().setHeadless (false));
//		break;
//		case "safari":
//			browser = playwright.webkit().launch(new BrowserType. LaunchOptions().setHeadless (false));
//			break;
//		case "chrome":
//			browser = playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless (false));
//			break;
//		default:
//			System.out.println("please pass the right browser name...... ");
//			break;
//		}
//		browserContext = browser.newContext();
//		page = browserContext.newPage();
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//BrowserContext brContext = browser.newContext (new Browser.NewContextOptions().setStorageStatePath(Paths.get("login.json")));
		page = browser.newPage();
		page.navigate("https://zzqi-002.dx.commercecloud.salesforce.com/on/demandware.store/Sites-RefArch-Site/en_US");
		
		page.setViewportSize(1900, 1080);
		Thread.sleep(2000);
	}
	
	/*
	 * This metho is used to read the config propeties
	 */
	
	 public void readConfig() {
	        File src = new File("./config/config.properties");

	        try {
	            FileInputStream fis = new FileInputStream(src);
	            this.prop = new Properties();
	            this.prop.load(fis);
	        } catch (Exception var3) {
	            System.out.println("Exception is " + var3.getMessage());
	        }

	    }
	 


}
