package TestScripts;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.StoreFrontXpaths;

public class PlaceTheOrder extends baseClass{
	private static StoreFrontXpaths SFX = new StoreFrontXpaths();
	private static TestData TD = new TestData();
	
	@Test
	public static void placeTheOrder() throws Exception {
		
		//Thread.sleep(10000);
		PlaceTheOrderpopUp = page.waitForPopup(()->{
			Actions.click(page, "a[target='_blank']");
		});
		
		PlaceTheOrderpopUp.waitForLoadState();
		PlaceTheOrderpopUp.navigate(TD.storeFrontURL);
		//Thread.sleep(3000);
		verifyThatuserLogin();
		Actions.OnlySendKeys(PlaceTheOrderpopUp, SFX.SEARCH_BAR,TD.Search_Home_Page_IP_Data, TD.Search_Home_Page_IP_FieldName );
		//Thread.sleep(3000);
		Actions.click(PlaceTheOrderpopUp, SFX.SEARCH_PRODUCT);
		//Thread.sleep(3000);
		Actions.click(PlaceTheOrderpopUp, SFX.ADD_TO_CART_BTN);
		//Thread.sleep(2000);
		Actions.click(PlaceTheOrderpopUp, SFX.MINI_CART_LINK);
		//Thread.sleep(1000);
		Actions.click(PlaceTheOrderpopUp, SFX.CHECKOUT_BTN);
	    Thread.sleep(10000);
		Actions.click(PlaceTheOrderpopUp, SFX.NEXT_PAYMENT_BTN);
		Thread.sleep(3000);
//		Actions.click(PlaceTheOrderpopUp, SFX.CHECKOUT_BTN);
//		Thread.sleep(5000);
		if(!Actions.findTheElementPresentonPO(PlaceTheOrderpopUp, SFX.AlreadyCardEXists)) {
			Actions.findTheFrameAndFillTheInputBox(PlaceTheOrderpopUp, SFX.IFRAMEName, SFX.ENTER_CARDHOLDER_NAME, "TestAutomation");
			//Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(PlaceTheOrderpopUp, SFX.IFRAMENumber, SFX.ENTER_CARD_NUMBER, "4111111111111111");
			//Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(PlaceTheOrderpopUp, SFX.IFRAMECVV, SFX.ENTER_CVV, "123");
			Thread.sleep(2000);
			Actions.findTheFrameAndFillTheInputBox(PlaceTheOrderpopUp, SFX.IFRAMEEXP, SFX.ENTER_EXPIRATION, "1226");
			//Thread.sleep(3000);
		}
		//Thread.sleep(3000);
		Actions.click(PlaceTheOrderpopUp, SFX.REVIEW_ORDER_BTN);
		Thread.sleep(5000);
		Actions.click(PlaceTheOrderpopUp, SFX.PLACE_ORDER_BTN);
		Thread.sleep(5000);
		
		validatePlacetheOrderPage();
		orderNumberAndOrderDate();
		Thread.sleep(10000);
		PlaceTheOrderpopUp.close();		
	}
	
	public static void verifyThatuserLogin() throws Exception {
	    // Click on the "Gift Card" link
	    Actions.click(PlaceTheOrderpopUp,SFX.SIGN_IN_LINK);
	    // Wait for 3 seconds to allow the action to complete
        Thread.sleep(1000);
     // Enter valid email and password
        Actions.sendKeys(PlaceTheOrderpopUp,SFX.EMAIL_INPUT, TD.userNameStoreFront,TD.UserName_Login_IP_FieldName);      
        Actions.sendKeys(PlaceTheOrderpopUp,SFX.PASSWORD_INPUT, TD.passwordStoreFront,TD.Passowrd_Login_IP_FieldName);   
        Actions.click(PlaceTheOrderpopUp,SFX.LOGIN_BTN);
        logger.info("click on the submit button");
        Thread.sleep(2000);
	}
	
