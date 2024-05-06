package pages;

import com.microsoft.playwright.Page;

import baseClass.baseClass;
import data.TestData;

public class CrmXpaths extends baseClass{
	Page page;
	public static String userName = "//input[@id='username']";
	public static String Pwd = "//input[@id='password']";
	public static String loginBtn = "//input[@id='Login']";
	public static String homeDiv = "//div[@id='brandBand_2']";
	
	public static String Iframe = "//iframe[contains(@name, 'vfFrameId_')]";
	public static String qucikFindbox = "//input[@class='filter-box input']";
	public static String companyInfo = "//mark[text()='Company Information']";
	public static String companyInfoHeader = "//span[text()='Company Information']";
	public static String Currency = "//td[text()='English (United States) - USD']";
	public static String editbutton = "(//input[@title='Edit'])[1]";
	public static String currncyDropDown = "//select[@id='DefaultCurrencyIsoCode']";
	public static String currncySaveBtn = "//input[@name='save']";
	
	//order settings xpaths
	public static String OrderSettins = "//mark[text()='Order Settings']";
	public static String OrderSettinsHeader = "//h1[text()='Order Settings']";
	//lists
	public static String EnableReductionOrdersCheckBoxlist = "//input[@class='ReductionOrdersEnabled' and @checked]";
	public static String EnableNegativeQuantityCheckBoxlist = "//input[@class='NegativeOIQuantityEnabled'and @checked]";
	public static String EnableEnhancedCommerceOrderslist = "//input[@class='EnhancedCommerceOrders' and @checked]";
	public static String EnableZeroQuantityCheckBoxlist = "//input[@class='ZeroOIQuantityEnabled'and @checked]";
	public static String EnableOptionalPriceforOrdersCheckBoxlist = "//input[@class='OptionalPricebookEnabled'and @checked]";
	public static String EnableOrderEventsCheckBoxlist = "//input[@class='OrderEventsEnabled'and @checked]";
	//elements
	public static String EnableReductionOrdersCheckBox = "//input[@class='ReductionOrdersEnabled']";
	public static String EnableNegativeQuantityCheckBox = "//input[@class='NegativeOIQuantityEnabled']";
	public static String EnableEnhancedCommerceOrders = "//input[@class='EnhancedCommerceOrders']";
	public static String EnableZeroQuantityCheckBox = "//input[@class='ZeroOIQuantityEnabled']";
	public static String EnableOptionalPriceforOrdersCheckBox = "//input[@class='OptionalPricebookEnabled']";
	public static String EnableOrderEventsCheckBox = "//input[@class='OrderEventsEnabled']";
	public static String saveOrderSettings = "//input[@value='Save']";
	
	//PersonAccount settings xpaths
    //already enable page
	public static String PersonAccountsEnabled = "//h2[text()='Person Accounts Enabled']";
	public static String PersonAccountStep1Completed = "//div[@title='Step 1 of Person Accounts enablement complete']";
	
	//xpaths
	public static String PersonAccounts = "//mark[text()='Person Accounts']";
	public static String PersonAccountsHeader = "//h1[text()='Person Accounts']";
	
	//View Org impacts
	public static String PersonAccount_VoI = "//button[@title='View Org Impacts']";
	public static String PersonAccount_VoI_CB = "//span[contains(@class, 'slds-checkbox_faux')]";	
	public static String PersonAccount_VoI_Continue_Btn= "//button[@title ='Continue']";
	
	//Create Record type
	public static String PersonAccountNewRecordType = "//a[@title ='Create Accounts Record Type in a new tab']";
	public static String PA_CRT_New_Btn = "//button[@title='Record Type']";
	public static String PA_CRT_Page_Header = "//div[@class='slds-page-header']";
	public static String PA_CRT_New_Page_Header = "//h1[text()='New Record Type']";
	public static String PA_CRT_New_Input_label = "//input[@id='p2']";
	public static String PA_CRT_New_Input_Name = "//input[@id='p52']";
	public static String PA_CRT_New_Next_Btn = "//input[@title='Next']";
	public static String PA_CRT_New_Select_Dropdown = "//select[@title='-- Select Page Layout --']";
	public static String PA_CRT_New_Save_Btn = "//input[@title='Save']";
	public static String PA_CRT_New_Page_header = "//div[@class='bPageTitle']";
	public static String Enable_PersonAccount_A_C_Record ="//button[@title='Enable Person Accounts']";
	public static String PA_PopUp ="//div[@class='slds-modal__footer']//button[@title='Enable Person Accounts']";
	
	//Order management xpths
	public static String orderManagementHeader = "//span[text()='Order Management']";
	public static String orderManageent ="//mark[text()='Order Management']";
	public static String CheckedCheckBoxes = "//span[@class='slds-checkbox_on']";
	public static String CheckBoxesInActive="//span[@class='slds-checkbox_off']";
	public static String checkboxes ="//span[@class='slds-checkbox_faux']";
	
