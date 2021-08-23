Feature: Covering Other Offers scenarios

@OtherOffers_1  @Offers
Scenario: To verify if the user is redirected to the Other offers page when the user click on the Other offers link  within the Plans and product dropdown
 Given I updated a test cases in test rail "1266"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 
@OtherOffers_2  @Offers
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Other offers page
 Given I updated a test cases in test rail "1271"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 And the page is scrollabble
 
 @OtheOffers_3 @Offers
 Scenario: To verify if the Prepaid button is selected by default when the user is redirected to the Other offers page.
 Given I updated a test cases in test rail "1272"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 Then The prepaid tab is selected bydefault
 
@OtherOffers_4 @Offers
Scenario: To verify if the user successfully able to view the details when the user click on the  Postpaid button within the Other offers page.
 Given I updated a test cases in test rail "1273"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 When I click on postpaid tab
 Then I get redirected to postpaid page
 
@OtherOffers_5 @Offers
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Postpaid page
  Given I updated a test cases in test rail "1331"
  When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 When I click on postpaid tab
 And The postpaid page id scrollable
 
@OtherOffers_6 @Offers
Scenario: To verify if the user successfully able to redirect to the PDF/Image page when click on the  Package card button within the Prepaid page.
 Given I updated a test cases in test rail "1338"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 Then The prepaid tab is selected bydefault
 When I click On the Pacakge card button
 Then I verify the package card
 
@OtherOffers_7 @Offers
Scenario: To verify if the user is redirected back  to the Home page when click on the  browser back  button within the Postpaid page.
 Given I updated a test cases in test rail "1338"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 When I click on postpaid tab
 And The postpaid page id scrollable
 # Then I click on back button 
 
 
 #Combined Scenarios
 # To verify if in the Postpaid tab Standard Package table is displayed
 # To verify if the text label "Your monthly postpaid  bill will be automatically adjusted downwards based on your usage." is displayed under the first row
 # To verify if in the "Postpaid" tab "Premium Package" table is displayed
 # To verify if the text label "Your monthly postpaid bill will automatically  adjusted  downwards based on your usage." is displayed under the first row
 # To verify if the text label "If you exceed your monthly allowance, the following tariffs will apply:" is displayed
 # To verify if in the "Postpaid" tab the "Data Bundles" table is displayed
 # To verify if there are a "These offers are exclusive for  Virgin Mobile App users." text labels
 # To verify if there are  "Or you can dial *108#" and "VAT is applied at the time of recharge or through transactions on our website or the Virgin Mobile App" text labels
 # To verify if the footer is displayed
 # To verify if there is a plan for 15 SAR with 50 minutes, with 30 days  
 # To verify if in the "Standard" row you have 0.20 SAR "On-Net Minutes" and 0.35 SAR "Data Rate per MB"
 
 @Offers  @Offers_08
Scenario: Combined scenarios for the above Offer postpaid section
Given I updated a test cases in test rail "1338"
 When I click on Plan and Product
 When I click on other offers in plan and Product
 Then I get redirected to Other Offers page
 When I click on postpaid tab
 Then I verify the syandard table section
 Then I verify the Monthly postpaid bill paid
 Then I verify the Premium tab is diplayed
 Then I verify the Monthly allownace text
 Then I verify the data bundles in the page
 Then I verify the exclusive virgin mobile Text
 Then I verify the Vat text
 Then I verify the footer is displayed
 Then I verify the 15 sar is displayed
 Then I verify the standard row package data