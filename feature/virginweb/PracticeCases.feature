Feature: Cases for Practice
    

@P1
Scenario: To verify if the user is redirected to the "pick your number" when the user click on the Join now link.
   Given I updated a test cases in test rail "1"
    Then Verify the page with "Virgin Mobile KSA"
    And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
    
@P2
Scenario: To verify if the user is able to scroll the page up and down when the user is redirected to the Pick your Number page
	Given I updated a test cases in test rail "3"
    Then Verify the page with "Virgin Mobile KSA"
	And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
	And Scroll down and up
	Then Verifying the scrolling

@P3
Scenario: To verify if the user is able to get the validation for the empty mobile number field.
	Given I updated a test cases in test rail "4"
    Then Verify the page with "Virgin Mobile KSA"
	And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
    And Click on search tab of numbers with "0921"
    Then Verify the click on search tab for num "0921"

@P4
Scenario: To verify if the user is able to get the validation for the invalid search of the mobile number.
	Given I updated a test cases in test rail "5"
    Then Verify the page with "Virgin Mobile KSA"
    And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
    And Click on search tab of numbers with "0921"
    Then Verify the invalid search
@P5
Scenario: To verify if the number below search bar clickable or not. 
	Given I updated a test cases in test rail "6"
    Then Verify the page with "Virgin Mobile KSA"
    And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
    And Click on any number below the search tab
    Then Verify the click on number
    
@P6
Scenario: To verify if the new popup related to the type of number appears as the user click on any of the number
	Given I updated a test cases in test rail "7"
    Then Verify the page with "Virgin Mobile KSA"
    And Click on Join Now
    Then Verify the page with "Virgin Mobile KSA – No Limits, Get a number as unique as you and more with Virgin Mobile"
    And Click on any number below the search tab
    Then Verify the popup box of the clicked number