	//omni channel inverntry
	public static String Omnichannel = "//mark[text()='Omnichannel Inventory']";
	public static String OmnichannelHeader ="//span[text()='Omnichannel Inventory']";
	public static String OmnichannelHeaderEnable = "//h3[text()='Tenant Group ID']";
	
	//Connect with B2c xpaths 
	
	public static String connectB2c = "//mark[text()='B2C Commerce Connections']";
	public static String connectB2cHeader = "//span[text()='B2C Commerce Connections']";
	public static String B2cNewConnection = "//input[@value='New Connection']";
	public static String B2cNewConnectionHeader = "//h2[text()='Connection Request']";
	public static String B2cNewConnectionName = "//input[@title='Connection name for instance connecting.']";
	public static String B2cNewConnectionID = "//input[@title='The URL used to access the remote application.']";
	public static String B2cNewConnectionSaveBtn = "//a[text()='Save']";
	public static String allowBtn = "//button[contains(text(), 'Allow')]";
	public static String SelectDivforAvaliableOptions = "//span[@class='section availableOptionsSection']//select[@multiple='multiple']";
	public static String addArrowBtn = "//input[@class='btn add']";
	public static String saveBtn ="//input[@class='btn' and @value='Save']";
	public static String popUpSaveBtn ="//input[contains(@id, 'requestFeatureSave')]";
	public static String ProvisionState ="//td[text()='Provisioned']";
	
	//paths settings xpaths
	public static String pathsettings = "//mark[text()='Path Settings']";
	public static String pathsettingsHeader ="//span[text()='Path Settings']";
	public static String pathsettingsEnable ="//span[text()='Enable']";
	public static String pathsettingsNewPath ="//span[text()='New Path']";
	
	
	//install package
	public static String deploymentKey = "//input[@id='installKeyBox']";
	public static String ContinueBtn = "//span[text()='Continue']";
	public static String installBtn = "//button[@title='Install']";
	public static String downloadCOmpleted ="//span[text()='Installation Complete!']";
	public static String doneBtn ="//span[text()='Done']";
	public static String updatepackager ="//button[@title='Upgrade']";
	
	//cc login detials
	
	public static String ccuserName = "//input[@id='idToken2']";
	public static String ccLoginBtn = "//input[@id='loginButton_0']";
	public static String ccPWD ="//input[@type='password' and @id='idToken2']";
	public static String selectSite ="//span[@class='sod_select ']";
	public static String refrachsiteSelect ="//span[@title='RefArch']";
	
	
	//post deployment
	//product family picklist values
	public static String ObjectManager = "//ul[@class='tabBarItems slds-grid']//span[text()='Object Manager']";
	public static String Quickfind = "//input[@id='globalQuickfind']";
	public static String productOM = "//a[text()='Product']";
	public static String product_O_FR = "//a[text()='Fields & Relationships']";
	public static String product_O_FR_PF = "//span[text()='Product Family']";
	public static String product_O_FR_PF_N = "//input[@title ='New Product Family Picklist Values']";
	public static String product_O_FR_PF_TA = "//textarea[@id='p1']";
	public static String product_O_FR_PF_S = "//input[@title ='Save']";
	public static String OM_Header = "//h1//span[text()='Object Manager']";
	public static String product_Header = "//h1//span[text()='Product']";
	public static String product_FR ="//h2//span[text()='Fields & Relationships']";
	public static String product_FH ="//h2[text()=' Product Family']";
	public static String product_FH_ALE ="//td[text()='Shipping']";
	
	
	//order status

    public static  String ORDER_OM = "//a[text()='Order']";
    public static  String ORDER_O_FR_PF = "//a//span[text()='Status']";
    public static  String ORDER_O_FR_PF_N = "//input[@title ='New Order Status Picklist Values']";
    public static  String ORDER_O_FR_PF_N_IP_L = "//input[@id='p1']";
    public static  String ORDER_O_FR_PF_N_IP_API = "//input[@id='p3']";
    public static  String ORDER_O_FR_PF_N_IP_SE = "//select[@id='p5']";
    public static  String ORDER_O_FR_PF_N_S = "//input[@title='Save']";
    public static  String ORDER_HEADER = "//h1//span[text()='Order']";
    public static  String ORDER_SH = "//h2[text()=' Status']";
    public static  String ORDER_FH_ALE_IR = "//td[text()='In Review']";
    public static  String ORDER_FH_ALE_AP = "//td[text()='Approved']";
    public static  String ORDER_FH_ALE_FF = "//td[text()='Fufilled']";
    public static  String ORDER_FH_ALE_C = "//td[text()='Canceled']";
    public static  String ORDER_FH_ALE_R = "//td[text()='Returned']";
	    
	//order summery
    
