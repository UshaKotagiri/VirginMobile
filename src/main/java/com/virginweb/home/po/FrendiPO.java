package com.virginweb.home.po;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

import cucumber.api.java.en.And;


 

public class FrendiPO extends MobileWebViewPage{

	public FrendiPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/Frendi");		
	}
	/**
	 * Used to click on - Plan And Product
	 * 
	 */
	public void clickonpandproductAgain() {
		element("Pandpts").click();
		
	}
	/**
	 * Used to click on - frendi
	 * 
	 */
	public void clickonfrendiAgain() {
		element("frendiagain").click();
		
	}
	/**
	 * Used to scroll down
	 * 
	 */
	public void scrollFrendi() {
		Helper.scrollDown();
		
	}

	public void clickDataBtn() {
		element("dataBtn").click();
		
	}
	/**
	 * Used to redirect to data page
	 * 
	 */
	public boolean redirectedtoDtaPage() {
		Boolean value = true;
		if(element("dataBtn").isEnabled())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to click on - package button
	 * 
	 */
	public void clickPacakageBtn() {
		element("packagebtn").click();
		
	}
	/**
	 * Used to click on - back on frendi page
	 * 
	 */
	public void ClickonBackOnFrendi() {
		session.driver.navigate().back();
		
	}
	/**
	 * Used to verify that prepaid is highlighted or not
	 * 
	 */
	public boolean packagehighlighted() {
		Boolean value = true;
		if(element("packagebtn").isEnabled())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to click on - frendi tab link
	 * 
	 */
	public void FrenditabClick() {
		element("frendiagain").click();
		
	}
	/**
	 * Used to click on - call button on frendi tab
	 * 
	 */
	public void clickOnCallFrendi() {
		
		element("frendiCall").click();
	}
	/**
	 * Used to redirect to page
	 * 
	 */
	public boolean redirectToRequiredPage() {
		Boolean value = true;
		if(element("QuickCheck").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
		
	}
	/**
	 * Used to verify data bundles
	 * 
	 */
	public boolean VerifyDatabundles() {
		Boolean value = true;
		if(element("DataBundles").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used toverify data
	 * 
	 */
	public boolean VerifyData() {
		Boolean value = true;
		if(element("DataVerify").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify data for sar
	 * 
	 */
	public boolean VerifyDataforSAR() {
		Boolean value = true;
		if(element("DataVerify").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify local data
	 * 
	 */
	public boolean VerifyDatalocalCalls() {
		Boolean value = true;
		if(element("LocalData").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify halala
	 * 
	 */
	public boolean VerifyHalala() {
		Boolean value = true;
		if(element("halalaData").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify nmber
	 * 
	 */
	public boolean VerifyFrendiMobNumber() {
		Boolean value = true;
		if(element("OtherNetworks").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify other mobile network
	 * 
	 */
	public boolean VerifyOtherMobileNet() {
		Boolean value = true;
		if(element("OtherNetworks").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify sms table
	 * 
	 */
	public boolean VerifysmsTable() {
		Boolean value = true;
		if(element("SmsData").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify one net minute
	 * 
	 */
	public boolean VerifyOnNetMinutes() {
		Boolean value = true;
		if(element("OnNetMinutes").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify vat text
	 * 
	 */
	public boolean VerifyVATText() {
		Boolean value = true;
		if(element("vatText").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify vat text
	 * 
	 */
	public boolean VerifyCallTab() {
		Boolean value = true;
		if(element("vatText").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify sar 15
	 * 
	 */
	public boolean Verify1SAR() {
		Boolean value = true;
		if(element("Fees1").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify sar 7
	 * 
	 */
	public boolean Verify7SAR() {
		Boolean value = true;
		if(element("Fees1").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify sar 25
	 * 
	 */
	public boolean Verify25SAR() {
		Boolean value = true;
		if(element("Fees2").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify idd bundles
	 * 
	 */
	public boolean VerifyIDDBundles() {
		Boolean value = true;
		if(element("IDDBundles").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify fees 
	 * 
	 */
	public boolean Verifyfees() {
		Boolean value = true;
		if(element("Fees2").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify bangla plan
	 * 
	 */
	public boolean VerifyBanglaPlan() {
		Boolean value = true;
		if(element("Bangladesh").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify india plan
	 * 
	 */
	public boolean VerifyindiaPlan() {
		Boolean value = true;
		if(element("India").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify pakistan plan
	 * 
	 */
	public boolean VerifyPkistanPlan() {
		Boolean value = true;
		if(element("Pakistan").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify phillipines rate
	 * 
	 */
	public boolean VerifyPhillipinesplan() {
		Boolean value = true;
		if(element("Phillipines").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify syria plan
	 * 
	 */
	public boolean VerifySyriaplan() {
		Boolean value = true;
		if(element("Syria").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify egypt plan
	 * 
	 */
	public boolean VerifyEgyptplan() {
		Boolean value = true;
		if(element("Egypt").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify Nepal plan
	 * 
	 */
	public boolean VerifyNepalplan() {
		Boolean value = true;
		if(element("Nepal").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify vat text
	 * 
	 */
	public boolean VerifyVATtext() {
		Boolean value = true;
		if(element("VatText").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify international call
	 * 
	 */
	public boolean VerifyInternationalCall1() {
		Boolean value = true;
		if(element("InternationalCall").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}/**
	 * Used to verify text
	 * 
	 */
	public boolean VerifyInternationalTxt() {
		Boolean value = true;
		if(element("IntRate1").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify pay
	 * 
	 */
	public boolean VerifyInternationalPay() {
		Boolean value = true;
		if(element("IntRate2").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify drop down
	 * 
	 */
	public boolean VerifydropDown() {
		Boolean value = true;
		if(element("dropDown").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}/**
	 * Used to verify rater
	 * 
	 */
	public boolean VerifyInternationalCallYemen() {
		Boolean value = true;
		if(element("IntRate3").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify rate
	 * 
	 */
	public boolean VerifyInternationalCallPakistan() {
		Boolean value = true;
		if(element("IntRate4").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify offer tab
	 * 
	 */
	public boolean clickOfferTab() {
		element("OfferTab").click();
		
				return true;
	}
	/**
	 * Used to verify bundhela plan
	 * 
	 */
	public boolean VerifyBundelhaPlan() {
		Boolean value = true;
		if(element("BundelhaPlan").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 19 sar
	 * 
	 */
	public boolean Verify19sar() {
		Boolean value = true;
		if(element("sar19").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 45 sar
	 * 
	 */
	public boolean Verify45Sar() {
		Boolean value = true;
		if(element("sar45").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 70 sar
	 * 
	 */
	public boolean Verify70sar() {
		Boolean value = true;
		if(element("sar70").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 110 sar
	 * 
	 */
	public boolean Verify110sar() {
		Boolean value = true;
		if(element("sar110").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify bonus plan
	 * 
	 */
	public boolean VerifyBonus() {
		Boolean value = true;
		if(element("Bonus").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 10 sar
	 * 
	 */
	public boolean Verify10Sar() {
		Boolean value = true;
		if(element("sar10").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 15 sar
	 * 
	 */
	public boolean Verify15sar() {
		Boolean value = true;
		if(element("sar15").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 100 sar
	 * 
	 */
	public boolean Verify100sar() {
		Boolean value = true;
		if(element("sar100").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}/**
	 * Used to verify 10 sar
	 * 
	 */
	public boolean Verify30sar() {
		Boolean value = true;
		if(element("sar30").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify 20 sar
	 * 
	 */
	public boolean Verify20sar() {
		Boolean value = true;
		if(element("sar20").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * verify Package page
	 * 
	 */
	public boolean VerifyRedirectedToPackagepage() {
		Boolean value = true;
		if(element("TextInPackage").isDisplayed())
		   {
				 value=true;
			 }else
			 {
				 value=false;
			 }
				return value;
	}
	/**
	 * Used to verify Table content
	 * 
	 */
	public boolean VerifyTableContent() {
		return (element("Denomination").isDisplayed()&&element("nationalCall").isDisplayed()&&element("sms").isDisplayed()&&element("Landline").isDisplayed());
	}
	/**
	 * Used to verify Bonus text
	 * 
	 */
	public boolean VerifyBonusText() {
		return element("BonusText").isDisplayed();
	}
	/**
	 * Used to verify offer screen
	 * 
	 */
	public boolean VerifyOfferScreen() {
		return element("Offerscreen").isDisplayed();
	}
	/**
	 * Used to verify nomatter text
	 * 
	 */
	public boolean VerifyNoMatterText() {
		return element("NomatterText").isDisplayed();
	}
	/**
	 * Used to verify Hello text
	 * 
	 */
	public boolean VerifyHelloText() {
		return element("HelloText").isDisplayed();
	}
	/**
	 * Used to verify Dial vat text
	 * 
	 */
	public boolean VerifyDialVatText() {
		return element("DialVatText").isDisplayed();
	}
	/**
	 * Used to click on hot offers
	 * 
	 */
	public void clickOnHotOffers() {
		element("HotOffers").click();
		
	}
	/**
	 * Used to verify Hot Offers page
	 * 
	 */
	public boolean HotOffersPage() {
		return element("HotOfferpage").isDisplayed();
	}
	
	
	
	
	}
	
