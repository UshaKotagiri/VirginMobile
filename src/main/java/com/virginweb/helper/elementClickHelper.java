package com.virginweb.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class elementClickHelper extends MobileWebViewPage{

	public elementClickHelper(TestSession session) throws Exception {
		super(session, "Applications/virginweb/helper");
	}

	public void hooverNClick(String ...args){
		if(args.length == 1){
			element(args[0]).click();
		}
		else{
			Actions act = new Actions(session.driver);
			WebElement wb = element(args[0]);
			act.moveToElement(wb).build().perform();
			WebElement cl = element(args[1]);
			act.moveToElement(cl).click().build().perform();
		}
	}
	
	public boolean checkForText(WebElement elementTOcheck,String textToCheck){
		System.out.println((elementTOcheck).getText().toLowerCase().replace("\n", " "));
		System.out.println((elementTOcheck).getText().toLowerCase().replace("\n", " ").contains(textToCheck.toLowerCase()));
		return (elementTOcheck).getText().toLowerCase().replace("\n", " ").contains(textToCheck.toLowerCase());
	}
}
