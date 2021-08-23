Feature: Covering Family Device scenarios

@Faq_01_02_03_04_05 @contactUs @Demo @SAUCE
Scenario: To verify if the user is able to view the details when hover the mouse through "help and support" tab click on FAQ and erify if the user is getting the validation message for invalid search field within the Faq page.
Given I have updated on Test rail "4750"
When I click on Help and support tab again
When I click on FAQ tab In Help and Support again
Then I get redirected to FAQ tab again
When I scroll down in FAQ in Help and support tab
When I click on Search Field in Faq
When I enter Invalid text in the search field
Then I verify the invalid text entered in the search field
When I scroll down in FAQ in Help and support tab
#Then I see no options

@Faq_01_02_03_04 @contactUs12
Scenario: To verify if the user is getting the validation message for valid search field within the Faq page.
Given I have updated on Test rail "4763"
When I click on Help and support tab again
When I click on FAQ tab In Help and Support again
Then I get redirected to FAQ tab again
When I scroll down in FAQ in Help and support tab
Then I verify the search field
When I enter valid text in the search field
Then I verify if text entered is correct
When I click on Search Field in Faq
Then I verify if its redirected to searched page
#Then I get redirected to contact tab again

@ContactUs_01_02 @contactUs
Scenario: To verify if the user is redirected to the contact us page when the user click on the Contact us button and scroll down the page.
Given I have updated on Test rail "4760"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
Then I get redirected to contact tab again
When I scroll down in FAQ in Help and support tab


@ContactUs_03_04 @contactUs
Scenario: To verify if the user is getting the validation message for invalid  field within the Contact us page.
Given I have updated on Test rail "4553"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
Then I get redirected to contact tab again
When I scroll down in FAQ in Help and support tab
When I click on submit in contact us tab
Then I get error message in the tab1

@ContactUs_04_05 @contactUs
Scenario: To verify if the user is getting the validation message for valid  field within the Contact us page.
Given I have updated on Test rail "4558"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
When I enter all the required details
Then I verify the details entered in the required page
When I enter More details
When I click on submit in contact us tab
Then I verify the validiation text after submit button

@ContactUs_06_07_08 @contactUs
Scenario: To verify the chatbox functions 
Given I have updated on Test rail "4562"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
When I scroll down in FAQ in Help and support tab
Then I click on Chatbox
When I click on minimise button 
Then I verify the minimise button in chatbox
When I click on chatbox again
Then I verify the chatbox opens

@ContactUs_09_10
Scenario: To verify the chatbox functions 
Given I have updated on Test rail "4568"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
Then I click on Chatbox
When I close the chatbox
Then I verify that the chatbox is closed

@ContactUs @ContactUs_11
Scenario: To verify the chat pop up functions
Given I have updated on Test rail "4568"
When I click on Help and support tab again
When I click on contact tab In Help and Support again
Then I click on Chatbox




