package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.sun.jna.platform.win32.COM.COMBindingBaseObject;
import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ComplaintStepDefinition extends StepDefinitionInit {
	
	
    @When("^I scroll the complaint page Down$")
    public void i_scroll_the_complaint_page_down() throws Throwable {
        complaintPO.ScrollComplaintPage();
    }

    @When("^I click on Telecom services button$")
    public void i_click_on_telecom_services_button() throws Throwable {
        complaintPO.ClickOnTelecomService();
    }

    @When("^I press the back button$")
    public void i_press_the_back_button() throws Throwable {
    	 complaintPO.PressBackButton();
    }

    @Then("^I verify and click over the complaint tab$")
    public void i_verify_and_click_over_the_complaint_tab() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyandClickOnComplaint());
    }

    @Then("^I verify the banner and the Logo is displayed in the complaint page$")
    public void i_verify_the_banner_and_the_logo_is_displayed_in_the_complaint_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyBannerandLogo());
    }

    @Then("^I verify the Complaint Text in the page$")
    public void i_verify_the_complaint_text_in_the_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyComplaintText());
    }

    @Then("^I verify the statement on customer handling policy$")
    public void i_verify_the_statement_on_customer_handling_policy() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyCustomerHandlingPolicy());
    }

    @Then("^I verify Customer complaints in the page$")
    public void i_verify_customer_complaints_in_the_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyCustomerComplaint());
    }

    @Then("^I verify the Learn about your rights text in the page$")
    public void i_verify_the_learn_about_your_rights_text_in_the_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyRights());
    }

    @Then("^I verify the telecom services button on page$")
    public void i_verify_the_telecom_services_button_on_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyTelecomServices());
    }

    @Then("^I verify its redirected to telecom page$")
    public void i_verify_its_redirected_to_telecom_page() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyComplaintPage());
    }

    @Then("^I verify if its redirected to previous pages$")
    public void i_verify_if_its_redirected_to_previous_pages() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyPreviouspage());
    }

    @Then("^I verify if its on Homepage$")
    public void i_verify_if_its_on_homepage() throws Throwable {
    	 Assert.assertTrue(complaintPO.VerifyHomepage());
    }
    @When("^I click on Complaint Page tab$")
    public void i_click_on_complaint_page_tab() throws Throwable {
    	complaintPO.ClickOnComplaint();
    }

    @Then("^I verify the header of the Page if its redirected to the page$")
    public void i_verify_the_header_of_the_page_if_its_redirected_to_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.verifyHeaderOfThePage());
    }

    @Then("^I Verify and click on The Customer Rights and Responsibilities$")
    public void i_verify_and_click_on_the_customer_rights_and_responsibilities() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyCustomerRightsTab());
    }

    @Then("^I verify if its redirected to Rights page$")
    public void i_verify_if_its_redirected_to_rights_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyRightsPage());
    }

    @Then("^I verify if Raise a complaint is visible and click over it$")
    public void i_verify_if_raise_a_complaint_is_visible_and_click_over_it() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyClickRaiseComplaint());
    }

    @Then("^I verify Raise complaint page$")
    public void i_verify_raise_complaint_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyraiseComplaintpage());
    }

    @Then("^I verify and Click Chat icon on the page$")
    public void i_verify_and_click_chat_icon_on_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyandClickOnchatIcon());
    }

    @Then("^I verify if the Chat screen appears$")
    public void i_verify_if_the_chat_screen_appears() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifychatScreen());
    }

    @Then("^I verify if the Chat is present at the bottom of the page$")
    public void i_verify_if_the_chat_is_present_at_the_bottom_of_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.verifyChatBottomscreen());
    }

    @Then("^I verify and click on our app is present on thepage$")
    public void i_verify_and_click_on_our_app_is_present_on_thepage() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyandcLickonOurApp());
    }

    @Then("^I verify if its redirected to Our app page$")
    public void i_verify_if_its_redirected_to_our_app_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyOurAppPage());
    }

    @Then("^I verify and click on store icon on the page$")
    public void i_verify_and_click_on_store_icon_on_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyandclickStoreicon());
    }

    @Then("^I verify if we are redirected to store page$")
    public void i_verify_if_we_are_redirected_to_store_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyOurStorePage());
    }

    @Then("^I verify and click on Contact Us Icon on the page$")
    public void i_verify_and_click_on_contact_us_icon_on_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyandClickContactUs());
    }


    @Then("^I verify Virgin Icon on the page$")
    public void i_verify_virgin_icon_on_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyIcon());
    }

    @Then("^I verify The user friendly text in the page$")
    public void i_verify_the_user_friendly_text_in_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyUserFriendlyText());
    }

    @Then("^I verify and click on contact us text present $")
    public void i_verify_and_click_on_contact_us_text_present() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyandClickOnContctUsText());
    }

    @Then("^I Verify the Contact us page$")
    public void i_verify_the_contact_us_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyContctpage());
    }

    @Then("^I Verify the number prefic$")
    public void i_verify_the_number_prefic() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyNumberPrefix());
    }

    @Then("^I verify the invalid text appears on blank nmber Field$")
    public void i_verify_the_invalid_text_appears_on_blank_nmber_field() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyErrorOnBlankField());
    }

    @Then("^I verify the send verification button$")
    public void i_verify_the_send_verification_button() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyVerificationButton());
    }

    @Then("^I verify the progress bar on the right side of the page$")
    public void i_verify_the_progress_bar_on_the_right_side_of_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyProgressbar());
    }

    @When("^I click Raise complaint Tab$")
    public void i_click_raise_complaint_tab() throws Throwable {
    	complaintPO.ClickOnRaiseComplaint();
    }

    @When("^I Click over the submit button after entering the subject$")
    public void i_click_over_the_submit_button_after_entering_the_subject() throws Throwable {
    	complaintPO.ClickOnSubmitBtn();
    }

    @Then("^I am able to enter number in the page$")
    public void i_am_able_to_enter_number_in_the_page() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyEnteredNumber());
    }

    @Then("^I verify the contact us link on the page$")
    public void i_verify_the_contact_us_link_on_the_page() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyContactLink());
    }

    @Then("^I clickon submit button$")
    public void i_clickon_submit_button() throws Throwable {
       Assert.assertTrue(complaintPO.verifySubmitButton());
    }

    @Then("^I am able to enter the Verification code in the page$")
    public void i_am_able_to_enter_the_verification_code_in_the_page() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyOTP());
    }

    @Then("^I click on the submit button after entering the verification code$")
    public void i_click_on_the_submit_button_after_entering_the_verification_code() throws Throwable {
       Assert.assertTrue(complaintPO.VerifySubmitAfterOTP());
    }

    @Then("^I verify the complaint section page $")
    public void i_verify_the_complaint_section_page() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyComplaintSectionPage());
    }

    @Then("^I verify the category and Subcategory section$")
    public void i_verify_the_category_and_subcategory_section() throws Throwable {
       Assert.assertTrue(complaintPO.verifyCategorySubcategory());
    }

    @Then("^I verify the user is able to enter email$")
    public void i_verify_the_user_is_able_to_enter_email() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyEmailEntered());
    }

    @Then("^I verify the user is able to enter Optional Number$")
    public void i_verify_the_user_is_able_to_enter_optional_number() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyOptionalNumber());
    }

    @Then("^I verify the user is able to enter the subject over the page$")
    public void i_verify_the_user_is_able_to_enter_the_subject_over_the_page() throws Throwable {
       Assert.assertTrue(complaintPO.VerifySubject());
    }

    @Then("^I verify that current page is visible$")
    public void i_verify_that_current_page_is_visible() throws Throwable {
       Assert.assertTrue(complaintPO.VerifyPageafterRaisingComplaint());
    }
    @Then("^I verify the ladder on the page$")
    public void i_verify_the_ladder_on_the_page() throws Throwable {
    	Assert.assertTrue(complaintPO.VerifyLadder());
    }

}
