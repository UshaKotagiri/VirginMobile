package com.virginweb.stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.virginweb.automation.framework.ConfigurationRegistory;
import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.elementClickHelper;
import com.virginweb.home.po.FooterWebPO;
import com.virginweb.home.po.BringYourOwnNumberPO;
import com.virginweb.home.po.ComplaintPO;
import com.virginweb.home.po.ComplaintWebPO;
import com.virginweb.home.po.FAQUsha;
import com.virginweb.home.po.FamilyDevicePO;
import com.virginweb.home.po.FaqContactUsPO;
import com.virginweb.home.po.FindAStorePO;
import com.virginweb.home.po.FrendiPO;
import com.virginweb.home.po.HomePO;
import com.virginweb.home.po.HomeWebPO;

import com.virginweb.home.po.InternationalRatesPO;

import com.virginweb.home.po.InternationalRoamingPO;

import com.virginweb.home.po.JoinNowPO;
import com.virginweb.home.po.LanguagePO;
import com.virginweb.home.po.OnboardingCreateAccountPO;
import com.virginweb.home.po.OnboardingPaymentPO;
import com.virginweb.home.po.OtherOffersPO;
import com.virginweb.home.po.PaymentOptionsPO;
import com.virginweb.home.po.PracticePO;
import com.virginweb.home.po.RatesPO;
import com.virginweb.home.po.Sprint10PO;
import com.virginweb.home.po.Sprint11PO;
import com.virginweb.home.po.TopupPO;
import com.virginweb.home.po.Web_PlanAndProductPO;
import com.virginweb.home.po.WebsitePO;
import com.virginweb.home.po.WhyVirginMobilePO;
import com.virginweb.utils.PropFileHandler;

/**
 * 
 * @author Nimit Jain
 *
 */
public class StepDefinitionInit {
	
	   Map<String, Object> options = new HashMap<String, Object>();
	   protected static TestSession session;
	   
	   static HomePO homePO;
	   static JoinNowPO joinNowPO;
	   static TopupPO topupPO;
	   static HomeWebPO homeWebPO;
	   static FooterWebPO footerWebPO;
	   static Web_PlanAndProductPO web_PlanAndProductPO;
	   static OtherOffersPO otheroffersPO;
	   static InternationalRatesPO internationalrtsPO;
	   static InternationalRoamingPO internationalroamPO;
	   static FamilyDevicePO familytagPO;
	   static FrendiPO frendiPO;
	   static RatesPO ratesPO;
	   static FaqContactUsPO faqPO;
	   static FindAStorePO findAStorePO;
	   static Sprint10PO sprintPO;
       static PaymentOptionsPO paymentoptionsPO;
	   static WebsitePO websitePO;
	   static OnboardingCreateAccountPO onboardingcreateaccountPO;
	   static Sprint11PO sprint11PO;
	   static LanguagePO languagePO;
	   static BringYourOwnNumberPO bringNumberPO;
	   static ComplaintPO complaintPO;
	   static ComplaintWebPO complaintWebPO;
	   static OnboardingPaymentPO onboardingPaymentPO;
	   static PracticePO practicePO;
	   static WhyVirginMobilePO whyVirginPO;
	   static elementClickHelper help;
	   static FAQUsha faqUshaPO;
	   public TestSession getTestSession() throws Exception{

		   
	   if (session == null) {
	   session = new TestSession(options);
		   // session.driver.navigate().refresh();
		   }
		   else {


		  
		   String url =PropFileHandler.readProperty("URL");
		   System.out.println(url);
		   session.driver.get(url);

		   }
		  // if (session == null) {

	   		complaintWebPO = new ComplaintWebPO(session);
	        complaintPO = new ComplaintPO(session);
	        bringNumberPO = new BringYourOwnNumberPO(session);
	        languagePO = new LanguagePO(session);
	        websitePO = new WebsitePO(session);
	        paymentoptionsPO=new PaymentOptionsPO(session);
	        sprintPO = new Sprint10PO(session, null);
	        homePO  = new HomePO(session);
	        onboardingcreateaccountPO = new OnboardingCreateAccountPO(session);
	        joinNowPO= new JoinNowPO(session);
	        topupPO = new TopupPO(session);
	        footerWebPO= new FooterWebPO(session);
	        web_PlanAndProductPO= new Web_PlanAndProductPO(session);
	        homeWebPO = new HomeWebPO(session);
	        otheroffersPO = new OtherOffersPO(session);
	        internationalrtsPO = new InternationalRatesPO(session);
	        internationalroamPO = new InternationalRoamingPO(session);
            familytagPO = new FamilyDevicePO(session);
	        frendiPO = new FrendiPO(session);
	        ratesPO = new RatesPO(session);
	        faqPO = new FaqContactUsPO(session);
	        findAStorePO = new FindAStorePO(session);
		    sprint11PO = new Sprint11PO(session);
		    onboardingPaymentPO = new OnboardingPaymentPO(session);
		    practicePO = new PracticePO(session);
		    whyVirginPO = new WhyVirginMobilePO(session);
		    help = new elementClickHelper(session);
		    faqUshaPO = new FAQUsha(session);
	        for(Entry<String, Object> entry : session.config.entrySet())
	        {
	        	System.out.println("*********"+entry.getKey()+" "+entry.getValue());
	        }

	        return session;
	   }
	   
	   
	 
	   
	   }
