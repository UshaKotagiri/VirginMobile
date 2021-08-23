package com.virginweb.home.po;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class OnboardingPaymentPO extends MobileWebViewPage {
	public OnboardingPaymentPO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/OnboardingPayment");

	}

	/**
	 * check humburger is shown left side or not
	 * 
	 * @return
	 */
	public boolean burgerleftshown() {
		boolean value = false;
		WebElement burger = element("hamburger");
		int x = burger.getLocation().getX();
		int y = burger.getLocation().getY();
		System.out.println("left corner " + x);
		if (x >= 316) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * click on hamburger
	 */
	public void hamburgerClick() {

		element("hamburger").click();
	}

	/**
	 * dropdown option in hamburger
	 */
	public boolean dropdownburgershown() {
		return element("WhyVirgin").isDisplayed() && element("complaintext").isDisplayed()
				&& element("planMobile").isDisplayed();
	}

	/**
	 * click on get help in progress dropdown
	 * 
	 * @throws InterruptedException
	 */
	public void GetHelpClick() throws InterruptedException {
		element("Paymentdropdown").click();
		Thread.sleep(10000);
		element("GetHelp").click();
	}

	/**
	 * verify that help page is displayed in next tab or not
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean HelpPageDisplayed() throws InterruptedException {
		boolean value = false;
		Thread.sleep(10000);
		ArrayList<String> tabs = new ArrayList<String>(session.driver.getWindowHandles());
		session.driver.switchTo().window(tabs.get(1));
		session.driver.navigate().refresh();
		return element("HelpPage").isDisplayed();
	}

	/**
	 * click on pay online in pay stuff page
	 */
	public void payOnstuff() {
		element("PayOnline").click();
	}

	/**
	 * check card text field is displayed
	 */
	public boolean CreditcardPage() {

		return element("cardholdertext").isDisplayed();
	}

	/**
	 * check it is clickable or not
	 */
	public boolean cardNumberDisplayed() {
		boolean value = false;
		if (element("card").isDisplayed()) {
			element("card").click();
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * check the validation of card detail
	 */
	public boolean cardNumberValidation() {
		boolean value = false;
		element("card").sendKeys("4111 1111 1111 1111");
		String card = element("card").getText();
		String regex = "^[A-Za-z%@!~#&()_+$]+";

		if (card.matches("[" + regex + "]+")) {
			value = false;
			System.out.println("Invalid character in Name field");
		} else {
			System.out.println("valid");
			value = true;
		}
		return value;
	}

	/**
	 * click on get this plan in nhome page
	 * 
	 */
	public void clickmethod() {
		element("planis").click();
	}

	/**
	 * click on plan in plan & product
	 */
	public void planMobileclick() {
		element("GetThisPlanMob").click();
	}

	/**
	 * click on pick your number text box
	 * 
	 * @throws InterruptedException
	 */
	public void picknumber() throws InterruptedException {
		Thread.sleep(8000);
		element("pick").click();

	}

	/**
	 * verify pick your page is displayed
	 */
	public boolean pickpage() {

		return element("picknumberpage").isDisplayed();
	}

	/**
	 * click on book it now button
	 * 
	 * @return
	 */
	public void bookitnow() {
		element("bookitnow").click();

	}

	/**
	 * verify check eligibility page is displayed
	 */
	public boolean eligibilityPage() {

		return element("eligbbility").isDisplayed();
	}

	/**
	 * check cardholder field is visible or clickable
	 */
	public boolean CardHolderField() {
		boolean value = false;
		if (element("cardholdertext").isDisplayed()) {
			value = true;
			element("cardholder").sendKeys("PRADIP KUMAR");
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * character validation for card holder
	 */
	public boolean CardHolderCharValidation() {
		boolean value = false;
		String card = element("cardholder").getText();
		String regex = "A-Z ";

		if (card.matches("[" + regex + "]+")) {
			value = true;
			System.out.println("valid character in Name field");
		} else {
			System.out.println("invalid");
			value = true;
		}
		return value;
	}

	/**
	 * check expiry date text field is displayed
	 */
	public boolean ExpiryDateInput() {
		boolean value = false;
		if (element("expiryText").isDisplayed()) {
			value = true;
			element("expirydate").sendKeys("03/30");
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * check expiry date character validation
	 */
	public boolean expiryDateValidation() {
		boolean value = false;
		String card = element("expirydate").getText();
		String regex = "0-9/";

		if (card.matches("[" + regex + "]+")) {
			value = true;
			System.out.println("valid character in Name field");
		} else {
			System.out.println("invalid");
			value = true;
		}
		return value;
	}

	/**
	 * click on absher login
	 * 
	 * @throws InterruptedException
	 */
	public void clickabsherLogin() throws InterruptedException {
		Thread.sleep(9000);
		element("Absherlogin").click();
	}

	/**
	 * verify congratualtion page is displayed
	 * 
	 * @return
	 */
	public boolean congratulations() {
		return element("congrats").isDisplayed();
	}

	/**
	 * enter all the detail in check eligibility page
	 * 
	 * @throws InterruptedException
	 */
	public void validplantext() throws InterruptedException {
		Thread.sleep(10000);
		WebElement visa = element("visitvisa");
		Select s = new Select(visa);
		s.selectByVisibleText("Iqama");
		WebElement id = element("IdNumber");
		id.clear();
		id.sendKeys("2000000006");
		WebElement nation = element("nationality");
		Select s1 = new Select(nation);
		Thread.sleep(5000);
		s1.selectByVisibleText("Bangladesh");
		WebElement City = element("city");
		Select s2 = new Select(City);
		Thread.sleep(5000);
		s2.selectByVisibleText("Mecca");
		Thread.sleep(5000);
		element("check").click();

	}

	/**
	 * scroll up and down the absher login page
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean scrollabsherpage() throws InterruptedException {
		JavascriptExecutor j = (JavascriptExecutor) session.driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,0)");
		return element("Absherpa").isDisplayed();
	}

	/**
	 * verify different option is shown when I c
	 * 
	 * @returnA
	 */
	public boolean DifferentoptionInmobileDisplay() {

		return element("DifferentMobile").isDisplayed();
	}

	public void getplanMobileclick() {
		element("GetThisPlanMob").click();
	}

	/**
	 * check cvv text field is displayed
	 */
	public boolean cvvCharValidation() {
		boolean value = false;
		if (element("cvvText").isDisplayed()) {
			value = true;
			element("cvv").sendKeys("330");
		} else {
			value = false;
		}
		return value;
	}

	/**
	 * check character validation of cvv text field
	 */
	public boolean CvvField() {
		boolean value = false;
		String card = element("cvv").getText();
		String regex = "0-9";

		if (card.matches("[" + regex + "]+")) {
			value = true;
			System.out.println("valid character in Name field");
		} else {
			System.out.println("invalid");
			value = true;
		}
		return value;
	}

	/**
	 * click on continue button
	 * 
	 * @throws InterruptedException
	 */
	public void continueClick() throws InterruptedException {
		Thread.sleep(8000);
		element("continueButton").click();

	}

	/**
	 * click on return dummy
	 */
	public void returnDummyclick() {
		element("returnDummy").click();
	}

	/**
	 * verify login sp section is displayed
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean loginspDisplay() throws InterruptedException {
		Thread.sleep(8000);
		return element("logintoSP").isDisplayed();
	}

	/**
	 * click on pay online button
	 */
	public void payonlinebutton() {

		element("PayOnline").click();
	}

	/**
	 * verify pay for your stuff page is displayed
	 */
	public boolean payForStuffDisplay() {
		return element("payforstuffPage").isDisplayed();
	}

	/**
	 * click on create account
	 */
	public void createAccountClick() {
		element("email").sendKeys("9Tester@mailinator.com");
		element("pass").sendKeys("Test@123");
		element("createAccount").click();

	}

	public boolean simdelivered() {
		element("getMeSIm").click();
		return element("getMeSIm").isSelected();
	}

}
