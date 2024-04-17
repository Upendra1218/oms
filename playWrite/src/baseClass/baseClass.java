package baseClass;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import data.TestData;

public class baseClass {

	private static TestData TD = new TestData();
	
	protected static Logger logger;
	protected static Page page;
	protected static Page crmpopUp;
	protected static Page CNRTpopUp;
	protected static Page instllpopUp;
	protected static Page PlaceTheOrderpopUp;
	protected static Browser browser;
	
	//shipping address setup 
	public static String ShippingAddressAddress1 = "";
	public String ShippingAddress2 = "";
	public String ShippingCity = "";
	public static String ShippingStates = "";
	public static String ShippingPostalCodes = "";

	//billing address 
	public String BillinggAddress1 = "";
	public String BillingAddress2 = "";
	public String BillingCity = "";
	public String BillingState = "";
	public String BillingPostalCode = "";


	public static String OrderNumbers ="";
	public static String OrderDates = "";
	public static double Amount = 0;
	public String BillingAddress = "";

	public static String OrderNumberDefault ="00002611";
	public double OrderAmount = 0;
	public static int lineItemsStoreFront = 0;
	public String LineItemStatus="";


	
	// Flags for tracking test state
    protected static boolean isLoggedIn = false; 

	// ExtentReports and ExtentTest instances for reporting
	protected static ExtentReports report = new ExtentReports();
	private ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\Upendra Reddy\\git\\oms\\playWrite\\Reports\\ProvidioTestReport.html");

	// Reporting
	// static ExtentReports report;
	protected static ExtentTest test;
	Playwright playwright = Playwright.create();

	@BeforeSuite
	public void setUpforReport() throws InterruptedException {
		// Create a new ExtentReports instance
		report = new ExtentReports();
		// Attach the ExtentSparkReporter to the ExtentReports
		report.attachReporter(reporter);
		// Initialize the WebDriver (assuming the method initializeDriver() is available
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//BrowserContext brContext = browser.newContext (new Browser.NewContextOptions().setStorageStatePath(Paths.get("login.json")));
		page = browser.newPage();
		///page.setViewportSize(1900, 1080);
		page.navigate(TD.sandBoxURL);
		Thread.sleep(2000);
		//playWrightFactory.initBrowser("chrome");
	}

	@BeforeClass
	public void setupLogger() {
		// Load log4j properties from the configuration file
		logger = Logger.getLogger("crm");
		PropertyConfigurator.configure("log4j.properties");
	}


 /*
  * This method is used to create the name of the report 
  */
	@BeforeMethod
	public void afterClass(Method method) {
		// Create a new ExtentTest with the name of the current test method
		test = report.createTest(method.getName());
	}
	
	
/*
 * This method is used to take a screenshot when ever the test case failed
 */
	@AfterMethod
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == 2) {
	    	test.fail(result.getThrowable().getClass().getSimpleName());
		    test.fail(result.getThrowable().getMessage() + "\n" + result.getThrowable().getStackTrace());
	        if (page != null) {
	            String fileName = result.getMethod().getMethodName() + "_failure.png";
	            String destinationPath = "./Screenshots/" + fileName;
	            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(destinationPath)));
	            try {
	                String filePathString = "C:\\Users\\Upendra Reddy\\git\\oms\\playWrite\\Screenshots\\" + fileName;
	                //logger.info(filePathString);
	                logger.info("Screenshot taken for test case: " + result.getMethod().getMethodName());
	                test.fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(filePathString).build());
	            } catch (Exception e) {
	                logger.error("Exception while taking screenshot: " + e.getMessage());
	            }
	        } else {
	            logger.error("Page object is null. Unable to capture screenshot.");
	        }
	    }
	}


	@AfterSuite
	public void tearDown() throws IOException, InterruptedException {
		report.flush();
		Thread.sleep(10000);
		//page.navigate("https://login.salesforce.com/");
		page.navigate("C:\\Users\\Upendra Reddy\\git\\oms\\playWrite\\Reports\\ProvidioTestReport.html");
		Thread.sleep(2000);
		page.click("//i[@class='fa fa-bar-chart']");
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\Upendra Reddy\\git\\oms\\playWrite\\Reports\\ReportsScreenshot.png")));
		Thread.sleep(10000);
      page.close();
      playwright.close();
	
	}



}