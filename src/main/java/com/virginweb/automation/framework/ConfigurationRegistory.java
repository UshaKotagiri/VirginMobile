package com.virginweb.automation.framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.yaml.snakeyaml.Yaml;

import com.virginweb.utils.InitData;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * 
 * @author nimit.jain
 *
 */
public class ConfigurationRegistory {
	public static String sauceURL = System.getProperty("sauceUrl");
	Map<String, Object> registry;
	private static String OS = System.getProperty("os.name").toLowerCase();
	//public static String url;
	@SuppressWarnings("unchecked")
	public ConfigurationRegistory() {
		registry = (Map<String, Object>) new Yaml()
				.load(getClass().getClassLoader().getResourceAsStream("configurationRegistry.yaml"));
	}

	public WebDriver getDriver(Map<String, Object> config) throws MalformedURLException {
		Map<String, Object> options = new HashMap<String, Object>();
		return getDriver(config, options);
	}
	
	

	public WebDriver getDriver(Map<String, Object> config, Map<String, Object> options) throws MalformedURLException {
		String projectPath = System.getProperty("user.dir");
		String driverPath = null;
		String driverPathOpera = null;
		String testConfiguration = null;
			System.out.println(OS);
	
			if (isWindows()) {
				System.out.println("This is Windows");
				driverPath = projectPath+""+"/src/main/resources/drivers/window/chromedriver.exe";
			} else if (isMac()) {
				System.out.println("This is Mac");
				driverPath = projectPath+""+"/src/main/resources/drivers/mac/chromedriver";
			} else if (isUnix()) {
				System.out.println("This is Unix or Linux");
				driverPath = projectPath+""+"/src/main/resources/drivers/linux/chromedriver";
			}  else {
				System.out.println("Your OS is not supported!!");
			}
		
		System.out.println("The driver path is " + driverPath);

		if (options.containsKey("TEST_CONFIGURATION")) {
			testConfiguration = options.get("TEST_CONFIGURATION").toString();
		}

		TestSession.logger.info("Launching Test Configuration: " + testConfiguration + " ...");
		System.out.println("Launching Test on Configuration: " + testConfiguration + " ...");

		Map<String, String> configRegistory = (Map<String, String>) registry.get(testConfiguration);
		WebDriver driver = null;
		
		System.out.println(configRegistory);
		
		//url=configRegistory.get("server");
		
  ChromeOptions chromeOptions;
		switch (InitData.platformName) {
		case ("mac"):
			// TODO need to check if chromedriver exists
			System.setProperty("webdriver.chrome.driver", driverPath);
			chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("test-type");
			chromeOptions.addArguments("start-maximized");
			chromeOptions.addArguments("--incognito");
			chromeOptions.addArguments("--disable-web-security");
			chromeOptions.addArguments("--allow-running-insecure-content");
			driver = new ChromeDriver(chromeOptions);
			break;
			

		
			
		case ("chrome"):
			System.out.println("In Chrome configuration");
			System.setProperty("webdriver.chrome.driver", driverPath); 
			chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("test-type");
			chromeOptions.addArguments("start-maximized");
			chromeOptions.addArguments("--incognito");
			chromeOptions.addArguments("--disable-web-security");
			chromeOptions.addArguments("--allow-running-insecure-content");
			//driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
			driver = new ChromeDriver(chromeOptions);
			driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
			break;
	
		case "sauceWeb":
			
            DesiredCapabilities capabillities = DesiredCapabilities.chrome();
            capabillities.setCapability("version", "85");
            capabillities.setCapability("platform", Platform.WIN10);
            capabillities.setCapability("name", "Remote File Upload Test");
            
//        driver = new RemoteWebDriver(
//            new URL("https://nimitj:ac328e21-3e2a-442f-9f38-eb93e177633e@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
//        capabillities);
            
            driver = new RemoteWebDriver(new URL(sauceURL),capabillities);
        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
       driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
        //driver.get(configRegistory.get("server"));
        break;
        
		case "sauceWeb_ff":
	    	  
	    	  DesiredCapabilities caps = DesiredCapabilities.firefox();
	          caps.setCapability("version", "66");
	          caps.setCapability("platform", Platform.WIN10);
	          caps.setCapability("name", "Remote File Upload Test");
	          
//	      driver = new RemoteWebDriver(
//	          new URL("https://nimitj:ac328e21-3e2a-442f-9f38-eb93e177633e@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
//	      caps);
	          
	     driver = new RemoteWebDriver(new URL(sauceURL),caps);
	        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
	        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
	        //driver.get(configRegistory.get("server"));
	        break;
	        
		case "sauceWeb_edge":
	    	  
	    	  DesiredCapabilities cap = DesiredCapabilities.edge();
	          cap.setCapability("version", "86");
	          cap.setCapability("platform", Platform.WIN10);
	          cap.setCapability("name", "Remote File Upload Test");
//	          
//	      driver = new RemoteWebDriver(
//	          new URL("https://nimitj:ac328e21-3e2a-442f-9f38-eb93e177633e@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),
//	      cap);
	          
           driver = new RemoteWebDriver(new URL(sauceURL),cap);
	        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
	        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	        driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
	        //driver.get(configRegistory.get("server"));
	        break;
	        
		case "Opera":
			 DesiredCapabilities caps1 = DesiredCapabilities.operaBlink();
	          caps1.setCapability("version", "66");
	          caps1.setCapability("platform", Platform.WIN10);
	          caps1.setCapability("name", "Remote File Upload Test");
			System.setProperty("webdriver.opera.driver", driverPathOpera);

			driver = new OperaDriver();
			 driver = new RemoteWebDriver(new URL(sauceURL), caps1);
		        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		        driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
	        break;

case "sauceSafari":
			
           DesiredCapabilities capabillities1 = DesiredCapabilities.safari();
            capabillities1.setCapability("version", "12");
            capabillities1.setCapability("platform", Platform.MAC);
            capabillities1.setCapability("os", "OS X");
            capabillities1.setCapability("browser", "Safari");
            capabillities1.setCapability("name", "Remote File Upload Test");
            capabillities1.setCapability("os_version", "Sierra");
            capabillities1.setCapability("browser_version", "10.0");
            capabillities1.setCapability("device", "iPhone 8 Plus");
            capabillities1.setCapability("real_mobile", "true");
         capabillities1.setCapability("browserstack.local", "false");
	
	
           
           capabillities1.setCapability("os", "OS X");
           capabillities1.setCapability("os_version", "Sierra");
           capabillities1.setCapability("browser", "Safari");
           capabillities1.setCapability("browser_version", "10.0");
           
            
//        driver = new RemoteWebDriver(
//            new URL("https://nimitj:ac328e21-3e2a-442f-9f38-eb93e177633e@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabillities1);
            
            driver = new RemoteWebDriver(new URL(sauceURL),capabillities1);
        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
        //driver.get(configRegistory.get("server"));
        break;

       
		case ("firefox"):
			System.out.println("In firefox configuration");
			//System.setProperty("webdriver.gecko.driver", driverPath); 
		 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe"); 
		driver = new FirefoxDriver();	
		driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
			break;
	
			
			
		case ("edge"):
			System.out.println("In edge configuration");
			//System.setProperty("webdriver.gecko.driver", driverPath); 
		 
		System.setProperty("webdriver.edge.driver","C:\\Users\\Shubham\\Downloads\\edgedriver_win64\\msedgedriver.exe"); 
		driver = new EdgeDriver();	
		driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
			break;


			
		case ("mobileChrome"):
			System.out.println("In firefox configuration");
		System.setProperty("webdriver.chrome.driver", driverPath);  
		Map<String, String> mobileEmulation = new HashMap<>();

		mobileEmulation.put("deviceName", "Nexus 5");


		ChromeOptions chromeOptions1 = new ChromeOptions();
		chromeOptions1.setExperimentalOption("mobileEmulation", mobileEmulation);

		 driver = new ChromeDriver(chromeOptions1);
		 driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
		break;
		
		case ("mobileChromeSauce"):
			
		System.setProperty("webdriver.chrome.driver", driverPath);  
		Map<String, String> mobileEmulation1 = new HashMap<>();

		mobileEmulation1.put("deviceName", "Nexus 5");


		ChromeOptions chromeOptions11 = new ChromeOptions();
		chromeOptions11.setExperimentalOption("mobileEmulation", mobileEmulation1);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions11);
		driver = new ChromeDriver(capabilities);
		
//       driver = new RemoteWebDriver(
//       new URL("https://nimitj:ac328e21-3e2a-442f-9f38-eb93e177633e@ondemand.us-west-1.saucelabs.com:443/wd/hub"),capabilities);
    
       driver = new RemoteWebDriver(new URL(sauceURL),capabilities);
   ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
   driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
  driver.get("https://demo:virgin2017@staging.virginmobile.sa/en/");
   //driver.get(configRegistory.get("server"));
		 
		break;
		
		
		}

		return driver;
	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);

	}

}

