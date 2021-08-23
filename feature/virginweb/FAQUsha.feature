Feature: Feature for FAQ page in Help n suupport tab 

@f1
Scenario: To verify if the user is able to view the details when hover the mouse through "help and support" tab.
	Given I updated a test cases in test rail "23"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify the hoover on Help n support
    
@f2
Scenario: To verify if the header is displayed
	Given I updated a test cases in test rail "24"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify if the header is displayed
    
@f3
Scenario: To verify if the banner with the name of the Page is displayed
	Given I updated a test cases in test rail "25"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify if the banner is diplayed
    
@f4
Scenario: To verify if the breadcrumbs is displayed
	Given I updated a test cases in test rail "26"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify if the breadcrumbs are displayed
    
@f5
Scenario: To verify if the breadcrumbs is changing according to the selected pages
	Given I updated a test cases in test rail "27"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify if the breadcrumbs is changing according to the selected pages
    
@f6
Scenario: To verify if selecting a link from the breadcrumbs navigated to the corresponding page
	Given I updated a test cases in test rail "28"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    
@f7
Scenario: To verify if the search field is displayed
	Given I updated a test cases in test rail "29"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    Then Verify for the Search for more button
    
@f8
Scenario: To verify if there is a character limit
	Given I updated a test cases in test rail "30"
    Then Verify the page with "Virgin Mobile KSA"
    And Hoover on Help n support
    And Click on Search for more button
    Given Verify for the character limit 



    