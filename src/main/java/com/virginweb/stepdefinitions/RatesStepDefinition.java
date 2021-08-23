package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RatesStepDefinition extends StepDefinitionInit {
	
	 @When("^I click on plan and Product againn$")
	    public void i_click_on_plan_and_product_againn() throws Throwable {
		 Thread.sleep(3000);
	        ratesPO.planandProductClickAgain();
	    }
	 @When("^I Click on Frendi tag present in plans tab$")
	    public void i_click_on_frendi_tag_present_in_plans_tab() throws Throwable {
		 ratesPO.FrendiClickAgain();
	    }
	 @Then("^I get redirected to the Tab$")
	    public void i_get_redirected_to_the_tab() throws Throwable {
	       Assert.assertTrue(ratesPO.FrendipageRedirected());
	    }
	 @When("^I Click on rates tab within$")
	    public void i_click_on_rates_tab_within() throws Throwable {
		 Thread.sleep(3000);
		 ratesPO.RtesClickFrendiTab();
	    }
	 @When("^I scroll the required page$")
	    public void i_scroll_the_required_page() throws Throwable {
	       ratesPO.scrollRtesPage();
	    }
	 @Then("^I get see International btn is already highlighted$")
	    public void i_get_see_international_btn_is_already_highlighted() throws Throwable {
		 Assert.assertTrue(ratesPO.InternationalRtesFrendiHighlghted());
	    }
	 @When("^I Click on International button in frendi$")
	    public void i_click_on_international_button_in_frendi() throws Throwable {
		 Thread.sleep(3000);
		 ratesPO.internationalratesClickFrendi();
	    }
	 @When("^I Click on PackageBttn in Frendi Tab$")
	    public void i_click_on_packagebttn_in_frendi_tab() throws Throwable {
		 ratesPO.PackageBtnFrendi();  
	 }
	 @When("^I click on Roaming Tab in frendi tab$")
	    public void i_click_on_roaming_tab_in_frendi_tab() throws Throwable {
		 ratesPO.RoamingBtnFrendi();
	    }
	 @When("^I click on dropdown in roaming in frendi tab$")
	    public void i_click_on_dropdown_in_roaming_in_frendi_tab() throws Throwable {
		 Thread.sleep(3000);
	       ratesPO.dropdownFrendi();
	    }
	 @When("^I click on Offers tab in Frendi$")
	    public void i_click_on_offers_tab_in_frendi() throws Throwable {
		 Thread.sleep(3000);
		 ratesPO.offersFrendiClick(); 
	    }
	 @Then("^I get redirectted to Offer page in Frendi$")
	    public void i_get_redirectted_to_offer_page_in_frendi() throws Throwable {
		 Assert.assertTrue(ratesPO.offersFrendiRedirected());
	    }
	 @When("^I scroll the frendi offers page$")
	    public void i_scroll_the_frendi_offers_page() throws Throwable {
	        ratesPO.scrollFrendiOffers();
	    }
	 @When("^I click on package in offers in frendi tab$")
	    public void i_click_on_package_in_offers_in_frendi_tab() throws Throwable {
	       ratesPO.packageFrendiOffer();
	    }
	 @Then("^I validiate differnt rates and all$")
	    public void i_validiate_differnt_rates_and_all() throws Throwable {
		 Assert.assertTrue(ratesPO.validiateRates());
	    }
	 @Then("^I verify rates in package tab$")
	    public void i_verify_rates_in_package_tab() throws Throwable {
		 Assert.assertTrue(ratesPO.verifyRatesinPackage());
	    }
	 @Then("^I verify that the file opened $")
	    public void i_verify_that_the_file_opened() throws Throwable {
		 Assert.assertTrue(ratesPO.verifyPackageFile());
	    }
	    

}