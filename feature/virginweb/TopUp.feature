  Feature: Covering TopUp scenarios

@TopUp_01 @TopUp @test
Scenario: To verify if the user is redirected to the Quick top up page when the user click on the Quick top up  button .
   Given I updated a test cases in test rail "3688"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   
@TopUp_02 @TopUp @test
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Quick Topup page.
  Given I updated a test cases in test rail "3689"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 # #Then I click in close
   When the page is scrollable

@TopUp_03_04 @TopUp @test123 @testDemo
Scenario: To verify if the user gets the error message for entering incorrect mobile number
   Given I updated a test cases in test rail "3691"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 # #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter the invalid number
   Then I verify to get error message
   
@TopUp_05 @TopUp 
Scenario: To verify if the user fails to get  the error message for entering valid mobile number
    Given I updated a test cases in test rail "3696"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 #  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   Then I verify no error message is found
 
@TopUp_06_07  @test
Scenario: To verify if the user is able to select an amount from the amount dropdown
   Given I updated a test cases in test rail "3692"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 #  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   
@TopUp_08_09  @test
Scenario: To verify if the user is redirected to the card details page when the user click on CONTINUE TO PAYMENT button with valid details.
   Given I updated a test cases in test rail "3693"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 #  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   Then I verify it is redirected to the payment screen
    
@TopUp_11  @test @testDemo
Scenario: To verify if the recharge button highlight when the user enters the valid data in all the fields
  Given I updated a test cases in test rail "3697"
  When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 #  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter correct card details
   Then I verify that submit button is enabled
   
@TopUp_12_13  @test
Scenario: To verify if the user is redirected to the ACS emulator page when the user click on the Recharge button.
  Given I updated a test cases in test rail "3697"
  When I click on the top up tab
  Then I get redirected to QuickTopUp page
# #Then I change the language
#  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter correct card details
   Then I verify that submit button is enabled
   When I click on submit button
   Then I verify ACS Emulator page
   
 @TopUp_14  @test
 Scenario: To verify if the user is redirected back with a success message when the user click on Submit button of ACS Emulator page.
  Given I updated a test cases in test rail "3696"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
 # #Then I change the language
 #  #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter correct card details
   Then I verify that submit button is enabled
   When I click on submit button
   Then I verify ACS Emulator page
   When I click on ACS submit button
   Then I verify the success message
   Then I verify it is redirected to the homeButton page
  
  
  @TopUp_10 @TopUp @test123
Scenario: To verify if the recharge button fails to highlight when the user click on the Recharge button with invalid fields.
  Given I updated a test cases in test rail "3698"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter incorrect card details
   And I verify that submit button is not enabled
  
   @TopUp_15  @test123 @TopUp 
 Scenario: To verify if the user is redirected to the home page when the user click on the Home button over the success message.
 Given I updated a test cases in test rail "3699"
  When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter correct card details
   Then I verify that submit button is enabled
   When I click on submit button
    Then I verify ACS Emulator page
   When I click on ACS submit button
   Then I see the home button
   Then I verify the success message
   When I click on home Button
   Then I get redirected to home
   
 @TopUp_16_17 @TopUp @testaba
Scenario:To verify the user is redirected to the Home page when the user click on the Home option in the hamburger menu
  Given I updated a test cases in test rail "3701"
When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
     #Then I click in close
   When I click on Hamburger button
   When I click on Home
   Then I get redirected to home 
   
@TopUp_18 @TopUp @testaba
Scenario: To verify if the user is redirected back  to the Quick topup page when click on the  browser back  button within the Home page.
Given I updated a test cases in test rail "3702"
When I click on the top up tab
   Then I get redirected to QuickTopUp page
    #Then I change the language
     #Then I click in close
   When I click on Hamburger button
   When I click on Home 
   Then I get redirected to home 
    When I click on back2 button
   Then It gets back to top up page
  
    
