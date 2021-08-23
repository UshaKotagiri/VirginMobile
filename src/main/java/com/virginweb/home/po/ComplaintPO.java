package com.virginweb.home.po;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class ComplaintPO extends MobileWebViewPage{

	/**
	 * extend  MobileWebViewPage
	 * 
	 */
	
	public ComplaintPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/Complaint");		
	}
	/**
	 * scroll Function
	 * 
	 */
	public void ScrollComplaintPage() {
		Helper.scrollDown();
		
	}
	/**
	 * Click On Telecom Service
	 * 
	 */
	public void ClickOnTelecomService() {
		element("TelecomService").click();
		
	}
	/**
	 * back button
	 * 
	 */
	public void PressBackButton() {	
		session.driver.navigate().back();
	}
	/**
	 *verify and click on Complaint
	 * 
	 */
	public boolean VerifyandClickOnComplaint() {
		if(element("Complaint").isDisplayed())
			{
			element("Complaint").click();
			return true;
			}
		else
			return false;
			}
			
	/**
	 * verify banner and logo
	 * 
	 */
	public boolean VerifyBannerandLogo() {
		return element("Banner").isDisplayed()&& element("Logo").isDisplayed();
	}
	/**
	 * verify complaint text
	 * 
	 */
	public boolean VerifyComplaintText() {
		return element("ComplaintText").isDisplayed();
	}
	/**
	 * verify complaint handling text
	 * 
	 */
	public boolean VerifyCustomerHandlingPolicy() {
		return element("CompanyHandling").isDisplayed();
	}
	/**
	 * verify complaint customer text
	 * 
	 */
	public boolean VerifyCustomerComplaint() {
		return element("CustomerComplaint").isDisplayed();
	}
	/**
	 * verify complaint rights 
	 * 
	 */
	public boolean VerifyRights() {
		return element("Rights").isDisplayed();
	}
	/**
	 * verify telecom
	 * 
	 */
	public boolean VerifyTelecomServices() {
		return element("TelecomService").isDisplayed();
	}
	/**
	 * verify complaint page
	 * 
	 */
	public boolean VerifyComplaintPage() {
		return element("ComplaintPage").isDisplayed();
	}
	/**
	 * verify complaint text in previous page
	 * 
	 */
	public boolean VerifyPreviouspage() {
		return element("ComplaintText").isDisplayed();
	}
	/**
	 * verify homepage
	 * 
	 */
	public boolean VerifyHomepage() {
		return element("Homepage").isDisplayed();
	}
	/**
	 * click on Complaint
	 * 
	 */
	public void ClickOnComplaint() {
		element("Complaint").click();
		
	}
	/**
	 * raise complaint Click
	 * 
	 */
	public void ClickOnRaiseComplaint() {
		element("RaiseComplaint").click();
		
	}
	/**
	 * verify Header text
	 * 
	 */
	public boolean verifyHeaderOfThePage() {
		return element("Header").isDisplayed();
	}
	/**
	 * verify Rights tab
	 * 
	 */
	public boolean VerifyCustomerRightsTab() {
		return element("RightTab").isDisplayed();
	}
	/**
	 * verify customer rights page
	 * 
	 */
	public boolean VerifyRightsPage() {
		return element("RightsPage").isDisplayed();
	}
	/**
	 * verify and click on raise complaint
	 * 
	 */
	public boolean VerifyClickRaiseComplaint() {
		if(element("RaiseComplaint").isDisplayed())
		{
		element("RaiseComplaint").click();
		return true;
		}
	else
		return false;
		}
	
	/**
	 * verify raise complaint page
	 * 
	 */
	public boolean VerifyraiseComplaintpage() {
		return element("VerifyRaiseComplaintpage").isDisplayed();
	}
	/**
	 * verify chat icon and click
	 * 
	 */
	public boolean VerifyandClickOnchatIcon() {
		if(element("Chat").isDisplayed())
		{
		element("chat").click();
		return true;
		}
	else
		return false;
		}
	
	/**
	 * verify chat screem
	 * 
	 */
	public boolean VerifychatScreen() {
		return element("ChatScreen").isDisplayed();
	}
	/**
	 * verify and click on our app
	 * 
	 */
	public boolean VerifyandcLickonOurApp() {
		if(element("Ourapp").isDisplayed())
		{
		element("OurApp").click();
		return true;
		}
	else
		return false;
		}
	
	/**
	 * verify chat at the bottom
	 * 
	 */
	public boolean verifyChatBottomscreen() {
		return element("ChatIconatBottom").isDisplayed();
	}
	/**
	 * verify app page
	 * 
	 */
	public boolean VerifyOurAppPage() {
		return element("ourAppPage").isDisplayed();
	}
	/**
	 * verify store app
	 * 
	 */
	public boolean VerifyandclickStoreicon() {
		if(element("Store").isDisplayed())
		{
		element("Store").click();
		return true;
		}
	else
		return false;
	}
	/**
	 * verify store app page
	 * 
	 */
	public boolean VerifyOurStorePage() {
		return element("Storepage").isDisplayed();
	}
	/**
	 * verify icons on Complaint 
	 * 
	 */
	public boolean VerifyIcon() {
		return element("iconOnComplaint").isDisplayed();
	}
	/**
	 * verify AND Click on Contact us
	 * 
	 */
	public boolean VerifyandClickContactUs() {
		if(element("ContactUs").isDisplayed())
		{
		element("ContactUs").click();
		return true;
		}
	else
		return false;
	}
	/**
	 * verify friendly text
	 * 
	 */
	public boolean VerifyUserFriendlyText() {
		return element("Friendlytext").isDisplayed();
	}
	/**
	 * verify click on contact text
	 * 
	 */
	public boolean VerifyandClickOnContctUsText() {
		if(element("ContactText").isDisplayed())
		{
		element("ContactText").click();
		return true;
		}
	else
		return false;
	}
	/**
	 * verify contact page
	 * 
	 */
	public boolean VerifyContctpage() {
		return element("ConactPage").isDisplayed();
	}
	/**
	 * verify number prefix
	 * 
	 */
	public boolean VerifyNumberPrefix() {
		return element("NumberPrefix").isDisplayed();
	}
	/**
	 * verify error on blank nmber field
	 * 
	 */
	public boolean VerifyErrorOnBlankField() {
		element("verification").click();
		return element("Error").isDisplayed();
	}
	/**
	 * verify verification button
	 * 
	 */
	public boolean VerifyVerificationButton() {
		return element("verification").isDisplayed();
	}
	/**
	 * verify progress bar
	 * 
	 */
	public boolean VerifyProgressbar() {
		return element("Progressbar").isDisplayed();
	}
	/**
	 * verify Submit button
	 * 
	 */
	public void ClickOnSubmitBtn() {
		element("SubmitButtonAfterSubject").click();
			
	}
	/**
	 * verify entered nmber
	 * 
	 */
	public boolean VerifyEnteredNumber() {
		element("EnteredNumber").sendKeys("573891465");
		if(element("EnteredNumber").getText().equals("573891465"))
			return true;
		else 
			return false;
	}
	/**
	 * verify Contact link button
	 * 
	 */
	public boolean VerifyContactLink() {
		return element("ContactLink").isDisplayed();
	}
	/**
	 * verify submit button after number
	 * 
	 */
	public boolean verifySubmitButton() throws InterruptedException {
		element("SubmitAfterNumber").click();
		Thread.sleep(5000);
		return element("OTPCode").isDisplayed();
	}
	/**
	 * verify OTP Entered 
	 * 
	 */
	public boolean VerifyOTP() {
		element("OTPCode").sendKeys("123456");
		if(element("OTPCode").getText().equals("123456"))
			return true;
		else 
			return false;
	}
	/**
	 * verify Submit button AfterOTP
	 * 
	 */
	public boolean VerifySubmitAfterOTP() {
		element("SubmitAfterOtp").click();
		return element("Subject").isDisplayed();
	}
	/**
	 * verify Complaint page
	 * 
	 */
	public boolean VerifyComplaintSectionPage() {
		return element("Subject").isDisplayed();
	}
	/**
	 * verify category and subcategory
	 * 
	 */
	public boolean verifyCategorySubcategory() {
		return element("Category").isDisplayed() &&  element("SubCategory").isDisplayed();
	}
	/**
	 * verify email
	 * 
	 */
	public boolean VerifyEmailEntered() {
		element("EmailAddress").sendKeys("abcd@yopmail.com");
		if(element("EmailAddress").getText().equals("abcd@yopmail.com"))
			return true;
		else 
			return false;
	}
	/**
	 * verify number
	 * 
	 */
	public boolean VerifyOptionalNumber() {
		element("OptionalNumber").sendKeys("576332233");
		if(element("OptionalNumber").getText().equals("576332233"))
			return true;
		else 
			return false;
	}
	/**
	 * verify subject
	 * 
	 */
	public boolean VerifySubject() {
		element("Subject").sendKeys("XYZ");
		if(element("Subject").getText().equals("XYZ"))
			return true;
		else 
			return false;
	}
	/**
	 * verify complaint submission page
	 * 
	 */
	public boolean VerifyPageafterRaisingComplaint() {
		return element("ComplaintSubmissionPage").isDisplayed();
	}
	/**
	 * verify ladder
	 * 
	 */
	public boolean VerifyLadder() {
		return element("ladder").isDisplayed();
	}
	
}
