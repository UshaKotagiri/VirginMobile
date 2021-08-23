package com.virginweb.home.po;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

import cucumber.api.java.en.And;


public class InternationalRoamingPO extends MobileWebViewPage{

	public InternationalRoamingPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/InternationalRoaming");		

	}
	/**
	 * Used to click on plan and product
	 * 
	 */
	public void clickonPlansandProduct1a() {
		element("planandp1").click();
		
	}
	/**
	 * Used to click on Roaming
	 * 
	 */
	public void clickOnroaming1() {
		
		element("clickOnRoam").click();
	}
	/**
	 * Used to scroll and validiate
	 * 
	 */
	public boolean scrollpageroam() {
	
		Helper.scrollDown();
		
		boolean status;
		if(element("localRoamrates").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
			
		}
	/**
	 * Used to click on select countries
	 * 
	 */
	public void clickselectCountriesa() {
		
		element("selectcountriesa").click();
	}
	/**
	 * Used to select from drop down
	 * 
	 */
	public boolean selectandvalidiate() {
		boolean status = true;
		Select dropdown = new Select(session.driver.findElement(By.xpath("//select[@id='slct_countries_roaming']")));
		dropdown.selectByVisibleText("AFGHANISTAN");	
		element("selectcountriesa").click();
		Helper.scrollDown();
		if(element("localRoamrates").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to click on back via navigate
	 * 
	 */
	public void clickbackroamp() {
		session.driver.navigate().back();
		
		
	}
	public void clickplanproduct12() {
		element("planProduct").click();
	}
	/**
	 * Used to verify Header
	 * 
	 */
	public boolean RoamingHeader() {
		boolean status = true;
		if(element("HeaderRoaming").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify Banner
	 * 
	 */
	public boolean RoamingBanner() {
		boolean status = true;
		if(element("HeaderBanner").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify Roaming Bundles
	 * 
	 */
	public boolean RoamingBundles() {
		boolean status = true;
		if(element("RoamingBundles").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}/**
	 * Used to verify text
	 * 
	 */
	public boolean TextRoamingBundles() {
		boolean status = true;
		if(element("TextRoamingBundles").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify 25 Sar
	 * 
	 */
	public boolean TextRoaming25sar() {
		boolean status = true;
		if(element("TextRoaming25sar").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify 25 sar
	 * 
	 */
	public boolean TextRoaming50sar() {
		boolean status = true;
		if(element("TextRoaming50sar").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify countries
	 * 
	 */
	public boolean TextRoamingkuwait() {
		boolean status = true;
		if(element("TextRoamingkuwait").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify valid for
	 * 
	 */
	public boolean CountryValidityTab() {
		boolean status = true;
		if(element("Validitytab").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify you pay tab
	 * 
	 */
	public boolean CountryYouPayTab() {
		boolean status = true;
		if(element("YouPayTab").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify you get tab
	 * 
	 */
	public boolean CountryYougetTab() {
		boolean status = true;
		if(element("YouGetTab").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	
	
	
}