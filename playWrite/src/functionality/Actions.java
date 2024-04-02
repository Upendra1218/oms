package functionality;

import java.util.List;
import java.util.Random;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import baseClass.baseClass;
import pages.CrmXpaths;

public class Actions extends baseClass{
	
	static Random random = new Random();
	
	 public static void sendKeys(Page page, String selector, String value, String elementName) {
	        try {
	            logger.info("Verify whether the user is able to Enter the Input details in " + elementName);    
	            // Clear and send keys
	            page.fill(selector, value);
	            
	            logger.info("Successfully send keys of " + elementName);
	         // Press the Enter key
	            page.keyboard().press("Enter");
	        } catch (Exception e) {
	            logger.info("Keys not sent to " + elementName);
	        }
	    }
	 
	 public static void click(Page page, String selector) {
		    try {
		        // Click on the element
		        page.click(selector);
		        
		    } catch (Exception e) {
		        
		    }
		}
	 
	 public static boolean countOfElements(Page page, String selector) {
		    try {
		        // Create a locator for the specified selector
		        Locator locator = page.locator(selector);
		        // Get the count of elements
		        int size = locator.count();
		        // Log the count of elements
		        logger.info("The count of the element is " + size);
		        // Return true if the count is greater than 0
		        return size > 0;
		    } catch (Exception e) {
		        // Handle any exceptions
		        return false;
		    }
		}
	 
	 public static void findIframeandSelectValueFromDropDown(Page page,String frameSelector, String selector) {
		 Locator iframeElement = page.frameLocator (frameSelector).locator(selector);
	 }
	

	 
	 public static void findTheFrmaAndContent(Page page,String frameSelector, String selector) {
		 
	 }
	 
	 public static void findTheFrameAndClickAction(Page page,String frameSelector, String selector) {
		 Locator iframeElement = page.frameLocator (frameSelector). locator(selector);
		 int size = iframeElement.count();
		 logger.info(size);
		 iframeElement.click();
	 }
	 
	 public static boolean findTheFrmaAndElementElementPresent(Page page,String frameSelector, String selector) {
		 Locator iframeElement = page.frameLocator (frameSelector). locator(selector); 
		 int size = iframeElement.count();
	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size>0) {
	        	return true;
	        }else {
			return false;
	        }
	 }
}
