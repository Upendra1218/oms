package functionality;

import java.util.Random;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;

import baseClass.baseClass;

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
	            Thread.sleep(1000);
	        } catch (Exception e) {
	            logger.info("Keys not sent to " + elementName);
	        }
	    }
	 
	 public static void OnlySendKeys(Page page, String selector, String value, String elementName) {
	        try {
	            logger.info("Verify whether the user is able to Enter the Input details in " + elementName);    
	            // Clear and send keys
	            page.fill(selector, value);
	            logger.info("Successfully send keys of " + elementName);
	         // Press the Enter key
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
	 
	 public static int countOfElementslist(Page page, String selector) {
		    try {
		        // Create a locator for the specified selector
		        Locator locator = page.locator(selector);
		        // Get the count of elements
		        int size = locator.count();
		        // Log the count of elements
		        logger.info("The count of the element is " + size);
		        // Return true if the count is greater than 0
		        return size ;
		    } catch (Exception e) {
		        // Handle any exceptions
		    	return 0;
		    }
			
		}
	 
	 public static boolean countOfElementscrmpopup(Page crmpopUp, String selector) {
		    try {
		        // Create a locator for the specified selector
		        Locator locator = crmpopUp.locator(selector);
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
	 
	 public static void selectValueFromDropDown(Page page,String selector, String optionValues) {
		 Locator dropDown = page.locator(selector);
		 // Select an option by its value
         //String optionValue = "1";
		 dropDown.selectOption(optionValues);
         logger.info("selceted dropdown");

	 }
	 
	 public static void findIframeandSelectValueFromDropDown(Page page,String frameSelector, String selector, String optionValues) {
		 Locator iframeElement = page.frameLocator (frameSelector).locator(selector);
		 // Select an option by its value
         //String optionValue = "1";
         iframeElement.selectOption(optionValues);
         logger.info("selceted dropdown");

	 }
	

	 
	 public static void findTheFrmaAndContent(Page page,String frameSelector, String selector) {
		 
	 }
	 
	 public static void findTheFrameAndClickAction(Page page,String frameSelector, String selector) {
		 Locator iframeElement = page.frameLocator (frameSelector). locator(selector);
		 int size = iframeElement.count();
		 logger.info("click"+size);
		 iframeElement.click();
	 }
	 
	 public static void findTheFrameAndFillTheInputBox(Page page,String frameSelector, String selector, String value ) {
		 Locator iframeElement = page.frameLocator (frameSelector). locator(selector);
		 int size = iframeElement.count();
		 logger.info("fill"+size);
		 iframeElement.fill(value);
	 }
	 
	 public static void javascriptAlert() {
		 page.onceDialog(dialog->{
				String text = dialog.message();
				logger.info(text);
				dialog.accept();
			});
	 }
	 
	 public static boolean findTheFrmaAndElementElementPresent(Page page,String frameSelector, String selector) {
		 Locator iframeElement = crmpopUp.frameLocator (frameSelector). locator(selector); 
		 int size = iframeElement.count();
	      logger.info(size);
	        try {
	            int displayedElementsCount = 0;
	            for(int i =0;i<size;i++) {
	            	if(iframeElement.nth(i).isVisible()) {
	            		 displayedElementsCount++;
	            	}
	            }
	            // Get the count of matched elements and log it.
	            size = displayedElementsCount;
	            logger.info(size);
	            //logger.info(size);
	        } catch (Exception e) {
	            // Handle errors if needed
	        }

	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size>0) {
	        	return true;
	        }else {
			return false;
	        }
	 }
	 
	 public static boolean MultipleElementsWithParticularCondition(Page page,String frameSelector, String selector) {
		 Locator iframeElement = crmpopUp.frameLocator (frameSelector). locator(selector); 
		 int size = iframeElement.count();
	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size==4) {
	        	return true;
	        }else {
			return false;
	        }
	 }
	 
	 public static boolean SinglelementsWithParticularCondition(Page page,String frameSelector, String selector) {
		 Locator iframeElement = crmpopUp.frameLocator (frameSelector). locator(selector); 
		 int size = iframeElement.count();
	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size==1) {
	        	return true;
	        }else {
			return false;
	        }
	 }
	 
	 public static boolean findTheElementPresent(Page page, String selector) {
		 Locator iframeElement = crmpopUp.locator(selector); 
		 int size = iframeElement.count();
	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size>0) {
	        	return true;
	        }else {
			return false;
	        }
	 }
	 
	 public static boolean findTheElementPresentonPO(Page page, String selector) {
		 Locator iframeElement = PlaceTheOrderpopUp.locator(selector); 
		 int size = iframeElement.count();
	        // Log the count of elements
	        logger.info("The count of the element is " + size);
	        if(size>0) {
	        	return true;
	        }else {
			return false;
	        }
	 }
	 public static boolean getSizeOfList(String selector) {
		Locator checkboxes =  crmpopUp.locator(selector); 
		 int size = checkboxes.count();
	      logger.info(size);
	        try {
	            int displayedElementsCount = 0;
	            for(int i =0;i<size;i++) {
	            	if(checkboxes.nth(i).isVisible()) {
	            		 displayedElementsCount++;
	            	}
	            }
	            // Get the count of matched elements and log it.
	            size = displayedElementsCount;
	            logger.info(size);
	            //logger.info(size);
	        } catch (Exception e) {
	            // Handle errors if needed
	        }
	        if(size==4) {
	        	return true;
	        }else {
			return false;
	        }	    
	        
	 }
	 
	 public static boolean getSingleElementSizeOfList(String selector) {
			Locator checkboxes =  crmpopUp.locator(selector); 
			 int size = checkboxes.count();
		      logger.info(size);
		        try {
		            int displayedElementsCount = 0;
		            for(int i =0;i<size;i++) {
		            	if(checkboxes.nth(i).isVisible()) {
		            		 displayedElementsCount++;
		            	}
		            }
		            // Get the count of matched elements and log it.
		            size = displayedElementsCount;
		            logger.info(size);
		            //logger.info(size);
		        } catch (Exception e) {
		            // Handle errors if needed
		        }
		        if(size>0) {
		        	return true;
		        }else {
				return false;
		        }	    
		        
		 }
	 
	 public static int getSingleElementSizeOfListNumber(String frameSelector, String selector) {
		 Locator locatorElement = crmpopUp.frameLocator (frameSelector). locator(selector); 
			 int size = locatorElement.count();
		      logger.info(size);
		        try {
		            int displayedElementsCount = 0;
		            for(int i =0;i<size;i++) {
		            	if(locatorElement.nth(i).isVisible()) {
		            		 displayedElementsCount++;
		            	}
		            }
		            // Get the count of matched elements and log it.
		            size = displayedElementsCount;
		            logger.info(size);
		            //logger.info(size);
		        } catch (Exception e) {
		            // Handle errors if needed
		        }
		        
		        	return size ;
		        
		        
		 }
	 

	 public static void selectMultipleCheckBoxes(String selector) throws Exception {
		 Locator checkboxes = crmpopUp.locator(selector); 
			for(int i =0 ; i<= checkboxes.count() - 1; i++) {
				if(i == 2) {
					logger.info("skip this step");
				}else {
					Locator checkbox = checkboxes.nth(i);
					Thread.sleep(2000);
					checkbox.click();
				}
				
			}
		}
	 
	 public static void selectsingelBoxes(String selector) throws Exception {
		 Locator checkboxes = page.locator(selector); 
			for(int i =0 ; i<= checkboxes.count() - 1; i++) {
				if(i == 0) {
					Locator checkbox = checkboxes.nth(i);
					Thread.sleep(2000);
					checkbox.click();
					
				}else {
					logger.info("skip this step");
				}
				
			}
		}
	 
	 public static void findTheFrameAndControllAll(Page page,String frameSelector, String selector) throws InterruptedException {
		 Locator controlAll = crmpopUp.frameLocator (frameSelector). locator(selector);
		 int size = controlAll.count();
		 logger.info("click"+size);
		 controlAll.click();
         // Wait for a short duration
         Thread.sleep(1000);
         // Press the Control + 'a' keys
         controlAll.evaluate("el => el.select()");
	 }
	 
	 public static void controlAll(String selector) {
        try {
        	Locator controlAll = crmpopUp.locator(selector); 
            // Click on the element
        	controlAll.click();
            // Wait for a short duration
         Thread.sleep(1000);
            // Press the Control + 'a' keys
         controlAll.evaluate("el => el.select()");
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
	}
	 
	 public static String getTextOfElement(Page page, String selector) {
	        String elementText = "";
	        try {
	            // Wait for the element to be visible
	            Locator locator = page.locator(selector);
	            
	            // Get the text content of the element
	            elementText = locator.innerText();
	        } catch (PlaywrightException e) {
	            // Handle any exceptions
	            e.printStackTrace();
	        }
	        return elementText;
	    }
}
