package pages;

import com.microsoft.playwright.Page;

public class CrmXpaths {
	
	Page page;
	public static String Iframe = "//iframe[contains(@name, 'vfFrameId_')]";
	public static String qucikFindbox = "//input[@class='filter-box input']";
	public static String companyInfo = "//mark[text()='Company Information']";
	public static String companyInfoHeader = "//span[text()='Company Information']";
	public static String Currency = "//td[text()='English (United States) - USD']";
	
	public static String editbutton = "(//input[@title='Edit'])[1]";
	
	
	
	

}
