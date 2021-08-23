package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Sprint10StepDefinition extends StepDefinitionInit {

	 @When("^I Click on offers in plan and product in dd$")
	    public void i_click_on_offers_in_plan_and_product_in_dd() throws Throwable {
	        sprintPO.ClickOnPlansandProductdd();
	    }

	    @When("^I click on international rates$")
	    public void i_click_on_international_rates() throws Throwable {
	    	sprintPO.ClickOnInternationalRates();
	    }

	    @Then("^I verify that we are redircted to other offers page$")
	    public void i_verify_that_we_are_redircted_to_other_offers_page() throws Throwable {
	    	 Assert.assertTrue(sprintPO.RedirectedToOfferspg());
	    }

	    @Then("^I verify prepaid button appears on the offers page$")
	    public void i_verify_prepaid_button_appears_on_the_offers_page() throws Throwable {
	        Assert.assertTrue(sprintPO.prepaidVerification());
	    }

	    @Then("^I verify VAT text is available in the offers page$")
	    public void i_verify_vat_text_is_available_in_the_offers_page() throws Throwable {
	        Assert.assertTrue(sprintPO.VATtextVerification());
	    }

	    @Then("^I verify Bundhela plans appears on the page$")
	    public void i_verify_bundhela_plans_appears_on_the_page() throws Throwable {
	        Assert.assertTrue(sprintPO.BundhelaVerify());
	    }

	    @Then("^I verify fees and validity section appears on the page$")
	    public void i_verify_fees_and_validity_section_appears_on_the_page() throws Throwable {
	        Assert.assertTrue(sprintPO.feesVerify());
	    }

	    @Then("^I verify sar minutes appears in the prepaid section$")
	    public void i_verify_sar_minutes_appears_in_the_prepaid_section() throws Throwable {
	        Assert.assertTrue(sprintPO.sarMinVerify());
	    }

	    @Then("^I verify the dial number text in the bundhela plan$")
	    public void i_verify_the_dial_number_text_in_the_bundhela_plan() throws Throwable {
	        Assert.assertTrue(sprintPO.DialVerify());
	    }

	    @Then("^I verify fees and validity section appears in the bundhela plans$")
	    public void i_verify_fees_and_validity_section_appears_in_the_bundhela_plans() throws Throwable {
	        Assert.assertTrue(sprintPO.validityInBundhela());
	    }

	    @Then("^I verify sar minutes appears in the bundhela plan prepaid section$")
	    public void i_verify_sar_minutes_appears_in_the_bundhela_plan_prepaid_section() throws Throwable {
	        Assert.assertTrue(sprintPO.sarInBundhela());
	    }

	    @Then("^I verify the dial number text in the prepaid page in social media$")
	    public void i_verify_the_dial_number_text_in_the_prepaid_page_in_social_media() throws Throwable {
	        Assert.assertTrue(sprintPO.DialInSocial());
	    }

	    @Then("^I verify if VAT is applied at the time of recharge$")
	    public void i_verify_if_vat_is_applied_at_the_time_of_recharge() throws Throwable {
	        Assert.assertTrue(sprintPO.Vattextverify());
	    }

	    @Then("^I verify National Minutes appears under prepaid section within other offers page$")
	    public void i_verify_national_minutes_appears_under_prepaid_section_within_other_offers_page() throws Throwable {
	        Assert.assertTrue(sprintPO.NationalMinVerify());
	    }

	    @Then("^I verify fees under national minutes$")
	    public void i_verify_fees_under_national_minutes() throws Throwable {
	        Assert.assertTrue(sprintPO.FeesUnderNationalMin());
	    }

	    @Then("^I verify you can dial text under national minutes$")
	    public void i_verify_you_can_dial_text_under_national_minutes() throws Throwable {
	        Assert.assertTrue(sprintPO.DialUnderNationalMin());
	    }

	    @Then("^I verify Vat text in national minutes$")
	    public void i_verify_vat_text_in_national_minutes() throws Throwable {
	        Assert.assertTrue(sprintPO.VatUnderNatioanalMin());
	    }

	    @Then("^I verify postpaid button is cliackable or not$")
	    public void i_verify_postpaid_button_is_cliackable_or_not() throws Throwable {
	        Assert.assertTrue(sprintPO.PostpaidBtnverify());
	    }

	    @Then("^I verify standard pricing apperars in postpaid$")
	    public void i_verify_standard_pricing_apperars_in_postpaid() throws Throwable {
	        Assert.assertTrue(sprintPO.StandardPricingVerify());
	    }

	    @Then("^I verify vat text in postpaid section$")
	    public void i_verify_vat_text_in_postpaid_section() throws Throwable {
	        Assert.assertTrue(sprintPO.VatInPostpaid());
	    }

	    @Then("^I verify the international rates in the dd$")
	    public void i_verify_the_international_rates_in_the_dd() throws Throwable {
	        Assert.assertTrue(sprintPO.InternationVerify());
	    }

	    @Then("^I verify international roaming in dd$")
	    public void i_verify_international_roaming_in_dd() throws Throwable {
	        Assert.assertTrue(sprintPO.RoamingVerify());
	    }

	    @Then("^I verify its redirected to international rates$")
	    public void i_verify_its_redirected_to_international_rates() throws Throwable {
	        Assert.assertTrue(sprintPO.internationalRatesRedirectedVerify());
	    }
	    @When("^I click on International Roaminga$")
	    public void i_click_on_international_roaminga() throws Throwable {
	        sprintPO.clickRoaming();
	    }

	    @Then("^I verify the page if its redirected to the required page$")
	    public void i_verify_the_page_if_its_redirected_to_the_required_page() throws Throwable {
	        Assert.assertTrue(sprintPO.internationalRoamRedirectedVerify());
	    }

	    @Then("^I verify updated table appears in the roaming tab$")
	    public void i_verify_updated_table_appears_in_the_roaming_tab() throws Throwable {
	        Assert.assertTrue(sprintPO.internationalRoamTableRedirectedVerify());
	    }

	    @Then("^I verify data in the table is empty$")
	    public void i_verify_data_in_the_table_is_empty() throws Throwable {
	        Assert.assertTrue(sprintPO.internationaltableEmptyVerify());
	    }

	    @Then("^I verify the table appears in the International roaming page$")
	    public void i_verify_the_table_appears_in_the_international_roaming_page() throws Throwable {
	        Assert.assertTrue(sprintPO.internationalRatesRedirectedVerify());
	    }

	    @Then("^I verify CITC card column appear in table$")
	    public void i_verify_citc_card_column_appear_in_table() throws Throwable {
	        Assert.assertTrue(sprintPO.packageCardverify());
	    }
	    @When("^I click on Frendi package in pandproducts$")
	    public void i_click_on_frendi_package_in_pandproducts() throws Throwable {
	       sprintPO.FrendiClick();
	    }

	    @When("^I click on data$")
	    public void i_click_on_data() throws Throwable {
	        sprintPO.DataClickRoaming();
	    }

	    @Then("^I verify data bundles in data in frendiP$")
	    public void i_verify_data_bundles_in_data_in_frendip() throws Throwable {
	        Assert.assertTrue(sprintPO.DatabundlesVrify());
	    }

	    @Then("^I verify fees in data in FrendiP$")
	    public void i_verify_fees_in_data_in_frendip() throws Throwable {
	        Assert.assertTrue(sprintPO.FeesVerifyData());
	    }

	    @Then("^I verify Dial text in FrendiP$")
	    public void i_verify_dial_text_in_frendip() throws Throwable {
	        Assert.assertTrue(sprintPO.DataVerifyFrendiP());
	    }

	    @Then("^I verify VAT text in frendiP$")
	    public void i_verify_vat_text_in_frendip() throws Throwable {
	        Assert.assertTrue(sprintPO.VATFrendiPVerify());
	    }

	    @Then("^I verify NightTime appears in Rates in frendi data bundles$")
	    public void i_verify_nighttime_appears_in_rates_in_frendi_data_bundles() throws Throwable {
	        Assert.assertTrue(sprintPO.NighttimeFrendiPVerify());
	    }

}
