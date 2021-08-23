package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Navigation;

import com.virginweb.helper.Helper;
import com.virginweb.home.po.TopupPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FaqContactUsStepDefinition extends StepDefinitionInit {

	
	@When("^I click on Help and support tab again$")
    public void i_click_on_help_and_support_tab_again() throws Throwable {
		Thread.sleep(3000);
        faqPO.HelpandsupportClick();
    }
	@When("^I click on FAQ tab In Help and Support again$")
    public void i_click_on_faq_tab_in_help_and_support_again() throws Throwable {
        faqPO.Faqclickhelp();
    }
	@Then("^I get redirected to FAQ tab again$")
    public void i_get_redirected_to_faq_tab_again() throws Throwable {
        Assert.assertTrue(faqPO.redirectFAQpage());
    }
	@When("^I scroll down in FAQ in Help and support tab$")
    public void i_scroll_down_in_faq_in_help_and_support_tab() throws Throwable {
        faqPO.scrollfaqpage();
    }
	 @When("^I click on Search Field in Faq$")
	    public void i_click_on_search_field_in_faq() throws Throwable {
	       faqPO.clickOnSearchBtn();
	    }
	 @When("^I enter Invalid text in the search field$")
	    public void i_enter_invalid_text_in_the_search_field() throws Throwable {
		 Thread.sleep(3000);
	        faqPO.EnterinvalidInSearch();
	    }
	 @Then("^I see no options$")
	    public void i_see_no_options() throws Throwable {
		 Thread.sleep(5000);
		 Assert.assertTrue(faqPO.NoOptionPage());
	    }
	 @When("^I enter valid text in the search field$")
	    public void i_enter_valid_text_in_the_search_field() throws Throwable {
		 faqPO.EntervalidInSearch();
	    }
	 @When("^I click on contact tab In Help and Support again$")
	    public void i_click_on_contact_tab_in_help_and_support_again() throws Throwable {
	        faqPO.contactTabClick();
	    }
	 @Then("^I get redirected to contact tab again$")
	    public void i_get_redirected_to_contact_tab_again() throws Throwable {
		 Assert.assertTrue(faqPO.redirectTocontactUspg());
	    }
	 @When("^I click on submit in contact us tab$")
	    public void i_click_on_submit_in_contact_us_tab() throws Throwable {
	        faqPO.clickOnSubmitContactUs();
	    }
	 @Then("^I get error message in the tab1$")
	    public void i_get_error_message_in_the_tab1() throws Throwable {
		 Assert.assertTrue(faqPO.redirectToErrormsg());
	    }
	 @When("^I enter all the required details$")
	    public void i_enter_all_the_required_details() throws Throwable {
		 Thread.sleep(3000);
		 faqPO.EnterRequiredDetails();
		 
	    }
	 @When("^I enter More details$")
	    public void i_enter_more_details() throws Throwable {
	        faqPO.moreDetails();
	    }
	 @Then("^I click on Chatbox$")
	    public void i_click_on_chatbox() throws Throwable {
		 Assert.assertTrue(faqPO.chatbox());
	    }
	 @When("^I click on minimise button$")
	    public void i_click_on_minimise_button() throws Throwable {
	        faqPO.chatboxMinimised();
	    }
	 @When("^I click on chatbox again$")
	    public void i_click_on_chatbox_again() throws Throwable {
		 Assert.assertTrue(faqPO.chatbox());
	    }
	 @When("^I close the chatbox$")
	    public void i_close_the_chatbox() throws Throwable {
	       faqPO.clickChatboxClose();
	    }
	 @Then("^I verify if text entered is correct$")
	    public void i_verify_if_text_entered_is_correct() throws Throwable {
	      Assert.assertTrue(faqPO.VerifyEnteredText());
	    }
	 @Then("^I verify the validiation text after submit button$")
	    public void i_verify_the_validiation_text_after_submit_button() throws Throwable {
		 Assert.assertTrue(faqPO.VerifyAfterSubmitClick());
	    }
	 @Then("^I verify the details entered in the required page$")
	    public void i_verify_the_details_entered_in_the_required_page() throws Throwable {
		 Assert.assertTrue(faqPO.VerifyDetailsofContactPage()); 
	    }
	 @Then("^I verify the search field$")
	    public void i_verify_the_search_field() throws Throwable {
		 Assert.assertTrue(faqPO.verifySearchfield());
	    }
	 @Then("^I verify the minimise button in chatbox$")
	    public void i_verify_the_minimise_button_in_chatbox() throws Throwable {
		 Assert.assertTrue(faqPO.verifyMinimiseBtn());
	    }
	 @Then("^I verify the invalid text entered in the search field$")
	    public void i_verify_the_invalid_text_entered_in_the_search_field() throws Throwable {
		 Assert.assertTrue(faqPO.verifyInvalidText());
	    }
	 @Then("^I verify that the chatbox is closed$")
	    public void i_verify_that_the_chatbox_is_closed() throws Throwable {
		 Assert.assertFalse(faqPO.verifyChatboxClosed());
	    }
	 @Then("^I verify the chatbox opens$")
	    public void i_verify_the_chatbox_opens() throws Throwable {
		 Assert.assertTrue(faqPO.chatbox());
	    }
	 @Then("^I verify if its redirected to searched page$")
	    public void i_verify_if_its_redirected_to_searched_page() throws Throwable {
		 Assert.assertTrue(faqPO.VerifySearchedPage());
	    }

	 

}