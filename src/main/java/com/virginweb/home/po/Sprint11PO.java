package com.virginweb.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

import cucumber.api.java.en.And;


public class Sprint11PO extends MobileWebViewPage{

	public Sprint11PO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/Sprint11");		

	}
	/**
	 * Used to verify Sar70 in homepage
	 * 
	 */
	public boolean Verify70SarHomepage() {
		return element("Sar70Homepage").isDisplayed();
	}
	/**
	 * Used to verify Sar100 in homepage
	 * 
	 */
	public boolean Verify100SarHomepage() {
		return element("Sar100Homepage").isDisplayed();
		
	}
	/**
	 * Used to verify Sar125 in homepage
	 * 
	 */
	public boolean Verify125SarHomepage() {
		return element("Sar125Homepage").isDisplayed();
		
	}
	/**
	 * Used to verify Sar70 in plan
	 * 
	 */
	public boolean Verify70SarPlan() {
		return element("Sar75Homepage").isDisplayed();
		
	}
	/**
	 * Used to verify Sar100 in plan
	 * 
	 */
	public boolean Verify100SarPlan() {
		return element("Sar100Homepage").isDisplayed();
		
	}
	/**
	 * Used to verify Sar125 in plan
	 * 
	 */
	public boolean Verify125SarPlan() {
		return element("Sar125Homepage").isDisplayed();
		
	}
	/**
	 * Used to verify Sar100 in join now
	 * 
	 */
	public boolean Verify100SarJoinNow() {
		return element("Sar100Joinnow").isDisplayed();
		
	}
	/**
	 * Used to verify Sar125 in join now
	 * 
	 */
	public boolean Verify125SarJoinNow() {
		return element("Sar125Joinnow").isDisplayed();
		
	}
	/**
	 * Used to verify Sar70 in join now
	 * 
	 */
	public boolean Verify70SarJoinNow() {
		return element("Sar70Joinnow").isDisplayed();
	}
	/**
	 * Used to click on plan
	 * 
	 */
	public void ClickPlan() {
		element("Plan").click();
		
	}
	/**
	 * Used to verify hamburger
	 * 
	 */
	public boolean VerifyHamburger() {
		return element("Hamburger").isDisplayed();
	}
	/**
	 * Used to verify hamburger options
	 * 
	 */
	public boolean VerifyOptionsInHamburger() {
		boolean status;
		element("Hamburger").click();
		if (element("PlanProduct").isDisplayed()&&element("HelpSupport").isDisplayed()&&element("TopUp").isDisplayed())
			status = true;
		else
			status = false;
		return status;
	
	}
	/**
	 * Used to verify create your plan
	 * 
	 */
	public boolean verifyCreateYourPlan() {
		return element("CreatePlan").isDisplayed();
	}
	/**
	 * Used to verify button is clickable
	 * 
	 */
	public boolean VerifyClickYourPlanIsClickkable() {
		WebDriverWait wait = new WebDriverWait(session.driver, 10);
		WebElement status =wait.until(ExpectedConditions.elementToBeClickable(element("CreatePlan")));
		return status.isDisplayed();
	}
	/**
	 * Used to verify National min
	 * 
	 */
	public boolean VerifyNationalMinutes() {
		return element("NationalMinutes").isDisplayed();
	}
	/**
	 * Used to verify create plan
	 * 
	 */
	public boolean VerifyandClickCreateYourPlan() {
		boolean status;
		if (element("CreatePlan").isDisplayed()){
			element("CreatePlan").click();
			status = true;
		}
		else
			status = false;
		return status;
		
	}
	/**
	 * Used to click on close hamburger btn
	 * 
	 */
	public void Clicknclose() {
		element("close").click();
		
	}
	public void scrollPageSprint11() {
		Helper.scrollDown();
		
	}
	
}