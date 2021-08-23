Feature: JoinUs page

  @JoinNow_001  @Web1 @test @JoinNow

  Scenario: To verify if the user is redirected to the Join now page when the user click on the Join now link
    Given I have updated on Test rail "7279"
    When I click on JoinNow link
    Then I redirect to Join Us Page


  @JoinNow_002  @Web1 @test @JoinNow

  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the join now page
   Given I have updated on Test rail "7280"
    When I click on JoinNow link
    Then I redirect to Join Us Page
    When I scroll the page Up and Down
    Then I verify that page is Scrollable
    

  @JoinNow_005  @Web1 @test @JoinNow

  Scenario: To verify if the number below search bar clickable or not
  Given I have updated on Test rail "7281"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Number is clickable


   
  @JoinNow_006  @Web1 @test @JoinNow

  Scenario: To verify if the new popup related to the type of number appears as the user click on any of the number
  Given I have updated on Test rail "7282"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   


  @JoinNow_007  @Web1 @test @JoinNow

  Scenario: To verify if the book it now button within the new popup is clickable or not
  Given I have updated on Test rail "7283"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   

   @JoinNow_008  @Web1 @test @JoinNow

   Scenario: To verify if tthe user is redirected to the Your plan page when click on book it now button
   Given I have updated on Test rail "7284"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   


   @JoinNow_009  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to view the number selected when the user click on the Your number dropdown within the Your plan section page.
   Given I have updated on Test rail "7285"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I click on Your Number dropdown
   Then I verify that i am able to see the number
   
   



   @JoinNow_010  @Web1 @test @JoinNow

   Scenario: To verify if tthe user is able to view the list of plans with forward and backward button within the COOL, NOW  FOR A PLAN section
   Given I have updated on Test rail "7286"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I click on Right or left Arrow
   Then I verfiy that i am able to see the Next Plan
   

   @JoinNow_011  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to click on the Get this plan button within the 215 SAR/month plan popup
   Given I have updated on Test rail "7287"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   


   @JoinNow_012  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to click on the Create your plan button within the 215 SAR/month plan popup
   Given I have updated on Test rail "7288"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   


   @JoinNow_013  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to select National minutes when the user click on any of the  national minutes from the carouse
   Given I have updated on Test rail "7289"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   When I Select Any National plan
   Then I verify I have selected national plan
  
   @JoinNow_014  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to select Data when the user click on any of the data from the carousel
   Given I have updated on Test rail "7290"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   When I Select Any Data Plan
   Then I verify I have selected Data plan

   
   @JoinNow_015  @Web1 @test @JoinNow
 Scenario: To verify if the user is able to click on the Get this plan button within the create your plan popup
   Given I have updated on Test rail "7291"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   When I Select Any National Plan and Data plan and click on Get Plan button
   Then I verify for the Eligibility page
   


   @JoinNow_016  @Web1 @test  @new @JoinNow
   Scenario: To verify Package card button is clickable or not within Create plan popup 
   Given I have updated on Test rail "7292"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   When I click on Package Card button
   Then I verify that Package card button is clickable
   

   @JoinNow_017  @Web1 @test @new @JoinNow

   Scenario: To verify if the user is redirected to the Pdf file page when click on the Package card button within the create your plan popup
  Given I have updated on Test rail "7293"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on CreateAPlan Popup
   Then I verify that I am On create a plan popup
   When I click on Package Card button
   Then I verify that the file opened is of Pdf type
   
   @JoinNow_018  @Web1 @test @new @JoinNow
   Scenario: To verify if the Package card button is clickable or not within the Your plan popup
   Given I have updated on Test rail "7294"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I click on Package Card button on Plan Page
   Then I verify that Package card button is clickable
   
   @JoinNow_019  @Web1 @test @new @JoinNow
   Scenario: To verify if the user is redirected to the png image page when click on the Package card button within the your plan popup
   Given I have updated on Test rail "7295"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I click on Package Card button on Plan Page
   Then I verify that the file opened is of Pdf format


   @JoinNow_020  @Web1 @test @JoinNow

   Scenario: To verify if the user is able to click on the Get this plan button on 70 sar popup
   Given I have updated on Test rail "7296"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 70Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   



   @JoinNow_021  @Web1 @test @JoinNow

   Scenario: To verify user is able to click on the ID type dropdown
   Given I have updated on Test rail "7297"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 70Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I click on ID dropdown
   Then I verify That i am able to get different options
   
  @JoinNow_022  @Web1 @test @JoinNow
   Scenario: To verify if the user is populated with the IdNumber,Nationality and Your City in KSA fields when the user ones select any of the ID Type:
   Given I have updated on Test rail "7298"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I click on ID dropdown
   Then I verify that IdNumber,Nationality and Your city in KSA is displayed


   
   @JoinNow_023  @Web1 @test @JoinNow
   Scenario: To verify if the user is redirected to the Sorry page when the user fails to match the records within the fields
   Given I have updated on Test rail "7299"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter invalid "34frfrdf" in ID_Number, "Answer" in Nationality and " Ha'il" in City
   And click on Check button
   Then I Verify that i redirected to Sorry page
   
   @JoinNow_024  @Web1 @test @JoinNow
   Scenario: To verify if the user is redirected back to the Check eligibility page when the user clicks on the RE-ENTER my info button on Sorry page
   Given I have updated on Test rail "7300"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter invalid "34frfrdf" in ID_Number, "Answer" in Nationality and " Ha'il" in City
   And click on Check button
   Then I Verify that i redirected to Sorry page
   When I click on ReEnter my Info Button
   Then I verify for the Eligibility page

   @JoinNow_025  @Web1 @JoinNow

   Scenario: To verify if the user is redirected to Congratulation section page when the user enter valid details under Eligibility page
   Given I have updated on Test rail "7301"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page

    @JoinNow_026  @Web1 @test 

   Scenario: To verify if the user is redirected to the create account  page when the user click on the Continue button within the congratulations popup.
   Given I have updated on Test rail "7302"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page   
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   

   @JoinNow_027 @Web1 @test @JoinNow
  Scenario: To verify if the social links remains as it is when the user click on I agree with the legal stuff checkbox.
   Given I have updated on Test rail "7304"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   Then I verify that social media links are same as before clicking on link
   

   @JoinNow_028 @Web1 @test 
  Scenario: To verify if the user is getting the valid error message when the user attempts to create an account using already registered email
   Given I have updated on Test rail "7305"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to error message
   

   @JoinNow_029 @Web1 @test
 Scenario: To verify if the user is redirected to the Absher login page when the user enter the valid details under Create Account.
   Given I have updated on Test rail "7306"
    When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   

    @JoinNow_030 @Web1 @test @JoinNow
   Scenario: To verify if the user is redirected to the Absher login page then user is able to scroll page up and down
   Given I have updated on Test rail "7308"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page


   @JoinNow_031 @Web1 @test @JoinNow
 Scenario: To verify if the user is redirected to the Login to SP section under Absher page when the user click on Absher Login button.
   Given I have updated on Test rail "7309"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "Testabc@yopmail.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   


   @JoinNow_032 @Web1 @test @JoinNow
 Scenario: To verify if the user is redirected to the Getting your sim page when the user click on the Return Dummy IAM Token within the "Login to SP section
   Given I have updated on Test rail "7310"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page

   @JoinNow_033 @Web1 @test 

   Scenario: To verify if the I have Virgin Mobile SIM checkbox is clickable or not
   Given I have updated on Test rail "7311"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page
   And I verify that virgin sim checbox is clickable
   


   @JoinNow_034 @Web1 @test 

   Scenario: To verify if the user is able to enter the valid SIM number within the "Type your sim here" field withiun the  I have Virgin Mobile SIM checkbox 
  Given I have updated on Test rail "7312"
   When I click on JoinNow link
   Then I redirect to Join Us Page
 #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I enter email Address in to the field
  When I Enter Password
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page
   And I verify that virgin sim checbox is clickable
   When I Enter "2345678901" in textfield
   And click on Continue button
   Then I verify That i redirect to next page
   

   @JoinNow_035 @Web1 @test 

   Scenario: To verify if the user is redirected to the Get your sim page when  the user  Click on try again button over the error message
   Given I have updated on Test rail "7313"
    When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "9Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page
   And I verify that virgin sim checbox is clickable
   When I Enter "2345678901" in textfield
   And click on Continue button
   And I click on try again button and i redirect back to get sim page
   



    @JoinNow_036 @test @JoinNow
    Scenario: To verify if the user is redirected to the card details page when the user Click on the I have eSim checkbox and click on the Continue button
    Given I have updated on Test rail "7314"
    When I click on JoinNow link
    Then I redirect to Join Us Page
