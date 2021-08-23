package com.virginweb.home.po;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class PracticePO extends MobileWebViewPage {

	public PracticePO(TestSession session) throws Exception {
		
		super(session, "Applications/virginweb/Practice");
	}

	public void enterCredentials(){
		
	}
	
	public boolean titleOFThePage(String title){
		return session.driver.getTitle().contains(title);
	}
	
	public void clickOnJoinNow(){
		session.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(session.driver);
		WebElement wb = element("joinNowButton");
		act.moveToElement(wb).click().perform();
	}
	
	public void scrollUntilLastNumber(){
		List<WebElement> listOfNumbers = elements("listOfNumbers");
		Iterator<WebElement> it = listOfNumbers.iterator();
		if(it.hasNext()){
			session.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 ((JavascriptExecutor)session.driver).executeScript("arguments[0].scrollIntoView(true);",listOfNumbers.get(listOfNumbers.size()-1));
			 ((JavascriptExecutor)session.driver).executeScript("arguments[0].scrollIntoView(true);",element("virginLogoLeftCorner"));
			 // listOfNumbers =  elements("listOfNumbers");
			 // it = listOfNumbers.iterator();
		}
	}
	
	public boolean checkforScrolling(){
		return element("virginLogoLeftCorner").isDisplayed();
	}
	public void clickOnSearch(String num){
		WebElement wb =element("searchTabForNumber");
		//WebDriverWait wait = new WebDriverWait(session.driver,10);
				//wait.until(ExpectedConditions.visibilityOf(wb));
		session.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		/*act.moveToElement(wb).click().build().perform();
		act.moveToElement(wb).sendKeys(num).build().perform();*/
		//wb.click();
		//wb.sendKeys(num);
		//wb.click();
				JavascriptExecutor jse = (JavascriptExecutor) session.driver;
				 //jse.executeScript("arguments[0].click();", wb);
				//jse.executeScript("document.getElementByxpath('wb').value='0921';");
				jse.executeScript("arguments[0].value='0921';", wb);
		
	}
	public boolean verifyTheClick(String num){
		System.out.println(element("searchTabForNumber").getAttribute("value"));
		return (element("searchTabForNumber").getAttribute("value").contains(num));
	}
	
	public boolean checkTheInvalidPage(){
		element("clickOnSearch").click();
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		js.executeScript("window.scrollBy(0,250)");
		return element("failureMessage").isDisplayed();
	}
	
	public void clickOnAnyNumberInList(){
		List<WebElement> li = elements("listOfNumbers");
		li.get(0).click();
	}
	public boolean checkForNumber(){
		return element("clickedNumber").isDisplayed();
	}
	public boolean checkForPOPUP(){
		return element("selectedNumberPopup").isDisplayed();
	}
}
