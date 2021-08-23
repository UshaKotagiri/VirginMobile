package com.virginweb.stepdefinitions;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Web_PlanAndProductStepDef extends StepDefinitionInit {

	@When("^I click on Other offers under Plan and Product$")
    public void i_click_on_other_offers_under_plan_and_product() throws Throwable {
       web_PlanAndProductPO.click_OtherOffer();
    }
	
	 @Then("^I verify the Data Bundles is available$")
	    public void i_verify_the_data_bundles_is_available() throws Throwable {
		  Assert.assertTrue(web_PlanAndProductPO.verifyDataBundles());
   }
	 
	 @Then("^I verify the premium package $")
	    public void i_verify_the_premium_package() throws Throwable {
		 Assert.assertTrue(web_PlanAndProductPO.verifyPremiumPackage());
   }

    @Then("^I verify that I get redirected to Other Offer$")
    public void i_verify_that_i_get_redirected_to_other_offer() throws Throwable {
        Assert.assertTrue(web_PlanAndProductPO.verify_OtherOffer());
    }
	
    @When("^I scroll the page_Up and Down$")
    public void i_scroll_the_pageup_and_down() throws Throwable {
        web_PlanAndProductPO.scroll_PageUpPageDown();
    }
    
    @Then("^I verify that I verify that Prepaid button is selected ByDefault$")
    public void i_verify_that_i_verify_that_prepaid_button_is_selected_bydefault() throws Throwable {
    	 Assert.assertTrue(web_PlanAndProductPO.verify_PrepaidBtnIsSelected());
    }
    
    @When("^I click on PostPaid button$")
    public void i_click_on_postpaid_button() throws Throwable {
    	web_PlanAndProductPO.click_Postpaid();
    }

    @Then("^I verify That I am able to view Postpaid details$")
    public void i_verify_that_i_am_able_to_view_postpaid_details() throws Throwable {
    	Thread.sleep(1000);
    	Assert.assertTrue(web_PlanAndProductPO.verify_PostPaidDetails());
    }


    @When("^I click PackageCard_Button$")
    public void i_click_packagecardbutton() throws Throwable {
    	web_PlanAndProductPO.click_Package_Btn();
    }

    @Then("^I verify That i redirected to PDF image on next tab$")
    public void i_verify_that_i_redirected_to_pdf_image_on_next_tab() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_PackagePdf());
    }
    
    @When("^I Press Browser back button$")
    public void i_press_browser_back_button() throws Throwable {
    	web_PlanAndProductPO.click_BackBrowser();
    }

    @Then("^I verify that i redirected back to Homepage$")
    public void i_verify_that_i_redirected_back_to_homepage() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_Home());
    }
    
    @When("^I click on International_Rates under Plan and Product$")
    public void i_click_on_internationalrates_under_plan_and_product() throws Throwable {
    	web_PlanAndProductPO.click_InternationalRate();
    }

    @Then("^I verify that I get redirected to International_Rates$")
    public void i_verify_that_i_get_redirected_to_internationalrates() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_InternationalRatePage());
    }


    @When("^I click on Select_Country Dropdown$")
    public void i_click_on_selectcountry_dropdown() throws Throwable {
    	web_PlanAndProductPO.click_CountryDropDwn();
    }

    @Then("^I verify that I am able to select fromt he dropdown$")
    public void i_verify_that_i_am_able_to_select_fromt_he_dropdown() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_CountryDropdwn());
    }
    
    @And("^I verify That local SMS and Call Fields are populated$")
    public void i_verify_that_local_sms_and_call_fields_are_populated() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_LocalSMS_Calls());
    }
    
    @Given("^I have updated case under Test Rail \"([^\"]*)\"$")
    public void i_have_updated_case_under_test_rail_something(String testCaseID) throws Throwable {
    	PropFileHandler.writeToFile("testCaseID", testCaseID);
    }
    

    @When("^I click on International_Roaming under Plan and Product$")
    public void i_click_on_internationalroaming_under_plan_and_product() throws Throwable {
    	web_PlanAndProductPO.click_InternationalRoaming();
    }

    @Then("^I verify that I get redirected to International_Roaming$")
    public void i_verify_that_i_get_redirected_to_internationalroaming() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_InternationalRoamingPage());
    }
    
    @And("^I verify That I am able to view Local Call_SMS_fields$")
    public void i_verify_that_i_am_able_to_view_local_callsmsfields() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_LocalSMSCalls());
    }
    
    @When("^I click on Family_TagDevice under Plan and Product$")
    public void i_click_on_familytagdevice_under_plan_and_product() throws Throwable {
    	web_PlanAndProductPO.click_FamilyTagDevice();
    }

    @Then("^I verify that I get redirected to Family_TagDevice$")
    public void i_verify_that_i_get_redirected_to_familytagdevice() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_FamilyTagDevice());
    }
    
    @When("^I Click on Download App$")
    public void i_click_on_download_app() throws Throwable {
    	web_PlanAndProductPO.click_DownloadApp();
    }

    @Then("^I verify That I redirected to Download App Page$")
    public void i_verify_that_i_redirected_to_download_app_page() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_DownloadPage());
    }
    
    @When("^I Click on Join_now$")
    public void i_click_on_joinnow() throws Throwable {
    	web_PlanAndProductPO.click_Join_Now();
    }

    @Then("^I verify That I redirected to Join_Now Page$")
    public void i_verify_that_i_redirected_to_joinnow_page() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_Join_Now());
    }
    
    @When("^I click on Friendi package under Plan and Product$")
    public void i_click_on_friendi_package_under_plan_and_product() throws Throwable {
    	web_PlanAndProductPO.click_FriendiPack();
    }

    @Then("^I verify that I get redirected to Friendi package$")
    public void i_verify_that_i_get_redirected_to_friendi_package() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_FriendiPackPage());
    }
    
    @When("^I click on Select_Country1 Dropdown$")
    public void i_click_on_selectcountry1_dropdown() throws Throwable {
    	web_PlanAndProductPO.click_CountryDropDwn1();
    }

    @Then("^I verify that I am able to select fromt the dropdown$")
    public void i_verify_that_i_am_able_to_select_fromt_the_dropdown() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_CountryDropdwn1());
    }

    
    @And("^I verify that FriendiButton is selected By default$")
    public void i_verify_that_friendibutton_is_selected_by_default() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_FrindyButtonSelected());
    }
    

    @When("^I click on data_button$")
    public void i_click_on_data_button() throws Throwable {
    	web_PlanAndProductPO.click_DataButton();
    }

    @Then("^I verify that data details are displayed$")
    public void i_verify_that_data_details_are_displayed() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_DataDetailPage());
    }

    @When("^I click on Package$")
    public void i_click_on_package() throws Throwable {
    	web_PlanAndProductPO.click_PackageButton1();
    }

    @When("^I click on Package11$")
    public void i_click_on_package11() throws Throwable {
    	web_PlanAndProductPO.click_PackageButton11();
    }
    
    @Then("^I verify that Package is clickable$")
    public void i_verify_that_package_is_clickable() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_PackageBtnClickableNew());
    }
    
    @Then("^I verify that Package open PDF page$")
    public void i_verify_that_package_open_pdf_page() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_PackagePdfFileNew());
    }
    
    @When("^I click on Call button$")
    public void i_click_on_call_button() throws Throwable {
    	web_PlanAndProductPO.click_CallButton();
    }

    @Then("^I verify that I navigate to Call detail page$")
    public void i_verify_that_i_navigate_to_call_detail_page() throws Throwable {
    	Assert.assertTrue(web_PlanAndProductPO.verify_CallDetail());
    }
    
    @When("^I scroll page down$")
    public void i_scroll_page_down() throws Throwable {
    	web_PlanAndProductPO.scroll_downPage();
    }

}
