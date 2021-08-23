package com.virginweb.home.po;



import java.util.ArrayList;
import java.util.List;

//import org.apache.cassandra.thrift.Cassandra.AsyncProcessor.system_add_column_family;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;
import com.virginweb.utils.Xls_reader;

import cucumber.api.java.en.And;



public class InternationalRatesPO extends MobileWebViewPage{

	
	public InternationalRatesPO(TestSession session) throws Exception 
	{
		super(session, "Applications/virginweb/InternationalRates");		

	}
	/**
	 * Used to click on plan and product
	 * 
	 */

	public void clickOnPlanb() {
		element("planandprdt").click();
		
	}
	/**
	 * Used to click on international rates
	 * 
	 */

	public void clickOnInterratesa() {
		element("intrratesa").click();
		
	}
	/**
	 * Used to validiate it redirects to international rate page
	 * 
	 */

	public boolean redirecttoInternationalPge() {
		boolean value=false;

		 if(element("selectCountries").isDisplayed())
	  {
			 value=false;
		 }else
		 {
			 value=true;
		 }
			return value;	
	}
	/**
	 * Used to scroll down
	 * 
	 */

	public void scrollintrpage() {
		Helper.scrollDown();
		
	}
	/**
	 * Used to click on select countries
	 * 
	 */

	public void clickOnSelectCountries() {
		element("selectCountries").click();
		
	}
	/**
	 * Used to select values from drop down
	 * 
	 */

	public boolean selectcountries() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Afghanistan");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to check sim and call rates displayed or not
	 * 
	 */

