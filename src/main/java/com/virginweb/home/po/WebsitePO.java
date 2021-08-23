package com.virginweb.home.po;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class WebsitePO extends MobileWebViewPage{

	public WebsitePO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/Website");
	}
	/**
	 * Used to click on EmailAddress
	 * 
	 */
	public void EnterEmailAddress() {
		element("EmailAddress").sendKeys("xyz@yopmail.com");
		
	}
	/**
	 * Used to click on Subscribe
	 * 
	 */
	public void ClickOnSubscribe() {
		element("Subscribe").click();
		
	}
	/**
	 * Used to verify create your plan
	 * 
	 */
	public boolean VerifyCreateYourPlan() {
		return element("CreateYourPlan").isDisplayed();
	}
	/**
	 * Used to text verification
	 * 
	 */
	public boolean TextVerification() {
		return element("FooterText").isDisplayed();
	}
	/**
	 * Used to verify About virgin mobile
	 * 
	 */
	public boolean AboutVirginMobileVerify() {
		return element("AboutVirginMob").isDisplayed();
	}
	/**
	 * Used to verify Terms and condition
	 * 
	 */
	public boolean TermsandConditionsVerify() {
		return element("TermsandCondition").isDisplayed();
	}
	/**
	 * Used to verify Privacy policy
	 * 
	 */
	public boolean PrivacyPolicyVerify() {
		return element("PrivacyPolicy").isDisplayed();
	}
	/**
	 * Used to verify banner
	 * 
	 */
	public boolean BannerVerify() {
		return element("Banner").isDisplayed();
	}
	/**
	 * Used to verify about mobile text
	 * 
	 */
	public boolean AboutMobileTextVerify() {
		return element("AboutMobTextVerify").isDisplayed();
	}
	/**
	 * Used to verify you tube
	 * 
	 */
	public boolean YoutubeVerify() {
		return element("YouTubeVerify").isDisplayed();
	}
	/**
	 * Used to verify twitter
	 * 
	 */
	public boolean TwitterVerify() {
		return element("TwitterVerify").isDisplayed();
	}
	/**
	 * Used to verify facebook
	 * 
	 */
	public boolean facebookVerify() {
		return element("FacebookVerify").isDisplayed();
	}
	/**
	 * Used to verify Instagram
	 * 
	 */
	public boolean InstagramVerify() {
		return element("InstagramVerify").isDisplayed();
	}
	/**
	 * Used to verify all Rights reserved text
	 * 
	 */
	public boolean AllRightsReservedTextVerify() {
		return element("AllRightsReservedText").isDisplayed();
	}
	/**
	 * Used to verify email
	 * 
	 */
	public boolean EmailAddressVerify() {
		return element("EmailAddress").isDisplayed();
	}
	/**
	 * Used to verify subscribe btn
	 * 
	 */
	public boolean SubscribebtnVerify() {
		return element("Subscribe").isDisplayed();
	}
	/**
	 * Used to verify successmessage
	 * 
	 */
	public boolean SuccessmsgVerify() {
		return element("SucessmsgVerify").isDisplayed();
	}
	/**
	 * Used to click Google playstore
	 * 
	 */
	public void GooglePlaystoreClick() {
		element("GooglePlaystore").click();
		
	}
	/**
	 * Used to verify Google playstore
	 * 
	 */
	public boolean GoogleplaystoreVerify() {
		return element("GooglePlaystore").isDisplayed();
	}
	/**
	 * Used to verify redirected to google playstorepage
	 * 
	 */
	public boolean RedirectedtoGooglePlaystore() {
		return element("GooglePlayRedirected").isDisplayed();
	}
	public boolean verifyPromotionPlan() {
		return element("PromotonPlan").isDisplayed();
	}
	public boolean VerifyDataInPlan() {
		return element("DataInPlan").isDisplayed();
	}
	public boolean VerifyJustSim() {
		return element("JustSim").isDisplayed();
	}
	public boolean ErrorMessage() throws InterruptedException {
		element("Subscribe").sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		element("SubscribeButton").click();
		return element("ErrorMessage").isDisplayed();
	}
	public boolean verifyFooterlink() {
		return element("TermsCondition").isDisplayed()&&element("AboutVirgin").isDisplayed()&&element("customerRights").isDisplayed();
	}
	public boolean VerifyBannerTitle() {
		return element("Banner").isDisplayed()&&element("Title").isDisplayed();
	}
	public boolean VerifyGoogleStore() {
		return element("playstore").isDisplayed();
	}
	
	
	
}
	