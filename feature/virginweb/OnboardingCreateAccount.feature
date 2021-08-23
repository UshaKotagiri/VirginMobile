Feature: Covering Onboarding create Account scenarios

#Combined scenarios 
#Check if the the header has the following options: "Plans and Products", "Why Virgin Mobile", "Help and Support" and "العربية / English"
#If the option is selected, check if there is "GET HELP" button
#Check if the user is navigated to the proper Help screen by clicking on the button
#Check if the section with the Eligibility form is displayed
#If the user clicks on the field check if the list with ID types will be displayed
#Check if the chosen nationality is presented in the field
#If the user choose the Saudi National ID for the ID type, check if the nationality will becomes Saudi automatically
#Check if there is a CHECK button
#Check if the Nationality, ID Type, ID Number, Current city in KSA values and CONTINUE  are presented on the screen
#Check if the continue button is present in the page after adding the data
#Check if its redirected to create account page
#Check if there is a field with help text "Email address"
#Check if the help text is removed when users inputs data in the field
#Check if the field has character limit
#Check if the user can input data in the field
#Check if the field has password format validation
#Check if the entered data is displayed with dots/asterisk
#Check if there is an unmask button in the field
#Check if there is a "CREATE ACCOUNT" button
#If the user enter the email and the password in the correct format and check the checkbox, check if is able to press on the CREATE ACCOUNT button
#Check if there are three options to sign in with Facebook
#Check if there are three options to sign in with Google
#Check if there are three options to sign in with Twitter
#Check if the social media get enabled when we click over i agree with legal stuff
#Check if the user can input data in the field
#Check if create account button gets enabled after entering the data
#Check if there is a section with dropdown buttons presented
#Check if there is a "Your number %number% SAR" dropdown
#Check if the number is displayed in the dropdown
#Check if there is a "Your plan/Month %number% SAR" dropdown

@CreateAccount
Scenario: Combined scenarios for Create account 
When I get redirected to the Homepage
Then I verify Pland and product in the Homepage
Then I verify why virgin mobile in the Homepage
Then I verify Help and support in the homepage
Then I Verify language in the homepage
Then I scroll the Homepage down
Then I verify Get Help button
When I click on Get Help button
Then I redirected to the Get Help screen
When I select a number from the list
Then I verify book it now button
When I click on Book it now button
Then I verify Eligibilty form in the page
Then I verify ID type in the eligibility page
Then I verify ID number in the eligibility page
Then I verify Nationality in the eligibility page
Then I verify your current city in ksa in the eligibility page
Then I verify If the user choose the Saudi National ID for the ID type check if the nationality will becomes Saudi automatically
When I Select "Iqama" in ID, Enter valid "2000000006" in ID_Number, "Yemen" in Nationality and " Mecca" in City 
Then I verify the check button in the page
When I click on the check button in the page
Then I verify Continue Button
When I click on continue button
Then I verify its redirected to the create account page 
Then I verify email address field is present
Then I verify the help text present in the email address field
When I Enter "Test123@yopmail.com" in email and "Test@123" in password 
Then I verify the password field is present 
Then I verify the mask button in the password field
Then I verify if password is in asterik form when mask button is clicked
Then I verify the I agree with legal stuff text
When I click on I agree with legal stuff
Then Social media icons gets enabled
Then I verify facebook is present in the page
Then I verify twitter is present in the page
Then I verify Google plus is present on the page
Then I verify the create account get enabled
Then I verify the your number dropdown in the page
Then I verify if the number is displayed in the dropdown
Then I verify your plan is present in the drop down
