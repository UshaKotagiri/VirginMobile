package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Navigation;

import com.virginweb.helper.Helper;
import com.virginweb.home.po.TopupPO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TopUpStepDefinition extends StepDefinitionInit {

	

	    @When("^I click on the top up tab$")
	    public void i_click_on_the_top_up_tab() throws Throwable {
	    	Thread.sleep(5000);
            topupPO.clickonQuickTopUp();
				System.out.println("checkin");
	    }
	
	 @When("^I see different page$")
	    public void i_see_different_page() throws Throwable {
		 Thread.sleep(5000);
	     System.out.println("Next step");
	    }
	 @When("^the page is scrollable$")
	    public void the_page_is_scrollable() throws Throwable {
	       Helper.scrollDown(); 
	        Thread.sleep(1000);  
	 }
	 @Then("^I change the language$")
	    public void i_change_the_language() throws Throwable {
		 Thread.sleep(2000);
	   Assert.assertTrue(topupPO.changeLanguage()); 
	    }
	 @Then("^I click in close$")
	    public void i_click_in_close() throws Throwable {
	       Assert.assertTrue(topupPO.clickOnClose()); 
	    }
	 @Then("^I click on the number tab$")
	    public void i_click_on_the_number_tab() throws Throwable {
		 Thread.sleep(2000);
	        Assert.assertTrue(topupPO.clickOnNumber());
	    }
	  @When("^Enter the invalid number$")
	    public void enter_the_invalid_number() throws Throwable {
		  topupPO.enterNumber();
		  Thread.sleep(1000);
	    }
	  @Then("^I verify to get error message$")
	    public void i_verify_to_get_error_message() throws Throwable {
		 Assert.assertTrue(topupPO.verifyErrorMessage());
	    }
	  
	  @When("^Enter a valid number$")
	    public void enter_a_valid_number() throws Throwable {
		  topupPO.enterCorrectNumber();
		  Thread.sleep(1000);
	    }
	  @Then("^I verify no error message is found$")
	  public void i_verify_no_error_message_is_found() throws Throwable {
		  Assert.assertFalse(topupPO.noerrormessage());  
	  }
	  @Then("^no error message is found$")
	    public void no_error_message_is_found() throws Throwable {
	     Assert.assertTrue(topupPO.noerrormessage());  
	    }
	  @Then("^I verify payment gateway is clickabble$")
	    public void i_verify_payment_gateway_is_clickabble() throws Throwable {
		  Thread.sleep(5000);
		  Helper.scrollDown();
	     Assert.assertTrue(topupPO.paymentGatewayclick());
	    }
	  @When("^click on dropdown$")
	    public void click_on_dropdown() throws Throwable {
	        topupPO.clickOnDropdown();
	        Thread.sleep(1000);
	    }
	  @Then("^select from dropdown$")
	    public void select_from_dropdown() throws Throwable {
	       Assert.assertTrue(topupPO.dropdownSelect()); 
	        Thread.sleep(1000);
	    }
	  @When("^I click on the payment button$")
	    public void i_click_on_the_payment_button() throws Throwable {
		  Thread.sleep(1000);
		  Helper.scrollDown();
	        topupPO.clickonPaymentButton();
	        Thread.sleep(2000);
	    }
	  @When("^I Enter incorrect card details$")
	    public void i_enter_incorrect_card_details() throws Throwable {
	        Thread.sleep(1000);
	        topupPO.incorrectCardDetails();
	    }

	    @And("^I verify that submit button is not enabled$")
	    public void i_verify_that_submit_button_is_not_enabled() throws Throwable {
	        Assert.assertTrue(topupPO.buttonNotEnabled());
	    }
	    @When("^I Enter correct card details$")
	    public void i_enter_correct_card_details() throws Throwable {
	     	topupPO.correctCardDetails();
	    }
	    @Then("^I verify that submit button is enabled$")
	    public void i_verify_that_submit_button_is_enabled() throws Throwable {
	     Assert.assertTrue(topupPO.submitButtonEnabled());
	    }
	    @When("^I click on submit button$")
	    public void i_click_on_submit_button() throws Throwable {
	    	waitForPageLoaded();
	    	Thread.sleep(10000);
	        topupPO.clickonPaymentButton2();
	    }
	    @Then("^It is redirected to ACS Emulator page$")
	    public void it_is_redirected_to_acs_emulator_page() throws Throwable {
	    	waitForPageLoaded();
	    	Thread.sleep(35000);
	       Assert.assertTrue(topupPO.acsSubmitButtion());
	    }
	    @When("^I click on ACS submit button$")
	    public void i_click_on_acs_submit_button() throws Throwable {
	    	Thread.sleep(35000);
	   	topupPO.clickonacssubmit();
	    }

	    @Then("^I see the home button$")
	    public void i_see_the_home_button() throws Throwable {
	       Assert.assertTrue(topupPO.Homeenabled());
	    }
	    @When("^I click on home Button$")
	    public void i_click_on_home_button() throws Throwable {
	      topupPO.clickhomeButton();
	      Thread.sleep(2000);
	    }
	    @When("^I change the language to english$")
	    public void i_change_the_language_to_english() throws Throwable {
	        topupPO.changeToEnglish();
	    }
	    @When("^I click on Hamburger button$")
	    public void i_click_on_hamburger_button() throws Throwable {
	        topupPO.hamburgerClick();
	    }
	    @When("^I click on Home$")
	    public void i_click_on_home() throws Throwable {
	    	Thread.sleep(2000);
	        topupPO.clickonHome();
	    }
	    @Then("^I get redirected to home$")
	    public void i_get_redirected_to_home() throws Throwable {
	    	Assert.assertTrue(topupPO.homepageRedirected());
	    }
	    @When("^I click on back2 button$")
	    public void i_click_on_back_button() throws Throwable {
	    	Thread.sleep(3000);
	        topupPO.clickBack();	        
	    }
	    @When("^I click on Plan and products in hamburger$")
	    public void i_click_on_plan_and_products_in_hamburger() throws Throwable {
	        topupPO.PlanandproductsInHamburger();
	    }
	    @Then("^The user is able to see other options$")
	    public void the_user_is_able_to_see_other_options() throws Throwable {
	    	Thread.sleep(4000);
	        Assert.assertTrue(topupPO.otherOptionsDisplayed());
	    }
	    @When("^I click on Plan and products in hamburger again$")
	    public void i_click_on_Plan_and_products_in_hamburger_again() throws Throwable {
	    	topupPO.PlanandproductsInHamburger1();
	    }

	    @Then("^The user is able to disable other options$")
	    public void the_user_is_able_to_disable_other_options() throws Throwable {
	    	Thread.sleep(2000);
	        Assert.assertTrue(topupPO.planandproductDisable());
	    }
	    
	    @When("^I click on plans in hamburger$")
	    public void i_click_on_plans_in_hamburger() throws Throwable {
	    	Thread.sleep(2000);
	    	topupPO.PlanInHamburger1();
	    }
	   
	    @Then("^It gets back to top up page$")
	    public void it_gets_back_to_top_up_page() throws Throwable {
	       Assert.assertTrue(topupPO.backtotopUp());
	    }
	    @Then("^It gets redirected to plans page$")
	    public void it_gets_redirected_to_plans_page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	Assert.assertTrue(topupPO.redirectToPlan());
	    }
	    
	    @When("^I click on other options in hamburger$")
	    public void i_click_on_other_options_in_hamburger() throws Throwable {
	       topupPO.ClickOtherOptionsInHam();
	    }
	    @Then("^It gets redirected to other options page$")
	    public void it_gets_redirected_to_other_options_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttoOtherOffers());
	    }
	    @When("^I click on international rates options in hamburger$")
	    public void i_click_on_international_rates_options_in_hamburger() throws Throwable {
	        topupPO.InternationalratesInHamburger1();
	    }
	    @Then("^It gets redirected to other international rate page$")
	    public void it_gets_redirected_to_other_international_rate_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttoInternationalRates());
	    }
	    @When("^I click on international roaming options in hamburger$")
	    public void i_click_on_international_roaming_options_in_hamburger() throws Throwable {
	        topupPO.InternationalroamInHamburger1();
	    }
	    @Then("^It gets redirected to other international roaming page$")
	    public void it_gets_redirected_to_other_international_roaming_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttointernationalRoam());
	    }
	    @When("^I click on Family tag options in hamburger$")
	    public void i_click_on_family_tag_options_in_hamburger() throws Throwable {
	        topupPO.FamilytagHam();
	    }
	    @Then("^It gets redirected to other Family Tag page$")
	    public void it_gets_redirected_to_other_family_tag_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttoFamily());
	    }
	    @When("^I click on Frendi options in hamburger$")
	    public void i_click_on_frendi_options_in_hamburger() throws Throwable {
	        topupPO.frendiHam();
	    }
	    @Then("^It gets redirected to other Frendi Tag page$")
	    public void it_gets_redirected_to_other_frendi_tag_page() throws Throwable {
	       Assert.assertTrue(topupPO.redirectoFrendi());
	    }
	    @When("^I click on why virginmobile in hamburger$")
	    public void i_click_on_why_virginmobile_in_hamburger() throws Throwable {
	        topupPO.whyvirginmobHam();
	    }
	    @Then("^It gets redirected to other why virgin mobile Tag page$")
	    public void it_gets_redirected_to_other_why_virgin_mobile_tag_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttoWhyVirginMob());	  
	        }
