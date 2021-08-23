package com.virginweb.home.po;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

/**
 * 
 * @author Nimit Jain
 *
 */
public class HomePO extends MobileWebViewPage{

	/**
	 * extend  MobileWebViewPage
	 * 
	 */
	
	public HomePO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/HomePage");		
	}
	
	/**
	 * Used to click on - Plan And Product
	 * 
	 */
	public void clickPlanAndProduct()
	{
		element("planAndProduct").click();
	}

	/**
	 * Used to click on  - click on plans
	 * 
	 */
	public void clickOnPlan() {
		
		
		element("plan").click();
		
	}
	/**
	 * Used to click on  - click on offers
	 * 
	 */

	public void clickOnOffers() {
		
		element("offers").click();
	}

	/**
	 * Used to click on  - international rates
	 * 
	 */
	public void clickOnInternationalRates() {
		element("intrrates").click();
		
	}

	public void clickOnInternationalRoaming() {
		
		element("intrroam").click();
	}
	
	/**
	 * Used to click on  - Family tag
	 * 
	 */

	public void clickOnFamiltTag() {
		element("familytag").click();
		
	}

	/**
	 * Used to click on  - Frendi
	 * 
	 */
	public void clickOnFrendi() {
		element("frendi").click();
		
	}
	/**
	 * Used to click on  - Help and Support
	 * 
	 */

	public void clickHelpAndSupport() {
		element("helpandsupport").click();
		
	}
	/**
	 * Used to click on  - faq
	 * 
	 */
	public void clickOnfaq() {
		element("faq").click();
		
	}
	/**
	 * Used to click on  - contact
	 * 
	 */
	public void clickOncontact() {
		element("contact").click();
		
	}
	/**
	 * Used to click on  - find a store
	 * 
	 */
	public void clickOnFindAStore() {
		element("findastore").click();
	}
	/**
	 * Used to click on  - why virgin mobile
	 * 
	 */
	public void clickOnWhyVirginMobile() {
		element("whyvirginmob").click();
	}

	/**
	 * Used to click on  - different language
	 * 
	 */
	public void clickOndiffLanguage() {
		
		element("difflanguage").click();
	}
	/**
	 * Used to click on - quick top up
	 * 
	 */
	public void clickOnTopUp() {
		element("topup").click();
		
	}
	/**
	 * Used to click on - Join Us
	 * 
	 */

	public void clickOnJoinUs() {
		element("joinus").click();
		
	}
	/**
	 * Used to click on - hamburger and plan and product
	 * @throws InterruptedException 
	 * 
	 */
	public void clickOnHamburgerAndPlan() throws InterruptedException {
		element("HamburgerInMob").click();
		Thread.sleep(2000);
		element("planAndProductham").click();
		
	}
	/**
	 * Used to click on - planAndProduct
	 * 
	 */

	public boolean ValidiatePage() {
		boolean status = true;
		{
		if(element("planAndProductham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * Used to click on - plan
	 * 
	 */
	public void clickOnHamburgerPlan() {
		element("planham").click();
		
	}
	/**
	 * Used to click on - offers
	 * 
	 */
	public void clickOnOffersHam() {
		element("offerHam").click();
		
	}
	/**
	 * Used to click on - rates
	 * 
	 */
	public boolean clickOnInternationalRatesHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("InternationalHam").click();
		return status;
		
	}
	/**
	 * Used to click on - roaming
	 * 
	 */
	public boolean clickOnInternationalRoamHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("InternationalRoamHam").click();
		return status;
	}
	/**
	 * Used to click on - family
	 * 
	 */
	public boolean clickOnFamilyHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("FamilyHam").click();
		return status;
	}
	/**
	 * Used to click on - frendi package
	 * 
	 */
	public boolean clickOnFRENDIHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("FreNDIhAM").click();
		return status;
	}
	/**
	 * Used to click on - help and support
	 * 
	 */
	public void clickOnHelpandSupportHam() {
		element("HelpSupportHam").click();
		
	}
	/**
	 * Used to click on - faq
	 * 
	 */
	public boolean clickOnFaqHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("FaqhAM").click();
		return status;
	}
	/**
	 * Used to click on - contact us
	 * 
	 */
	public boolean clickOnContactHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("contactUsHam").click();
		return status;
	}
	/**
	 * Used to click on - find a store
	 * 
	 */
	public boolean clickOnFindAStoreHam() {
		boolean status = true;
		{
		if(element("planham").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		element("FindaStoreHam").click();
		return status;
	}
	/**
	 * Used to click on - top up
	 * 
	 */
	public void clickOntopUpHam() {
		element("topUpHam").click();
		
	}
	/**
	 * Used to click on - join now
	 * 
	 */
	public void clickOnJoinNOwHam() {
		element("joinNowHam").click();
		
	}

	public void clickOnPlanandProdct() {
		element("joinNowHam").click();
	}
	/**
	 * Used to verify topup
	 * 
	 */
	public boolean QuickTopUpRedirected() {
		return element("TopUpVerification").isDisplayed();
	}
	/**
	 * Used to verify why virgin
	 * 
	 */
	public boolean WhyVirginRedirected() {
		return element("whyVirginVerify").isDisplayed();
	}
	/**
	 * Used to verify Plans
	 * 
	 */
	public boolean PlansRedirected() {
		return element("PlansVerify").isDisplayed();
	}
	/**
	 * Used to verify Different language
	 * 
	 */
	public boolean VerifyDifferentLanguage() {
		return element("DifferentLanguage").isDisplayed();
	}
	/**
	 * Used to verify Location tab in find a store
	 * 
	 */
	public boolean VerifyOnFindAStore() {
		return element("LocationInFindstore").isDisplayed();
	}
	/**
	 * Used to verify Options in plan and product
	 * 
	 */
	public boolean VerifyOptions() {
		if(((element("plan")).isDisplayed())&&((element("offers")).isDisplayed())&&((element("intrrates")).isDisplayed()))
			return true;
		else
			return false;
	}
	/**
	 * Used to verify Options in Help and support
	 * 
	 */
	public boolean VerifyHelpandSupportOptions() {
		if(((element("faq")).isDisplayed())&&((element("contact")).isDisplayed())&&((element("findastore")).isDisplayed()))
			return true;
		else
			return false;
	}

	public boolean VerifyWhyVirginMobilePage() {
		return element("VirginMobile").isDisplayed();
	}
	
	
}
