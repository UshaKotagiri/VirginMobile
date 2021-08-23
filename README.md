
# Set Up Instruction
**Required softwares:**
      * JDK : http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
      * Maven : https://maven.apache.org/download.cgi
      * Eclipse : http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/neon2

# How to set up project
1. Clone this project - https://bitbucket.org/progressive-content/progressive_webui
2. Import project in eclipse as Maven existing project
3. Make sure you have set JDK 1.8 in build path for this project.
4. Make sure you have given the path of feature folder in RunCukeTest.java file


## Run Project from command line
1. Open terminal(MAC) or CMD(windows) and go to project directory
2. Run command - mvn clean integration-test -Dtest=CukeRunnerTest -Dit.test=PostResultAction

##Setup for Mobile Browsers
1. Create a map collection for mobile emulation and substitute the device name.
Map<String, String> mobileEmulation = new HashMap<>();
mobileEmulation.put("deviceName", "Nexus 5");
2. To Check device name toggle to mobile after inspect element and you can select mobile device from there as well for manual perspective.
3.SetUp the property : chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation); for respective  browsers.
4. Further download the respective browser driver and set property with the driver path in the configuration registry.

##SetUp for Web Browsers:
1. Download the respective browser driver and set property with the driver path in the configuration registry.
2. Setup properties of the respective browser example using ChromeOptions, FirefoxOptions etc if required.
3. Launch the browser.



# For mac to make chromedriver and geckodriver executable use below command
# chmod +x chromedriver
# chmod +x geckodriver