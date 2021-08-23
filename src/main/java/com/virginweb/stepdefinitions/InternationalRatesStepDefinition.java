package com.virginweb.stepdefinitions;

import static com.virginweb.helper.Helper.waitForPageLoaded;

import org.junit.Assert;
import org.openqa.selenium.WebDriver.Navigation;

import com.virginweb.helper.Helper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class InternationalRatesStepDefinition extends StepDefinitionInit {
	
	@When("^I click on plan button$")
    public void i_click_on_plan_button() throws Throwable {
		waitForPageLoaded();
		Thread.sleep(5000);
        internationalrtsPO.clickOnPlanb();
    }
	@When("^I click in International Rates button$")
    public void i_click_in_international_rates_button() throws Throwable {
        internationalrtsPO.clickOnInterratesa();
    }
	@Then("^I get redirected to international rates page$")
    public void i_get_redirected_to_international_rates_page() throws Throwable {
		Thread.sleep(2000);
        Assert.assertTrue(internationalrtsPO.redirecttoInternationalPge());
    }
	@When("^international rate page is scrollabble$")
    public void international_rate_page_is_scrollabble() throws Throwable {
		Thread.sleep(2000);
        internationalrtsPO.scrollintrpage();
    }
	@Then("^It get redirected to the previous page$")
    public void it_get_redirected_to_the_previous_page() throws Throwable {
		Assert.assertTrue(internationalrtsPO.redirectedToPreviousPage());
    }
	@Then("^I verify the text in the dropdown$")
    public void i_verify_the_text_in_the_dropdown() throws Throwable {
        Assert.assertTrue(internationalrtsPO.verifyTextDropDown());
    }
	@Then("^Local sms and call rates are displayed for Albania$")
    public void local_sms_and_call_rates_are_displayed_for_albania() throws Throwable {
        Assert.assertTrue(internationalrtsPO.localRatesAlbania());
    }
	@Then("^Local sms and call rates are displayed for Algeria$")
    public void local_sms_and_call_rates_are_displayed_for_algeria() throws Throwable {
		Assert.assertTrue(internationalrtsPO.localRatesAlgeria());
    }
	@Then("^Local sms and call rates are displayed for American Samoa$")
    public void local_sms_and_call_rates_are_displayed_for_american_samoa() throws Throwable {
		Assert.assertTrue(internationalrtsPO.localRatesAmericanSamoa());
    
    }
	 @When("^I scroll the InternationalRtes Page$")
	    public void i_scroll_the_internationalrtes_page() throws Throwable {
	       internationalrtsPO.scrollpageintr();
	    }
	@When("^I click on select country$")
    public void i_click_on_select_country() throws Throwable {
		Thread.sleep(2000);
        internationalrtsPO.clickOnSelectCountries();
    }
	@Then("^I select the country$")
    public void i_select_the_country() throws Throwable {
        Assert.assertTrue(internationalrtsPO.selectcountries());
    }
	@Then("^local sms and call rate is displayed$")
    public void local_sms_and_call_rate_is_displayed() throws Throwable {
        Assert.assertTrue(internationalrtsPO.ratesdisplayed());
    }
	@When("^I click on back button in international rates page$")
    public void i_click_on_back_button_in_international_rates_page() throws Throwable {
		Thread.sleep(2000);
       internationalrtsPO.backonInternationalpage();
    }
	@Then("^I select American Samaoa as country$")
    public void i_select_american_samaoa_as_country1() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAmericanSamoa());
    }
	@Then("^I select Angola as country$")
    public void i_select_angola_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAngola());
    }
	@Then("^I select Anguilla as country$")
    public void i_select_anguilla_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAnguilla());
    }
	@Then("^I select Antigua and Barbuda as country$")
    public void i_select_antigua_and_barbuda_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAntigua());
    }
	@Then("^I select Argentina as country$")
    public void i_select_argentina_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsArgentina());
    }
	@Then("^I select Armania as country$")
    public void i_select_armania_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsArmania());
    }
	@Then("^I select Ascension as country$")
    public void i_select_ascension_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAscension());
    }
	@Then("^I select Australia as country$")
    public void i_select_australia_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAustralia());
    }
	@Then("^I select Andorra as country$")
	public void i_select_Andorra_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAndorra());
	}
	@Then("^I select Azerbaijan as country$")
    public void i_select_azerbaijan_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsAzerbaijan());
    }
	@Then("^I select Bahamas as country$")
    public void i_select_bahamas_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBahamas());
    }
	@Then("^I select Bahrain as country$")
    public void i_select_bahrain_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBahrain());
    }
	@Then("^I select Barbados as country$")
    public void i_select_barbados_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBarbados());
    }
	@Then("^I select Bhutan as country$")
    public void i_select_bhutan_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBhutan());
    }
	@Then("^I select Bolivia as country$")
    public void i_select_bolivia_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBolivia());
    }
	@Then("^I select Bosnia and Herzegovina as country$")
    public void i_select_bosnia_and_herzegovina_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBosnia());
    }
	@Then("^I select Botswana as country$")
    public void i_select_botswana_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBotswana());
    }
	@Then("^I select Brazil as country$")
    public void i_select_brazil_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBrazil());
    }
	@Then("^I select British Virgin Islands as country$")
    public void i_select_british_virgin_islands_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBritishVirginIslands());
    }
	@Then("^I select Brunei as country$")
    public void i_select_brunei_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBrunei());
    }
	@Then("^I select Bulgaria as country$")
    public void i_select_bulgaria_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBulgaria());
    }
	@Then("^I select Belarus as country$")
    public void i_select_belarus_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBelarus());
    }
	@Then("^I select Belgium as country$")
    public void i_select_belgium_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBelgium());
    }
	@Then("^I select Belize as country$")
    public void i_select_belize_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBelize());
    }
	@Then("^I select Bermuda as country$")
    public void i_select_bermuda_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBermuda());
    }
	@Then("^I select Benin as country$")
    public void i_select_benin_as_country() throws Throwable {
		Assert.assertTrue(internationalrtsPO.selectcountryAsBenin());
    }
	 @Then("^I select Burkina Faso as country$")
	    public void i_select_burkina_faso_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsBurkinaFaso());
	    }
	 @Then("^I select Burundi as country$")
	    public void i_select_burundi_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsBurundi());
	    }
	 @Then("^I select Combodia as country$")
	    public void i_select_combodia_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCombodia());
	    }
	 @Then("^I select Cameroon as country$")
	    public void i_select_cameroon_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCameroon());
	    }
	 @Then("^I select Canada as country$")
	    public void i_select_canada_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCanada());
	    }
	 @Then("^I select Cape verde as country$")
	    public void i_select_cape_verde_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCapeVerde());
	    }
	 @Then("^I select Central African Republic as country$")
	    public void i_select_central_african_republic_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCentralAfricanRepublic());
	    }
	 @Then("^I select Chile as country$")
	    public void i_select_chile_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsChile());
	    }
	 @Then("^I select Chad as country$")
	    public void i_select_chad_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsChad());
	    }
	 @Then("^I select China as country$")
	    public void i_select_china_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsChina());
	    }
	 @Then("^I verify the china in the dropdown$")
	    public void i_verify_the_china_in_the_dropdown() throws Throwable {
	        Assert.assertTrue(internationalrtsPO.VerifyChinaInDD());
	    }
	 @Then("^I select Colombia as country$")
	    public void i_select_colombia_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryColombia());
	    }
	 @Then("^I verify the Colombia in the dropdown$")
	    public void i_verify_the_colombia_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyColombiaInDD());
	    }
	 @Then("^I select Comoros as country$")
	    public void i_select_comoros_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryComoros());
	    }
	 @Then("^I verify the Comoros in the dropdown$")
	    public void i_verify_the_comoros_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyComorosInDD());
	    }
	 @Then("^I select Cook Islands as country$")
	    public void i_select_cook_islands_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCookIslands());
	    }
	 @Then("^I verify the Cook Islands in the dropdown$")
	    public void i_verify_the_cook_islands_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCookIslandsInDD());
	    }
	 @Then("^I select Costa Rica as country$")
	    public void i_select_costa_rica_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCostaRica());
	    }
	 @Then("^I verify the Costa Rica in the dropdown$")
	    public void i_verify_the_costa_rica_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCostaRicaInDD());
	    }
	 @Then("^I select Croatia as country$")
	    public void i_select_croatia_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCroatia());
	    }
	 @Then("^I verify the Croatia in the dropdown$")
	    public void i_verify_the_croatia_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCroatiaInDD());
	    }
	 @Then("^I select Cuba as country$")
	    public void i_select_cuba_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCuba());
	    }
	 @Then("^I verify the Cuba in the dropdown$")
	    public void i_verify_the_cuba_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCubaInDD());
	    }
	 @Then("^I select Cyprus as country$")
	    public void i_select_cyprus_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCyprus());

	    }
	 @Then("^I verify the Cyprus in the dropdown$")
	    public void i_verify_the_cyprus_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCyprusInDD());
	    }	
	// @Then("^I select Czech_Republic as country$")
	//  public void i_select_czechrepublic_as_country() throws Throwable {
	//	 Assert.assertTrue(internationalrtsPO.selectcountryCzechRepublic());
	 //   }
	
	 @Then("^I verify the Czech_Republic in the dropdown$")
	    public void i_verify_the_czechrepublic_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyCzechRepublicInDD());
	    }
	 @Then("^I select Czech_Republic as country$")
	    public void i_select_czechrepublic_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryCzechRepublic());
	    }
	 @Then("^I select Democratic Republic of the Congo as country$")
	    public void i_select_democratic_republic_of_the_congo_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryDemocraticRepublicoftheCongo());
	    }
	 @Then("^I verify the Democratic Republic of the Congo in the dropdown$")
	    public void i_verify_the_democratic_republic_of_the_congo_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyDemocraticRepublicoftheCongoInDD());
	    }
	 @Then("^I select Denmark as country$")
	    public void i_select_denmark_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryDenmark());
	    }
	 @Then("^I verify the Denmark in the dropdown$")
	    public void i_verify_the_denmark_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyDenmarkInDD());
	    }
	 @Then("^I select Diego Garcia as country$")
	    public void i_select_diego_garcia_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryDiegoGarcia());
	    }
	 @Then("^I verify the Diego Garcia in the dropdown$")
	    public void i_verify_the_diego_garcia_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyDiegoGarciaInDD());	   
		 }
	 @Then("^I select Djibouti as country$")
	    public void i_select_djibouti_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryDjibouti());
	    }
	 @Then("^I verify the Djibouti in the dropdown$")
	    public void i_verify_the_djibouti_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyDjiboutiInDD());
	    }
	 @Then("^I select Bangladesh as country$")
	 public void i_select_Bangladesh_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsBangladesh());
	 }

	 @Then("^I select Cayman islands as country$")
	 public void i_select_Cayman_islands_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsCayman());
	 }
	 @Then("^I select Dominica as country$")
	    public void i_select_dominica_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsDominica());
	    }
	 @Then("^I verify the Dominica in the dropdown$")
	    public void i_verify_the_dominica_in_the_dropdown() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.VerifyDominicaInDD());
	    }
	 @Then("^I select Dominican Republic as country$")
	    public void i_select_dominican_republic_as_country() throws Throwable {
		 Assert.assertTrue(internationalrtsPO.selectcountryAsDominicanRepublic());
	    }

	    @Then("^I verify the Dominican Republic in the dropdown$")
	    public void i_verify_the_dominican_republic_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyDDominicanRepublicInDD());
	    }
	    @Then("^I select East Timor as country$")
	    public void i_select_east_timor_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEastTimor());
	    }
	    @Then("^I verify the East Timor in the dropdown$")
	    public void i_verify_the_east_timor_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEastTimorInDD());
	    }
	    @Then("^I select Ecuador as country$")
	    public void i_select_ecuador_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEcuador());
	    }
	    @Then("^I verify the Ecuador in the dropdown$")
	    public void i_verify_the_ecuador_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEcuadorInDD());
	    }
	    @Then("^I select Egypt as country$")
	    public void i_select_egypt_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEgypt());
	    }
	    @Then("^I verify the Egypt in the dropdown$")
	    public void i_verify_the_egypt_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEgyptInDD());
	    }
	    
	    @Then("^I select EI Salvador as country$")
	    public void i_select_ei_salvador_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEISalvador());
	    }
	    @Then("^I verify the EI Salvador in the dropdown$")
	    public void i_verify_the_ei_salvador_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEISalvadorInDD());
	    }
	    @Then("^I select Equatorial Guinea as country$")
	    public void i_select_equatorial_guinea_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEquatorialGuinea());
	    }
	    @Then("^I verify the Equatorial Guinea in the dropdown$")
	    public void i_verify_the_equatorial_guinea_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEquatorialGuineaInDD());
	    }
	    @Then("^I select Eritrea as country$")
	    public void i_select_eritrea_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEritrea());
	    }
	    @Then("^I verify the Eritrea in the dropdown$")
	    public void i_verify_the_eritrea_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEritreaInDD());
	    }
	    @Then("^I select Estonia as country$")
	    public void i_select_estonia_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEstonia());
	    }
	    @Then("^I verify the Estonia in the dropdown$")
	    public void i_verify_the_estonia_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEstoniaInDD());
	    }
	    @Then("^I select Ethiopia as country$")
	    public void i_select_ethiopia_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsEthiopia());
	    }
	    @Then("^I verify the Ethiopia in the dropdown$")
	    public void i_verify_the_ethiopia_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyEthiopiaInDD());
	    }
	    @Then("^I select Falkland Island as country$")
	    public void i_select_falkland_island_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFalklandIsland());
	    }
	    @Then("^I verify the Falkland Island in the dropdown$")
	    public void i_verify_the_falkland_island_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFalklandIslandInDD());
	    }
	    @Then("^I select Faroe Islands as country$")
	    public void i_select_faroe_islands_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFaroeIslands());
	    }
	    @Then("^I verify the Faroe Islands in the dropdown$")
	    public void i_verify_the_faroe_islands_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFaroeIslandsInDD());
	    }
	    @Then("^I select Fiji as country$")
	    public void i_select_fiji_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFijiIslands());
	    }
	    @Then("^I verify the Fiji in the dropdown$")
	    public void i_verify_the_fiji_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFijiInDD());
	    }
	    @Then("^I select Finland as country$")
	    public void i_select_finland_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFinland());
	    }
	    @Then("^I verify the Finland in the dropdown$")
	    public void i_verify_the_finland_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFinlandInDD());
	    }
	    @Then("^I select France as country$")
	    public void i_select_france_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFrance());
	    }
	    @Then("^I verify the France in the dropdown$")
	    public void i_verify_the_france_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFranceInDD());
	    }
	    @Then("^I select French Guiana as country$")
	    public void i_select_french_guiana_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFrenchGuiana());
	    }
	    
	    @Then("^I verify the French Guiana in the dropdown$")
	    public void i_verify_the_french_guiana_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFrenchGuianaInDD());
	    }
	    @Then("^I select French Polynesia as country$")
	    public void i_select_french_polynesia_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsFrenchPolynesia());
	    }

	    @Then("^I verify the French Polynesia in the dropdown$")
	    public void i_verify_the_french_polynesia_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyFrenchPolynesiaInDD());
	    }
	    @Then("^I select Gabon as country$")
	    public void i_select_gabon_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGabon());
	    }

	    @Then("^I verify the Gabon in the dropdown$")
	    public void i_verify_the_gabon_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGabonInDD());
	    }
	    @Then("^I select Gambia as country$")
	    public void i_select_gambia_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGambia());
	    }

	    @Then("^I verify the Gambia in the dropdown$")
	    public void i_verify_the_gambia_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGambiaInDD());
	    }
	    @Then("^I select Georgia as country$")
	    public void i_select_georgia_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGeorgia());
	    }

	    @Then("^I verify the Georgia in the dropdown$")
	    public void i_verify_the_georgia_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGeorgiaInDD());
	    }
	    @Then("^I select Germany as country$")
	    public void i_select_germany_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGermany());
	    }

	    @Then("^I verify the Germany in the dropdown$")
	    public void i_verify_the_germany_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGermanyInDD());
	    }
	    @Then("^I select Ghana as country$")
	    public void i_select_ghana_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGhana());
	    }

	    @Then("^I verify the Ghana in the dropdown$")
	    public void i_verify_the_ghana_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGhanaInDD());
	    }
	    @Then("^I select Gibraltar as country$")
	    public void i_select_gibraltar_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGibraltar());
	    }

	    @Then("^I verify the Gibraltar in the dropdown$")
	    public void i_verify_the_gibraltar_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGibraltarInDD());
	    }
	    @Then("^I select Greece as country$")
	    public void i_select_greece_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGreece());
	    }

	    @Then("^I verify the Greece in the dropdown$")
	    public void i_verify_the_greece_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGreeceInDD());
	    }
	    @Then("^I select Greenland as country$")
	    public void i_select_greenland_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGreenland());
	    }

	    @Then("^I verify the Greenland in the dropdown$")
	    public void i_verify_the_greenland_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGreenlandInDD());
	    }
	    @Then("^I select Grenada as country$")
	    public void i_select_grenada_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGrenada());
	    }

	    @Then("^I verify the Grenada in the dropdown$")
	    public void i_verify_the_grenada_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGrenadaInDD());
	    }
	    @Then("^I select Guadeloupe as country$")
	    public void i_select_guadeloupe_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGuadeloupe());
	    }

	    @Then("^I verify the Guadeloupe in the dropdown$")
	    public void i_verify_the_guadeloupe_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGuadeloupeInDD());
	    }
	    @Then("^I select Guam as country$")
	    public void i_select_guam_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGuam());
	    }

	    @Then("^I verify the Guam in the dropdown$")
	    public void i_verify_the_guam_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGuamInDD());
	    }
	    @Then("^I select Guatemala as country$")
	    public void i_select_guatemala_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGuatemala());
	    }

	    @Then("^I verify the Guatemala in the dropdown$")
	    public void i_verify_the_guatemala_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGuatemalaInDD());
	    
	    }

	    @Then("^I verify the Guyana in the dropdown$")
	    public void i_verify_the_guyana_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyGuyanaInDD());
	    }
	    @Then("^I select Guyana as country$")
	    public void i_select_guyana_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsGuyana());
	    }

	    @Then("^I verify the Haiti in the dropdown$")
	    public void i_verify_the_Haiti_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyHaitiInDD());
	    }
	    @Then("^I select Haiti as country$")
	    public void i_select_haiti_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsHaiti());
	    }

	    @Then("^I verify the Hondurus in the dropdown$")
	    public void i_verify_the_Hondurus_in_the_dropdown() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.VerifyHondurusInDD());
	    }
	    @Then("^I select Hondurus as country$")
	    public void i_select_hondurus_as_country() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.selectcountryAsHondurus());
	    }

	    @When("^I click on Hamburgr tab on the page$")
	    public void i_click_on_hamburgr_tab_on_the_page() throws Throwable {
	        internationalrtsPO.hamburgerInMobileView();
	    }

	    @When("^I click in International Rates button in hamburgr$")
	    public void i_click_in_international_rates_button_in_hamburgr() throws Throwable {
	    	internationalrtsPO.planInHamburgerMob();
	    }

	    @When("^I click on select country in mobile view$")
	    public void i_click_on_select_country_in_mobile_view() throws Throwable {
	    	internationalrtsPO.selectcountriesClick();
	    }

	    @Then("^I get redirected to international rates page in mobileview$")
	    public void i_get_redirected_to_international_rates_page_in_mobileview() throws Throwable {
	        Assert.assertTrue(internationalrtsPO.validiateInMobileView());
	    }

	    @Then("^I select Angola as country in mobile view$")
	    public void i_select_angola_as_country_in_mobile_view() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.SelectAngolaMobile());
	    }

	    @Then("^local sms and call rate is displayed in mobile view$")
	    public void local_sms_and_call_rate_is_displayed_in_mobile_view() throws Throwable {
	    	Assert.assertTrue(internationalrtsPO.validiateLocalRateMob());
	    }
	    @When("^I select options and data from excel file$")
	    public void i_select_options_and_data_from_excel_file() throws Throwable {
	        internationalrtsPO.SelectCountriesExcel();
	    }
}