
Feature: Covering Web Plan and Product cases

  @Plan_Product_001 @PlanProduct
  Scenario: To verify if the user is redirected to the Other offers page when the user click on the Other offers link.
  Given I have updated case under Test Rail "3768"
  When I click on Other offers under Plan and Product
  Then I verify that I get redirected to Other Offer
 
  @Plan_Product_002 @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Other offers page
  Given I have updated case under Test Rail "3769"
  When I click on Other offers under Plan and Product
  Then I verify that I get redirected to Other Offer
  When I scroll the page_Up and Down
  Then I verify the Data Bundles is available
  
  @Plan_Product_003 @PlanProduct
  Scenario: To verify if the Prepaid button is selected by default when the user is redirected to the Other offers page.
  Given I have updated case under Test Rail "3770"
  When I click on Other offers under Plan and Product
  Then I verify that I verify that Prepaid button is selected ByDefault
  
  @Plan_Product_004 @PlanProduct
  Scenario: To verify if the user successfully able to view the details when the user click on the  Postpaid button within the Other offers page.
  Given I have updated case under Test Rail "3772"
  When I click on Other offers under Plan and Product
  Then I verify that I get redirected to Other Offer
  When I click on PostPaid button
  Then I verify That I am able to view Postpaid details
  
  @Plan_Product_005 @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Postpaid page
  Given I have updated case under Test Rail "3774"
  When I click on Other offers under Plan and Product
  Then I verify that I get redirected to Other Offer
  When I click on PostPaid button
  Then I verify That I am able to view Postpaid details
  When I scroll the page_Up and Down
  Then I verify the premium package 
  
  @Plan_Product_006 @PlanProduct
  Scenario: To verify if the user successfully able to redirect to the PDF/Image page when click on the  Package card button within the Prepaid page.
  Given I have updated case under Test Rail "3775"
  When I click on Other offers under Plan and Product
  Then I verify that I verify that Prepaid button is selected ByDefault
  When I click PackageCard_Button
  Then I verify That i redirected to PDF image on next tab
  
  @Plan_Product_007 @PlanProduct
  Scenario: To verify if the user is redirected back  to the Home page when click on the  browser back  button within the Postpaid page.
  Given I have updated case under Test Rail "3777"
  When I click on Other offers under Plan and Product
  Then I verify that I get redirected to Other Offer
  When I click on PostPaid button
  Then I verify That I am able to view Postpaid details
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_008 @PlanProduct
  Scenario: To verify if the user is redirected to the International rates page when the user click on the International rates  link.
  Given I have updated case under Test Rail "3778"
  When I click on International_Rates under Plan and Product
  Then I verify that I get redirected to International_Rates
  
  @Plan_Product_009 @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Inyternational rates page
  Given I have updated case under Test Rail "3779"
  When I click on International_Rates under Plan and Product
  Then I verify that I get redirected to International_Rates
  When I scroll the page_Up and Down
  
  @Plan_Product_010 @PlanProduct
  Scenario: To verify if the select country dropdown  is clickable or not within the Intternational rates page
  Given I have updated case under Test Rail "3780"
  When I click on International_Rates under Plan and Product
  Then I verify that I get redirected to International_Rates
  When I click on Select_Country Dropdown
  Then I verify that I am able to select fromt he dropdown
   
  @Plan_Product_011 @PlanProduct
  Scenario: To verify if the Local SMS and Calls field is populated with the details when the user select any country within the International rates page
  Given I have updated case under Test Rail "3781"
  When I click on International_Rates under Plan and Product
  Then I verify that I get redirected to International_Rates
  When I click on Select_Country Dropdown
  Then I verify that I am able to select fromt he dropdown
  And I verify That local SMS and Call Fields are populated 
  
  @Plan_Product_012 @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the International rates page.
  Given I have updated case under Test Rail "3782"
  When I click on International_Rates under Plan and Product
  Then I verify that I get redirected to International_Rates
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_013  @PlanProduct
  Scenario: To verify if the user is redirected to the International roaming page when the user click on the International roaming  link.
  Given I have updated case under Test Rail "3783 "
  When I click on International_Roaming under Plan and Product
  Then I verify that I get redirected to International_Roaming
  
  @Plan_Product_014  @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the International roaming page
  Given I have updated case under Test Rail "3784 "
  When I click on International_Roaming under Plan and Product
  Then I verify that I get redirected to International_Roaming
  When I scroll the page_Up and Down
  
  @Plan_Product_015  @PlanProduct
  Scenario: To verify if the select country dropdown  is clickable or not within the International roaming page
  Given I have updated case under Test Rail "3785 "
  When I click on International_Roaming under Plan and Product
  Then I verify that I get redirected to International_Roaming
  When I click on Select_Country1 Dropdown
  Then I verify that I am able to select fromt the dropdown
  
  @Plan_Product_016  @PlanProduct
  Scenario: To verify if the Operators, Local Call Rate, Call to KSA,Received Call,Call to 3d Destination and Data Packages fields are populated with the details when the user select any country within the International roaming page
  Given I have updated case under Test Rail "3786 "
  When I click on International_Roaming under Plan and Product
  Then I verify that I get redirected to International_Roaming
  When I click on Select_Country1 Dropdown
  Then I verify that I am able to select fromt the dropdown
  And I verify That I am able to view Local Call_SMS_fields
  
  @Plan_Product_017 @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the International roaming page.
  Given I have updated case under Test Rail "3787 "
  When I click on International_Roaming under Plan and Product
  Then I verify that I get redirected to International_Roaming
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_018 @PlanProduct
  Scenario: To verify if the user is redirected to the Family tag device page when the user click on the Family tag device  link.
  Given I have updated case under Test Rail "3788 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  
  @Plan_Product_019  @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Family tag device page
  Given I have updated case under Test Rail "3789 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I scroll the page_Up and Down
  
  @Plan_Product_020  @PlanProduct
  Scenario: To verify if the user is redirected to the Download App page when the user Click on the Download app button within the Family tag device page.
  Given I have updated case under Test Rail "3790 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I Click on Download App
  Then I verify That I redirected to Download App Page
  
  @Plan_Product_0PlanProduct  @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the Download app page.
  Given I have updated case under Test Rail "3791 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I Click on Download App
  Then I verify That I redirected to Download App Page
  When I Press Browser back button
  Then I verify that I get redirected to Family_TagDevice
  
  @Plan_Product_022  @PlanProduct
  Scenario: To verify if the user is redirected to the Join now page when the user Click on the Join now button within the Family tag device page.
  Given I have updated case under Test Rail "3792 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I Click on Join_now
  Then I verify That I redirected to Join_Now Page
  
  @Plan_Product_023  @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the Join now page.
  Given I have updated case under Test Rail "3793 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I Click on Join_now
  Then I verify That I redirected to Join_Now Page
  When I Press Browser back button
  Then I verify that I get redirected to Family_TagDevice
   
  @Plan_Product_024  @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the Family tag device page.
  Given I have updated case under Test Rail "3794 "
  When I click on Family_TagDevice under Plan and Product
  Then I verify that I get redirected to Family_TagDevice
  When I scroll the page_Up and Down
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_025  @PlanProduct
  Scenario: To verify if the user is redirected to the Friendi package page when the user click on the Friendi package  link.
  Given I have updated case under Test Rail "3795 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  
  @Plan_Product_026  @PlanProduct
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Friendi package page
  Given I have updated case under Test Rail "3796 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I scroll the page_Up and Down
  
  @Plan_Product_027  @PlanProduct
  Scenario: To verify if the Friendi package button is selected by default when the user is redirected to the Friendi package page.
  Given I have updated case under Test Rail "3797"
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  And I verify that FriendiButton is selected By default
  
  @Plan_Product_028  @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the Friendi package page.
  Given I have updated case under Test Rail "3798 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_029 @PlanProduct
  Scenario: To verify if the user is redirected to the data details section when click on the data details button within the Friendi package page.
  Given I have updated case under Test Rail "3799 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on data button
  Then I verify that data details are displayed
  
  @Plan_Product_030 @PlanProduct
  Scenario: To verify if the Package card button is clickable or not within the  data details section.
  Given I have updated case under Test Rail "3800"
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on data button
  Then I verify that data details are displayed
  When I click on Package
  Then I verify that Package is clickable
  
  @Plan_Product_031  @PlanProduct
  Scenario: To verify if the user is redirected to the png image page when click on the Package card button within the  data details section.
  Given I have updated case under Test Rail "3801 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on data button
  Then I verify that data details are displayed
  When I click on Package
  Then I verify that Package open PDF page
  
  @Plan_Product_032 @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the data details page.
  Given I have updated case under Test Rail "3802 "
   When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on data_button
  Then I verify that data details are displayed
  When I Press Browser back button
  Then I verify that i redirected back to Homepage
  
  @Plan_Product_033 @PlanProduct
  Scenario: To verify if the user is redirected to the calls section when click on the calls button within the Friendi package page.
  Given I have updated case under Test Rail "3803 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on Call button
  Then I verify that I navigate to Call detail page
  
  @Plan_Product_034  @PlanProduct
  Scenario: To verify if the Package card button is clickable or not within the  calls section.
  Given I have updated case under Test Rail "3804 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on Call button
  Then I verify that I navigate to Call detail page
  When I scroll page down
  When I click on Package11
  Then I verify that Package is clickable
  
  @Plan_Product_035 @PlanProduct
  Scenario: To verify if the user is redirected to the png image page when click on the Package card button within the  calls section.
  Given I have updated case under Test Rail "3805 "
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on Call button
  Then I verify that I navigate to Call detail page
  When I scroll page down
  When I click on Package11
  Then I verify that Package open PDF page
  
  @PlanProduct
  Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back  button within the calls page.
  Given I have updated case under Test Rail "3806"
  When I click on Friendi package under Plan and Product
  Then I verify that I get redirected to Friendi package
  When I click on Call button
  Then I verify that I navigate to Call detail page
  When I Press Browser back button
  Then I verify that i redirected back to Homepage