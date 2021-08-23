package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OnboardingCreateAccountStepDefinition extends StepDefinitionInit {
	
	
	@When("^I get redirected to the Homepage$")
    public void i_get_redirected_to_the_homepage() throws Throwable {
        Thread.sleep(3000);
    }

    @When("^I click on Get Help button$")
    public void i_click_on_get_help_button() throws Throwable {
       onboardingcreateaccountPO.ClickGetHelp();
    }

    @Then("^I verify Pland and product in the Homepage$")
    public void i_verify_pland_and_product_in_the_homepage() throws Throwable {
       Assert.assertTrue(onboardingcreateaccountPO.verifyPlanProudctInHomepage());
    }

    @Then("^I verify why virgin mobile in the Homepage$")
    public void i_verify_why_virgin_mobile_in_the_homepage() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyVirginMobileInHomepage());
    }

    @Then("^I verify Help and support in the homepage$")
    public void i_verify_help_and_support_in_the_homepage() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyHelpInHomepage());
    }

    @Then("^I Verify language in the homepage$")
    public void i_verify_language_in_the_homepage() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyLanguageInHomepage());
    }

    @Then("^I scroll the Homepage down$")
    public void i_scroll_the_homepage_down() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyscrollInHomepage());
    }

    @Then("^I verify Get Help button$")
    public void i_verify_get_help_button() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyGetHelpInHomepage());
    }

    @Then("^I redirected to the Get Help screen$")
    public void i_redirected_to_the_get_help_screen() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyGetHelpRedirectedscreen());
    }

    @Then("^I verify Eligibilty form in the page$")
    public void i_verify_eligibilty_form_in_the_page() throws Throwable {
         Assert.assertTrue(onboardingcreateaccountPO.verifyEligibilityForm());
    }
    @When("^I select a number from the list$")
    public void i_select_a_number_from_the_list() throws Throwable {
        onboardingcreateaccountPO.SelectNumberFromList();
    }

    @When("^I click on Book it now button$")
    public void i_click_on_book_it_now_button() throws Throwable {
        onboardingcreateaccountPO.ClickOnBookItNow();
    }

    @Then("^I verify book it now button$")
    public void i_verify_book_it_now_button() throws Throwable {
    	Assert.assertTrue(onboardingcreateaccountPO.verifyBookItNow());
    }
    @Then("^I verify ID type in the eligibility page$")
    public void i_verify_id_type_in_the_eligibility_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.verifyIDEligibilityForm());
    }

    @Then("^I verify ID number in the eligibility page$")
    public void i_verify_id_number_in_the_eligibility_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.verifyidNumberEligibilityForm());
    }

    @Then("^I verify Nationality in the eligibility page$")
    public void i_verify_nationality_in_the_eligibility_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.verifyNationalityEligibilityForm());
    }

    @Then("^I verify your current city in ksa in the eligibility page$")
    public void i_verify_your_current_city_in_ksa_in_the_eligibility_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.verifyCurrrentCityEligibilityForm());
    }
    @When("^I click on the check button in the page$")
    public void i_click_on_the_check_button_in_the_page() throws Throwable {
       onboardingcreateaccountPO.ClickCheckButton();
    }

    @Then("^I verify If the user choose the Saudi National ID for the ID type check if the nationality will becomes Saudi automatically$")
    public void i_verify_if_the_user_choose_the_saudi_national_id_for_the_id_type_check_if_the_nationality_will_becomes_saudi_automatically() throws Throwable {
    	Assert.assertTrue(onboardingcreateaccountPO.VerifyIDandIDtype());
    }

    @Then("^I verify the check button in the page$")
    public void i_verify_the_check_button_in_the_page() throws Throwable {
    	Assert.assertTrue(onboardingcreateaccountPO.verifyCheckBtn());
    }

    @Then("^I verify its redirected to the create account page$")
    public void i_verify_its_redirected_to_the_create_account_page() throws Throwable {
    	Assert.assertTrue(onboardingcreateaccountPO.RedirectedtoCreateAccountPage());
    }
    @When("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
    	 onboardingcreateaccountPO.ClickOnContinue();
    }

    @Then("^I verify Continue Button$")
    public void i_verify_continue_button() throws Throwable {
    	Assert.assertTrue(onboardingcreateaccountPO.VerifyContinue());
    }
    @When("^I click on I agree with legal stuff$")
    public void i_click_on_i_agree_with_legal_stuff() throws Throwable {
        onboardingcreateaccountPO.ClickOnLegalStuff();
    }

    @Then("^I verify email address field is present$")
    public void i_verify_email_address_field_is_present() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyEmail());
    }

    @Then("^I verify the help text present in the email address field$")
    public void i_verify_the_help_text_present_in_the_email_address_field() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyEmailHelpText());
    }

    @Then("^I verify the password field is present $")
    public void i_verify_the_password_field_is_present() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyPassword());
    }

    @Then("^I verify the mask button in the password field$")
    public void i_verify_the_mask_button_in_the_password_field() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifymaskButton());
    }

    @Then("^I verify if password is in asterik form when mask button is clicked$")
    public void i_verify_if_password_is_in_asterik_form_when_mask_button_is_clicked() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyasterikWhenMasked());
    }


    @Then("^I verify the I agree with legal stuff text$")
    public void i_verify_the_i_agree_with_legal_stuff_text() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyLegalStuff());
    }

    @Then("^Social media icons gets enabled$")
    public void social_media_icons_gets_enabled() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifySocailMedianEnabled());
    }

    @Then("^I verify facebook is present in the page$")
    public void i_verify_facebook_is_present_in_the_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyFacebook());
    }

    @Then("^I verify twitter is present in the page$")
    public void i_verify_twitter_is_present_in_the_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyTwitter());
    }

    @Then("^I verify Google plus is present on the page$")
    public void i_verify_google_plus_is_present_on_the_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyGoogle());
    }

    @Then("^I verify the create account get enabled$")
    public void i_verify_the_create_account_get_enabled() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyCreateAccountEnabled());
    }

    @Then("^I verify the your number dropdown in the page$")
    public void i_verify_the_your_number_dropdown_in_the_page() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyNumberDropdown());
    }

    @Then("^I verify if the number is displayed in the dropdown$")
    public void i_verify_if_the_number_is_displayed_in_the_dropdown() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyNumberDisplayedInDD());
    }

    @Then("^I verify your plan is present in the drop down$")
    public void i_verify_your_plan_is_present_in_the_drop_down() throws Throwable {
        Assert.assertTrue(onboardingcreateaccountPO.VerifyYourPlanInDD());
    }
   
}