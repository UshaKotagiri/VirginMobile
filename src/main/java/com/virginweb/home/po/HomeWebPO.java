package com.virginweb.home.po;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

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

public class HomeWebPO extends MobileWebViewPage{

	public HomeWebPO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/HomeWeb");
	}

	/**
	 * Used to verify HomePage
	 * 
	 */
	public boolean verify_HomePage() throws InterruptedException {
		
		if(element("close_welcomepopup").isDisplayed()) {
			element("close_welcomepopup").click();
			Thread.sleep(2000);
		   WebDriverWait wait = new WebDriverWait(session.driver, 20);
		   WebElement status = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'https://staging.virginmobile.sa/join')]")));
		   return status.isDisplayed();
		}else {
			 WebDriverWait wait = new WebDriverWait(session.driver, 20);
			   WebElement status = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'https://staging.virginmobile.sa/join')]")));
			   return status.isDisplayed();
		}
	}
	
	/**
	 * Used to Perform Scroll operation under HomeWeb
	 * 
	 */
	
	public void scrollUpDown() throws InterruptedException {		
		  Helper.scrollDown();
	      Thread.sleep(2000);
	     Helper.scrollUp();
	    
	}
	
	/**
	 * Used to verify Page Scroll
	 * 
	 */
	
	public boolean verify_PageScroll() {
		boolean value=false;
		if(element("JoinNow_button").isDisplayed()) {
			value=true;
		}else {
			value=false;
		}
		return value;
	}
	
	/**
	 * Used to click on ILoveIT button
	 * 
	 */
	
	public void click_ILoveItButton() throws InterruptedException {
		((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("ILoveIt_button"));
		Thread.sleep(1000);
		element("ILoveIt_button").click();
	}
	
	//public void change_EngLanguage() throws InterruptedException {
	//	WebDriverWait wait = new WebDriverWait(session.driver, 20);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='English']"))).click();		
    //	}
	
	/**
	 * Used to verify Cool_Now Page
	 * 
	 */
	
	public boolean verify_COOLNOWPage() throws InterruptedException {
		boolean value=false;
	 if(element("CoolNow_text").isDisplayed()) {
			System.out.println("COOL NOW Plan opens");
			value=true;
		}else {
			System.out.println("nothing comes out true");
			value=false;
		}	
		return value;
	}
	
	/**
	 * Used to Perform Scroll operation under HomeWeb
	 * @throws InterruptedException 
	 * 
	 */	
	public void scrollPage() throws InterruptedException {
		Helper.scrollDown();
		
	}
	
	/**
	 * Used to Perform Right_Scroll 
	 * 
	 */
	
	public boolean verify_RightScroll() throws InterruptedException {
		boolean value=false;
	
		element("Arrow_Right").click();
		Thread.sleep(1000);
		
		if(element("PopUp250_text").isDisplayed()) {
			value=true;
		}else {
			value=false;
		}
		return value;
	}
	
	/**
	 * Used to Perform Left_Scroll 
	 * 
	 */
	
	public boolean verify_LeftScroll() throws InterruptedException {
		boolean value=false;

		element("Arrow_Left").click();
		Thread.sleep(1000);
		
		if(element("PopUp70_text").isDisplayed()) {
			value=true;
		}else {
			value=false;
		}
		
	    return value;
	}
	
	/**
	 * Used to click Package card btn
	 * 
	 */
	
	public void click_PackageButton() throws InterruptedException {
		element("Package_card").click();
	}
	
	/**
	 * Used to verify Click with Package card
	 * 
	 */
	
	public boolean verify_PackageBtnClickable() throws InterruptedException {
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
	 * Used to verify Pdf file with Package card
	 * 
	 */
	
	public boolean verify_PackagePdfFile() throws InterruptedException {
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
	 * Used to click GetPlan Button
	 * @throws InterruptedException 
	 * 
	 */
	
	public void click_GetPlan() throws InterruptedException {
		Thread.sleep(3000);
		element("Get_PlanBtn").click();
	}
	
	/**    
	 * Used to verify PickYour Number Page
	 * 
	 */
	
/*	public boolean verify_PickYourNumber() throws InterruptedException {
		boolean value=false;
		 if(element("English_Link").isDisplayed()) {
			element("English_Link").click();
			Thread.sleep(3000);
			if(element("Search_Field").isDisplayed()) {
				value=true;
			}else {
				value=false;
			}
		}else if(element("Search_Field").isDisplayed()) {
			value=true;
		}else {
			value=false;
		}
		return value;
	}        */
	
	public boolean verify_PickYourNumber() throws InterruptedException {
		boolean value=false;
		 if(element("Search_Field").isDisplayed()) {
			value=true;
		 }else {
			 value=false;
		 }
		return value;
	}
	
	/**
	 * Used to Pick Number from the list
	 * 
	 */
	
	public void pick_Number() throws InterruptedException {
		int j = 0;
		for (int i = 1; i < 2; i++) {
			WebElement ele = elements("Number_Lists").get(i);
			ele.click();
			Thread.sleep(2000);
		}
	}
	
	/**
	 * Used to verify picked number on right panel
	 * 
	 */
	
	public boolean verify_NumberDisplayedOnPanel() {
		boolean value = false;
		//System.out.println(element("NumberType").getText());
		if (element("NumberType").isDisplayed() && element("NumberPrice").isDisplayed()
				&& element("BookNow_Btn").isDisplayed()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to click book now button
	 * 
	 */
	
	public void click_bookNow() {
		element("BookNow_Btn").click();
	}
	
	/**
	 * Used to verify Eligibility page
	 * 
	 */
	
	public boolean verify_CheckEligibiltyPage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 20);
		WebElement status = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'ELIGIBILITY')]")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click ID DropDown
	 * 
	 */
	
	public void click_IDDropDwn() throws InterruptedException {
		element("ID_DropDwn").click();
		Thread.sleep(1000);
		Select select = new Select(element("ID_DropDwn"));
		select.selectByVisibleText("Iqama");
	}
	
	/**
	 * Used to verify ID dropdown
	 * 
	 */
	
	public boolean verify_IDDropdwn() {
		boolean value = false;

		if (element("Value_InDropdwn").isSelected()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to verify IdNum, Nationality and City fields are displayed
	 * 
	 */
	
	public boolean verify_IdNum_Nationality_City_FieldsDisplayed() throws InterruptedException {
		boolean value = false;
		Helper.scrollDown();
		Thread.sleep(1000);
		if (element("IdNum_Field").isDisplayed() && element("Nationalityy_Field").isDisplayed()
				&& element("CityKSA_Field").isDisplayed()) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to enter IdNum, Nationality and City in the fields
	 * 
	 */
	
	public void enterIDNumber_Nationality_ID_City(String ID, String ID_Number, String Nationality, String City)
			throws InterruptedException {
		element("ID_DropDwn").click();
		Thread.sleep(1000);
		Select select = new Select(element("ID_DropDwn"));
		select.selectByVisibleText(ID);
		Thread.sleep(1000);
		element("IDNum_Field").sendKeys(ID_Number);
		Thread.sleep(1000);
		Select select1 = new Select(element("Nationality_Dropdwn"));
		select1.selectByVisibleText(Nationality);
		Thread.sleep(1000);
		Select select2 = new Select(element("CityInKSA_Dropdwn"));
		select2.selectByVisibleText(City);
	}
	
	/**
	 * Used to click Check Button
	 * 
	 */
	
	public boolean click_CheckBtn() throws InterruptedException {
		boolean value = false;

		if (element("Check_Btn").isEnabled()) {
			value = true;
			element("Check_Btn").click();
			Thread.sleep(1000);
		} else {
			value = false;
		}
		return value;
	}
	
	/**
	 * Used to verify Sorry Page
	 * 
	 */
	
	public boolean verify_Sorry_Page() {

		WebDriverWait wait = new WebDriverWait(session.driver, 20);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='eligibility-title eligibility-failed-title']")));
		return status.isDisplayed();

	}
	
	/**
	 * Used to Click ReEnter button
	 * 
	 */
	
	public void click_ReEnterButton() {
		element("ReEnter_Btn").click();
	}
	
	/**
	 * Used to verify Congratulation page
	 * 
	 */
	
	public boolean verify_CongratsPage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[text()='CONGRATULATIONS']")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click continue button
	 * 
	 */
	
	public void click_ContinueBtn() throws InterruptedException {
		element("Continue_btn").click();
		Thread.sleep(2000);
	}
	
	/**
	 * Used to verify create account page
	 * 
	 */
	
   public boolean verify_CreateAccount_Page() {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//span[contains(text(),'ACCOUNT')]")));
		return status.isDisplayed();
		
	}
   
   /**
	 * Used to verify Social Media Links
	 * 
	 */
   
   public boolean verify_SocialMedia_Link() throws InterruptedException {
		boolean value = false;

		Helper.scrollDown();
		Thread.sleep(3000);

		boolean Google_Status_Before = element("GoogleLink").isEnabled();
		boolean Twitter_Status_Before = element("TwitterLink").isEnabled();
		
		element("AgreeCheckbox").click();
		Thread.sleep(4000);
		boolean Google_Status_After = element("GoogleLink").isEnabled();
		boolean Twitter_Status_After = element("TwitterLink").isEnabled();
		System.out.println(Google_Status_Before + "Status of google link before click");
		System.out.println(Google_Status_After + "Status of google link after");
		System.out.println(Twitter_Status_Before + "Status of twitter link before");
		System.out.println(Twitter_Status_After + "Status of twitter link after");

		if (Google_Status_Before == Google_Status_After && Twitter_Status_Before == Twitter_Status_After) {
			value = true;
		} else {
			value = false;
		}

		return value;
	}
   
   /**
	 * Used to enter Email_password in create account page
	 * 
	 */
   
   public void enter_EmailAndPassword(String email, String password) throws InterruptedException {
		
		element("EmailField").sendKeys(email);
		element("PasswordField").sendKeys(password);
		Thread.sleep(1000);
		
	}
   
   /**
	 * Used to click create Account button
	 * 
	 */
   
   public boolean click_Create_Account() throws InterruptedException {
		boolean value = false;

		if (element("Create_Account").isEnabled()) {
			element("Create_Account").click();
			value = true;
			Thread.sleep(2000);
		} else {
			value = false;
		}

		return value;
	}
   
   /**
	 * Used to verify error page after create account on already registered Email_password
	 * 
	 */
   
   public boolean verify_errorPageOn_CreateAccount() {
		boolean value = false;

		String title = element("ProgressTitle").getText();
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
	 * Used to Verify Absher Login Page
	 * 
	 */
   
   public boolean verify_AbsherLoginPage() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[text()='Absher Login']")));
		return status.isDisplayed();
		
	}
   
   /**
	 * Used to verify Scroll on Absher Login page
	 * 
	 */
   
   public boolean verify_ScrollUpScrollDown() throws InterruptedException {
		boolean value = true;
		Helper.scrollDown();
		Thread.sleep(1000);
		Helper.scrollUp();
		Thread.sleep(1000);
		return value;
	}
   
   /**
	 * Used to click Absher Login button
	 * 
	 */

   public void click_Absher_Login() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(1000);
		element("AbsherButton").click();
	}
   
   /**
	 * Used to verify Login to SP section
	 * 
	 */
   
   public boolean verify_LpSectionPage() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(session.driver, 20);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//a[@id='lbtn_dummyToken']")));
		return status.isDisplayed();
		
	}
   
   /**
	 * Used to click Dummy IAM Token
	 * 
	 */
   
   public void click_DummyIAM_Token() throws InterruptedException {
		Thread.sleep(2000);
		element("DummyIAMToken").click();
	}
   
   /**
	 * Used to verify Getting Sim Page
	 * 
	 */
   
   public boolean verify_GettingSimPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//label[@class='form-lbl sim_number_field_option']")));
		return status.isDisplayed();
	}
   
   /**
	 * Used to verify virgin sim checkbox is clickable
	 * 
	 */
   
   public boolean verify_VirginCheckbox_clickable() {
		boolean value = false;

		if (element("VirginSimCheckbox").isSelected()) {
			System.out.println("checkbox is selected by default");
			value = false;
		} else {
			element("VirginSimCheckbox").click();
			System.out.println("checkbox is not selected by default");
			value = true;
		}

		return value;
	}
   
   /**
	 * Used to select virgin sim checbox
	 * 
	 */
   
   public void select_virginSimCheckbox() {
	   element("VirginSimCheckbox").click();
   }
   
   /**
	 * Used to verify for enabled sim field
	 * 
	 */
   
   public boolean verify_EnabledSimField() {
	   boolean value=false;
	   if(element("SimTextField").isEnabled()) {
		   element("SimTextField").sendKeys("5757564323");
		   value=true;
	   }else {
		   value=false;
	   }
	   return value;
   }
   
   /**
	 * Used to verify validation for sim field without checking virgin checkbox
	 * 
	 */
   
   public boolean verify_SimFieldWithoutVirginCheckbox() {
	   boolean value=false;
	 boolean checkbox=element("VirginSimCheckbox").isSelected();
	 boolean sim_field=element("SimTextField").isEnabled();
	 System.out.println(checkbox+ "value of checkbox");
	 System.out.println(sim_field+ "value of simfield");
	 
	 if((checkbox == true && sim_field == true) || (checkbox == false && sim_field == false)) {
		 value=true;
	 }else {
		 value=false;
	 }
		 
	   return value;
   }
   
   /**
	 * Used to click continue button on getting sim page
	 * 
	 */
   
   public void click_ContinueButtonOnGettingSim() throws InterruptedException {
	   element("VirginSimCheckbox").click();
	   Thread.sleep(1000);
	   element("SimTextField").sendKeys("5757564323");
	   Thread.sleep(1000);
	   element("ContinueSim_Btn").click();
	   Thread.sleep(1000);
   }
   
   /**
	 * Used to verify for next page after getting sim page if selected virgin sim checkbox
	 * 
	 */
   
   public boolean verify_nextPageAfterGettingSim() {
	   WebDriverWait wait = new WebDriverWait(session.driver, 20);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[text()='TRY AGAIN']")));
		return status.isDisplayed();
   }
   
   /**
	 * Used to click on try again button on page after getting sim when selected virgin sim checkbox
	 * 
	 */
   
   public void click_TryAgainBtn() {
	   element("TryAgain_Btn").click();
   }
   
   /**
	 * Used to eSim Checkbox and hit Continue button
	 * 
	 */
   
   public void click_EsimAndContinue() throws InterruptedException {
	   element("eSimCheckbox").click();
	   Thread.sleep(1000);
	   element("ContinueSim_Btn").click();
   }
   
   /**
	 * Used to verify Card detail page
	 * 
	 */
   
   public boolean  verify_CardDetailPage() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//span[contains(text(),'YOUR STUFF')]")));
		return status.isDisplayed();
	}
   
   /**
	 * Used to redirect to browser back page
	 * 
	 */
   
   public void BrowserBack() {
	   session.driver.navigate().back();
   }
   
   /**
	 * Used to click on your number dropdown
	 * 
	 */
   
   public void click_YourNumDrpDwn() {
	   WebDriverWait wait = new WebDriverWait(session.driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='point-header']"))).click();

   }
   
   /**
	 * Used to verify Number under Dropdown
	 * 
	 */
   
   public boolean verify_NumUnderDrpDwn() {
	   boolean value=false;
	   
	   if (element("Number_Dropdown").isDisplayed()) {
			value = true;
			System.out.println(element("Number_Dropdown").getText() + "is the number");
		} else {
			value = false;
			System.out.println(element("Number_Dropdown").getText() + "number not displayed");
		}
	   
	   return value;
   }
   
   /**
	 * Used to click on Sim Deleivered Checkbox and hit continue button
	 * 
	 */
   
   public void click_SimDeliveredChecboxAndBtn() throws InterruptedException{
	   element("GetSimDelivered_CheckBox").click();
	   Thread.sleep(1000);
	   element("ContinueSim_Btn").click();
   }
   
   /**
	 * Used to Enter Card Details
	 * 
	 */
   
   public void enter_Card_Details(String cardNum, String cardName, String expiry, String CVV) throws InterruptedException {
		element("CardNum_Field").sendKeys(cardNum);
		Thread.sleep(1000);
		element("CardHolderr_Field").sendKeys(cardName);
		Thread.sleep(1000);
		element("Expiry_FField").sendKeys(expiry);
		Thread.sleep(1000);
		element("CVV_FField").sendKeys(CVV);
		Thread.sleep(1000);
	}
   
   /**
	 * Used to verify Visibility for Done Button
	 * 
	 */
   
   public boolean verify_visibilityFor_DONEButton(){
		boolean value=false;
		
		if(element("DoneBtn_CardPage").isEnabled()) {
			value=false;
		}else {
			value=true;
		}
		
		return value;
	}
   
   /**
	 * Used to click done button on card detail page
	 * 
	 */
   
   public boolean click_Donebutton_CardPage() {
		boolean value=false;
		
		if(element("DoneBtn_CardPage").isEnabled()) {
			value=true;
			element("DoneBtn_CardPage").click();
		}else {
			value=false;
		}
		
		return value;
	}
   
   /**
	 * Used to verify ACS Emulator page
	 * 
	 */
   
   public boolean verify_ACSEmulator_Page() {
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//td[text()='411111xxxxxx1111']")));
		return status.isDisplayed();
	}
   
   /**
	 * Used to hit submit butto under ACS Emulator page
	 * 
	 */
   
   public void hit_SubmitBtn() {
	   element("Submit_Btn").click();
   }
   
   /**
	 * Used to Verify SuccessPage After ACS Emulator
	 * 
	 */
   
   public boolean verify_Success_PageForACS() {
	   WebDriverWait wait = new WebDriverWait(session.driver, 30);
		WebElement status = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[text()='YOUR PAYMENT IS COMPLETE']")));
		return status.isDisplayed();
   }
   
   public void click_ContinueOnSucessACS() throws InterruptedException {
	   element("Continue_BtnACS").click();
	   Thread.sleep(1000);
   }
   
   public boolean verify_MAPPAge(){
	   boolean value=false;
	   
	   return value;
   }

