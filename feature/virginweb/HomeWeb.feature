Feature: HomeWeb page


@HomeWeb_001
@HomeW1 @Homeweb
 Scenario: To verify User is redirected to Home page
 Given I have updated on Test rail "7367"
 Then I verify that i redirected to HomePage
 

 @HomeWeb_002 @HomeW1 @Homeweb
 Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the home page
  Given I have updated on Test rail "7368"
 When I scroll the page Up Down
 Then I verify that Page is scrollable
 

 @HomeWeb_003 @HomeW1 @Homeweb
Scenario: To verify if the user is redirected to the COOL NOW FOR A PLAN  page when the user click on I LOVE IT button.
  Given I have updated on Test rail "7369"
 Then I verify that i redirected to HomePage
 When I click on I love it button
# When I change page language into English
 Then I verify that I redirected to COOL NOW FOR A PLAN page
 

 @HomeWeb_004 @HomeW1 @Homeweb @Rail
 Scenario: To verify if the user is able to view the list of plans with forward and backward button within the Homepage under Pick or create plan section
  Given I have updated on Test rail "7370"

 @HomeWeb_004 @HomeW1 
Scenario: To verify if the user is able to view the list of plans with forward and backward button within the Homepage under Pick or create plan section
 Then I verify that i redirected to HomePage
 When I scroll the page upto Pick or create your plan
 Then I verify that right arrow is working and i redirect to 250 plan popup
 And I verify that left arrow is working and i redirect back to 70 plan popup


 @HomeWeb_005 @HomeW1 @Homeweb
Scenario: To verify Package card button is clickable or not
  Given I have updated on Test rail "7371"
 Then I verify that i redirected to HomePage
 When I scroll the page upto Pick or create your plan
 When I click on Package button
 Then I verify that Package button is clickable


 @HomeWeb_006 @HomeW1 @Homeweb
Scenario: To verify if the user is redirected to the Pdf file page when click on the Package card button within the  popup
  Given I have updated on Test rail "7372"
 Then I verify that i redirected to HomePage
 When I scroll the page upto Pick or create your plan
 When I click on Package button
 Then I verify that pdf file opened on click of package card


  @HomeWeb_007 @HomeW1 
Scenario: To verify if the user is able to redirect to PICK YOUR NUMBER screens when the user click on the Get your plan button over the popup
   Given I have updated on Test rail "7373"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page



  @HomeWeb_008 @HomeW1 
Scenario: To verify if the number selected is shown on the right panel under PICK YOUR NUMBER
 Given I have updated on Test rail "7374"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  

  @HomeWeb_009 @HomeW1
 Scenario: To verify if the user is redirected to the check eligibility page when the user click on the Book it now button
   Given I have updated on Test rail "7375"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page


  @HomeWeb_010 @HomeW1 
Scenario: To verify user is able to click on the ID type dropdown
   Given I have updated on Test rail "7376"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I click on Id DropDwn
  Then I verify that i am able to select any value

  @HomeWeb_011 @HomeW1 
  Scenario: To verify if the user is populated with the  ID Number, Nationality, Your current city in KSA fields when the user ones select any of the ID Type:
   Given I have updated on Test rail "7377"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I click on Id DropDwn
  Then I verify that i can see IDNum,Nationality and KSA fields
  

  @HomeWeb_012 @HomeW1 
Scenario: To verify if the user is redirected to the Sorry page when the user fails to match the records within the fields ID Number, Nationality, Your current city in KSA
   Given I have updated on Test rail "7378"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "34frfrdf" in ID_Number, "Answer" in Nationality and " Ha'il" in City
  And I click on Check_button
  Then I Verify that i redirected to Sorry_page


  @HomeWeb_013 @HomeW1 @Homeweb
Scenario: To verify if the user is redirected to the eligibility page when click onreenter btn under sorry popup
   Given I have updated on Test rail "7379"
   Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "34frfrdf" in ID_Number, "Answer" in Nationality and " Ha'il" in City
 And I click on Check_button
  Then I Verify that i redirected to Sorry_page
  When I click on ReEnter_Btn
  Then I verify that i redirected to eligibility page
  

  @HomeWeb_014 @HomeW1  @Rail
  Scenario: To verify if the user is redirected to the Congratulation page when the user match the records within the fields ID Number, Nationality, Your current city in KSA
  Given I have updated on Test rail "7380"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
 And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  


  @HomeWeb_015 @HomeW 
  Scenario: To verify if the user is redirected to the create account  page when the user click on the Continue button within the congratulations popup.
  Given I have updated on Test rail "7381"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
  And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  


  @HomeWeb_016 @HomeW1 @Homeweb
Scenario: To verify if the social links remains as it is when the user click on "I agree with the legal stuff" checkbox.
Given I have updated on Test rail "7382"
   Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
# When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
  And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  And I verify for the social media links
  

  @HomeWeb_017 @HomeW1 @Homeweb
