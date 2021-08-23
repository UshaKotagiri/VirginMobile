Feature: Covering Sprint11 scenarios

#Combined Scenarios
#To verify if the 70 SAR plan within the homepage is displayed
#To verify if the 100 SAR plan within the homepage is appear or not.
#To verify if the 125 SAR plan within the homepage is appear or not.
@Sprint11 @Sprint11_1
Scenario: To verify the data in Homepage
Given I updated a test cases in test rail "9195"
When I scroll down the homePage
Then I verify if the 70 SAR plan within the homepage is displayed
Then I verify if the 100 SAR plan within the homepage is displayed
Then I verify if the 125 SAR plan within the homepage is displayed


#Combined Scenarios
#To verify if the 70 SAR plan within the Plan is displayed
#To verify if the 100 SAR plan within the Plan is appear or not.
#To verify if the 125 SAR plan within the Plan is appear or not.
@Sprint11 @Sprint11_2
Scenario: To verify the data in Plan
Given I updated a test cases in test rail "9208"
When I click on the Plan and Product tab
When I click on Plan link
Then I get redirected to plans tab
Then I verify if the 70 SAR plan within the Plan is displayed
Then I verify if the 100 SAR plan within the Plan is displayed
Then I verify if the 125 SAR plan within the Plan is displayed


#Combined Scenarios
#To verify if the 70 SAR plan within the Join Now is displayed
#To verify if the 100 SAR plan within the Join Now is appear or not.
#To verify if the 125 SAR plan within the Join Now is appear or not.
@Sprint11 @Sprint11_3
Scenario: To verify the data in JoinNow
Given I updated a test cases in test rail "9211"
When I click on JoinNow link
Then I redirect to Join Us Page
When I Click on any number
Then I verify Details of the number gets displayed
When I click on BookNow button
Then I verify that BookNow button is clickable
Then I verify that YourPlan Page Opens
Then I verify if the 70 SAR plan within the Joinnow is displayed
Then I verify if the 100 SAR plan within the Joinnow is displayed
Then I verify if the 125 SAR plan within the Joinnow is displayed


#Combined Scenarios
#To verify if create your plan button displays and clickable in the home screen at mobile browser
#To verify if create your plan button displays and clickable  in the plan and offer screen at mobile browser
#To verify if the hamburger appears in the page
#To verify the plan and product help support and other tags present in hamburger
#To verify if create your plan button displays and clickable  in the plan and offer screen at mobile browser
#To verify if the National Minutes options are scrollable in custom plan 
@Sprint11Mob @Sprint11_4
Scenario: To verify the Scenarios when opened up in Mobile Browser
Given I updated a test cases in test rail "9218"
When I scroll the page Up and Down
Then I verify the hamburger in the page
Then I verify the options in the hamburger
When click on close button
Then I verify create your plan in the homepage
Then I verify that create your plan is clickable in the homepage
Then I verify and click over the create your plan Button
Then I verify the National Minutes in the page




