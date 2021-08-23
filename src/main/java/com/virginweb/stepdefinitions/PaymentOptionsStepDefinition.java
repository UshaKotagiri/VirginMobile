package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PaymentOptionsStepDefinition extends StepDefinitionInit {

	@Then("^I verify plans in the Plan and support tab$")
    public void i_verify_plans_in_the_plan_and_support_tab() throws Throwable {
        Assert.assertTrue(paymentoptionsPO.VerifyPlansInTab());
    }

  
    @When("^I click over the get the plan button$")
    public void i_click_over_the_get_the_plan_button() throws Throwable {
        paymentoptionsPO.ClickOnGetPlan();
    }

    @When("^I click over Get help tab$")
    public void i_click_over_get_help_tab() throws Throwable {
    	paymentoptionsPO.ClickOnGethelp();
    }

    @Then("^I verify Get the plan tab in the page$")
    public void i_verify_get_the_plan_tab_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetPlan());
    }

    @Then("^I verify if it gets redirected to the required get plan page$")
    public void i_verify_if_it_gets_redirected_to_the_required_get_plan_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetPlanPage());
    }

    @Then("^I click over the dropdown$")
    public void i_click_over_the_dropdown() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyNumberDropDown());
    } 

    @Then("^I verify its redirected to Get Help page$")
    public void i_verify_its_redirected_to_get_help_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetHelpPage());
    }
    @Then("^I verify the get help tab$")
    public void i_verify_the_get_help_tab() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetHelpTab());
    }
    @When("^I click on Absher login on the page$")
    public void i_click_on_absher_login_on_the_page() throws Throwable {
    	paymentoptionsPO.ClickOnAbsher();
    }

    @Then("^I verify Absher login button on the page next to create account$")
    public void i_verify_absher_login_button_on_the_page_next_to_create_account() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyAbsherTab());
    }
    @When("^I click on Retun I am Dummy token$")
    public void i_click_on_retun_i_am_dummy_token() throws Throwable {
    	paymentoptionsPO.ClickOnReturnIamDummy();
    }

    @Then("^I verify the the Return I am dummy token on the next page of Absher$")
    public void i_verify_the_the_return_i_am_dummy_token_on_the_next_page_of_absher() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyReturnIamDummy());
    }
    @When("^I click on get me sim$")
    public void i_click_on_get_me_sim() throws Throwable {
    	paymentoptionsPO.ClickOnGetMeSim();
    }

    @Then("^I verify the screen Getting your sim$")
    public void i_verify_the_screen_getting_your_sim() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGettingYourSim());
    }

    @Then("^I verify get me the sim$")
    public void i_verify_get_me_the_sim() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetMeSim());
    }
    @When("^I click on Paynow Button$")
    public void i_click_on_paynow_button() throws Throwable {
    	paymentoptionsPO.ClickOnPayNow();
    }

    @Then("^I get redirected to the Get sim Details page$")
    public void i_get_redirected_to_the_get_sim_details_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyGetMeSimDetailsPage());
    }

    @Then("^I verify PayNow button$")
    public void i_verify_paynow_button() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyPayNow());
    }
    @When("^I click on Pay tab in Pay for your stuffs $")
    public void i_click_on_pay_tab_in_pay_for_your_stuffs() throws Throwable {
    	paymentoptionsPO.ClickOnPayNowInPayurStuff();
    }

    @Then("^I verify Pay for your stuffs$")
    public void i_verify_pay_for_your_stuffs() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyPayNowInPayUrStuff());
    }

    @Then("^I verify pay tab in pay for your stuff$")
    public void i_verify_pay_tab_in_pay_for_your_stuff() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyPayYourStuff());
    }
    @Then("^I verify the payment screen$")
    public void i_verify_the_payment_screen() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyPaymentScreen());
    }

    @Then("^I verify the Card number tab$")
    public void i_verify_the_card_number_tab() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCardNumberField());
    }

    @Then("^I verify the card name tab$")
    public void i_verify_the_card_name_tab() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCardNameField());
    }

    @Then("^I verify the expiry date tab$")
    public void i_verify_the_expiry_date_tab() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyExpiryDate());
    }

    @Then("^I verify the cvc tab in the page$")
    public void i_verify_the_cvc_tab_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCVVnumber());
    }

    @Then("^I verify if Done Button gets enabled$")
    public void i_verify_if_done_button_gets_enabled() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyDoneBtn());
    }
    @When("^I click on done button$")
    public void i_click_on_done_button() throws Throwable {
    	paymentoptionsPO.ClickOnDone();
    }

    @When("^I click on try again button $")
    public void i_click_on_try_again_button() throws Throwable {
    	paymentoptionsPO.ClickOnTryAgain();
    }

    @Then("^I get redirected to Try again screen$")
    public void i_get_redirected_to_try_again_screen() throws Throwable {
       Assert.assertTrue(paymentoptionsPO.VerifyTryAgain());
    }

    @Then("^I Redirected to the required page after try again$")
    public void i_redirected_to_the_required_page_after_try_again() throws Throwable {
       Assert.assertTrue(paymentoptionsPO.VerifyredirectedtoPage());
    }
    @Then("^I verify the value of cardNumber in the page$")
    public void i_verify_the_value_of_cardnumber_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCardnumberAdded());
    }

    @Then("^I verify the value of cardName in the page$")
    public void i_verify_the_value_of_cardname_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCardnameAdded());
    }

    @Then("^I verify the value of Cvv in the page$")
    public void i_verify_the_value_of_cvv_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyCVVAdded());
    }
    @Then("^I verify the value of expiry added in the page$")
    public void i_verify_the_value_of_expiry_added_in_the_page() throws Throwable {
    	Assert.assertTrue(paymentoptionsPO.VerifyExpiryDateAdded());
    }
    @When("^I click on Pay tab in Pay for your stuffs$")
    public void i_click_on_Pay_tab_in_Pay_for_your_stuffs() throws Throwable {
    	paymentoptionsPO.ClickPaytab();
    }
}