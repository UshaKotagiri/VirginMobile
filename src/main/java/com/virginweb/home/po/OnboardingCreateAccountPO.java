package com.virginweb.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

import cucumber.api.java.en.And;


public class OnboardingCreateAccountPO extends MobileWebViewPage{

	public OnboardingCreateAccountPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/OnboardingCreateAccount");		

	}
	/**
	 * Used to click on GetPlan
	 * 
	 */

	public void ClickGetHelp() {
		element("GetPlanBtn").click();		
	}
	/**
	 * Used to verify Plan and product
	 * 
	 */
	public boolean verifyPlanProudctInHomepage() {
		return element("PlanandProduct").isDisplayed();
	}
	/**
	 * Used to verify why virgin mobile
	 * 
	 */
	public boolean verifyVirginMobileInHomepage() {
		return element("WhyVirginMobile").isDisplayed();
	}
	/**
	 * Used to verify Help and support
	 * 
	 */
	public boolean verifyHelpInHomepage() {
		return element("HelpAndSupport").isDisplayed();
	}
	/**
	 * Used to verify Language
	 * 
	 */
	public boolean verifyLanguageInHomepage() {
		return element("Language").isDisplayed();
	}
	/**
	 * Used to verify scroll 
	 * 
	 */
	public boolean verifyscrollInHomepage() {
		Helper.scrollDown();
		return element("GetPlanBtn").isDisplayed();
	}
	/**
	 * Used to verify Get plan btn
	 * 
	 */
	public boolean verifyGetHelpInHomepage() {
		return element("GetPlanBtn").isDisplayed();
	}
	/**
	 * Used to verify Number list
	 * 
	 */
	public boolean verifyGetHelpRedirectedscreen() {
		return element("NumberLists").isDisplayed();
	}/**
	 * Used to verify Eligibility form
	 * 
	 */
	public boolean verifyEligibilityForm() {
		return element("EligibiltyForm").isDisplayed();
	}
	/**
	 * Used to select number from list
	 * 
	 */
	public void SelectNumberFromList() throws InterruptedException {
		for (int i = 1; i < 2; i++) {
			WebElement ele = elements("NumberLists").get(i);
			ele.click();
			Thread.sleep(2000);
		}
			
	}
	/**
	 * Explixit wait function
	 * 
	 */
	public static void Clickon(WebDriver driver,WebElement locator,int timeout)	{
	 	   new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions
	 			   .elementToBeClickable(locator));
	 	   locator.click();
	    }
	/**
	 * Used to verify Book it now
	 * 
	 */
	public boolean verifyBookItNow() {
		return element("BookItNow").isDisplayed();
		
	}
	/**
	 * Used to click on book it now
	 * 
	 */
	public void ClickOnBookItNow() {
		Clickon(session.driver, element("BookItNow"), 20);
		
	}
	/**
	 * Used to verify ID
	 * 
	 */
	public boolean verifyIDEligibilityForm() {
		return element("IDeligibilty").isDisplayed();
	}
	/**
	 * Used to verify ID NUMBER
	 * 
	 */
	public boolean verifyidNumberEligibilityForm() {
		return element("IDnumber").isDisplayed();
	}
	/**
	 * Used to verify Nationality
	 * 
	 */
	public boolean verifyNationalityEligibilityForm() {
		return element("Nationality").isDisplayed();
	}
	/**
	 * Used to verify Current city
	 * 
	 */
	public boolean verifyCurrrentCityEligibilityForm() {
		return element("CurrentCity").isDisplayed();
	}
	/**
	 * Used to verify check button
	 * 
	 */
	public void ClickCheckButton() {
		element("CheckButton").click();
	}
	/**
	 * Used to verify nationality as saudi Arabia when ID is selected as saudi National ID
	 * 
	 */
	public boolean VerifyIDandIDtype() {
		boolean status;
		Select select = new Select(element("IDeligibilty"));
		select.selectByVisibleText("Saudi National ID");
		
		if (element("Nationality").getText().equals("Saudi Arabia"))
			status=true;
		else
			status=false;
		return status;
				
	}
	/**
	 * Used to verify check btn
	 * 
	 */
	public boolean verifyCheckBtn() {
		return element("CheckButton").isDisplayed();
	}
	/**
	 * Used to verify create account screen
	 * 
	 */
	public boolean RedirectedtoCreateAccountPage() {
		return element("CreateAccount").isDisplayed();
	}
	/**
	 * Used to click on continue
	 * 
	 */
	public void ClickOnContinue() {
		element("Continue").click();
		
	}
	/**
	 * Used to verify continue tab
	 * 
	 */
	public boolean VerifyContinue() {
		return element("Continue").isDisplayed();
	}
	/**
	 * Used to click legal stuff
	 * 
	 */
	public void ClickOnLegalStuff() {
		element("LegalStuff").click();
		
	}
	/**
	 * Used to verify email address
	 * 
	 */
	public boolean VerifyEmail() {
		return element("EmailAddress").isDisplayed();
	}
	/**
	 * Used to verify email Help text
	 * 
	 */
	public boolean VerifyEmailHelpText() {
		if (element("EmailAddress").getText().equals("Email Address"))
			return true;
		else
			return false;
	}
	/**
	 * Used to verify Password
	 * 
	 */
	public boolean VerifyPassword() {
		return element("Password").isDisplayed();
	}
	/**
	 * Used to verify mask button
	 * 
	 */
	public boolean VerifymaskButton() {
		return element("MaskedBtn").isDisplayed();
	}
	/**
	 * Used to verify password after clicked maskes button
	 * 
	 */
	public boolean VerifyasterikWhenMasked() {
		element("MaskedBtn").click();
		if(element("Password").getText().contains("*"))
			return true;
		else
			return false;
	}
	/**
	 * Used to verify legal stuff text
	 * 
	 */
	public boolean VerifyLegalStuff() {
		return element("LegalStuff").isDisplayed();
	}
	/**
	 * Used to social media gets enabled
	 * 
	 */
	public boolean VerifySocailMedianEnabled() {
		return element("SocialMedia").isEnabled();
	}
	/**
	 * Used to verify facebook
	 * 
	 */
	public boolean VerifyFacebook() {
		return element("Facebook").isDisplayed();
	}
	/**
	 * Used to verify twitter
	 * 
	 */
	public boolean VerifyTwitter() {
		return element("Twitter").isDisplayed();
	}
	/**
	 * Used to verify google
	 * 
	 */
	public boolean VerifyGoogle() {
		return element("Google").isDisplayed();
	}
	/**
	 * Used to verify create account gets enabled
	 * 
	 */
	public boolean VerifyCreateAccountEnabled() {
		return element("CreateAccount").isEnabled();
	}
	/**
	 * Used to verify drop down
	 * 
	 */
	public boolean VerifyNumberDropdown() {
		return element("NumberDropdown").isDisplayed();
	}
	/**
	 * Used to verify Number text in DD
	 * 
	 */
	public boolean VerifyNumberDisplayedInDD() {
		return element("NumberInDD").isDisplayed();
	}
	/**
	 * Used to verify Plan in DD
	 * 
	 */
    public boolean VerifyYourPlanInDD() {
	 return element("PlanInDD").isDisplayed();
	}
	
	
	
}