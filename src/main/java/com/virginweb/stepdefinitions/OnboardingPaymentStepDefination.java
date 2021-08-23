package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnboardingPaymentStepDefination extends StepDefinitionInit {

	@Then("^check Burger Icon displayed in the top left corner$")
	public void check_burger_icon_displayed_in_the_top_left_corner() throws Throwable {
		Assert.assertFalse(onboardingPaymentPO.burgerleftshown());
	}

	@Then("^Check the following options Home Plans and Offers Why Virgin Mobile Help and Support Ø§Ù„Ø¹Ø±Ø¨ÙŠØ© English$")
	public void check_the_following_options_home_plans_and_offers_why_virgin_mobile_help_and_support_english()
			throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.dropdownburgershown());
	}

	@When("^I click on hamburger menu icon option$")
	public void i_click_on_hamburger_menu_icon_option() throws Throwable {
		onboardingPaymentPO.hamburgerClick();
	}

	@When("^I click on plan in mobile$")
	public void i_click_on_plan_in_mobile() throws Throwable {
		onboardingPaymentPO.planMobileclick();
	}

	@When("^I pick one number$")
	public void i_pick_one_number() throws Throwable {
		onboardingPaymentPO.picknumber();
	}

	@Then("^it redirects to Pick you number screen popup$")
	public void it_redirects_to_pick_you_number_screen_popup() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.pickpage());
	}

	@When("^I click on Book it now$")
	public void i_click_on_book_it_now() throws Throwable {

		onboardingPaymentPO.bookitnow();
	}

	@Then("^check that it redirect to check eligibility page$")
	public void check_that_it_redirect_to_check_eligibility_page() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.eligibilityPage());
	}

	@When("^I enter all valid data in all text box$")
	public void i_enter_all_valid_data_in_all_text_box() throws Throwable {
		onboardingPaymentPO.validplantext();
	}

	@Then("^congratulation page are shown$")
	public void congratulation_page_are_shown() throws Throwable {

		Assert.assertTrue(onboardingPaymentPO.congratulations());
	}

	@When("^I click on login button in absher page$")
	public void i_click_on_login_button_in_absher_page() throws Throwable {

		onboardingPaymentPO.clickabsherLogin();
	}

	@Then("^check the Abser login page is scroll down$")
	public void check_the_Abser_login_page_is_scroll_down() throws Throwable {

		Assert.assertTrue(onboardingPaymentPO.scrollabsherpage());
	}

	@Then("^check Different option are shown in mobile view$")
	public void check_different_option_are_shown_in_mobile_view() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.DifferentoptionInmobileDisplay());
	}

	@When("^I click on get this plan in mobile$")
	public void i_click_on_get_this_plan_in_mobile() throws Throwable {
		onboardingPaymentPO.getplanMobileclick();
	}

	@When("^I click on GET HELP button$")
	public void i_click_on_get_help_button() throws Throwable {
		onboardingPaymentPO.GetHelpClick();
	}

	@When("^I click on continues button$")
	public void i_click_on_continues_button() throws Throwable {

		onboardingPaymentPO.continueClick();
	}

	@When("^I enter all the details of create account$")
	public void i_enter_all_the_details_of_create_account() throws Throwable {
		onboardingPaymentPO.createAccountClick();
	}

	@Then("^redirected to the Login to SP section$")
	public void redirected_to_the_login_to_sp_section() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.loginspDisplay());
	}

	@When("^I click on Return Dummy IAM Token$")
	public void i_click_on_return_dummy_iam_token() throws Throwable {

		onboardingPaymentPO.returnDummyclick();
	}

	  @Then("^check Get the sim delivered SIM is checked or click$")
	    public void check_get_the_sim_delivered_sim_is_checked_or_click() throws Throwable {
	    	Assert.assertTrue(onboardingPaymentPO.simdelivered());
	    }


	@When("^check continue button is enable or not or click$")
	public void check_continue_button_is_enable_or_not_or_click() throws Throwable {
		onboardingPaymentPO.continueClick();
	}

	@When("^I click on pay online$")
	public void i_click_on_pay_online() throws Throwable {
		onboardingPaymentPO.payonlinebutton();
	}

	@Then("^Pay For Stuff page should be dispayed$")
	public void pay_For_Stuff_page_should_be_dispayed() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.payForStuffDisplay());
	}

	@Then("^check navigated to the proper Help screen$")
	public void check_navigated_to_the_proper_help_screen() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.HelpPageDisplayed());
	}

	@When("^I click pay now button in pay your stuffPage$")
	public void i_click_pay_now_button_in_pay_your_stuffpage() throws Throwable {

		onboardingPaymentPO.payOnstuff();
	}

	@Then("^Check if clicking the button opens the credit card form$")
	public void check_if_clicking_the_button_opens_the_credit_card_form() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.CreditcardPage());
	}

	@Then("^I verify if there is a CARD NUMBER or we can enter the data$")
	public void i_verify_if_there_is_a_card_number_or_we_can_enter_the_data() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.cardNumberDisplayed());
	}

	@Then("^check if the field has card number validation$")
	public void check_if_the_field_has_card_number_validation() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.cardNumberValidation());
	}

	@Then("^I verify if there is a CARDHOLDER NAME field	or we can input data in that field$")
	public void i_verify_if_there_is_a_cardholder_name_fieldor_we_can_input_data_in_that_field() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.CardHolderField());
	}

	@Then("^Check if the field has character validation$")
	public void check_if_the_field_has_character_validation() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.CardHolderCharValidation());
	}

	@Then("^I verify if there is a EXPIRY DATE field or we can input data in that field$")
	public void i_verify_if_there_is_a_expiry_date_field_or_we_can_input_data_in_that_field() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.ExpiryDateInput());
	}

	@Then("^Check if the field has character validation EXPIRY DATE$")
	public void check_if_the_field_has_character_validation_expiry_date() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.expiryDateValidation());
	}

	@Then("^I verify if there is a CVV field or we can input data in that field$")
	public void i_verify_if_there_is_a_cvv_field_or_we_can_input_data_in_that_field() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.CvvField());
	}

	@Then("^Check if the field has character validation CVV$")
	public void check_if_the_field_has_character_validation_cvvcvc() throws Throwable {
		Assert.assertTrue(onboardingPaymentPO.cvvCharValidation());
	}
}
