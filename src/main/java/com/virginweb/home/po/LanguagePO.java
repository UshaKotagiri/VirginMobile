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

public class LanguagePO extends MobileWebViewPage{

	public LanguagePO(TestSession session) throws Exception {
		super(session, "Applications/virginweb/Language");
	}

	/**
	 * Used to click on Arabic Language
	 * 
	 */
	public void ClickOnArabic() {
		element("Arabic").click();
	}
	/**
	 * Used to click on English
	 * 
	 */
	public void ClickOnEnglish() {
		element("English").click();
		
	}
	/**
	 * Used to verify on Arabic Language page
	 * 
	 */
	public boolean VerifyArabic() {
	
		return element("ArabicVerify").isDisplayed();
	}
	/**
	 * Used to verify on English Language page
	 * 
	 */
	public boolean VerifyEnglish() {
		return element("EnglishVerify").isDisplayed();
		
	}
	
	
}
	