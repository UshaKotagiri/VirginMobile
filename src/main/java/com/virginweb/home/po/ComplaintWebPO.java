package com.virginweb.home.po;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;

import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class ComplaintWebPO extends MobileWebViewPage {

	public ComplaintWebPO(TestSession session) throws Exception

	{

		super(session, "Applications/virginweb/ComplaintWeb");

	}

	/**
	 * 
	 * complain tab
	 * 
	 * 
	 * 
	 */

	public void complainTab() {

		element("complain").click();

	}

	/**
	 * 
	 * verify complain page is displayed
	 * 
	 */

	public boolean complainPage() {

		return element("complainp").isDisplayed();

	}

	/**
	 * 
	 * verify scroll complain page
	 * 
	 */

	public boolean scrollComplainPage() throws InterruptedException {

		JavascriptExecutor j = (JavascriptExecutor) session.driver;

		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		element("scrollDown").isDisplayed();

		Thread.sleep(3000);

		j.executeScript("window.scrollBy(0,0)");

		return element("complainp").isDisplayed();

	}

	/**
	 * 
	 * scroll virgin logo page
	 * 
	 */

	public boolean virginLogo() {

		return element("virginlogo").isDisplayed();

	}

	/**
	 * 
	 * verify terms for offering telecom service button is displayed
	 * 
	 */

	public boolean checkTermsForOffering() {

		return element("Termsoffering").isDisplayed();

	}

	/**
	 * 
	 * clicks on terms for offering telecom service button
	 * 
	 */

	public void clickTermsForOffering() {

		element("Termsoffering").click();

	}

	/**
	 * 
	 * verify terms for offering telecom service button
	 * 
	 */

	public boolean TermsForOfferIngPage() {

		return element("Termsofferingp").isDisplayed();

	}

	/**
	 * 
	 * click on customer right in complain page
	 * 
	 */

	public void clickCustomerRight() {

		element("customerrights").click();

	}

	/**
	 * 
	 * verify customer right page is displayed
	 * 
	 */

	public boolean customerRightPage() {

		return element("customerrightp").isDisplayed();

	}

	/**
	 * 
	 * click on raise a complaint
	 * 
	 */

	public void raiseComplain() {

		element("raiseComplain").click();

	}

	/**
	 * 
	 * verify complaint page is displyaed
	 * 
	 * @return
	 * 
	 */

	public boolean complainTicketPage() {

		return element("ComplainTicket").isDisplayed();

	}

	/**
	 * enter correct details in contact text field
	 * 
	 * @throws InterruptedException
	 */

	public void validContactNumber() throws InterruptedException {

		element("contactTextField").sendKeys("573994772");

		element("VerificationCode").click();

		Thread.sleep(10000);

		element("otp").sendKeys("123456");

		Thread.sleep(10000);

		element("verifybutton").click();

	}

	/**
	 * enter invalid contact number
	 * 
	 * @throws InterruptedException
	 */

	public void invalidContactNumber() throws InterruptedException {

		element("contactTextField").sendKeys("235466432");

		element("VerificationCode").click();

		Thread.sleep(10000);

		element("errorcontact").isDisplayed();

	}

	/**
	 * verify error contact message is displayed
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public boolean errorInContactDisplayed() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(session.driver, 60);

		boolean status = wait.until(ExpectedConditions.visibilityOf(element("errorcontact"))).isDisplayed();
		Thread.sleep(8000);

		return status;

	}

	/**
	 * verify sorry page is displayed
	 * 
	 * @return
	 */
	public boolean sorryContactPage() {

		return element("SorryPae").isDisplayed();

	}

	/**
	 * 
	 * verification text field display
	 * 
	 */

	public boolean verificationCodeDisplayed() {

		return element("vericationMessage").isDisplayed();

	}

	/**
	 * 
	 * click on resend button
	 * 
	 */

	public void resendClick() {

		element("Resendotp").click();

	}

	/**
	 * 
	 * You can resend after 24 seconds message display
	 * 
	 */

	public boolean resendMessageDisplayed() {

		return element("ResendMessage").isDisplayed();

	}

	/**
	 * 
	 * one time password message display
	 * 
	 */

	public boolean timePasswordDisplayed() {

		return element("vericationMessage").isDisplayed();

	}

	/**
	 * enter correct otp details
	 * 
	 * @throws InterruptedException
	 */
	public void otpClick() throws InterruptedException {

		element("otp").sendKeys("123456");

		Thread.sleep(10000);

		element("verifybutton").click();

	}

	/**
	 * 
	 * hamburger is displayed left or not
	 * 
	 */

	public boolean burgerLeftShown() {

		boolean value = false;

		WebElement burger = element("hamburger");

		int x = burger.getLocation().getX();

		System.out.println("left corner " + x);

		if (x >= 316)

		{

			value = true;

		}

		else

		{

			value = false;

		}

		return value;

	}

	/**
	 * 
	 * dropdown option in hamburger
	 * 
	 */

	public boolean dropdownburgershown() {

		return element("WhyVirgin").isDisplayed() && element("complaintext").isDisplayed()
				&& element("planMobile").isDisplayed();

	}

	/**
	 * click on complain text
	 */

	public void complainText() {

		element("complaintext").click();

	}

	/**
	 * 
	 * contact us page is displayed
	 * 
	 */

	public boolean contactUsDisplayed() {

		return element("contactusP").isDisplayed();

	}

	/**
	 * 
	 * verify country code is displayed
	 * 
	 * @return
	 * 
	 */

	public boolean contactnumbertextDisplayed() {

		Boolean value = true;

		if (element("contactTextField").isDisplayed())

		{

			value = true;

			element("contactTextField").click();

		} else

		{

			value = false;

		}

		return value;

	}

	/**
	 * verify contact country code is displayed
	 * 
	 * @return
	 */

	public boolean contactCodeTextDisplayed() {

		return element("contactCountryCode").isDisplayed();

	}

	/**
	 * verify country code is displayed
	 * 
	 * @return
	 */

	public boolean verificatiOnCodeButtonDisplayed() {

		Boolean value = true;

		if (element("contactCountryCode").isDisplayed())

		{

			value = true;

			element("contactTextField").click();

		} else

		{

			value = false;

		}

		return value;

	}

	/**
	 * 
	 * verify you number, ticket detais , confirmation is displayed
	 * 
	 */

	public boolean ticketDetailsDisplayed() {

		return element("confirmation").isDisplayed() && element("ticketDetail").isDisplayed()
				&& element("yourNumber").isDisplayed();

	}

	/**
	 * 
	 * enter all valid data on ticket details
	 * 
	 */

	public void validMailsClick() throws InterruptedException {

		element("emailcontact").sendKeys("hg214f22@gmail.com");

		element("subject").sendKeys("Roaming");

		WebElement net = element("network");

		Select s = new Select(net);

		s.selectByVisibleText("Billing");

		WebElement category = element("subCategory");

		Select s1 = new Select(category);

		s1.selectByVisibleText("Activation After Payment");

		element("Message").sendKeys("Roaming Is not active");

		Thread.sleep(8000);

	}

	/**
	 * 
	 * click on go back button
	 * 
	 */

	public void goBacksClick() {

		element("goback").click();

	}

	/**
	 * 
	 * click on contact us
	 * 
	 */

	public void contactUsClick() {

		element("contactus").click();

	}

	/**
	 * 
	 * verify contactus and sorry page is displayed
	 * 
	 * @return
	 * 
	 */

	public boolean conactAndGoBackPage() {

		return element("contactus").isDisplayed() && element("goback").isDisplayed();

	}

	/**
	 * verify Ticket page is displayed
	 * 
	 * @return
	 */
	public boolean emailPage() {

		return element("createTicket").isDisplayed();

	}

	/**
	 * enter the detail of email and subject in ticket details field
	 */

	public void mailAndSubjectClick() {

		element("emailcontact").sendKeys("9Tesft@mailinator.com");

		element("subject").sendKeys("Roaming");

	}

	/**
	 * 
	 * verify that the category dropdown appears in the category section
	 * 
	 * @return
	 * 
	 */

	public boolean Categoryshown() {

		Boolean value = true;

		WebElement net = element("network");

		System.out.println("default option " + net.getText());

		if (net.getText().equals("Category"))

		{

			value = true;

		} else

		{

			value = false;

		}

		return value;

	}

	/**
	 * 
	 * verify the Add sub category dropdown appears in the sub category section
	 * 
	 */

	public boolean subCategoryshown() {

		Boolean value = true;

		WebElement net = element("network");

		Select s = new Select(net);

		s.selectByVisibleText("eSIM");

		WebElement net1 = element("subCategory");

		System.out.println("default option " + net.getText());

		if (net.getText().equals("Category"))

		{

			value = true;

		} else

		{

			value = false;

		}

		return value;

	}

	/**
	 * 
	 * click on subcategory
	 * 
	 */

	public void subcategoryClick() {

		WebElement net = element("network");

		Select s = new Select(net);

		s.selectByVisibleText("eSIM");

		WebElement net1 = element("subCategory");

		Select s1 = new Select(net1);

		s1.selectByVisibleText("Subcategory");

	}

	/**
	 * 
	 * verify customer responsibility page
	 * 
	 * @return
	 * 
	 */

	public boolean customerResponsibilityPage() {

		return element("network").isDisplayed();

	}

	/**
	 * 
	 * click on customer right and responsibility
	 * 
	 */

	public void customerRightClick() {

		element("custmerResponsibity").click();

	}

	/**
	 * verify submit button is hightlighted
	 * 
	 * @return
	 */
	public boolean submitButton() {
		return element("verifybutton").isSelected();
	}

	/**
	 * verify network and subacategory is persent
	 * 
	 */
	public boolean subcategoryCheck(String category, int subcategory) {
		boolean status = false;
		WebElement net = element("network");
		Select s = new Select(net);
		s.selectByVisibleText(category);
		WebElement dropDownElement = element("subCategoryDropdown");
		dropDownElement.click();
		Select s1 = new Select(dropDownElement);
		List<WebElement> all = s1.getOptions();
		int value = all.size();
		System.out.println("size===>>> " + value);
		for (int i = 0; i < all.size(); i++) {
			String dropdown_value = all.get(i).getText();
			System.out.println("dropdown values are " + dropdown_value);
		}
		if (value == subcategory) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

}
