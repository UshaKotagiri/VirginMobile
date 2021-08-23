package com.virginweb.home.po;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class FamilyDevicePO extends MobileWebViewPage{

	/**
	 * extend  MobileWebViewPage
	 * 
	 */
	
	public FamilyDevicePO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/FamilyDevice");		
	}
	/**
	 * Used to click on - Plan And Product
	 * 
	 */
	public void clickplanproduct() {
		element("plnproduct").click();
		
	}
	/**
	 * Used to click on - family
	 * 
	 */
	public void clickFamily() {
		
		element("familyt").click();
	}
	/**
	 * Used to scroll down the page and verify
	 * 
	 */
	public boolean scrolldownthepage() {
		
		Helper.scrollDown();
		boolean value = false;
		
		if(element("joinnow1").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to click on - download link
	 * 
	 */
	public void ClickonDownload() {
		element("download").click();
		
	}
	/**
	 * Used to verify its directed to download page or not
	 * 
	 */
	public boolean redirecttodownload() {
        boolean value = false;
		
		if(element("hello").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to go to back page
	 * 
	 */
	public void clickbackjoin() {
		session.driver.navigate().back();
		
	}
	/**
	 * Used to join now link
	 * @throws InterruptedException 
	 * 
	 */
	public void Clickonjoin() throws InterruptedException {
		element("joinnow1").click();
		Thread.sleep(2000);
		
	}
	/**
	 * Used to redirect to join  now page
	 * @throws InterruptedException 
	 * 
	 */
	public boolean redirecttojoin() throws InterruptedException {
		Thread.sleep(5000);
		 boolean value = true;
	     if(element("search//div[@class='tab_head active']").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify banner
	 * 
	 */
	public boolean BannerFamilyDevice() {
		boolean value = true;
	     if(element("BannerFamily").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify image
	 * 
	 */
	public boolean FamilyImageVerify() {
		boolean value = true;
	     if(element("imageFamily").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify text
	 * 
	 */
	public boolean FamilyTextVerify() {
		boolean value = true;
	     if(element("TextFamily").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify plan
	 * 
	 */
	public boolean FamilyPlanVerify() {
		boolean value = true;
	     if(element("BasicPLANFamily").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify section
	 * 
	 */
	public boolean FamilysectionVerify() {
		boolean value = true;
	     if(element("WhatItIsfrFamily").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify download app
	 * 
	 */
	public void DownloadAppMob() {
		element("downloadAppMob").click();
		
	}
	/**
	 * Used to verify download
	 * 
	 */
	public boolean FamilysectionVerifyDownload() {
		boolean value = true;
	     if(element("downloadAppMob").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify joinnow
	 * 
	 */
	public boolean FamilysectionVerifyJoinnow() {
		boolean value = true;
	     if(element("joinnow1").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify text
	 * 
	 */
	public boolean FamilysectionVerifyText() {
		boolean value = true;
	     if(element("TextLabel1").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify appstore
	 * 
	 */
	public boolean FamilysectionVerifyappstore() {
		boolean value = true;
	     if(element("appStore").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify google store
	 * 
	 */
	public boolean FamilysectionVerifygoogleStore() {
		
			boolean value = true;
		     if(element("googleStore").isDisplayed()){
					  value = true;
					}
					else
					   value = false;
					
					return value;
	}
	/**
	 * Used to verify new customer section
	 * 
	 */
	public boolean FamilysectionVerifynewcustomer() {
		boolean value = true;
	     if(element("NewCustomer").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify Virgin mobile customer
	 * 
	 */
	public boolean FamilysectionVerifyTextMegastore() {
		boolean value = true;
	     if(element("MegastoreText").isDisplayed()){
				  value = true;
				}
				else
				   value = false;
				
				return value;
	}
	/**
	 * Used to verify Family page
	 * 
	 */
	public boolean FamilyPageVerification() {
		return element("WhatItIsfrFamily").isDisplayed();
	}
	
	
	
}