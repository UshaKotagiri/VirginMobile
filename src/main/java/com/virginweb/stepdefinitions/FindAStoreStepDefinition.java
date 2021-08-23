package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.helper.Helper;
import com.virginweb.home.po.TopupPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FindAStoreStepDefinition extends StepDefinitionInit {

	@When("^I click on help and support button on Virgin$")
    public void i_click_on_help_and_support_button_on_virgin() throws Throwable {
		Thread.sleep(2000);
        findAStorePO.ClickhelpSupportVirgin();
    }
	
	@When("^I click on Find a store tab in virgin$")
    public void i_click_on_find_a_store_tab_in_virgin() throws Throwable {
		Thread.sleep(2000);
        findAStorePO.clickFindAStoreTabV();
    }
	@When("^I click on Find a location tab$")
    public void i_click_on_find_a_location_tab() throws Throwable {
        findAStorePO.ClickOnLocation();
    }
	@Then("^I get redirected to a find store page$")
    public void i_get_redirected_to_a_find_store_page() throws Throwable {
        Assert.assertTrue(findAStorePO.RedirecttoFindaStore());
    }
	@When("^I click on location tab$")
    public void i_click_on_location_tab() throws Throwable {
       findAStorePO.ClickOnLiveLocation();
    }
	@When("^I scroll down the Find Store$")
    public void i_scroll_down_the_find_store() throws Throwable {
        findAStorePO.scrollFindaStore();
    }
	@Then("^I verify the Current location$")
    public void i_verify_the_current_location() throws Throwable {
		Assert.assertTrue(findAStorePO.VerifyCurrentLocation());
    }
	@When("^I click on Hamburger in find a store$")
    public void i_click_on_hamburger_in_find_a_store() throws Throwable {
        findAStorePO.clickOnHB();
    }
	@Then("^Hamburger opens$")
    public void hamburger_opens() throws Throwable {
		Assert.assertTrue(findAStorePO.RedirecttoHBinStore());
    }
	@When("^I click on Family tag in HB$")
    public void i_click_on_family_tag_in_hb() throws Throwable {
        findAStorePO.familyClick();
    }
	@Then("^I click on done and redircted to required pge$")
    public void i_click_on_done_and_redircted_to_required_pge() throws Throwable {
		Assert.assertTrue(findAStorePO.clickDoneinHB());
    }
	@When("^I click on Recharge in HB$")
    public void i_click_on_recharge_in_hb() throws Throwable {
        findAStorePO.clickRecharge();
    }
	@When("^I Click on sim in HB$")
    public void i_click_on_sim_in_hb() throws Throwable {
       findAStorePO.clickSIM();
    }
	@When("^I click on back button of HB$")
    public void i_click_on_back_button_of_hb() throws Throwable {
        findAStorePO.clickBackHB();
    }
	 @When("^I scroll up the HB page$")
	    public void i_scroll_up_the_hb_page() throws Throwable {
	        findAStorePO.scrollupStore();
	        
	    }
	 @Then("^I get hamburger gets closed$")
	    public void i_get_hamburger_gets_closed() throws Throwable {
	       Assert.assertTrue(findAStorePO.HBclosed());
	    }
	 @When("^I click on why virgin mobile1 page$")
	    public void i_click_on_why_virgin_mobile1_page() throws Throwable {
	        findAStorePO.clickOnWhyVirginm();
	    }
	 @Then("^I get redirected to the req page$")
	    public void i_get_redirected_to_the_req_page() throws Throwable {
		 Assert.assertTrue(findAStorePO.redirecttoVirginMob());
	    }
	 @When("^I scroll down the why virgin mob page$")
	    public void i_scroll_down_the_why_virgin_mob_page() throws Throwable {
	        findAStorePO.scrolldownwhyVirginPG();
	    }
	 @When("^I click On JoinNow Page for the case$")
	    public void i_click_on_joinnow_page_for_the_case() throws Throwable {
	        findAStorePO.clickJoinnowTab();
	    }
	 @Then("^I get on the join now page$")
	    public void i_get_on_the_join_now_page() throws Throwable {
		 Assert.assertTrue(findAStorePO.redirectoJoinNow());
	    }
	 @When("^I scroll down the join page$")
	    public void i_scroll_down_the_join_page() throws Throwable {
	        findAStorePO.scrolljoin();
	    }
	 @When("^I click on port Number$")
	    public void i_click_on_port_number() throws Throwable {
	        findAStorePO.clickOnPortnmber();
	    }
	 @When("^I click on country code$")
	    public void i_click_on_country_code() throws Throwable {
	        findAStorePO.countryCode();
	        
	    }
	 @Then("^I get required result$")
	    public void i_get_required_result() throws Throwable {
	      Assert.assertTrue(findAStorePO.countryCodeDisplay());
	    }



}