#When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "992Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page
   And I verify that virgin sim checbox is clickable
   When I Enter "2345678901" in textfield
   And click on Continue button
   And I click on try again button and i redirect back to get sim page
   When I select eSim Checkbox
   And click on Continue button
   Then I redirect to Card detail page

   @JoinNow_037 @test @JoinNow

   Scenario: To verify if the user is redirected to the card details page when the user Click on the Get me the SIM delivered checkbox and click on the Continue button
   Given I have updated on Test rail "7315"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "883Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   Then I verify That I redirect to Getting your Sim Page
   When I select Get me sim delivered Checkbox
   And click on Continue button
   Then I redirect to Card detail page
   



   @JoinNow_038 @test @JoinNow

   Scenario: To verify if user enter invalid details of card then done button remain inactive
   Given I have updated on Test rail "7316"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "892Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   #Then I verify That I redirect to Getting your Sim Page
   #When I select eSim Checkbox
   #And click on Continue buttonThen I verify the screen Getting your sim
   Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I redirect to Card detail page
   When I Enter "5435 3536 3636 3636" in card, "dummy" in cardName, "10/22" in expiry and "345" in CVV
   Then I verify that done button is not enabled
   



   @JoinNow_039 @test 

   Scenario: To verify if the user is able to redirect back to the previous page when the user click on the back button of the browser
   Given I have updated on Test rail "7317"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and "Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "80Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
   #Then I verify That I redirect to Getting your Sim Page
   #When I select eSim Checkbox
   #And click on Continue button
   When I try to hit back button on browser
   Then I verify That I redirect to Getting your Sim Page
   


   @JoinNow_040 @test 

   Scenario: To verify if user enter valid details of card then done button is active and user is redirected to ACS Emulator page
   Given I have updated on Test rail "7318"
   When I click on JoinNow link
   Then I redirect to Join Us Page
   ##When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
  # Then I verify That I redirect to Getting your Sim Page
  # When I select eSim Checkbox
  # And click on Continue button
  Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I redirect to Card detail page
   When I Enter "4111 1111 1111 1111" in card, "test" in cardName, "03/30" in expiry and "737" in CVV
   And I click on Done button
   Then I verify that i redrected to ACS Emulator page
   


   @JoinNow_041 @test @JoinNow

   Scenario: To verify if the user is able to redirect back to the previous page when the user click on the back button of the browser
   Given I have updated on Test rail "7319"
   When I click on JoinNow link
   Then I redirect to Join Us Page
  #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "674Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
  # Then I verify That I redirect to Getting your Sim Page
  # When I select eSim Checkbox
  # And click on Continue button
  Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I redirect to Card detail page
   When I Enter "4111 1111 1111 1111" in card, "test" in cardName, "03/30" in expiry and "737" in CVV
   And I click on Done button
   Then I verify that i redrected to ACS Emulator page
   When I try to hit back button on browser
   Then I redirect to Card detail page
   
   @JoinNow_042 @Not-executed @test15 @Rail
   Scenario: To verify if the user is redirected to the success page  when the user click on the Submit button over ACS Simulator page.
   Given I have updated on Test rail "7325"
   When I click on JoinNow link
   Then I redirect to JoinNow Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "567Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
 #  Then I verify That I redirect to Getting your Sim Page
 #  When I select eSim Checkbox
 #  And click on Continue button
 Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I redirect to Card detail page
   When I Enter "4111 1111 1111 1111" in card, "test" in cardName, "03/30" in expiry and "737" in CVV
   And I click on Done button
   Then I verify that i redrected to ACS Emulator page
   And I verify that I get redirected to success page after click on submit button
   
   @JoinNow_Mobile  @test15 @joinNowMob
   Scenario: To verify if the user is redirected to the success page  when the user click on the Submit button over ACS Simulator page.
   Given I have updated on Test rail "7322"
   When I click on hamburger in Mobile site
   When I click on JoinNow link in Mobile
   Then I redirect to JoinNow Page
   #When I change page language to English
   When I Click on any number
   Then I verify Details of the number gets displayed
   When I click on BookNow button
   Then I verify that BookNow button is clickable
   Then I verify that YourPlan Page Opens
   When I verify popup for 215Plan and click on GetPlan Button
   Then I verify for the Eligibility page
   When I Select "Iqama" in ID, Enter valid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
   And click on Check button
   Then I Verify that i redirected to Congratulations page
   When I Click on Continue button
   Then I verify that i Redirected to Create Account Page
   When I Enter "567Test@mailinator.com" in email and "Test@123" in password and select agree check box
   And I click on Create account button
   Then I verify that I Redirect to Absher Login page
   And I veriy I am able to scroll up and down the page
   When I click on Absher Login button
   Then I redirect to Login to Sp section
   When I Click on Return Dummy IAM token 
 #  Then I verify That I redirect to Getting your Sim Page
 #  When I select eSim Checkbox
 #  And click on Continue button
 Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I redirect to Card detail page
   When I Enter "4111 1111 1111 1111" in card, "test" in cardName, "03/30" in expiry and "737" in CVV
   And I click on Done button
   Then I verify that i redrected to ACS Emulator page
   And I verify that I get redirected to success page after click on submit button
   