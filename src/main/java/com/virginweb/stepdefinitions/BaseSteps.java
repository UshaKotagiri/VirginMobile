package com.virginweb.stepdefinitions;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.naming.directory.InitialDirContext;

import org.apache.commons.lang3.reflect.FieldUtils;


import com.virginweb.automation.framework.TestSession;
import com.virginweb.helper.TestRail;
import com.virginweb.utils.PropFileHandler;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.ScenarioImpl;
import gherkin.formatter.model.Result;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.*;
import java.util.*;

/**
*
* @author nimit.jain
*
*/
public class BaseSteps extends StepDefinitionInit {

	@Before
	public void setUp() throws Exception {

		System.out.println("STARTING TEST..... ");
		session = getTestSession();
		Thread.sleep(5000);
	}

	@After
	public void tearDown(Scenario scenario) throws Exception {
		String ID = PropFileHandler.readProperty("testCaseID");
		if (scenario.isFailed()) {
			logError(scenario, ID);
//ADB.screenCapture();
		} else {
			TestRail.addResultForTestCase(ID, 1, "Pass - Status updated automatically from Selenium test automation ");
			System.out.println("Updated Pass testcase with is:-" + ID);
		}
		System.out.println("I am in the tear function...");
		try {
			//session.quit();
			System.out.println("Session is not terminated!!!");
		} finally {
		session = null;
					}
	}

	private void logError(Scenario scenario, String ID) {

		Field field = FieldUtils.getField(((ScenarioImpl) scenario).getClass(), "stepResults", true);
		field.setAccessible(true);
		try {
			ArrayList<Result> results = (ArrayList<Result>) field.get(scenario);
			for (Result result : results) {
				if (result.getError() != null)
					TestRail.addResultForTestCase(ID, 5, "Error:-" + result.getError());
				System.out.println("Updated Fail testcase with is:-" + ID);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}