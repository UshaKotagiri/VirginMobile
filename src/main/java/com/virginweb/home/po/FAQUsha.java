package com.virginweb.home.po;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.elementClickHelper;
import com.virginweb.qe.automation.framework.pagefactory.MobileWebViewPage;

public class FAQUsha extends MobileWebViewPage{
	
	elementClickHelper h= new elementClickHelper(session);
	
	public FAQUsha(TestSession session) throws Exception {
		super(session, "Applications/virginweb/FAQUsha");
		
	}
	
	
	
	public void hooverOnHelpNSupport(){
		Actions act = new Actions(session.driver);
		WebElement wb =  element("helpNSupportTab");
		act.moveToElement(wb).build().perform();
		
	}
	
	public boolean verifyThehoover(){
		List<WebElement> l = elements("listOfOptionsInHelpNSupport");
		return l.get(0).isDisplayed();
	}
	
	public boolean verifyTheHeader(){
		return element("headerHomePage").isDisplayed();
	}
	
	public boolean verifyForBannerHeadings(){
	    
		return element("bannerListHeading").isDisplayed();
	}
	
	public boolean verifyBreadcrumbs(){
		WebDriverWait w = new WebDriverWait(session.driver, 3);
		Actions act = new Actions(session.driver);
		System.out.println("Bread");
		List<WebElement> listOFCrumbs = elements("breadcrumbs");
		/*for(WebElement l:listOFCrumbs ){
			//act.dragAndDropBy(l, 0, 40);
			w.until(ExpectedConditions.visibilityOf(l));
			System.out.println("In wait");
			if(!l.isDisplayed()){
				return false;
			}
		}*/
		w.until(ExpectedConditions.visibilityOf(listOFCrumbs.get(0)));
		System.out.println(listOFCrumbs.get(0).getAttribute("data-mobile"));
		if(listOFCrumbs.get(0).isDisplayed()){
		return true;}
		return false;
	}
	
	public boolean checkForChangingBreadcrumb(){
		WebDriverWait w = new WebDriverWait(session.driver, 6);
		Actions act = new Actions(session.driver);
		System.out.println("Bread");
		List<WebElement> listOFCrumbs = elements("breadcrumbs");
		List<WebElement> bannerList = elements("bannerDetails");
		int i=0;
		for(WebElement l:listOFCrumbs ){
			System.out.println("Dotclick");

			System.out.println(bannerList.get(i).getAttribute("href"));
			System.out.println(bannerList.get(i).getText());
			String link = bannerList.get(i).getAttribute("href");
			//session.driver.navigate().to(bannerList.get(i).getAttribute("href"));
			bannerList.get(i).click();
			
			
			String afterLink = session.driver.getCurrentUrl();
			session.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			session.driver.navigate().back();
			i++;
			l.click();
			if(!link.contains(afterLink)){
				return false;	
			}
		}


			System.out.println("In wait");
		return true;
	}
	
	public boolean verifySearchForMore(){
		Actions act = new Actions(session.driver);
		WebElement wb = element("searchButton");
		act.moveToElement(wb).build().perform();
		return wb.isDisplayed();
	}
	
	public void clickSearchForMore(){
		Actions act = new Actions(session.driver);
		WebElement wb = element("searchButton");
		act.moveToElement(wb).click().build().perform();
		
		
	}
	
	public boolean verifyForCharacterLimit(){
		session.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement wb = element("searchTab");

		JavascriptExecutor jse = (JavascriptExecutor) session.driver;
		jse.executeScript("arguments[0].value='12345678';", wb);
		System.out.println("value===="+wb.getAttribute("value"));
		WebElement w1 = element("clickSearch");
		jse.executeScript("arguments[0].click();", w1);
		System.out.println("value===="+wb.getAttribute("value"));
		return true;
		
	}
}
