package com.virginweb.home.po;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class FooterWebPO extends MobileWebViewPage{

	public FooterWebPO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/FooterWeb");
	}
	
	/**
	 * Used to click About Virgin Link
	 * 
	 */
	
	public void click_AboutVirginLink() {
		((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("About_VirginMobile"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("About_VirginMobile"))).click();
		
	}
	
	/**
	 * Used to verify About Virgin Page
	 * 
	 */
	
	public boolean verify_AboutVirginPage() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("AboutPage_Verify")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Virgin Group
	 * 
	 */
	
	public void click_VirginGroup(){
        ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("Virgin_Group"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("Virgin_Group"))).click();
	}
	
	/**
	 * Used to click Terms and Condition
	 * 
	 */
	
	public void click_TermsAndCondition() {
       ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("Terms_Condition"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("Terms_Condition"))).click();
	}
	
	/**
	 * Used to verify Terms and Condition
	 * 
	 */
	
	public boolean verify_TermsAndCondition() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("TermsCondition_Verify")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Privacy Policy
	 * 
	 */
	
	public void click_PrivacyPolicy() {
       ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("PrivacyPolicy"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("PrivacyPolicy"))).click();
	}
	
	/**
	 * Used to verify Privacy Policy
	 * 
	 */
	
	public boolean verify_PrivacyPolicy() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Policy_verify")));
		return status.isDisplayed();
	}
	
	/**
	 * Used to click Customer rights and responsibilities
	 * 
	 */
	
	public void click_CustomerRights() {
	       ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("CustomerRight"));
			
			WebDriverWait wait=new WebDriverWait(session.driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element("CustomerRight"))).click();
	}
	
	/**
	 * Used to verify Customer rights and responsibilities
	 * 
	 */
		
   public boolean verify_CustomerRights() {
			WebDriverWait wait=new WebDriverWait(session.driver, 20);
			
			WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Rights_Verify")));
			return status.isDisplayed();
	}
   

	/**
	 * Used to click Download App
	 * 
	 */
   
   public void click_DownloadApp() {
       ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("DownloadApp"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("DownloadApp"))).click();
   }
   

	/**
	 * Used to verify Download App
	 * 
	 */
	
   public boolean verify_DownloadApp() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Download_Verify")));
		return status.isDisplayed();
    }
   

	/**
	 * Used to Click Career Page
	 * 
	 */
   
   public void click_Career() {
       ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("CareerPage"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("CareerPage"))).click();
   }
   

	/**
	 * Used to verify Career Page
	 * 
	 */
	
   public boolean verify_Career() {
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		
		WebElement status=wait.until(ExpectedConditions.visibilityOf(element("Career_Verify")));
		return status.isDisplayed();
    }
   

	/**
	 * Used to click Youtube link
	 * 
	 */
   
   public void click_youtubeLink(){
	   ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("YouTubeLink"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("YouTubeLink"))).click();
   }
   

	/**
	 * Used to verify Links on other Tab
	 * 
	 */
   
   public boolean verify_URL_Page(String URL) throws InterruptedException {
	   boolean value = false;
	   
	   String parent= session.driver.getWindowHandle();
	   Thread.sleep(1000);
	   Set<String>child=session.driver.getWindowHandles();
	   int count=child.size();
	   ArrayList<String> tabs= new ArrayList<>(child);
	   Thread.sleep(1000);
	   session.driver.switchTo().window(tabs.get(1));
	   Thread.sleep(1000);
	   String Original_URL=session.driver.getCurrentUrl();
	   if (Original_URL.contains(URL)) {
			value = true;
		//	session.driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);
			session.driver.close();
			session.driver.switchTo().window(parent);
		} else {
			value = false;
		}
	   
	   return value;
   }
   

	/**
	 * Used to click Twitter link
	 * 
	 */
   
   public void click_Twitter() {
	   ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("TwitterLink"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("TwitterLink"))).click();
   }
   

	/**
	 * Used to click Instagram link
	 * 
	 */
   
   public void click_Instagram() {
	   ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("InstagramLink"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("InstagramLink"))).click();
   }
   

	/**
	 * Used to click Facebook link
	 * 
	 */

   public void click_Facebook() {
	   ((JavascriptExecutor) session.driver).executeScript("arguments[0].scrollIntoView();",element("FacebookLink"));
		
		WebDriverWait wait=new WebDriverWait(session.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element("FacebookLink"))).click();
   }
}
