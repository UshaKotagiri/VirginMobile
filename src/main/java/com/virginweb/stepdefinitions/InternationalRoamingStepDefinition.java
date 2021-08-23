package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Navigation;

import com.virginweb.helper.Helper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class InternationalRoamingStepDefinition extends StepDefinitionInit {
	
	@When("^I click on plansandproducts bttn$")
    public void i_click_on_plansandproducts_bttn() throws Throwable {
		waitForPageLoaded();
		Thread.sleep(5000);
        internationalroamPO.clickonPlansandProduct1a();
    }
	@When("^I click on planandproduct12 button$")
    public void i_click_on_planandproduct12_button() throws Throwable {
		//waitForPageLoaded();
		Thread.sleep(6000);
		internationalroamPO.clickplanproduct12();
    }
	@When("^I click on International1 Roaming bttn$")
    public void i_click_on_international1_roaming_bttn() throws Throwable {
		Thread.sleep(3000);
		internationalroamPO.clickOnroaming1();
    }
	@Then("^the Roaming page is scrolled$")
    public void the_roaming_page_is_scrolled() throws Throwable {
		Thread.sleep(3000);
        Assert.assertTrue(internationalroamPO.scrollpageroam());
    }
	@When("^I click on select countries dropdown$")
    public void i_click_on_select_countries_dropdown() throws Throwable {
        internationalroamPO.clickselectCountriesa();
    }
	@Then("^I select options from dropdown and get the roaming rates$")
    public void i_select_options_from_dropdown_and_get_the_roaming_rates() throws Throwable {
       Assert.assertTrue(internationalroamPO.selectandvalidiate());
    }
	@When("^I click on back bttn I get redirected to back page$")
    public void i_click_on_back_bttn_i_get_redirected_to_back_page() throws Throwable {
		internationalroamPO.clickbackroamp();
    }
    @Then("^the Roaming header is displayed$")
	 public void the_roaming_header_is_displayed() throws Throwable {
    	 Assert.assertTrue(internationalroamPO.RoamingHeader());
	    }
    @Then("^verify the banner items$")
    public void verify_the_banner_items() throws Throwable {
    	 Assert.assertTrue(internationalroamPO.RoamingBanner());
    }
    @Then("^I verify the roaming bundles$")
    public void i_verify_the_roaming_bundles() throws Throwable {
    	Assert.assertTrue(internationalroamPO.RoamingBundles());
    }
    @Then("^I verify the text for the roaming rates$")
    public void i_verify_the_text_for_the_roaming_rates() throws Throwable {
    	Assert.assertTrue(internationalroamPO.TextRoamingBundles());
    }
    @Then("^I verify the rates for 25 sar$")
    public void i_verify_the_rates_for_25_sar() throws Throwable {
    	Assert.assertTrue(internationalroamPO.TextRoaming25sar());
    }
    @Then("^I verify the rates for 50 sar$")
    public void i_verify_the_rates_for_50_sar() throws Throwable {
    	Assert.assertTrue(internationalroamPO.TextRoaming50sar());
    }
    @Then("^I verify kuwait and oman as country$")
    public void i_verify_kuwait_and_oman_as_country() throws Throwable {
    	Assert.assertTrue(internationalroamPO.TextRoamingkuwait());
    }
    @Then("^I verify Countries and validity tabs$")
    public void i_verify_countries_and_validity_tabs() throws Throwable {
    	Assert.assertTrue(internationalroamPO.CountryValidityTab());
    }
    @Then("^I verify you pay tab$")
    public void i_verify_you_pay_tab() throws Throwable {
    	Assert.assertTrue(internationalroamPO.CountryYouPayTab());
    }
    @Then("^I verify you get tab$")
    public void i_verify_you_get_tab() throws Throwable {
    	Assert.assertTrue(internationalroamPO.CountryYougetTab());
    }



	
}