@TopUp_19 @TopUp @testaba
Scenario: To verify if the user is able to view the details within plans and product dropdowns when the user click on the plans and product dropdown button within the Hamburger menu.
   Given I updated a test cases in test rail "3703"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When I click on Hamburger button
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   
 @TopUp_20 @TopUp @testaba
Scenario: To verify if the user is able to disable the details of plans and product dropdowns when the user click on the plans and product collapse button within the Hamburger menu.
   Given I updated a test cases in test rail "3704"  
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
    #Then I change the language
  # When I click on Hamburger button
  # #Then I change the language
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on Plan and products in hamburger again
   Then I verify that the dropdown collapses
   
@TopUp_21_22 @TopUp @testaba
Scenario: To verify the user can click on the plans option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3705"  
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on plans in hamburger
   Then It gets redirected to plans page
   When I click on back2 button
   Then It gets back to top up page
   
 @TopUp_23_24 @TopUp @test1234
 Scenario: To verify the user can click on the other offers option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3706"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   #When I click on Hamburger button
   #Then I change the language
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on other options in hamburger
   Then It gets redirected to other options page
   When I click on back2 button
   Then It gets back to top up page

 @TopUp_25_26 @TopUp @testaba
Scenario: To verify click on the other international rates option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3707"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   #When I click on Hamburger button
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on international rates options in hamburger
   Then It gets redirected to other international rate page
   When I click on back2 button
   Then It gets back to top up page
   
 @TopUp_27_28 @TopUp @TopUp1 @test
 Scenario: To verify the user can click on the other international roaming option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3708"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   #When I click on Hamburger button
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on international roaming options in hamburger
   Then It gets redirected to other international roaming page
   When I click on back2 button
   Then It gets back to top up page
   
@TopUp_29_30 @TopUp @TopUp1 @test
 Scenario: To verify the user can click on the other Family tag option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3709"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   #When I click on Hamburger button
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on Family tag options in hamburger
   Then It gets redirected to other Family Tag page
   When I click on back2 button
   Then It gets back to top up page
   
@TopUp_31_32 @TopUp @TopUp1 @testaba
 Scenario: To verify the user can click on the other frendi option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3710"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   #When I click on Hamburger button
   When I click on Plan and products in hamburger
   Then The user is able to see other options
   When I click on Frendi options in hamburger
   Then It gets redirected to other Frendi Tag page
   When I click on back2 button
   Then It gets back to top up page
   
 @TopUp_33_34 @TopUp @TopUp1 @testaba
 Scenario: To verify the user can click on the other why virgin mobile option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3711"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When I click on Hamburger button
   When I click on why virginmobile in hamburger
   Then It gets redirected to other why virgin mobile Tag page
   When I click on back2 button
   Then It gets back to top up page
   
@TopUp_35 @TopUp
Scenario: To verify the user can click on the other help and support option from the popup 
   Given I updated a test cases in test rail "3712"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
  #Then I change the language
   #Then I click in close
   When I click on Hamburger button
   When I click on help and support in hamburger
   Then I verify the FAQ option in help and support
   
@TopUp_36_37 @TopUp
Scenario: To verify the user can click on the faq option from the popup and get back to topup screen once back button is pressed
  Given I updated a test cases in test rail "3713"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When I click on Hamburger button
   When I click on help and support in hamburger
   When I click on FAQ 
   Then It get redirected to FAQ page
   When I click on back2 button
   Then It gets back to top up page
   
