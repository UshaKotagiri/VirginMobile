Feature: Covering International Roaming scenarios

@InternationalRoaming_1 @Roaming
Scenario: To verify if the user is redirected to the International roaming page when the user click on the International roaming  link.
 Given I updated a test cases in test rail "5460"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
 Then the Roaming header is displayed
 
@InternationalRoaming_2 @Roaming
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the International roaming page
 Given I updated a test cases in test rail "5462"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
 Then the Roaming page is scrolled
 
@InternationalRoaming_3_4_5 @Roaming
Scenario: To verify if the Operators, Local Call Rate, Call to KSA,Received Call,Call to 3d Destination and Data Packages fields are populated with the details when the user select any country within the International roaming page
 Given I updated a test cases in test rail "5464"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
#Then the Roaming page is scrolled
 When I click on select countries dropdown
 Then I select options from dropdown and get the roaming rates
 When I click on back bttn I get redirected to back page
 
 @InternationalRoaming_2 @Roaming
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the International roaming page
# Given I updated a test cases in test rail "1341"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
 Then the Roaming header is displayed
 
 @InternationalRoaming_2 @Roaming
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the International roaming page
 Given I updated a test cases in test rail "5468"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
 Then verify the banner items
 
 @InternationalRoaming_2 @Roaming
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the International roaming page
 Given I updated a test cases in test rail "5472"
 When I click on planandproduct12 button
 When I click on International1 Roaming bttn
 Then the Roaming page is scrolled
 Then I verify the roaming bundles
 Then I verify the text for the roaming rates
 Then I verify the rates for 25 sar
 Then I verify the rates for 50 sar
 Then I verify kuwait and oman as country
 Then I verify Countries and validity tabs
 Then I verify you pay tab
 Then I verify you get tab
 
 
 