	public boolean ratesdisplayed() {
		boolean status = true;
		if(element("localrates1").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to get back to page
	 * 
	 */

	public void backonInternationalpage() {
		session.driver.navigate().back();
	}
	/**
	 * Used to scroll the page
	 * 
	 */
	public void scrollpageintr() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(2000);
		
	}
	/**
	 * Used to verify Texts in dropdown
	 * 
	 */
	public boolean verifyTextDropDown() {
		Boolean found = false;

		WebElement element = session.driver.findElement(By.id("//select[@id='slct_countries']"));
		Select select = new Select(element);
		List <WebElement> allOptions= select.getOptions();
		for(int i=0; i<allOptions.size(); i++) {
			if(allOptions.equals("Albania")) {
		        found=true;
		        break;
		    }
		}
		if(found) {
		    System.out.println("Value exists");
		}
		return found;
	}
	/**
	 * Used to verify albania text and rates
	 * 
	 */
	public boolean localRatesAlbania() {
		boolean status = true;
		if(element("localrates1").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
		
	}
	/**
	 * Used to verify Algeria text and rates
	 * 
	 */
	public boolean localRatesAlgeria() {
		boolean status = true;
		if(element("localrates1").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify American Samoa text and rates
	 * 
	 */
	public boolean localRatesAmericanSamoa() {
		boolean status = true;
		if(element("localrates1").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to select American samoa
	 * 
	 */
	public boolean selectcountryAsAmericanSamoa() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("American Samoa");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Angola
	 * 
	 */
	public boolean selectcountryAsAngola() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Angola");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Anguilla
	 * 
	 */
	public boolean selectcountryAsAnguilla() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Anguilla");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Antigua and Barbuda
	 * 
	 */
	public boolean selectcountryAsAntigua() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Antigua and Barbuda");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Argentina
	 * 
	 */
	public boolean selectcountryAsArgentina() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Argentina");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Armania
	 * 
	 */
	public boolean selectcountryAsArmania() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Armenia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	
	}
	/**
	 * Used to select Ascension
	 * 
	 */
	public boolean selectcountryAsAscension() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ascension Island");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Australia
	 * 
	 */
	public boolean selectcountryAsAustralia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Australia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Andorra
	 * 
	 */
	public boolean selectcountryAsAndorra() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Andorra");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Azerbaijan
	 * 
	 */
	public boolean selectcountryAsAzerbaijan() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Azerbaijan");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Bahamas
	 * 
	 */
	public boolean selectcountryAsBahamas() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bahamas");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Bangladesh
	 * 
	 */
	public boolean selectcountryAsBangladesh() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bangladesh");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Barbados
	 * 
	 */
	public boolean selectcountryAsBarbados() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Barbados");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Belarus
	 * 
	 */
	public boolean selectcountryAsBelarus() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Belarus");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Belgium
	 * 
	 */
	public boolean selectcountryAsBelgium() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Belgium");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Belize
	 * 
	 */
	public boolean selectcountryAsBelize() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Belize");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Bermuda
	 * 
	 */
	public boolean selectcountryAsBermuda() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bermuda");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Benin
	 * 
	 */
	public boolean selectcountryAsBenin() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Benin");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Bhutan
	 * 
	 */
	public boolean selectcountryAsBhutan() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bhutan");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Bolivia
	 * 
	 */
	public boolean selectcountryAsBolivia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bolivia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Bosnia
	 * 
	 */
	public boolean selectcountryAsBosnia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bosnia and Herzegovina");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Botswana
	 * 
	 */
	public boolean selectcountryAsBotswana() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Botswana");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Brazil
	 * 
	 */
	public boolean selectcountryAsBrazil() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Brazil");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select British Virgin Islands
	 * 
	 */
	public boolean selectcountryAsBritishVirginIslands() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("British Virgin Islands");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Brunei
	 * 
	 */
	public boolean selectcountryAsBrunei() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Brunei");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Bulgaria
	 * 
	 */
	public boolean selectcountryAsBulgaria() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bulgaria");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	/**
	 * Used to select Burkina Faso"
	 * 
	 */
	public boolean selectcountryAsBurkinaFaso() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Burkina Faso");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Burundi"
	 * 
	 */
	public boolean selectcountryAsBurundi() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Burundi");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Combodia
	 * 
	 */
	public boolean selectcountryAsCombodia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cambodia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Cameroon
	 * 
	 */
	public boolean selectcountryAsCameroon() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cameroon");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Canada
	 * 
	 */
	public boolean selectcountryAsCanada() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Canada");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Cape Verde
	 * 
	 */
	
	public boolean selectcountryAsCapeVerde() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cape Verde");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Cayman Islands
	 * 
	 */
	
	public boolean selectcountryAsCayman() {
		boolean status = true;
	Select dropdown = new Select(element("selectCountries"));
	dropdown.selectByVisibleText("Cayman islands");	
	if(element("planandprdt").isDisplayed()){
	  status = true;
	}
	else
		status = false;
	
	return status;
	}
	/**
	 * Used to select Central African Republic
	 * 
	 */
	
	public boolean selectcountryAsCentralAfricanRepublic() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Central African republic");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Chile
	 * 
	 */
	public boolean selectcountryAsChile() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Chile");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select Chad
	 * 
	 */
	public boolean selectcountryAsChad() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Chad");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to select China
	 * 
	 */
	public boolean selectcountryAsChina() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("China");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify China and code in DD
	 * 
	 */
	public boolean VerifyChinaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("China");
		Thread.sleep(3000);
		String Text_China = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("China")) {
		status = true;
		} else {
			status = false;
		}
		System.out.println(Text_China);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
				
	}
	/**
	 * Used to Select Colombia
	 * 
	 */
	public boolean selectcountryColombia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Colombia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Colombia and code in DD
	 * 
	 */
	public boolean VerifyColombiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("China");
		Thread.sleep(3000);
		String Text_Colombia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Colombia")) {
		status = true;
		} else {
			status = false;
		}
		System.out.println(Text_Colombia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Comoros
	 * 
	 */
	public boolean selectcountryComoros() {
		
			boolean status = true;
			Select dropdown = new Select(element("selectCountries"));
			dropdown.selectByVisibleText("Comoros");	
			if(element("planandprdt").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	/**
	 * Used to verify Comoros and code in DD
	 * 
	 */
	public boolean VerifyComorosInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Comoros");
		Thread.sleep(3000);
		String Text_Comoros = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Colombia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_Comoros);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Cook Islands
	 * 
	 */
	public boolean selectcountryCookIslands() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cook Islands");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Cook Islands and code in DD
	 * 
	 */
	public boolean VerifyCookIslandsInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cook Islands");
		Thread.sleep(3000);
		String Text_CookIslands = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Cook Islands")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_CookIslands);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Costa rica
	 * 
	 */
	public boolean selectcountryCostaRica() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Costa Rica");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Costa Rica and code in DD
	 * 
	 */
	public boolean VerifyCostaRicaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("China");
		Thread.sleep(3000);
		String Text_CostaRica = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Costa Rica")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_CostaRica);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Croatia
	 * 
	 */
	public boolean selectcountryCroatia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Croatia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Croatia and code in DD
	 * 
	 */
	public boolean VerifyCroatiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("China");
		Thread.sleep(3000);
		String Text_Croatia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Croatia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_Croatia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	/**
	 * Used to Select Cyprus 
	 * 
	 */
	public boolean selectcountryCyprus() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cyprus");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Cyprus  and code in DD
	 * 
	 */
	public boolean VerifyCyprusInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cyprus");
		Thread.sleep(3000);
		String Text_Cyprus = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Cyprus")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_Cyprus);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	
	
	/**
	 * Used to Select cuba
	 * 
	 */
	public boolean selectcountryCuba() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cuba");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify cuba and code in DD
	 * 
	 */
	public boolean VerifyCubaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Cuba");
		Thread.sleep(3000);
		String Text_Cuba = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Cuba")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_Cuba);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	/**
	 * Used to Select Czech Republic
	 * 
	 */
	public boolean selectcountryCzechRepublic() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Czech republic");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Czech Republic and code in DD
	 * 
	 */
	public boolean VerifyCzechRepublicInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Czech Republic");
		Thread.sleep(3000);
		String Czech_Republic = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Czech Republic")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Czech_Republic);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	/**
	 * Used to Select Democratic Republic of the Congo
	 * 
	 */
	public boolean selectcountryDemocraticRepublicoftheCongo() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Democratic Republic of the Congo");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Democratic Republic of the Congo and code in DD
	 * 
	 */
	public boolean VerifyDemocraticRepublicoftheCongoInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Democratic Republic of the Congo");
		Thread.sleep(3000);
		String DemocraticRepublic_ofthe_Congo = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Democratic Republic of the Congo")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(DemocraticRepublic_ofthe_Congo);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	/**
	 * Used to Select Denmark
	 * 
	 */
	public boolean selectcountryDenmark() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Denmark");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Denmark and code in DD
	 * 
	 */
	public boolean VerifyDenmarkInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Denmark");
		Thread.sleep(3000);
		String Denmark = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Denmark")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Denmark);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	/**
	 * Used to Select Diego Garcia
	 * 
	 */
	public boolean selectcountryDiegoGarcia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Diego Garcia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Diego Garcia and code in DD
	 * 
	 */
	public boolean VerifyDiegoGarciaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Diego Garcia");
		Thread.sleep(3000);
		String DiegoGarcia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Diego Garcia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(DiegoGarcia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	} 
	
	/**
	 * Used to Select Djibouti
	 * 
	 */
	public boolean selectcountryDjibouti() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Djibouti");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Djibouti and code in DD
	 * 
	 */
	public boolean VerifyDjiboutiInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Djibouti");
		Thread.sleep(3000);
		String Djibouti = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Cuba")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Djibouti);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Bahrain
	 * 
	 * 
	 */
	public boolean selectcountryAsBahrain() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Bahrain");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to Select Dominican_Republic
	 * 
	 * 
	 */
	public boolean selectcountryAsDominicanRepublic() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Dominican Republic");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Dominican_Republic and code in DD
	 * 
	 */
	public boolean VerifyDDominicanRepublicInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Dominican Republic");
		Thread.sleep(3000);
		String Dominican_Republic = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Dominican Republic")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Dominican_Republic);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	
	/**
	 * Used to Select Dominica
	 * 
	 * 
	 */
	public boolean selectcountryAsDominica() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Dominica");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Dominica and code in DD
	 * 
	 */
	public boolean VerifyDominicaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Dominica");
		Thread.sleep(3000);
		String Dominica = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Dominica")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Dominica);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select East Timor
	 * 
	 * 
	 */
	public boolean selectcountryAsEastTimor() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("East Timor");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Dominica and code in DD
	 * 
	 */
	public boolean VerifyEastTimorInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("East Timor");
		Thread.sleep(3000);
		String EastTimor = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("East Timor")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(EastTimor);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Ecuador
	 * 
	 * 
	 */
	public boolean selectcountryAsEcuador() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ecuador");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Ecuador and code in DD
	 * 
	 */
	public boolean VerifyEcuadorInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ecuador");
		Thread.sleep(3000);
		String Ecuador = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Ecuador")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Ecuador);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Egypt
	 * 
	 * 
	 */
	public boolean selectcountryAsEgypt() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Egypt");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Egypt and code in DD
	 * 
	 */
	public boolean VerifyEgyptInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Egypt");
		Thread.sleep(3000);
		String Egypt = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Egypt")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Egypt);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	
	/**
	 * Used to Select EI Salvador
	 * 
	 * 
	 */
	public boolean selectcountryAsEISalvador() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("El Salvador");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify EI Salvador and code in DD
	 * 
	 */
	public boolean VerifyEISalvadorInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("El Salvador");
		Thread.sleep(3000);
		String El_Salvador = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("El Salvador")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(El_Salvador);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	
	/**
	 * Used to Select Equatorial Guinea
	 * 
	 * 
	 */
	public boolean selectcountryAsEquatorialGuinea() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Equatorial Guinea");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status; 
	}
	
	/**
	 * Used to verify Equatorial Guinea and code in DD
	 * 
	 */
	public boolean VerifyEquatorialGuineaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Equatorial Guinea");
		Thread.sleep(3000);
		String Egypt = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Equatorial Guinea")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Egypt);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	
	/**
	 * Used to Select Eritrea
	 * 
	 * 
	 */
	public boolean selectcountryAsEritrea() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Eritrea");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	
	/**
	 * Used to verify Eritrea and code in DD
	 * 
	 */
	public boolean VerifyEritreaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Eritrea");
		Thread.sleep(3000);
		String Eritrea = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Eritrea")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Eritrea);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Estonia
	 * 
	 * 
	 */
	public boolean selectcountryAsEstonia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Dominica");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Estonia and code in DD
	 * 
	 */
	public boolean VerifyEstoniaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Estonia");
		Thread.sleep(3000);
		String Estonia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Estonia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Estonia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Ethiopia
	 * 
	 * 
	 */
	public boolean selectcountryAsEthiopia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Estonia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Ethiopia and code in DD
	 * 
	 */
	public boolean VerifyEthiopiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ethiopia");
		Thread.sleep(3000);
		String Ethiopia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Ethiopia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Ethiopia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select falkland Island
	 * 
	 * 
	 */
	public boolean selectcountryAsFalklandIsland() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Falkland Islands");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify FalklandIsland and code in DD
	 * 
	 */
	public boolean VerifyFalklandIslandInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Falkland Islands");
		Thread.sleep(3000);
		String FalklandIsland = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Falkland Islands")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(FalklandIsland);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Faroe Island
	 * 
	 * 
	 */
	public boolean selectcountryAsFaroeIslands() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Faroe Islands");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify FaroeIslands and code in DD
	 * 
	 */
	public boolean VerifyFaroeIslandsInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Faroe Islands");
		Thread.sleep(3000);
		String FaroeIslands = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Faroe Islands")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(FaroeIslands);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Fiji
	 * 
	 * 
	 */
	public boolean selectcountryAsFijiIslands() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Fiji");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Fiji and code in DD
	 * 
	 */
	public boolean VerifyFijiInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Fiji");
		Thread.sleep(3000);
		String Fiji = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Fiji")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Fiji);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Finland
	 * 
	 * 
	 */
	public boolean selectcountryAsFinland() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Finland");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to Select France
	 * 
	 * 
	 */
	public boolean selectcountryAsFrance() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("France");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Finland and code in DD
	 * 
	 */
	public boolean VerifyFinlandInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Finland");
		Thread.sleep(3000);
		String Finland = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Finland")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Finland);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to verify France and code in DD
	 * 
	 */
	public boolean VerifyFranceInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("France");
		Thread.sleep(3000);
		String France = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("France")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(France);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select French Guiana
	 * 
	 * 
	 */
	public boolean selectcountryAsFrenchGuiana() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("French Guiana");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify FrenchGuiana and code in DD
	 * 
	 */
	public boolean VerifyFrenchGuianaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("French Guiana");
		Thread.sleep(3000);
		String FrenchGuiana = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("French Guiana")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(FrenchGuiana);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select French Polyesia
	 * 
	 * 
	 */
	public boolean selectcountryAsFrenchPolynesia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("French Polynesia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify French Polynesia and code in DD
	 * 
	 */
	public boolean VerifyFrenchPolynesiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("French Polynesia");
		Thread.sleep(3000);
		String FrenchPolynesia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("French Polynesia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(FrenchPolynesia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Gabon
	 * 
	 * 
	 */
	public boolean selectcountryAsGabon() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Gabon");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Gabon and code in DD
	 * 
	 */
	public boolean VerifyGabonInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Gabon");
		Thread.sleep(3000);
		String Gabon = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Gabon")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Gabon);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Gambia
	 * 
	 * 
	 */
	public boolean selectcountryAsGambia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Gambia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Gambia and code in DD
	 * 
	 */
	public boolean VerifyGambiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Gambia");
		Thread.sleep(3000);
		String Gambia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Gambia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Gambia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Georgia
	 * 
	 * 
	 */
	public boolean selectcountryAsGeorgia() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Georgia");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Georgia and code in DD
	 * 
	 */
	public boolean VerifyGeorgiaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Georgia");
		Thread.sleep(3000);
		String Georgia = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Georgia")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Georgia);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Germany
	 * 
	 * 
	 */
	public boolean selectcountryAsGermany() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Germany");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Germany and code in DD
	 * 
	 */
	public boolean VerifyGermanyInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Germany");
		Thread.sleep(3000);
		String Germany = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Germany")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Germany);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to Select Ghana 
	 * 
	 * 
	 */
	public boolean selectcountryAsGhana() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ghana");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 *method to verify Ghana
	 * 
	 */
	public boolean VerifyGhanaInDD() throws InterruptedException {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ghana");
		Thread.sleep(3000);
		String Ghana = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Ghana")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Ghana);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	

	public boolean selectcountryAsGibraltar() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Gibraltar");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Gibraltar and code in DD
	 * 
	 */
	public boolean VerifyGibraltarInDD() throws InterruptedException {
		
	     boolean status = true;
			
			Select dropdown = new Select(element("selectCountries"));
			dropdown.selectByVisibleText("Gibraltar");
			Thread.sleep(3000);
	        String Text_C = element("selectCountries").getText();
			
			if (element("selectCountries").getText().contains("Gibraltar")) {
			status = true;
			} else 
			{
				status = false;
			}
			System.out.println(Text_C);
			
			 Select select = new Select(element("selectCountries"));

			 WebElement option = select.getFirstSelectedOption();

			 String defaultItem = option.getText();

			 System.out.println(defaultItem );
			return status;
			
	}
	/**
	 * Used to verify common function and code in DD
	 * 
	 */
	public String VerifyFunction(String Text1) throws InterruptedException {
             boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText(Text1);
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Text")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return Text_C ;
	}
	/**
	 * Used to select country
	 * 
	 */
	public boolean selectcountryAsGreece() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Ghana");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Greece and code in DD
	 * 
	 */
	
	public boolean VerifyGreeceInDD() throws InterruptedException {
        boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Greece");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Greece")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select country
	 * 
	 */
	public boolean selectcountryAsGreenland() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Greenland");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Greenland and code in DD
	 * 
	 */
	public boolean VerifyGreenlandInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Greenland");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Greenland")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select country
	 * 
	 */
	public boolean selectcountryAsGrenada() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Grenada");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Grenada and code in DD
	 * 
	 */
	public boolean VerifyGrenadaInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Grenada");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Grenada")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select Guadeloupe 
	 * 
	 */
	public boolean selectcountryAsGuadeloupe() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guadeloupe");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Guadeloupe and code in DD
	 * 
	 */
	public boolean VerifyGuadeloupeInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guadeloupe");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Guadeloupe")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select Guam 
	 * 
	 */
	public boolean selectcountryAsGuam() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guam");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Guam and code in DD
	 * 
	 */
	public boolean VerifyGuamInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guam");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Guam")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select Guatemala 
	 * 
	 */
	public boolean selectcountryAsGuatemala() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guatemala");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Guatemala and code in DD
	 * 
	 */
	public boolean VerifyGuatemalaInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guatemala");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Guatemala")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select Guinea 
	 * 
	 */
	public boolean selectcountryAsGuinea() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guinea");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	/**
	 * Used to verify Guinea and code in DD
	 * 
	 */
	public boolean VerifyGuineaInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guinea");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Guinea")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to verify Guyana
	 * 
	 */
	public boolean VerifyGuyanaInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guyana");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Guyana")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select Guyana
	 * 
	 */
	public boolean selectcountryAsGuyana() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Guinea");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	
	}
	/**
	 * Used to verify Haiti
	 * 
	 */
	public boolean VerifyHaitiInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Haiti");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Haiti")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select  Haiti
	 * 
	 */
	public boolean selectcountryAsHaiti() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Haiti");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	
	}
	/**
	 * Used to verify Hondurus
	 * 
	 */
	public boolean VerifyHondurusInDD() throws InterruptedException {
boolean status = true;
		
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Hondurus");
		Thread.sleep(3000);
        String Text_C = element("selectCountries").getText();
		
		if (element("selectCountries").getText().contains("Hondurus")) {
		status = true;
		} else 
		{
			status = false;
		}
		System.out.println(Text_C);
		
		 Select select = new Select(element("selectCountries"));

		 WebElement option = select.getFirstSelectedOption();

		 String defaultItem = option.getText();

		 System.out.println(defaultItem );
		return status;
	}
	/**
	 * Used to select  Hondurus
	 * 
	 */
	public boolean selectcountryAsHondurus() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Hondurus");	
		if(element("planandprdt").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	
	}
	public void hamburgerInMobileView() {
		element("hamburgerMobile").click();
		
	}
	public void planInHamburgerMob() throws InterruptedException {
		element("planhamburgerMobile").click();
		Thread.sleep(2000);
		element("InternationalRatehamburgerMobile").click();
		
	}
	public boolean validiateInMobileView() {
		boolean status = true;
		if(element("localInMobileView").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	
	}
	public void selectcountriesClick() {
		element("SelectCountriesClick").click();
		
	}
	public boolean SelectAngolaMobile() {
		boolean status = true;
		Select dropdown = new Select(element("selectCountries"));
		dropdown.selectByVisibleText("Angola");	
		if(element("localInMobileView").isDisplayed()){
		  status = true;
		}
		else
			status = false;
		
		return status;
	}
	public boolean validiateLocalRateMob() {
		boolean status = true;
		if(element("localInMobileView").isDisplayed()){
			  status = true;
			}
			else
				status = false;
			
			return status;
	}
	
	
	public void SelectCountriesExcel() throws InterruptedException {
		
	   Xls_reader reader= new Xls_reader("C:/Users/Shubham/Desktop/newAppzlogic/web automation/src/test/resources/testData/SelectCountries.xlsx");
	   
//       String CountryName = reader.getCellData("CountriesData", "Countries", 2);
//       Select dropdown = new Select(element("selectCountries"));
//	   dropdown.selectByVisibleText(CountryName);	
	
	   int rowCount = reader.getRowCount("CountriesData");
	   for(int rowNum=2;rowNum<=rowCount;rowNum++){
		   
		   String CountryName = reader.getCellData("CountriesData","Countries",rowNum);
		   Select dropdown = new Select(element("selectCountries"));
		   dropdown.selectByVisibleText(CountryName);
		   Thread.sleep(2000);
	   }
	   
		   
	}
	
	/**
	 * to verify if redirected to previous page
	 * 
	 */
	public boolean redirectedToPreviousPage() {
		return element("planandprdt").isDisplayed();
	}
	
	
	
}
	
