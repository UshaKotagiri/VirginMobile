package com.virginweb.home.po;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;


public class FaqContactUsPO extends MobileWebViewPage{

	/**
	 * extend  WebViewPage
	 * 
	 */
	
	public FaqContactUsPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/FaqContactUs");		
	}
	/**
	 * Click Help and support
	 * 
	 */
	public void HelpandsupportClick() {
		element("helpAndSupportClick").click();
		
	}
	/**
	 * click FAQ in help and support
	 * 
	 */
	public void Faqclickhelp() {
		element("FaqHelpClick").click();
		
	}
	
	/**
	 * Redirect to FAQ page
	 * 
	 */
	public boolean redirectFAQpage() {
		boolean value=true;

		 if(element("SearchButton").isEnabled())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
	}
	/**
	 * Scroll FAQ page
	 * 
	 */
	public void scrollfaqpage() {
		Helper.scrollDown();
		
	}
	/**
	 * click on Search button in FAQ
	 * 
	 */
	public void clickOnSearchBtn()  {
		element("SearchBttnvalue").click();
		
	}

	/**
	 * click and enter invalid search in search suggestion box
	 * 
	 */
	public void EnterinvalidInSearch() throws InterruptedException {
		
		element("SearchBttnvalue").sendKeys("abc");
		Thread.sleep(2000);
		element("SearchButton").click();
	}
	/**
	 * sorry message once you enter invalid text in search box
	 * 
	 */

	public boolean NoOptionPage() {
		boolean value=true;

		 if(element("talkToUs").isEnabled())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
	}
	/**
	 * Enter valid text
	 * 
	 */
	public void EntervalidInSearch() throws InterruptedException {
		element("SearchBttnvalue").sendKeys("family");
		Thread.sleep(2000);
		element("SearchButton").click();
	}
	/**
	 * click on contact  us button
	 * 
	 */
	public void contactTabClick() {
		element("ContactBttnclick").click();
		
	}
	/**
	 * Redirect to contact us page
	 * 
	 */
	public boolean redirectTocontactUspg() {
		boolean value=true;

		 if(element("topUpQuick1").isDisplayed())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
	}
	/**
	 * click on submit
	 * 
	 */
	public void clickOnSubmitContactUs() {
		
		element("SubmitBttnclick").click();
		
	}
	/**
	 * Redirect to error message
	 * 
	 */
	public boolean redirectToErrormsg() {
		boolean value=true;

		 if(element("NameErrorMsg").isDisplayed())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
	}	
	/**
	 * enter required details
	 * 
	 */
	public void EnterRequiredDetails()  {
		Select dropdown = new Select(session.driver.findElement(By.xpath("//select[@id='c_account_type']")));
		dropdown.selectByVisibleText("Virgin mobile customer");
		
		//Thread.sleep(6000);
	//	element("SubmitBttnclick").click();
	}
	/**
	 * enter required details
	 * 
	 */
	public void moreDetails() {
		element("nameBttnclick").sendKeys("abc");
		element("EmailBttnclick").sendKeys("xyz@gmail.com");
		element("MobileBttnclick").sendKeys("9999333322");
		element("subjectBttnclick").sendKeys("Xyz");
		element("MessageBttnclick").sendKeys("abc");
		element("SubmitBttnclick").click();
	}
	/**
	 * click and verify chatbox
	 * @throws InterruptedException 
	 * 
	 */
	public boolean chatbox() throws InterruptedException {
		//element("chatbox").click();
		//element("chatbox").click();
		Actions actions = new Actions(session.driver);
		WebElement elementLocator = session.driver.findElement(By.xpath("//a[@class='chat_icon']"));
		actions.doubleClick(elementLocator).doubleClick(elementLocator).perform();
		Thread.sleep(3000);
		boolean value=true;

		 if(element("nameBttnclick").isDisplayed())
	   {
			 value=true;
		 }else
		 {
			 value=false;
		 }
			return value;
		
	}
	/**
	 * chatbox minimised
	 * 
	 */
	public void chatboxMinimised() {
		Clickon(session.driver, session.driver.findElement(By.xpath("//button[@class='cx-icon cx-button-minimize']//*[local-name()='svg']")), 30);
		element("minimisedagain").click();
		element("minimised").click();		
	}
	/**
	 * chatbox opens after minimised 
	 * 
	 */
	public void chatboxMinimisedagain() {
		Clickon(session.driver, session.driver.findElement(By.xpath("//button[@class='cx-icon cx-button-minimize']")), 30);
		element("minimisedagain").click();
		
	}
	/**
	 * chatbox closing function
	 * 
	 */
	public void clickChatboxClose() throws InterruptedException {
		Clickon(session.driver, session.driver.findElement(By.xpath("//*[name()='path' and contains(@class,'cx-svg-ico')]")), 20);
		element("closeChatBox").click();
		Thread.sleep(2000);
		element("cancelInClose").click();
		
	}
	/**
	 * Explicit wait function
	 * 
	 */
	public static void Clickon(WebDriver driver,WebElement locator,int timeout)	{
	 	   new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions
	 			   .elementToBeClickable(locator));
	 	   locator.click();
	    }
	
	/**
	 * verify entered text
	 * @throws InterruptedException 
	 * 
	 */
	public boolean VerifyEnteredText() throws InterruptedException {
		Thread.sleep(3000);
		String Text = element("SearchBttnvalue").getText();
		return element("SearchBttnvalue").equals(Text);
	}
	/**
	 * verify after submit button is clicked
	 * 
	 */
	public boolean VerifyAfterSubmitClick() {
		return element("SuccessfulClick").isDisplayed();
	}
	/**
	 * verify Details of Entered Data
	 * 
	 */
	public boolean VerifyDetailsofContactPage() {
		String email = element("EmailBttnclick").getText();
		String name = element("nameBttnclick").getText();
		String Mobile = element("MobileBttnclick").getText();
		String Subject = element("subjectBttnclick").getText();
		
		if (email.equals("xyz@gmail.com"))
		 return true;
		else if (name.equals("abc"))
			return true;
		else if (Mobile.equals("9999333322"))
			return true;
		else if (Subject.equals("Xyz"))
			return true;
		else
			return false;
		
	}
	/**
	 * verify search button
	 * 
	 */
	public boolean verifySearchfield() {
		return element("SearchBttnvalue").isDisplayed();
	}
	/**
	 * verify minimise btn
	 * @throws InterruptedException 
	 * 
	 */
	public boolean verifyMinimiseBtn() throws InterruptedException {
		Thread.sleep(2000);
		return element("minimised").isDisplayed();
	}
	/**
	 * verify minimised closed
	 * @throws InterruptedException 
	 * 
	 */
	public boolean verifyChatboxClosed() throws InterruptedException {
		Thread.sleep(2000);
		return element("minimised").isDisplayed();
	}
	/**
	 * When I enter invalid text
	 * 
	 */
	
	public boolean verifyInvalidText() {
		return element("InvalidText").isDisplayed();
	}
	/**
	 * When I verify searched page
	 * 
	 */
	public boolean VerifySearchedPage() {
		return element("searchedPage").isDisplayed();
	}
	
	}
	
	
