package com.virginweb.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LanguageStepDefinition extends StepDefinitionInit {

	
	 @When("^I click on Arabic language tab$")
	    public void i_click_on_arabic_language_tab() throws Throwable {
	       languagePO.ClickOnArabic();
	    }

	    @When("^I click on English language tab$")
	    public void i_click_on_english_language_tab() throws Throwable {
	    	languagePO.ClickOnEnglish();
	    }

	    @Then("^The language changes to arabic$")
	    public void the_language_changes_to_arabic() throws Throwable {
	    	Assert.assertTrue(languagePO.VerifyArabic());
	    }

	    @Then("^The language changes to English$")
	    public void the_language_changes_to_english() throws Throwable {
	    	Assert.assertTrue(languagePO.VerifyEnglish());	
	    }
}