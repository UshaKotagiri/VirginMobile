Feature: complain page

  @onboardingpayment @onboardingpayment01
  Scenario: Combined scenarios from pay ment and chek the
    Given I updated a test cases in test rail "6108"
    #Then check Burger Icon displayed in the top left corner
    #When I click on hamburger menu icon option
    # When I click on plan in mobile
    When I click on get this plan in mobile
    When I pick one number
    Then it redirects to Pick you number screen popup
    When I click on Book it now
    Then check that it redirect to check eligibility page
    When I enter all valid data in all text box
    Then congratulation page are shown
    When I click on continues button
    When I enter all the details of create account
    Then check the Abser login page is scroll down
    When I click on login button in absher page
    Then redirected to the Login to SP section
    When I click on Return Dummy IAM Token
    Then check Get the sim delivered SIM is checked or click
    When I click on GET HELP button
    Then check navigated to the proper Help screen
    When check continue button is enable or not or click
    When I click on pay online
    #Then Pay For Stuff page should be dispayed
    # When I click pay now button in pay your stuffPage
    Then Check if clicking the button opens the credit card form
    Then I verify if there is a CARD NUMBER or we can enter the data
    Then check if the field has card number validation
    Then check if the field has character limit
    Then I verify if there is a CARDHOLDER NAME field	or we can input data in that field
    Then Check if the field has character validation
    Then I verify if there is a EXPIRY DATE field or we can input data in that field
    Then Check if the field has character validation EXPIRY DATE
    Then I verify if there is a CVV field or we can input data in that field
    Then Check if the field has character validation CVV

   @onboardingpayment @onboardingpayment02
  Scenario: To click on payment button payment successfully page is opened
    Given I updated a test cases in test rail "6108"
    #Then check Burger Icon displayed in the top left corner
    #When I click on hamburger menu icon option
    # When I click on plan in mobile
    When I click on get this plan in mobile
    When I pick one number
    Then it redirects to Pick you number screen popup
    When I click on Book it now
    Then check that it redirect to check eligibility page
    When I enter all valid data in all text box
    Then congratulation page are shown
    When I click on continues button
    When I enter all the details of create account
    Then check the Abser login page is scroll down
    When I click on login button in absher page
    Then redirected to the Login to SP section
    When I click on Return Dummy IAM Token
    Then check Get the sim delivered SIM is checked or click
    When I click on GET HELP button
    Then check navigated to the proper Help screen
    Then check continue button is enable or not or click
    When I click on pay online
    Then Pay For Stuff page should be dispayed
    When I click pay now button in pay your stuffPage
    When I enter all the details of card
    Then check done button is enabled