//	    @When("^I click on help and support in hamburger$")
//	    public void i_click_on_help_and_support_in_hamburger() throws Throwable {
//	        topupPO.clickOnHelpHam();
//	    }
	    @When("^I click on FAQ$")
	    public void i_click_on_faq() throws Throwable {
	        topupPO.clickonFAQham();
	    }
	    @Then("^It get redirected to FAQ page$")
	    public void it_get_redirected_to_faq_page() throws Throwable {
	      Assert.assertTrue(topupPO.redirectedtofaq());  
}
	    @When("^I click on contact us option$")
	    public void i_click_on_contact_us_option() throws Throwable {
	        topupPO.clickonContactusham();
	    }
	    @Then("^It get redirected to contact us page$")
	    public void it_get_redirected_to_contact_us_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirecttoContact());
	    }
	    @When("^I click on find a store option$")
	    public void i_click_on_find_a_store_option() throws Throwable {
	        topupPO.clickOnFindStore();
	    }
	    @Then("^It get redirected to find a store page$")
	    public void it_get_redirected_to_find_a_store_page() throws Throwable {
	        Assert.assertTrue(topupPO.redirectToFindstore());
	    }
	    @Then("^I validiate text in dropdown$")
	    public void i_validiate_text_in_dropdown() throws Throwable {
	       Assert.assertTrue(topupPO.validiatedropdownText());
	    }
	    @Then("^I click on Not right Number$")
	    public void i_click_on_not_right_number() throws Throwable {
	        topupPO.clickonNotRightNumber();
	    }
	    @When("^Enter a valid number which is not in use$")
	    public void enter_a_valid_number_which_is_not_in_use() throws Throwable {
	        topupPO.enterNmberNotInUse();
	    }
	    @And("^I verify payment gateway is not clickabble$")
	    public void i_verify_payment_gateway_is_not_clickabble() throws Throwable {
	        Assert.assertTrue(topupPO.buttonnotclickable());
	    }
	    @When("^I click on help and support in hamburger$")
	    public void i_click_on_help_and_support_in_hamburger() throws Throwable {
	        topupPO.HelpHamburgerClick();
	    }
	    @When("^I Click on hamburger in mob$")
	    public void i_click_on_hamburger_in_mob() throws Throwable {
	    	topupPO.HamburgerClick();
	    }
	    @When("^I click on the top up tab in mob$")
	    public void i_click_on_the_top_up_tab_in_mob() throws Throwable {
	    	topupPO.topUpMobClick();
	    }
	    @When("^the page is scrollable in mob$")
	    public void the_page_is_scrollable_in_mob() throws Throwable {
	    	topupPO.scrollMobClick();
	    }
	    @Then("^I click on the number tab in mob$")
	    public void i_click_on_the_number_tab_in_mob() throws Throwable {
	       Assert.assertTrue(topupPO.ClickonNumberMob());
	    }
	    @When("^Enter a valid number in mob$")
	    public void enter_a_valid_number_in_mob() throws Throwable {
	    	topupPO.EnterNumberMob();
	    }
	    @When("^click on dropdown in mob$")
	    public void click_on_dropdown_in_mob() throws Throwable {
	       topupPO.ClickDropdownMob();
	    }
	    @Then("^select from dropdown in mob$")
	    public void select_from_dropdown_in_mob() throws Throwable {
	    	Assert.assertTrue(topupPO.SelectDropDownMob());
	    }
	    @And("^I verify payment gateway is clickabble in mob$")
	    public void i_verify_payment_gateway_is_clickabble_in_mob() throws Throwable {
	    	Assert.assertTrue(topupPO.validiatesubmitMob());
	    }
	    @When("^I click on the payment button in mob$")
	    public void i_click_on_the_payment_button_in_mob() throws Throwable {
	    	topupPO.ClickMobSubmit();
	    }
	    @When("^I Enter correct card details in mob$")
	    public void i_enter_correct_card_details_in_mob() throws Throwable {
	    	topupPO.ClickEnterMobDetails();
	    }
	    @When("^I click on submit button in mob$")
	    public void i_click_on_submit_button_in_mob() throws Throwable {
	    	topupPO.SubmitFinalmob();
	    }
	    @When("^I click on ACS submit button in mob$")
	    public void i_click_on_acs_submit_button_in_mob() throws Throwable {
	    	topupPO.SubmitACSMob();
	    }
	    @Then("^I see the home button in mob$")
	    public void i_see_the_home_button_in_mob() throws Throwable {
	    	Assert.assertTrue(topupPO.validiateHomeMob());
	    }
	    @When("^I click on home Button in mob$")
	    public void i_click_on_home_button_in_mob() throws Throwable {
	    	topupPO.HomeClickMOb();
	    }
	    @When("^I change the language in mob$")
	    public void i_change_the_language_in_mob() throws Throwable {
	    	topupPO.LanguageChangeMob();
	    }
	    @Then("^I verify the options below$")
	    public void i_verify_the_options_below() throws Throwable {
	    	Assert.assertTrue(topupPO.validiateOptions());
	    }
	    @Then("^Click on change language in hamburger$")
	    public void click_on_change_language_in_hamburger() throws Throwable {
	    	Assert.assertTrue(topupPO.changeLnguageham());
	    }
	    @Then("^I verify code is mentioned on the tab$")
	    public void i_verify_code_is_mentioned_on_the_tab() throws Throwable {
	    	Assert.assertTrue(topupPO.codeVerification());
	    }
	    @Then("^I verify there is a MSIDN field displayed$")
	    public void i_verify_there_is_a_msidn_field_displayed() throws Throwable {
	    	Assert.assertTrue(topupPO.MSIDNdisplayed());
	    }
	    @Then("^I verify it is redirected to the payment screen$")
	    public void i_verify_it_is_redirected_to_the_payment_screen() throws Throwable {
	    	Assert.assertTrue(topupPO.PaymentscreenVerify());
	    }
	    @Then("^I verify it is redirected to the homeButton page$")
	    public void i_verify_it_is_redirected_to_the_homebutton_page() throws Throwable {
	    	Assert.assertTrue(topupPO.VerifyHomeBtnPage());
	    }
	    @Then("^I verify the success message$")
	    public void i_verify_the_success_message() throws Throwable {
	    	Assert.assertTrue(topupPO.verifySuccessmsg());
	    }
	    @Then("^I verify the FAQ option in help and support$")
	    public void i_verify_the_faq_option_in_help_and_support() throws Throwable {
	    	Assert.assertTrue(topupPO.verifyHelpandSupportClick());
	    }
	    @Then("^I verify ACS Emulator page$")
	    public void i_verify_acs_emulator_page() throws Throwable {
	    	Assert.assertTrue(topupPO.VerifyACSEmulatorPage());
	    }
	    @When("^I click on the top up tab in Mobile Page$")
	    public void i_click_on_the_top_up_tab_in_mobile_page() throws Throwable {
	    	topupPO.topUpMobClick();
	    	}
	


}