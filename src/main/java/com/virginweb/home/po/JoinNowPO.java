package com.virginweb.home.po;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class JoinNowPO extends MobileWebViewPage {

	public JoinNowPO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/JoinNow");
	}

	/**
	 * Used to Click on JoinNow button and redirect joinNow
	 * 
	 */
	public void JoinUs_Open() throws InterruptedException {
		if(element("close_welcomepopup").isDisplayed()) {
			element("close_welcomepopup").click();
			Thread.sleep(2000);
			element("Join_Button").click();
		}else {
		element("Join_Button").click();
		// Thread.sleep(2000);
		}
	}

	/**
	 * Used to verify JoinNow Page is open
	 * 
	 */

	public boolean verify_JoinUsPage() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='fragment']")));
		return status.isDisplayed();
	}
	
	public boolean verify_JoinNowPage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 20);
		WebElement status = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@placeholder,'ابحث عن رقم')]")));
		return status.isDisplayed();
	}

	/**
	 * Used to Perform Scroll operation under JoinNow
	 * 
	 */

	public boolean verify_scroll() {
		boolean value = element("search_button").isDisplayed();
		return value;
	}

	/**
	 * Used to Change Language to English
	 * 
	 */

	public void change_Language() throws InterruptedException {
		element("English_Link").click();
		Thread.sleep(2000);
	}

	/**
	 * Used to select number below the search field
	 * 
	 */

	public void select_Number() throws InterruptedException {
		int j = 0;
		for (int i = 1; i < 2; i++) {
			WebElement ele = elements("NumberLists").get(i);
			ele.click();
			Thread.sleep(2000);
		}
	}

	/**
	 * Used to Verify click operation works on number below search field
	 * 
	 */

	public boolean verify_NumberClick() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='BOOK IT NOW']")));
		return status.isDisplayed();
	}

	/**
	 * Used to Verify number details are displayed
	 * 
	 */

	public boolean verify_NumberDetailsDisplayed() {
		boolean value = false;
		System.out.println(element("Number_Type").getText());
		if (element("Number_Type").isDisplayed() && element("Number_Price").isDisplayed()
				&& element("BookNow_Button").isDisplayed()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to click on Book Now Button
	 * 
	 */

	public void clickBookNowButton() throws InterruptedException {
		element("BookNow_Button").click();
		Thread.sleep(4000);
	}

	/**
	 * Used to Verify click on Book Now Button is working
	 * 
	 */

	public boolean verify_BookNowButtonClickable() {

		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='COOL, NOW FOR']")));
		return status.isDisplayed();

	}

	/**
	 * Used to Verify Your plan page opens after click on Book now button
	 * 
	 */

	public boolean verify_YourPlanPageOpens() {
		boolean value = false;
		if (element("Progress_Title").getText().contains("YOUR PLAN")) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to click on Right/Left arrow under Your plan page
	 * 
	 */

	public void clickRight_leftArrow() throws InterruptedException {
		if (element("ImageLink_250PopUp").isDisplayed()) {
			for (int i = 1; i < 3; i++) {
				element("Right_Arrow").click();
				Thread.sleep(1000);
			}
		} else {
			element("Left_Arrow").click();
			Thread.sleep(1000);
		}
	}

	public void clickLeftArrow() throws InterruptedException {
		element("Left_Arrow").click();
		Thread.sleep(1000);
	}

	/**
	 * Used to Verify right/left arrow click works
	 * 
	 */

	public boolean verify_RightArrowClick() {
		boolean value = true;
		if (element("ImageLink_250PopUp").isDisplayed()) {
			value = true;
		} else {
			value = false;
		}

		return value;
	}

	/*
	 * public void click_GetPlanBtn() throws InterruptedException { String
	 * PlanValue=element("Price_YourPlan").getText(); if(PlanValue.contains("70")) {
	 * clickLeftArrow(); element("GetPlan_Button").click(); Thread.sleep(4000);
	 * }else { element("GetPlan_Button").click(); Thread.sleep(4000); } }
	 */

	/**
	 * Used to click on Get Plan button under 215 Sar popup
	 * 
	 */

	public void click_GetPlanBtn() throws InterruptedException {
		if (element("ImageLink_250PopUp").isDisplayed()) {
			Helper.scrollDown();
			Thread.sleep(1000);
			element("GetPlan_Button").click();
			Thread.sleep(4000);
		} else {
			clickLeftArrow();
			element("GetPlan_250Button").click();
			Thread.sleep(4000);
		}

	}

	/**
	 * Used to Verify click on Get Plan button redirect to Check Eligibility page
	 * 
	 */

	public boolean verify_EligibilityPage() {

		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ELIGIBILITY')]")));
		return status.isDisplayed();

	}

	/**
	 * Used to Click on Create plan button under 215 sar popup
	 * 
	 */

	public void click_CreatePlan() throws InterruptedException {
		if (element("ImageLink_250PopUp").isDisplayed()) {
			Helper.scrollDown();
			Thread.sleep(1000);
			element("CreatePlan_Link").click();
			Thread.sleep(4000);
		} else {
			clickLeftArrow();
			element("CreatePlan_Link").click();
			Thread.sleep(4000);
		}
	}

	/**
	 * Used to Verify Create plan popup opens
	 * 
	 */

	public boolean verify_CreatePlanPopUp() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(" //div[text()='National Minutes / 2xSMS']")));
		return status.isDisplayed();
	}

	/**
	 * Used to select any national plan
	 * 
	 */

	public void selectNationalPlan() throws InterruptedException {
		element("National_Minute").click();
		Thread.sleep(1000);
	}

	/**
	 * Used to Verify for the selected National plan
	 * 
	 */

	public boolean verify_SelectedNatPlan() throws InterruptedException {
		boolean value = false;
		if (element("Text_FreeData").isDisplayed()) {
			value = true;
			Thread.sleep(1000);
			System.out.println("National plan cannot be selected");
		} else {
			value = false;
			System.out.println("National plan selected");
		}
		return value;
	}

	/**
	 * Used to Click on Your number dropdown under Your Plan page
	 * 
	 */

	public void click_NumberDropdwn() {
		WebDriverWait wait = new WebDriverWait(session.driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='point-header']"))).click();

	}

	/**
	 * Used to Verify Number is displayed under Dropdown
	 * 
	 */

	public boolean verify_NumberVisibleInDrpdwn() {
		boolean value = false;
		if (element("Number_inDropdown").isDisplayed()) {
			value = true;
			System.out.println(element("Number_inDropdown").getText() + "is the number");
		} else {
			value = false;
			System.out.println(element("Number_inDropdown").getText() + "number not displayed");
		}
		return value;

	}

	/**
	 * Used to select data plan
	 * 
	 */
	public void selectDataPlan() throws InterruptedException {
		System.out.println(element("Text_FreeData").getText());
		element("Data").click();
		Thread.sleep(1000);
		System.out.println(element("Text_FreeData").getText());
	}

	/**
	 * Used to verify selected data plan
	 * 
	 */

	public boolean verify_SelectedDataPlan() throws InterruptedException {
		boolean value = false;

		if (element("Text_FreeData").getText().contains("10X Social Media Package")) {
			value = false;
			Thread.sleep(1000);
			System.out.println("data cannot be selected");
		} else {
			value = true;
			System.out.println("Data is selected");
		}
		return value;
	}

	/**
	 * Used to select get plan button on create popup
	 * 
	 */

	public void selectGetPlan_OnCreatePopup() throws InterruptedException {
		element("National_Minute").click();
		Thread.sleep(1000);
		element("Data").click();
		Helper.scrollDown();
		Thread.sleep(1000);
		element("GetPlan_OnPopupButton").click();
	}

	/**
	 * Used to click on Package card button
	 * 
	 */
	public void click_PackageCard() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(1000);
		element("PackageCard_button").click();
	}

	/**
	 * Used to verify package card button is clickable
	 * 
	 */

	public boolean verify_PackageButtonClickable() throws InterruptedException {
		boolean value = false;
		String parent = session.driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		System.out.println("Total number of tabs opened are" + count);
		if (count > 1) {
			value = true;
			ArrayList<String> tabs = new ArrayList<>(child);
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to verify package button redirect to pdf file
	 * 
	 */

	public boolean verify_PackagePdfFileTitle() throws InterruptedException {
		boolean value = false;
		// String Pdf_ExpectedUrl=
		// "https://vm-ksa-po-frontend-staging.s3.ap-southeast-1.amazonaws.com/config-images/e84c3f1f-4875-44e4-8cde-d8e8154e34d9.pdf";
		String parent = session.driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> child = session.driver.getWindowHandles();
		int count = child.size();
		ArrayList<String> tabs = new ArrayList<>(child);
		session.driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		String Pdf_ActualURL = session.driver.getCurrentUrl();
		if (Pdf_ActualURL.contains(".pdf")) {
			value = true;
			session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to click package button on your plan page
	 * 
	 */

	public void click_PackageButton() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(1000);
		element("Package_button").click();
	}

	/**
	 * Used to click get plan button under 70 sar popup
	 * 
	 */

	public void clickGetPlan_on70PlanPopup() throws InterruptedException {
		if (element("ImageLink_250PopUp").isDisplayed()) {
			clickLeftArrow();
			Thread.sleep(1000);
			element("GetPlan_70Button").click();
			Thread.sleep(4000);
		} else {
			Helper.scrollDown();
			Thread.sleep(1000);
			element("GetPlan_70Button").click();
			Thread.sleep(4000);

		}
	}

	/**
	 * Used to select ID drop-down value
	 * 
	 */

	public void click_IDDropDown(String Text) throws InterruptedException {
		element("ID_DropDown").click();
		Thread.sleep(1000);
		Select select = new Select(element("ID_DropDown"));
		select.selectByVisibleText(Text);
	}

	/**
	 * Used to verify ID_Dropdown value
	 * 
	 */

	public boolean verify_IDDropdown() {
		boolean value = false;

		if (element("Value_InDropdown").isSelected()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to verify_ID_Nationality_City fields are selected
	 * 
	 */

	public boolean verify_IdNum_Nationality_City_FieldsAreDisplayed() throws InterruptedException {
		boolean value = false;
		Helper.scrollDown();
		Thread.sleep(1000);
		if (element("IdNumber_Field").isDisplayed() && element("Nationality_Field").isDisplayed()
				&& element("CityInKSA_Field").isDisplayed()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to Enter Invalid details under Eligibility page
	 * 
	 */

	public void enterIDNum_Nationality_ID_City(String ID, String ID_Number, String Nationality, String City)
			throws InterruptedException {
		element("ID_DropDown").click();
		Thread.sleep(1000);
		Select select = new Select(element("ID_DropDown"));
		select.selectByVisibleText(ID);
		Thread.sleep(1000);
		element("IDNum_TextField").sendKeys(ID_Number);
		Thread.sleep(1000);
		Select select1 = new Select(element("Nationality_Dropdown"));
		select1.selectByVisibleText(Nationality);
		Thread.sleep(1000);
		Select select2 = new Select(element("CityInKSA_Dropdown"));
		select2.selectByVisibleText(City);
	}

	/**
	 * Used to click Check box button
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public boolean click_CheckBox() throws InterruptedException {
		boolean value = false;

		if (element("Check_Button").isEnabled()) {
			value = true;
			element("Check_Button").click();
			Thread.sleep(1000);
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * Used to verify Sorry page
	 * 
	 */

	public boolean verify_SorryPage() {

		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='eligibility-title eligibility-failed-title']")));
		return status.isDisplayed();

	}

	/**
	 * Used to Click ReEnter button on Sorry page
	 * 
	 */

	public void click_ReEnterButton() {
		element("ReEnter_Button").click();
	}

	/**
	 * Used to verify Congratulation page
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public boolean verify_CongratulationPage() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[text()='CONGRATULATIONS']")));
		return status.isDisplayed();
		
	}

	/**
	 * Used to Click continue button on congratulation page
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public void click_ContinueButton() throws InterruptedException {
		element("Continue_button").click();
		Thread.sleep(2000);
	}

	/**
	 * Used to verify Create account page
	 * 
	 */

	public boolean verify_CreateAccountPage() {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//span[contains(text(),'ACCOUNT')]")));
		return status.isDisplayed();
		
	}

	/**
	 * Used to verify Active_Inactive for social media links
	 * 
	 */

	public boolean verify_SocialMediaLink() throws InterruptedException {
		boolean value = false;

		Helper.scrollDown();
		Thread.sleep(2000);

		boolean Google_Status_Before = element("Google_Link").isEnabled();
		boolean Twitter_Status_Before = element("Twitter_link").isEnabled();
		Thread.sleep(2000);
		element("Agree_Checkbox").click();
		Thread.sleep(4000);
		boolean Google_Status_After = element("Google_Link").isEnabled();

		System.out.println(Google_Status_Before + "Status of google link before click");

		if (Google_Status_Before == Google_Status_After) {
			value = true;
		} else {
			value = false;
		}

		return value;
	}

	/**
	 * Used to enter Email and passord in Create account page
	 * 
	 */

	public void enter_EmailPassword(String email, String password) throws InterruptedException {
		
		element("Email_Field").sendKeys(email);
		element("Password_Field").sendKeys(password);
		Thread.sleep(1000);
		
	}

	/**
	 * Used to click Create account button
	 * 
	 */
	public boolean click_CreateAccount() throws InterruptedException {
		boolean value = false;

		if (element("CreateAccount").isEnabled()) {
			element("CreateAccount").click();
			value = true;
			Thread.sleep(2000);
		} else {
			value = false;
		}

		return value;
	}

	/**
	 * Used to verify error message for already registered credentials in Create
	 * account page
	 * 
	 */

	public boolean verify_errorPageOnCreateAccount() {
		boolean value = false;

		String title = element("Progress_Title").getText();
		System.out.println(title);
		if (title.contains("Absher Verification")) {
			System.out.println("Absher Login page opens");
			value = false;
		} else {
			value = true;
			System.out.println("Abserlogin page not opened");
		}
		return value;
	}

	/**
	 * Used to verify Absher login page
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public boolean verify_AbsherLogin() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[text()='Absher Login']")));
		return status.isDisplayed();
		
	}

	/**
	 * Used to verify Absher login page is scrollable or not
	 * 
	 */

	public boolean verify_ScrollUp_ScrollDown() throws InterruptedException {
		boolean value = true;
		Helper.scrollDown();
		Thread.sleep(1000);
		Helper.scrollUp();
		Thread.sleep(1000);
		return value;
	}

	/**
	 * Used to click Abser login button
	 * 
	 */

	public void click_AbsherLogin() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(1000);
		element("Absher_Button").click();
	}

	/**
	 * Used to verify after clicking Absher login button, i redirect to LP section
	 * page
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public boolean verify_LpSectionpage() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@id='lbtn_dummyToken']")));
		return status.isDisplayed();
		
	}

	/**
	 * Used to click Dummy IAM token
	 * 
	 */

	public void click_DummyIAMToken() throws InterruptedException {
		Thread.sleep(2000);
		element("DummyIAM_Token").click();
	}

	/**
	 * Used to verify getting sim page
	 * 
	 */

	public boolean verify_GettingSimpage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//label[@class='form-lbl sim_number_field_option']")));
		return status.isDisplayed();
	}

	/**
	 * Used to verify virgin sim checkbox is clickable
	 * 
	 */

	public boolean verify_VirginCheckboxclickable() {
		boolean value = false;

		if (element("VirginSim_Checkbox").isSelected()) {
			System.out.println("checkbox is selected by default");
			value = false;
		} else {
			element("VirginSim_Checkbox").click();
			System.out.println("checkbox is not selected by default");
			value = true;
		}

		return value;
	}

	/**
	 * Used to enter sim number
	 * 
	 */

	public void enter_NumberinSimField(String Number) throws InterruptedException {
		element("Sim_TextField").sendKeys(Number);
		Thread.sleep(1000);
	}

	/**
	 * Used to click continue button under getting sim page
	 * 
	 */

	public boolean click_continueButton() {
		boolean value = false;

		if (element("ContinueSim_Button").isEnabled()) {
			element("ContinueSim_Button").click();
			value = true;
		} else {
			value = false;
		}

		return value;
	}

	/**
	 * Used to verify next page after entering sim
	 * 
	 */

	public boolean verify_NextPageAfterSim() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[text()='SOMETHING'S GONE WRONG']")));
		return status.isDisplayed();

	}

	/**
	 * Used to click try again button under error page after entering sim in getting
	 * sim page
	 * 
	 */

	public boolean click_TryAgain() throws InterruptedException {
		
		element("TryAgain_Button").click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//label[@class='form-lbl sim_number_field_option']")));
		return status.isDisplayed();
	}
	
	/**
	 *Used to click on eSim checkbox
	 * 
	 */

	public void click_eSimCheckbox(){
		element("eSim_Checkbox").click();
	}
	
	/**
	 *Used to verify card detail page
	 * 
	 */
	
	public boolean verify_cardDetailPage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//span[contains(text(),'YOUR STUFF')]")));
		return status.isDisplayed();
	}
	
	/**
	 *Used to enter card detail 
	 * 
	 */
	
	public void enter_CardDetails(String card, String cardName, String expiry, String CVV) throws InterruptedException {
		element("CardNumber_Field").sendKeys(card);
		Thread.sleep(1000);
		element("CardHolder_Field").sendKeys(cardName);
		Thread.sleep(1000);
		element("Expiry_Field").sendKeys(expiry);
		Thread.sleep(1000);
		element("CVV_Field").sendKeys(CVV);
		Thread.sleep(1000);
	}
	
	/**
	 *Used to verify visibility of card details
	 * 
	 */
	
	public boolean verify_visibilityForDONEButton(){
		boolean value=false;
		
		if(element("DoneBtn_CarPage").isEnabled()) {
			value=false;
		}else {
			value=true;
		}
		
		return value;
	}
	
	/**
	 *Used to click done button on card detail page
	 * 
	 */
	
	public boolean click_DonebuttonInCardPage() {
		boolean value=false;
		
		if(element("DoneBtn_CarPage").isEnabled()) {
			value=true;
			element("DoneBtn_CarPage").click();
		}else {
			value=false;
		}
		
		return value;
	}
	
	/**
	 *Used to verify card ACS Emulator page
	 * 
	 */
	
	public boolean verify_ACSEmulatorpage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//td[text()='411111xxxxxx1111']")));
		return status.isDisplayed();
	}
	
	/**
	 *Used to verify back button under ACS Emulator
	 * 
	 */
	
	public void click_backbuttononBrowser() throws InterruptedException{
		Thread.sleep(1000);
		session.driver.navigate().back();
	}
	
	/**
	 *Used to verify success page after click on submit button on ACS Emulator page
	 * 
	 */
	
	public boolean verify_SuccessPageAfterACSEmu(){
		element("Submit_Button").click();
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[text()='YOUR PAYMENT IS COMPLETE']")));
		return status.isDisplayed();
	}
	
	/**
	 *Used to click Get Sim delivered checkbox
	 * @throws InterruptedException 
	 * 
	 */
	
	public void click_GetSimDelivered() throws InterruptedException{
		element("GetSimDelivered_Checkbox").click();
		Thread.sleep(1000);
	}
	/**
	 *Used to click JoinNow in Mobile 
	 * 
	 */
	public void JoinNowMobileClick() {
		element("JoinNowMobile").click();
	}
}
