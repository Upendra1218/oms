package pages;

public class StoreFrontXpaths {
	
    public   String IFRAMEName = "//iframe[@id='braintree-hosted-field-cardholderName']";
    public   String IFRAMENumber = "//iframe[@id='braintree-hosted-field-number']";
    public   String IFRAMECVV = "//iframe[@id='braintree-hosted-field-cvv']";
    public   String IFRAMEEXP = "//iframe[@id='braintree-hosted-field-expirationDate']";
	public   String SEARCH_BAR = "//input[@name='q']";
	public   String SELECT_SIZE = "//div[contains(@class, 'select-size')]//span[contains(@class, 'text-center') and not(contains(@disabled, 'disabled'))]";
	public   String SEARCH_PRODUCT = "(//div[contains(@class,'order-md-1 px-2 pt-3 product-container')]//span[@class='name'])[1]";
	public   String ADD_TO_CART_BTN = "//button[contains(@class, 'add-to-cart')]";
	public   String SELECT_SIZE_LIST = "//select[@class='custom-select form-control select-size']";
	public   String MINI_CART_LINK = "//span[contains(@class, 'minicart-quantity')]";
	public   String SIGN_IN_LINK = "//div[@class='user mr-3 d-none d-lg-block']//span[@class='user-message']";
	public   String EMAIL_INPUT = "//input[@name='loginEmail']";
	public   String PASSWORD_INPUT = "//input[@name='loginPassword']";
	public   String LOGIN_BTN = "//button[contains(text(), 'Login')]";
	public   String VIEW_CART_BTN = "//a[contains(text(), 'View Cart')]";
	public   String WIDTH_LIST = "//select[contains(@class,'select-width')]";
	public   String DROPDOWN_COLOR = "//select[contains(@class,'select-color-swatch')]";
	public   String CHECKOUT_BTN = "//a[contains(text(), 'Checkout')]";
	public   String NEXT_PAYMENT_BTN = "//button[contains(text(),'Next: Payment')]";
	
	public   String AlreadyCardEXists ="//option[@data-payment-method='CREDIT' and @selected='selected']";
	public   String ENTER_CARDHOLDER_NAME = "//input[@id = 'cardholder-name']";
	public   String ENTER_CARD_NUMBER = "//input[@id = 'credit-card-number']";
	public   String ENTER_CVV = "//input[@id = 'cvv']";
	public   String ENTER_EXPIRATION = "//input[@id = 'expiration']";
	public   String SAVE_CARD_BTN ="//input[@id='braintreeSaveCreditCard']";
	public   String NEW_CARD_DROPDOWN = "//select[@id='braintreeCreditCardList']";
	public   String NEW_CARD_OPTION = "//option[@id='newCardAccount']";
	public   String PLACE_ORDER_BTN = "//button[contains(text(),'Place Order')]";
	public   String REVIEW_ORDER_BTN = "//button[@type='submit' and @name='submit' and @value='submit-payment' and (contains(text(), 'Next: Review Order'))]";
	public   String ORDER_THANK_MESSAGE_LIST = "//h2[@class ='order-thank-you-msg']";
	public   String ORDER_THANK_MESSAGE = "//h2[@class ='order-thank-you-msg']";
	public   String ORDER_NUMBER = "//span[@class ='summary-details order-number']";
	public   String ORDER_DATE = "//span[@class ='summary-details order-date']";
	public   String PAYMENT_DETAILS_IN_ORDER_CONFIRMATION_PAGE = "//div[@class='payment-details']";
	
	public String AMOUNT = "//div[@class='creditcard-amount']";
	public String SHIPPINGADDRESS = "//div[@class='single-shipping']//div[@class='address-summary']";
	public String BILLINGADDRESS = "//div[@class='summary-details billing']//div[@class='address-summary']";
	public String TotalNoofProduct = "//div[@class='product-line-item']";
	
	//shipping address
	public String ShippingAddress1 = "//div[@class='summary-details shipping']//div[@class='address1']";
	public String ShippingAddress2 = "//div[@class='summary-details shipping']//div[@class='address2']";
	public String ShippingCity = "//div[@class='summary-details shipping']//span[@class='city']";
	public String ShippingState = "//div[@class='summary-details shipping']//span[@class='stateCode']";
	public String ShippingPostalCode = "//div[@class='summary-details shipping']//span[@class='postalCode']";
	
	//billing address
	public String BillinggAddress1 = "//div[@class='summary-details billing']//div[@class='address1']";
	public String BillingAddress2 = "//div[@class='summary-details billing']//div[@class='address2']";
	public String BillingCity = "//div[@class='summary-details billing']//span[@class='city']";
	public String BillingState = "//div[@class='summary-details billing']//span[@class='stateCode']";
	public String BillingPostalCode = "//div[@class='summary-details billing']//span[@class='postalCode']";
	
	


}
