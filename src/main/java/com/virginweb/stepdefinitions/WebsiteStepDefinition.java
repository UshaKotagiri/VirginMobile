package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.helper.Helper;
import com.virginweb.home.po.TopupPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WebsiteStepDefinition extends StepDefinitionInit {
	
	@When("^I scroll the Virgin page down$")
    public void i_scroll_the_virgin_page_down() throws Throwable {
		Thread.sleep(2000);
        Helper.scrollDown();
    }

    @When("^I enter email address in the required text box$")
    public void i_enter_email_address_in_the_required_text_box() throws Throwable {
        websitePO.EnterEmailAddress();
    }

    @When("^I click over the subscribe button$")
    public void i_click_over_the_subscribe_button() throws Throwable {
       websitePO.ClickOnSubscribe();
    }

    @Then("^I verify the create your plan button$")
    public void i_verify_the_create_your_plan_button() throws Throwable {
      Assert.assertTrue(websitePO.VerifyCreateYourPlan());
    }

    @Then("^I verify the text is displayed at the footer$")
    public void i_verify_the_text_is_displayed_at_the_footer() throws Throwable {
    	Assert.assertTrue(websitePO.TextVerification());
    }

    @Then("^I verify About virgin mobile is displayed at the footer$")
    public void i_verify_about_virgin_mobile_is_displayed_at_the_footer() throws Throwable {
    	Assert.assertTrue(websitePO.AboutVirginMobileVerify());
    }

    @Then("^I verify Terms ad conditions on the page$")
    public void i_verify_terms_ad_conditions_on_the_page() throws Throwable {
        Assert.assertTrue(websitePO.TermsandConditionsVerify());
    }

    @Then("^I verify Privacy Policy on the page$")
    public void i_verify_privacy_policy_on_the_page() throws Throwable {
        Assert.assertTrue(websitePO.PrivacyPolicyVerify());
    }

    @Then("^I Verify banner on the page$")
    public void i_verify_banner_on_the_page() throws Throwable {
        Assert.assertTrue(websitePO.BannerVerify());
    }

    @Then("^I verify text about Virgin mobile$")
    public void i_verify_text_about_virgin_mobile() throws Throwable {
        Assert.assertTrue(websitePO.AboutMobileTextVerify());
    }

    @Then("^I verify youtube on the page are displayed below Follow Us$")
    public void i_verify_youtube_on_the_page_are_displayed_below_follow_us() throws Throwable {
        Assert.assertTrue(websitePO.YoutubeVerify());
    }

    @Then("^I verify twitter on the page are displayed below Follow Us$")
    public void i_verify_twitter_on_the_page_are_displayed_below_follow_us() throws Throwable {
        Assert.assertTrue(websitePO.TwitterVerify());
    }

    @Then("^I verify instagram on the page are displayed below Follow Us$")
    public void i_verify_instagram_on_the_page_are_displayed_below_follow_us() throws Throwable {
        Assert.assertTrue(websitePO.InstagramVerify());
    }

    @Then("^I verify facebook on the page are displayed below Follow Us$")
    public void i_verify_facebook_on_the_page_are_displayed_below_follow_us() throws Throwable {
        Assert.assertTrue(websitePO.facebookVerify());
    }

    @Then("^I verify 2018 Virgin Mobile Saudi Consortium LLC All rights reserved at the bottom$")
    public void i_verify_2018_virgin_mobile_saudi_consortium_llc_all_rights_reserved_at_the_bottom() throws Throwable {
        Assert.assertTrue(websitePO.AllRightsReservedTextVerify());
    }

    @Then("^I verify if Email address text box is present in the page$")
    public void i_verify_if_email_address_text_box_is_present_in_the_page() throws Throwable {
        Assert.assertTrue(websitePO.EmailAddressVerify());
    }

    @Then("^I verify the subscribe button is present at the footer $")
    public void i_verify_the_subscribe_button_is_present_at_the_footer() throws Throwable {
        Assert.assertTrue(websitePO.SubscribebtnVerify());
    }

    @Then("^I Get the success message when the user is succesfully subscribed$")
    public void i_get_the_success_message_when_the_user_is_succesfully_subscribed() throws Throwable {
        Assert.assertTrue(websitePO.SuccessmsgVerify());
    }
    @When("^I click on Google playstore$")
    public void i_click_on_google_playstore() throws Throwable {
    	websitePO.GooglePlaystoreClick();
    }

    @Then("^I verify Google playstore button$")
    public void i_verify_google_playstore_button() throws Throwable {
    	 Assert.assertTrue(websitePO.GoogleplaystoreVerify());
    }

    @Then("^I get redirected to the required page$")
    public void i_get_redirected_to_the_required_page() throws Throwable {
    	 Assert.assertTrue(websitePO.RedirectedtoGooglePlaystore());
    }

    @Then("^I verify there is promotion plan in the carousel$")
    public void i_verify_there_is_promotion_plan_in_the_carousel() throws Throwable {
         Assert.assertTrue(websitePO.verifyPromotionPlan());
    }

    @Then("^I verify the data in the plan$")
    public void i_verify_the_data_in_the_plan() throws Throwable {
         Assert.assertTrue(websitePO.VerifyDataInPlan());
    }

    @Then("^I verify Just sim tab in the page$")
    public void i_verify_just_sim_tab_in_the_page() throws Throwable {
         Assert.assertTrue(websitePO.VerifyJustSim());
    }

    @Then("^I Get the error message for the already subscribed Email$")
    public void i_get_the_error_message_for_the_already_subscribed_email() throws Throwable {
         Assert.assertTrue(websitePO.ErrorMessage());
    }

    @Then("^I verify the Links in the footer present$")
    public void i_verify_the_links_in_the_footer_present() throws Throwable {
         Assert.assertTrue(websitePO.verifyFooterlink());
    }

    @Then("^I verify the banner and Title text$")
    public void i_verify_the_banner_and_title_text() throws Throwable {
         Assert.assertTrue(websitePO.VerifyBannerTitle());
    }

    @Then("^I verify the appstore and google play option$")
    public void i_verify_the_appstore_and_google_play_option() throws Throwable {
         Assert.assertTrue(websitePO.VerifyGoogleStore());
    }

}