Scenario: To verify if the user is getting the validation error message when the user attempts to create an account using already registered email
   Given I have updated on Test rail "7383"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
  And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
  And I click on button
  Then I verify that I get error message 
 
  @HomeWeb_018 @HomeW1 
  Scenario: To verify if the user is redirected to the Absher login page when the user enter the valid details.
   Given I have updated on Test rail "7384"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
 And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  When I Enter "3Test@gmail.com" in Email and "Test@124" in Password 
  And I click on button
  Then I verify that i redirected to AbsherLogin page
  

  @HomeWeb_019 @HomeW1
  Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the absher login page
   Given I have updated on Test rail "7385"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
 And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
  And I click on button
  Then I verify that i redirected to AbsherLogin page
  And I scroll the page up_down

  @HomeWeb_020 @HomeW1 
Scenario: To verify if the user is redirected to the Login to SP section under Absher page when the user click on Absher Login button.
   Given I have updated on Test rail "7386"
  Then I verify that i redirected to HomePage
  When I scroll the page upto Pick or create your plan
  When I click on Get plan button
 # When I change page language into English
  Then I verify that I redirected to PICK YOUR NUMBER page
  When I select any number
  Then I verify that number gets displayed in right side of panel
  When I click on Book_Now button
  Then I verify that i redirected to eligibility page
  When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
 And I click on Check_button
  Then I Verify that i redirected to Congratulation_page
  When I click on continue btn
  Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
  And I click on button
  Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   

@HomeWeb_021 @HomeW1 
Scenario: To verify if the user is redirected to the Getting your sim page when the user click on the Return Dummy IAM Token within the Login to SP section
    Given I have updated on Test rail "7387"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page 

   @HomeWeb_022 @HomeW1 
Scenario: To verify if the I have Virgin Mobile SIM checkbox is clickable or not
    Given I have updated on Test rail "7388"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
  And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   And I verify that virgin_sim_checbox is clickable
   

   @HomeWeb_023 @HomeW1 @Homeweb
Scenario: To verify if the user is able to enter the valid SIM number within the Type your sim here field withiun the  I have Virgin Mobile SIM checkbox
    Given I have updated on Test rail "7389"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   When I click on virgin sim checkbox
   Then I verify that SimTextField is enabled and i am able to enter sim number 
   


   @HomeWeb_024 @HomeW1 @Homeweb
   Scenario: To verify if the user get the validation message for entering valid Sim number without checking the  I have Virgin Mobile SIM checkbox
   Given I have updated on Test rail "7391"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button   
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   And I verify that SimText field is disabled without cchecking vigin checkbox
   

   @HomeWeb_025 @HomeW1 
