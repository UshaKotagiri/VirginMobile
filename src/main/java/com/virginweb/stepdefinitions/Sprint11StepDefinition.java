package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Sprint11StepDefinition extends StepDefinitionInit {
	
	@When("^I scroll down the homePage$")
	public void i_scroll_down_the_homePage() throws Throwable {
	    sprint11PO.scrollPageSprint11();
	}
	
	 @Then("^I verify if the 70 SAR plan within the homepage is displayed$")
	    public void i_verify_if_the_70_sar_plan_within_the_homepage_is_displayed() throws Throwable {
	        Assert.assertTrue(sprint11PO.Verify70SarHomepage());
	    }

	    @Then("^I verify if the 100 SAR plan within the homepage is displayed$")
	    public void i_verify_if_the_100_sar_plan_within_the_homepage_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify100SarHomepage());
	    }

	    @Then("^I verify if the 125 SAR plan within the homepage is displayed$")
	    public void i_verify_if_the_125_sar_plan_within_the_homepage_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify125SarHomepage());
	    }
	    @Then("^I verify if the 70 SAR plan within the Plan is displayed$")
	    public void i_verify_if_the_70_sar_plan_within_the_plan_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify70SarPlan());
	    }

	    @Then("^I verify if the 100 SAR plan within the Plan is displayed$")
	    public void i_verify_if_the_100_sar_plan_within_the_plan_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify100SarPlan());
	    }

	    @Then("^I verify if the 125 SAR plan within the Plan is displayed$")
	    public void i_verify_if_the_125_sar_plan_within_the_plan_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify125SarPlan());
	    }
	    @Then("^I verify if the 70 SAR plan within the Joinnow is displayed$")
	    public void i_verify_if_the_70_sar_plan_within_the_joinnow_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify70SarJoinNow());
	    }

	    @Then("^I verify if the 100 SAR plan within the Joinnow is displayed$")
	    public void i_verify_if_the_100_sar_plan_within_the_joinnow_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify100SarJoinNow());
	    }

	    @Then("^I verify if the 125 SAR plan within the Joinnow is displayed$")
	    public void i_verify_if_the_125_sar_plan_within_the_joinnow_is_displayed() throws Throwable {
	       Assert.assertTrue(sprint11PO.Verify125SarJoinNow());
	    }
	    @When("^I click on Plan link$")
	    public void i_click_on_plan_link() throws Throwable {
	    	sprint11PO.ClickPlan();
	    }
	    @Then("^I verify the hamburger in the page$")
	    public void i_verify_the_hamburger_in_the_page() throws Throwable {
	      Assert.assertTrue(sprint11PO.VerifyHamburger());
	    }

	    @Then("^I verify the options in the hamburger$")
	    public void i_verify_the_options_in_the_hamburger() throws Throwable {
	      Assert.assertTrue(sprint11PO.VerifyOptionsInHamburger());
	    }

	    @Then("^I verify create your plan in the homepage$")
	    public void i_verify_create_your_plan_in_the_homepage() throws Throwable {
	      Assert.assertTrue(sprint11PO.verifyCreateYourPlan());
	    }
	    @When("^click on close button$")
	    public void click_on_close_button() throws Throwable {
	    	sprint11PO.Clicknclose();
	    }

	    @Then("^I verify that create your plan is clickable in the homepage$")
	    public void i_verify_that_create_your_plan_is_clickable_in_the_homepage() throws Throwable {
	      Assert.assertTrue(sprint11PO.VerifyClickYourPlanIsClickkable());
	    }

	    @Then("^I verify and click over the create your plan Button$")
	    public void i_verify_and_click_over_the_create_your_plan_button() throws Throwable {
	      Assert.assertTrue(sprint11PO.VerifyandClickCreateYourPlan());
	    }

	    @Then("^I verify the National Minutes in the page$")
	    public void i_verify_the_national_minutes_in_the_page() throws Throwable {
	      Assert.assertTrue(sprint11PO.VerifyNationalMinutes());
	    }
	
}