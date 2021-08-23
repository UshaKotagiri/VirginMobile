Feature: Covering Why Virgin Mobile Tab

@W1
Scenario: To verify if the loader appears and the user is redirected to the Why virgin mobile page when the 
			user click on the Why virgin mobile  tab.
	Given I updated a test cases in test rail "8"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    
@W2
Scenario: To verify if the user is able to scroll the page up and down when the user is 
			redirected to the Why virgin page page
	Given I updated a test cases in test rail "9"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    Then Scroll down verify and scroll up verify
    
@W3
Scenario: To verify if the user is redirected back  to the previous page when click on the  browser back 
			 button within the Why virgin page.
	Given I updated a test cases in test rail "10"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    Then Scroll down verify and scroll up verify
    And Navigate back
    Then Verify the page with "Virgin Mobile KSA"
    
@W4
Scenario: To verify if there is a text "Why Virgin Mobile" displayed within the Why Virgin Mobile screen 
	Given I updated a test cases in test rail "11"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the "Why Virgin Mobile" on the banner
    
@W5
Scenario: To verify if there is a "virgin logo" displayed within the Why Virgin Mobile screen
	Given I updated a test cases in test rail "12"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the Virgin logo on the top left corner
    
@W6
Scenario: To verify if there is a text "Virgin Mobile Quality Reports Downloads" displayed within the Why Virgin
		 Mobile screen 
	Given I updated a test cases in test rail "13"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "Virgin Mobile Quality Reports Downloads" displayed
    
@W7
Scenario: To verify if there is a Quarter 1 button displayed within the Why Virgin Mobile screen
	Given I updated a test cases in test rail "14"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "Quarter 1" displayed

@W8
Scenario: To verify if there is a Quarter 2 button displayed within the Why Virgin Mobile screen
	Given I updated a test cases in test rail "15"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "Quarter 2" displayed
    
@W9
Scenario: To verify if there is a Quarter 3 button displayed within the Why Virgin Mobile screen
	Given I updated a test cases in test rail "16"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "Quarter 3" displayed

@W10
Scenario: To verify if there is a Quarter 4 button displayed within the Why Virgin Mobile screen
	Given I updated a test cases in test rail "17"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "Quarter 4" displayed
 
@W11
Scenario: To verify by clicking on Quarter 1 button user navigates to the jpg image 
	Given I updated a test cases in test rail "18"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    And Click on "Quarter 1"
    Then Verify the page navigation to jpg image
    
@W12
Scenario: To verify by clicking on Quarter 2 button user navigates to the jpg image 
	Given I updated a test cases in test rail "19"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    And Click on "Quarter 2"
    Then Verify the page navigation to jpg image

@W13
Scenario: To verify by clicking on Quarter 3 button user navigates to the jpg image
	Given I updated a test cases in test rail "20"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    And Click on "Quarter 3"
    Then Verify the page navigation to jpg image

@W14
Scenario: To verify by clicking on Quarter 4 button user navigates to the jpg image 
	Given I updated a test cases in test rail "21"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify the page with "Why Virgin Mobile – Virgin Mobile KSA"
    And Click on "Quarter 4"
    Then Verify the page navigation to jpg image
    
@W15
Scenario: To verify if there is a text "2019" displayed within the "Why Virgin  Mobile" screen 
	Given I updated a test cases in test rail "22"
    Then Verify the page with "Virgin Mobile KSA"
    And Click On Why Virgin Mobile Tab
    Then Verify "2019" displayed
