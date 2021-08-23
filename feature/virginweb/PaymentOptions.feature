Feature: Covering Payment Options scenarios

#Combined scenarios
#Check if the dropdown "Plans & Products" contains "Plans" option.
#Check if Get if plan is available on the page
#To verify if the Get the plan is clickkable
#To verify that it gets redirected to required page  when clicked over get plans
#To verify Your number dropdown available on the Get the plan page
#To verify if Get Help is available in the drop down
#To verify if Get Help is clickabble
#To verify if it get to the required page when clicked over Get Help
@PaymentVerification
Scenario: Combined scenarios for payment verification page
 When I click on the Plan and Product tab
 Then I verify plans in the Plan and support tab
 Then I scroll the required page
 Then I verify Get the plan tab in the page
 When I click over the get the plan button
 Then I verify if it gets redirected to the required get plan page
 Then I verify the your number dropdown in the page
 Then I click over the dropdown
 Then I verify the get help tab
 When I click over Get help tab
 Then I verify its redirected to Get Help page
 
 #Combined scenarios
 #Check if clicking the Pay now button opens the credit card form
 #Check if there is a CARD NUMBER field
 #Check if the user can input data in the field
 #Check if the field has card number validation
 #Check if there is a CARDHOLDER'S NAME field
 #Check if the user can input data in the field
 #Check if there is an EXPIRY DATE field
 #Check if the user can input data in the field
 #Check if there is a CVV/CVC field
 #Check if the user can input data in the field
 #Check if there is a "Use card for future payments" checkbox displayed
 #Check if clicking the "DONE" button with valid information navigates the user to the payment successful screen
 #Check if clicking the "TRY AGAIN" button navigates the user to the credit card form

@PaymentVerification
Scenario: Combined scenarios for payment verification page
 Given I updated a test cases in test rail "4539"
 When I click on the Plan and Product tab
 Then I verify plans in the Plan and support tab
 Then I scroll the required page
 Then I verify Get the plan tab in the page
 When I click over the get the plan button
 Then I verify if it gets redirected to the required get plan page
When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
When I click on the check button in the page
Then I verify its redirected to the create account page 
When I Enter "Test123@yopmail.com" in email and "Test@123" in password 
When I click on I agree with legal stuff
When I click on create account
Then I verify Absher login button on the page next to create account
When I click on Absher login on the page
Then I verify the the Return I am dummy token on the next page of Absher
When I click on Retun I am Dummy token
Then I verify the screen Getting your sim
Then I verify get me the sim
When I click on get me sim
Then I get redirected to the Get sim Details page
Then I verify PayNow button
When I click on Paynow Button
Then I verify Pay for your stuffs
Then I verify pay tab in pay for your stuff
When I click on Pay tab in Pay for your stuffs 
Then I verify the payment screen
Then I verify the Card number tab
Then I verify the card name tab
Then I verify the expiry date tab
Then I verify the cvc tab in the page
 When I Enter "4111 1111 1111 1111" in card, "dummy" in cardName, "05/21" in expiry and "123" in CVV
 Then I verify the value of cardNumber in the page
 Then I verify the value of cardName in the page
 Then I verify the value of Cvv in the page
 Then I verify the value of expiry added in the page
 Then I verify if Done Button gets enabled
 When I click on done button
 Then I get redirected to Try again screen
 When I click on try again button 
 Then I Redirected to the required page after try again