Scenario: To verify if the user is redirected to the next page when the user  Click on the Continue button by checking the  I have Virgin Mobile SIM checkbox
    Given I have updated on Test rail "7392"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   When i select virgin sim checkbox and enter valid number and click on continue button
   Then I verify that i redirected to next page
   

   @HomeWeb_026 @HomeW1 @Homeweb
   Scenario: To verify if the user is redirected to the Get your sim page when  the user  Click on try again button over the error message
    Given I have updated on Test rail "7393"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password  
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   When i select virgin sim checkbox and enter valid number and click on continue button
   Then I verify that i redirected to next page
   When I click on TryAgain button
   Then I verify i redirect to Getting Sim Page
   
   @HomeWeb_027 @HomeW  @test2 @Rail 
   Scenario: To verify if the user is redirected to the card details page when the user Click on the I have eSim checkbox and click on the Continue button
   Given I have updated on Test rail "7394"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password  
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   When I click on eSim_Checkbox and click on continue button
   Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   
   @HomeWeb_028 @HomeW  @test2 @Rail
   Scenario: To verify that user is able to redirect to back page from card details page
    Given I have updated on Test rail "7395"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
  # Then I verify i redirect to Getting Sim Page
  # When I click on eSim_Checkbox and click on continue button
   Then I verify I redirect to Card detail page
   When I click on browser back button
   Then I verify i redirect to Getting Sim Page
   
   @HomeWeb_029 @HomeW @test1 @Rail @Homeweb
   Scenario: To verify if the user is able to view the number selected when the user click on the Your number dropdown .
    Given I have updated on Test rail "7396"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I click on your number dropdown
   Then I verify that i am able to view number in it
   
   @HomeWeb_030 @HomeW @test2 @Rail 
   Scenario: To verify if the user is redirected to the card details page when the user Click on the Get me the SIM delivered checkbox and click on the Continue button
    Given I have updated on Test rail "7397"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
  When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
   Then I verify i redirect to Getting Sim Page
   When I click on gettingSimDelivered_Checkbox and click on continue button
   Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   
   @HomeWeb_031 @HomeW @test1 @Rail @Homeweb
   Scenario: (29_33)To verify if the user get the error message when the user Click on the Done button with invalid fields under Card Detail page.
    Given I have updated on Test rail "7398"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
  # Then I verify i redirect to Getting Sim Page
  # When I click on eSim_Checkbox and click on continue button
  Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   When I put "5435 3536 3636 3636" in cardNum, "dummy" in cardHolder, "10/22" in ExpiryDate and "345" in CVVField
   Then I verify that done_button is not enabled
   
   @HomeWeb_032 @HomeW @test1 @nw @Rail 
   Scenario: (30_34)To verify if the user gets the ACS Emulator Page when the user enter the valid card details and click on Done button
    Given I have updated on Test rail "7399"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
  #Then I verify i redirect to Getting Sim Page
  #When I click on eSim_Checkbox and click on continue button
  Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   When I put "4111 1111 1111 1111" in cardNum, "dummy" in cardHolder, "05/21" in ExpiryDate and "123" in CVVField
   And I click on Done_button
   Then I verify that i redrected to ACS_Emulator_page
   
   @HomeWeb_033 @HomeW @test1 @nw 
   Scenario: To verify if the user is able to redirect back to the previous page when the user click on the back button of the browser under ACS emulator
    Given I have updated on Test rail "7400"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password  
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
  # Then I verify i redirect to Getting Sim Page
  # When I click on eSim_Checkbox and click on continue button
  Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   When I put "4111 1111 1111 1111" in cardNum, "dummy" in cardHolder, "05/21" in ExpiryDate and "123" in CVVField
   And I click on Done_button
   Then I verify that i redrected to ACS_Emulator_page
   When I click on browser back button
   Then I verify I redirect to Card detail page
   
   @HomeWeb_034 @HomeW @test1 @nw @Rail 
   Scenario: To verify if the user is redirected to the success page  when the user click on the Submit button over ACS Simulator page.
   Given I have updated on Test rail "7401"
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password 
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
 # Then I verify i redirect to Getting Sim Page
 # When I click on eSim_Checkbox and click on continue button
 Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   When I put "4111 1111 1111 1111" in cardNum, "dummy" in cardHolder, "05/21" in ExpiryDate and "123" in CVVField
   And I click on Done_button
   Then I verify that i redrected to ACS_Emulator_page
   When I hit Submit button
   Then I verify for the success page
   
   @HomeWeb_035  @HomeW @test1 @nw @Rail @Homeweb
   Scenario: To verify if the user is redirected to the map when the user click on the Continue button over success page.
   Then I verify that i redirected to HomePage
   When I scroll the page upto Pick or create your plan
   When I click on Get plan button
  # When I change page language into English
   Then I verify that I redirected to PICK YOUR NUMBER page
   When I select any number
   Then I verify that number gets displayed in right side of panel
   When I click on Book_Now button
   Then I verify that i redirected to eligibility page
   When I Enter "Iqama" in ID, Enter invalid "2000000008" in ID_Number, "Yemen" in Nationality and " Mecca" in City
   And I click on Check_button
   Then I Verify that i redirected to Congratulation_page
   When I click on continue btn
   Then I verify I redirected to Create_Account page
   When I enter email Address in to the field
  When I Enter Password  
   And I click on button
   Then I verify that i redirected to AbsherLogin page
   When I click on Absher Login_button
   Then I redirect to Login to Sp_section
   When I click on Dummy_IAM token
  #Then I verify i redirect to Getting Sim Page
 # When I click on eSim_Checkbox and click on continue button
 Then I verify get me the sim
   When I click on get me sim
   Then I get redirected to the Get sim Details page
   Then I verify PayNow button
   When I click on Paynow Button
   Then I verify Pay for your stuffs
   Then I verify pay tab in pay for your stuff
   When I click on Pay tab in Pay for your stuffs 
   Then I verify the payment screen
   Then I verify I redirect to Card detail page
   When I put "4111 1111 1111 1111" in cardNum, "dummy" in cardHolder, "05/21" in ExpiryDate and "123" in CVVField
   And I click on Done_button
   Then I verify that i redrected to ACS_Emulator_page
   When I hit Submit button
   Then I verify for the success page
   When I click on Continue button on Success page
   Then I verify that i Redirected to Map
   
   #Combined Verification scenarios
   #To verify if the Virgin logo appears when the user is redirected to the Home page
   #To verify if the user is redirected to the Home page when the user click on the Virgin logo.
   #To verify if the home page is reloaded by clicking on the logo within the Homepage
   #To verify"Making Your Life More Mobile" appears on the screen
   #To verify" Turn a lucky number or memorable digits into your very own virgin mobile number. Hundreds of numbers to choose from" text appears when user scroll down web page
   #To verify"Why Virgin Mobile?" appears on home web page 
   @HomeWeb  @HomeWeb_Test
   Scenario: Above cases automated as mentioned
   Given I have updated on Test rail "7369"
 Then I verify that i redirected to HomePage
 Then I verify the Logo virgin in the page
 When I click on Virgin logo
 Then I verify I get redirected to Homepage
 Then I verify making your life text available
 Then I verify turn out a lucky number text
 Then I verify Why virgin mobile appears on Homepage
   
   