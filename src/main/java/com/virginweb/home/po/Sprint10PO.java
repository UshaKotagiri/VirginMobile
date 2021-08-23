package com.virginweb.home.po;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.galenframework.tests.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;



public class Sprint10PO extends MobileWebViewPage{

	public Sprint10PO(com.virginweb.automation.framework.TestSession session, String pageYamlFile) throws Exception {
		super(session, "Applications/virginweb/HomeWeb");
	}
	/**
	 *click on plan and producct
	 * 
	 */
	public void ClickOnPlansandProductdd() throws InterruptedException {
		Thread.sleep(3000);
		element("PlanandProductAgain").click();
		
	}
	/**
	 * click on rates
	 * 
	 */
	public void ClickOnInternationalRates() {
		element("Rates").click();
		
	}
	/**
	 * redirected to offers
	 * 
	 */
	public boolean RedirectedToOfferspg() {
		boolean value = true;
		
		if(element("OffersPage").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify prepaid text
	 * 
	 */
	public boolean prepaidVerification() {
boolean value = true;
		
		if(element("OffersPage").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the vat text
	 * 
	 */
	public boolean VATtextVerification() {
boolean value = true;
		
		if(element("VatText1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the bundhela text
	 * 
	 */
	public boolean BundhelaVerify() {
boolean value = true;
		
		if(element("BundhelaPlans").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the fees text
	 * 
	 */
	public boolean feesVerify() {
boolean value = true;
		
		if(element("FeesVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the sar text
	 * 
	 */
	public boolean sarMinVerify() {
boolean value = true;
		
		if(element("sarVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the dial text
	 * 
	 */
	public boolean DialVerify() {
boolean value = true;
		
		if(element("DialVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the validity text
	 * 
	 */
	public boolean validityInBundhela() {
boolean value = true;
		
		if(element("ValidityBundhela").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the sar text
	 * in bundhela
	 */
	public boolean sarInBundhela() {
boolean value = true;
		
		if(element("sarVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the dial text in social
	 * 
	 */
	public boolean DialInSocial() {
boolean value = true;
		
		if(element("DialVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the vat text in bundhela
	 * 
	 */
	public boolean Vattextverify() {
boolean value = true;
		
		if(element("VatText1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the National Mins
	 * 
	 */
	public boolean NationalMinVerify() {
boolean value = true;
		
		if(element("NationalMin").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the fees text in national mins
	 * 
	 */
	public boolean FeesUnderNationalMin() {
boolean value = true;
		
		if(element("FeesNationalMins").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	
	}
	/**
	 * verify the dial text
	 * 
	 */
	public boolean DialUnderNationalMin() {
boolean value = true;
		
		if(element("DialVerify").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the vat text under national text
	 * 
	 */
	public boolean VatUnderNatioanalMin() {
boolean value = true;
		
		if(element("VatText1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the postpaid text
	 * 
	 */
	public boolean PostpaidBtnverify() {
boolean value = true;
		
		if(element("Postpaid").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the standard pricing text
	 * 
	 */
	public boolean StandardPricingVerify() {
boolean value = true;
		
		if(element("StandardPricing").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the vat text
	 * 
	 */
	public boolean VatInPostpaid() {
boolean value = true;
		
		if(element("VatText1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the international rates page
	 * 
	 */
	public boolean InternationVerify() {
boolean value = true;
		
		if(element("countries").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify the Roaming page
	 * 
	 */
	public boolean RoamingVerify() {
boolean value = true;
		
		if(element("countries").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * verify if its redirected to rates or not
	 * 
	 */
	public boolean internationalRatesRedirectedVerify() {
boolean value = true;
		
		if(element("VatText1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Click on  Roaming
	 * 
	 */
	public void clickRoaming() {
		element("ClickRoaming").click();
		
	}
	/**
	 * Used to verify roaming page
	 * 
	 */
	public boolean internationalRoamRedirectedVerify() {
		
boolean value = true;
		
		if(element("DataRoaming").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify table
	 * 
	 */
	public boolean internationalRoamTableRedirectedVerify() {
		
boolean value = true;
		
		if(element("TableRoaming").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify emptiness of table
	 * 
	 */
	public boolean internationaltableEmptyVerify() {
		
boolean value = true;
		String Table = element("TableEmptyRoaming").getText();
		if(Table.equals("-")){
			
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to click on frendi
	 * 
	 */
	public void FrendiClick() {
		element("FrendiPcLICK").click();
		
	}
	/**
	 * Used to verify package card
	 * 
	 */
	public boolean packageCardverify() {
		
boolean value = true;
		
		if(element("PACKAGERoaming").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to click roaming data
	 * 
	 */
	public void DataClickRoaming() {
		element("DataClick").click();
		
	}
	/**
	 * Used to verify data bundles
	 * 
	 */
	public boolean DatabundlesVrify() {
		
boolean value = true;
		
		if(element("DataBundleFrendi").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify data
	 * 
	 */
	public boolean FeesVerifyData() {
		
boolean value = true;
		
		if(element("DatafeeFrendi").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify data in bundles
	 * 
	 */
	public boolean DataVerifyFrendiP() {
		
boolean value = true;
		
		if(element("DataVerifyFrendi").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify vat 
	 * 
	 */
	public boolean VATFrendiPVerify() {
		
boolean value = true;
		
		if(element("vatVerifyFrendi").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to verify NightTimeFrendi
	 * 
	 */
	public boolean NighttimeFrendiPVerify() {
		
boolean value = true;
		
		if(element("NightTimeVerifyFrendi").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}

	

	
	
}