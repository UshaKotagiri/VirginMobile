 Feature: Covering Frendi Device scenarios

 @Frendi_1_2_3 @Frendi
 Scenario: To verify if the user is redirected to the Friendi package page when the user click on the Friendi package link and the package btn is highlighted.
 Given I have updated on Test rail "4457"
 When I click on plan and productna
 When I click on Frendi1 tab
 When I scroll down frendi page
 Then I see package is already highlighted
 
 @Frendi_4_5_6_7_8 @Frendi 
 Scenario: To verify if the user is redirected to the data details section when click on the data details button within the Friendi package page.
 Given I have updated on Test rail "4460"
 When I click on plan and productna
 When I click on Frendi1 tab
 When I scroll down frendi page
 Then I see package is already highlighted
 When I click on data button
 Then I get redirected to data page
 When I click on Package button on data page
 Then I verify its redirected to package page
 #When I go to back page on frendi

  
  @Frendi_9_10_11 @Frendi
  Scenario:To verify if the user is redirected to the png image page when click on the Package card button within the  calls section.
 Given I have updated on Test rail "4465"
 When I click on plan and productna
 When I click on Frendi1 tab
 When I scroll down frendi page
 When I click on call tab in frendi
# When I go to back page on frendi
Then I get redirected to required page
 
 @Frendi_1_2_3 @Frendi
 Scenario: To verify if the user is redirected to the Friendi package page when the user click on the Friendi package link and the package btn is highlighted.
 Given I have updated on Test rail "4467"
 When I click on plan and productna
 When I click on Frendi1 tab
 Then I verify the page content
 When I click on data button
 Then I get redirected to data page
 Then I verify the Data Bundles
 Then I verify fees data in the table
 Then I verify Plan for sar data
 When I click on call tab in frendi
 Then I verify local calls to table
 Then I verify halala rates in calls tab
 Then I verify Frendi mobile nmber
 When I scroll down frendi page
 Then I verify other mobile network
 Then I verify sms table
 Then I verify on net minutes networks
 Then I verify vat is applied text
 Then I verify the number in the call tab
 Then I verify 1 sar fees 
 Then I verify 7 sar in the table
 Then I verify 25 sar in the table
 
 
 @Frendi_1_2_3 @Frendi
 Scenario: To verify if the user is redirected to the Friendi package page when the user click on the Friendi package link and the package btn is highlighted.
 Given I have updated on Test rail "4479"
 When I click on plan and productna
 When I click on Frendi1 tab
 When I click on rates tab in frendi
 Then I verify International rates
 Then I verify IDD bundles
 Then I verify countries fees in the idd bundles
 Then I verify there is a plan for bangladesh
 Then I verify there is a plan for india
 When I scroll down frendi page
 Then I verify there is a plan for pakistan
 Then I verify there is a plan for phillipines
 When I scroll down frendi page
 Then I verify there is a plan for syria
 Then I verify there is a plan for Egypt
 Then I verify there is a plan for Nepal
  When I scroll down frendi page
  Then I verify vat text
  Then I verify international pay
  Then I verify the text in international pay
  Then I verify the international call to bangladesh India Egypy
  Then I verify International callto yemen
  Then I verify International call to pakistan
  When I scroll down frendi page
  Then I check the select countries dropdown
 
@Frendi_1_2_3 @Frendi
 Scenario: To verify if the user is redirected to the Friendi package page when the user click on the Friendi package link and the package btn is highlighted.
 Given I have updated on Test rail "4485"
 When I click on plan and productna
 When I click on Frendi1 tab
 When I click on Offers tab in frendi
 Then I verify bundelha plans
 When I scroll down frendi page
 Then I verify the data for 19 sar
 Then I verify the data for 45 sar
 Then I verify the data for 70 sar
 Then I verify the data for 90 sar
 Then I verify the data for 110 sar
 When I scroll down frendi page
 Then I verify Bonus discount on recharge
 Then I verify the data for 10 sar
 Then I verify the data for 15 sar
 Then I verify the data for 20 sar
 Then I verify the data for 30 sar
 Then I verify the data for 100 sar
 
 #combined scenarios:
 # Check if there is a table displayed with the following values: ""Recharge Denomination"", ""National Calls & PAYG Internet"", ""National Calls (On-Net) and SMS"", ""Voice to Landline"" and Validity""
 # "Check if there is a text ""Bonus can be used for local calls FREE calls and SMS when you recharge:
 # Check if there is a "Or you can dial *108#" text label displayed
 # Check if there is a "Bundelha Plans" text label
 # Check if the Hot Offers screen is displayed by clicking on the "Hot Offers" button
 # Check if the text "No matter where you go, you are never too far from your loved ones or your work. FRiENDi International Roaming keeps you connected to your world without any interrupted " is displayed
 # Check if there is a text "Say hello to the rest of the world from KSA," displayed
 # Check if there are a "Or you can dial *116#" and "Prices are VAT exclusives" text labels
 Scenario: Above combined scenarios  i.e.  verification of the abpve text or tables as mentioned
 Given I have updated on Test rail "4457"
 When I click on plan and product
 When I click on Frendi1 tab
 When I scroll down frendi page
 Then I verify the Recharge Denomination national calls sms and voice to landline text in table
 Then I verify that bonus text is available
 Then I verify the Hot offer screen is displayed
 Then I verify the text no matter where you go is displayed
 Then I verify say hello text is available
 Then I verify the dial and vat text available in the page
 When I click on Hot offers button 
 Then I Verify hot offers page