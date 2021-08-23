package com.virginweb.stepdefinitions;

import java.util.concurrent.TimeUnit;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert; 

public class PracticeCasesStepDefinition  extends StepDefinitionInit{
	
	@And("^Enter the valid Credentials and proceed$")
    public void enterTheValidCredentialsAndProceed() throws Throwable {
		
	}
	
	@Then("^Verify the page with \"([^\"]*)\"$")
    public void verifyThePageWithSomething(String strArg1) throws Throwable {
		Assert.assertTrue(practicePO.titleOFThePage(strArg1));
	}
	@And("^Click on Join Now$")
    public void clickOnJoinNow() throws Throwable {
		practicePO.clickOnJoinNow();
	}

	@And("^Scroll down and up$")
    public void scrollDownAndUp() throws Throwable {
		 practicePO.scrollUntilLastNumber();
	 }
	@Then("^Verifying the scrolling$")
    public void verifyingTheScrolling() throws Throwable {
		Assert.assertTrue(practicePO.checkforScrolling());	
	}
	@And("^Click on search tab of numbers with \"([^\"]*)\"$")
    public void clickOnSearchTabOfNumbersWithSomething(String strArg1) throws Throwable {
		practicePO.clickOnSearch(strArg1);
	}
	 @Then("^Verify the click on search tab for num \"([^\"]*)\"$")
	    public void verifyTheClickOnSearchTabForNumSomething(String strArg1) throws Throwable {
		Assert.assertTrue(practicePO.verifyTheClick(strArg1));
	}
	 
	 @Then("^Verify the invalid search$")
	    public void verifyTheInvalidSearch() throws Throwable {
		 Assert.assertTrue(practicePO.checkTheInvalidPage());
	 }
	 @And("^Click on any number below the search tab$")
	    public void clickOnAnyNumberBelowTheSearchTab() throws Throwable {
		 practicePO.clickOnAnyNumberInList();
	 }
	 @Then("^Verify the click on number$")
	    public void verifyTheClickOnNumber() throws Throwable {
		 Assert.assertTrue(practicePO.checkForNumber());
	 }
	 @Then("^Verify the popup box of the clicked number$")
	    public void verifyThePopupBoxOfTheClickedNumber() throws Throwable {
		 Assert.assertTrue(practicePO.checkForPOPUP());
	 }
}
