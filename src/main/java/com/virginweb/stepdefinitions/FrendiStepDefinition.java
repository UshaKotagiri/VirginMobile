package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FrendiStepDefinition extends StepDefinitionInit {

	
	 @When("^I click on Frendi1 tab$")
	    public void i_click_on_frendi1_tab() throws Throwable {
		 waitForPageLoaded();
		 Thread.sleep(5000);
	       frendiPO.FrenditabClick();
	    }
	 @When("^I click on plan and productna$")
	    public void i_click_on_plan_and_productna() throws Throwable {
		 waitForPageLoaded();
		 Thread.sleep(5000);
	       frendiPO.clickonpandproductAgain();
	    }

	 @When("^I click on plan and productn$")
	    public void i_click_on_plan_and_productn() throws Throwable {
		 frendiPO.clickonfrendiAgain();
	    }
	 @When("^I scroll down frendi page$")
	    public void i_scroll_down_frendi_page() throws Throwable {
		 Thread.sleep(5000);
		 frendiPO.scrollFrendi();
	    }
	 @Then("^I see package is already highlighted$")
	    public void i_see_package_is_already_highlighted() throws Throwable {
	       Assert.assertTrue(frendiPO.packagehighlighted());
	    }
	 @When("^I click on data button$")
	    public void i_click_on_data_button() throws Throwable {
		 Thread.sleep(3000);
	        frendiPO.clickDataBtn();
	    }
	 @Then("^I get redirected to data page$")
	    public void i_get_redirected_to_data_page() throws Throwable {
		 Assert.assertTrue(frendiPO.redirectedtoDtaPage());
	    }
	 @When("^I click on Package button on data page$")
	    public void i_click_on_package_button_on_data_page() throws Throwable {
		 frendiPO.clickPacakageBtn(); 
	    }
	 @When("^I go to back page on frendi$")
	    public void i_go_to_back_page_on_frendi() throws Throwable {
	       frendiPO.ClickonBackOnFrendi(); 
	    }
	 @When("^I click on call tab in frendi$")
	    public void i_click_on_call_tab_in_frendi() throws Throwable {
	       frendiPO.clickOnCallFrendi();
	    }
	 @Then("^I get redirected to required page$")
	    public void i_get_redirected_to_required_page() throws Throwable {
	        Assert.assertTrue(frendiPO.redirectToRequiredPage());
	    }
	 
	 @When("^I click on calls in Frendi$")
	    public void i_click_on_calls_in_frendi() throws Throwable {
	        frendiPO.clickOnCallFrendi();
	    }

	    @Then("^I verify the Data Bundles$")
	    public void i_verify_the_data_bundles() throws Throwable {
	    	 Assert.assertTrue(frendiPO.VerifyDatabundles());
	    }

	    @Then("^I verify fees data in the table$")
	    public void i_verify_fees_data_in_the_table() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyData());
	    }

	    @Then("^I verify Plan for sar data$")
	    public void i_verify_plan_for_sar_data() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyDataforSAR());
	    }

	    @Then("^I verify local calls to table$")
	    public void i_verify_local_calls_to_table() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyDatalocalCalls());
	    }

	    @Then("^I verify halala rates in calls tab$")
	    public void i_verify_halala_rates_in_calls_tab() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyHalala());
	    }

	    @Then("^I verify Frendi mobile nmber$")
	    public void i_verify_frendi_mobile_nmber() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyFrendiMobNumber());
	    }
	    @Then("^I verify other mobile network$")
	    public void i_verify_other_mobile_network() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyOtherMobileNet());
	    }

	    @Then("^I verify sms table$")
	    public void i_verify_sms_table() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifysmsTable());
	    }

	    @Then("^I verify on net minutes networks$")
	    public void i_verify_on_net_minutes_networks() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyOnNetMinutes());
	    }

	    @Then("^I verify vat is applied text$")
	    public void i_verify_vat_is_applied_text() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyVATText());
	    }

	    @Then("^I verify the number in the call tab$")
	    public void i_verify_the_number_in_the_call_tab() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyCallTab());
	    }

	    @Then("^I verify 1 sar fees $")
	    public void i_verify_1_sar_fees() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify1SAR());
	    }

	    @Then("^I verify 7 sar in the table$")
	    public void i_verify_7_sar_in_the_table() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify7SAR());
	    }

	    @Then("^I verify 25 sar in the table$")
	    public void i_verify_25_sar_in_the_table() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify25SAR());
	    }
	    @Then("^I verify IDD bundles$")
	    public void i_verify_idd_bundles() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyIDDBundles());
	    }

	    @Then("^I verify countries fees in the idd bundles$")
	    public void i_verify_countries_fees_in_the_idd_bundles() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verifyfees());
	    }

	    @Then("^I verify there is a plan for bangladesh$")
	    public void i_verify_there_is_a_plan_for_bangladesh() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyBanglaPlan());
	    }

	    @Then("^I verify there is a plan for india$")
	    public void i_verify_there_is_a_plan_for_india() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyindiaPlan());
	    }

	    @Then("^I verify there is a plan for pakistan$")
	    public void i_verify_there_is_a_plan_for_pakistan() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyPkistanPlan());
	    }

	    @Then("^I verify there is a plan for phillipines$")
	    public void i_verify_there_is_a_plan_for_phillipines() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyPhillipinesplan());
	    }

	    @Then("^I verify there is a plan for syria$")
	    public void i_verify_there_is_a_plan_for_syria() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifySyriaplan());
	    }

	    @Then("^I verify there is a plan for Egypt$")
	    public void i_verify_there_is_a_plan_for_egypt() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyEgyptplan());
	    }

	    @Then("^I verify there is a plan for Nepal$")
	    public void i_verify_there_is_a_plan_for_nepal() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyNepalplan());
	    }

	    @Then("^I verify vat text$")
	    public void i_verify_vat_text() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyVATtext());
	    }

	    @Then("^I verify international pay$")
	    public void i_verify_international_pay() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyInternationalPay());
	    }

	    @Then("^I verify the text in international pay$")
	    public void i_verify_the_text_in_international_pay() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyInternationalTxt());
	    }

	    @Then("^I verify the international call to bangladesh India Egypy$")
	    public void i_verify_the_international_call_to_bangladesh_india_egypy() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyInternationalCall1());
	    }

	    @Then("^I verify International callto yemen$")
	    public void i_verify_international_callto_yemen() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyInternationalCallYemen());
	    }

	    @Then("^I verify International call to pakistan$")
	    public void i_verify_international_call_to_pakistan() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyInternationalCallPakistan());
	    }

	    @Then("^I check the select countries dropdown$")
	    public void i_check_the_select_countries_dropdown() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifydropDown());
	    }
	    @When("^I click on Offers tab in frendi$")
	    public void i_click_on_offers_tab_in_frendi() throws Throwable {
	    	Assert.assertTrue(frendiPO.clickOfferTab());
	    }

	    @Then("^I verify bundelha plans$")
	    public void i_verify_bundelha_plans() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyBundelhaPlan());
	    }

	    @Then("^I verify the data for 19 sar$")
	    public void i_verify_the_data_for_19_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify19sar());
	    }

	    @Then("^I verify the data for 45 sar$")
	    public void i_verify_the_data_for_45_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify45Sar());
	    }

	    @Then("^I verify the data for 70 sar$")
	    public void i_verify_the_data_for_70_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify70sar());
	    }

	    @Then("^I verify the data for 90 sar$")
	    public void i_verify_the_data_for_90_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyDataforSAR());
	    }

	    @Then("^I verify the data for 110 sar$")
	    public void i_verify_the_data_for_110_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify110sar());
	    }

	    @Then("^I verify Bonus discount on recharge$")
	    public void i_verify_bonus_discount_on_recharge() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyBonus());
	    }

	    @Then("^I verify the data for 10 sar$")
	    public void i_verify_the_data_for_10_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify10Sar());
	    }

	    @Then("^I verify the data for 15 sar$")
	    public void i_verify_the_data_for_15_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify15sar());
	    }

	    @Then("^I verify the data for 20 sar$")
	    public void i_verify_the_data_for_20_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify20sar());
	    }

	    @Then("^I verify the data for 30 sar$")
	    public void i_verify_the_data_for_30_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify30sar());
	    }

	    @Then("^I verify the data for 100 sar$")
	    public void i_verify_the_data_for_100_sar() throws Throwable {
	    	Assert.assertTrue(frendiPO.Verify100sar());
	    }
	    @Then("^I verify its redirected to package page$")
	    public void i_verify_its_redirected_to_package_page() throws Throwable {
	    	Assert.assertTrue(frendiPO.VerifyRedirectedToPackagepage());
	    }
	    @Then("^I verify the Recharge Denomination national calls sms and voice to landline text in table$")
	    public void i_verify_the_recharge_denomination_national_calls_sms_and_voice_to_landline_text_in_table() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyTableContent());
	    }

	    @Then("^I verify that bonus text is available$")
	    public void i_verify_that_bonus_text_is_available() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyBonusText());
	    }

	    @Then("^I verify the Hot offer screen is displayed$")
	    public void i_verify_the_hot_offer_screen_is_displayed() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyOfferScreen());
	    }

	    @Then("^I verify the text no matter where you go is displayed$")
	    public void i_verify_the_text_no_matter_where_you_go_is_displayed() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyNoMatterText());
	    }

	    @Then("^I verify say hello text is available$")
	    public void i_verify_say_hello_text_is_available() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyHelloText());
	    }

	    @Then("^I verify the dial and vat text available in the page$")
	    public void i_verify_the_dial_and_vat_text_available_in_the_page() throws Throwable {
	       Assert.assertTrue(frendiPO.VerifyDialVatText());
	    }
	    @When("^I click on Hot offers button $")
	    public void i_click_on_hot_offers_button() throws Throwable {
	    	frendiPO.clickOnHotOffers();
	    }

	    @Then("^I Verify hot offers page$")
	    public void i_verify_hot_offers_page() throws Throwable {
	    	 Assert.assertTrue(frendiPO.HotOffersPage());
	    }

}