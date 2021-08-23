Feature: Covering Complaint scenarios

#Combined Scenarios
#To verify if the user is redirected to the complaint page when the user click on the complaint button within help and support menu
#To verify if the header is displayed
#To verify if the banner with the name of the Page is displayed
#To verify if the user is able to scroll the page up and down when the user is redirected to the complaint page.
#To verify if the user is redirected back to the previous page when click on the browser back button within the complaint page.
#To verify if there is a text "complaints" displayed within the complaint screen 
#To verify if there is a "virgin logo" displayed within the complaint screen 
#To verify if there is a text "A Statement on Customer Complaint Handling Policy" displayed within the complaint screen 
#"To verify if there is a text ""Customers Complaints-Handling Policy"" displayed within the complaint screen "
#To verify if there is a text "You can learn more about your rights in submitting complaints" displayed within the complaint screen 
#To verify if there is a terms for offering Telecom services button displayed within the complaint screen
#To verify by clicking on terms for offering Telecom services button user navigates to the Terms and conditions screen 

@Complaint01 @Complaint 
Scenario: Coverage of all above verification scenarios of complaint page
 Given I have updated on Test rail "7414"
When I click on Complaint Page tab
Then I verify the header of the Page if its redirected to the page
Then I verify the banner and the Logo is displayed in the complaint page
When I scroll the complaint page Down
Then I verify the Complaint Text in the page
Then I verify the statement on customer handling policy
Then I verify Customer complaints in the page
Then I verify the Learn about your rights text in the page
Then I verify the telecom services button on page
When I click on Telecom services button
Then I verify its redirected to telecom page
When I press the back button
Then I verify if its redirected to previous pages
When I press the back button
Then I verify if its on Homepage

#Combined Scenarios
#To verify if there is a button "The customer's rights and responsibilities" displayed within the complaint screen
#To verify by clicking on The customer's rights and responsibilities" button user navigates to the customer's rights and responsibilities screen
#To verify if there is a Raise a complaint button is displayed 
#"To verify by clicking on Raise a complaint button user navigates to the COMPLAINTSTICKETS screen"
#To verify if there is complaint status button is displayed 
#To verify by clicking on chat icon Live chat pop-up should be open
#To verify if there is a our app icon displayed in bottom of the screen 
#To verify by clicking on our app icon user navigates to the 
#To verify if there is a our stores icon displayed in bottom of the screen 
#"To verify by clicking on our stores icon user navigates to the Find a store screen
#To verify if there is a contact us icon displayed in bottom of the screen 
#"To verify by clicking on contact us icon user navigates to the contact us screen
#To verify if there is a Direct chat icon displayed in bottom of the screen 

@Complaint02 @Complaint 
Scenario: Coverage of all above verification scenarios of complaint page
 Given I have updated on Test rail "7420"
When I click on Complaint Page tab
Then I verify the header of the Page if its redirected to the page
Then I Verify and click on The Customer Rights and Responsibilities
Then I verify if its redirected to Rights page
When I press the back button
Then I verify if Raise a complaint is visible and click over it
Then I verify Raise complaint page
When I press the back button
Then I verify and Click Chat icon on the page
Then I verify if the Chat screen appears
Then I verify if the Chat is present at the bottom of the page
Then I verify and click on our app is present on thepage
Then I verify if its redirected to Our app page
When I press the back button
Then I verify and click on store icon on the page
Then I verify if we are redirected to store page
When I press the back button
Then I verify and click on Contact Us Icon on the page
Then I Verify the Contact us page

#Combined Scenarios
#"To verify if Text ""Complaints Tickets"" appears"
#To verify if Virgin Icon is displayed in right side
#"To verify if Text "" Please reach out here any time of the day and night.Don’t hesitate to Contact Us, if you have any problems."" appears"
#To verify if Contact us page appears when user click on "contact us" in text.
#To verify if  user is able to input number in contact number field.
# To verify if number prefix appears in contact number field.
#To verify if  Invalid  MSISDN message appears with blank   contact number field.
#To verify if  Send verification button is displayed
#To verify if  progress bar appears in right side within raise complaint screen

@Complaint03 @Complaint 
Scenario: Coverage of all above verification scenarios after Clicking on Raise Complaint Ticket
Given I have updated on Test rail "7432"
When I click Raise complaint Tab
Then I verify Virgin Icon on the page
Then I verify The user friendly text in the page
Then I verify and click on contact us text present 
Then I Verify the Contact us page
Then I Verify the number prefic
Then I verify the invalid text appears on blank nmber Field
Then I verify the send verification button
Then I verify the progress bar on the right side of the page

#Combined Cases
#To verify the raising a complaint button and is clickable
#To verify the we reach the page of raising a complaint after clicking the button
#To verify the contact us link in the the rasing complaint section
#To verify the user is able to Enter the number for raising the complaint
#To verify the the submit button after entering the number
#To verify the user the verification tab 
#To verify the user is able to enter the verification code
#To verify the user is able to click on submit button after entring the code
#To verify the user is able to reach the page where the user enter deatils about the page
#To verify the user is able to view the category and the subcategory link present on the page
#To verify the user is able to enter the subject of complaint in the page
#To Verify the user is able to enter the Email address on the page
#To verify the user is able to enter the Optional number on the page
#To verify the ladder with the step is present in the page
#To verify the user is able to click on submit button on the page

Scenario: Covered the above scenarios as mentioned
When I click on Complaint Page tab
Then I verify Virgin Icon on the page
When I click Raise complaint Tab
Then I verify Raise complaint page
Then I am able to enter number in the page
Then I verify the contact us link on the page
Then I clickon submit button
Then I am able to enter the Verification code in the page
Then I click on the submit button after entering the verification code
Then I verify the complaint section page 
Then I verify the ladder on the page
Then I verify the category and Subcategory section
Then I verify the user is able to enter email
Then I verify the user is able to enter Optional Number
Then I verify the user is able to enter the subject over the page
When I Click over the submit button after entering the subject
Then I verify that current page is visible