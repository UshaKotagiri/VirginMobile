Feature: Covering Other Bring your Own Number scenarios


#Combined scenarios
# Check if the Bring your own number screen is displayed by clicking on the "PORT YOUR NUMBER" button
# Check if there is a text label "Bring your own number"
# Check if proper screen is displayed in the progress dropdown
# Check if there is a "SEARCH NEW NUMBER" button
# Check if there is a "Port  YOUR NUMBER" button
# Check if the button is selected
# Check if there is a text field for entering mobile number
# Check if the user is able to input data in the field
# Check if the help text disappears when the user enters data in the field
# Check if there is a drop down called "Operator Name"
# Check if there is a Country dropdown button in the info section
# Check if there is a text field for entering optional mobile phone
# Check if there is a "CONFIRM" button
# Check If after entering correct valid data the Button enables
# To check if the user is redirected to verification code page when the user clicks on confirm button
# To check if there is a send again button in verification code screen
# To check if there is a Verification code field in verification code screen
# To check if the  user is able to put data in Verification code field 
# To check if confirm button gets enabled after entering verification code
# To check if the confirm button remains disabled when the user puts invalid data
 

@Bring_01 @Bring
Scenario: Combined scenarios for the above Bring your Own Number portability.
Given I have updated on Test rail "3601"
When I click on JoinNow link
Then I redirect to Join Us Page
Then I verify Port your number button
When I click on port your number
Then I verify Bring your number screen
Then I verify Bring your number text
Then I verify the progress dropdown is displayed
Then I verify the port number is selected
Then I verify the Mobile number Operator name country dropdown and Optional mobile number is displayed
When the user enters data into Mobile number
Then The help text disappears
When I select the Operators name
Then I verify the confirm button gets enabled
When I click on confirm Button
Then I verify the Verification page Occurs
Then I verify the send again in the verification page
Then I verify the verification code tab in the page
Then I enter the verification code
Then I Verify confirm but get enabled after verification code

@Bring_02 @Bring
Scenario: Combined scenarios for the above Bring your Own Number portability.
Given I have updated on Test rail "3611"
When I click on JoinNow link
Then I redirect to Join Us Page
Then I verify Port your number button
When I click on port your number
When I enter invalid number
When I select the Operators name
Then I verify that the confirm button is not enabled

@Bring_Mob @BringMob
Scenario: Combined scenarios for the above Bring your Own Number portability.
Given I have updated on Test rail "3613"
When I click on hamburger in Mobile site
When I click on JoinNow link in Mobile
Then I redirect to Join Us Page
Then I verify Port your number button
When I click on port your number
When I enter invalid number
When I select the Operators name
Then I verify that the confirm button is not enabled