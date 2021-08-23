package com.virginweb.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;


public class RatesPO extends MobileWebViewPage{

	/**
	 * extend  WebViewPage
	 * 
	 */
	
	public RatesPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/Rates");		
	}
	/**
	 * Used to click on - Plan And Product
	 * 
	 */
	public void planandProductClickAgain() {
		element("PlanandProductAgain").click();
		
	}
	/**
	 * Used to click on -Frendi
	 * 
	 */
	public void FrendiClickAgain() {
		element("FrendiAgain").click();
		
	}
	/**
	 * Used to validiate its redirected to page for not
	 * 
	 */
	public boolean FrendipageRedirected() {
		boolean status = true;
		{
			if(element("RtesFrendibtn").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			}
			return status;
	}
	/**
	 * Used to click on - Rates on Frendi tab
	 * 
	 * 
	 */
	public void RtesClickFrendiTab() {
		element("RtesFrendibtn").click();
	}
	/**
	 * Used to scroll down
	 * 
	 */
	public void scrollRtesPage() {
		Helper.scrollDown();
		
	}
	/**
	 * Used to check if international rates is highlighted or not
	 * 
	 */
	public boolean InternationalRtesFrendiHighlghted() {
		boolean status = true;
		{
			if(element("RtesFrendibtn").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			}
			return status;
	}
	/**
	 * Used to click on - International Rates
	 * 
	 */
	public void internationalratesClickFrendi() {
		element("internationalFrendiRtes").click();
		
	}
	/**
	 * Used to click on - Package rates
	 * 
	 */
	public void PackageBtnFrendi() {
		element("PackageFrendiRtes").click();
		
	}
	/**
	 * Used to click on - Roaming rates
	 * 
	 */
	public void RoamingBtnFrendi() {
		element("RoamingFrendiRtes").click();
		
	}
	/**
	 * Used to click on - dropdown and select
	 * 
	 */
	public void dropdownFrendi() {
		element("selectfromDrop").click();
		Select dropdown = new Select(session.driver.findElement(By.xpath("//select[@id='slct_countries_roaming']")));
		dropdown.selectByVisibleText("50 SAR");
		
	}
	/**
	 * Used to click on - offers
	 * 
	 */
	public void offersFrendiClick() {
		element("OffersFrendiClick").click();
		
	}
	/**
	 * Used to validaite offer frendi page
	 * 
	 */
	public boolean offersFrendiRedirected() {
		boolean status = true;
		{
			if(element("OffersFrendiClick").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			}
			return status;
	}
	/**
	 * Used to scroll down
	 * 
	 */
	public void scrollFrendiOffers() {
		Helper.scrollDown();
		
	}
	/**
	 * Used to click on -package Frendi offers
	 * 
	 */
	public void packageFrendiOffer() {
		element("packageFrendiOffers").click();
		
	}
	/**
	 * Used to validiate rates on the page
	 * 
	 */
	public boolean validiateRates() {
	     return	element("RatesInRoaming").isDisplayed();
	}
	/**
	 * Used to verify Rates in Package
	 * 
	 */
	public boolean verifyRatesinPackage() {
		 return	element("RatesInPackage").isDisplayed();
	}
	/**
	 * Used to verify PackageFile
	 * 
	 */
	public boolean verifyPackageFile() {
		return	element("PackageFile").isDisplayed();
	}
	
	
	
	
}