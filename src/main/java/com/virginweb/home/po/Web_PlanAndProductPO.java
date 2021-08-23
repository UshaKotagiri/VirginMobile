package com.virginweb.home.po;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class Web_PlanAndProductPO extends MobileWebViewPage{

	public Web_PlanAndProductPO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/Web_PlanAndProduct");
	}
	
	/**
	 * Used to click Other Offer
	 * 
	 */

	public void click_OtherOffer() throws InterruptedException{
		Actions action=new Actions(session.driver);
		action.moveToElement(element("PlanAndProduct")).build().perform();
		Thread.sleep(3000);
		element("OtherOffer").click();
	}
	
	/**
	 * Used to verify OtherOffer page
	 * 
	 */
	
	public boolean verify_OtherOffer() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Prepaid_Content")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to Scroll page up and down
	 * 
	 */
	
	public void scroll_PageUpPageDown() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(2000);
		Helper.scrollUp();
	}
	
	/**
	 * Used to click Postpaid
	 * 
	 */
	
	public void click_Postpaid() {
		element("PostPaid_Lnk").click();
	}
	
	/**
	 * Used to verify Postpaid details
	 * 
	 */
	
	public boolean verify_PostPaidDetails() {
		boolean status=false;
		
		if(element("Postpaid_Content").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/**
	 * Used to click package card button
	 * 
	 */
	
	public void click_Package_Btn() throws InterruptedException {
		element("PackageCardButton").click();
	}
	
	/**
	 * Used to verify pdf file on next tab
	 * 
	 */
	
	public boolean verify_PackagePdf() throws InterruptedException {
		boolean value = false;
	
		String parent = session.driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		ArrayList<String> tabs = new ArrayList<>(child);
		session.driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		String Pdf_ActualURL = session.driver.getCurrentUrl();
		if (Pdf_ActualURL.contains(".pdf")) {
			value = true;
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to click back button on browser
	 * 
	 */
	
	public void click_BackBrowser() {
		session.driver.navigate().back();
	}
	
	/**
	 * Used to verify Homepage
	 * 
	 */
	
	public boolean verify_Home() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("ILoveIT_VerifyHome")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click International Rate
	 * 
	 */
	
	public void click_InternationalRate() throws InterruptedException {
		Actions action=new Actions(session.driver);
		action.moveToElement(element("PlanAndProduct")).build().perform();
		Thread.sleep(3000);
		element("InterNationalRates").click();
	}
	
	/**
	 * Used to verify International Rate page
	 * 
	 */
	
	public boolean verify_InternationalRatePage() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("SlectCountryText")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click country DropDown
	 * 
	 */
	
	public void click_CountryDropDwn() throws InterruptedException {
		element("SelectCountry_Drpdwn").click();
		Thread.sleep(1000);
		Select select = new Select(element("SelectCountry_Drpdwn"));
		select.selectByVisibleText("Afghanistan");
	}
	
	/**
	 * Used to verify country dropdown
	 * 
	 */
	
	public boolean verify_CountryDropdwn() {
		boolean value = false;

		if (element("Country_inDrpdWn").isSelected()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to verify LocalCall and SMS fields
	 * 
	 */
	
	public boolean verify_LocalSMS_Calls(){
		boolean value = false;
		
		System.out.println(element("Call_Field").getText()+ "is the call value");
		System.out.println(element("SMS_Field").getText()+ "is the SMS value");
		if ((element("Call_Field").getText().contains("SAR")) && (element("SMS_Field").getText().contains("SAR"))) {
			value = true;
		} else {
			value = false;
		}
		
		return value;
	}
	
	/**
	 * Used to click International Roaming
	 * 
	 */
	
	public void click_InternationalRoaming() throws InterruptedException {
		Actions action=new Actions(session.driver);
		action.moveToElement(element("PlanAndProduct")).build().perform();
		Thread.sleep(3000);
		element("Inter_Roaming").click();
	}
	
	/**
	 * Used to verify International Roaming page
	 * 
	 */
	
	public boolean verify_InternationalRoamingPage() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("SlectCountryText")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click country DropDown
	 * 
	 */
	
	public void click_CountryDropDwn1() throws InterruptedException {
		element("SelectCountryRoam").click();
		Thread.sleep(1000);
		Select select = new Select(element("SelectCountryRoam"));
		select.selectByVisibleText("AFGHANISTAN");
	}
	
	/**
	 * Used to verify country dropdown
	 * 
	 */
	
	public boolean verify_CountryDropdwn1() {
		boolean value = false;

		if (element("CountryRoam").isSelected()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to verify LocalCall, SMS fields
	 * 
	 */
	
	public boolean verify_LocalSMSCalls(){
		boolean value = false;
		
		if ((element("Received_Calls").getText().contains("SAR")) && (element("CallToKSA").getText().contains("SAR")) &&  (element("LocalCallRate").getText().contains("SAR"))) {
			value = true;
		} else {
			value = false;
		}
		
		return value;
	}
	
	/**
	 * Used to click Family Tag Device
	 * 
	 */
	
	public void click_FamilyTagDevice() throws InterruptedException {
		Actions action=new Actions(session.driver);
		action.moveToElement(element("PlanAndProduct")).build().perform();
		Thread.sleep(3000);
		element("Family_Tag_Device").click();
	}
	
	/**
	 * Used to verify Family Tag Device
	 * 
	 */
	
	public boolean verify_FamilyTagDevice() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Family_TagDevicePage")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Download App
	 * 
	 */
	
	public void click_DownloadApp() {
		((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("Download_App"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("Download_App"))).click();
	}
	
	/**
	 * Used to verify Download page
	 * 
	 */
	
	public boolean verify_DownloadPage() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Download_Page")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Join Now button
	 * 
	 */
	
	public void click_Join_Now() {
		((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("Join_Now"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("Join_Now"))).click();
	}
	
	/**
	 * Used to verify JoinNow Page
	 * 
	 */
	
	public boolean verify_Join_Now() {
        WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("JoinNowPage")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Friendi Pack
	 * 
	 */

	public void click_FriendiPack() throws InterruptedException{
		Actions action=new Actions(session.driver);
		action.moveToElement(element("PlanAndProduct")).build().perform();
		Thread.sleep(3000);
		element("FriendiPack").click();
	}
	
	/**
	 * Used to verify FriendiPAck
	 * 
	 */
	
	public boolean verify_FriendiPackPage() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("FriendiPackConfirm")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to verify FriendiPAckBydefaultbutton
	 * 
	 */
	
	public boolean verify_FrindyButtonSelected() {
		boolean status=false;
		
		if(element("FriendiButton").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}
	
	/**
	 * Used to click data button
	 * 
	 */
	
	public void click_DataButton() {
		element("Data_button").click();
	}
	
	/**
	 * Used to verify Data detail page
	 * 
	 */
	
	public boolean verify_DataDetailPage() {
		boolean status=false;
		
		if(element("Data_Detail").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}		
		return status;
	}
	

	/**
	 * Used to Click with Package card
	 * 
	 */
	
	public void click_PackageButton1() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("PackageCard1"))).click();
	}
	
	
	/**
	 * Used to Click with Package card1
	 * 
	 */
	
	public void click_PackageButton11() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("Pack"))).click();
	}
	/**
	 * Used to verify Click with Package card
	 * 
	 */
	
	public boolean verify_PackageBtnClickableNew() throws InterruptedException {
		boolean value = false;
		String parent = session.driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		System.out.println("Total number of tabs opened are" + count);
		if (count > 1) {
			value = true;
			ArrayList<String> tabs = new ArrayList<>(child);
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to verify Pdf file with Package card
	 * 
	 */
	
	public boolean verify_PackagePdfFileNew() throws InterruptedException {
		boolean value = false;
		// String Pdf_ExpectedUrl=
		// "https://vm-ksa-po-frontend-staging.s3.ap-southeast-1.amazonaws.com/config-images/e84c3f1f-4875-44e4-8cde-d8e8154e34d9.pdf";
		String parent = session.driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		ArrayList<String> tabs = new ArrayList<>(child);
		session.driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		String Pdf_ActualURL = session.driver.getCurrentUrl();
		if (Pdf_ActualURL.contains(".pdf") || Pdf_ActualURL.contains(".png")) {
			value = true;
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to click on call button
	 * 
	 */
	
	public void click_CallButton() {
		element("Call_button").click();
	}
	
	/**
	 * Used to verify card button detail page
	 * 
	 */
	
	public boolean verify_CallDetail() {
		boolean status=false;
		
		if(element("Call_detail").isDisplayed()) {
			status=true;
		}else {
			status=false;
		}
		
		return status;
	}
	
	/**
	 * Used to scroll card page
	 * 
	 */
	
	public void scroll_downPage() {
		((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("ScrollToCard"));
	}
	/**
	 * Used to verify prepaid is selected by default
	 * 
	 */
	public boolean verify_PrepaidBtnIsSelected() {
		return element("Prepaid_Content").isDisplayed();
		
	}
	/**
	 * Used to verify Data Bundles
	 * 
	 */
	public boolean verifyDataBundles() {
		return element("DataBundles").isSelected();
	}
	/**
	 * Used to verify premium package
	 * 
	 */
	public boolean verifyPremiumPackage() {
		return element("PremiumPackage").isSelected();
	}
	
	
	
}
