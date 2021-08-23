package com.virginweb.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FooterWebStepDef extends StepDefinitionInit {

	
	@When("^I click on About Virgin mobile$")
    public void i_click_on_about_virgin_mobile() throws Throwable {
        footerWebPO.click_AboutVirginLink();
    }

    @Then("^I verify that I redirected to About virgi mobile page$")
    public void i_verify_that_i_redirected_to_about_virgi_mobile_page() throws Throwable {
       Assert.assertTrue(footerWebPO.verify_AboutVirginPage());
    }
    
    @When("^I click on Virgin Group$")
    public void i_click_on_virgin_group() throws Throwable {
       footerWebPO.click_VirginGroup();
    }

    @Then("^I verify that I redirected to Virgin Group page$")
    public void i_verify_that_i_redirected_to_virgin_group_page() throws Throwable {
    	 Assert.assertTrue(footerWebPO.verify_URL_Page("www.virgin.com"));
    }
    
    @When("^I click on Terms and Condition$")
    public void i_click_on_terms_and_condition() throws Throwable {
    	 footerWebPO.click_TermsAndCondition();
    }

    @Then("^I verify that I redirected to Terms and Condition page$")
    public void i_verify_that_i_redirected_to_terms_and_condition_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_TermsAndCondition());
    }
    
    @When("^I click on Privacy policy$")
    public void i_click_on_privacy_policy() throws Throwable {
    	footerWebPO.click_PrivacyPolicy();
    }

    @Then("^I verify that I redirected to Privacy policy$")
    public void i_verify_that_i_redirected_to_privacy_policy() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_PrivacyPolicy());
    }
    
    @When("^I click on Consumer Rights and Responsibilities$")
    public void i_click_on_consumer_rights_and_responsibilities() throws Throwable {
    	footerWebPO.click_CustomerRights();
    }

    @Then("^I verify that I redirected to Consumer Rights and Responsibilities$")
    public void i_verify_that_i_redirected_to_consumer_rights_and_responsibilities() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_CustomerRights());
    }
    
    @When("^I click on Download app$")
    public void i_click_on_download_app() throws Throwable {
    	footerWebPO.click_DownloadApp();
    }

    @Then("^I verify that I redirected to Download app$")
    public void i_verify_that_i_redirected_to_download_app() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_DownloadApp());
    }
    
    @When("^I click on Career page$")
    public void i_click_on_career_page() throws Throwable {
    	footerWebPO.click_Career();
    }

    @Then("^I verify that I redirected to Career page$")
    public void i_verify_that_i_redirected_to_career_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_Career());
    }
    
    @When("^I click on Youtube Page$")
    public void i_click_on_youtube_page() throws Throwable {
        footerWebPO.click_youtubeLink();
    }

    @Then("^I verify that I redirected to Youtube page$")
    public void i_verify_that_i_redirected_to_youtube_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_URL_Page("www.youtube.com"));
    }
    
    @When("^I click on Twitter Page$")
    public void i_click_on_twitter_page() throws Throwable {
    	footerWebPO.click_Twitter();
    }

    @Then("^I verify that I redirected to Twitter page$")
    public void i_verify_that_i_redirected_to_twitter_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_URL_Page("twitter.com"));
    }

    @When("^I click on Instagram Page$")
    public void i_click_on_instagram_page() throws Throwable {
    	footerWebPO.click_Instagram();
    }

    @Then("^I verify that I redirected to Instagram page$")
    public void i_verify_that_i_redirected_to_instagram_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_URL_Page("www.instagram.com"));
    }
    
    @When("^I click on Facebook Page$")
    public void i_click_on_facebook_page() throws Throwable {
    	footerWebPO.click_Facebook();
    }

    @Then("^I verify that I redirected to Facebook page$")
    public void i_verify_that_i_redirected_to_facebook_page() throws Throwable {
    	Assert.assertTrue(footerWebPO.verify_URL_Page("www.facebook.com"));
    }



}
