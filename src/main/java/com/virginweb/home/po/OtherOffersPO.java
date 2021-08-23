package com.virginweb.home.po;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

import cucumber.api.java.en.And;


public class OtherOffersPO extends MobileWebViewPage{

	public OtherOffersPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/OtherOffers");		

	}
	/**
	 * Used to click on plan and product
	 * 
	 */
	public void clickOnPandProduct() {
		element("planandprodct").click();
		
	}
	/**
	 * Used to click on Other offers
	 * 
	 */
	public void clickonoffers() {
		element("otherOffrs").click();
		
	}
	/**
	 * Used to redirect to offers page
	 * 
	 */
	public boolean redirecttoOffers() {
		boolean status = true;
		{
		if(element("prepaid").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * Used to check scroll down in prepaid
	 * 
	 */
	public boolean scrolldown() {
		Helper.scrollDown();
		boolean status = true;
		{
		if(element("prepaid").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * Used to validiate if prepaid tab is selected from before or not
	 * 
	 */
	public boolean prepaidSelected() {
		boolean status = true;
		{
		if(element("prepaid").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
		
	}
	/**
	 * Used to click on postpaid
	 * 
	 */
	public void clickOnPostpaid() {
		element("postpaid").click();
		
	}
	/**
	 * Used to redirect to postpaid page
	 * 
	 */
	public boolean redirecttoPostpaid() {
		boolean status = true;
		{
		if(element("postpaid").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
		
	}

	/**
	 * Used to scroll up and down in postpaid page 
	 * 
	 */
	public boolean scrollPostpaid() {
		Helper.scrollDown();
		Helper.scrollUp();
		boolean status = true;
		{
		if(element("postpaid").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
		
	}
	/**
	 * Used to click on package button 
	 * 
	 */
	public void clickOnPackageButton() {
		element("packagebtn").click();
	}
	/**
	 * Used to click back from postpaid page
	 * 
	 */
	public boolean clickOnPackageback() {
		session.driver.navigate().back();
		boolean status = true;
		{
			if(element("postpaid").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			}
			return status;
	}
	/**
	 * Used to verify package card
	 * 
	 */
	public boolean packagecardRedirected() {
		return element("packagebtn").isDisplayed();
	}
	/**
	 * Used to verify standard table
	 * 
	 */
	public boolean StandardTableVerify() {
		return element("StandardPackage").isDisplayed()&&element("PackageContent").isDisplayed();
	}
	/**
	 * Used to verify Monthly postpaid
	 * 
	 */
	public boolean MonthlyPostpaidVerify() {
		return element("MonthPostpaid").isDisplayed();
	}
	
	/**
	 * Used to verify premium table
	 * 
	 */
	public boolean PremiumTableVerify() {
		return element("Premium").isDisplayed()&&element("PremiumContent").isDisplayed();
	}
	/**
	 * Used to verify Monthly allowance
	 * 
	 */
	public boolean MonthlyAllowanceVerify() {
		return element("MonthlyAllowance").isDisplayed();
	}
	/**
	 * Used to verify Data Bundle
	 * 
	 */
	public boolean DataBundleVerify() {
		return element("DataBundle").isDisplayed();
	}
	/**
	 * Used to verify Exclusivetext
	 * 
	 */
	public boolean ExclusiveVirginText() {
		return element("ExclusiveText").isDisplayed();
	}
	/**
	 * Used to verify vat
	 * 
	 */
	public boolean VatDialText() {
		return element("VATDialText").isDisplayed();
	}
	/**
	 * Used to verify footer
	 * 
	 */
	public boolean FooterVerify() {
		return element("AboutVirginMob").isDisplayed()&&element("VirginGroup").isDisplayed()&&element("PrivacyPolicy").isDisplayed();
	}
	/**
	 * Used to verify sar 15 standard data
	 * 
	 */
	public boolean Sar15Display() {
		return element("Sar15").isDisplayed();
	}
	/**
	 * Used to verify standard text
	 * 
	 */
	public boolean StandardRowVerify() {
		return element("StandardRow").isDisplayed();
	}
	

}