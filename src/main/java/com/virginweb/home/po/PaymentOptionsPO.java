package com.virginweb.home.po;



import java.util.ArrayList;
import java.util.List;

//import org.apache.cassandra.thrift.Cassandra.AsyncProcessor.system_add_column_family;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;
import com.virginweb.utils.Xls_reader;

import cucumber.api.java.en.And;



public class PaymentOptionsPO extends MobileWebViewPage{

	
	public PaymentOptionsPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/InternationalRates");		

	}
	/**
	 * Used to verify and scroll the page down
	 * 
	 */
	public boolean ScrollPageVerify() {
		Helper.scrollDown();
		return element("GetPlan").isDisplayed();
	}
	/**
	 * Used to verify  dropdown your number	 * 
	 */
	public boolean VerifyNumberDD() {
		Boolean value = true;
		if(element("NumberDD").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify get plan
	 * 
	 */
	public boolean VerifyGetPlan() {
		Boolean value = true;
		if(element("GetPlan").isDisplayed())
		   {
				 value=true;
				
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify Get help
	 *
	 * 
	 */
	public boolean VerifyGetHelp() {
		Boolean value = true;
		if(element("GetHelp").isDisplayed())
		   {
				 value=true;
				
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify Get help page
	 *
	 */
	public boolean VerifyGetHelpPage() {
		return element("SearchForm").isDisplayed();
	}
	/**
	 * Used to verify plans in plan and product
	 *
	 */
	public boolean VerifyPlansInTab() {
		element("PlanProduct").click();
		return element("plans").isDisplayed();
	}
	/**
	 * Used to click on get plan
	 *
	 */
	public void ClickOnGetPlan() {
		element("GetPlan").click();
		
	}
	/**
	 * Used to click on get help
	 *
	 */
	public void ClickOnGethelp() {
		element("GetHelp").click();
		
	}
	/**
	 * Used to verify get plans page
	 *
	 */
	public boolean VerifyGetPlanPage() {
		return element("NumberDD").isDisplayed();
	}
	/**
	 * Used to verify NumberDropdown
	 *
	 */
	public boolean VerifyNumberDropDown() {
		return element("GetHelp").isDisplayed();
	}
	/**
	 * Used to verify redirection to get help tab
	 *
	 */
	public boolean VerifyGetHelpTab() {
		return element("SearchForm").isDisplayed();
	}
	/**
	 * Used to click on absher
	 *
	 */
	public void ClickOnAbsher() {
		element("AbsherBtn").click();
		
	}
	/**
	 * Used to verify absher
	 *
	 */
	public boolean VerifyAbsherTab() {
		return element("AbsherBtn").isDisplayed();
	}
	/**
	 * Used to click on dummy 
	 *
	 */
	public void ClickOnReturnIamDummy() {
		element("ReturnIamDummy").click();
		
	}
	/**
	 * Used to verify I am dummy
	 *
	 */
	public boolean VerifyReturnIamDummy() {
		return element("ReturnIamDummy").isDisplayed();
	}
	/**
	 * Used to click on absher
	 *
	 */
	public void ClickOnGetMeSim() {
		element("GetMeSim").click();
		
	}
	/**
	 * Used to verify GetSim
	 *
	 */
	public boolean VerifyGettingYourSim() {
		return element("GetYourSim").isDisplayed();
	}
	/**
	 * Used to verify Get me Sim
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyGetMeSim() throws InterruptedException {
		Thread.sleep(5000);
		return element("GetMeSim").isDisplayed();
	}
	/**
	 * Used to click PayNow
	 *
	 */
	public void ClickOnPayNow() {
		element("PayNow").click();
	}
	
	/**
	 * Used to verify Details about sim
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyGetMeSimDetailsPage() throws InterruptedException {
		Thread.sleep(3000);
		return element("DetailsSim").isDisplayed();
	}
	/**
	 * Used to verify Pay now
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyPayNow() throws InterruptedException {
		Thread.sleep(5000);
		return element("PayNow").isDisplayed();
	}
	/**
	 * Used to click pay now In pay your stuff
	 *
	 */
	public void ClickOnPayNowInPayurStuff() {
		element("PayNowStuff").click();		
	}
	/**
	 * Used to verify Paynow in pay ur stuff
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyPayNowInPayUrStuff() throws InterruptedException {
		Thread.sleep(5000);
		return element("PayNowInPayUrStuff").isDisplayed();
	}
	/**
	 * Used to verify Pay your stuff
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyPayYourStuff() throws InterruptedException {
		Thread.sleep(2000);
		return element("PayUrStuff").isDisplayed();
	}
	/**
	 * Used to verify Payment screen
	 * @throws InterruptedException 
	 *
	 */
	public boolean VerifyPaymentScreen() throws InterruptedException {
		Thread.sleep(5000);
		return element("PaymentScreen").isDisplayed();
	}
	/**
	 * Used to verify Card number
	 *
	 */
	public boolean VerifyCardNumberField() {
		return element("CardNumberField").isDisplayed();
	}
	/**
	 * Used to verify Card Name
	 *
	 */
	public boolean VerifyCardNameField() {
		return element("CardNameField").isDisplayed();
	}
	/**
	 * Used to verify Expiry Date
	 *
	 */
	public boolean VerifyExpiryDate() {
		return element("ExpiryDate").isDisplayed();
	}
	/**
	 * Used to verify Done Tab
	 *
	 */
	public boolean VerifyDoneBtn() {
		return element("Donetab").isDisplayed();
	}
	/**
	 * Used to verify CVV number
	 *
	 */
	public boolean VerifyCVVnumber() {
		return element("CvvNumber").isDisplayed();
	}
	/**
	 * Used to click Done
	 *
	 */
	public void ClickOnDone() {
		element("Donetab").click();
	}
	/**
	 * Used to click Try again
	 *
	 */
	public void ClickOnTryAgain() {
		element("TryAgain").click();
	}
	/**
	 * Used to verify Try again
	 *
	 */
	public boolean VerifyTryAgain() {
		return element("TryAgain").isDisplayed();
	}
	/**
	 * Used to verify After clicking on Try Again
	 *
	 */
	public boolean VerifyredirectedtoPage() {
		return element("CardNumberField").isDisplayed();
	}
	/**
	 * Used to verify card number added
	 *
	 */
	public boolean VerifyCardnumberAdded() {
		return element("CardNumberField").equals("4111 1111 1111 1111");
	}
	/**
	 * Used to verify card name added
	 *
	 */
	public boolean VerifyCardnameAdded() {
		return element("CardNameField").equals("dummy");
	}
	/**
	 * Used to verify cvv number added
	 *
	 */
	public boolean VerifyCVVAdded() {
		return element("CvvNumber").equals("123");
	}
	/**
	 * Used to verify Expiry date added
	 *
	 */
	public boolean VerifyExpiryDateAdded() {
		return element("ExpiryDate").equals("05/21");
	}
	public void ClickPaytab() {
		element("PayUrStuff").click();
		
	}
	
}