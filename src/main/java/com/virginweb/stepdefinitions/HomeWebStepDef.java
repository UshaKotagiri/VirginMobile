package com.virginweb.stepdefinitions;

import org.junit.Assert;

import com.virginweb.helper.Helper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeWebStepDef extends StepDefinitionInit{
	
	 @Then("^I verify that i redirected to HomePage$")
	    public void i_verify_that_i_redirected_to_homepage() throws Throwable {
	        Assert.assertTrue(homeWebPO.verify_HomePage());
	    }

	 @When("^I scroll the page Up Down$")
	    public void i_scroll_the_page_up_and_down() throws Throwable {
		  homeWebPO.scrollUpDown();
	    }

	 @Then("^I verify that Page is scrollable$")
	    public void i_verify_that_page_is_scrollable() throws Throwable {
		 Assert.assertTrue(homeWebPO.verify_PageScroll());
	    }
	 
	 @When("^I click on I love it button$")
	    public void i_click_on_i_love_it_button() throws Throwable {
	        homeWebPO.click_ILoveItButton();
	    }
	 
	 @When("^I change page language into English$")
	    public void i_change_page_language_to_english() throws Throwable {
	          homeWebPO.change_EngLanguage();
	    }

	   @Then("^I verify that I redirected to COOL NOW FOR A PLAN page$")
	    public void i_verify_that_i_redirected_to_cool_now_for_a_plan_pagee() throws Throwable {
	    	Thread.sleep(4000);
	    	Assert.assertTrue(homeWebPO.verify_COOLNOWPage());
	    }
      
	    @When("^I scroll the page upto Pick or create your plan$")
	    public void i_scroll_the_page_upto_pick_or_create_your_plan() throws Throwable {
	        homeWebPO.scrollPage();
	    }

	    @Then("^I verify that right arrow is working and i redirect to 250 plan popup$")
	    public void i_verify_that_right_arrow_is_working_and_i_redirect_to_250_plan_popup() throws Throwable {
	       Assert.assertTrue(homeWebPO.verify_RightScroll());
	    }

	    @And("^I verify that left arrow is working and i redirect back to 70 plan popup$")
	    public void i_verify_that_left_arrow_is_working_and_i_redirect_back_to_70_plan_popup() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_LeftScroll()); 
	    }


	    @When("^I click on Package button$")
	    public void i_click_on_package_button() throws Throwable {
	        homeWebPO.click_PackageButton();
	    }

	    @Then("^I verify that Package button is clickable$")
	    public void i_verify_that_package_button_is_clickable() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_PackageBtnClickable());
	    }
	    
	    @Then("^I verify that pdf file opened on click of package card$")
	    public void i_verify_that_pdf_file_opened_on_click_of_package_card() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_PackagePdfFile());
	    }
	    
	    @When("^I click on Get plan button$")
	    public void i_click_on_get_plan_button() throws Throwable {
	        homeWebPO.click_GetPlan();
	    }
	    
	    @Then("^I verify that I redirected to PICK YOUR NUMBER page$")
	    public void i_verify_that_i_redirected_to_pick_your_number_page() throws Throwable {
	        Thread.sleep(5000);
	        Assert.assertTrue(homeWebPO.verify_PickYourNumber());
	    }
	    
	    @When("^I select any number$")
	    public void i_select_any_number() throws Throwable {
	        homeWebPO.pick_Number();
	    }

	    @Then("^I verify that number gets displayed in right side of panel$")
	    public void i_verify_that_number_gets_displayed_in_right_side_of_panel() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_NumberDisplayedOnPanel());
	    }
	    
	    @When("^I click on Book_Now button$")
	    public void i_click_on_booknow_button() throws Throwable {
	        homeWebPO.click_bookNow();
	    }

	    @Then("^I verify that i redirected to eligibility page$")
	    public void i_verify_that_i_redirected_to_check_eligibility_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_CheckEligibiltyPage());
	    }
	    
	    @When("^I click on Id DropDwn$")
	    public void i_click_on_id_dropdwn() throws Throwable {
	       homeWebPO.click_IDDropDwn();
	    }

	    @Then("^I verify that i am able to select any value$")
	    public void i_verify_that_i_am_able_to_select_any_value() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_IDDropdwn());
	    }

	    @Then("^I verify that i can see IDNum,Nationality and KSA fields$")
	    public void i_verify_that_i_can_see_idnumnationality_and_ksa_fields() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_IdNum_Nationality_City_FieldsDisplayed());
	    }
	    
	    @When("^I Enter \"([^\"]*)\" in ID, Enter invalid \"([^\"]*)\" in ID_Number, \"([^\"]*)\" in Nationality and \"([^\"]*)\" in City$")
	    public void i_enter_something_in_id_enter_invalid_something_in_idnumber_something_in_nationality_and_something_in_city(String ID, String ID_Number, String Nationality, String City) throws Throwable {
	       homeWebPO.enterIDNumber_Nationality_ID_City(ID, ID_Number, Nationality, City);
	    }

	    @Then("^I Verify that i redirected to Sorry_page$")
	    public void i_verify_that_i_redirected_to_sorrypage() throws Throwable {
	        Assert.assertTrue(homeWebPO.verify_Sorry_Page());
	    }

	    @And("^I click on Check_button$")
	    public void click_on_checkbutton() throws Throwable {
	    	Assert.assertTrue(homeWebPO.click_CheckBtn());
	    }
	    
	    @When("^I click on ReEnter_Btn$")
	    public void i_click_on_reenterbtn() throws Throwable {
	       homeWebPO.click_ReEnterButton();
	    }
	    
	    @Then("^I Verify that i redirected to Congratulation_page$")
	    public void i_verify_that_i_redirected_to_congratulationpage() throws Throwable {
	        Assert.assertTrue(homeWebPO.verify_CongratsPage()); 
	    }
	    
	    @When("^I click on continue btn$")
	    public void i_click_on_continue_btn() throws Throwable {
	        homeWebPO.click_ContinueBtn();
	    }

	    @Then("^I verify I redirected to Create_Account page$")
	    public void i_verify_i_redirected_to_createaccount_page() throws Throwable {
	    	 Assert.assertTrue(homeWebPO.verify_CreateAccount_Page());
	    }

	    @And("^I verify for the social media links$")
	    public void i_verify_for_the_social_media_links() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_SocialMedia_Link());
	    }
	    
	    @When("^I Enter \"([^\"]*)\" in Email and \"([^\"]*)\" in Password$")
	    public void i_enter_something_in_email_and_something_in_password(String email, String password) throws Throwable {
	       homeWebPO.enter_EmailAndPassword(email, password);
	    }

	    @Then("^I verify that I get error message$")
	    public void i_verify_that_i_get_error_message() throws Throwable {
	    	Thread.sleep(5000);
	    	Assert.assertTrue(homeWebPO.verify_errorPageOn_CreateAccount());
	    }

	    @And("^I click on button$")
	    public void i_click_on_button() throws Throwable {
	    	Assert.assertTrue(homeWebPO.click_Create_Account());
	    }
	    
	    @Then("^I verify that i redirected to AbsherLogin page$")
	    public void i_verify_that_i_redirected_to_absherlogin_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_AbsherLoginPage());
	    }
	    
	    @And("^I scroll the page up_down$")
	    public void i_scroll_the_page_updown() throws Throwable {
	       homeWebPO.verify_ScrollUpScrollDown();
	    }
	    
	    @When("^I click on Absher Login_button$")
	    public void i_click_on_absher_loginbutton() throws Throwable {
	        homeWebPO.click_Absher_Login();
	    }

	    @Then("^I redirect to Login to Sp_section$")
	    public void i_redirect_to_login_to_spsection() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_LpSectionPage());
	    }
	    
	    @When("^I click on Dummy_IAM token$")
	    public void i_click_on_dummyiam_token() throws Throwable {
	       homeWebPO.click_DummyIAM_Token();
	    }

	    @Then("^I verify i redirect to Getting Sim Page$")
	    public void i_verify_i_redirect_to_getting_sim_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_GettingSimPage());
	    }
	    
	    @And("^I verify that virgin_sim_checbox is clickable$")
	    public void i_verify_that_virginsimchecbox_is_clickable() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_VirginCheckbox_clickable());
	    }
	    
	    @When("^I click on virgin sim checkbox$")
	    public void i_click_on_virgin_sim_checkbox() throws Throwable {
	        homeWebPO.select_virginSimCheckbox();
	    }

	    @Then("^I verify that SimTextField is enabled and i am able to enter sim number$")
	    public void i_verify_that_simtextfield_is_enabled_and_i_am_able_to_enter_sim_number() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_EnabledSimField());
	    }
	    
	    @And("^I verify that SimText field is disabled without cchecking vigin checkbox$")
	    public void i_verify_that_simtext_field_is_disabled_without_cchecking_vigin_checkbox() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_SimFieldWithoutVirginCheckbox());
	    }
	    
	    @When("^i select virgin sim checkbox and enter valid number and click on continue button$")
	    public void i_select_virgin_sim_checkbox_and_enter_valid_number_and_click_on_continue_button() throws Throwable {
	        homeWebPO.click_ContinueButtonOnGettingSim();
	    }

	    @Then("^I verify that i redirected to next page$")
	    public void i_verify_that_i_redirected_to_next_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_nextPageAfterGettingSim());
	    }
	    
	    @When("^I click on TryAgain button$")
	    public void i_click_on_tryagain_button() throws Throwable {
	        homeWebPO.click_TryAgainBtn();
	    }
	    
	    @When("^I click on eSim_Checkbox and click on continue button$")
	    public void i_click_on_esimcheckbox_and_click_on_continue_button() throws Throwable {
	        homeWebPO.click_EsimAndContinue();
	    }

	    @Then("^I verify I redirect to Card detail page$")
	    public void i_verify_i_redirect_to_card_detail_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_CardDetailPage());
	    }
	    
	    @When("^I click on browser back button$")
	    public void i_click_on_browser_back_button() throws Throwable {
	        homeWebPO.BrowserBack();
	    }
	    
	    @When("^I click on your number dropdown$")
	    public void i_click_on_your_number_dropdown() throws Throwable {
	        homeWebPO.click_YourNumDrpDwn();
	    }

	    @Then("^I verify that i am able to view number in it$")
	    public void i_verify_that_i_am_able_to_view_number_in_it() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_NumUnderDrpDwn());
	    }
	    
	    @When("^I click on gettingSimDelivered_Checkbox and click on continue button$")
	    public void i_click_on_gettingsimdeliveredcheckbox_and_click_on_continue_button() throws Throwable {
	        homeWebPO.click_SimDeliveredChecboxAndBtn();
	    }
        

	    @When("^I put \"([^\"]*)\" in cardNum, \"([^\"]*)\" in cardHolder, \"([^\"]*)\" in ExpiryDate and \"([^\"]*)\" in CVVField$")
	    public void i_enter_something_in_cardnum_something_in_cardname_something_in_expiry_and_something_in_cvv(String cardNum, String cardName, String expiry, String CVV) throws Throwable {
	        homeWebPO.enter_Card_Details(cardNum, cardName, expiry, CVV);
	    }

	    @Then("^I verify that done_button is not enabled$")
	    public void i_verify_that_donebutton_is_not_enabled() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_visibilityFor_DONEButton());
	    }
	    
	    @Then("^I verify that i redrected to ACS_Emulator_page$")
	    public void i_verify_that_i_redrected_to_acs_emulator_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_ACSEmulator_Page());
	    }

	    @And("^I click on Done_button$")
	    public void i_click_on_done_button() throws Throwable {
	    	Assert.assertTrue(homeWebPO.click_Donebutton_CardPage());
	    }
	    
	    @When("^I hit Submit button$")
	    public void i_hit_submit_button() throws Throwable {
	        homeWebPO.hit_SubmitBtn();
	    }

	    @Then("^I verify for the success page$")
	    public void i_verify_for_the_success_page() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_Success_PageForACS());
	    }
	    

	    @When("^I click on Continue button on Success page$")
	    public void i_click_on_continue_button() throws Throwable {
	        homeWebPO.click_ContinueOnSucessACS();
	    }

	    @Then("^I verify that i Redirected to Map$")
	    public void i_verify_that_i_redirected_to_map() throws Throwable {
	    	Assert.assertTrue(homeWebPO.verify_MAPPAge());
	    }
	    @When("^I enter email Address in to the field$")
	    public void i_enter_email_address_in_to_the_field() throws Throwable {
	    	homeWebPO.enterRandomEmail();
	    }
	   
	    @When("^I Enter Password$")
	    public void i_Enter_Password() throws Throwable {
	    	homeWebPO.enterPassword();
	    }
	    @When("^I click on Virgin logo$")
	    public void i_click_on_virgin_logo() throws Throwable {
	    	homeWebPO.ClickOnVirginLogo();
	    }

	    @Then("^I verify the Logo virgin in the page$")
	    public void i_verify_the_logo_virgin_in_the_page() throws Throwable {
	       Assert.assertTrue(homeWebPO.VerifyLogo());
	    }

	    @Then("^I verify I get redirected to Homepage$")
	    public void i_verify_i_get_redirected_to_homepage() throws Throwable {
	       Assert.assertTrue(homeWebPO.RedirectedtoHomePage());
	    }

	    @Then("^I verify making your life text available$")
	    public void i_verify_making_your_life_text_available() throws Throwable {
	       Assert.assertTrue(homeWebPO.MakingLifeText());
	    }

	    @Then("^I verify turn out a lucky number text$")
	    public void i_verify_turn_out_a_lucky_number_text() throws Throwable {
	       Assert.assertTrue(homeWebPO.LuckyNumberText());
	    }

	    @Then("^I verify Why virgin mobile appears on Homepage$")
	    public void i_verify_why_virgin_mobile_appears_on_homepage() throws Throwable {
	       Assert.assertTrue(homeWebPO.WhyVirginMob());
	    }


}    
	   