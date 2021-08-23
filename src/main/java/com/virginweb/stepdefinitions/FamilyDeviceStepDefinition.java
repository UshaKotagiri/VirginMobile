package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;

import com.virginweb.utils.PropFileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FamilyDeviceStepDefinition extends StepDefinitionInit {

	@When("^I click on Planproduct$")
    public void i_click_on_planproduct() throws Throwable {
		Thread.sleep(3000);
        familytagPO.clickplanproduct();
    }
	@When("^I click on Family1 tag$")
    public void i_click_on_family1_tag() throws Throwable {
        familytagPO.clickFamily();
    }
	@Then("^I scroll down the page$")
    public void i_scroll_down_the_page() throws Throwable {
        Assert.assertTrue(familytagPO.scrolldownthepage());
    }
	@When("^I click on download app$")
    public void i_click_on_download_app() throws Throwable {
        familytagPO.ClickonDownload();
    }
	@Then("^It redirect to download app page$")
    public void it_redirect_to_download_app_page() throws Throwable {
		Assert.assertTrue(familytagPO.redirecttodownload());
    }
	 @When("^I go back page$")
	    public void i_go_back_page() throws Throwable {
		 familytagPO.clickbackjoin(); 
	    }
	 @When("^I click on join us tab in the page$")
	    public void i_click_on_join_us_tab_in_the_page() throws Throwable {
		 familytagPO.Clickonjoin();
	    }
	 @Then("^It redirect to join us app page$")
	    public void it_redirect_to_join_us_app_page() throws Throwable {
		 Thread.sleep(3000);
		 Assert.assertTrue(familytagPO.redirecttojoin());
	    }
	 @Then("^I verify the banner$")
	    public void i_verify_the_banner() throws Throwable {
		 Assert.assertTrue(familytagPO.BannerFamilyDevice());
	    }
	 @Then("^I verify the image present in the banner$")
	    public void i_verify_the_image_present_in_the_banner() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilyImageVerify());

	    }
	 @Then("^I verify the text present in the tab$")
	    public void i_verify_the_text_present_in_the_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilyTextVerify());
	    }
	 @Then("^I verify the Basic plan section$")
	    public void i_verify_the_basic_plan_section() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilyPlanVerify());
	    }
	 @Then("^I verify thw what it is for section$")
	    public void i_verify_thw_what_it_is_for_section() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerify());
	    }
	 @When("^I click on download tab in the page$")
	    public void i_click_on_download_tab_in_the_page() throws Throwable {
		 familytagPO.DownloadAppMob();
	    }
	 @Then("^I verify Download tab$")
	    public void i_verify_download_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifyDownload());
	    }
	 @Then("^I verify join now tab$")
	    public void i_verify_join_now_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifyJoinnow());
	    }
	 @Then("^I verify Text label$")
	    public void i_verify_text_label() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifyText());
	    }
	 @Then("^I Verify app store tab$")
	    public void i_verify_app_store_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifyappstore());
	    }
	 @Then("^I verify google download tab$")
	    public void i_verify_google_download_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifygoogleStore());
	    }
	 @Then("^I verify for new customers tab$")
	    public void i_verify_for_new_customers_tab() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifynewcustomer());
	    }
	 @Then("^I verify text Available in all Virgin Megastores branches in KSA$")
	    public void i_verify_text_available_in_all_virgin_megastores_branches_in_ksa() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilysectionVerifyTextMegastore());	   
		 }
	 @Then("^I verify the family device page if its is redirected$")
	    public void i_verify_the_family_device_page_if_its_is_redirected() throws Throwable {
		 Assert.assertTrue(familytagPO.FamilyPageVerification());
	    }

}