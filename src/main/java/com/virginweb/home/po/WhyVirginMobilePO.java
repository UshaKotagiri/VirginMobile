package com.virginweb.home.po;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.Helper;
import com.virginweb.helper.elementClickHelper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class WhyVirginMobilePO extends MobileWebViewPage {
	
	elementClickHelper h= new elementClickHelper(session);

	public WhyVirginMobilePO(TestSession session) throws Exception {
		
		super(session, "Applications/virginweb/WhyVirginMobile");
	}
	
	public void clickOnWhyVirgin(){
		h.hooverNClick("whyVirginTab");
	}

	public boolean scrollDownVerify(){
		Helper.scrollDown();
		return element("bottomFooter").isDisplayed();
	}
	
	public boolean scrollUPVerify(){
		Helper.scrollUp();
		return element("topLeftCornerLogo").isDisplayed();
	}
	
	public void navigateBack(){
		session.driver.navigate().back();
	}
	
	public boolean checkForBanner(String toBeFound){
		return h.checkForText(element("whyVirginTextBanner"), toBeFound);
	}
	
	public boolean checkForDownload(String toBeFound){
		List<WebElement> listOfElements = elements("listOfQuaterTabs");
		Actions act = new Actions(session.driver);

		for(WebElement wb:listOfElements){
			if(wb.getText().toLowerCase().contains(toBeFound.toLowerCase())){
				act.moveToElement(wb).build().perform();
				return true;
			}
		}
		return false;
	}
	
	public void clickOnQuarter(String quat){
		List<WebElement> listOfElements = elements("quaterButtons");
		Actions act = new Actions(session.driver);

		for(WebElement wb:listOfElements){
			if(wb.getText().toLowerCase().contains(quat.toLowerCase())){
				act.moveToElement(wb).build().perform();
				wb.click();
				break;
			}
		}
	}
	
	public boolean checkJPGPage(){
		Set<String> windows = session.driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		String patName = itr.next();

		String chldName = itr.next();

		session.driver.switchTo().window(chldName);
		
		return element("jpgPage").isDisplayed();
	}
		
	
}
