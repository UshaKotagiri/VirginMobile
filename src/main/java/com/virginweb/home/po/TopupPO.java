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


 

public class TopupPO extends MobileWebViewPage{

	public TopupPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/TopUp");		
	}

	/**
	 * Used to click on Quick topUp
	 * 
	 */
	public void clickonQuickTopUp() {
		element("quicktopup").click();
	}
	/**
	 * Used to click on English Language tab
	 * @return 
	 * 
	 */
	public boolean changeLanguage() throws Throwable   {
		boolean value = false;
		element("burger").click();
		Thread.sleep(1000);
		element("english").click();
		Thread.sleep(2000);
		if(element("number").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
}
	
	/**
	 * Used to click on close botton
	 * @return 
	 * 
	 */

	public boolean clickOnClose() {
		boolean value = false;
		element("close").click();
		if(element("number").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
		
	}
	/**
	 * Used to click on number to enter a valid number
	 * @return 
	 * 
	 */
	public boolean clickOnNumber() {
		boolean value = false;
		element("number").click();
		if(element("number").isDisplayed()){
			  value = true;
			}
			else
			   value = false;
			
			return value;
	}
	/**
	 * Used to enter a number
	 * 
	 */
	public void enterNumber() {
		element("number").sendKeys("237423923902");
	}
	/**
	 * Used to verify error message 
	 * 
	 */
	public boolean verifyErrorMessage() {
		boolean status = true;
		{
		if(element("error").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * Used to enter a correct number
	 * 
	 */
	public void  enterCorrectNumber() {
		element("number").sendKeys("0573891465");
		
	}
	/**
	 * Used to verify payment button is enabled or not
	 * 
	 */
    public boolean paymentGatewayclick() {
		boolean value=true;

		 if(element("paymentbutton").isEnabled())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;	
	}
    /**
	 * Used to verify no error message
	 * 
	 */

	public boolean noerrormessage() {
		boolean status = true;
		{
		if(element("error").isDisplayed()){
		  status = false;
		}
		else
			status = true;
		}
		return status;
	}
	/**
	 * Used to click on dropdown 
	 * 
	 */
	public void clickOnDropdown() {
		element("dropdown").click();
	}
	/**
	 * Used to select dropdown values
	 * @return 
	 * 
	 * 
	 */
	public boolean dropdownSelect() {
		boolean status = true;
		Select dropdown = new Select(session.driver.findElement(By.xpath("//select[@name='amount']")));
		dropdown.selectByVisibleText("50 SAR");	
		if(element("paymentbutton").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to click on payment button
	 * 
	 */
	public  void clickonPaymentButton() {
		element("paymentbutton").click();
	    element("paymentbutton").click();
	}
	/**
	 * Used to enter card details
	 * 
	 */
	public void incorrectCardDetails() {
		element("Cardnumber").sendKeys("478287967868478545");
		element("expiry").sendKeys("12/22");
		element("cvv").sendKeys("321");
		element("cardname").sendKeys("123jsh");
	}
	/**
	 * Used to validate incorrect card details
	 * 
	 */
	public boolean buttonNotEnabled() {
		boolean value = false;
		if(element("paymentbutton2").isEnabled())
		   {
				 value=false;
			 }else
			 {
				 value=true;
			 }
				return value;	
		
	}	
	/**
	 * Used to validate correct card details
	 * 
	 */
public void correctCardDetails() {
	element("Cardnumber").sendKeys("4111 1111 1111 1111");
	element("expiry").sendKeys("03/30");
	element("cvv").sendKeys("737");
	element("cardname").sendKeys("test");
	
}
/**
 * Used to validate payment button enabled
 * 
 */

public boolean submitButtonEnabled() {
	Boolean value = true;
	if(element("paymentbutton2").isEnabled())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
}
/**
 * Used to click on payment button
 * 
 */
public void clickonPaymentButton2() {
	
	 element("paymentbutton2").click();
}
/**
 * Used to validate ACS submit button enabled or not
 * @throws InterruptedException 
 * 
 */

public boolean acsSubmitButtion() throws InterruptedException {
	Thread.sleep(30000);
	WebDriverWait wait = new WebDriverWait(session.driver, 30);
	WebElement status = wait.until(
    ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Submit']")));
	return status.isEnabled();
}
/**
 * Used to click on ACS submit
 * 
 */
public void clickonacssubmit() {
	element("acssubmitbutton").click();
	
}
/**
 * Used to validate Home is enabled or not
 * 
 */

public boolean Homeenabled() {
	
	Boolean value = true;
	if(element("homebutton").isEnabled())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
}
/**
 * Used to click on home button
 * 
 */
public void clickhomeButton() {
	element("homebutton").click();
	
}
/**
 * Used to change language to english
 * 
 */
public void changeToEnglish() {

	element("englishLang").click();
}
/**
 * Used to click on hamburger
 * 
 */
public void hamburgerClick() {
	
	element("burger").click();
}
/**
 * Used to click on home
 * @throws InterruptedException 
 * 
 */
public void clickonHome() throws InterruptedException {
	Thread.sleep(2000);
	
	element("home").click();
}
/**
 * Used to validate redirected to quick top up page or not
 * 
 */
public boolean homepageRedirected() {
	boolean status = true;
	{
	if(element("quicktopup1").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to navigate back
 * 
 */
public void clickBack() {
	session.driver.navigate().back();
}
/**
 * Used to click on hamburger plan and product
 * @throws InterruptedException 
 * 
 */
public void PlanandproductsInHamburger() throws InterruptedException {
	Thread.sleep(2000);
	element("hamPlanandProd").click();
	
}
/**
 * Used to validate other options of plan and product displayed or not
 * 
 */
public boolean otherOptionsDisplayed() {
	boolean status = true;
	{
	if(element("otheroptionplan").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to disable the plan and product drop
 * 
 */

public boolean planandproductDisable() {
	boolean status = true;
	{
	if(element("otheroptionplan").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to click plan and product
 * 
 */
public void PlanandproductsInHamburger1() {
	
	element("hamPlanandProd").click();
}
/**
 * Used to click on plan in hamburger
 * @throws InterruptedException 
 * 
 */

public void PlanInHamburger1() throws InterruptedException {
	Thread.sleep(2000);
	element("otheroptionplan").click();
	
}
/**
 * Used to validate redirected to plan page or not
 * 
 */
public boolean redirectToPlan() {
	
	boolean status = true;
	{
	if(element("createplan").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to validate that its is back to top up page or not
 * 
 */

public boolean backtotopUp() {
	boolean status = true;
	{
	if(element("number").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to click on other offers in hamburger
 * @throws InterruptedException 
 * 
 */
public void ClickOtherOptionsInHam() throws InterruptedException {
	Thread.sleep(2000);
	element("hamOtheroptions").click();
	
}
/**
 * Used to validate offers page
 * 
 */
public boolean redirecttoOtherOffers() {
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
 * Used to click International rates
 * @throws InterruptedException 
 * 
 */
public void InternationalratesInHamburger1() throws InterruptedException {
	Thread.sleep(2000);
	element("hamintrrates").click();
	
}
/**
 * Used to validate International rates
 * 
 */
public boolean redirecttoInternationalRates() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to click International roaming
 * @throws InterruptedException 
 * 
 */

public void InternationalroamInHamburger1() throws InterruptedException {
	Thread.sleep(2000);
	element("hamintrroam").click();
}
/**
 * Used to validate international roaming page
 * 
 */
public boolean redirecttointernationalRoam() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to click family Tag
 * @throws InterruptedException 
 * 
 */
public void FamilytagHam() throws InterruptedException {
	Thread.sleep(2000);
	element("familytagham").click();
}
/**
 * Used to validate family tag page
 * 
 */
public boolean redirecttoFamily() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to click Frendi tag
 * @throws InterruptedException 
 * 
 */
public void frendiHam() throws InterruptedException {
	Thread.sleep(2000);
	element("frendiham").click();
	
}
/**
 * Used to validate frendi tag page
 * 
 */
public boolean redirectoFrendi() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to click Why virgin mobile in Hamburger
 * @throws InterruptedException 
 * 
 */
public void whyvirginmobHam() throws InterruptedException {
	Thread.sleep(2000);
	element("virginmobham").click();
}
/**
 * Used to validate Why Virgin mobile page
 * 
 */
public boolean redirecttoWhyVirginMob() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
}
/**
 * Used to click on Help in hamburger
 * 
 */
public void clickOnHelpHam() {
	element("helpHam").click();
	
}
/**
 * Used to click on FAQ
 * @throws InterruptedException 
 * 
 */

public void clickonFAQham() throws InterruptedException {
	Thread.sleep(2000);
	element("faqham").click();
}
/**
 * Used to validate Redirect to FAQ
 * 
 */
public boolean redirectedtofaq() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to click on Contact us
 * @throws InterruptedException 
 * 
 */
public void clickonContactusham() throws InterruptedException {
	Thread.sleep(2000);
	element("contactham").click();
}
/**
 * Used to redirect to contactus
 * 
 */
public boolean redirecttoContact() {
	boolean status = true;
	{
	if(element("quickTopUp2").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to click on Find a Store
 * @throws InterruptedException 
 * 
 */

public void clickOnFindStore() throws InterruptedException {
	Thread.sleep(2000);
	
	element("findstoreham").click();
}
/**
 * Used to redirect to Find a store page
 * 
 */
public boolean redirectToFindstore() {
	boolean status = true;
	if(element("quickTopUp2").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
}

public boolean validiatedropdownText() {
	String text = element("dropdown").getText();
	if(text.equals("amount"))
			return true;
	else 
		return false;

	}
/**
 * Used to click on Not Right number link
 * 
 */
public void clickonNotRightNumber() {
	element("notRightNumber").click();
	
}
/**
 * Used to enter a number which is valid  but not in use
 * 
 */
public void enterNmberNotInUse() {
	
	element("number").sendKeys("573892054");
}
/**
 * Used to check Payment button enabled or not
 * 
 */
public boolean buttonnotclickable() {
	boolean value=false;

	 if(element("paymentbutton").isEnabled())
  {
		 value=false;
	 }else
	 {
		 value=true;
	 }
		return value;	
}
/**
 * Used to click hamburger help
 * 
 */
public void HelpHamburgerClick() {
	element("HelpHambrgerSupport").click();
	
}
/**
 * Used to click hamburger 
 * 
 */
public void HamburgerClick() {
	element("HambrgerMob").click();
	
}
/**
 * Used to clickTopUp
 * 
 */
public void topUpMobClick() throws InterruptedException {
	element("TopUpMob").click();
	Thread.sleep(3000);
	
}
/**
 * Used to scroll down
 * 
 */
public void scrollMobClick() throws InterruptedException {
	Helper.scrollDown();
	Thread.sleep(2000);
}
/**
 * Used to click on number tab and validiate
 * 
 */
public boolean ClickonNumberMob() {
	element("NumberHam").click();
	boolean status = true;
	{
	if(element("NumberHam").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	}
	return status;
	
}
/**
 * Used to Entere nmber
 * 
 */
public void EnterNumberMob() {
	element("NumberHam").sendKeys("573891465");
	
}
/**
 * Used to click on dropdown
 * 
 */
public void ClickDropdownMob() {
	element("DropDownMob").click();
	
}
/**
 * Used to select dropdown
 * 
 */
public boolean SelectDropDownMob() {
	boolean status = true;
	Select dropdown = new Select(element("DropDownMob"));
	dropdown.selectByVisibleText("50 SAR");	
	if(element("paymentbuttonMob").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to validiate Submit and enter dropdown value
 * 
 */
public boolean validiatesubmitMob() {
	boolean status = true;
	Select dropdown = new Select(element("DropDownMob"));
	dropdown.selectByVisibleText("50 SAR");	
	if(element("paymentbuttonMob").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to click submit btn
 * 
 */
public void ClickMobSubmit() {
	element("paymentbuttonMob").click();
}
/**
 * Used to enter card details
 * 
 */
public void ClickEnterMobDetails() {
	element("Cardnumber").sendKeys("4111 1111 1111 1111");
	element("expiry").sendKeys("05/21");
	element("cvv").sendKeys("123");
	element("cardname").sendKeys("test");
	
}
/**
 * Used to submit
 * 
 */
public void SubmitFinalmob() {
	element("SubmitafterCrdDetail").click();
	
}
/**
 * Used to click acs btn
 * 
 */
public void SubmitACSMob() {
	element("SubmitACSMob").click();
	
}
/**
 * Used to validiate Home Btn
 * 
 */
public boolean validiateHomeMob() {
	
	boolean status = true;	
	if(element("HomeMob").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to click home btn
 * 
 */
public void HomeClickMOb() {
	element("HomeMob").click();
}
/**
 * Used to change language
 * 
 */
public void LanguageChangeMob() throws InterruptedException {
	element("CloseMob").click();
	Thread.sleep(2000);
	element("EnglishMob").click();
	element("CloseMob").click();
	
}
/**
 * Used to Options in a Hamburger
 * 
 */
public boolean validiateOptions() {
	boolean status = true;	
	if(element("OptionsInHam").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to language in a Hamburger
 * 
 */
public boolean changeLnguageham() {
	boolean status = true;	
	if(element("LnguageInHam").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to verify code in a Hamburger
 * 
 */
public boolean codeVerification() {
	boolean status = true;	
	if(element("codeQuickTopUp").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
	
}
/**
 * Used to verify msidn field
 * 
 */
public boolean MSIDNdisplayed() {
	boolean status = true;	
	if(element("MSIDNField").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
}
/**
 * Used to verify payment screen
 * 
 */
public boolean PaymentscreenVerify() {
	return element("Cardnumber").isDisplayed();
}
/**
 * Used to verify screen where homebutton is present
 * 
 */
public boolean VerifyHomeBtnPage() {
	return element("homebutton").isDisplayed();
}

/**
 * Used to verify success msg
 * 
 */
public boolean verifySuccessmsg() {
	return element("successMsg").isDisplayed();
}
/**
 * Used to verify Help and support click
 * 
 */
public boolean verifyHelpandSupportClick() {
	return element("faqham").isDisplayed();
}
/**
 * Used to verify ACS Emulator page
 * 
 */
public boolean VerifyACSEmulatorPage() {
	return element("acssubmitbutton").isDisplayed();
}


}




	

	

	


	

	


	

 





    


	 
	
	
	


	    
	
