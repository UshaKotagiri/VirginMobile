package com.virginweb.stepdefinitions;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FAQUshaStepDef extends StepDefinitionInit{
	
	
	@And("^Hoover on Help n support$")
    public void hooverOnHelpNSupport() throws Throwable {
		faqUshaPO.hooverOnHelpNSupport();
	}
	
	@Then("^Verify the hoover on Help n support$")
    public void verifyTheHooverOnHelpNSupport() throws Throwable {
		Assert.assertTrue(faqUshaPO.verifyThehoover());
		
	}
	
	@Then("^Verify if the header is displayed$")
    public void verifyIfTheHeaderIsDisplayed() throws Throwable {
		Assert.assertTrue(faqUshaPO.verifyTheHeader());
	}
	
	@Then("^Verify if the banner is diplayed$")
    public void verifyIfTheBannerIsDiplayed() throws Throwable {
		Assert.assertTrue(faqUshaPO.verifyForBannerHeadings());
	}

	@Then("^Verify if the breadcrumbs are displayed$")
    public void verifyIfTheBreadcrumbsAreDisplayed() throws Throwable {
		Assert.assertTrue(faqUshaPO.verifyBreadcrumbs());
	}
	
	@Then("^Verify if the breadcrumbs is changing according to the selected pages$")
    public void verifyIfTheBreadcrumbsIsChangingAccordingToTheSelectedPages() throws Throwable {
		Assert.assertTrue(faqUshaPO.checkForChangingBreadcrumb());
		
	}
	
	 @Then("^Verify for the Search for more button$")
	    public void verifyForTheSearchForMoreButton() throws Throwable {
		 Assert.assertTrue(faqUshaPO.verifySearchForMore());
	 }
	 
	 @And("^Click on Search for more button$")
	    public void clickOnSearchForMoreButton() throws Throwable {
		 faqUshaPO.clickSearchForMore();
	 }
	 
	 @Given("^Verify for the character limit$")
	    public void verifyForTheCharacterLimit() throws Throwable {
		 Assert.assertTrue(faqUshaPO.verifyForCharacterLimit());
	 }
}