	public static void validatePlacetheOrderPage() throws InterruptedException {
		if(Actions.countOfElements(PlaceTheOrderpopUp,SFX.ORDER_THANK_MESSAGE_LIST)) {
	    	 String ActualTitleofPlacetheOrder = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ORDER_THANK_MESSAGE_LIST);
	    	 logger.info(ActualTitleofPlacetheOrder);
		     String ExpectedTitlePlacetheOrder = "Thank you for your order.";
	    	 test.info("verifying  the order is placed");
	
		    if (ActualTitleofPlacetheOrder.equals(ExpectedTitlePlacetheOrder)) {
		        test.pass("Successfully Order is Placed and Thank you for your order message is displayed");
		        logger.info("Successfully Order is Placed and Thank you for your order message is displayed");
		    } else {
		        test.fail( "The page Title does not match expected " + ExpectedTitlePlacetheOrder + " " + "  but found" + " " + ActualTitleofPlacetheOrder + " ");
		        logger.info("Click failed");
		    }		    
		}
	}    
	
	//validate the order number and date of order
		public static void orderNumberAndOrderDate() throws InterruptedException {
			if(Actions.countOfElements(PlaceTheOrderpopUp,SFX.ORDER_THANK_MESSAGE_LIST)) {
			   String orderNumber = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ORDER_NUMBER);
			  
		        test.pass("The Order number is "+ orderNumber);
		        logger.info("The Order number is "+ orderNumber);
		        OrderNumbers = orderNumber;
			    
			    //order date
			    String OrderDate = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ORDER_DATE);
		        test.pass("The Ordered date is "+  OrderDate);
		        
		         OrderDates =OrderDate;
		        
		        //paymnet details
			    String paymentDetails = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.PAYMENT_DETAILS_IN_ORDER_CONFIRMATION_PAGE);
			    
			    //Shipping details 
			    String ShippingAddress1 = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ShippingAddress1);
			    logger.info(ShippingAddress1);
			    
			    String ShippingAddress2 = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ShippingAddress2);
			    logger.info(ShippingAddress2);
			    ShippingAddressAddress1 = ShippingAddress1 + " " +ShippingAddress2 ;
			    logger.info(ShippingAddressAddress1);
			    String ShippingCity = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ShippingCity);
			    logger.info(ShippingCity);
			    String ShippingState = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ShippingState);
			    logger.info(ShippingState);
			    ShippingStates = ShippingState;
			    String ShippingPostalCode = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.ShippingPostalCode);
			    logger.info(ShippingPostalCode);
			    ShippingPostalCodes = ShippingPostalCode;
			    
			    //TD.ShippingAddress = ShippingDetails;
			    //billing details
			    
			    String BillinggAddress1 = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BillinggAddress1);
			    logger.info(BillinggAddress1);
			    String BillingAddress2 = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BillingAddress2);
			    logger.info(BillingAddress2);
			    String BillingCity = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BillingCity);
			    logger.info(BillingCity);
			    String BillingState = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BillingState);
			    logger.info(BillingState);
			    String BillingPostalCode = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BillingPostalCode);
			    logger.info(BillingPostalCode);
			    
			    
			    
//			    String BillingDetails = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.BILLINGADDRESS);
//			    logger.info(BillingDetails);
			    //TD.BillingAddress = BillingDetails;
			    //amount
			    Thread.sleep(3000);
			    String AmountDetails = Actions.getTextOfElement(PlaceTheOrderpopUp,SFX.AMOUNT);
			    logger.info(AmountDetails);
			    
			 // Remove any whitespace
			    String cleanAmount = AmountDetails.trim();
			    // Remove the dollar sign
			    cleanAmount = cleanAmount.replaceAll("[^\\d.]+", "");

			    // Parse the string as a double (since it contains decimal points)
			    double amount = Double.parseDouble(cleanAmount);
			    logger.info(amount);
			    Amount = amount;
			    Thread.sleep(2000);
			    Locator loactor = PlaceTheOrderpopUp.locator(SFX.TotalNoofProduct);
			    logger.info(loactor.count());
			    
			    lineItemsStoreFront = loactor.count();
			 
			    
		      
		        test.pass("Payment is done with "+ paymentDetails);
		        logger.info("Payment is done with"+ paymentDetails);
			}
					
		}

	
	

}
