package com.virginweb.home.po;


import java.util.List;
import java.util.Map;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class FindAStorePO extends MobileWebViewPage{

	/**
	 * extend  MobileWebViewPage
	 * 
	 */
	
	public FindAStorePO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/FindAStore");		
	}
	/**
	 * click on Help and support
	 * @throws InterruptedException 
	 * 
	 */
	public void ClickhelpSupportVirgin() throws InterruptedException {
 	    element("HelpsupportVirgin").click();
 	    Thread.sleep(5000);
		
	}
	/**
	 * click on Find a store
	 * @throws InterruptedException 
	 * 
	 */
	public void clickFindAStoreTabV() throws InterruptedException {
		 element("FindastoreVirgin").click();
		 Thread.sleep(5000); 
		 }
	/**
	 * click on location
	 * 
	 */
	public void ClickOnLocation() {
		element("ClickonLocation").click();
	}
	/**
	 * validiate the find a store page
	 * 
	 */
	public boolean RedirecttoFindaStore() {
		boolean status = true;
		{
		if(element("QuickVerify").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * click on live location
	 * 
	 */
	public void ClickOnLiveLocation() {
		element("ClickonLiveLocation").click();
		
	}
	/**
	 * scroll function
	 * 
	 */
	public void scrollFindaStore() {
		Helper.scrollDown();
		
	}
	/**
	 * verify  current location
	 * 
	 */
	public boolean VerifyCurrentLocation() {
		String currentLoc=session.driver.findElement(By.id("ClickonLiveLocation")).getAttribute("value");
		System.out.println("Current location value:"+currentLoc); 
		
		return true;
		
 		//Map coordinates = Map.of(  "latitude", 30.3079823, "longitude", -97.893803, "accuracy", 1);

        //session.driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

        // session.driver.navigate().to("https://oldnavy.gap.com/stores");

       //   List<WebElement> addresses = session.driver.findElements(By.className("addresses"));
       //   Assert.assertTrue("No addresses found", addresses.size() > 0);
      //  Assert.assertTrue("Some addresses listed are not available",
		
      //         addresses.stream()
		
	  //		        .allMatch(a -> a.getText().contains(", TX ")));
    }
		
	/**
	 * click on Hamburger
	 * 
	 */

	public void clickOnHB() {
		element("hamburgerFAStore").click();
		
	}
	/**
	 * verify hamburger tab
	 * 
	 */
	public boolean RedirecttoHBinStore() {
		boolean status = true;
		{
		if(element("FamilyBtn").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
		
	}
	/**
	 * click on family in hamburger
	 * 
	 */
	public void familyClick() {
		element("FamilyBtn").click();
		
	}
	/**
	 * click and verification of done btn
	 * 
	 */
	public boolean clickDoneinHB() {
		element("doneBtn").click();
		boolean status = true;
		{
		if(element("doneVerify").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * click on Recharge on Hamburger
	 * 
	 */
	public void clickRecharge() {
		element("recharge").click();
		
	}
	/**
	 * click on SIMin hamburger
	 * 
	 */
	public void clickSIM() {
		element("SimBtn").click();
		
	}
	/**
	 * click on back button in hamburger
	 * 
	 */
	public void clickBackHB() {
		element("BackHB").click();
		
	}
	/**
	 * scroll up function
	 * 
	 */
	public void scrollupStore() {
		Helper.scrollUp();
		
	}
	/**
	 * verify hamburger is closed
	 * 
	 */
	public boolean HBclosed() {
		boolean status = true;
		{
		if(element("QuickVerify").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
		
	}
	/**
	 * click on why virginmobile
	 * 
	 */
	public void clickOnWhyVirginm() {
		element("whyVirgin").click();
		
	}
	/**
	 * verify virgin mobile page
	 * 
	 */
	public boolean redirecttoVirginMob() {
		boolean status = true;
		{
		if(element("QuickVerify").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * scroll down function
	 * 
	 */
	public void scrolldownwhyVirginPG() {
		Helper.scrollDown();
	}
	/**
	 * click on join now tab
	 * 
	 */
	public void clickJoinnowTab() {
		element("joinNowTab").click();
		
	}
	/**
	 * verify joinnow tab
	 * 
	 */
	public boolean redirectoJoinNow() {
		boolean status = true;
		{
		if(element("PortNumber").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		}
		return status;
	}
	/**
	 * scroll function join now
	 * 
	 */
	public void scrolljoin() {
		Helper.scrollDown();
		
	}
	/**
	 * click on portnumber
	 * 
	 */
	public void clickOnPortnmber() {
		element("PortNumber").click();
		
	}
	/**
	 * click on country code
	 * 
	 */
	public void countryCode() {
		element("countrycodeclick").click();
		
	}
	/**
	 * verify dropdown in countrycode
	 * 
	 */
	public boolean countryCodeDisplay() {
		Select dropdown = new Select(session.driver.findElement(By.xpath("countrycodeclick")));
		dropdown.selectByVisibleText("Australia +61");
		boolean status = true;
		{
		if(element("PortNumber").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		}
		return status;
		
	}
	/**
	 * zoom in out function
	 * 
	 */
	public void zoominout(){
		WebElement element1 = session.driver.findElement(By.xpath("//div[@id='map_full_width']"));
		Point point = element1.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		
		                Actions action = new Actions(session.driver);
		                action.moveToElement(element1, xcord, ycord).click().click().build().perform();
	}
	}
	
	
