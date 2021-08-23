
Feature: Covering Rates scenarios

@Rates_01_02_03_04_05 @Rates
Scenario:To verify if the user is redirected to the rates page when the user click on the rates  link and redirects to back page
 Given I updated a test cases in test rail "4527"
 When I click on plan and Product againn
 When I Click on Frendi tag present in plans tab
 Then I get redirected to the Tab
 When I Click on rates tab within
 When I scroll the required page
 Then I get see International btn is already highlighted
 
 
 @Rates_06_07_08_09_10 @Rates
 Scenario: To verify if the International detail appears when the user  redirect to the international section by default within the rates button.
 Given I updated a test cases in test rail "4530"
 When I click on plan and Product againn
 When I Click on Frendi tag present in plans tab
 Then I get redirected to the Tab
 When I Click on rates tab within
 Then I get see International btn is already highlighted
 When I Click on International button in frendi
 When I scroll the required page
 When I Click on PackageBttn in Frendi Tab
 Then I verify that the file opened 
 
 @Rates_11_12 @Rates
 Scenario: To verify if the user is redirected to the roaming details page when click on the Roaming button within the Rates section of the Friendi Package offers page and vice versa .
 Given I updated a test cases in test rail "4538"
 When I click on plan and Product againn
 When I Click on Frendi tag present in plans tab
 Then I get redirected to the Tab
 When I Click on rates tab within
 When I click on Roaming Tab in frendi tab
 Then I validiate differnt rates and all
# When I click on dropdown in roaming in frendi tab
# When I scroll the required page
 
 
@Offers_01_02_03_04_05_06 @Rates
Scenario: To verify the offers page and further click on package .
Given I updated a test cases in test rail "4540"
When I click on plan and Product againn
 When I Click on Frendi tag present in plans tab
 Then I get redirected to the Tab
 When I click on Offers tab in Frendi
 Then I get redirectted to Offer page in Frendi
 When I scroll the frendi offers page
 When I click on package in offers in frendi tab
 Then I verify rates in package tab
# When It get redirected to previous page
 
 