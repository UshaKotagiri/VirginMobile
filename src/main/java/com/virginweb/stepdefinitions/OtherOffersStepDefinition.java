package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Navigation;

import com.virginweb.helper.Helper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class OtherOffersStepDefinition extends StepDefinitionInit {
	@When("^I click on Plan and Product$")
    public void i_click_on_plan_and_product() throws Throwable {
		Thread.sleep(5000);
		waitForPageLoaded();
        otheroffersPO.clickOnPandProduct();
    }
	@When("^I click on other offers in plan and Product$")
    public void i_click_on_other_offers_in_plan_and_product() throws Throwable {
		Thread.sleep(2000);
       otheroffersPO.clickonoffers();
    }
	@Then("^I get redirected to Other Offers page$")
    public void i_get_redirected_to_other_offers_page() throws Throwable {
        Assert.assertTrue(otheroffersPO.redirecttoOffers());
    }
	@And("^the page is scrollabble$")
    public void the_page_is_scrollable() throws Throwable {
        Assert.assertTrue(otheroffersPO.scrolldown());
    }
	@Then("^The prepaid tab is selected bydefault$")
    public void the_prepaid_tab_is_selected_bydefault() throws Throwable {
        Assert.assertTrue(otheroffersPO.prepaidSelected());
    }
	@When("^I click on postpaid tab$")
    public void i_click_on_postpaid_tab() throws Throwable {
        otheroffersPO.clickOnPostpaid();
    }
	@Then("^I get redirected to postpaid page$")
    public void i_get_redirected_to_postpaid_page() throws Throwable {
        Assert.assertTrue(otheroffersPO.redirecttoPostpaid());
    }
	@And("^The postpaid page id scrollable$")
    public void the_postpaid_page_id_scrollable() throws Throwable {
        Assert.assertTrue(otheroffersPO.scrollPostpaid());
    }
	@When("^I click On the Pacakge card button$")
    public void i_click_on_the_pacakge_card_button() throws Throwable {
        otheroffersPO.clickOnPackageButton();
    }
	@Then("^I click on back button$")
    public void i_click_on_back_button() throws Throwable {
        Assert.assertTrue(otheroffersPO.clickOnPackageback());
    }
	 @Then("^I verify the package card$")
	    public void i_verify_the_package_card() throws Throwable {
		 Assert.assertTrue(otheroffersPO.packagecardRedirected());
	    }
	 @Then("^I verify the standard table section$")
	    public void i_verify_the_standard_table_section() throws Throwable {
	        Assert.assertTrue(otheroffersPO.StandardTableVerify());
	    }

	    @Then("^I verify the Monthly postpaid bill paid$")
	    public void i_verify_the_monthly_postpaid_bill_paid() throws Throwable {
	        Assert.assertTrue(otheroffersPO.MonthlyPostpaidVerify());
	    }

	    @Then("^I verify the Premium tab is diplayed$")
	    public void i_verify_the_premium_tab_is_diplayed() throws Throwable {
	        Assert.assertTrue(otheroffersPO.PremiumTableVerify());
	    }

	    @Then("^I verify the Monthly allownace text$")
	    public void i_verify_the_monthly_allownace_text() throws Throwable {
	        Assert.assertTrue(otheroffersPO.MonthlyAllowanceVerify());
	    }

	    @Then("^I verify the data bundles in the page$")
	    public void i_verify_the_data_bundles_in_the_page() throws Throwable {
	        Assert.assertTrue(otheroffersPO.DataBundleVerify());
	    }

	    @Then("^I verify the exclusive virgin mobile Text$")
	    public void i_verify_the_exclusive_virgin_mobile_text() throws Throwable {
	        Assert.assertTrue(otheroffersPO.ExclusiveVirginText());
	    }

	    @Then("^I verify the Vat text$")
	    public void i_verify_the_vat_text() throws Throwable {
	        Assert.assertTrue(otheroffersPO.VatDialText());
	    }

	    @Then("^I verify the footer is displayed$")
	    public void i_verify_the_footer_is_displayed() throws Throwable {
	        Assert.assertTrue(otheroffersPO.FooterVerify());
	    }

	    @Then("^I verify the 15 sar is displayed$")
	    public void i_verify_the_15_sar_is_displayed() throws Throwable {
	        Assert.assertTrue(otheroffersPO.Sar15Display());
	    }

	    @Then("^I verify the standard row package data$")
	    public void i_verify_the_standard_row_package_data() throws Throwable {
	        Assert.assertTrue(otheroffersPO.StandardRowVerify());
	    }

}