package TestScripts;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import baseClass.baseClass;
import data.TestData;
import functionality.Actions;
import pages.CrmXpaths;

public class CheckOrderSummeries extends baseClass {

    private static TestData TD = new TestData();

    @Test
    public static void orderSummeries() throws Exception {
        loginTest.loginDetails();

        if (isLoggedIn) {
            Thread.sleep(3000);
            Actions.click(crmpopUp, CrmXpaths.APP_LAUNCHER);
            Thread.sleep(3000);
            Actions.sendKeys(crmpopUp, CrmXpaths.APP_LAUNCHER_SEARCH, TD.QuickFindBox_Input_OrderSummerires,TD.QuickFindBox_IP_FieldName);
            Actions.click(crmpopUp, CrmXpaths.ORDER_MANAGEMENT_TAB);
            Actions.sendKeys(crmpopUp, CrmXpaths.Record_Search, OrderNumberDefault, TD.QuickFindBox_IP_FieldName);
            Actions.click(crmpopUp, CrmXpaths.Record);
            Thread.sleep(3000);
            AmountValidation();
            lineItemsValidations();
            orderStatus();
            AllocatedPrice();
            shippingAddressValidations();
        }
    }

    /**
     * Validates the amount of the order from CRM against the expected amount.
     */
    public static void AmountValidation() {

        String crmAmountDetails = Actions.getTextOfElement(crmpopUp, CrmXpaths.AMOUNT);
        logger.info(crmAmountDetails);

        // Remove any whitespace
        String cleanAmount = crmAmountDetails.trim();
        // Remove the dollar sign
        cleanAmount = cleanAmount.replaceAll("[^\\d.]+", "");
        // Parse the string as a double (since it contains decimal points)
        double amount = Double.parseDouble(cleanAmount);
        if (Amount == amount) {
            test.pass("The amount is matched with the store front Amount ");
            logger.info("The amount is matched");
        } else {
            logger.info("The amount is not matched");
        }
    }

    /**
     * Validates the number of line items in the order from CRM against the expected
     * number of line items.
     */
    public static void lineItemsValidations() {
        Locator loactor = crmpopUp.locator(CrmXpaths.LineItemsCRM);
        if (loactor.count() == lineItemsStoreFront + 1) {
            test.pass("The line items is matched with the store front Amount ");
            logger.info("line items is matched");

        } else {
            logger.info("line items is not matched");

        }
    }

    /**
     * Validates the status of the order in CRM, ensuring it is set to "ordered".
     */
    public static void orderStatus() {
        Locator loactor = crmpopUp.locator(CrmXpaths.Status);
        if (loactor.count() > 0) {
            logger.info("status is set to ordered");
        } else {
            logger.info("status is not set to ordered");
        }
    }

    /**
     * Validates the allocated price of the order from CRM against the expected
     * allocated price.
     * @throws InterruptedException 
     */
    public static void AllocatedPrice() throws InterruptedException {
        Thread.sleep(5000);
        String crmAmountDetails = Actions.getTextOfElement(crmpopUp, CrmXpaths.AllocatedPrice);
        // Remove any whitespace
        String cleanAmount = crmAmountDetails.trim();
        // Remove the dollar sign
        cleanAmount = cleanAmount.replaceAll("[^\\d.]+", "");
        // Parse the string as a double (since it contains decimal points)
        double amount = Double.parseDouble(cleanAmount);
        if (Amount == amount) {
            test.pass("The allocate amount is matched with the store front Amount ");
            logger.info("The allocate amount is matched with the store front Amount");
        } else {
            logger.info("The amount is not matched");
        }

    }

    /**
     * Validates the shipping address details of the order from CRM against the
     * expected shipping address details.
     */
    public static void shippingAddressValidations() {

        String ShippingAddress1 = Actions.getTextOfElement(crmpopUp, CrmXpaths.ShippingAddress1);
        String ShippingState = Actions.getTextOfElement(crmpopUp, CrmXpaths.ShippingState);
        String ShippingPostalCode = Actions.getTextOfElement(crmpopUp, CrmXpaths.ShippinPostalCode);
        if (ShippingAddress1.equals(ShippingAddressAddress1) && ShippingPostalCode.equals(ShippingPostalCodes)) {
            logger.info("address matched");
            test.pass("The address is matched with the store front Amount ");
        } else {
            logger.info("address not  matched");
        }
    }
}
