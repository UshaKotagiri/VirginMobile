package com.virginweb.stepdefinitions;

import org.junit.Assert;

import com.virginweb.helper.Helper;
import com.virginweb.utils.PropFileHandler;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JoinNowStepDef extends StepDefinitionInit {
	
	@Given("^I have updated on Test rail \"([^\"]*)\"$")
	public void i_have_updated_on_Test_rail(String testCaseID) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PropFileHandler.writeToFile("testCaseID", testCaseID);
	}
	
	 @When("^I click on JoinNow link$")
	    public void i_click_on_joinnow_link() throws Throwable {
	      joinNowPO.JoinUs_Open();
	    }

	    @Then("^I redirect to Join Us Page$")
	    public void i_redirect_to_join_us_page() throws Throwable {	
	       Assert.assertTrue(joinNowPO.verify_JoinUsPage());
	   //    System.out.println("back to page============");
	    }
	    
	    @When("^I scroll the page Up and Down$")
	    public void i_scroll_the_page_up_and_down() throws Throwable {
	       Helper.scrollDown();
	       Thread.sleep(1000);
	       Helper.scrollUp();
	    }
	    
	    @Then("^I verify that page is Scrollable$")
	    public void i_verify_that_page_is_scrollable() throws Throwable {
	        Assert.assertTrue(joinNowPO.verify_scroll());
	    }
	    
	    @When("^I change page language to English$")
	    public void i_change_page_language_to_english() throws Throwable {
	       joinNowPO.change_Language();
	    }
	    
	    @When("^I Click on any number$")
	    public void i_click_on_any_number() throws Throwable {
	        joinNowPO.select_Number();
	    }
	    
	    @Then("^I verify Number is clickable$")
	    public void i_verify_number_is_clickable() throws Throwable {
	    //	Thread.sleep(3000);
	    	Assert.assertTrue(joinNowPO.verify_NumberClick());	    	
	    }

	    @Then("^I verify Details of the number gets displayed$")
	    public void i_verify_details_of_the_number_gets_displayed() throws Throwable {
	    //	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_NumberDetailsDisplayed());
	    }
	    
	    @When("^I click on BookNow button$")
	    public void i_click_on_booknow_button() throws Throwable {
	        joinNowPO.clickBookNowButton();
	    }

	    @Then("^I verify that BookNow button is clickable$")
	    public void i_verify_that_booknow_button_is_clickable() throws Throwable {
	   // 	Thread.sleep(1000);
	        Assert.assertTrue(joinNowPO.verify_BookNowButtonClickable());
	    }
	    
	    @Then("^I verify that YourPlan Page Opens$")
	    public void i_verify_that_yourplan_page_opens() throws Throwable {
	  //  	Thread.sleep(3000);
	    	Assert.assertTrue(joinNowPO.verify_YourPlanPageOpens());
	    }
	    
	    @When("^I click on Right or left Arrow$")
	    public void i_click_on_right_arrow() throws Throwable {
	  //  	Thread.sleep(3000);
	        joinNowPO.clickRight_leftArrow();
	    }

	    @Then("^I verfiy that i am able to see the Next Plan$")
	    public void i_verfiy_that_i_am_able_to_see_the_next_plan() throws Throwable {
	//    	Thread.sleep(1000);
	    	Assert.assertTrue(joinNowPO.verify_RightArrowClick());
	    }


	    @When("^I verify popup for 215Plan and click on GetPlan Button$")
	    public void i_verify_popup_for_215plan_and_click_on_getplan_button() throws Throwable {
	    	joinNowPO.click_GetPlanBtn();
	//    	Thread.sleep(2000);
	    }


	    @Then("^I verify for the Eligibility page$")
	    public void i_verify_for_the_eligibility_page() throws Throwable {
	//    	Thread.sleep(4000);
	        Assert.assertTrue(joinNowPO.verify_EligibilityPage());
	    }
	    
	    @When("^I verify popup for 215Plan and click on CreateAPlan Popup$")
	    public void i_verify_popup_for_215plan_and_click_on_createaplan_popup() throws Throwable {
	        joinNowPO.click_CreatePlan();
	    }

	    @Then("^I verify that I am On create a plan popup$")
	    public void i_verify_that_i_am_on_create_a_plan_popup() throws Throwable {
	//    	 Thread.sleep(2000);
	    	 Assert.assertTrue(joinNowPO.verify_CreatePlanPopUp());
	    }
	    
	    @When("^I Select Any National plan$")
	    public void i_select_any_national_plan() throws Throwable {
	        joinNowPO.selectNationalPlan();
	    }

	    @Then("^I verify I have selected national plan$")
	    public void i_verify_i_have_selected_national_plan() throws Throwable {
	   // 	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_SelectedNatPlan());
	    }
	    
	    @When("^I click on Your Number dropdown$")
	    public void i_click_on_your_number_dropdown() throws Throwable {
	  //  	Thread.sleep(2000);
	        joinNowPO.click_NumberDropdwn();
	    }

	    @Then("^I verify that i am able to see the number$")
	    public void i_verify_that_i_am_able_to_see_the_number() throws Throwable {
	  //  	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_NumberVisibleInDrpdwn());
	    }
	    
	    @When("^I Select Any Data Plan$")
	    public void i_select_any_data_plan() throws Throwable {
	       joinNowPO.selectDataPlan();
	    }

	    @Then("^I verify I have selected Data plan$")
	    public void i_verify_i_have_selected_data_plan() throws Throwable {
	 //   	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_SelectedDataPlan());
	    }

	    @When("^I Select Any National Plan and Data plan and click on Get Plan button$")
	    public void i_select_any_national_plan_and_data_plan_and_click_on_get_plan_button() throws Throwable {
	 //   	Thread.sleep(2000);
	        joinNowPO.selectGetPlan_OnCreatePopup();
	    }
	    
	    @When("^I click on Package Card button$")
	    public void i_click_on_package_card_button() throws Throwable {
	        joinNowPO.click_PackageCard();
	    }

	    @Then("^I verify that Package card button is clickable$")
	    public void i_verify_that_package_card_button_is_clickable() throws Throwable {
	//    	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_PackageButtonClickable());
	    }
	    
	    @Then("^I verify that the file opened is of Pdf type$")
	    public void i_verify_that_the_file_opened_is_of_pdf_type() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_PackagePdfFileTitle());
	    }
	    
	    @When("^I click on Package Card button on Plan Page$")
	    public void i_click_on_package_card_button_on_plan_page() throws Throwable {
	       joinNowPO.click_PackageButton();
	    }
	    
	    @Then("^I verify that the file opened is of Pdf format$")
	    public void i_verify_that_the_file_opened_is_of_pdf_format() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_PackagePdfFileTitle());
	    }
        
	    @When("^I verify popup for 70Plan and click on GetPlan Button$")
	    public void i_verify_popup_for_70plan_and_click_on_getplan_button() throws Throwable {
	 //   	Thread.sleep(2000);
	        joinNowPO.clickGetPlan_on70PlanPopup();
	    }
	    

	    @When("^I click on ID dropdown$")
	    public void i_click_on_id_dropdown() throws Throwable {
	       joinNowPO.click_IDDropDown("Iqama");
	    }

	    @Then("^I verify That i am able to get different options$")
	    public void i_verify_that_i_am_able_to_get_different_options() throws Throwable {
	 //   	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_IDDropdown());
	    }
	    
	    @Then("^I verify that IdNumber,Nationality and Your city in KSA is displayed$")
	    public void i_verify_that_idnumbernationality_and_your_city_in_ksa_is_displayed() throws Throwable {
	 //   	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_IdNum_Nationality_City_FieldsAreDisplayed());
	    }
	    
	/*    @When("^I Select ID,Nationality, City and Enter invalid ID Number$")
	    public void i_select_idnationality_city_and_enter_invalid_id_number() throws Throwable {
	      joinNowPO.enterInvalid_IDNum_Nationality_ID_City("Iqama", "5553qdfrf", "Answer", " Ha'il");
	    }                 */
	    
	    @When("^I Select \"([^\"]*)\" in ID, Enter invalid \"([^\"]*)\" in ID_Number, \"([^\"]*)\" in Nationality and \"([^\"]*)\" in City$")
	    public void i_select_something_in_id_enter_invalid_something_in_idnumber_something_in_nationality_and_something_in_city(String ID, String ID_Number, String Nationality, String City) throws Throwable {
	    	joinNowPO.enterIDNum_Nationality_ID_City(ID,ID_Number,Nationality,City);
	    }

	    @Then("^I Verify that i redirected to Sorry page$")
	    public void i_verify_that_i_redirected_to_sorry_page() throws Throwable {
	 //   	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_SorryPage());
	    }

	    @And("^click on Check button$")
	    public void click_on_check_button() throws Throwable {
	        joinNowPO.click_CheckBox();
	    	
        }
	    
	    @When("^I click on ReEnter my Info Button$")
	    public void i_click_on_reenter_my_info_button() throws Throwable {
	    	Thread.sleep(2000);
	        joinNowPO.click_ReEnterButton();
	    }

	    @When("^I Select \"([^\"]*)\" in ID, Enter valid \"([^\"]*)\" in ID_Number, \"([^\"]*)\" in Nationality and \"([^\"]*)\" in City$")
	    public void i_select_something_in_id_enter_valid_something_in_idnumber_something_in_nationality_and_something_in_city(String ID, String ID_Number, String Nationality, String City) throws Throwable {
	        joinNowPO.enterIDNum_Nationality_ID_City(ID, ID_Number, Nationality, City);
	    }

	    @Then("^I Verify that i redirected to Congratulations page$")
	    public void i_verify_that_i_redirected_to_congratulations_page() throws Throwable {
	  //  	Thread.sleep(6000);
	    	Assert.assertTrue(joinNowPO.verify_CongratulationPage());
	    }
        
	    @When("^I Click on Continue button$")
	    public void i_click_on_continue_button() throws Throwable {
	//    	Thread.sleep(2000);
	        joinNowPO.click_ContinueButton();
	    }

	    @Then("^I verify that i Redirected to Create Account Page$")
	    public void i_verify_that_i_redirected_to_create_account_page() throws Throwable {
	 //   	Thread.sleep(3000);
	    	Assert.assertTrue(joinNowPO.verify_CreateAccountPage());
	    }
	    
	    @Then("^I verify that social media links are same as before clicking on link$")
	    public void i_verify_that_social_media_links_are_same_as_before_clicking_on_link() throws Throwable {
	//    	Thread.sleep(4000);
	    	Assert.assertTrue(joinNowPO.verify_SocialMediaLink()); 
	    }
	    
	    @When("^I Enter \"([^\"]*)\" in email and \"([^\"]*)\" in password and select agree check box$")
	    public void i_enter_something_in_email_and_something_in_password_and_select_agree_check_box(String email , String password) throws Throwable {
	        joinNowPO.enter_EmailPassword(email,password);
	    }

	    @Then("^I verify that I Redirect to error message$")
	    public void i_verify_that_i_redirect_to_error_message() throws Throwable {
	//    	Thread.sleep(4000);
	    	Assert.assertTrue(joinNowPO.verify_errorPageOnCreateAccount()); 
	    }

	    @And("^I click on Create account button$")
	    public void i_click_on_create_account_button() throws Throwable {
	//    	Thread.sleep(4000);
	    	Assert.assertTrue(joinNowPO.click_CreateAccount()); 
	    }
	    
	    @Then("^I verify that I Redirect to Absher Login page$")
	    public void i_verify_that_i_redirect_to_absher_login_page() throws Throwable {
	//    	Thread.sleep(4000);
	    	Assert.assertTrue(joinNowPO.verify_AbsherLogin());
	    }
	    
	    @And("^I veriy I am able to scroll up and down the page$")
	    public void i_veriy_i_am_able_to_scroll_up_and_down_the_page() throws Throwable {
	    	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_ScrollUp_ScrollDown());
	    }
	    
	    @When("^I click on Absher Login button$")
	    public void i_click_on_absher_login_button() throws Throwable {
	        joinNowPO.click_AbsherLogin();
	    }

	    @Then("^I redirect to Login to Sp section$")
	    public void i_redirect_to_login_to_sp_section() throws Throwable {
	 //   	Thread.sleep(3000);
	    	Assert.assertTrue(joinNowPO.verify_LpSectionpage());
	    }
        
	    @When("^I Click on Return Dummy IAM token$")
	    public void i_click_on_return_dummy_iam_token() throws Throwable {
	       joinNowPO.click_DummyIAMToken();
	    }

	    @Then("^I verify That I redirect to Getting your Sim Page$")
	    public void i_verify_that_i_redirect_to_getting_your_sim_page() throws Throwable {
	    	Thread.sleep(4000);
	    	Assert.assertTrue(joinNowPO.verify_GettingSimpage());
	    }
	    
	    @And("^I verify that virgin sim checbox is clickable$")
	    public void i_verify_that_virgin_sim_checbox_is_clickable() throws Throwable {
	    	Thread.sleep(2000);
	    	Assert.assertTrue(joinNowPO.verify_VirginCheckboxclickable());
	    }
	    
	    @When("^I Enter \"([^\"]*)\" in textfield$")
	    public void i_enter_something_in_textfield(String Number) throws Throwable {
	        joinNowPO.enter_NumberinSimField(Number);
	    }

	    @Then("^I verify That i redirect to next page$")
	    public void i_verify_that_i_redirect_to_next_page() throws Throwable {
	    	Thread.sleep(3000);
	    	Assert.assertTrue(joinNowPO.verify_NextPageAfterSim());
	    }

	    @And("^click on Continue button$")
	    public void click_on_continue_button() throws Throwable {
	    	Thread.sleep(2000);
	        Assert.assertTrue(joinNowPO.click_continueButton());
	    }

	    @And("^I click on try again button and i redirect back to get sim page$")
	    public void i_click_on_try_again_button_and_i_redirect_back_to_get_sim_page() throws Throwable {
	    	Thread.sleep(4000);
	        Assert.assertTrue(joinNowPO.click_TryAgain());
	    }
	    
	    @When("^I select eSim Checkbox$")
	    public void i_select_esim_checkbox() throws Throwable {
	        joinNowPO.click_eSimCheckbox();
	    }
	    
	    @Then("^I redirect to Card detail page$")
	    public void i_redirect_to_card_detail_page() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_cardDetailPage());
	    }
	    

	    @When("^I Enter \"([^\"]*)\" in card, \"([^\"]*)\" in cardName, \"([^\"]*)\" in expiry and \"([^\"]*)\" in CVV$")
	    public void i_enter_something_in_card_something_in_cardname_something_in_expiry_and_something_in_cvv(String card, String cardName, String expiry, String CVV) throws Throwable {
	        joinNowPO.enter_CardDetails(card, cardName, expiry, CVV);
	    }

	    @Then("^I verify that done button is not enabled$")
	    public void i_verify_that_done_button_is_not_enabled() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_visibilityForDONEButton());
	    }
	    
	    @Then("^I verify that i redrected to ACS Emulator page$")
	    public void i_verify_that_i_redrected_to_acs_emulator_page() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_ACSEmulatorpage());
	    }

	    @And("^I click on Done button$")
	    public void i_click_on_done_button() throws Throwable {
	        joinNowPO.click_DonebuttonInCardPage();
	    }
	    

	    @When("^I try to hit back button on browser$")
	    public void i_try_to_hit_back_button_on_browser() throws Throwable {
	        joinNowPO.click_backbuttononBrowser();
	    }
	    
	    @And("^I verify that I get redirected to success page after click on submit button$")
	    public void i_verify_that_i_get_redirected_to_success_page_after_click_on_submit_button() throws Throwable {
	    	Assert.assertTrue(joinNowPO.verify_SuccessPageAfterACSEmu());
	    }
	    
	    @When("^I select Get me sim delivered Checkbox$")
	    public void i_select_get_me_sim_delivered_checkbox() throws Throwable {
	        joinNowPO.click_GetSimDelivered();
	    }
	    @When("^I click on JoinNow link in Mobile$")
	    public void i_click_on_joinnow_link_in_mobile() throws Throwable {
	    	joinNowPO.JoinNowMobileClick();
	    }

	    

 }
