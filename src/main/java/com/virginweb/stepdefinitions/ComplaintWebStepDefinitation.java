package com.virginweb.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComplaintWebStepDefinitation extends StepDefinitionInit {

	@When("^I click on complains$")
	public void i_click_on_complains() throws Throwable {
		complaintWebPO.complainTab();
	}

	@Then("^check complain page is displayed$")
	public void check_complain_page_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.complainPage());
	}

	@And("^scroll down the complain page$")
	public void scroll_down_the_complain_page() throws Throwable {
		Assert.assertTrue(complaintWebPO.scrollComplainPage());
	}

	@Then("^check virgin logo page are diaplay$")
	public void check_virgin_logo_page_are_diaplay() throws Throwable {
		Assert.assertTrue(complaintWebPO.virginLogo());
	}

	@When("^I click on Terms for offering Telecom services$")
	public void i_click_on_terms_for_offering_telecom_services() throws Throwable {
		complaintWebPO.clickTermsForOffering();
	}

	@Then("^Terms for offering Telecom services page are display$")
	public void terms_for_offering_Telecom_services_page_are_display() throws Throwable {
		Assert.assertTrue(complaintWebPO.TermsForOfferIngPage());
	}

	@When("^I Click on the The customer rights and responsibilities$")
	public void i_click_on_the_the_customer_rights_and_responsibilities() throws Throwable {
		complaintWebPO.customerRightClick();
	}

	@Then("^check customer and Responsibilty page is shown$")
	public void check_customer_and_responsibilty_page_is_shown() throws Throwable {
		Assert.assertTrue(complaintWebPO.customerResponsibilityPage());
	}

	@When("^I click on raise a complaint$")
	public void i_click_on_raise_a_complaint() throws Throwable {
		complaintWebPO.raiseComplain();
	}

	@Then("^Check raise a complaint page is displayed$")
	public void check_raise_a_complaint_page_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.complainTicketPage());
	}

	@When("^I click on contact Text field$")
	public void i_click_on_contact_text_field() throws Throwable {
		complaintWebPO.complainText();
	}

	@Then("^it redirect to contact us page$")
	public void it_redirect_to_contact_us_page() throws Throwable {
		Assert.assertTrue(complaintWebPO.contactUsDisplayed());
	}

	@Then("^check contact number Text field is displayed or clickable$")
	public void check_contact_number_text_field_is_displayed_or_clickable() throws Throwable {
		Assert.assertTrue(complaintWebPO.contactnumbertextDisplayed());
	}

	@Then("^check contact code Text field is displayed$")
	public void check_contact_code_text_field_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.contactCodeTextDisplayed());
	}

	@Then("^check verification code button field is displayed$")
	public void check_verification_code_button_field_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.verificationCodeDisplayed());
	}

	@Then("^check enter number, ticket details, confirmation is displayed$")
	public void check_enter_number_ticket_details_confirmation_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.ticketDetailsDisplayed());
	}

	@When("^I Enter invalid data on contact number text field$")
	public void i_enter_invalid_data_on_contact_number_text_field() throws Throwable {
		complaintWebPO.invalidContactNumber();
	}

	@When("^I Enter valid data on contact number text field$")
	public void i_enter_valid_data_on_contact_number_text_field() throws Throwable {
		complaintWebPO.validContactNumber();
	}

	@Then("^check Enter a Valid mobile number message is displayed$")
	public void check_enter_a_valid_mobile_number_message_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.errorInContactDisplayed());
	}

	@Then("^Verification code appear or not$")
	public void verification_code_appear_or_not() throws Throwable {
		Assert.assertTrue(complaintWebPO.verificationCodeDisplayed());
	}

	@When("^I click on resend button in verification code$")
	public void i_click_on_resend_button_in_verification_code() throws Throwable {
		complaintWebPO.resendClick();
	}

	@When("^I enter all valid data in ticket details$")
	public void i_enter_all_valid_data_in_ticket_details() throws Throwable {
		complaintWebPO.validMailsClick();
	}

	@When("^I enter valid otp message$")
	public void i_enter_valid_otp_message() throws Throwable {
		complaintWebPO.otpClick();
	}

	@When("^I click on go back$")
	public void i_click_on_go_back() throws Throwable {
		complaintWebPO.goBacksClick();
		;
	}

	@When("^I click on contact us in sorry page$")
	public void i_click_on_contact_us_in_sorry_page() throws Throwable {
		complaintWebPO.contactUsClick();
	}

	@Then("^check go back and contact us button is displayed$")
	public void check_go_back_and_contact_us_button_is_displayed() throws Throwable {
		Assert.assertTrue(complaintWebPO.conactAndGoBackPage());
	}

	@Then("^it redirct to back page$")
	public void it_redirct_to_back_page() throws Throwable {
		Assert.assertTrue(complaintWebPO.emailPage());
	}

	@Then("^check Enter the one-time-passowrd message appear or not$")
	public void check_enter_the_onetimepassowrd_message_appear_or_not() throws Throwable {
		Assert.assertTrue(complaintWebPO.timePasswordDisplayed());
	}

	@Then("^check You can resend after 24 seconds message appear or not$")
	public void check_you_can_resend_after_24_seconds_message_appear_or_not() throws Throwable {
		Assert.assertTrue(complaintWebPO.resendMessageDisplayed());
	}

	@Then("^check sorry message are shown$")
	public void check_sorry_message_are_shown() throws Throwable {
		Assert.assertTrue(complaintWebPO.sorryContactPage());
	}

	@Then("^check submit button is highlighted$")
	public void check_submit_button_is_highlighted() throws Throwable {
		Assert.assertTrue(complaintWebPO.submitButton());
	}

	@Then("^check that the category dropdown appears in the category section$")
	public void check_that_the_category_dropdown_appears_in_the_category_section() throws Throwable {
		Assert.assertTrue(complaintWebPO.Categoryshown());
	}

	@Then("^check that the Add sub category dropdown appears in the sub category section$")
	public void check_that_the_add_sub_category_dropdown_appears_in_the_sub_category_section() throws Throwable {
		Assert.assertTrue(complaintWebPO.subCategoryshown());
	}

	@When("^I select the sub-categories in the category dropdown$")
	public void i_select_the_subcategories_in_the_category_dropdown() throws Throwable {
		complaintWebPO.subcategoryClick();
	}

	@Then("^check if selecting \"([^\"]*)\" and (\\d+) data changes the cost of the plan$")
	public void check_if_selecting_something_and_data_changes_the_cost_of_the_plan(String net, int subvalue)
			throws Throwable {
		Assert.assertTrue(complaintWebPO.subcategoryCheck(net, subvalue));
	}

}
