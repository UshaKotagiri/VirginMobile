Feature: Covering Complaint scenarios

  @complain @complain01
  Scenario: To click on complains and then click on terms for offering telecome offering
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    And scroll down the complain page
    When I click on Terms for offering Telecom services
    Then Terms for offering Telecom services page are display

  @complain @complain02
  Scenario: To click on customer right and responsibility
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I Click on the The customer rights and responsibilities
    Then check customer and Responsibilty page is shown

  @complain @complain03
  Scenario: Enter the valid data in contact text field after clicking a raise button
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter invalid data on contact number text field
    Then check Enter a Valid mobile number message is displayed

  @complain @complain04
  Scenario: Enter all correct details in ticket details page
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    Then check enter number, ticket details, confirmation is displayed
    When I Enter valid data on contact number text field
    Then Verification code appear or not
    Then check Enter the one-time-passowrd message appear or not
    #When I click on resend button in verification code
    #Then check You can resend after 24 seconds message appear or not
    #Then check sorry message are shown
    When I enter all valid data in ticket details
    Then check submit button is highlighted

  @complain @complain05
  Scenario: Check sub category when we click submit button
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    When I enter correct mail and subject
    When I select a category in Network dropdown
    Then check that remove the selected category from the category dropdown
    When I click on submit button without selecting the category
    Then error message is shown
    When I click on submit button without selecting the sub-categories
    Then 3 sbcategory are shown in subcateory

  @complain @complain06
  Scenario Outline: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Services" and 6 data changes the cost of the plan

  @complain @complain07
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    When I enter correct mail and subject
    Then check if selecting "Recharge" and 2 data changes the cost of the plan

  @complain @complain08
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Billing" and 3 data changes the cost of the plan

  @complain @complain09
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Network " and 4 data changes the cost of the plan

  @complain @complain010
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Offers" and 2 data changes the cost of the plan

  @complain @complain011
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Balance" and 2 data changes the cost of the plan

  @complain @complain012
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "USSD" and 2 data changes the cost of the plan

  @complain @complain013
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "SMS" and 4 data changes the cost of the plan

  @complain @complain014
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Transfer Ownership" and 2 data changes the cost of the plan

  @complain @complain015
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "Internet Setting" and 2 data changes the cost of the plan

  @complain @complain016
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "MNP Service" and 3 data changes the cost of the plan

  @complain @complain017
  Scenario: To click on complains
    Given I updated a test cases in test rail "4553"
    When I click on complains
    Then check complain page is displayed
    When I click on raise a complaint
    Then Check raise a complaint page is displayed
    When I Enter valid data on contact number text field
    Then check if selecting "eSIM" and 3 data changes the cost of the plan
