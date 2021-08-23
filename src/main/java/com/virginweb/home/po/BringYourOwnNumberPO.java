package com.virginweb.home.po;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;


public class BringYourOwnNumberPO extends MobileWebViewPage{

	/**
	 * extend  WebViewPage
	 * 
	 */
	
	public BringYourOwnNumberPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/BringYourOwnNumber");		
	}
	/**
	 * Click on Port Number
	 * 
	 */
	public void ClickOnPortNumber() {
		element("PortNumber").click();
		
	}
	/**
	 *enter Mobile Number
	 * 
	 */
	public void EnterMobileNumber() {
		element("MobileNumber").sendKeys("5718239811");
		
	}
	/**
	 * Enter Operator name
	 * 
	 */
	public void SelectOperatorName() {
		Select dropdown = new Select(element("OperatorName"));
		dropdown.selectByVisibleText("Lebara");
		
	}
	/**
	 * Click on Confirm
	 * 
	 */
	public void ClickOnConfirm() {
		element("Confirm").click();		
	}
	/**
	 * verify Port Number
	 * 
	 */
	public boolean VerifyPortNumber() {
		return element("PortNumber").isDisplayed();
	}
	/**
	 * verify Bring your own screen Page
	 * 
	 */
	public boolean VerifyBringNumberScreen() {
		return element("BringNumberScreen").isDisplayed();
	}
	/**
	 * verify bring your number text
	 * 
	 */
	public boolean VerifyBringNumberText() {
		return element("BringNumberText").isDisplayed();
	}
	/**
	 * verify Progress bar dropdown
	 * 
	 */
	public boolean VerifyProgressDropDown() {
		return element("ProgressDropdown").isDisplayed();
	}
	/**
	 * verify Port Number is selected
	 * 
	 */
	public boolean VerifyPortNumberSelected() {
		return element("PortNumber").isSelected();
	}
	/**
	 * verify mobile number, operator name,Country,Optional Number
	 * 
	 */
	public boolean VerifyMobileOperatorNameCountry() {
		return element("MobileNumber").isDisplayed()&&element("OperatorName").isDisplayed()&&element("Country").isDisplayed()&&element("OptionalNumber").isDisplayed();
	}
	/**
	 * verify Help text dissapear
	 * 
	 */
	public boolean VerifyHelpTextDissapears() {
		boolean status;
	
		String MobileNumber= element("MobileNumber").getAttribute("label");
		if (MobileNumber.equals("Mobile Number"))
		 status = false;
		else 
			status = true;
		return status;
	}
	/**
	 * verify confirm button enabled
	 * 
	 */
	public boolean VerifyConfirmButtonEnabled() {
		return element("Confirm").isEnabled();
	}
	/**
	 * verify verification code page
	 *
	 * 
	 */
	public boolean VerifyVerificationCodepage() {
		return element("VerificationCode").isDisplayed();
	}
	/**
	 * Enter invalid number
	 *
	 */
	public void EnterInvalidNumber() {
		element("MobileNumber").sendKeys("57362612121");
		
	}
	/**
	 * verify Send again
	 *
	 */
	public boolean VerifySendAgain() {
		return element("sendAgain").isDisplayed();
	}
	/**
	 * verify code tab
	 *
	 */
	public boolean verifyCodeTab() {
		return element("CodeTab").isDisplayed();
	}
	/**
	 * verify and enter code value
	 *
	 */
	public boolean EnterandVerifyCode() {
		element("CodeTab").sendKeys("12345");
		if  (element("CodeTab").getText().equals("12345"))
			return true;
		else 
			return false;
		
	}
	/**
	 * verify confirm enabled
	 *
	 */
	
	public boolean VerifyConfirmEnabled() {
		return element("ConfirmCode").isEnabled();
	}
	/**
	 * verify confirm not enabled
	 *
	 */
	public boolean VerifyConfirmNotEnabled() {
		return element("Confirm").isEnabled();
	}
	
	/**
	 * click on hamburger icon
	 *
	 */public void ClickHamburgerIcon() {
		 element("Hamburger").click();
		
	}
	
	
}