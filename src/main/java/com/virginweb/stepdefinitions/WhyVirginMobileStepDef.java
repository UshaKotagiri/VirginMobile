package com.virginweb.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WhyVirginMobileStepDef extends StepDefinitionInit{
	
	@And("^Click On Why Virgin Mobile Tab$")
    public void clickOnWhyVirginMobileTab() throws Throwable {
		whyVirginPO.clickOnWhyVirgin();
	}
	
	@Then("^Scroll down verify and scroll up verify$")
    public void scrollDownVerifyAndScrollUpVerify() throws Throwable {
		Assert.assertTrue(whyVirginPO.scrollDownVerify());
		Assert.assertTrue(whyVirginPO.scrollUPVerify());
		
	}
	
	 @And("^Navigate back$")
	    public void navigateBack() throws Throwable {
		 whyVirginPO.navigateBack();
	 }
	 
	 @Then("^Verify the \"([^\"]*)\" on the banner$")
	    public void verifyTheSomethingOnTheBanner(String strArg1) throws Throwable {
		 Assert.assertTrue(whyVirginPO.checkForBanner(strArg1));
	 }
	 
	 @Then("^Verify the Virgin logo on the top left corner$")
	    public void verifyTheVirginLogoOnTheTopLeftCorner() throws Throwable {
		 Assert.assertTrue(whyVirginPO.scrollUPVerify());
	 }
	 
	 @Then("^Verify \"([^\"]*)\" displayed$")
	    public void verifySomethingDisplayed(String strArg1) throws Throwable {
		 Assert.assertTrue(whyVirginPO.checkForDownload(strArg1));
	 }
	 @And("^Click on \"([^\"]*)\"$")
	    public void clickOnSomething(String strArg1) throws Throwable {
		 whyVirginPO.clickOnQuarter(strArg1);
	 }
	 
	 @Then("^Verify the page navigation to jpg image$")
	    public void verifyThePageNavigationToJpgImage() throws Throwable {
		 whyVirginPO.checkJPGPage();
	 }

}