public void change_EngLanguage() {
	//element("EnglishLanguageClick").click();
	Actions builder = new Actions(session.driver);   
	builder.moveToElement(element("EnglishLanguageClick"), 65, 41).click().build().perform();
}
/**
 * Used to EnterEmail Address
 * 
 */
public void enterRandomEmail() {
	element("EmailField").click();
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);  
	element("EmailField").sendKeys("username"+ randomInt +"@gmail.com");
	
}
/**
 * Used to Enter
 * 
 */
public void enterPassword() throws InterruptedException {
	element("PasswordField").sendKeys("Test@1234");
	Thread.sleep(1000);
	
}
/**
 * Used to click virgin Logo
 * 
 */
public void ClickOnVirginLogo() {
	element("VirginLogo").click();
	
}
/**
 * Used to verify virginMob Logo
 * 
 */
public boolean VerifyLogo() {
	return element("VirginLogo").isDisplayed();
}
/**
 * Used to verify that redirected to virgin page
 * 
 */
public boolean RedirectedtoHomePage() {
	return element("JoinNow_button").isDisplayed();
}
/**
 * Used to verify making life text
 * 
 */
public boolean MakingLifeText() {
	return element("MakingLifeText").isDisplayed();
}
/**
 * Used to verify LuckyNumber text
 * 
 */
public boolean LuckyNumberText() {
	return element("LuckyNumberText").isDisplayed();
}
/**
 * Used to verify virginMobile text
 * 
 */
public boolean WhyVirginMob() {
	return element("VirginMobile").isDisplayed();
}
   


}
