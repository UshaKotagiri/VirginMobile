package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BringYourOwnNumberStepDefinition extends StepDefinitionInit {

	@When("^I click on port your number$")
    public void i_click_on_port_your_number() throws Throwable {
       bringNumberPO.ClickOnPortNumber();
    }

    @When("^the user enters data into Mobile number$")
    public void the_user_enters_data_into_mobile_number() throws Throwable {
    	 bringNumberPO.EnterMobileNumber();
    }

    @When("^I select the Operators name$")
    public void i_select_the_operators_name() throws Throwable {
    	 bringNumberPO.SelectOperatorName();
    }

    @When("^I click on confirm Button$")
    public void i_click_on_confirm_button() throws Throwable {
    	 bringNumberPO.ClickOnConfirm();
    }

    @Then("^I verify Port your number button$")
    public void i_verify_port_your_number_button() throws Throwable {
        Assert.assertTrue( bringNumberPO.VerifyPortNumber());
    }

    @Then("^I verify Bring your number screen$")
    public void i_verify_bring_your_number_screen() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyBringNumberScreen());
    }

    @Then("^I verify Bring your number text$")
    public void i_verify_bring_your_number_text() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyBringNumberText());
    }

    @Then("^I verify the progress dropdown is displayed$")
    public void i_verify_the_progress_dropdown_is_displayed() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyProgressDropDown());
    }

    @Then("^I verify the port number is selected$")
    public void i_verify_the_port_number_is_selected() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyPortNumberSelected());
    }

    @Then("^I verify the Mobile number Operator name country dropdown and Optional mobile number is displayed$")
    public void i_verify_the_mobile_number_operator_name_country_dropdown_and_optional_mobile_number_is_displayed() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyMobileOperatorNameCountry());
    }

    @Then("^The help text disappears$")
    public void the_help_text_disappears() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyHelpTextDissapears());
    }

    @Then("^I verify the confirm button gets enabled$")
    public void i_verify_the_confirm_button_gets_enabled() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyConfirmButtonEnabled());
    }

    @Then("^I verify the Verification page Occurs$")
    public void i_verify_the_verification_page_occurs() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyVerificationCodepage());
    }
    @When("^I enter invalid number$")
    public void i_enter_invalid_number() throws Throwable {
     bringNumberPO.EnterInvalidNumber();
    }

    @Then("^I verify the send again in the verification page$")
    public void i_verify_the_send_again_in_the_verification_page() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifySendAgain());
    }

    @Then("^I verify the verification code tab in the page$")
    public void i_verify_the_verification_code_tab_in_the_page() throws Throwable {
       Assert.assertTrue( bringNumberPO.verifyCodeTab());
    }

    @Then("^I enter the verification code$")
    public void i_enter_the_verification_code() throws Throwable {
       Assert.assertTrue( bringNumberPO.EnterandVerifyCode());
    }

    @Then("^I Verify confirm but get enabled after verification code$")
    public void i_verify_confirm_but_get_enabled_after_verification_code() throws Throwable {
       Assert.assertTrue( bringNumberPO.VerifyConfirmEnabled());
    }

    @Then("^I verify that the confirm button is not enabled$")
    public void i_verify_that_the_confirm_button_is_not_enabled() throws Throwable {
       Assert.assertFalse( bringNumberPO.VerifyConfirmNotEnabled());
    }
    @When("^I click on hamburger in Mobile site$")
    public void i_click_on_hamburger_in_mobile_site() throws Throwable {
    	bringNumberPO.ClickHamburgerIcon();
    }

}