package com.virginweb.helper;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.virginweb.utils.APIClient;

public class TestRail {

	 public static String TEST_RUN_ID = "1";
	 public static String TESTRAIL_USERNAME ="vinaykotagiri@gmail.com";
	 public static String TESTRAIL_PASSWORD = "Vinay@1023";
	 public static String RAILS_ENGINE_URL = "https://ushakotagiri.testrail.io/";

	//public static String TEST_RUN_ID = System.getProperty("testRunID");
	//public static String TESTRAIL_USERNAME = System.getProperty("testRailUsername");
	//public static String TESTRAIL_PASSWORD = System.getProperty("testRailPassword");
	//public static String RAILS_ENGINE_URL = System.getProperty("testRailEngineURL");
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;
	// public static final int TEST_CASE_FAILED_STATUS = 0;

	public static void addResultForTestCase(String testCaseId, int status, String error) throws Exception {

		String testRunId = TEST_RUN_ID;

		APIClient client = new APIClient(RAILS_ENGINE_URL);
		client.setUser(TESTRAIL_USERNAME);
		client.setPassword(TESTRAIL_PASSWORD);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("status_id", status);
		//if ((error.equals(" ")))
		if(status == 1)
			data.put("comment", "Test Executed --- Status updated automatically from Selenium test automation.");
		/*else if (error.contains("TimeoutException")) {
			data.put("comment", "Time Out Exception locator is unable to find     " + error);
		} else if (error.contains("NullPointerException")) {
			data.put("comment", "NULL POINTER EXCEPTION          " + error);
		} else if (error.contains("WebDriverException")) {
			data.put("comment", "Session Out - Server side error         " + error);
		} else if(error.contains("AssertionError")){
			data.put("comment", " "+error);
		}*/
		else{
			data.put("comment", error);
		}
		/*else {
			data.put("comment", "Locator is unable to find     " + error);*/
		//}

		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + testRunId + "/" + testCaseId + "", data);
		System.out.println(r);
	}

	public static APIClient myClient() {
		APIClient client;
		client = new APIClient("https://mytestraillink.net/"); // i hide it
		client.setUser("userName");// i hide it
		client.setPassword("password");// i hide it
		return client;
	}

}