    public static  String ORDER_SUMMARY_OM = "//a[text()='Order Summary']";
    public static  String ORDER_SUMMARY_O_FR_PF = "//a//span[text()='Status']";
    public static  String ORDER_SUMMARY_O_FR_PF_N = "//input[@title ='New Status Picklist Values']";
    public static  String ORDER_SUMMARY_O_FR_PF_TA = "//textarea[@id='p1']";
    public static  String ORDER_SUMMARY_O_FR_PF_S = "//input[@title ='Save']";
	
    
    // create a product 
    public static  String APP_LAUNCHER = "//div[@class='slds-icon-waffle']";
    public static  String APP_LAUNCHER_SEARCH = "//one-app-launcher-search-bar//input[@class='slds-input']";
    public static  String PRODUCTS_TAB = "//a[@data-label='Products']//b";
    public static  String NEW_PRODUCT = "//a[@title='New']";
    public static  String PRODUCT_NAME = "(//input[@class=' input'])[1]";
    public static  String PRODUCT_CODE = "(//input[@class=' input'])[2]";
    public static  String ACTIVE_CHECKBOX = "//input[@type='checkbox' and not(contains(@class, 'keyboardMode--trigger'))]";
    public static  String PRODUCT_NONE = "//a[text()='--None--']";
    public static  String PRODUCT_SHIPPING = "//ul[@role='presentation']//li[@role='presentation']//a[@title='Shipping']";
    public static  String PRODUCT_DESCRIPTION = "//textarea[@role ='textbox']";
    public static  String PRODUCT_SAVE_BTN = "//button[@title ='Save']";
    public static  String PRODUCT_FORM_HEADER = "//h2[text() ='New Product']";
    public static  String PRODUCT_LIST_DIV = "//div[@aria-label='Recently Viewed|Products|List View']";
    
    // Order Delivery Methods
    public static  String ORDER_DELIVERY_METHOD_TAB = "//a[@data-label='Order Delivery Methods']//b";
    public static  String NEW_ORDER_DELIVERY_METHOD = "//a[@title='New']";
    public static  String LIST_VIEW_ORDER_DELIVERY_METHOD = "//div[@aria-label='Recently Viewed|Order Delivery Methods|List View']";
    public static  String ORDER_DELIVERY_METHOD_NAME = "//input[@name='Name']";
    public static  String ORDER_DELIVERY_METHOD_CODE = "//input[@name='ReferenceNumber']";
    public static  String ORDER_DELIVERY_METHOD_DESCRIPTION = "//textarea[@class='slds-textarea']";
    public static  String ORDER_DELIVERY_METHOD_SAVE_BTN = "//button[@name ='SaveEdit']";
    public static  String ORDER_DELIVERY_METHOD_LIST_BOX = "//input[@aria-haspopup='listbox']";
    public static  String ORDER_DELIVERY_METHOD_METHOD = "//span[text()='Ground']";
    
    // Order Management
    public static String GLOBAL_SEARCH = "//input[@title='Search Setup']";
    public static  String ORDER_MANAGEMENT_TAB = "//a[@data-label='Order Management']//b";
    public static  String LIST_ORDER_MANAGEMENT_METHOD = "//div[@aria-label='Recently Viewed|Order Summaries|List View']";
    public static  String LIST_ORDER_MANAGEMENT_SUMMARIES = "//div[@class='slds-page-header__name-title']//span[text()='Recently Viewed']";
    public static  String LIST_ORDER_MANAGEMENT_SUMMARIES_ALL = "//span[text()='All Order Summaries']";

	public static String AMOUNT = "//dd[@title='Total']//lightning-formatted-number";
	public static String SHIPPINGADDRESS = "//div[@class='single-shipping']//div[@class='address-summary']";
	public static String BILLINGADDRESS = "//div[@class='summary-details billing']//div[@class='address-summary']";
	
	public static String Record_Search = "//input[@class='slds-input']";
	public static String Record = "//a[@data-refid='recordId' and @title= " + OrderNumberDefault+ "]";
	
	public static String LineItemsCRM= "//div[@data-component-id='oms_deliveryGroup']//a[@data-refid='recordId']";
	
	//shipping Address details
	public static String ShippingAddress1 = "//div[@data-component-id='oms_deliveryGroup']//span[@class='deliver-to-street']";
	public static String ShippingState = "//div[@data-component-id='oms_deliveryGroup']//span[@class='deliver-to-state']";
	public static String ShippinPostalCode = "//div[@data-component-id='oms_deliveryGroup']//span[@class='deliver-to-postal-code']";
	
	public static String Status = "//span[text() ='Ordered']";
	
	public static String AllocatedPrice = "//div[@class='slds-grid listDisplays safari-workaround-anchor simpleEmptyState']//tr//td//span[contains(text(),'"+ Amount+ "')]";
    

}