@Test_38_39 @TopUp
Scenario: To verify the user can click on the contact us option from the popup and get back to topup screen once back button is pressed
  Given I updated a test cases in test rail "3715"
  When I click on the top up tab
   Then I get redirected to QuickTopUp page
   ##Then I change the language
   ##Then I click in close
   When I click on Hamburger button
   When I click on help and support in hamburger
   When I click on contact us option 
   Then It get redirected to contact us page
   When I click on back2 button
   Then It gets back to top up page
   
 @TopUp_40_41 @TopUp
 Scenario: To verify the user can click on the find a store option from the popup and get back to topup screen once back button is pressed
   Given I updated a test cases in test rail "3716"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   ##Then I click in close
   When I click on Hamburger button
   When I click on help and support in hamburger
   When I click on find a store option 
   Then It get redirected to find a store page
   When I click on back2 button
   Then It gets back to top up page
   
 @TopUp_42 
 Scenario: To verify the default text "select an amount" appears in the amount dropdown at "Top-up your wallet" page
   Given I updated a test cases in test rail "3717"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then I validiate text in dropdown
   Then select from dropdown
   
 @TopUp_43 
 Scenario: To verify the user redirected to "continue to payment" button screen from the payment page by clicking the back browser button
   Given I updated a test cases in test rail "3718"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I click on back2 button
  Then I get redirected to home 
   
 @TopUp_45 @TopUp @testaba
 Scenario: To verify the user can click on the link "Not the right number ? Click here to re-enter it again" at the payment page
   Given I updated a test cases in test rail "3719"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   Then I click on Not right Number
   Then I get redirected to QuickTopUp page
   
 @TopUp_44 @TopUp @testaba
 Scenario: To verify if the CONTINUE TO PAYMENT button fails to enable when the user enter valid number but the number is not in use and select an amount.
   Given I updated a test cases in test rail "3720"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number which is not in use
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is not clickabble
   
   @TopUpMobile_03_04 @TestMOb @test123
Scenario: To verify if the user gets the error message for entering incorrect mobile number
   Given I updated a test cases in test rail "3721"
   When I Click on hamburger in mob
   Then I get redirected to QuickTopUp page in mob
   When I click on the top up tab in mob
 # #Then I change the language
 # #Then I click in close
   When the page is scrollable in mob
   Then I click on the number tab in mob
   When Enter the invalid number in mob
   Then I verify to get error message
     
   @TopUpMob_15  @test123 @TestMob 
 Scenario: To verify if the user is redirected to the home page when the user click on the Home button over the success message.
 Given I updated a test cases in test rail "3722"
 When I Click on hamburger in mob
  When I click on the top up tab in mob
  # Then I get redirected to QuickTopUp page
  When I change the language in mob
  # #Then I click in close
   When the page is scrollable in mob
   Then I click on the number tab in mob
   When Enter a valid number in mob
   When click on dropdown in mob
   Then select from dropdown in mob
   And I verify payment gateway is clickabble in mob
   When I click on the payment button in mob
   When I Enter correct card details in mob
   When I click on submit button in mob
   When I click on ACS submit button in mob
   Then I see the home button in mob
   When I click on home Button in mob
   Then I get redirected to home 
   
    @TopUp_16_17 @TopUp @testaba
Scenario:To verify the user is redirected to the Home page when the user click on the Home option in the hamburger menu
  Given I updated a test cases in test rail "3723"
   When I click on the top up tab
   Then I get redirected to QuickTopUp page
   #Then I change the language
   #Then I click in close
   When I click on Hamburger button
   Then I verify the options below
   Then Click on change language in hamburger
   Then I verify code is mentioned on the tab
   Then I verify there is a MSIDN field displayed
   Then I verify user is able to input data in the field
   
    @TopUp_Mobile  @test123 @TopUpMob
 Scenario: To verify if the user is redirected to the home page when the user click on the Home button over the success message.
 Given I updated a test cases in test rail "3699"
 When I click on hamburger in Mobile site
  When I click on the top up tab in Mobile Page
   Then I get redirected to QuickTopUp page
   When the page is scrollable
   Then I click on the number tab
   When Enter a valid number
   When click on dropdown
   Then select from dropdown
   And I verify payment gateway is clickabble 
   When I click on the payment button
   When I Enter correct card details
   Then I verify that submit button is enabled
   When I click on submit button
    Then I verify ACS Emulator page
   When I click on ACS submit button
   Then I see the home button
   Then I verify the success message
   When I click on home Button
   Then I get redirected to home
  