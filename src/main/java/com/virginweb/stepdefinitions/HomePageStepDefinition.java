package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Nimit Jain
 *
 */
public class HomePageStepDefinition extends StepDefinitionInit {

	@When("^I click on the Plan and Product tab$")
	public void i_click_on_the_Plan_and_Product_tab() throws Throwable {
		waitForPageLoaded();
		Thread.sleep(5000);
		homePO.clickPlanAndProduct(); 
		System.out.println("checkin");
	}

	@Then("^I see different options$")
	public void i_see_different_options() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(homePO.VerifyOptions());
		System.out.println("Next step");
	}
	 @Then("^I see different options in help and support$")
	    public void i_see_different_options_in_help_and_support() throws Throwable {
		 Assert.assertTrue(homePO.VerifyHelpandSupportOptions());   
	 }
	 @Then("^I verify its redirected to Virgin mobile page$")
	    public void i_verify_its_redirected_to_virgin_mobile_page() throws Throwable {
		 Assert.assertTrue(homePO.VerifyWhyVirginMobilePage()); 
	    }

    @And("^I click on plan tab$")
    public void i_click_on_plan_tab() throws Throwable {
    	Thread.sleep(5000);
    	  	homePO.clickOnPlan();
    	   System.out.println("next page loading");   
    }
    

    @And("^I click on offers tab$")
    public void i_click_on_offers_tab() throws Throwable {
    	Thread.sleep(5000);
	  	homePO.clickOnOffers();
	   System.out.println("next page loading");
    }
    
    @And("^I click on internationalRates tab$")
    public void i_click_on_internationalrates_tab() throws Throwable {
    	Thread.sleep(5000);
	  	homePO.clickOnInternationalRates();
	   System.out.println("next page loading");
    }
    @And("^I click on internationalRoaming tab$")
    public void i_click_on_internationalroaming_tab() throws Throwable {
    	Thread.sleep(5000);
	  	homePO.clickOnInternationalRoaming();
	   System.out.println("next page loading");  
    }
    @And("^I click on familytag tab$")
    public void i_click_on_familytag_tab() throws Throwable {
    	Thread.sleep(5000);
	  	homePO.clickOnFamiltTag();
	   System.out.println("next page loading");  
    }
    @And("^I click on frendi tab$")
    public void i_click_on_frendi_tab() throws Throwable {
    	Thread.sleep(5000);
	  	homePO.clickOnFrendi();
	   System.out.println("next page loading");
    }
    @When("^I click on the help and support tab$")
    public void i_click_on_the_help_and_support_tab() throws Throwable {
    	waitForPageLoaded();
    	Thread.sleep(5000);
		homePO.clickHelpAndSupport(); 
		System.out.println("checkin");
    }
    
   
    @And("^I click on faq tab$")
    public void i_click_on_faq_tab() throws Throwable {
    	Thread.sleep(5000);
		homePO.clickOnfaq(); 
		System.out.println("checkin");
    }
    @And("^I click on contact tab$")
    public void i_click_on_contact_tab() throws Throwable {
    	Thread.sleep(5000);
		homePO.clickOncontact(); 
		System.out.println("next page loaded");
    }

    @When("^I click on the why virgin mobile tab$")
    public void i_click_on_the_why_virgin_mobile_tab() throws Throwable {
    	waitForPageLoaded();
		Thread.sleep(5000);
		homePO.clickOnWhyVirginMobile(); 
		System.out.println("checkin");
    }
    @When("^I click on the different language tab$")
    public void i_click_on_the_different_language_tab() throws Throwable {
    	Thread.sleep(5000);
		homePO.clickOndiffLanguage();
    }
    @When("^I click on the quick top up tab$")
    public void i_click_on_the_quick_top_up_tab() throws Throwable {
    	waitForPageLoaded();
		Thread.sleep(5000);
		homePO.clickOnTopUp(); 
		System.out.println("checkin");
        }
    @When("^I click on the Join now tab$")
    public void i_click_on_the_join_now_tab() throws Throwable {
    	Thread.sleep(5000);
		homePO.clickOnJoinUs();
    }
    @Given("^I updated a test cases in test rail \"([^\"]*)\"$")
    public void i_updated_a_test_cases_in_test_rail_something(String testCaseID) throws Throwable {
    	PropFileHandler.writeToFile("testCaseID", testCaseID);
    }
    @When("^I click on the Plan and Product tab in mobilehamburger$")
    public void i_click_on_the_plan_and_product_tab_in_mobilehamburger() throws Throwable {
    	waitForPageLoaded();
		Thread.sleep(5000);
		homePO.clickOnHamburgerAndPlan(); 
		System.out.println("checkin");
    }
    @Then("^I get redirected to plans tab$")
    public void i_get_redirected_to_plans_tab() throws Throwable {
    	Assert.assertTrue(homePO.PlansRedirected());
    }
    @Then("^I get redirected to QuickTopUp page$")
    public void i_get_redirected_to_quicktopup_page() throws Throwable {
    	Assert.assertTrue(homePO.QuickTopUpRedirected());
    }
    @Then("^I redirected to why virgin page$")
    public void i_redirected_to_why_virgin_page() throws Throwable {
    	Assert.assertTrue(homePO.WhyVirginRedirected());
    }

    @Then("^I see different options in mobile$")
    public void i_see_different_options_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.ValidiatePage());
    }
    @When("^I click on plan tab in mobile$")
    public void i_click_on_plan_tab_in_mobile() throws Throwable {
    	homePO.clickOnHamburgerPlan();
    }
    @When("^I click on offers tab in mobile$")
    public void i_click_on_offers_tab_in_mobile() throws Throwable {
        homePO.clickOnOffersHam();
    }
    @And("^I click on internationalRates tab in mobile$")
    public void i_click_on_internationalrates_tab_in_mobile() throws Throwable {
        Assert.assertTrue(homePO.clickOnInternationalRatesHam());
    }
    @And("^I click on internationalRoaming tab in mobile$")
    public void i_click_on_internationalroaming_tab_in_mobile() throws Throwable {
    	 Assert.assertTrue(homePO.clickOnInternationalRoamHam());
    }
    @And("^I click on familytag tab in mobile$")
    public void i_click_on_familytag_tab_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.clickOnFamilyHam());
    }
    @And("^I click on frendi tab in mobile$")
    public void i_click_on_frendi_tab_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.clickOnFRENDIHam());
    }
    @When("^I click on the help and support tab in mobile$")
    public void i_click_on_the_help_and_support_tab_in_mobile() throws Throwable {
    	homePO.clickOnHelpandSupportHam();
    }
    @And("^I click on faq tab in mobile$")
    public void i_click_on_faq_tab_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.clickOnFaqHam());
    }
    @And("^I click on contact tab in mobile$")
    public void i_click_on_contact_tab_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.clickOnContactHam());
    }
    @And("^I click on findaStore tab in mobile$")
    public void i_click_on_findastore_tab_in_mobile() throws Throwable {
    	Assert.assertTrue(homePO.clickOnFindAStoreHam());
    }
    @Then("^I verify I get redirected to FindAStore page$")
    public void i_verify_i_get_redirected_to_findastore_page() throws Throwable {
    	Assert.assertTrue(homePO.VerifyOnFindAStore());
    }
    @When("^I click on the quick top up tab in mobile$")
    public void i_click_on_the_quick_top_up_tab_in_mobile() throws Throwable {
    	homePO.clickOntopUpHam();
    }
    @When("^I click on the Join now tab in mobile$")
    public void i_click_on_the_join_now_tab_in_mobile() throws Throwable {
    	homePO.clickOnJoinNOwHam();
    }
    @When("^I click on the Plan and Product tab in mobilehamburgerhamburger$")
    public void i_click_on_the_Plan_and_Product_tab_in_mobilehamburgerhamburger() throws Throwable {
        homePO.clickOnPlanandProdct();
    }
    @Then("^I verify different language page$")
    public void i_verify_different_language_page() throws Throwable {
    	Assert.assertTrue(homePO.VerifyDifferentLanguage());
    }
    @When("^I click on findaStore tab$")
    public void i_click_on_findastore_tab() throws Throwable {
    	Thread.sleep(5000);
		homePO.clickOnFindAStore();
    }

} 
